package base.lyj.com.myuibase.ui;

import android.os.Bundle;
import android.view.View;

import base.lyj.com.basemodule.base.BaseActivity;
import base.lyj.com.myuibase.R;
import base.lyj.com.myuibase.widget.switchbutton.SwitchButton;
import base.lyj.com.myuibase.widget.switchbutton.SwitchIconView;

public class SwitchButtonActivity extends BaseActivity {
    private    SwitchButton switchButton;
    private SwitchIconView switchIcon1;
    private View button1;
    @Override
    protected int getLayoutId() {
        return R.layout.activity_switch_button;
    }

    @Override
    protected void afterCreate(Bundle savedInstanceState) {
         switchButton = (SwitchButton) findViewById(R.id.switch_button);
        switchIcon1 = (SwitchIconView) findViewById(R.id.switchIconView1);
        button1 = findViewById(R.id.button1);

    }

    @Override
    protected void initData() {
        switchButton();
    }


    private void switchButton(){
        switchButton.setChecked(true);
        switchButton.isChecked();
        switchButton.toggle();     //switch state
        switchButton.toggle(true);//switch without animation
        switchButton.setShadowEffect(true);//disable shadow effect
        switchButton.setEnabled(true);//disable button
        switchButton.setEnableEffect(true);//disable the switch animation
        switchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
                //TODO do your job
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchIcon1.switchState();
            }
        });
    }









}
