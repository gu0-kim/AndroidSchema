package com.gu.devel.androidschema;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    FragmentManager fm = getSupportFragmentManager();
    MainView fragment = (MainView) fm.findFragmentById(R.id.content_layout);
    if (fragment == null) {
      fragment = MainView.newInstance("1");
      fm.beginTransaction().add(R.id.content_layout, fragment).commit();
    }
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
  }
}
