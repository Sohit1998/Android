package com.assessment.Bridging;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.assessment.R;
import com.facebook.react.ReactApplication;
import com.facebook.react.modules.core.DeviceEventManagerModule;

import java.util.Objects;

public class AddComment extends AppCompatActivity {

    Button submit;
    EditText userComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_comment);
        submit = findViewById(R.id.submit);
        userComment = findViewById(R.id.textInput);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input = userComment.getText().toString();
                if (input.length() > 0) {
                    try {
                        Objects.requireNonNull(((ReactApplication) getApplicationContext()).getReactNativeHost().getReactInstanceManager().getCurrentReactContext())
                                .getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit("sendComment", input);
                        finish();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Please add comment", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}