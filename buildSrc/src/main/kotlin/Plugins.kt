import org.gradle.kotlin.dsl.kotlin
import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

val PluginDependenciesSpec.ktlint: PluginDependencySpec
    get() = id("org.jlleitschuh.gradle.ktlint").version("9.4.1")

/**
 * Plugin that allows to define a module an "Android app" one
 */
fun PluginDependenciesSpec.androidApp(): PluginDependencySpec =
    id("com.android.application")

// dependency graph report plugin
fun PluginDependenciesSpec.report(): PluginDependencySpec =
    id("project-report")

/**
 * Plugin that allows to define a module as a "library" one.
 */
fun PluginDependenciesSpec.androidLibrary(): PluginDependencySpec =
    id("com.android.library")

/**
 * Android Kotlin module
 */
fun PluginDependenciesSpec.kotlinAndroid(): PluginDependencySpec =
    kotlin("android")

// Deprecated
/**
 * Plugin that contains useful Kotlin extensions for Android Development
 */
fun PluginDependenciesSpec.kotlinAndroidExt(): PluginDependencySpec =
    kotlin("android.extensions")

/**
 * Plugin that contains useful Kotlin extensions for Android Development
 */
fun PluginDependenciesSpec.kotlinParcelize(): PluginDependencySpec =
    kotlin("kotlin-parcelize")

/**
 * Plugin that contains kapt
 */
fun PluginDependenciesSpec.kapt(): PluginDependencySpec =
    kotlin("kapt")

/**
 * Plugin that contains Hilt for DI
 */
fun PluginDependenciesSpec.hilt(): PluginDependencySpec =
    id("dagger.hilt.android.plugin")

/**
 * Plugin that contains Safe Args for AndroidX Navigation
 */
fun PluginDependenciesSpec.kotlinSafeArgs(): PluginDependencySpec =
    id("androidx.navigation.safeargs.kotlin")

