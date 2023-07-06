package com.example.beshified;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText textBeshify;
    private Button btnBeshify;
    private TextView beshifiedText;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textBeshify = findViewById(R.id.textBeshify);
        btnBeshify = findViewById(R.id.btnBeshify);
        beshifiedText = findViewById(R.id.beshifiedText);

        btnBeshify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strTextBeshify = textBeshify.getText().toString();
                String newTextBeshify = strTextBeshify.replace(" ","\uD83E\uDD38");
                beshifiedText.setText(newTextBeshify);
            }
        });
    }
}