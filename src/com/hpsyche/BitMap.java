package com.hpsyche;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author hpsyche
 * Create on 2019/12/26
 * 利用java实现位图
 */
public class BitMap {
    @Test
    public void test1() {
//        byte[] bytes = create(9);
//        add(bytes,5);
//        add(bytes,2);
//        add(bytes,1);
//        printSort(bytes);
//        Map<Character, Integer> map = new HashMap<>();
//        map.put("1","2");
//        map.put("3","4");
//        map.forEach((s, s2) -> {
//            System.out.println(s+"::"+s2);
//        });
//        String str = "hello world!";
//        char[] chars = str.toCharArray();
//        for (char c : chars) {
//            map.compute(c, (k, v) -> {
//                        if (v == null) {
//                            v = 1;
//                        } else {
//                            v += 1;
//                        }
//                        return v;
//                    }
//            );
//        }
//        map.forEach((k,v)->{
//            System.out.println(k+":"+v);
//        });
        Function<Integer,Integer> fun1=args->args*args;
        Integer apply = fun1.apply(5);
        System.out.println(apply);

        BiFunction<Integer,Integer,Integer> fun2=(args1,args2)->args1*args2;
        Integer apply1 = fun2.apply(7, 8);
        System.out.println(apply1);
    }


    public byte[] create(int n) {
        return new byte[getIndex(n) + 1];
    }

    /**
     * 标记指定数字（num）在bitmap中的值，标记其已经出现过<br/>
     * 将1左移position后，那个位置自然就是1，然后和以前的数据做|，这样，那个位置就替换成1了
     * 注意：当大于127时，即第一位变成1，此时为负数，但是位还是准确的。
     *
     * @param bit
     * @param i
     */
    private void add(byte[] bit, int i) {
        bit[getIndex(i)] |= 1 << getPosition(i);
    }

    /**
     * num%8得到在byte[index]的位置
     *
     * @param i
     * @return
     */
    private int getPosition(int i) {
        return i & 0x07;
    }

    /**
     * num/8得到byte[]的index
     *
     * @param n
     * @return
     */
    private int getIndex(int n) {
        return n >> 3;
    }

    /**
     * 判断指定数字num是否存在<br/>
     * 将1左移position后，那个位置自然就是1，然后和以前的数据做&，判断是否为0即可
     *
     * @param bits
     * @param num
     * @return
     */
    public boolean contains(byte[] bits, int num) {
        return (bits[getIndex(num)] & (1 << getPosition(num))) != 0;
    }

    /**
     * 从小到大输出位图中为1的位置。
     *
     * @param bits
     */
    public void printSort(byte[] bits) {
        for (int i = 0; i < bits.length; i++) {
            for (int j = 0; j < 8; j++) {
                if ((bits[i] & (1 << j)) != 0) {
                    System.out.println(i * 8 + j);
                }
            }
        }
    }
}
