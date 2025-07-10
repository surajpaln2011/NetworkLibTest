package com.example.networklib.service

import com.example.home.model.Post
import retrofit2.http.GET

interface PostApiService {
    @GET("posts")
    suspend fun getPosts(): List<Post>
}
