package com.example.bmiandscore;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class scoreActivity extends AppCompatActivity  implements View.OnClickListener {
    Button btna_1,btna_2,btna_3,btnb_1,btnb_2,btnb_3,reset;
    TextView score_a,score_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        btna_1=findViewById(R.id.TAbut3);
        btna_2=findViewById(R.id.TAbut2);
        btna_3=findViewById(R.id.TAbut1);
        btnb_1=findViewById(R.id.TBbut3);
        btnb_2=findViewById(R.id.TBbut2);
        btnb_3=findViewById(R.id.TBbut1);
        score_a=findViewById(R.id.score1);
        score_b=findViewById(R.id.score2);
        reset=findViewById(R.id.reset);

        btna_1.setOnClickListener(this);
        btna_2.setOnClickListener(this);
        btna_3.setOnClickListener(this);
        btnb_1.setOnClickListener(this);
        btnb_2.setOnClickListener(this);
        btnb_3.setOnClickListener(this);
        reset.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        String t1=score_a.getText().toString();
        String t2=score_b.getText().toString();
        double scoreA = Double.parseDouble(t1);
        double scoreB = Double.parseDouble(t2);
        switch (v.getId()){
            case R.id.TAbut3:
                score_a.setText(Integer.toString((int) (scoreA+3.00)));
                break;
            case R.id.TAbut2:
                score_a.setText(Integer.toString((int) (scoreA+2.00)));
                break;
            case R.id.TAbut1:
                score_a.setText(Integer.toString((int) (scoreA+1.00)));
                break;
            case R.id.TBbut3:
                score_b.setText(Integer.toString((int) (scoreB+3.00)));
                break;
            case R.id.TBbut2:
                score_b.setText(Integer.toString((int) (scoreB+2.00)));
                break;
            case  R.id.TBbut1:
                score_b.setText(Integer.toString((int) (scoreB+1.00)));
                break;
            case  R.id.reset:
                score_a.setText(Integer.toString(0));
                score_b.setText(Integer.toString(0));
                break;
            default:
                break;
        }
    }
}