package com.example.chachix;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText username, password;

    private String Admin_User="admin";
    private String Admin_pass="admin123";
    TextView forgot_password, register;
    ImageView fb, ig, gmail;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        forgot_password = findViewById(R.id.forgot_password);
        register = findViewById(R.id.register);
        fb = findViewById(R.id.fb);
        ig = findViewById(R.id.ig);
        gmail = findViewById(R.id.gmail);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v -> {
            String Username = username.getText().toString();
            String Password = password.getText().toString();
            if(Username.isEmpty()||Password.isEmpty()){
                Toast.makeText(this, "Please enter username and password", Toast.LENGTH_SHORT).show();
                return;
            }
            if(Username.equals(Admin_User) && Password.equals(Admin_pass)){
                Intent intent = new Intent(MainActivity.this, Inventory.class);
                startActivity(intent);
                finish();
            } else {
                Intent intent = new Intent(MainActivity.this, Dashboard.class);
                startActivity(intent);
                finish();
            }

        });

    }
}