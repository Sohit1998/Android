package com.example.androidbasics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PasswordActivity extends AppCompatActivity {
    String TAG = "LIFECYCLE_AWARE";
    Button submit;
    EditText password;
    TextView greetings;
    TextView inputError;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);
        password = findViewById(R.id.password);
        submit = findViewById(R.id.btn_submit);
        greetings = findViewById(R.id.tv_greetings);
        inputError = findViewById(R.id.inputError);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("NAME");
            // Display the name in a TextView
            greetings.setText("Hello, " + name + "!");
        }

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Log.d(TAG, "beforeTextChanged: ");
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if(password.getText().toString().length() < 8){
                    inputError.setText("Password must be greater than 7 characters ");
                    submit.setEnabled(false);
                }else{
                    submit.setEnabled(true);
                    inputError.setText(null);
                }
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userPass = password.getText().toString();
                Bundle bundle = getIntent().getExtras();
                if(bundle != null){
                    String name = bundle.getString("NAME");
                    Bundle updatedBundle = new Bundle();
                    updatedBundle.putString("PASSWORD", userPass);
                    updatedBundle.putString("NAME",name);
                    Intent intent = new Intent(PasswordActivity.this, HomeActivity.class);
                    intent.putExtras(updatedBundle);
                    startActivity(intent);
                }


            }
        });
    }
}