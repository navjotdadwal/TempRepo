package com.example.dadwalsocialmedia.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.dadwalsocialmedia.R
import com.example.dadwalsocialmedia.UserUtils
import com.example.dadwalsocialmedia.models.Chat
import com.firebase.ui.firestore.FirestoreRecyclerAdapter
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import org.w3c.dom.Text

class ChatAdapter(options: FirestoreRecyclerOptions<Chat>):
    FirestoreRecyclerAdapter<Chat, ChatAdapter.ChatViewHolder>(options){
    companion object{
        const val MSG_BY_SELF = 0
        const val MSG_BY_OTHER = 1
    }
    class ChatViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val chatText: TextView = itemView.findViewById(R.id.chat_text)
        val chatAuthor: TextView = itemView.findViewById(R.id.chat_author)
    }

    override fun getItemViewType(position: Int): Int {
        if(getItem(position).author.id == UserUtils.user?.id){
           return MSG_BY_SELF
        } else{
            return MSG_BY_OTHER
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        var view: View? = null

        if(viewType == MSG_BY_SELF) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat_self,parent,false)
        } else {
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat_other,parent,false)
        }
        return ChatViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int, model: Chat) {
       holder.chatText.text = model.text
        holder.chatAuthor.text = model.author.name
    }
}