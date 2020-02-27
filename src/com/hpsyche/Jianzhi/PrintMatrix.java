package com.hpsyche.Jianzhi;

import java.util.ArrayList;

/**
 * @author hpsyche
 * Create on 2020/2/26
 * 矩阵打印
 */
public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> resList=new ArrayList<>();
        int beginX=0;
        int beginY=0;
        int endX=matrix.length-1;
        int endY=matrix[0].length-1;
        while (beginX<=endX&&beginY<=endY) {
            printMatrixInCircle(resList, matrix, beginX, beginY, endX, endY);
            beginX++;
            beginY++;
            endX--;
            endY--;
        }
        return resList;
    }

    public void printMatrixInCircle(ArrayList<Integer> list,int [][] matrix,int a,int b,int c,int d){
        int nowX=a;
        int nowY=b;
        if(a==c){
            while (nowY<=d){
                list.add(matrix[a][nowY]);
                nowY++;
            }
        }else if(b==d){
            while (nowX<=c){
                list.add(matrix[nowX][b]);
                nowX++;
            }
        }else{
            while (nowY<d){
                list.add(matrix[b][nowY]);
                nowY++;
            }
            while (nowX<c){
                list.add(matrix[nowX][d]);
                nowX++;
            }
            while (nowY>b){
                list.add(matrix[c][nowY]);
                nowY--;
            }
            while (nowX>a){
                list.add(matrix[nowX][b]);
                nowX--;
            }
        }
    }

}
