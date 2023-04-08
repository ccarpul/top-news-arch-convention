plugins {
    id("com.android.application")
    id("kotlinx-serialization")
    id("org.jetbrains.kotlin.android")
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
}

android {
    compileSdk = 33
    buildFeatures {
        buildConfig = true
    }
    namespace = "com.example.core.network"

    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

secrets {
    defaultPropertiesFileName = "secrets.defaults.properties"
}

dependencies {
    implementation(libs.okHttp)
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.gson)
}