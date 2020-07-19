package com.commonsware.empublite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EmPubLiteActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
  }

  public void onClickButton0(View view) {
    Intent intent = new Intent(EmPubLiteActivity.this, ListActivityDemo.class);
    startActivity(intent);
  }

  public void onClickButton1(View view) {
  }

  public void onClickButton2(View view) {
  }

  public void onClickButton3(View view) {
  }

  public void onClickButton4(View view) {
  }

  public void onClickButton5(View view) {
  }
}
