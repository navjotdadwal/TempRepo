package com.example.dadwalsocialmedia.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0014J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0016\u00a8\u0006\u0014"}, d2 = {"Lcom/example/dadwalsocialmedia/adapters/ChatAdapter;", "Lcom/firebase/ui/firestore/FirestoreRecyclerAdapter;", "Lcom/example/dadwalsocialmedia/models/Chat;", "Lcom/example/dadwalsocialmedia/adapters/ChatAdapter$ChatViewHolder;", "options", "Lcom/firebase/ui/firestore/FirestoreRecyclerOptions;", "(Lcom/firebase/ui/firestore/FirestoreRecyclerOptions;)V", "getItemViewType", "", "position", "onBindViewHolder", "", "holder", "model", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ChatViewHolder", "Companion", "app_debug"})
public final class ChatAdapter extends com.firebase.ui.firestore.FirestoreRecyclerAdapter<com.example.dadwalsocialmedia.models.Chat, com.example.dadwalsocialmedia.adapters.ChatAdapter.ChatViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.dadwalsocialmedia.adapters.ChatAdapter.Companion Companion = null;
    public static final int MSG_BY_SELF = 0;
    public static final int MSG_BY_OTHER = 1;
    
    public ChatAdapter(@org.jetbrains.annotations.NotNull()
    com.firebase.ui.firestore.FirestoreRecyclerOptions<com.example.dadwalsocialmedia.models.Chat> options) {
        super(null);
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.dadwalsocialmedia.adapters.ChatAdapter.ChatViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    protected void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.dadwalsocialmedia.adapters.ChatAdapter.ChatViewHolder holder, int position, @org.jetbrains.annotations.NotNull()
    com.example.dadwalsocialmedia.models.Chat model) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/example/dadwalsocialmedia/adapters/ChatAdapter$ChatViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "chatAuthor", "Landroid/widget/TextView;", "getChatAuthor", "()Landroid/widget/TextView;", "chatText", "getChatText", "app_debug"})
    public static final class ChatViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView chatText = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView chatAuthor = null;
        
        public ChatViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getChatText() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getChatAuthor() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/dadwalsocialmedia/adapters/ChatAdapter$Companion;", "", "()V", "MSG_BY_OTHER", "", "MSG_BY_SELF", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}