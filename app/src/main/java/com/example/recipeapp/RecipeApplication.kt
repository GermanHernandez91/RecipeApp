package com.example.recipeapp

import android.app.Application
import android.content.res.Resources
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class RecipeApplication : Application() {

    companion object {
        lateinit var instance: Application
        lateinit var res: Resources
    }

    override fun onCreate() {
        super.onCreate()

        instance = this
        res = resources
    }
}