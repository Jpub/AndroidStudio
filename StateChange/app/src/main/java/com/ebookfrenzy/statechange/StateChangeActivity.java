package com.ebookfrenzy.statechange;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class StateChangeActivity extends Activity {

    private static final String TAG = "ebookfrenzy.StateChange";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_change);
        Log.i(TAG, "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");

        final EditText textBox =
                (EditText) findViewById(R.id.editText);
        CharSequence userText = textBox.getText();
        outState.putCharSequence("savedText", userText);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");

        final EditText textBox =
                (EditText) findViewById(R.id.editText);

        CharSequence userText =
                savedInstanceState.getCharSequence("savedText");

        textBox.setText(userText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // 메뉴를 인플레이트하여 메뉴 항목들이 있으면 액션 바에 추가한다.
        getMenuInflater().inflate(R.menu.menu_state_change, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // 클릭하여 선택된 액션 바 항목을 여기에서 처리한다.
        // AndroidManifest.xml에 부모 액티비티를 명시하는 한
        // 액션 바는 홈(Home)/업(Up) 버튼의 클릭을 자동으로 처리한다.
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
