
package com.jdc.reactlibrary;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class ReferrerReceiver extends BroadcastReceiver {
  public static final String REFERRER_PREFS_NAME = "referrerPreferences";

  public static String getReferrerFromSharedPreferences(Context context) {
    SharedPreferences prefs = context.getSharedPreferences(REFERRER_PREFS_NAME, context.MODE_PRIVATE);
    String storedReferrerString = prefs.getString("referrer", null);
    return storedReferrerString;
  }

  private static void storeReferrerInSharedPreferences(String value, Context context) {
    SharedPreferences.Editor editor = context.getSharedPreferences(REFERRER_PREFS_NAME, context.MODE_PRIVATE).edit();
    editor.putString("referrer", value);
    editor.apply();
  }

  @Override
  public void onReceive(Context context, Intent intent) {
    String referrerString = intent.getStringExtra("referrer");

    storeReferrerInSharedPreferences(referrerString, context);
  }
}
