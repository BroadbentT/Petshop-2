// *****************************************************************************
//               JAVA PETSHOP - ANIMAL/OWNER RELATIONSHIP FILE
//           BY TERENCE BROADBENT BSC CYBER SECURITY (FIRST CLASS)
// *****************************************************************************

// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : Load required imports.
// Modified: N/A
// *****************************************************************************

package PolymorphicPetShop;

// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : Set up the cat parameters.
// Modified: N/A
// *****************************************************************************

public class Cat extends Pet {

final private int numberOfTeeth;
final private int lengthOfTail;

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

//Eof...
