package com.example.recipeapp.data

import com.example.recipeapp.data.database.RecipesDao
import com.example.recipeapp.data.database.entities.RecipeEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val recipesDao: RecipesDao
) {

    fun readRecipes(): Flow<List<RecipeEntity>> {
        return recipesDao.readRecipes()
    }

    suspend fun insertRecipe(recipeEntity: RecipeEntity) {
        recipesDao.insertRecipe(recipeEntity)
    }

    suspend fun deleteRecipe(recipeEntity: RecipeEntity) {
        recipesDao.deleteRecipe(recipeEntity)
    }

    suspend fun deleteAllRecipes() {
        recipesDao.deleteAllRecipes()
    }
}