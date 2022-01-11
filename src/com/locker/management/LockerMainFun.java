package com.locker.management;

//*********************************************************************************************
//Developer Name - Pradyum Agarwal
//Project Name - Company Locker Management Pvt. Ltd.
//Project Type - Assignment Phase 1
//File Name - LockerMainFun.java
//**********************************************************************************************

import java.util.Scanner;


public class LockerMainFun {
	
	public static void main(String[] args) {
		
	
		int user_choice;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			//Options
			System.out.println("\n ********************** Company Lockers Private Ltd.******************************");
			System.out.println("1. To Create a File ");
			System.out.println("2. To Delete a File ");
			System.out.println("3. To Search a File ");
			System.out.println("4. To Retrieve the Existing Files ");
			System.out.println("5. To Exit ");
			System.out.println("\n **********************************************************************************");
			System.out.print("Please enter your choice = ");
			user_choice = sc.nextInt();
			
			switch(user_choice) {
				
				case 1:
					
					//filename to be created
					System.out.print("\nPlease enter filename to be created: ");
					String fileCreate = sc.next();
					
					//to create a specific file
					FileFunction.createFile(fileCreate);
					break;

				
				case 2:
					
					//enter filename to be deleted
					System.out.print("\nEnter filename to be deleted: ");
					String fileDelete = sc.next();
					
					//delete a specific file 
					FileFunction.deleteFile(fileDelete);
					break;
				
				case 3:
					
					//filename to be searched
					System.out.print("\nPlease enter filename to be searched: ");
					String fileSearch = sc.next();
					
					//to search a specific file
					FileFunction.searchFile(fileSearch);
					break;
				
				case 4:
					
					//list all files 
					FileFunction.listFiles();
					break;
					
				case 5:
					
					//Releasing scanner 
					sc.close();
					System.out.print("\n*********Thankyou! Visit Again*********");
					System.exit(1);
					break;
				
				default:
				
					System.out.print("\n*********Option out of Scope. Please choose between 1 to 5*********");
					break;
				
					
				
			}		
			
		}
	}
}