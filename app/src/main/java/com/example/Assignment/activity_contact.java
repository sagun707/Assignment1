package com.example.Assignment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class activity_contact extends AppCompatActivity {
    Button b1;
    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_contact);
        b1=findViewById(R.id.btn9);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(activity_contact.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
