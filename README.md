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
	       implementation 'com.github.OEssHRERLr770rGGLOH0:AndroidSdkVersionUtil:0.2'
	}


## How to use

#### Without the library:

``` kotlin
if(Build.VERSION.SDK_INT == Build.VERSION_CODES.R)
```

#### With:
``` kotlin
if(Version.isR)
```

``` kotlin
import com.tobianoapps.androidsdkversionutil.Version

if(isR)
```

#### Check a multitude of conditions:

```kotlin
isPreR == Build.VERSION.SDK_INT < Build.VERSION_CODES.R
isR == Build.VERSION.SDK_INT == Build.VERSION_CODES.R
isROrLater == Build.VERSION.SDK_INT >= Build.VERSION_CODES.R
isLaterThanR == Build.VERSION.SDK_INT > Build.VERSION_CODES.R
```

#### Use version number, code or human name (when applicable)

```kotlin
isM == isMarshmallow == is23
```

## Other uses

#### Get current SDK version:

```kotlin
val version = sdkVersionNumber
```
        
