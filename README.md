# AndroidSdkVersionUtil
Reduce boilerplate when checking SDK version 

## Install

Step 1. Add jitpack in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
  
Step 2. Add the library

	dependencies {
	       implementation 'com.github.OEssHRERLr770rGGLOH0:AndroidSdkVersionUtil:0.1'
	}


## How to use

#### Without the library:

``` kotlin
if(Build.VERSION.SDK_INT == Build.VERSION_CODES.R) // do something
```

#### With:
``` kotlin
if(Version.isR) // do something
```

#### Add `import com.tobianoapps.androidsdkversionutil.Version` and the above becomes:

``` kotlin
if(isR) // do something
```

## Other uses

#### Get current SDK version:

```kotlin
val version = sdkVersionNumber
```
        
