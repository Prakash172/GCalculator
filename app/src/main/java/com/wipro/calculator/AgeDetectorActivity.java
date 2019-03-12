package com.wipro.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AgeDetectorActivity extends AppCompatActivity {

    @BindView(R.id.age_et)
    EditText ageEt;
    @BindView(R.id.click_btn)
    Button clickBtn;
    @BindView(R.id.imageView)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_detector);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.click_btn)
    public void onViewClicked() {
        if(!TextUtils.isEmpty(ageEt.getText().toString()))
        {
            int a=Integer.parseInt(ageEt.getText().toString());
            if(a<10)
            {
                imageView.setBackground(getResources().getDrawable(R.drawable.black_child));
            }
            else if(a>10&&a<30)
            {
                imageView.setBackground(getResources().getDrawable(R.drawable.girl));
            }
            else
            {
                imageView.setBackground(getResources().getDrawable(R.drawable.old));
            }
        }
    }
}
