plugins {
    `kotlin-dsl`
}

group = "com.google.example.topnewsarchmodel.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}


dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "top.news.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
    }
}