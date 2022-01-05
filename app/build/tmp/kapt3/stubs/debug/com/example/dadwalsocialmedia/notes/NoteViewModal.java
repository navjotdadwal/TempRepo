package com.example.dadwalsocialmedia.notes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lcom/example/dadwalsocialmedia/notes/NoteViewModal;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allNotes", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/dadwalsocialmedia/notes/Note;", "getAllNotes", "()Landroidx/lifecycle/LiveData;", "repository", "Lcom/example/dadwalsocialmedia/notes/NoteRepository;", "getRepository", "()Lcom/example/dadwalsocialmedia/notes/NoteRepository;", "addNote", "Lkotlinx/coroutines/Job;", "note", "deleteNote", "updateNote", "app_debug"})
public final class NoteViewModal extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.dadwalsocialmedia.notes.Note>> allNotes = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.dadwalsocialmedia.notes.NoteRepository repository = null;
    
    public NoteViewModal(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.dadwalsocialmedia.notes.Note>> getAllNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dadwalsocialmedia.notes.NoteRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteNote(@org.jetbrains.annotations.NotNull()
    com.example.dadwalsocialmedia.notes.Note note) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job updateNote(@org.jetbrains.annotations.NotNull()
    com.example.dadwalsocialmedia.notes.Note note) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job addNote(@org.jetbrains.annotations.NotNull()
    com.example.dadwalsocialmedia.notes.Note note) {
        return null;
    }
}