package Ex1;

import java.util.Scanner;

public class Student implements IDisplay , IInput{
    private String studentID;
    private String name;

    @override
    void print(){
        System.out.println("Student ID " + studentId + " Name" + name );
    } 


    @Override
	void printDetails(){
        System.out.println("Student ID " + studentId );
		System.out.println("Name " + name );	
    }

    @override
    void input(){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student ID");
		this.studentId = sc.next();
		
		System.out.println("Enter the name");
		this.name = sc.next();
    }
}