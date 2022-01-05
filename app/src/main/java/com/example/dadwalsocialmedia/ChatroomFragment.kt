package com.example.dadwalsocialmedia

import android.app.AlertDialog
import  android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dadwalsocialmedia.adapters.ChatroomAdapter
import com.example.dadwalsocialmedia.models.Chatroom
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.ktx.Firebase

class ChatroomFragment: Fragment() {

    lateinit var chatroomAdapter: ChatroomAdapter
    lateinit var chatroomRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chatroom, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        chatroomRecyclerView = view.findViewById(R.id.chatroom_recycler_view)

        setUpRecyclerView()

        val createChatroom: FloatingActionButton = view.findViewById(R.id.create_chatroom)

        createChatroom.setOnClickListener {
            val alertDialog: AlertDialog.Builder = AlertDialog.Builder(context)

            val editText = EditText(context)

            alertDialog.setTitle("Create Chatroom")
            alertDialog.setMessage("Enter the name of the new chatroom that you want to crete:")

            alertDialog.setView(editText)

            var textEntered = ""
            alertDialog.setPositiveButton("Create"){ dialogInterface, i ->
                textEntered = editText.text.toString()
                val document1 = FirebaseFirestore.getInstance().collection("Chatrooms").document()

                val chatroom = Chatroom(textEntered, document1.id)
                document1.set(chatroom)

            }

            alertDialog.setNegativeButton("Cancel") { dialogInterface, i ->
                dialogInterface.dismiss()
            }

            alertDialog.show()
        }

    }

    private fun setUpRecyclerView() {
        val firestore = FirebaseFirestore.getInstance()
        val query = firestore.collection("Chatrooms")
            .orderBy("name",Query.Direction.ASCENDING)
        val recyclerViewOptions = FirestoreRecyclerOptions.Builder<Chatroom>().setQuery(query, Chatroom::class.java).build()

        chatroomAdapter = ChatroomAdapter(recyclerViewOptions,activity!!)

        chatroomRecyclerView.adapter = chatroomAdapter
        chatroomRecyclerView.layoutManager = LinearLayoutManager(context)

    }

    override fun onStart() {
        super.onStart()
        chatroomAdapter.startListening()
    }

    override fun onStop() {
        super.onStop()
        chatroomAdapter.stopListening()
    }
}