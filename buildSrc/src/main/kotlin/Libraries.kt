/**
 * Lists all the external libraries used by the project.
 */
object Libraries {
    const val daggerVersion = "2.38.1"
    const val hiltVersion = "2.38.1"
    const val navigationVersion = "2.3.5"

    object AndroidX {
        const val activityKtx = "androidx.activity:activity-ktx:1.1.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
        const val appcompat = "androidx.appcompat:appcompat:1.2.0-alpha02"
        const val material = "com.google.android.material:material:1.1.0"
        const val core = "androidx.core:core-ktx:1.2.0"
    }

    object Kotlin : LibraryGroup(groupName = "org.jetbrains.kotlin", version = "1.4.21") {
        object Coroutines : LibraryGroup(
            groupName = "org.jetbrains.kotlinx",
            version = "1.4.2"
        ), Implementable, Library {
            override val name = "kotlinx-coroutines-android"
        }
    }

    object Lifecycle : LibraryGroup(groupName = "androidx.lifecycle", version = "2.2.0") {
        object ViewModel : LibraryGroupChild(group = Lifecycle, name = "lifecycle-viewmodel-ktx"),
            Implementable
    }

    object Koin : LibraryGroup(groupName = "io.insert-koin", version = "3.1.2"), Implementable,
        Library {
        override val name: String = "koin-android"

        object Test : LibraryGroupChild(group = Koin, name = "koin-test"), TestImplementable
    }

    object JavaX : LibraryGroup(groupName = "javax.inject", version = "1") {
        object Inject : LibraryGroupChild(group = JavaX, name = "javax.inject"), Implementable
    }

    object Dagger : LibraryGroup(groupName = "com.google.dagger", version = daggerVersion),
        Implementable,
        Library {
        override val name: String = "dagger"

        object Compiler : LibraryGroupChild(group = Dagger, name = "dagger-compiler"), Kapt

        object Android : LibraryGroupChild(group = Dagger, name = "dagger-android"), Implementable
        object AndroidSupport : LibraryGroupChild(group = Dagger, name = "dagger-android-support"),
            Implementable

        object Processor : LibraryGroupChild(group = Dagger, name = "dagger-android-processor"),
            Kapt
    }

    object Hilt : LibraryGroup(groupName = "com.google.dagger", version = hiltVersion),
        Implementable,
        Library {
        override val name: String = "hilt-android"

        object Compiler : LibraryGroupChild(group = Hilt, name = "hilt-android-compiler"), Kapt
    }

    object Navigation :
        LibraryGroup(groupName = "androidx.navigation", version = navigationVersion), Implementable,
        Library {
        override val name: String = ""

        object FragmentKtx :
            LibraryGroupChild(group = Navigation, name = "navigation-fragment-ktx"), Implementable

        object Ui : LibraryGroupChild(group = Navigation, name = "navigation-ui-ktx"), Implementable
    }

    const val inline_activity_result = "com.github.florent37:inline-activity-result-kotlin:1.0.4"
}
