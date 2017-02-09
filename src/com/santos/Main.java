package com.santos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)throws Exception {
        String dogName = "";
        int input = 0, hunger = 0, hygiene = 0, fun = 0, tries = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your dog's name: ");
        dogName = br.readLine();

        do {
            displayMenu(dogName);
            System.out.print("Input: ");
            input = Integer.parseInt(br.readLine());

            switch (input){
                case 1:
                    System.out.println("\n\nPet feeded.");
                    hunger+=5;
                    hygiene-=4;
                    fun+=1;
                    tries++;
                    break;
                case 2:
                    System.out.println("\n\nPet cleaned.");
                    hunger-=2;
                    hygiene+=5;
                    fun-=4;
                    tries++;
                    break;
                case 3:
                    System.out.println("\n\nPlayed with pet.");
                    hunger-=4;
                    hygiene-=4;
                    fun+=5;
                    tries++;
                    break;
                case 4:
                    System.out.println("\n\n\nPet's status: " +
                            "\n---------------" +
                            "\nHunger points: " + hunger +
                            "\nHygiene points: " + hygiene +
                            "\nFun points: " + fun);
                    break;
                case 5:
                    System.out.println("\n\nYou killed your dog! ");

                    break;
                default:
                    System.out.println("\n\nWrong input!");
            }

        }while(input != 5 && displayNeeds(hunger, hygiene, fun) == false);

        System.out.println("\nYour dog survived for " + tries/3 + " day(s)");
    }




    public static void displayMenu(String name){
        System.out.println("\f\n\n\n[1] Feed " + name +
                            "\n[2] Bath " + name +
                            "\n[3] Play with " + name +
                            "\n[4] Dog's Status " +
                            "\n[5] Exit");
    }

    public static boolean displayNeeds(int hunger, int hygiene, int fun){
        if(hunger < -7 || hygiene < -7 || fun < -7){
            System.out.println("\n\nYour dog died! What a pathetic human." +
                                "\n\nFinal Hunger points: " + hunger +
                                "\nFinal Hygiene points: " + hygiene +
                                "\nFinal Fun points: " + fun);
            return true;
        }
        return false;
    }
}
