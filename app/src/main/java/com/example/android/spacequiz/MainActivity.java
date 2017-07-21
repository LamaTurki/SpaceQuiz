package com.example.android.spacequiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean checkQuestion1() {
        boolean jupiterIsChecked = ((CheckBox) findViewById(R.id.q1_Jupiter)).isChecked();
        boolean murcuryIsChecked = ((CheckBox) findViewById(R.id.q1_murcury)).isChecked();
        boolean neptuneIsChecked = ((CheckBox) findViewById(R.id.q1_neptune)).isChecked();
        boolean uranusIsChecked = ((CheckBox) findViewById(R.id.q1_uranus)).isChecked();
        if (jupiterIsChecked && !murcuryIsChecked && neptuneIsChecked && uranusIsChecked)
            return true;
        else
            return false;
    }

    public boolean checkQuestion2() {
        boolean murcuryIsChecked = ((CheckBox) findViewById(R.id.q2_murcury)).isChecked();
        boolean jupiterIsChecked = ((CheckBox) findViewById(R.id.q2_jupitar)).isChecked();
        boolean uranusIsChecked = ((CheckBox) findViewById(R.id.q2_uranus)).isChecked();
        boolean venusIsChecked = ((CheckBox) findViewById(R.id.q2_venus)).isChecked();
        if (!jupiterIsChecked && murcuryIsChecked && venusIsChecked && !uranusIsChecked)
            return true;
        else
            return false;
    }

    public boolean checkQuestion3() {
        EditText q3Answer = (EditText) findViewById(R.id.q3_text_field);
        if (q3Answer.getText().toString().toLowerCase().equals("neil armstrong") ||
                q3Answer.getText().toString().toLowerCase().equals("armstrong"))
            return true;
        else
            return false;
    }

    public boolean checkQuestion4() {
        RadioButton q4CorrectAnswer = (RadioButton) findViewById(R.id.q4_twinking_of_stars);
        if (q4CorrectAnswer.isChecked())
            return true;
        else
            return false;
    }

    public boolean checkQuestion5() {
        RadioButton q5CorrectAnswer = (RadioButton) findViewById(R.id.q5_8min);
        if (q5CorrectAnswer.isChecked())
            return true;
        else
            return false;
    }

    public void submitQuiz(View v) {
        int result = 0;
        if (checkQuestion1()) result++;
        if (checkQuestion2()) result++;
        if (checkQuestion3()) result++;
        if (checkQuestion4()) result++;
        if (checkQuestion5()) result++;
        String toastMsg = "You Answered " + result + "/5 Correctly!";
        Toast resultToast = Toast.makeText(this, toastMsg, Toast.LENGTH_LONG);
        resultToast.show();
    }
}