package com.example.recipeapp.data.network

import com.example.recipeapp.models.Recipes
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RecipesApi {

    @GET("/recipes/random")
    suspend fun getRandomRecipes(): Response<Recipes>

    @GET("/recipes/complexSearch")
    suspend fun searchRecipes(
        @Query("query") query: String
    ): Response<Recipes>
}