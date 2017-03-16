package com.example.aelmahdaoui.tipcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    float percentage = 0;
    float tipTotal = 0;
    float finalBillAmount = 0;
    float totalBillAmount = 0;

    float DEFAULT_TIP_PERCENTAGE = 15;
    float REGULAR_TIP_PERCENTAGE = 10;
    float EXCELLENT_TIP_PERCENTAGE = 20;

    ImageButton ibRegularService = null;
    ImageButton ibGoodService = null;
    ImageButton ibExcellentService = null;
    TextView tvTipPercent = null;
    TextView tvTipAmount = null;
    TextView tvBillTotalAmount = null;
    EditText etBillAmount = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //        Initialize instances
        ibRegularService = (ImageButton) findViewById(R.id.ibRegularService);
        ibGoodService = (ImageButton) findViewById(R.id.ibGoodService);
        ibExcellentService = (ImageButton) findViewById(R.id.ibExcellentService);
        tvTipPercent = (TextView) findViewById(R.id.tvTipPercent);
        tvTipAmount = (TextView) findViewById(R.id.tvTipAmount);
        tvBillTotalAmount = (TextView) findViewById(R.id.tvBillTotalAmount);
        etBillAmount = (EditText) findViewById(R.id.etBillAmount);

        setTipValues();

        ibRegularService.setOnClickListener(view -> OnClick(view));
        ibGoodService.setOnClickListener(view -> OnClick(view));
        ibExcellentService.setOnClickListener(view->OnClick(view));

    }


    private void setTipValues() {
        tvTipAmount.setText(getString(R.string.main_msg_tiptotal, tipTotal));
        tvTipPercent.setText(getString(R.string.main_msg_tippercent, percentage));
        tvBillTotalAmount.setText(getString(R.string.main_msg_billtotalresult, finalBillAmount));
    }


    public void OnClick(View view) {
        switch (view.getId()) {
            case R.id.ibRegularService:
                percentage = REGULAR_TIP_PERCENTAGE;
                OnTextChanged();
                break;
            case R.id.ibGoodService:
                percentage = DEFAULT_TIP_PERCENTAGE;
                OnTextChanged();
                break;
            case R.id.ibExcellentService:
                percentage = EXCELLENT_TIP_PERCENTAGE;
                OnTextChanged();
                break;
        }
    }

    public void OnTextChanged() {
        calculateFinalBill();
        setTipValues();
    }

    public void calculateFinalBill() {
        if (percentage == 0) {
            percentage = DEFAULT_TIP_PERCENTAGE;
        }

        if (!etBillAmount.getText().toString().equals("") && !etBillAmount.getText().toString().equals(".")) {
            totalBillAmount = Float.valueOf(etBillAmount.getText().toString());
        } else {
            totalBillAmount = 0;
        }

        tipTotal = (totalBillAmount * percentage) / 100;
        finalBillAmount = totalBillAmount + tipTotal;
    }
}
