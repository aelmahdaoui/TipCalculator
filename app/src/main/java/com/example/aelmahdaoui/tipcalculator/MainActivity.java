package com.example.aelmahdaoui.tipcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    float percentage = 0;
    float tipTotal = 0;
    float finalBillAmount = 0;

//    @BindView(R2.id.etBillAmount)
//    EditText etBillAmount;
//    @BindView(R2.id.tvTipPercent)
//    TextView tvTipPercent;
//    @BindView(R2.id.tvTipAmount)
//    TextView tvTipAmount;
//    @BindView(R2.id.tvBillTotalAmount)
//    TextView tvBillTotalAmount;
//@BindView(R2.id.etBillAmount) EditText etBillAmount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        butterknife.ButterKnife.bind(this);
    }

//    @OnClick({R2.id.ibRegularService, R2.id.ibGoodService, R2.id.ibExcellentService})
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R2.id.ibRegularService:
//                break;
//            case R2.id.ibGoodService:
//                break;
//            case R2.id.ibExcellentService:
//                break;
//        }
//    }
}
