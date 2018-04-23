package com.study.rocky.bridgedemo.simple2;

import android.util.Log;

/**
 * Created by Administrator on 2018/4/23 0023.
 */

public class MiddleCoffee extends Coffee {
    public MiddleCoffee(AddIce additive) {
        super(additive);
    }

    @Override
    public void drinkCoffee() {
        Log.i("main", "中杯" + getAdditive().doSth() + "咖啡");

    }
}
