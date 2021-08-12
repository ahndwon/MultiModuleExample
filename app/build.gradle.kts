plugins {
    androidApp()
    kotlinAndroid()
    hilt()
    kapt()
}

android {
    setAppConfig()
    setPackagingOptions()

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Libraries.Koin)

    implementation(Libraries.Dagger)
    implementation(Libraries.Dagger.Compiler)
    implementation(Libraries.Dagger.Android)
    implementation(Libraries.Dagger.AndroidSupport)
    implementation(Libraries.Dagger.Processor)

    implementation(Libraries.Hilt)
    implementation(Libraries.Hilt.Compiler)

    implementation(project(Modules.Home))
    implementation(project(Modules.Launch))
    implementation(project(Modules.Detail))
//
//    implementation(project(Modules.ActivityFeature))
//    implementation(project(Modules.FragmentFeature))
//
    implementation(project(Modules.Navigation))
    implementation(project(Modules.Design))
    implementation(project(Modules.Core))
}
