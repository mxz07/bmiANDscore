package com.example.bmiandscore;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    TextView Result;
    EditText txt1;
    EditText txt2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Result = (TextView) findViewById(R.id.result);
        txt1 = (EditText)findViewById(R.id.height);
        txt2 = (EditText)findViewById(R.id.weight);
        btn = (Button)findViewById(R.id.btn);

        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        String t1=txt1.getText().toString();
        String t2=txt2.getText().toString();
        double x = Double.parseDouble(t1);
        double y = Double.parseDouble(t2);
        x=x/100;
        double r = y / (x*x);
        String bmi = String.format("%.2f",r);//两位小数
        if(x<=0 || y<=0) {
            Result.setText("值异常，不计算");
            return;
        }
        if(r<18.5){
            Result.setText("BMI="+bmi+",您的体重偏轻");
        }
        else  if(r<=22.9){
            Result.setText("BMI="+bmi+",您的体重正常");
        }
        else if(r<=24.9){
            Result.setText("BMI="+bmi+",您的体重偏重");
        }
        else if (r<=29.9){
            Result.setText("BMI="+bmi+",您的体重肥胖!!!");
        }
        else if (r<=40){
            Result.setText("BMI="+bmi+",您的体重过于肥胖!!!!");
        }
        else{
            Result.setText("BMI="+bmi+",您的体重严重肥胖!!!!!!!");
        }
    }
}

