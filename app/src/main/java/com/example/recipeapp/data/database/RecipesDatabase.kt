package com.example.recipeapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.recipeapp.data.database.entities.RecipeEntity

@Database(
    entities = [RecipeEntity::class],
    version = 1,
    exportSchema = true
)
@TypeConverters(RecipesTypeConverter::class)
abstract class RecipesDatabase: RoomDatabase() {

    abstract fun recipesDao(): RecipesDao
}