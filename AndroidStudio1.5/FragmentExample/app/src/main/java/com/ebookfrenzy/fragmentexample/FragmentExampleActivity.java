package com.ebookfrenzy.fragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentExampleActivity extends AppCompatActivity
        implements ToolbarFragment.ToolbarListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_example);
    }

    public void onButtonClick(int fontsize, String text) {
        TextFragment textFragment =
                (TextFragment)
                        getFragmentManager().findFragmentById(R.id.text_fragment);

        textFragment.changeTextProperties(fontsize, text);
    }
}
