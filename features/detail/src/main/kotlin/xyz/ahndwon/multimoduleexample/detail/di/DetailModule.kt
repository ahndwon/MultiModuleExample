package xyz.ahndwon.multimoduleexample.detail.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import xyz.ahndwon.multimoduleexample.detail.model.LaunchViewModel
import xyz.ahndwon.multimoduleexample.detail.model.LaunchViewModelImpl

val launchModule = module {
    viewModel<LaunchViewModel> {
        LaunchViewModelImpl()
    }
}
