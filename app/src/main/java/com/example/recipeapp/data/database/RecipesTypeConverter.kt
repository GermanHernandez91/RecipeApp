package com.example.recipeapp.data.database

import androidx.room.TypeConverter
import com.example.recipeapp.models.Recipe
import com.squareup.moshi.Moshi

class RecipesTypeConverter {

    private val moshi = Moshi.Builder().build()

    @TypeConverter
    fun stringToRecipe(string: String): Recipe? {
        val jsonAdapter = moshi.adapter(Recipe::class.java)
        return jsonAdapter.fromJson(string)
    }

    @TypeConverter
    fun recipeToString(recipe: Recipe): String? {
        val jsonAdapter = moshi.adapter(Recipe::class.java)
        return jsonAdapter.toJson(recipe)
    }
}