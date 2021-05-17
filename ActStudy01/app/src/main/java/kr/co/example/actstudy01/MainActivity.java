package kr.co.example.actstudy01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAddClick( View view ){
        EditText editTxt01 = (EditText)findViewById(R.id.editText01);
        EditText editTxt02 = (EditText)findViewById(R.id.ediText02);
        TextView txtresult = (TextView)findViewById(R.id.txtResult);
        int iResult;
        iResult = Integer.parseInt(editTxt01.getText().toString()) + Integer.parseInt(editTxt02.getText().toString());
        txtresult.setText(Integer.toString(iResult));
    }

    public void onSubClick(View view){
        EditText editTxt01 = (EditText)findViewById(R.id.editText01);
        EditText editTxt02 = (EditText)findViewById(R.id.ediText02);
        TextView txtresult = (TextView)findViewById(R.id.txtResult);
        int iResult;
        iResult = Integer.parseInt(editTxt01.getText().toString()) - Integer.parseInt(editTxt02.getText().toString());
        txtresult.setText(Integer.toString(iResult));
    }

    public void onMultiClick(View view){
        EditText editText01 = (EditText)findViewById(R.id.editText01);
        EditText editText02 = (EditText)findViewById(R.id.ediText02);
        TextView txtView = (TextView)findViewById(R.id.txtResult);
        int iResult;
        iResult = Integer.parseInt(editText01.getText().toString()) * Integer.parseInt(editText02.getText().toString());
        txtView.setText(Integer.toString(iResult));
    }

    public void onDivideClick(View view){
        EditText editText01 = (EditText)findViewById(R.id.editText01);
        EditText editText02 = (EditText)findViewById(R.id.ediText02);
        TextView txtView = (TextView)findViewById(R.id.txtResult);
        int iResult;
        iResult = Integer.parseInt(editText01.getText().toString()) / Integer.parseInt(editText02.getText().toString());
        txtView.setText(Integer.toString(iResult));
    }
}