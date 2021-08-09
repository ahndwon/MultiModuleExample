package xyz.ahndwon.multimoduleexample.launch.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import xyz.ahndwon.multimoduleexample.launch.model.LaunchViewModel
import xyz.ahndwon.multimoduleexample.launch.model.LaunchViewModelImpl

val launchModule = module {
    viewModel<LaunchViewModel> {
        LaunchViewModelImpl()
    }
}
