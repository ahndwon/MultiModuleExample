plugins {
    androidLibrary()
    kotlinAndroid()
    kotlinAndroidExt()
    hilt()
    kapt()
}

android {
    setLibraryConfig()
    setPackagingOptions()

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {
//    implementation(project(Modules.Navigator))
    implementation(project(Modules.Core))

    implementation(Libraries.JavaX.Inject)
    implementation(Libraries.AndroidX.activityKtx)
    implementation(Libraries.AndroidX.appcompat)
    implementation(Libraries.AndroidX.constraintLayout)
    implementation(Libraries.Koin)
    implementation(Libraries.Hilt)
    implementation(Libraries.Hilt.Compiler)
    implementation(Libraries.Dagger)
    implementation(Libraries.Dagger.Compiler)
    implementation(Libraries.Dagger.Android)
    implementation(Libraries.Dagger.AndroidSupport)
    implementation(Libraries.Dagger.Processor)
}
