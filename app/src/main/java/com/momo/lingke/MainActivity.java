package com.momo.lingke;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.momo.lingke.view.CircleMenuLayout;


public class MainActivity extends AppCompatActivity {
    private CircleMenuLayout mCircleMenuLayout;

    private String[] mItemTexts = new String[]{"添加 ", "添加", "电话",
            "信息", "联系人", "邮件"};
    private int[] mItemImgs = new int[]{R.mipmap.mobile_icon,
            R.mipmap.mobile_icon, R.mipmap.mobile_icon,
            R.mipmap.mms_icon, R.mipmap.contacts_icon,
            R.mipmap.message_icon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        mCircleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_menulayout);
        mCircleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemTexts);
        mCircleMenuLayout.setOnMenuItemClickListener(new CircleMenuLayout.OnMenuItemClickListener() {
            @Override
            public void itemClick(View view, int pos) {
                Toast.makeText(MainActivity.this, mItemTexts[pos],
                        Toast.LENGTH_SHORT).show();
            }
            @Override
            public void itemCenterClick(View view) {
                Toast.makeText(MainActivity.this,
                        "you can do something just like ccb  ",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
