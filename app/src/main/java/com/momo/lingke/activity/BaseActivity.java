package com.momo.lingke.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

import com.momo.lingke.utils.MLog;
import com.momo.lingke.utils.ToastUtil;

/**
 * 作者：momo on 2015/7/7 16:21
 * 邮箱：wangzhonglimomo@163.com
 */
public  class BaseActivity extends AppCompatActivity implements View.OnClickListener {
    protected final String		TAG	= getClass().getSimpleName();
    protected int				diaplayWidth;
    protected int				diaplayHeight;
    protected Context mContext;
    protected ActionBar actionBar;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        getSupportActionBar().hide();
        mContext = this;
        actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        WindowManager mWindowManager = getWindowManager();
        Display display = mWindowManager.getDefaultDisplay();
        diaplayWidth = display.getWidth();
        diaplayHeight = display.getHeight();
        MLog.i(TAG, "diaplayWidth" + diaplayWidth + "====" + "diaplayHeight" + diaplayHeight);
    }

    protected Activity getActivity() {
        return this;
    }
    /**
     * 描述：Toast提示文本.
     *
     * @param resId
     *            文本的资源ID
     */
    public void showToast(int resId) {
        ToastUtil.show(this, "" + this.getResources().getText(resId));
    }

    /**
     * 描述：Toast提示文本.
     *
     * @param text
     *            文本
     */
    public void showToast(String text) {
        ToastUtil.show(this, text);
    }
    /**
     * 通过Class跳转界面
     **/
    public void startActivity(Class<?> cls) {
        startActivity(cls, null);
    }

    /**
     * 含有Bundle通过Class跳转界面
     **/
    public void startActivity(Class<?> cls, Bundle bundle) {
        Intent intent = new Intent();
        intent.setClass(this, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {

    }
}
