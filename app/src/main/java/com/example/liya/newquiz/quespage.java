package com.example.liya.newquiz;

import android.os.Bundle;
import android.content.Intent;
import android.graphics.Typeface;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;




/**
 * Created by liya on 2/19/2017.
 */

public class quespage extends AppCompatActivity {
   public  int quizScore=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);


        Button gotoButton = (Button) findViewById(R.id.button2);


        gotoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView tv = (TextView) findViewById(R.id.identifyme);
                Typeface face = Typeface.createFromAsset(getAssets(),
                        "fonts/diamonddust.ttf");
                tv.setTypeface(face);
                TextView tv4q2 = (TextView) findViewById(R.id.where);
                Typeface face2 = Typeface.createFromAsset(getAssets(),
                        "fonts/diamonddust.ttf");
                tv.setTypeface(face);

                TextView tv4q3 = (TextView) findViewById(R.id.caption);
                Typeface face3 = Typeface.createFromAsset(getAssets(),
                        "fonts/diamonddust.ttf");
                tv.setTypeface(face);


                RadioGroup rbGroup2 = (RadioGroup) findViewById(R.id.ques1);
                int selectedId2 = rbGroup2.getCheckedRadioButtonId();
                if (selectedId2 != -1) {
                    RadioButton selectedRadioButton2 = (RadioButton) findViewById(selectedId2);
                    String radioButtonText2 = selectedRadioButton2.getText().toString();
                    if ((radioButtonText2).equals(getString(R.string.q1ans))) {
                        quizScore = quizScore + 1;
                    }
                }

                CheckBox qAnswer1 = (CheckBox) findViewById(R.id.opa2);
                boolean isChecked1 = qAnswer1.isChecked();
                CheckBox qAnswer2 = (CheckBox) findViewById(R.id.opb2);
                boolean isChecked2 = qAnswer2.isChecked();
                CheckBox qAnswer3 = (CheckBox) findViewById(R.id.opc2);
                boolean isChecked3 = qAnswer3.isChecked();
                if (isChecked1 && !isChecked2 && isChecked3) {
                    quizScore = quizScore + 1;
                }

                EditText myEditText = (EditText)findViewById(R.id.imgdes);
                String text = myEditText.getText().toString();
                if((text).equals("Nike")||(text).equals("nike")){
                    quizScore = quizScore + 1;
                }

                RadioGroup rbGroup4 = (RadioGroup) findViewById(R.id.ques4);
                int selectedId4 = rbGroup4.getCheckedRadioButtonId();
                if (selectedId4 != -1) {
                    RadioButton selectedRadioButton4 = (RadioButton) findViewById(selectedId4);
                    String radioButtonText4 = selectedRadioButton4.getText().toString();
                    if ((radioButtonText4).equals(getString(R.string.q4ans))) {
                        quizScore = quizScore + 1;
                    }
                }

                RadioGroup rbGroup5 = (RadioGroup) findViewById(R.id.ques5);
                int selectedId5 = rbGroup5.getCheckedRadioButtonId();
                if (selectedId5 != -1) {
                    RadioButton selectedRadioButton5 = (RadioButton) findViewById(selectedId5);
                    String radioButtonText5 = selectedRadioButton5.getText().toString();
                    if ((radioButtonText5).equals(getString(R.string.q5ans))) {
                        quizScore = quizScore + 1;
                    }
                }
                String tmpquiz = String.valueOf(quizScore);

               Intent intent=new Intent(quespage.this,finalactivity.class);

                Bundle extras = new Bundle();
                extras.putString("quizScore", tmpquiz);
                intent.putExtras(extras);
                startActivity(intent);

            }
        });

    }
}
