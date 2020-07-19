package com.commonsware.empublite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmPubLiteActivity extends Activity implements View.OnClickListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);

    Button button0 = (Button) findViewById(R.id.button0);
    Button button1 = (Button) findViewById(R.id.button1);
    button0.setOnClickListener(this);
    button1.setOnClickListener(this);
  }

  public void onClick(View view){
    switch(view.getId()){
      case R.id.button0:
        Intent intent0 = new Intent(this, ListActivityDemo.class);
        startActivity(intent0);
        break;
      case R.id.button1:
        Intent intent1 = new Intent(this, FormTableLayout.class);
        startActivity(intent1);
        break;
    }
  }

  /*public void onClickButton0(View view) {
    Intent intent = new Intent(EmPubLiteActivity.this, ListActivityDemo.class);
    startActivity(intent);
  }

  public void onClickButton1(View view) {
    Intent intent = new Intent(EmPubLiteActivity.this, FormTableLayout.class);
    startActivity(intent);
  }

  public void onClickButton2(View view) {
  }

  public void onClickButton3(View view) {
  }

  public void onClickButton4(View view) {
  }

  public void onClickButton5(View view) {
  }*/

}
