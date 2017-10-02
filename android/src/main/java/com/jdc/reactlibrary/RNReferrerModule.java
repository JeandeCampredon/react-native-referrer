
package com.jdc.reactlibrary;

import android.content.Context;
import android.content.SharedPreferences;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.Callback;

public class RNReferrerModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNReferrerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNReferrer";
  }

  @ReactMethod
  public void getReferrer(Promise promise) {
    Context context = getReactApplicationContext();

    promise.resolve(ReferrerReceiver.getReferrer());
  }
}