package xyz.ahndwon.multimoduleexample

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import xyz.ahndwon.multimoduleexample.home.di.mainModule

class MultiModuleApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initDi()
    }

    private fun initDi() = startKoin {
        androidContext(this@MultiModuleApplication)
        modules(mainModule)
    }
}