//Importing libraries
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class coursework2 {
    public static void main(String[] args) throws IOException{
        int Level; //asking for level
        Scanner sc = new Scanner(System.in); //used for prompting user input
        System.out.println("Please enter your level: ");
        Level = sc.nextInt(); //prompting for user input
        System.out.println("Your level is" + Level);
        System.out.println("Now please select your character class:");
        System.out.println("Please select a character class from the list below using the numbers assigned.");
        System.out.println("'1' for Barbarian");
        System.out.println("'2' for Bard");
        System.out.println("'3' for Cleric");
        System.out.println("'4' for Druid");
        System.out.println("'5' for Fighter");
        System.out.println("'6' for Monk");
        System.out.println("'7' for Paladin");
        System.out.println("'8' + for Ranger");
        System.out.println("'9' for Rogue");
        System.out.println("'10' for Sorcerer");
        System.out.println("'11' for Warlock");
        System.out.println("'12' for Wizard");
        System.out.println("'13' for Blood Hunter");
        System.out.println("Enter the value assigned for each class to select a particular one: ");

        int charClass; //creating character class variable
        charClass = sc.nextInt(); //prompting for user input
        System.out.println("Congratulations, the class you have chosen is" + " " + Character.characterClasses[charClass - 1]); //used to present the class chosen
        System.out.println("How would you like to calculate your attributes?");
        System.out.println("1. Do you wish to enter them directly?");
        System.out.println("2. Randomly generate by rolling six-sided dice four times.");
        System.out.println("3. Randomly generate by rolling six-sided dice four times, roll another one if the attributes are 16 or higher.");
        System.out.println("4. Randomly generate by rolling Method IX");
        int selectionClasses; //creating variable to select option
        selectionClasses = sc.nextInt(); //prompting for user input for the options
        switch (selectionClasses) { //opening switch statement for each option
            case 1:
                System.out.println("You have selected to set the attributes directly.");
                //creating variables
                int Str;
                int Dex;
                int Con;
                int Int;
                int Wis;
                int Cha;
                int Bonus1;
                int Bonus2;
                int Bonus3;
                int Bonus4;
                int Bonus5;
                int Bonus6;


                System.out.println("Enter the attributes score for Strength between 1 and 30");
                Str = sc.nextInt();
                //opening booleon for looping
                boolean mainCode = true;
                boolean user = true;
                while (mainCode == true) {
                    if (Str >= 1 && Str <= 30) { //used to prompt an integer between the two values
                        System.out.println("You called your attributes score of Strength to be: " + " " + Str);
                    } else {
                        System.out.println("Invalid Call");
                    }
                    //Calculating Bonus for Str
                    Bonus1 = 0;

                    if (Str == 1) {

                        Bonus1 = -5;
                    } else if (Str <= 3) {
                        Bonus1 = -4;
                    } else if (Str <= 5) {
                        Bonus1 = -3;
                    } else if (Str <= 7) {
                        Bonus1 = -2;
                    } else if (Str <= 9) {
                        Bonus1 = -1;
                    } else if (Str <= 11) {
                        Bonus1 = 0;
                    } else if (Str <= 13) {
                        Bonus1 = +1;
                    } else if (Str <= 15) {
                        Bonus1 = +2;
                    } else if (Str <= 17) {
                        Bonus1 = +3;
                    } else if (Str <= 19) {
                        Bonus1 = +4;
                    } else if (Str <= 21) {
                        Bonus1 = +5;
                    } else if (Str <= 23) {
                        Bonus1 = +6;
                    } else if (Str <= 25) {
                        Bonus1 = +7;
                    }


                    System.out.println("Enter the attributes score for Dexterity between 1 and 30");
                    Dex = sc.nextInt();
                    if (Dex >= 1 && Dex <= 30) {
                        System.out.println("You called your attributes score of Dexterity to be: " + " " + Dex);
                    } else {
                        System.out.println("Invalid Call");
                    }
                    //Calculating bonus for Dex
                    Bonus2 = 0;
                    if (Dex == 1) {
                        Bonus2 = -5;
                    } else if (Dex <= 3) {
                        Bonus2 = -4;
                    } else if (Dex <= 5) {
                        Bonus2 = -3;
                    } else if (Dex <= 7) {
                        Bonus2 = -2;
                    } else if (Dex <= 9) {
                        Bonus2 = -1;
                    } else if (Dex <= 11) {
                        Bonus2 = 0;
                    } else if (Dex <= 13) {
                        Bonus2 = +1;
                    } else if (Dex <= 15) {
                        Bonus2 = +2;
                    } else if (Dex <= 17) {
                        Bonus2 = +3;
                    } else if (Dex <= 19) {
                        Bonus2 = +4;
                    } else if (Dex <= 21) {
                        Bonus2 = +5;
                    } else if (Dex <= 23) {
                        Bonus2 = +6;
                    } else if (Dex <= 25) {
                        Bonus2 = +7;
                    }

                    System.out.println("Enter the attributes for Constitution between 1 and 30");
                    Con = sc.nextInt();//prompting user input for Con stats
                    if (Con >= 1 && Con <= 30) {
                        System.out.println("You called your attributes score of Constitution to be: " + " " + Con);
                    } else {
                        System.out.println("Invalid Call.");
                    }
                    //calculating bonus for Con
                    Bonus3 = 0;

                    if (Con == 1) {
                        Bonus3 = -5;
                    } else if (Con <= 3) {
                        Bonus3 = -4;
                    } else if (Con <= 5) {
                        Bonus3 = -3;
                    } else if (Con <= 7) {
                        Bonus3 = -2;
                    } else if (Con <= 9) {
                        Bonus3 = -1;
                    } else if (Con <= 11) {
                        Bonus3 = 0;
                    } else if (Con <= 13) {
                        Bonus3 = +1;
                    } else if (Con <= 15) {
                        Bonus3 = +2;
                    } else if (Con <= 17) {
                        Bonus3 = +3;
                    } else if (Con <= 19) {
                        Bonus3 = +4;
                    } else if (Con <= 21) {
                        Bonus3 = +5;
                    } else if (Con <= 23) {
                        Bonus3 = +6;
                    } else if (Con <= 25) {
                        Bonus3 = +7;
                    }

                    System.out.println("Enter the attributes score for Intelligence between 1 and 30");
                    Int = sc.nextInt();
                    if (Int >= 1 && Int <= 30) {
                        System.out.println("You called your attributes score of Intellijence to be: " + " " + Int);
                    } else {
                        System.out.println("Invalid Call.");
                    }
                    //Calculating bonus for Int
                    Bonus4 = 0;
                    if (Int == 1) {
                        Bonus4 = -5;
                    } else if (Int <= 3) {
                        Bonus4 = -4;
                    } else if (Int <= 5) {
                        Bonus4 = -3;
                    } else if (Int <= 7) {
                        Bonus4 = -2;
                    } else if (Int <= 9) {
                        Bonus4 = -1;
                    } else if (Int <= 11) {
                        Bonus4 = 0;
                    } else if (Int <= 13) {
                        Bonus4 = +1;
                    } else if (Int <= 15) {
                        Bonus4 = +2;
                    } else if (Int <= 17) {
                        Bonus4 = +3;
                    } else if (Int <= 19) {
                        Bonus4 = +4;
                    } else if (Int <= 21) {
                        Bonus4 = +5;
                    } else if (Int <= 23) {
                        Bonus4 = +6;
                    } else if (Int <= 25) {
                        Bonus4 = +7;
                    }

                    System.out.println("Enter the attribute score for Wisdom between 1 and 30");
                    Wis = sc.nextInt();
                    if (Wis >= 1 && Wis <= 30) {
                        System.out.println("You called your attribute score of Wisdom to be: " + " " + Wis);
                    } else {
                        System.out.println("Invalid call.");
                    }
                    //Calculating bonus for Wis
                    Bonus5 = 0;
                    if (Wis == 1) {

                        Bonus5 = -5;
                    } else if (Wis <= 3) {
                        Bonus5 = -4;
                    } else if (Wis <= 5) {
                        Bonus5 = -3;
                    } else if (Wis <= 7) {
                        Bonus5 = -2;
                    } else if (Wis <= 9) {
                        Bonus5 = -1;
                    } else if (Wis <= 11) {
                        Bonus5 = 0;
                    } else if (Wis <= 13) {
                        Bonus5 = +1;
                    } else if (Wis <= 15) {
                        Bonus5 = +2;
                    } else if (Wis <= 17) {
                        Bonus5 = +3;
                    } else if (Wis <= 19) {
                        Bonus5 = +4;
                    } else if (Wis <= 21) {
                        Bonus5 = +5;
                    } else if (Wis <= 23) {
                        Bonus5 = +6;
                    } else if (Wis <= 25) {
                        Bonus5 = +7;
                    }

                    System.out.println("Enter the attribute score for Charisma between 1 and 30");
                    Cha = sc.nextInt();
                    if (Cha >= 1 && Cha <= 30) {
                        System.out.println("You called your attributes score of Charisma to be: " + " " + Cha);
                    } else {
                        System.out.println("Invalid Call");
                    }
                    //Calculating Bonus for Cha
                    Bonus6 = 0;
                    if (Cha == 1) {

                        Bonus6 = -5;
                    } else if (Cha <= 3) {
                        Bonus6 = -4;
                    } else if (Cha <= 5) {
                        Bonus6 = -3;
                    } else if (Cha <= 7) {
                        Bonus6 = -2;
                    } else if (Cha <= 9) {
                        Bonus6 = -1;
                    } else if (Cha <= 11) {
                        Bonus6 = 0;
                    } else if (Cha <= 13) {
                        Bonus6 = +1;
                    } else if (Cha <= 15) {
                        Bonus6 = +2;
                    } else if (Cha <= 17) {
                        Bonus6 = +3;
                    } else if (Cha <= 19) {
                        Bonus6 = +4;
                    } else if (Cha <= 21) {
                        Bonus6 = +5;
                    } else if (Cha <= 23) {
                        Bonus6 = +6;
                    } else if (Cha <= 25) {
                        Bonus6 = +7;
                    }
                    //Calculating Hitpoints
                    double hp = (Level * Bonus3) + (Math.random() * 1000 % 6 + 1);

                    //Displaying the stats in a significant order
                    System.out.println("Level:" + " " + "[" + Level + "]");
                    System.out.println("Character: " + Character.characterClasses[charClass - 1]);
                    if (Bonus1 > 0) {
                        System.out.println("Strength:" + " " + "[" + Str + "]" + "[" + " " + "+" + Bonus1 + "]");
                    } else {
                        System.out.println("Strength:" + " " + "[" + Str + "]" + " " + "[" + Bonus1 + "]");
                    }
                    if (Bonus1 == 10) {
                        System.out.println("Strength:" + " " + "[" + Str + "]" + " " + "[" + Bonus1 + "]");
                    }
                    if (Bonus2 > 0) {
                        System.out.println("Dexterity:" + " " + "[" + Dex + "]" + "[" + "+" + Bonus2 + "]");
                    } else {
                        System.out.println("Dexterity:" + " " + "[" + Dex + "]" + " " + "[" + Bonus2 + "]");
                    }
                    if (Bonus2 == 10) {
                        System.out.println("Dexterity:" + " " + "[" + Dex + "]" + " " + "[" + Bonus2 + "]");
                    }
                    if (Bonus3 > 0) {
                        System.out.println("Constitution:" + " " + "[" + Con + "]" + "[" + " +" + Bonus3 + "]");
                    } else {
                        System.out.println("Constitution:" + " " + "[" + Con + "]" + " " + "[" + Bonus3 + "]");
                    }
                    if (Bonus3 == 10) {
                        System.out.println("Constitution:" + " " + "[" + Con + "]" + " " + "[" + Bonus3 + "]");
                    }
                    if (Bonus4 > 0) {
                        System.out.println("Intelligence:" + " " + "[" + Int + "]" + "[" + " +" + Bonus4 + "]");
                    } else {
                        System.out.println("Intelligence:" + " " + "[" + Int + "]" + " " + "[" + Bonus4 + "]");
                    }
                    if (Bonus4 == 10) {
                        System.out.println("Intelligence:" + " " + "[" + Int + "]" + " " + "[" + Bonus4 + "]");
                    }
                    if (Bonus5 > 0) {
                        System.out.println("Wisdom:" + " " + "[" + Wis + "]" + "[" + " +" + Bonus5 + "]");
                    } else {
                        System.out.println("Wisdom:" + " " + "[" + Wis + "]" + " " + "[" + Bonus5 + "]");
                    }
                    if (Bonus5 == 10) {
                        System.out.println("Wisdom:" + " " + "[" + Wis + "]" + " " + "[" + Bonus5 + "]");
                    }
                    if (Bonus6 > 0) {
                        System.out.println("Charisma:" + " " + "[" + Cha + "]" + "[" + " +" + Bonus6 + "]");
                    } else {
                        System.out.println("Charisma:" + " " + "[" + Cha + "]" + " " + "[" + Bonus6 + "]");
                    }
                    if (Bonus6 == 10) {
                        System.out.println("Charisma:" + " " + "[" + Cha + "]" + " " + "[" + Bonus6 + "]");
                    }
                    System.out.println("Hitpoints: " + "[" + hp + "]");

                    System.out.println("Do you wish to re-roll your stats? Enter 'Y' for Yes or 'N' for No.");


                    //Used for character input
                    char userInput = sc.next().charAt(0);
                    switch (userInput) {
                        case 'y':           //used to allow both uppercase and lower case character
                        case 'Y':
                            System.out.println("You wish to re-roll your stats.");
                            user = true;              //Re-rolling from the loop if false.
                            break;

                        case 'n':
                        case 'N':                   //used to allow both uppercase and lowercase character
                            System.out.println("You don't wish to re-roll. You accept your current stats.");
                            mainCode = false;          // repeating the whole process if wished to re-roll
                            System.out.println("Enjoy!");
                            break;

                        default:
                            System.out.println("Invalid input.");       //If invalid input being prompted by the user
                            user = false;
                            break;
                    }
                    if (user == false) {                                   //Repeating  for user to input accurate value.
                        System.out.println("Please enter 'y' to re-roll or 'n' to accept your current stats.");
                        char userinputAgain = sc.next().charAt(0);      //Asking for user input
                        if (userinputAgain == 'Y') {
                            System.out.println("You selected to re-roll");
                            user = true;

                        } else if (userinputAgain == 'N') {
                            System.out.println("You don't wish to re-roll. Enjoy!");
                        }
                    }
                }
                break;

            case 2:
                //boolean main code begins here for loop
                boolean mainCode2 = true;
                boolean user2 = true;
                while (mainCode2 == true) {

                    System.out.println("You have chosened to randomly generate the attributes by rolling six-sided dice four times");
                    double RanStr1 = dice(); //calling dice method for roll
                    int Str2 = (int) RanStr1;

                    //Calculating bonus for Str
                    int BonusC21;
                    if (Str2 == 1) {

                        BonusC21 = -5;
                    } else if (Str2 <= 3) {
                        BonusC21 = -4;
                    } else if (Str2 <= 5) {
                        BonusC21 = -3;
                    } else if (Str2 <= 7) {
                        BonusC21 = -2;
                    } else if (Str2 <= 9) {
                        BonusC21 = -1;
                    } else if (Str2 <= 11) {
                        BonusC21 = 0;
                    } else if (Str2 <= 13) {
                        BonusC21 = +1;
                    } else if (Str2 <= 15) {
                        BonusC21 = +2;
                    } else if (Str2 <= 17) {
                        BonusC21 = +3;
                    } else if (Str2 <= 19) {
                        BonusC21 = +4;
                    } else if (Str2 <= 21) {
                        BonusC21 = +5;
                    } else if (Str2 <= 23) {
                        BonusC21 = +6;
                    } else if (Str2 <= 25) {
                        BonusC21 = +7;
                    }


                    double RanDex1 = dice(); //random dice method being called for roll
                    int Dex2 = (int) RanDex1;

                    //calculating bonus for dex
                    int BonusC22 = 0;
                    if (Dex2 == 1) {
                        BonusC22 = -5;
                    } else if (Dex2 <= 3) {
                        BonusC22 = -4;
                    } else if (Dex2 <= 5) {
                        BonusC22 = -3;
                    } else if (Dex2 <= 7) {
                        BonusC22 = -2;
                    } else if (Dex2 <= 9) {
                        BonusC22 = -1;
                    } else if (Dex2 <= 11) {
                        BonusC22 = 0;
                    } else if (Dex2 <= 13) {
                        BonusC22 = +1;
                    } else if (Dex2 <= 15) {
                        BonusC22 = +2;
                    } else if (Dex2 <= 17) {
                        BonusC22 = +3;
                    } else if (Dex2 <= 19) {
                        BonusC22 = +4;
                    } else if (Dex2 <= 21) {
                        BonusC22 = +5;
                    } else if (Dex2 <= 23) {
                        BonusC22 = +6;
                    } else if (Dex2 <= 25) {
                        BonusC22 = +7;
                    }


                    double RanCon1 = dice();
                    int Con2 = (int) RanCon1;
                    int BonusC23 = 0;

                    //Calculating bonus for Con
                    if (Con2 == 1) {
                        BonusC23 = -5;
                    } else if (Con2 <= 3) {
                        BonusC23 = -4;
                    } else if (Con2 <= 5) {
                        BonusC23 = -3;
                    } else if (Con2 <= 7) {
                        BonusC23 = -2;
                    } else if (Con2 <= 9) {
                        BonusC23 = -1;
                    } else if (Con2 <= 11) {
                        BonusC23 = 0;
                    } else if (Con2 <= 13) {
                        BonusC23 = +1;
                    } else if (Con2 <= 15) {
                        BonusC23 = +2;
                    } else if (Con2 <= 17) {
                        BonusC23 = +3;
                    } else if (Con2 <= 19) {
                        BonusC23 = +4;
                    } else if (Con2 <= 21) {
                        BonusC23 = +5;
                    } else if (Con2 <= 23) {
                        BonusC23 = +6;
                    } else if (Con2 <= 25) {
                        BonusC23 = +7;
                    }
                    double RanInt1 = dice();
                    int Int2 = (int) RanInt1;

                    //Calculating bonus for Int
                    int BonusC24 = 0;

                    if (Int2 == 1) {
                        BonusC24 = -5;
                    } else if (Int2 <= 3) {
                        BonusC24 = -4;
                    } else if (Int2 <= 5) {
                        BonusC24 = -3;
                    } else if (Int2 <= 7) {
                        BonusC24 = -2;
                    } else if (Int2 <= 9) {
                        BonusC24 = -1;
                    } else if (Int2 <= 11) {
                        BonusC24 = 0;
                    } else if (Int2 <= 13) {
                        BonusC24 = +1;
                    } else if (Int2 <= 15) {
                        BonusC24 = +2;
                    } else if (Int2 <= 17) {
                        BonusC24 = +3;
                    } else if (Int2 <= 19) {
                        BonusC24 = +4;
                    } else if (Int2 <= 21) {
                        BonusC24 = +5;
                    } else if (Int2 <= 23) {
                        BonusC24 = +6;
                    } else if (Int2 <= 25) {
                        BonusC24 = +7;
                    }

                    //Calculating Bonus for Wis
                    double RanWis1 = dice();
                    int Wis2 = (int) RanWis1;
                    int BonusC25 = 0;

                    if (Wis2 == 1) {
                        BonusC25 = -5;
                    } else if (Wis2 <= 3) {
                        BonusC25 = -4;
                    } else if (Wis2 <= 5) {
                        BonusC25 = -3;
                    } else if (Wis2 <= 7) {
                        BonusC25 = -2;
                    } else if (Wis2 <= 9) {
                        BonusC25 = -1;
                    } else if (Wis2 <= 11) {
                        BonusC25 = 0;
                    } else if (Wis2 <= 13) {
                        BonusC25 = +1;
                    } else if (Wis2 <= 15) {
                        BonusC25 = +2;
                    } else if (Wis2 <= 17) {
                        BonusC25 = +3;
                    } else if (Wis2 <= 19) {
                        BonusC25 = +4;
                    } else if (Wis2 <= 21) {
                        BonusC25 = +5;
                    } else if (Wis2 <= 23) {
                        BonusC25 = +6;
                    } else if (Wis2 <= 25) {
                        BonusC25 = +7;
                    }

                    //Calculating Bonus for Cha
                    double RanCha1 = dice();
                    int Cha2 = (int) RanCha1;
                    int BonusC26 = -5;

                    if (Cha2 == 1) {
                        BonusC26 = -5;
                    } else if (Cha2 <= 3) {
                        BonusC26 = -4;
                    } else if (Cha2 <= 5) {
                        BonusC26 = -3;
                    } else if (Cha2 <= 7) {
                        BonusC26 = -2;
                    } else if (Cha2 <= 9) {
                        BonusC26 = -1;
                    } else if (Cha2 <= 11) {
                        BonusC26 = 0;
                    } else if (Cha2 <= 13) {
                        BonusC26 = +1;
                    } else if (Cha2 <= 15) {
                        BonusC26 = +2;
                    } else if (Cha2 <= 17) {
                        BonusC26 = +3;
                    } else if (Cha2 <= 19) {
                        BonusC26 = +4;
                    } else if (Cha2 <= 21) {
                        BonusC26 = +5;
                    } else if (Cha2 <= 23) {
                        BonusC26 = +6;
                    } else if (Cha2 <= 25) {
                        BonusC26 = +7;
                    }

                    double hp2 = (Level * BonusC23) + (Math.random() * 1000 % 6 + 1);


                    System.out.println("Attribute score of Strength assigned is: " + Str2);
                    System.out.println("Attribute score of Dexterity assigned is: " + Dex2);
                    System.out.println("Attribute score of Constitution assigned is: " + Con2);
                    System.out.println("Attribute score of Intelligent assigned is: " + Int2);
                    System.out.println("Attribute score of Wisdom assigned is: " + Wis2);
                    System.out.println("Attribute score of Charisma assigned is: " + Cha2);

                    System.out.println("Level:" + " " + "[" + Level + "]");
                    System.out.println("Character: " + Character.characterClasses[charClass - 1]);
                    if (BonusC22 > 0) {
                        System.out.println("Strength:" + " " + "[" + Str2 + "]" + "[" + " " + "+" + BonusC22 + "]");
                    } else {
                        System.out.println("Strength:" + " " + "[" + Str2 + "]" + " " + "[" + BonusC22 + "]");
                    }
                    if (BonusC22 == 10) {
                        System.out.println("Strength:" + " " + "[" + Str2 + "]" + " " + "[" + BonusC22 + "]");
                    }
                    if (BonusC22 > 0) {
                        System.out.println("Dexterity:" + " " + "[" + Dex2 + "]" + "[" + "+" + BonusC22 + "]");
                    } else {
                        System.out.println("Dexterity:" + " " + "[" + Dex2 + "]" + " " + "[" + BonusC22 + "]");
                    }
                    if (BonusC22 == 10) {
                        System.out.println("Dexterity:" + " " + "[" + Dex2 + "]" + " " + "[" + BonusC22 + "]");
                    }
                    if (BonusC23 > 0) {
                        System.out.println("Constitution:" + " " + "[" + Con2 + "]" + "[" + " +" + BonusC23 + "]");
                    } else {
                        System.out.println("Constitution:" + " " + "[" + Con2 + "]" + " " + "[" + BonusC23 + "]");
                    }
                    if (BonusC23 == 10) {
                        System.out.println("Constitution:" + " " + "[" + Con2 + "]" + " " + "[" + BonusC23 + "]");
                    }
                    if (BonusC24 > 0) {
                        System.out.println("Intelligence:" + " " + "[" + Int2 + "]" + "[" + " +" + BonusC24 + "]");
                    } else {
                        System.out.println("Intelligence:" + " " + "[" + Int2 + "]" + " " + "[" + BonusC24 + "]");
                    }
                    if (BonusC24 == 10) {
                        System.out.println("Intelligence:" + " " + "[" + Int2 + "]" + " " + "[" + BonusC24 + "]");
                    }
                    if (BonusC25 > 0) {
                        System.out.println("Wisdom:" + " " + "[" + Wis2 + "]" + "[" + " +" + BonusC25 + "]");
                    } else {
                        System.out.println("Wisdom:" + " " + "[" + Wis2 + "]" + " " + "[" + BonusC25 + "]");
                    }
                    if (BonusC25 == 10) {
                        System.out.println("Wisdom:" + " " + "[" + Wis2 + "]" + " " + "[" + BonusC25 + "]");
                    }
                    if (BonusC26 > 0) {
                        System.out.println("Charisma:" + " " + "[" + Cha2 + "]" + "[" + " +" + BonusC26 + "]");
                    } else {
                        System.out.println("Charisma:" + " " + "[" + Cha2 + "]" + " " + "[" + BonusC26 + "]");
                    }
                    if (BonusC26 == 10) {
                        System.out.println("Charisma:" + " " + "[" + Cha2 + "]" + " " + "[" + BonusC26 + "]");
                    }
                    System.out.println("Hitpoints: " + "[" + hp2 + "]");

                    System.out.println("Do you wish to re-roll your stats? Enter 'Y' for Yes or 'N' for No.");


                    //Used for character input
                    char userInput2 = sc.next().charAt(0);
                    switch (userInput2) {
                        case 'y':           //used to allow both uppercase and lower case character
                        case 'Y':
                            System.out.println("You wish to re-roll your stats.");
                            user2 = true;              //Re-rolling from the loop if false.
                            break;

                        case 'n':
                        case 'N':                   //used to allow both uppercase and lowercase character
                            System.out.println("You don't wish to re-roll. You accept your current stats.");
                            mainCode2 = false;          // repeating the whole process if wished to re-roll
                            System.out.println("Enjoy!");
                            break;

                        default:
                            System.out.println("Invalid input.");       //If invalid input being prompted by the user
                            user2 = false;
                            break;
                    }
                    if (user2 == false) {                                   //Repeating  for user to input accurate value.
                        System.out.println("Please enter 'y' to re-roll or 'n' to accept your current stats.");
                        char userinputAgain2 = sc.next().charAt(0);      //Asking for user input
                        if (userinputAgain2 == 'Y') {
                            System.out.println("You selected to re-roll");
                            user2 = true;

                        } else if (userinputAgain2 == 'N') {
                            System.out.println("You don't wish to re-roll. Enjoy!");
                            mainCode2 = false;
                        } else {
                            System.err.println("Invalid input"); //Program ends if multiple invalid inputs are prompted.

                        }
                    }
                }

                break;


            case 3:
                double RanStr2 = dice();
                if (RanStr2 >= 16) {
                    RanStr2 = RanStr2 + (Math.random() * 1000 % 6 + 1);
                }
                int Str3 = (int) RanStr2;

                double RanDex2 = dice();
                if (RanDex2 >= 16) {
                    RanDex2 = RanDex2 + (Math.random() * 1000 % 6 + 1);
                }
                int Dex3 = (int) RanDex2;

                double RanCon2 = dice();
                if (RanCon2 >= 16) {
                    RanCon2 = RanCon2 + (Math.random() * 1000 % 6 + 1);
                }
                int Con3 = (int) RanCon2;

                double RanInt2 = dice();
                if (RanInt2 >= 16) {
                    RanInt2 = RanInt2 + (Math.random() * 1000 % 6 + 1);
                }
                int Int3 = (int) RanInt2;

                double RanWis2 = dice();
                if (RanWis2 >= 16) {
                    RanWis2 = RanWis2 + (Math.random() * 1000 % 6 + 1);
                }
                int Wis3 = (int) RanWis2;

                double RanCha2 = dice();
                if (RanCha2 >= 16) {
                    RanCha2 = RanCha2 + (Math.random() * 1000 % 6 + 1);
                }
                int Cha3 = (int) RanCha2;

                System.out.println("Attribute score of Strength assigned is: " + Str3);
                System.out.println("Attribute score of Dexterity assigned is: " + Dex3);
                System.out.println("Attribute score of Constitution assigned is: " + Con3);
                System.out.println("Attribute score of Intelligent assigned is: " + Int3);
                System.out.println("Attribute score of Wisdom assigned is: " + Wis3);
                System.out.println("Attribute score of Charisma assigned is: " + Cha3);
                break;

            case 4:
                System.out.println("The character class you have chosen is " + Character.characterClasses[charClass - 1]);
                if (charClass == 1) {
                    double x = (Math.random() * 1000 % 6 + 1);
                    double Droll2 = (Math.random() * 1000 % 6 + 1);
                    double Droll3 = (Math.random() * 1000 % 6 + 1);
                    double Droll4 = (Math.random() * 1000 % 6 + 1);
                    double Droll5 = (Math.random() * 1000 % 6 + 1);
                    double Droll6 = (Math.random() * 1000 % 6 + 1);
                    double Droll7 = (Math.random() * 1000 % 6 + 1);
                    double Droll8 = (Math.random() * 1000 % 6 + 1);
                    double Droll9 = (Math.random() * 1000 % 6 + 1);
                    double RanStr3 = Math.max(Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6)), Math.max(Droll7, Droll8));
                    RanStr3 = Math.max(RanStr3, Droll9);
                    int Str4 = (int) RanStr3;

                    double RanDex3 = Math.max(Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6)), Math.max(Droll7, Droll8));
                    int Dex4 = (int) RanDex3;

                    double RanCon3 = Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6));
                    RanCon3 = Math.max(RanCon3, Droll9);
                    int Con4 = (int) RanCon3;

                    double RanWis3 = Math.max(Math.max(Math.max(x, x), Math.max(x, x)), Math.max(x, x));
                    int Wis4 = (int) RanCon3;

                    double RanInt3 = Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4));
                    RanInt3 = Math.max(RanInt3, Droll5);
                    int Int4 = (int) RanInt3;

                    double RanCha3 = Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4));
                    int Cha4 = (int) RanCha3;

                } else if (charClass == 2) {
                    double x = (Math.random() * 1000 % 6 + 1);
                    double Droll2 = (Math.random() * 1000 % 6 + 1);
                    double Droll3 = (Math.random() * 1000 % 6 + 1);
                    double Droll4 = (Math.random() * 1000 % 6 + 1);
                    double Droll5 = (Math.random() * 1000 % 6 + 1);
                    double Droll6 = (Math.random() * 1000 % 6 + 1);
                    double Droll7 = (Math.random() * 1000 % 6 + 1);
                    double Droll8 = (Math.random() * 1000 % 6 + 1);
                    double Droll9 = (Math.random() * 1000 % 6 + 1);
                    double RanCha4 = Math.max(Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6)), Math.max(Droll7, Droll8));
                    RanCha4 = Math.max(RanCha4, Droll9);
                    int Cha5 = (int) RanCha4;

                    double RanCon4 = Math.max(Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6)), Math.max(Droll7, Droll8));
                    int Con5 = (int) RanCon4;

                    double RanInt4 = Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll2, Droll3)), Math.max(Droll4, Droll5));
                    RanInt4 = Math.max(RanInt4, Droll6);
                    int Int5 = (int) RanCon4;

                    double RanDex4 = Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6));
                    int Dex5 = (int) RanDex4;

                    double RanStr4 = Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4));
                    RanStr4 = Math.max(RanStr4, Droll5);
                    int Str5 = (int) RanStr4;

                    double RanWis4 = Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4));
                    int Wis5 = (int) RanWis4;

                } else if (charClass == 3) {
                    double x = (Math.random() * 1000 % 6 + 1);
                    double Droll2 = (Math.random() * 1000 % 6 + 1);
                    double Droll3 = (Math.random() * 1000 % 6 + 1);
                    double Droll4 = (Math.random() * 1000 % 6 + 1);
                    double Droll5 = (Math.random() * 1000 % 6 + 1);
                    double Droll6 = (Math.random() * 1000 % 6 + 1);
                    double Droll7 = (Math.random() * 1000 % 6 + 1);
                    double Droll8 = (Math.random() * 1000 % 6 + 1);
                    double Droll9 = (Math.random() * 1000 % 6 + 1);
                    double RanWis5 = Math.max(Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6)), Math.max(Droll7, Droll8));
                    RanWis5 = Math.max(RanWis5, Droll9);
                    int Wis6 = (int) RanWis5;

                    double RanCon5 = Math.max(Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6)), Math.max(Droll7, Droll8));
                    int Con6 = (int) RanCon5;

                    double RanStr5 = Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6));
                    RanStr5 = Math.max(RanStr5, Droll7);
                    int Str6 = (int) RanStr5;

                    double RanDex5 = Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6));
                    int Dex6 = (int) RanDex5;

                    double RanCha5 = Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4));
                    RanCha5 = Math.max(RanCha5, x);
                    int Cha6 = (int) RanCha5;

                    double RanInt5 = Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4));
                    int Int6 = (int) RanInt5;

                } else if (charClass == 4) {
                    double x = (Math.random() * 1000 % 6 + 1);
                    double Droll2 = (Math.random() * 1000 % 6 + 1);
                    double Droll3 = (Math.random() * 1000 % 6 + 1);
                    double Droll4 = (Math.random() * 1000 % 6 + 1);
                    double Droll5 = (Math.random() * 1000 % 6 + 1);
                    double Droll6 = (Math.random() * 1000 % 6 + 1);
                    double Droll7 = (Math.random() * 1000 % 6 + 1);
                    double Droll8 = (Math.random() * 1000 % 6 + 1);
                    double Droll9 = (Math.random() * 1000 % 6 + 1);
                    double RanWis6 = Math.max(Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6)), Math.max(Droll7, Droll8));
                    RanWis6 = Math.max(RanWis6, Droll8);
                    int Wis7 = (int) RanWis6;

                    double RanCon6 = Math.max(Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6)), Math.max(Droll7, Droll8));
                    int Con7 = (int) RanCon6;

                    double RanDex6 = Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll5, Droll3)), Math.max(Droll4, Droll6));
                    RanDex6 = Math.max(RanDex6, Droll7);
                    int Dex7 = (int) RanDex6;

                    double RanStr6 = Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6));
                    int Str7 = (int) RanStr6;

                    double RanInt6 = Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4));
                    RanInt6 = Math.max(RanInt6, Droll5);
                    int Int7 = (int) RanInt6;

                    double RanCha6 = Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4));
                    int Cha7 = (int) RanCha6;

                } else if (charClass == 5) {
                    double x = (Math.random() * 1000 % 6 + 1);
                    double Droll2 = (Math.random() * 1000 % 6 + 1);
                    double Droll3 = (Math.random() * 1000 % 6 + 1);
                    double Droll4 = (Math.random() * 1000 % 6 + 1);
                    double Droll5 = (Math.random() * 1000 % 6 + 1);
                    double Droll6 = (Math.random() * 1000 % 6 + 1);
                    double Droll7 = (Math.random() * 1000 % 6 + 1);
                    double Droll8 = (Math.random() * 1000 % 6 + 1);
                    double Droll9 = (Math.random() * 1000 % 6 + 1);
                    double RanStr7 = Math.max(Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6)), Math.max(Droll7, Droll8));
                    RanStr7 = Math.max(RanStr7, Droll9);
                    int Str8 = (int) RanStr7;

                    double RanCon7 = Math.max(Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6)), Math.max(Droll7, Droll8));
                    int Con8 = (int) RanCon7;

                    double RanDex7 = Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6));
                    RanDex7 = Math.min(RanDex7, Droll7);
                    int Dex8 = (int) RanDex7;

                    double RanWis7 = Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6));
                    int Wis8 = (int) RanWis7;

                    double RanInt7 = Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4));
                    RanInt7 = Math.min(RanInt7, Droll5);
                    int Int8 = (int) RanInt7;

                    double RanCha7 = Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4));
                    int Cha8 = (int) RanCha7;

                } else if (charClass == 6) {
                    double x = (Math.random() * 1000 % 6 + 1);
                    double Droll2 = (Math.random() * 1000 % 6 + 1);
                    double Droll3 = (Math.random() * 1000 % 6 + 1);
                    double Droll4 = (Math.random() * 1000 % 6 + 1);
                    double Droll5 = (Math.random() * 1000 % 6 + 1);
                    double Droll6 = (Math.random() * 1000 % 6 + 1);
                    double Droll7 = (Math.random() * 1000 % 6 + 1);
                    double Droll8 = (Math.random() * 1000 % 6 + 1);
                    double Droll9 = (Math.random() * 1000 % 6 + 1);
                    double RanStr8 = Math.max(Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6)), Math.max(Droll7, Droll8));
                    RanStr8 = Math.max(RanStr8, Droll9);
                    int Str9 = (int) RanStr8;

                    double RanCon8 = Math.max(Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6)), Math.max(Droll7, Droll8));
                    int Con9 = (int) RanCon8;

                    double RanWis8 = Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4)), Math.max(Droll5, Droll6));
                    RanWis8 = Math.max(RanWis8, Droll6);
                    int Wis9 = (int) RanWis8;

                    double RanDex8 = Math.max(Math.max(Math.max(x, Droll2), Math.max(Droll2, Droll3)), Math.max(Droll4, Droll5));
                    int Dex9 = (int) RanDex8;

                    double RanInt8 = Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4));
                    RanInt8 = Math.max(RanInt8, Droll5);
                    int Int9 = (int) RanInt8;

                    double RanCha8 = Math.max(Math.max(x, Droll2), Math.max(Droll3, Droll4));
                    int Cha9 = (int) RanCha8;

                } else if (charClass == 7) {
                    double x = (Math.random() * 1000 % 6 + 1);
                    double RanStr9 = Math.max(Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.min((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.min((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    RanStr9 = Math.max(RanStr9, (Math.random() * 1000 % 6 + 1));
                    int Str10 = (int) RanStr9;

                    double RanCon9 = Math.max(Math.max(Math.max(Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    int Con10 = (int) RanCon9;

                    double RanCha9 = Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    RanCha9 = Math.max(RanCha9, (Math.random() * 1000 % 6 + 1));
                    int Cha10 = (int) RanCha9;

                    double RanDex9 = Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    int Dex10 = (int) RanDex9;

                    double RanInt9 = Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    RanInt9 = Math.max(RanInt9, (Math.random() * 1000 % 6 + 1));
                    int Int10 = (int) RanInt9;

                    double RanWis9 = Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    int Wis9 = (int) RanWis9;

                } else if (charClass == 8) {
                    double x = (Math.random() * 1000 % 6 + 1);
                    double RanStr10 = Math.max(Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    RanStr10 = Math.max(RanStr10, (Math.random() * 1000 % 6 + 1));
                    int Str11 = (int) RanStr10;

                    double RanCon10 = Math.max(Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    int Con11 = (int) RanCon10;

                    double RanDex10 = Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    RanDex10 = Math.max(RanDex10, (Math.random() * 1000 % 6 + 1));
                    int Dex11 = (int) RanDex10;

                    double RanWis10 = Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    int Wis11 = (int) RanWis10;

                    double RanInt10 = Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    RanInt10 = Math.max(RanInt10, (Math.random() * 1000 % 6 + 1));
                    int Int11 = (int) RanInt10;

                    double RanCha10 = Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    int Cha11 = (int) RanCha10;

                } else if (charClass == 9) {
                    double x = (Math.random() * 1000 % 6 + 1);
                    double RanDex11 = Math.max(Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    RanDex11 = Math.max(RanDex11, (Math.random() * 1000 % 6 + 1));
                    int Dex12 = (int) RanDex11;

                    double RanCon11 = Math.max(Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    int Con12 = (int) RanCon11;

                    double RanInt11 = Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    RanInt11 = Math.max(RanInt11, (Math.random() * 1000 % 6 + 1));
                    int Int12 = (int) RanInt11;

                    double RanStr11 = Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    int Str12 = (int) RanStr11;

                    double RanWis11 = Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    RanWis11 = Math.min(RanWis11, (Math.random() * 1000 % 6 + 1));
                    int Wis12 = (int) RanWis11;

                    double RanCha11 = Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    int Cha12 = (int) RanCha11;

                } else if (charClass == 10) {
                    double x = (Math.random() * 1000 % 6 + 1);
                    double RanCha12 = Math.max(Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    RanCha12 = Math.max(RanCha12, (Math.random() * 1000 % 6 + 1));
                    int Cha13 = (int) RanCha12;

                    double RanCon12 = Math.max(Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    int Con13 = (int) RanCon12;

                    double RanDex12 = Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    RanDex12 = Math.max(RanDex12, (Math.random() * 1000 % 6 + 1));
                    int Dex13 = (int) RanDex12;

                    double RanInt12 = Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    int Int13 = (int) RanInt12;

                    double RanWis12 = Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    RanWis12 = Math.max(RanWis12, (Math.random() * 1000 % 6 + 1));
                    int Wis13 = (int) RanWis12;

                    double RanStr12 = Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    int Str13 = (int) RanStr12;

                } else if (charClass == 11) {
                    double x = (Math.random() * 1000 % 6 + 1);
                    double RanInt13 = Math.max(Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    RanInt13 = Math.max(RanInt13, (Math.random() * 1000 % 6 + 1));
                    int Int14 = (int) RanInt13;

                    double RanCon13 = Math.max(Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), x)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    int Con14 = (int) RanCon13;

                    double RanDex13 = Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    RanDex13 = Math.max(RanDex13, (Math.random() * 1000 % 6 + 1));
                    int Dex14 = (int) RanDex13;

                    double RanWis13 = Math.max(Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1))), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    int Wis14 = (int) RanWis13;

                    double RanStr13 = Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    RanStr13 = Math.max(RanStr13, (Math.random() * 1000 % 6 + 1));
                    int Str14 = (int) RanStr13;

                    double RanCha13 = Math.max(Math.max(x, (Math.random() * 1000 % 6 + 1)), Math.max((Math.random() * 1000 % 6 + 1), (Math.random() * 1000 % 6 + 1)));
                    int Cha14 = (int) RanCha13;
                    break;



                }

        }File DnDfile = new File("Coursework5.txt");
        FileWriter DndFile = new FileWriter(DnDfile,true);
        PrintWriter dndFile = new PrintWriter(DndFile, true);

        System.out.println("Do you wish to save your character statistics on a file? Select 'y' for Yes or 'n' for No");
        char savefile = sc.next().charAt(0);
        switch(savefile){
            case 'y':
            case 'Y':
                dndFile.println("Character Class :" + Character.characterClasses[charClass - 1]);
                dndFile.println("Level: " + Level);
                break;
            case 'n':
            case 'N':
                return;

        }


    }

    private static double dice() {
        double diceRoll_1 = Math.floor(Math.random() * 1000 % 6 + 1);
        double diceRoll_2 = Math.floor(Math.random() * 1000 % 6 + 1);
        double diceRoll_3 = Math.floor(Math.random() * 1000 % 6 + 1);
        double diceRoll_4 = Math.floor(Math.random() * 1000 % 6 + 1);
        double minRoll = Math.min(Math.min(diceRoll_1, diceRoll_2), Math.min(diceRoll_3, diceRoll_4));
        double Roll = ((diceRoll_1 + diceRoll_2 + diceRoll_3 + diceRoll_4) - minRoll);
        return Roll;
    }
}
