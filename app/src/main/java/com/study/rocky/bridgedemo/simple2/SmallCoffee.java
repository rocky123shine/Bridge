package com.study.rocky.bridgedemo.simple2;

import android.util.Log;

/**
 * Created by Administrator on 2018/4/23 0023.
 */

public class SmallCoffee extends Coffee {
    public SmallCoffee(AddIce additive) {
        super(additive);
    }

    @Override
    public void drinkCoffee() {
        Log.i("main", "小杯" + getAdditive().doSth() + "咖啡");

    }
}
