package com.gu.devel.androidschema;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class JumpView extends Fragment {
  private Unbinder mUnbinder;
  private static final String TAG = JumpView.class.getSimpleName();

  public static JumpView newInstance(String tag) {
    return new JumpView();
  }

  @Nullable
  @Override
  public View onCreateView(
      @NonNull LayoutInflater inflater,
      @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    LogUtil.log(TAG, "onCreateView");
    View view = inflater.inflate(R.layout.jump_fragment, container, false);
    mUnbinder = ButterKnife.bind(this, view);
    return view;
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
    mUnbinder.unbind();
    LogUtil.log(TAG, "onDestroyView");
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    LogUtil.log(TAG, "onDestroy");
  }

  @OnClick(R.id.comeback)
  public void onClickComeback() {
    Intent intent = new Intent();
    intent.setData(Uri.parse("artist://first/enter"));
    startActivity(intent);
  }
}
