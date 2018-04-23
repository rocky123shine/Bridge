package com.study.rocky.bridgedemo.simple1;

/**
 * Created by Administrator on 2018/4/23 0023.
 */
public class Coffee {

    //由于杯型固定 我们可以使用枚举
    public enum GlassType {
        BIG("大杯"), MIDDLE("中杯"), SMALL("小杯");
        private String glass_type;
        GlassType(String glassType) {
            glass_type = glassType;
        }

        public String getGlass_type() {
            return glass_type;
        }
    }

    //同理 加冰不加冰 也用枚举

    public enum AddIceType{
        ADDICE("加冰"),NOICE("不加冰");
        private String ice_type;
        AddIceType(String iceType) {
            ice_type = iceType;
        }

        public String getIce_type() {
            return ice_type;
        }
    }

    public String drinkCoffee(GlassType glassType,AddIceType iceType){
        StringBuilder builder = new StringBuilder("给我一杯");
        builder.append(glassType.getGlass_type());
        builder.append(iceType.getIce_type());
        /**
         * 在这里根据咖啡类型 和添加物可以做不同个操作
         * 这里不处理
         */

        return builder.toString();
    }
}
