plugins {
    id("top.news.android.application")
}

android {
    namespace = "com.example.topnewsarchmodel"

    defaultConfig {
        applicationId = "com.example.topnewsarchmodel"
        versionCode = 1
        versionName = "0.0.1"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        val debug by getting {
            applicationIdSuffix = ".debug"
        }
        val release by getting {
            isMinifyEnabled = true
            applicationIdSuffix = ".release"
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            signingConfig = signingConfigs.getByName("debug")
        }
/*        val benchmark by creating {
           // Enable all the optimizations from release build through initWith(release).
           initWith(release)
           matchingFallbacks.add("release")
           // Debug key signing is available to everyone.
           signingConfig = signingConfigs.getByName("debug")
           // Only use benchmark proguard rules
           proguardFiles("benchmark-rules.pro")
           isMinifyEnabled = true
           applicationIdSuffix = ".benchmark"
       }*/
    }

}

dependencies {
    implementation(project(":feature:news"))
    androidTestImplementation(project(":core:network"))
}