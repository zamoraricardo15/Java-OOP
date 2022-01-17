package com.projectclass;

public class Project {
    private String name;
    private String description;
    private double initialCost = 0;

    
    public void setName(String name){
        this.name = name;
        
    }

    public String getName(){
        return this.name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setinitialCost(double initialCost){
        this.initialCost = initialCost;
    }

    public double getinitialCost(){
        return this.initialCost;
        
    }

    public String elevatorPitch(){
        return "Project name: " + this.name + ". " + "Project cost: " + this.initialCost + " " + "Project description: " + this.description;

    }
    
    public Project(){
        this.name = "Project Name";
        this.description = "Project Description";
    }

    public Project(String name){
        this.name = name;
        this.description = "Project Description ID";
        
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    public Project(String name, String description, double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

}
