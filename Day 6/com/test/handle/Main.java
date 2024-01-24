package com.test.handle;

class Main {
    public static void main(String[] args) {
        String s = null;
        Main m = new Main();
        m.checkNull(s);
    }
    void checkNull(String s){
        try {
            System.out.println(s.length());
        }

        catch(Exception e){
            System.out.println("Null point error");
        }
    }
}