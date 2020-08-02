package com.thinkit.challenge.smartyhome.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.thinkit.challenge.smartyhome.R;
import com.thinkit.challenge.smartyhome.utils.PreferencesUtils;
import com.thinkit.challenge.smartyhome.utils.Utils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.editname)
    EditText mEditName ;

    @BindView(R.id.btnNexte)
    Button mBtnNext ;

    PreferencesUtils preferencesUtils ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        preferencesUtils = new PreferencesUtils(MainActivity.this);
        if(!preferencesUtils.getName().equals(""))
        {
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        }
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this) ;
    }


    @OnClick(R.id.btnNexte)
    void saveName()
    {
        String name = mEditName.getText().toString();
        if( name.equals(""))
            mEditName.setError(getResources().getString(R.string.error_name));
        else {
            preferencesUtils.putName(name);
            Utils.switchActivity(MainActivity.this,HomeActivity.class);

        }
    }

}
