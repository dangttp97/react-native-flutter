package com.flutter;

import android.content.Intent;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

import io.flutter.embedding.android.FlutterActivity;

@ReactModule(name = FlutterModule.NAME)
public class FlutterModule extends ReactContextBaseJavaModule {
  public static final String NAME = "FlutterModule";

  public FlutterModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  public void startActivity() {
    ReactContext context = getReactApplicationContext();
    Intent intent = new Intent(context, FlutterActivity.class);
    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(intent);
  }
}
