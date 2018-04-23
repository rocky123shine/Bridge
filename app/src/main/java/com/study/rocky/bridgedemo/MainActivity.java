package com.study.rocky.bridgedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.study.rocky.bridgedemo.simple1.Coffee;
import com.study.rocky.bridgedemo.simple2.BigCoffee;
import com.study.rocky.bridgedemo.simple2.NoIce;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //开发案例
        //场景：客人去店买咖啡，咖啡有大中小杯，咖啡中可加东西和不加东西
        //simple1 是最直接的实现

//        Coffee coffee = new Coffee();
//        Log.d("MainActivity", coffee.drinkCoffee(Coffee.GlassType.BIG, Coffee.AddIceType.ADDICE));

        //simple1 是最直接的实现 现在我们使用桥接模式实现
        //首先 Coffee 是抽象，添加物AddIce是抽象，添加无加进 Coffee中
        //然后具体子类实现 如大中小杯实现 Coffee接口，加冰不加冰 实现AddIce接口

        //测试simple2
        BigCoffee coffee = new BigCoffee(new NoIce());
        coffee.drinkCoffee();
    }
}
