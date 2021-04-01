package com.example.recipeapp.utils

import com.example.recipeapp.R
import com.example.recipeapp.RecipeApplication

class Constants {

    companion object {

        val API_KEY = RecipeApplication.res.getString(R.string.api_key)

        const val BASE_URL = "https://api.spoonacular.com/"
        const val RECIPES_TABLE = "recipes_table"
    }
}