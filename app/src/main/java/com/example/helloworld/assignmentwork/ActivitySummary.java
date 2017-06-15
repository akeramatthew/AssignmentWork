package com.example.helloworld.assignmentwork;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.helloworld.assignmentwork.R;

import static android.R.id.message;
import static com.example.helloworld.assignmentwork.R.id.ViewAnswers;
import static com.example.helloworld.assignmentwork.R.id.textView;

/**
 * Created by MattieAkera on 6/1/17.
 */

public class ActivitySummary extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary);

        Bundle b = getIntent().getExtras();

        TextView textViewName = (TextView) findViewById(R.id.textNameOutput);
        textViewName.setText(b.getCharSequence("name"));

        TextView qn1answer = (TextView) findViewById(R.id.textQuestion1Output);
        qn1answer.setText(b.getCharSequence("Question1Radio"));

        TextView qn2answer = (TextView) findViewById(R.id.textQuestion2Output);
        qn2answer.setText(b.getCharSequence("Question2Radio"));

        TextView ans = (TextView) findViewById(R.id.textQuestion3Output);
        ans.setText(b.getCharSequence("answer"));

        TextView qn4answer = (TextView) findViewById(R.id.textQuestion4Output);
        qn4answer.setText(b.getCharSequence("Question4Radio"));

        TextView qn5answer = (TextView) findViewById(R.id.textQuestion5Output);
        qn5answer.setText(b.getCharSequence("Question5Radio"));

        Button viewAnswers = (Button) findViewById(R.id.ViewAnswers);
        viewAnswers.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v){

                //Write intent to take to new activity
                Intent activityAnswers = new Intent(ActivitySummary.this, Answers.class);
                startActivity(activityAnswers);

            }
        });

    }
}
