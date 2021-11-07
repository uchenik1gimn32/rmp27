package com.example.rmobp27;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    TextView CreateAccount;
    Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(HomeActivity.this, BaseActivity.class);
                startActivity(intent1);
                Toast.makeText(HomeActivity.this, "Authorization was successful", Toast.LENGTH_SHORT).show();
            }
        });


        CreateAccount=(TextView) findViewById(R.id.CreateAccount);
        CreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, RegistrationActivity.class);
                startActivity(i);
                Toast.makeText(HomeActivity.this, "You click Create Account", Toast.LENGTH_SHORT).show();
            }
        });
    }
}