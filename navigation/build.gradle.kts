plugins {
    androidLibrary()
    kotlinAndroid()
    kotlinAndroidExt()
}

android {
    setLibraryConfig()

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
    implementation(Libraries.Navigation.FragmentKtx)
    implementation(Libraries.Navigation.Ui)
}
