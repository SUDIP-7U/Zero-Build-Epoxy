plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    kotlin("kapt")
}

android {
    namespace = "com.example.epoxyserver"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.epoxyserver"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

    viewBinding {
        enable = true
    }

    kapt {
        correctErrorTypes = true
    }
}

dependencies {
    //Epoxy libary
    implementation("com.airbnb.android:epoxy:5.1.0")
    kapt("com.airbnb.android:epoxy-processor:5.1.0")
    //kotlin("kapt")
    //  kapt {
    //        correctErrorTypes = true
    //    }
    //   implementation("com.airbnb.android:epoxy:5.1.0")
    //    kapt("com.airbnb.android:epoxy-processor:5.1.0")

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
//kotlin("kapt")
//  kapt {
//        correctErrorTypes = true
//    }
//   implementation("com.airbnb.android:epoxy:5.1.0")
//    kapt("com.airbnb.android:epoxy-processor:5.1.0")