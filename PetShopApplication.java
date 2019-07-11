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
// Details : Call any imports to be used by the program.
// Modified: N/A
// *****************************************************************************

// N/A

// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : The main program.
// Modified: N/A
// *****************************************************************************

public class PetShopApplication {
public static void main(String[] args) {

// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : Create and populate program variables.
// Modified: N/A
// *****************************************************************************
        
    Object []PetShop = new Object [10];                                         // 10 Owners Max
    
    PetShop[0] = new Cat("James McGregor", 10, 13);                             //Overloaded constructer
    PetShop[1] = new Cat("Tiger","Bill Stoke", 23, 12);   
    PetShop[2] = new Cat("Spot", "Andy Powell", 28, 14);
    PetShop[3] = new Cat("Wacko","Peter Powell", 22,10);
    PetShop[4] = new Cat("Fluff", "Mandy Kettering", 20, 10);
    PetShop[5] = new Cat("Stalker", "Graham Painter", 16, 17);
    PetShop[6] = new Budgie("Fred Carpenter","Yellow");                         
    PetShop[7] = new Budgie("Tuts","Mary Hudson","  Blue");  
    PetShop[8] = new Budgie("Beauty", "Susan Keen","   Red");
    PetShop[9] = new Budgie("Chick", "Thomas Todge", "Orange");                 //Overloaded constructor
    
// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : Print the contents of the Array to the user via the screen.
// Modified: N/A
// *****************************************************************************

    printPetDetails(PetShop);
}

// ***************************************************************************** 
// AUTHOR  : Terence Broadbent                                                    
// CONTRACT: GitHub                                                               
// Version : 1.0                                                                
// Details : Display the now populated array to the user via the screen.
// Modified: N/A
// *****************************************************************************

public static void printPetDetails(Object PetShop[])
{
    System.out.println("All pets");
    System.out.println("\tPet Name\t\tOwner name\t\tTeeth\tTail length\tFeather colour");
    System.out.print("\t=====================\t=====================");
    System.out.println("\t=====\t===========\t==============");
    for (int NumLoop = 0; NumLoop < 10; NumLoop ++) {
    if (PetShop[NumLoop] instanceof Cat){                                       //instance of Cat
    Cat CatX = (Cat)PetShop[NumLoop];
    System.out.print("\t" + CatX.getName());
    System.out.print("\t\t\t" + CatX.getOwnerName());
    System.out.print("\t\t   " + CatX.getNumberOfTeeth());
    System.out.print("\t\t " + CatX.getLengthOfTail());
    System.out.print("\t\t   ---");}
    else {                                                                      //instance of Budgie
    Budgie BudgieX = (Budgie)PetShop[NumLoop];
    System.out.print("\t" + BudgieX.getName());
    System.out.print("\t\t\t" + BudgieX.getOwnerName());
    System.out.print("\t\t  ---");
    System.out.print("\t\t---");
    System.out.print("\t\t" + BudgieX.getColourOfFeathers());}
    System.out.println("");}    
}}

//Eof...
