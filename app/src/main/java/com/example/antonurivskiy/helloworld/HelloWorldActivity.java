package com.example.antonurivskiy.helloworld;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class HelloWorldActivity extends Activity {
    Fragment TestFragment = null;
    TextView tvHelloWorld = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String TEST_TAG = "test";
        setContentView(R.layout.activity_hello_world);
        Log.d(TEST_TAG, "hello world!!!!");
        tvHelloWorld = (TextView)findViewById(R.id.hello_world_tv);
        tvHelloWorld.setText("Test !!!!!!!");
        Toast.makeText(getApplicationContext(),"Hello from toast!!", Toast.LENGTH_SHORT).show();
        TestFragment = new TestFragment();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello_world, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        FragmentTransaction fTrans = getFragmentManager().beginTransaction();
        switch(item.getItemId()){
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_open_fragment:
                fTrans.add(R.id.content_ll,TestFragment);
                break;
        }
        fTrans.commit();
        return super.onOptionsItemSelected(item);
    }
}
