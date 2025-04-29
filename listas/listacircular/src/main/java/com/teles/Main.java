package com.teles;

public class Main {
    public static void main(String[] args) {
        ListaCitcular<String> minhListaCitcular = new ListaCitcular<>();


        minhListaCitcular.add("c0");
        System.out.println(minhListaCitcular);

        minhListaCitcular.remove(0);
        System.out.println(minhListaCitcular);

        minhListaCitcular.add("c1");
        System.out.println(minhListaCitcular);

        minhListaCitcular.add("c2");
        minhListaCitcular.add("c3");
        System.out.println(minhListaCitcular);

        System.out.println(minhListaCitcular.get(0));
        System.out.println(minhListaCitcular.get(1));
        System.out.println(minhListaCitcular.get(3));
        System.out.println(minhListaCitcular.get(4));




    }
}
