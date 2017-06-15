package com.example.helloworld.assignmentwork;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.start;
import static com.example.helloworld.assignmentwork.R.string.submit;

/**
 * Created by MattieAkera on 6/1/17.
 */

public class Introduction extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introduction);

        Button startButton = (Button) findViewById(R.id.start);
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v){

                //Write intent to take to new activity
                Intent activity = new Intent(Introduction.this, MainActivity.class);
                startActivity(activity);

            }
        });

    }
}

