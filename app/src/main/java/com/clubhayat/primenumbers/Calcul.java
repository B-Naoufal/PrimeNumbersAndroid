package com.clubhayat.primenumbers;

/**
 * Created by Naoufal on 4/25/2017.
 */

public class Calcul {
        public boolean premier(int n){
            boolean estpr=false;
            if(n==0 || n==1){
                estpr=false;}
            if(n==2)
                {
                    estpr=true;
                }
            else {
                for(int i=2;i<n; i++){
                    if (n%i==0){
                        estpr=false;
                        break;}
                    else if(i==n-1)
                        estpr=true;
                }
            }
            return estpr;
        }
        public int  pgcd   (int m,int n)
        {
            int r=0;
            while(n!=0)
            {
                r=m%n;
                m=n;
                n=r;
            }
            return m;
        }
    }



