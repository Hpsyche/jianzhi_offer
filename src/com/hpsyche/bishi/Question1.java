package com.hpsyche.bishi;

import java.util.Scanner;

/**
 * @author hpsyche
 * Create on 2020/2/19
 */
public class Question1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nStr = scanner.nextLine();
        for (int i = 0; i < Integer.valueOf(nStr); i++) {
            String input = scanner.nextLine();
            System.out.println(toNormalAddr(input));
        }
    }

    // transform to normal address
    private static String toNormalAddr(String input) {
        String[] inputs = input.split("C");
        int row=Integer.valueOf(inputs[0].substring(1));
        int col=Integer.valueOf(inputs[1]);
        StringBuilder sb=new StringBuilder("");
        //将列转为26进制
        while(col!=0){
            if(col%26==0){
                sb.append('Z');
                col/=26;
                col-=1;
            }else {
                sb.append((char) (col % 26 + 'A' - 1));
                col/=26;
            }
        }
        sb.reverse();
        sb.append(row);
        return sb.toString();
    }
}
