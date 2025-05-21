package ex09;

import ex09.*;  

public class Self {

    public static void main(String[] args) {
        Another obj_a = new Another();  
        obj_a.show_a();  
        obj_a.show_b();  
        obj_a.show_c();  

        System.out.println();
        Other obj_o = new Other();
        obj_o.show_b();  
    }
}

