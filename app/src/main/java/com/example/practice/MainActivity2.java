package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.*;
import java.io.*;

public class MainActivity2 extends AppCompatActivity {
    private Button b;
    //private TextView t;
    //private EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.button2);

        //  button.setOnClickListener(new View.OnClickListener() {
        //  @Override
        //  public void onClick(View view) {

        //    }
        //  });
    }
    public void yaar(View view){
        String p,q,r,x,y,z;
        //DataInputStream d=new DataInputStream(System.in);
        //System.out.println("\n your name = ");
        //a=editText.getText().toString();
        //System.out.print("\n your comrade's name = \n");
        // b=editText.getText().toString();
        EditText a= (EditText) findViewById(R.id.fetch);
        EditText b= (EditText) findViewById(R.id.fetch2);
        TextView txt = (TextView) findViewById(R.id.textv);
        int i=a.length();
        int o=b.length();
        int t=i-o;
        p=("*****Friends*****\n <<...........THE FOUNDATION OF ANY RELATIONSHIP IS FRIENDSHIP ...........>>\n<<..a.........EVERYTHING IS BASED ON THIS ONE TERM CALLED FRIENDSHIP..........>>");
        q=("*****Lovers *****\n <<............YOU DON'T FALL IN LOVE .....YOU RISE IN LOVE............>>");
        r=("*****Antipodals*****\n<<...........TOM AND JERRY COUPLE..........>>\n<<........... OPPOSITE POLES ATTRACTS MORE..........>>");
        x=("*****Marry each other*****\n<<............ MADE FOR EACH OTHER .............>>\n<<............HEAVEN'S BROUGHT YOU TOGETHER...........>> ");
        y=("*****Endearment******\n<<............IT LASTS UNTIL YOUR LAST BREATH...........>>");
        z=("*****Soulmates*****\n<<............CONSISTS ONLY ONE SOUL...........>>");
        //T IS IN - VALUES ...................
        if(t<1) // FIRST CONTROL STARTS
        {
            t=o-i;
            if(t==0)
                txt.setText("\n you are born into"+z);
            else if(t==1) //NESTED IF
                txt.setText("\n you are born into" +p);
            else if(t==2)
                txt.setText("\n you are born to" +x);
            else if(t==3)
                txt.setText("\n you are born into"+q);
            else if(t==4)
                txt.setText("\n you are born into" +p);
            else if(t==5)
                txt.setText("\n you are" +r);
            else if(t==6)
                txt.setText("\n you are born to" +x);
            else if(t==7)
                txt.setText("\n you are" +r);
            else if(t==8)
                txt.setText("\n you are born into" +q);
            else if(t==9)
                txt.setText("\n you are born as" +z);
            else if(t==10)
                txt.setText("\n you are in" +y);
            else
                txt.setText("\n name too long ");
        }
        // T IS IN + VALUES ....................
        else //ELSE STARTS
        {
            if(t==1) //NESTED IFS
                txt.setText("\n you are born into" +p);
            else if(t==2)
                txt.setText("\n you are born to" +x);
            else if(t==3)
                txt.setText("\n you are born into"+q);
            else if(t==4)
                txt.setText("\n you are born into" +p);
            else if(t==5)
                txt.setText("\n you are" +r);
            else if(t==6)
                txt.setText("\n you are born to" +x);
            else if(t==7)
                txt.setText("\n you are" +r);
            else if(t==8)
                txt.setText("\n you are born into" +q);
            else if(t==9)
                txt.setText("\n you are born as" +z);
            else if(t==10)
                txt.setText("\n you are in" +y);
            else
                txt.setText("\n  NOTE : enter appropriate name.large type of string is not supported");
        }

    }

}