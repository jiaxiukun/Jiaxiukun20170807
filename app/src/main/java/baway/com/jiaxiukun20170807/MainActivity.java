package baway.com.jiaxiukun20170807;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MyButton button;
    private MyTextView myText;
    private MyButton2 button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取资源ID丰富
        initView();
        //操作控件的方法
        initData();
    }

    private void initData() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "点击了返回", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "点击了更多", Toast.LENGTH_SHORT).show();
            }
        });
        myText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "点击了自定义标题", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        button = (MyButton) findViewById(R.id.btn_back);
        myText = (MyTextView) findViewById(R.id.text_title);
        button2 = (MyButton2) findViewById(R.id.btn_more);
    }
}
