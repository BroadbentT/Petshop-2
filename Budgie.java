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
// Details : Set up the budgie parameters.
// Modified: N/A
// *****************************************************************************

public class Budgie extends Pet {
    
final private String colourOfFeathers;

public Budgie(String OwnerName, String ColFeather){                             //Overloaded constructor
super.Pet("BUDGIE", OwnerName);
this.colourOfFeathers = ColFeather;}

public Budgie(String Name, String OwnerName, String ColFeather){
super.Pet(Name, OwnerName);
this.colourOfFeathers = ColFeather;}

public String getColourOfFeathers(){
return colourOfFeathers;}}

//Eof...
