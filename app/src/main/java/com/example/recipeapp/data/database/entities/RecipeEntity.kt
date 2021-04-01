package com.example.recipeapp.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.recipeapp.models.Recipe
import com.example.recipeapp.utils.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipeEntity(
    var recipe: Recipe
) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}