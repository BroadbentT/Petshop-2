// *****************************************************************************
//  STAFFORDSHIRE UNIVERSITY
//  FACILITY OF COMPUTING, ENGINEERING & SCIENCE 
//  SCHOOL OF COMPUTING
//
//  CESMCOM10070/4 DATA STORAGE AND SOFTWARE DEVELOPMENT - SEMESTER 2
//  TUTORIAL SESSIONS EXERCISES & PORTFOLIO ASSIGNMENTS 46
//
//  JAVA PROGRAMMER TERENCE BROADBENT - B028035c@student.staffs.ac.uk
//  DATE: 11.03.2014 VERSION 1.0
//
//  TASK 1
// *****************************************************************************

public class Budgie extends Pet {
    
private String colourOfFeathers;

public Budgie(String OwnerName, String ColFeather){                             //Overloaded constructor
super.Pet("BUDGIE", OwnerName);
this.colourOfFeathers = ColFeather;
}

public Budgie(String Name, String OwnerName, String ColFeather){
super.Pet(Name, OwnerName);
this.colourOfFeathers = ColFeather;}

public String getColourOfFeathers(){
return colourOfFeathers;}}
