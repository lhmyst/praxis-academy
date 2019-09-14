/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author lhmyst
 */
public class Matrix1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c,d;
        int m=1;
        int n=9;

        int first[][] = new int[2][2];
        int second[][] = new int[2][2];
        int sum[][] = new int [2][2];

        for (c=0;c<2;c++){
            for(d=0;d<2;d++){
                first[c][d]=m;
                m++;
                second[c][d]=n;
                n--;
            }
        }

        for (c=0;c<2;c++){
            for(d=0;d<2;d++){
                System.out.print(first[c][d]+"\t");
            }
            System.out.println();
        }

        System.out.println();

        for (c=0;c<2;c++){
            for(d=0;d<2;d++){
                System.out.print(second[c][d]+"\t");
            }
            System.out.println();
        }

        System.out.println();

        for (c=0;c<2;c++){
            for(d=0;d<2;d++){
                sum[c][d]=first[c][d]+second[c][d];
            }
        }

        for (c=0;c<2;c++){
            for(d=0;d<2;d++){
                System.out.print(sum[c][d]+"\t");
            }
            System.out.println();
        }

    }
    
}
