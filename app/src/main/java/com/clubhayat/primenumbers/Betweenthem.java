package com.clubhayat.primenumbers;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Betweenthem extends AppCompatActivity {
    int FVALUE = 0;
    int SVALUE = 0;
    int PGCD = 0 ;
    Calcul obj = new Calcul();
    public void hideKeyboard(View view)
        {
        InputMethodManager inputMethodManager =(InputMethodManager)getSystemService(Activity.INPUT_METHOD_SERVICE);
        inputMethodManager.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_betweenthem);
        ImageView yeap = (ImageView) findViewById(R.id.yeap);
        yeap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView response = (TextView)findViewById(R.id.response);
                EditText editText = (EditText) findViewById(R.id.editText);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (!hasFocus) {
                            hideKeyboard(v);
                        }
                    }
                });
                editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public void onFocusChange(View v, boolean hasFocus) {
                        if (!hasFocus) {
                            hideKeyboard(v);
                        }
                    }
                });
                String entree1=editText.getText().toString();
                String entree2=editText2.getText().toString();
                if (entree1.matches("") || entree2.matches(""))
                    {
                        response.setText("You must enter two numbers");
                    }
                if (!(entree1.matches("") || entree2.matches("")))
                {
                    FVALUE= Integer.parseInt(entree1);
                    SVALUE= Integer.parseInt(entree2);
                    PGCD = obj.pgcd(FVALUE,SVALUE);
                    editText.setText("");
                    editText2.setText("");
                    if(PGCD==1)
                    {
                        response.setText("The numbers are prime between them");
                    }
                    else
                    {
                        response.setText("The numbers are not prime between them");
                    }

                }
            }

        });
    }
}
