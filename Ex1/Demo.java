package Ex1;

import java.util.Scanner;

public class Demo {

    public static void main(String [] args) {

        // Create objects of the Book
        Book bk = new Book();

        // Create objects of the Student
        Student st = new Student();

        //create variable from IDisplay
        IDisplay ref1 ;
            
        //create variable from IInput
        IInput ref2;
            
        ref1 = new Book();
            
        ref1.printDetails();
            
        ref2 = new Student();
            
        ref2.input();
            
        bk.input();
        bk.print();
        bk.printDetails();
            
        st.input();
        st.print();
        st.printDetails();

    }

}