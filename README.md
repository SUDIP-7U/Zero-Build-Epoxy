//Plugins

kotlin("kapt")



// Allow to Genarate 
kapt { 
correctErrorTypes = true 
} 

//dependency(

implementation("com.airbnb.android:epoxy:5.1.0") 
kapt("com.airbnb.android:epoxy-processor:5.1.0")

)
