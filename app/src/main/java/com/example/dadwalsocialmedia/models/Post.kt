package com.example.dadwalsocialmedia.models

data class Post(
    val text: String = "",
    val imageUrl: String = "",
    val user: User = User(),
    val time: Long = 0L,
    val likesList: MutableList<String> = mutableListOf())