
# react-native-referrer

## Getting started

`$ npm install react-native-referrer --save`

### Mostly automatic installation

`$ react-native link react-native-referrer`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.jdc.reactlibrary.RNReferrerPackage;` to the imports at the top of the file
  - Add `new RNReferrerPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-referrer'
  	project(':react-native-referrer').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-referrer/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-referrer')
  	```


## Usage
```javascript
import RNReferrer from 'react-native-referrer';

// TODO: What to do with the module?
RNReferrer;
```
