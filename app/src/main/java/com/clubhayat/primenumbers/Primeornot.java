package com.clubhayat.primenumbers;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Primeornot extends AppCompatActivity {
    Calcul obj = new Calcul();
    int MYVALUE = 0;
    String yeapp="Your number is a prime number";
    String nop="Your number is not a prime number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeornot);
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
                    MYVALUE = Integer.parseInt(entree);
                    editText.setText("");

                    if(obj.premier(MYVALUE))
                    {
                        response.setText("'"+entree+"' is a prime number");
                    }
                    else
                    {
                        response.setText("'"+entree+"'is not a prime number");
                    }

                }

            }

        });
    }
}
