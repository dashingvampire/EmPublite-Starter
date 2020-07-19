package com.commonsware.empublite;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class EmPubLiteActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list_demo);
  }

  public void onClickButton(View view) {
    // do something useful here
  }
}
