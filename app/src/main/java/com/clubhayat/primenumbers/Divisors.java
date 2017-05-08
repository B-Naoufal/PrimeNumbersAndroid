package com.clubhayat.primenumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Divisors extends AppCompatActivity {
    int MYVALUE = 0;
    String resp = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisors);
        ImageView yeap = (ImageView) findViewById(R.id.yeap);
        yeap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                String entree = editText.getText().toString();
                TextView response = (TextView)findViewById(R.id.response);
                if (entree.matches("")) {
                    response.setText("You must enter a number");
                }
                else
                {
                    MYVALUE = Integer.parseInt(editText.getText().toString());
                    editText.setText("");
                    response.setMovementMethod(new ScrollingMovementMethod());
                    if (MYVALUE==0)
                    {
                        response.setText("All integers divide zero ");
                    }
                    else
                    {
                        for (int d=2;d<=MYVALUE;d++)
                        {
                            if(MYVALUE%d==0)
                            {
                                resp=resp+','+d;
                                response.setText(resp);
                            }
                        }
                        resp="1";

                    }
                }
            }

        });
    }
}
