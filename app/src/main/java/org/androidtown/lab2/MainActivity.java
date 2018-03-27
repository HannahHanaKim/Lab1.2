package org.androidtown.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText edit_name;
    public Button btn_print;
    public Button btn_clear;
    public TextView view_print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init() {  //create object with a relevant id
        btn_print = (Button)findViewById(R.id.btnPrint);
        btn_clear = (Button)findViewById(R.id.btnClear);
        edit_name = (EditText)findViewById(R.id.ediText);
        view_print = (TextView)findViewById(R.id.print);

        btn_print.setOnClickListener(new View.OnClickListener() { //print button action listener --> the text will be printed
            @Override
            public void onClick(View view) {
                printClicked(view);
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() { //clear button action listener -> the edit text will be cleared
            @Override
            public void onClick(View view) {
                clearClicked(view);
            }
        });
    }

    public void clearClicked(View v) {
        edit_name.setText(""); //clear the edit text
        view_print.setText("contents"); //initialize to the initial state
    }

    public void printClicked(View v) {
        String text = " ";

        text = edit_name.getText().toString();
        view_print.setText(text);  //print the string that I entered --> use 'setText' method, no need to declare in xml file.
    }
}
