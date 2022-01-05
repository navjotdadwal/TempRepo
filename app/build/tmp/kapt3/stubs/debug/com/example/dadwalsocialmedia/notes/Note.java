package com.example.dadwalsocialmedia.notes;

import java.lang.System;

@androidx.room.Entity(tableName = "notesTable")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u0011"}, d2 = {"Lcom/example/dadwalsocialmedia/notes/Note;", "", "noteTitle", "", "noteDescription", "timeStamp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "getNoteDescription", "()Ljava/lang/String;", "getNoteTitle", "getTimeStamp", "app_debug"})
public final class Note {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    private final java.lang.String noteTitle = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "description")
    private final java.lang.String noteDescription = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "timestamp")
    private final java.lang.String timeStamp = null;
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id = 0;
    
    public Note(@org.jetbrains.annotations.NotNull()
    java.lang.String noteTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String noteDescription, @org.jetbrains.annotations.NotNull()
    java.lang.String timeStamp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNoteTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNoteDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeStamp() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
}