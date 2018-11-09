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

public class Cat extends Pet {

private int numberOfTeeth;
private int lengthOfTail;

public Cat(String OwnerName, int NumTeeth, int LenTail){                        //Overloaded Constructor
super.Pet("CAT", OwnerName);
this.numberOfTeeth = NumTeeth;
this.lengthOfTail = LenTail;}     

public Cat(String Name, String OwnerName, int NumTeeth, int LenTail){
super.Pet(Name, OwnerName);
this.numberOfTeeth = NumTeeth;
this.lengthOfTail = LenTail;}

public int getNumberOfTeeth(){
return numberOfTeeth;}

public int getLengthOfTail(){
return lengthOfTail;}}
