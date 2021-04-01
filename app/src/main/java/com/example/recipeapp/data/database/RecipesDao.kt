package com.example.recipeapp.data.database

import androidx.room.*
import com.example.recipeapp.data.database.entities.RecipeEntity
import com.example.recipeapp.models.Recipe
import kotlinx.coroutines.flow.Flow

@Dao
interface RecipesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecipe(recipeEntity: RecipeEntity)

    @Query("SELECT * FROM recipes_table ORDER BY id ASC")
    fun readRecipes(): Flow<List<RecipeEntity>>

    @Delete
    suspend fun deleteRecipe(recipeEntity: RecipeEntity)

    @Query("DELETE FROM recipes_table")
    suspend fun deleteAllRecipes()
}