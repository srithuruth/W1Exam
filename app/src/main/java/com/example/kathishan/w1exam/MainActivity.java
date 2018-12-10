package com.example.kathishan.w1exam;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final Object View = v ;
    private final String TAG = "MainActivity";
    private EditText etWord;
    private TextView tvDisp;
    private Button btnDisp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addListnerOnButton();
    }

    public void addListnerOnButton(){
        etWord = findViewById(R.id.etWord);
        tvDisp = findViewById(R.id.tvDisplay);
        btnDisp = findViewById(R.id.btnPaladrome);
    }


tvDisp.setOnClickListner( new View.onClickListener){

        public void onClivk(View v){
            String etWord.getText().toString();
            answer.setText(etWord);
            Toast.makeText(getApplicationContext(), String.valueOf(etword, Toast.LENGTH_LONG.show()));
    });







    btnDisp.setOnClickListener(new OnClickListener() {

        public void onClick(View v) {
            num1 = Double.parseDouble(firstNumber.getText().toString());
            num2 = Double.parseDouble(secondNumber.getText().toString());
            sum = num1 + num2;


            tvDisp.setText(Double.toString(results));

        }
    });

    private void doDisplay(){

        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        String term = query.getText().toString();
        intent.putExtra(SearchManager.QUERY, term);
        startActivity(intent);
    }

}
