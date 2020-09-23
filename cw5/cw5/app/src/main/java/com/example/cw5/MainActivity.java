package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button a = findViewById(R.id.nextPage);
        final EditText n = findViewById(R.id.name);
        final EditText m = findViewById(R.id.age);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = n.getText().toString();
                String age =  m.getText().toString();
                Intent x = new Intent(MainActivity.this , MainActivity2.class);
                x.putExtra("info", name);
                x.putExtra("information", age);
                startActivity(x);
            }
        });
    }
}