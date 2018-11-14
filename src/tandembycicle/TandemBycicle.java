/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tandembycicle;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author huang
 */
public class TandemBycicle {

    static int[] speeds1;
    static int[] speeds2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        int number = sc.nextInt();

        speeds1 = new int[number];
        speeds2 = new int[number];
        for (int i = 0; i < number; i++) {
            speeds1[i] = sc.nextInt();
        }
        for (int i = 0; i < number; i++) {
            speeds2[i] = sc.nextInt();
        }
        Arrays.sort(speeds1);
        Arrays.sort(speeds2);

        int speed = 0;
        if (type == 1) {
            speed = getMinSpeed();
        } else {
            speed = getMaxSpeed();
        }

        System.out.println(speed);
    }

    private static int getMinSpeed() {
        int speed = 0;
        for (int i = speeds1.length - 1; i >= 0; i--) {
            if (speeds1[i] > speeds2[i]) {
                speed += speeds1[i];
            } else {
                speed += speeds2[i];
            }
        }
        return speed;
    }

    private static int getMaxSpeed() {
        int j = speeds1.length-1;
        int k = speeds2.length-1;
        int speed = 0;
        for (int i = speeds1.length - 1; i >= 0; i--) {
            if (speeds1[j] > speeds2[k]) {
                speed += speeds1[j];
                j--;
            } else {
                speed += speeds2[k];
                k--;
            }
        }
        return speed;
    }

}
