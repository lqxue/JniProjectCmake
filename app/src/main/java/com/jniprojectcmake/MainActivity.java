package com.jniprojectcmake;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvShowContent = findViewById(R.id.tvShowContent);
        tvShowContent.setText(Util.print());
    }
}
