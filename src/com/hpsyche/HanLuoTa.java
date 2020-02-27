package com.hpsyche;

/**
 * @author hpsyche
 * Create on 2019/12/3
 */
public class HanLuoTa {
    public static void printProcess(int n,String from,String to,String help){
        if(n==1){
            System.out.println("将1从"+from+"移到"+to);
            return;
        }
        //将（n-1）个从from放到help
        printProcess(n-1,from,help,to);
        //将n从from放到to
        System.out.println("将"+n+"从"+from+"移到"+to);
        //将（n-1）从help放到to
        printProcess(n-1,help,to,from);
    }

    public static void main(String[] args) {
        printProcess(4,"from","to","help");
    }
}
