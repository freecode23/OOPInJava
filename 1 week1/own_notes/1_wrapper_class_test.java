class Wrapper{
    public static void main(String[] args){
        //  so you may (or may not) end up with the same Object if you call it more than once.
        Integer p = 2;
        Integer o = 2;
        Integer q = 2000;
        System.out.println(p==o);

        Integer x1 = Integer.valueOf(456);
        Integer x2 = Integer.valueOf(456);
        System.out.println(x1==x2);
        

        // return -1, 0 , or 1
        System.out.println("p = o: " +p.compareTo(o));

        System.out.println("p < q: " + p.compareTo(q));

        System.out.println("q > p: " + q.compareTo(p));

        
        int x_int = 3;
        // auto boxing 
        // take the value of x_int directly to X_Int integer value. 
        // ( no need to "WRAPPER CLASS inconvenient below")
        Integer X_Int = x_int;
        System.out.println("X_Int: " + X_Int);

        // WRAPPER CLASS inconvenient
        // Integer intObj1 = new Integer(10);
        // Integer intObj2 = new Integer("10");
        // //   will print 10
        // System.out.println("Deprecated 1: " + intObj1);
        // System.out.println("Deprecated 2: " +intObj2);

        // // always returns false
        // System.out.println(intObj1 == intObj2);
    }
}
