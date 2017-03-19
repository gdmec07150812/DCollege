package com.gdmec.jacky.dcollege;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends FragmentActivity {
    private RadioGroup radioGroup;
    private RadioButton toolBar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        getSupportFragmentManager().beginTransaction().add(R.id.mainFragment, new ChatFragment()).commit();
        radioGroup = (RadioGroup) findViewById(R.id.toolBar);
        toolBar1 = (RadioButton) findViewById(R.id.toolBar1);
        toolBar1.setChecked(true);
        setListener();
    }

    protected void setListener(){
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.toolBar1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment, new ChatFragment()).commit();
                        break;
                    case R.id.toolBar2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment, new ToolsFragment()).commit();
                        break;
                    case R.id.toolBar3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.mainFragment, new SettingFragment()).commit();
                        break;
                }
            }
        });
    }

}
