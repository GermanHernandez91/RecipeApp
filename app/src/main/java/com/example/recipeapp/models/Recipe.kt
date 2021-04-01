package com.example.recipeapp.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Recipe(
    @Json(name = "aggregateLikes")
    val aggregateLikes: Int,
    @Json(name = "dairyFree")
    val dairyFree: Boolean,
    @Json(name = "extendedIngredients")
    val extendedIngredients: List<ExtendedIngredient>,
    @Json(name = "glutenFree")
    val glutenFree: Boolean,
    @Json(name = "id")
    val id: Int,
    @Json(name = "image")
    val image: String,
    @Json(name = "imageType")
    val imageType: String,
    @Json(name = "pricePerServing")
    val pricePerServing: Double,
    @Json(name = "readyInMinutes")
    val readyInMinutes: Int,
    @Json(name = "servings")
    val servings: Int,
    @Json(name = "sourceName")
    val sourceName: String,
    @Json(name = "sourceUrl")
    val sourceUrl: String,
    @Json(name = "spoonacularSourceUrl")
    val spoonacularSourceUrl: String,
    @Json(name = "summary")
    val summary: String,
    @Json(name = "title")
    val title: String,
    @Json(name = "vegan")
    val vegan: Boolean,
    @Json(name = "vegetarian")
    val vegetarian: Boolean,
    @Json(name = "veryHealthy")
    val veryHealthy: Boolean,
    @Json(name = "veryPopular")
    val veryPopular: Boolean
)