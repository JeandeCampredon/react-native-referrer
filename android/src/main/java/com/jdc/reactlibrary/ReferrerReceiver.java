
package com.jdc.reactlibrary;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ReferrerReceiver extends BroadcastReceiver {
  private static String referrer = "";

  public static String getReferrer() {
    return referrer;
  }

  private static void setReferrer(String value) {
    referrer = value;
  }

  @Override
  public void onReceive(Context context, Intent intent) {
    String referrerString = intent.getStringExtra("referrer");
    setReferrer(referrerString);
  }
}
