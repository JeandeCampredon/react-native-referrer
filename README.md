
# react-native-referrer

<!-- badge -->
[![npm version](https://img.shields.io/npm/v/react-native-referrer.svg)](https://www.npmjs.com/package/react-native-referrer)
[![npm license](https://img.shields.io/npm/l/react-native-referrer.svg)](https://www.npmjs.com/package/react-native-referrer)
[![npm download](https://img.shields.io/npm/dm/react-native-referrer.svg)](https://www.npmjs.com/package/react-native-referrer)
[![npm download](https://img.shields.io/npm/dt/react-native-referrer.svg)](https://www.npmjs.com/package/react-native-referrer)
<!-- endbadge -->

## Getting started

`$ npm install react-native-referrer --save`

### Mostly automatic installation

`$ react-native link react-native-referrer`

### Manual installation


#### Android

1.  Open up `android/app/src/main/java/[...]/MainActivity.java`
-   Add `import com.jdc.reactlibrary.RNReferrerPackage;` to the imports at the top of the file
-   Add `new RNReferrerPackage()` to the list returned by the `getPackages()` method
2.  Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-referrer'
  	project(':react-native-referrer').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-referrer/android')
  	```
3.  Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
  	compile project(':react-native-referrer')
  	```
4.  Insert the following lines inside the application block in `android/app/src/main/AndroidManifest.xml`:
  	```xml
  	<receiver android:name="com.jdc.reactlibrary.ReferrerReceiver" android:exported="true">
      <intent-filter>
        <action android:name="com.android.vending.INSTALL_REFERRER" />
      </intent-filter>
    </receiver>
  	```


## Usage
```javascript
import RNReferrer from 'react-native-referrer';

...
const referer = await RNReferrer.getReferrer();
```
