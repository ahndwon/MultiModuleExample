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
    implementation(Libraries.AndroidX.activityKtx)
    implementation(Libraries.AndroidX.appcompat)
    implementation(Libraries.AndroidX.constraintLayout)
    implementation(Libraries.Koin)
    implementation(Libraries.Hilt)
    implementation(Libraries.Hilt.Compiler)
}
