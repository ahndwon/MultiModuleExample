package xyz.ahndwon.multimoduleexample.home.di

import xyz.ahndwon.multimoduleexample.home.model.MainViewModel
import xyz.ahndwon.multimoduleexample.home.model.MainViewModelImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    viewModel<MainViewModel> {
        MainViewModelImpl()
    }
}
