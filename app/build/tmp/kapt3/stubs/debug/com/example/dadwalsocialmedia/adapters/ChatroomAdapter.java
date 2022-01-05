package com.example.dadwalsocialmedia.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/example/dadwalsocialmedia/adapters/ChatroomAdapter;", "Lcom/firebase/ui/firestore/FirestoreRecyclerAdapter;", "Lcom/example/dadwalsocialmedia/models/Chatroom;", "Lcom/example/dadwalsocialmedia/adapters/ChatroomAdapter$ChatroomViewHolder;", "options", "Lcom/firebase/ui/firestore/FirestoreRecyclerOptions;", "context", "Landroid/content/Context;", "(Lcom/firebase/ui/firestore/FirestoreRecyclerOptions;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "onBindViewHolder", "", "holder", "position", "", "model", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ChatroomViewHolder", "app_debug"})
public final class ChatroomAdapter extends com.firebase.ui.firestore.FirestoreRecyclerAdapter<com.example.dadwalsocialmedia.models.Chatroom, com.example.dadwalsocialmedia.adapters.ChatroomAdapter.ChatroomViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public ChatroomAdapter(@org.jetbrains.annotations.NotNull()
    com.firebase.ui.firestore.FirestoreRecyclerOptions<com.example.dadwalsocialmedia.models.Chatroom> options, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.dadwalsocialmedia.adapters.ChatroomAdapter.ChatroomViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    protected void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.dadwalsocialmedia.adapters.ChatroomAdapter.ChatroomViewHolder holder, int position, @org.jetbrains.annotations.NotNull()
    com.example.dadwalsocialmedia.models.Chatroom model) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/dadwalsocialmedia/adapters/ChatroomAdapter$ChatroomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "chatroomName", "Landroid/widget/TextView;", "getChatroomName", "()Landroid/widget/TextView;", "app_debug"})
    public static final class ChatroomViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView chatroomName = null;
        
        public ChatroomViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getChatroomName() {
            return null;
        }
    }
}