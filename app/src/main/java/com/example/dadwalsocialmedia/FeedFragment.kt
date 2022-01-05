package com.example.dadwalsocialmedia

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dadwalsocialmedia.adapters.FeedAdapter
import com.example.dadwalsocialmedia.models.Post
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase

class FeedFragment: Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: FeedAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fab: FloatingActionButton = view.findViewById(R.id.floatingActionButton)

        fab.setOnClickListener{
            startActivity(Intent(activity, CreatePostActivity::class.java))
        }

        recyclerView = view.findViewById(R.id.feed_recycler_view)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        val firestore = FirebaseFirestore.getInstance()
        val query = firestore.collection("Posts")

        val recyclerViewOptions = FirestoreRecyclerOptions.Builder<Post>().setQuery(query, Post::class.java).build()

        context?.let {
            adapter = FeedAdapter(recyclerViewOptions,it)
        }
        if(this::adapter.isInitialized) {
            recyclerView.adapter = adapter
        }
        recyclerView.layoutManager = LinearLayoutManager(activity)

    }

    override fun onStart(){
        super.onStart()
        adapter.startListening()
    }

    override fun onStop() {
        super.onStop()
        adapter.stopListening()
    }
}