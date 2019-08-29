package com.example.hygormmnunes.rolardedados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private ImageView imageView;
    private TextView textView;
    private ImageView dado2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.resultadonum);
        imageView = findViewById(R.id.Resultado);
        dado2 = findViewById(R.id.dado2);

        textView.setText("");
    }

   public void gerarnumero(View  view) {

     Random random = new Random();

        Integer num = (random.nextInt(6))+1;

       Random random2 = new Random();

       Integer num2 = (random2.nextInt(6))+1;

       Integer resultado = num + num2;

       String resultadosoma = resultado.toString();


       textView.setText(resultadosoma);



        if(num == 1) {
            imageView.setImageResource(R.drawable.dado1);

        }
        else if(num == 2) {
            imageView.setImageResource(R.drawable.dado2);

        }
        else if(num == 3){
            imageView.setImageResource(R.drawable.dado3);
        }
        else if(num == 4) {
            imageView.setImageResource(R.drawable.dado4);
        }
         else if (num == 5){
            imageView.setImageResource(R.drawable.dado5);
        }
        else if (num == 6){
            imageView.setImageResource(R.drawable.dado6);

        }

        if(num2 == 1) {
           dado2.setImageResource(R.drawable.dado1);

       }
       else if(num2 == 2) {
           dado2.setImageResource(R.drawable.dado2);

       }
       else if(num2 == 3){
            dado2.setImageResource(R.drawable.dado3);
       }
       else if(num2 == 4) {
            dado2.setImageResource(R.drawable.dado4);
       }
       else if (num2 == 5){
            dado2.setImageResource(R.drawable.dado5);
       }
       else if (num2 == 6){
            dado2.setImageResource(R.drawable.dado6);
       }


   }

}
