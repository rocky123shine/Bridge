package com.study.rocky.bridgedemo.simple2;

/**
 * Created by Administrator on 2018/4/23 0023.
 */

//抽象Coffee
public abstract class Coffee {
    //Coffee 可以添加东西 这里我们持有添加物 的对象
    private AddIce addIce;
    public Coffee(AddIce additive){
        this.addIce = additive;
    }

    public AddIce getAdditive() {
        return addIce;
    }

    //做和咖啡相关的动作
    public abstract void drinkCoffee();
}
