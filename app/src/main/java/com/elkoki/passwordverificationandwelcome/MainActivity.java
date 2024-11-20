package com.elkoki.passwordverificationandwelcome;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText txt_pswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void Verify (View view) {
        EditText txt_pswd = findViewById(R.id.txt_pswd);
        if (txt_pswd.getText().toString().equals("abc123")) {
            Intent verify = new Intent(this, Welcome.class);
            startActivity(verify);
        }
        else {
            Toast.makeText(this, "Password Incorrect", Toast.LENGTH_SHORT).show();
        }
    }
}