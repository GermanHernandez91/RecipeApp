package com.example.recipeapp.data

import com.example.recipeapp.data.network.RecipesApi
import com.example.recipeapp.models.Recipes
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val recipesApi: RecipesApi
) {

    suspend fun getRandomRecipes(): Response<Recipes> {
        return recipesApi.getRandomRecipes()
    }

    suspend fun searchRecipes(query: String): Response<Recipes> {
        return recipesApi.searchRecipes(query)
    }
}