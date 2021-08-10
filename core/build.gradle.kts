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
    implementation(Libraries.AndroidX.activityKtx)
    implementation(Libraries.AndroidX.appcompat)
    implementation(Libraries.AndroidX.constraintLayout)
    implementation(Libraries.Koin)
    implementation(Libraries.Hilt)
}
