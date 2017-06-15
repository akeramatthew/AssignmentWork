package com.example.helloworld.assignmentwork;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    int correctAnswers = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = (Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            public void onClick(final View v) {



                checkAllQuestions();

                Toast.makeText(MainActivity.this, "Correct Answers: " + correctAnswers + "/5", Toast.LENGTH_LONG)
                        .show();
                resetCounterCorrectAnswers();

                //Write intent to take to new activity
                Intent activity = new Intent(MainActivity.this, ActivitySummary.class);

                Bundle b = new Bundle();

                EditText name = (EditText) findViewById(R.id.EnterNameInput);

                RadioGroup qn1 = (RadioGroup) findViewById(R.id.Question1Radio);
                int id = qn1.getCheckedRadioButtonId();

                RadioGroup qn2 = (RadioGroup) findViewById(R.id.Question2Radio);
                int id2 = qn2.getCheckedRadioButtonId();

                EditText answer = (EditText) findViewById(R.id.Question3answerInput);

                RadioGroup qn4 = (RadioGroup) findViewById(R.id.Question4Radio);
                int id4 = qn4.getCheckedRadioButtonId();

                RadioGroup qn5 = (RadioGroup) findViewById(R.id.Question5Radio);
                int id5 = qn5.getCheckedRadioButtonId();






                RadioButton qn1answers = (RadioButton) findViewById(id);
                RadioButton qn2answers = (RadioButton) findViewById(id2);
                RadioButton qn4answers = (RadioButton) findViewById(id4);
                RadioButton qn5answers = (RadioButton) findViewById(id5);


                b.putString("name", name.getText().toString());
                b.putString("Question1Radio", qn1answers.getText().toString());
                b.putString("Question2Radio", qn2answers.getText().toString());
                b.putString("answer", answer.getText().toString());
                b.putString("Question4Radio", qn4answers.getText().toString());
                b.putString("Question5Radio", qn5answers.getText().toString());

                activity.putExtras(b);
                startActivity(activity);




            }
        });


    }


    private void checkQuestionOneAnswers() {
        RadioButton complexity = (RadioButton) findViewById(R.id.radio_complexity_input);
        boolean isQuestionOneComplexityChecked = complexity.isChecked();
        if (isQuestionOneComplexityChecked) {
            correctAnswers  +=1;
        }
    }

    private void checkQuestionTwoAnswers() {
        RadioButton question2 = (RadioButton) findViewById(R.id.radio_false_input);
        boolean isQuestionTwofalseChecked = question2.isChecked();
        if (isQuestionTwofalseChecked) {
            correctAnswers += 1;
        }
    }

    private String getQuestionThreeUserInput() {
        EditText userInput = (EditText) findViewById(R.id.Question3answerInput);
        String name = userInput.getText().toString();
        return name;
    }

    private void checkQuestionThreeAnswer() {
        //gets the value the user has typed in the editText
        String name = getQuestionThreeUserInput();
        // Compare it to the correct answer
        if (name.trim().equalsIgnoreCase("objects")) {
            correctAnswers += 1;
        }
    }

    private void checkQuestionFourAnswers() {
        RadioButton radioButtonStatic = (RadioButton) findViewById(R.id.radio_static_input);
        boolean isQuestionFourStaticChecked = radioButtonStatic.isChecked();
        if (isQuestionFourStaticChecked) {
            correctAnswers += 1;
        }
    }

    private void checkQuestionFiveAnswers() {


        RadioButton radioButtonMethod = (RadioButton) findViewById(R.id.radio_method_input);
        boolean isQuestionFiveMethodChecked = radioButtonMethod.isChecked();
        if (isQuestionFiveMethodChecked) {
            correctAnswers += 1;
        }

    }

    private void checkAllQuestions() {
        checkQuestionOneAnswers();
        checkQuestionTwoAnswers();
        checkQuestionThreeAnswer();
        checkQuestionFourAnswers();
        checkQuestionFiveAnswers();
    }

    private void resetCounterCorrectAnswers() {

        correctAnswers = 0;

    }


}
