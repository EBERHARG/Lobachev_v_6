package com.example.lobachev_v_6;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener( this);
    }


        @Override
        public void onClick(View view){
            Intent intent = new Intent(view.getContext(),presonbal_area.class);
            startActivity(intent);
        }
    }
