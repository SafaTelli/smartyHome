package com.thinkit.challenge.smartyhome.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.thinkit.challenge.smartyhome.R;
import com.thinkit.challenge.smartyhome.utils.PreferencesUtils;
import com.thinkit.challenge.smartyhome.utils.Utils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {


    @BindView(R.id.txtDate)
    TextView mTextDate ;

    @BindView(R.id.txtName)
    TextView mTextName ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this) ;
        PreferencesUtils preferencesUtils = new PreferencesUtils(HomeActivity.this);
        mTextDate.setText(Utils.getCurrenttDate());
        mTextName.setText("Welcome, "+ preferencesUtils.getName()+"!");



    }
}
