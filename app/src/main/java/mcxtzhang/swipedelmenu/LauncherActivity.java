package mcxtzhang.swipedelmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import mcxtzhang.listswipemenudemo.R;
import mcxtzhang.swipedelmenu.FullDemo.FullDelDemoActivity;

public class LauncherActivity extends AppCompatActivity {

    private boolean ios = true;
    private boolean leftSwipe = true;
    private boolean swipeEnable = true;

    private TextView mTv_ios;
    private TextView mTv_leftSwipe;
    private TextView mTv_swipeEnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        mTv_ios = (TextView) findViewById(R.id.tv_ios);
        mTv_leftSwipe = (TextView) findViewById(R.id.tv_leftSwipe);
        mTv_swipeEnable = (TextView) findViewById(R.id.tv_swipeEnable);
        mTv_ios.setText(String.valueOf(ios));
        mTv_leftSwipe.setText(String.valueOf(leftSwipe));
        mTv_swipeEnable.setText(String.valueOf(swipeEnable));


        setClick();

        setMenu();
    }

    private void setClick() {
        findViewById(R.id.rv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LauncherActivity.this, FullDelDemoActivity.class);
                Bundle bundle = new Bundle();
                boolean[] booleen = {ios, leftSwipe, swipeEnable};
                bundle.putBooleanArray("tag", booleen);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        findViewById(R.id.lv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LauncherActivity.this, ListViewDelDemoActivity.class);
                Bundle bundle = new Bundle();
                boolean[] booleen = {ios, leftSwipe, swipeEnable};
                bundle.putBooleanArray("tag", booleen);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        findViewById(R.id.ll).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LauncherActivity.this, LinearLayoutDelDemoActivity.class);
                Bundle bundle = new Bundle();
                boolean[] booleen = {ios, leftSwipe, swipeEnable};
                bundle.putBooleanArray("tag", booleen);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

    private void setMenu() {
        findViewById(R.id.btn_ios).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ios = !ios;
                mTv_ios.setText(String.valueOf(ios));
            }
        });

        findViewById(R.id.btn_leftSwipe).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftSwipe = !leftSwipe;
                mTv_leftSwipe.setText(String.valueOf(leftSwipe));
            }
        });

        findViewById(R.id.btn_swipeEnable).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swipeEnable = !swipeEnable;
                mTv_swipeEnable.setText(String.valueOf(swipeEnable));
            }
        });
    }
}
