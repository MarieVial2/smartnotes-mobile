package io.github.marievial2.smartnotes

import io.github.marievial2.smartnotes.di.AppContainer

class SmartNotesApp() : android.app.Application() {
    lateinit var container: AppContainer
        private set

    override fun onCreate() {
        super.onCreate()
        container = AppContainer(applicationContext)
    }




}
