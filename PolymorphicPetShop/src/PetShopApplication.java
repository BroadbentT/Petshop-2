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

// *****************************************************************************
// Main Program - PolyMorphicPetShop
// *****************************************************************************

public class PetShopApplication {
public static void main(String[] args) {
    
// *****************************************************************************
// Create and populate where necessary any variables used by the program
// *****************************************************************************
        
    Object []PetShop = new Object [10];
    
    PetShop[0] = new Cat("James McGregor", 10, 13);                             //Overloaded constructer
    PetShop[1] = new Cat("Tiger","Bill Stoke", 23, 12);   
    PetShop[2] = new Cat("Spot", "Andy Powell", 28, 14);
    PetShop[3] = new Cat("Wacko","Peter Powell", 22,10);
    PetShop[4] = new Cat("Fluff", "Mandy Kettering", 20, 10);
    PetShop[5] = new Cat("Stalker", "Graham Painter", 16, 17);
    PetShop[6] = new Budgie("Fred Carpenter","Yellow");                         //Overloaded constructor
    PetShop[7] = new Budgie("Tuts","Mary Hudson","  Blue");  
    PetShop[8] = new Budgie("Beauty", "Susan Keen","   Red");
    PetShop[9] = new Budgie("Chick", "Thomas Todge", "Orange");
    
// *****************************************************************************
// Print the contents of the Array to the user via the screen
// *****************************************************************************
    
    printPetDetails(PetShop);
}

// *****************************************************************************
// Output the populated Array to the user via the screen using instanceof
// *****************************************************************************

public static void printPetDetails(Object PetShop[])
{
    System.out.println("All pets");
    System.out.println("\tPet Name\t\tOwner name\t\tTeeth\tTail length\tFeather colour");
    System.out.print("\t=====================\t=====================");
    System.out.println("\t=====\t===========\t==============");
    for (int NumLoop = 0; NumLoop < 10; NumLoop ++) {
    if (PetShop[NumLoop] instanceof Cat){
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
}
// *****************************************************************************
// End of Program - Job well done!!! 
// *****************************************************************************    
}