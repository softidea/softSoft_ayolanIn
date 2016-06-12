/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author deepalsuranga
 */
public class instralament {

    public static void main(String[] args) {
        instralament a = new instralament();
        a.instralamentfull(40000.0, 10.0, 5.0);
    }

    public double instralamentfull(double dena_wt, double masa_ganana, double masekata_poliya) {

        double ful = dena_wt * masekata_poliya / 100;
        System.out.println(ful);
        double full = dena_wt / masa_ganana;
        System.out.println(full);
        double fully = ful + full;
        System.out.println(fully);
        return fully;

    }

    public double instralament(double dena_wt, double masa_ganana, double masekata_poliya) {

        double C = dena_wt;
        double t = masa_ganana;
        double Ps;
        double r = masekata_poliya;
        double a = (1 + r);
        Math.pow(a, t);
        Ps = C * a * t;
        System.out.println("warikaya :" + Ps);

        return Ps;

    }

}
