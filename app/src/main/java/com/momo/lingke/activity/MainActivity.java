package com.momo.lingke.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.momo.lingke.R;
import com.momo.lingke.view.CircleMenuLayout;


public class MainActivity extends BaseActivity {
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
        mCircleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_menulayout);
        mCircleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemTexts);
        mCircleMenuLayout.setOnMenuItemClickListener(new CircleMenuLayout.OnMenuItemClickListener() {
            @Override
            public void itemClick(View view, int pos) {
                action(pos);
            }

            @Override
            public void itemCenterClick(View view) {
                Toast.makeText(MainActivity.this,
                        "you can do something  ",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void action(int pos) {
        switch (pos) {
            case 0:
                Toast.makeText(this, "pos" + pos, Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "pos" + pos, Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "pos" + pos, Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "pos" + pos, Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this, "pos" + pos, Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(this, "pos" + pos, Toast.LENGTH_SHORT).show();
                break;
        }
    }

    /**
     * 主界面
     *
     * @param view
     */
    public void clickMain(View view) {
        Toast.makeText(this, "主界面", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, LauncherActivity.class);
        startActivity(intent);
    }

    /**
     * 点击设置
     *
     * @param view
     */
    public void clickSetting(View view) {
        Toast.makeText(this, "设置吗", Toast.LENGTH_SHORT).show();
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
