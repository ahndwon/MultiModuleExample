plugins {
    androidApp()
    kotlinAndroid()
}

android {
    setAppConfig()

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
    implementation(project(Modules.Home))
//
//    implementation(project(Modules.ActivityFeature))
//    implementation(project(Modules.FragmentFeature))
//
//    implementation(project(Modules.Navigation))
//
    implementation(project(Modules.Design))
    implementation(project(Modules.Core))
}
