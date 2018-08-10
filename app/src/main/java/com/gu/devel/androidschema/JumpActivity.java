package com.gu.devel.androidschema;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class JumpActivity extends AppCompatActivity {
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_jump);
    FragmentManager fm = getSupportFragmentManager();
    JumpView fragment = (JumpView) fm.findFragmentById(R.id.content_layout);
    if (fragment == null) {
      fragment = JumpView.newInstance("1");
      fm.beginTransaction().add(R.id.content_layout, fragment).commit();
    }
  }
}
