package com.clubhayat.primenumbers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image = (ImageView) findViewById(R.id.primeornot);

        image.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Primeornot.class);
                startActivity(myIntent);

            }

        });
        ImageView image1 = (ImageView) findViewById(R.id.divisors);

        image1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Divisors.class);
                startActivity(myIntent);

            }

        });
        ImageView image2 = (ImageView) findViewById(R.id.primes);

        image2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Primes.class);
                startActivity(myIntent);

            }

        });
        ImageView image3 = (ImageView) findViewById(R.id.betweenthem);
        image3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Betweenthem.class);
                startActivity(myIntent);

            }

        });
        ImageView image4 = (ImageView) findViewById(R.id.encypt);
        image4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Encrypt.class);
                startActivity(myIntent);

            }

        });
        ImageView image5 = (ImageView) findViewById(R.id.decrypt);
        image5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent myIntent = new Intent(MainActivity.this, Decrypt.class);
                startActivity(myIntent);

            }

        });
    }
}
