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
// Details : Set up the pet parameters.
// Modified: N/A
// *****************************************************************************

public class Pet {
    
private String name;
private String ownerName;

public void Pet(String Name, String OwnerName){
this.name = Name;
this.ownerName = OwnerName;}

public String getName(){
return name;}

public String getOwnerName(){
return ownerName;}}

// Eof...
