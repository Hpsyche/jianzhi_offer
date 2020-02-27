package com.hpsyche.Jianzhi;

/**
 * @author hpsyche
 * Create on 2020/2/27
 * 是否是有效的浮点数
 */
public class isNumeric {
    public boolean isNumeric(char[] str) {
        try {
            double re = Double.parseDouble(new String(str));
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
