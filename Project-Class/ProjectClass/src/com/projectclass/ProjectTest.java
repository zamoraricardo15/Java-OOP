package com.projectclass;

public class ProjectTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Project project1 = new Project();
        
        Project project2 = new Project("First");
        Project project3 = new Project("Second", "Testing2", 10);
        
        Project project4 = new Project("Third", "Testing3", 272727);
        
        System.out.println(project1.getName());
        
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());
        System.out.println(project4.elevatorPitch());
        
        
	}
	

}
