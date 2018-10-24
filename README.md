# CustomColoredToastApp
This library allows you to create different colored toast notifications.

## Installation

You can install this library using gradle:


  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  dependencies {
	        implementation 'com.github.enesigneci:CustomColoredToastApp:1.0'
	}
  
  ##Usage
 
 CustomColoredToast.makeCustomColoredToast(MainActivity.this,"Custom Toast",CustomColoredToast.LENGTH_LONG,R.color.colorPrimary);
 
 Thanks
