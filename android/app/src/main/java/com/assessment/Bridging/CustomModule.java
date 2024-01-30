package com.assessment.Bridging;

import android.app.AlertDialog;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.Objects;

public class CustomModule extends ReactContextBaseJavaModule {

    CustomModule(ReactApplicationContext context) {
        super(context);
    }

    @NonNull
    @Override
    public String getName() {
        return "CustomModule";
    }


    @ReactMethod(isBlockingSynchronousMethod = true)
    public void addCommentScreen() {
        Intent i = new Intent(getCurrentActivity(), AddComment.class);
        Objects.requireNonNull(getCurrentActivity()).startActivity(i);
    }
}

