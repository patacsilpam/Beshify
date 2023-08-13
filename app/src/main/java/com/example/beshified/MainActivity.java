package com.example.beshified;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
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
    private Button btnCopy;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textBeshify = findViewById(R.id.textBeshify);
        btnBeshify = findViewById(R.id.btnBeshify);
        beshifiedText = findViewById(R.id.beshifiedText);
        btnCopy = findViewById(R.id.btnCopy);

        btnBeshify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strTextBeshify = textBeshify.getText().toString();
                String newTextBeshify = strTextBeshify.replace(" ","\uD83E\uDD38");
                beshifiedText.setText(newTextBeshify);
            }
        });

        btnCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("",beshifiedText.getText().toString());
                clipboardManager.setPrimaryClip(clipData);
            }
        });
    }
}