/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112a1vuyogobast10456147;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;

public class Prog6112A1VuyoGobaSt10456147 
{
    
//MAIN METHOD
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); //(Farrell, 2019)
        Student studentClass = new Student(); //(Farrell, 2019)
        int startKey, menuKey, studentCount;
        
        
        studentClass.startScreen();
        
        //MENU SELECTION.
        startKey = scanner.nextInt(); //(Open AI, 2024)
        if (startKey == 1)
            {
                studentClass.menu(); //(Farrell, 2022)
                
                menuKey = scanner.nextInt();//(Open AI, 2024)
                if (menuKey == 1)
                    {
                        studentCount = 1;
                        System.out.println("CAPTURE A NEW STUDENT");
                        System.out.println("***************************");
                        
                        studentClass.getStudentID(); //(Farrell, 2019)
                        
                        studentClass.getStudentName();
                        
                        studentClass.getStudentAge();
                        
                        studentClass.getStudentEmail();
                        
                        studentClass.getStudentCourse();
                        
                        studentClass.studentCount();
                        
                        studentClass.saveStudent();
                    }
                
                if (menuKey == 2)
                {
                    studentClass.searchStudent();
                }
                
                if (menuKey == 3)
                {
                    studentClass.deleteStudent();
                }
                 
                if (menuKey == 4)
                {
                    studentClass.studentReport();
                }
                
                if (menuKey == 5)
                {
                    studentClass.searchStudent();
                }
            }
    }
    
    
    // Student class to hold student information
    static class Student //(Farrell, 2019)
    {
        Scanner scanner = new Scanner(System.in); //(Farrell, 2022)
        
        public String studentName, studentID, studentCourse, studentEmail, saveConfirmed, studentSearch, deleteSearch;
        public int studentAge;
        public String[] arrNames = new String[10]; //(Farrell, 2022)
        public String[] arrEmails = new String[10];
        public String[] arrCourses = new String[10];
        public String[] arrIDs = new String[10];
        public int[] arrAges = new int[10];
        public int studentCount = 1; 
        
        
        public int studentCount() //(Farrell, 2019)
        {
            studentCount = studentCount + 1;
            return studentCount;
        }
        
        //METHOD FOR DISPLAYING THE START DETAILS.
        public void startScreen() //(Farrell, 2019)
        {
        System.out.println("STUDENT MANAGEMENT APPLICATION");//(Farrell, 2022)
        System.out.println("*********************************");
        System.out.println("Enter (1) to lauch menu or any other key to exit.");
        }
        
        //METHOD FOR DISPLAYING THE MENU.
        public void menu() //(Farrell, 2019)
        {
            System.out.println("Please select one of the folllowing menu items:");//(Farrell, 2022)
            System.out.println("(1) Capture a new student");
            System.out.println("(2) Search for a new student");
            System.out.println("(3) Delete a student");
            System.out.println("(4) Print student report");
            System.out.println("(5) Exit application");
        }
        
        //METHOD FOR DISPLAYING THE REPORT.
        public void studentReport() //(Farrell, 2019)
        {
            for (int i = 0; i < 10; i++)//(Farrell, 2022)
            {
                System.out.println("STUDENT " + Integer.toString(i + 1));
                System.out.println("STUDENT ID: " + arrIDs[i]);
                System.out.println("STUDENT NAME: " + arrNames[i]);
                System.out.println("STUDENT AGE: " + Integer.toString(arrAges[i]));
                System.out.println("STUDENT E-MAIL: " + arrEmails[i]);
                System.out.println("STUDENT COURSE: " + arrCourses[i]);
            }
           
        }
        
        //METHOD FOR DELETING A STUDENT;
        public void deleteStudent() //(Farrell, 2019)
        {
            System.out.println("Enter the student ID to delete:");
            deleteSearch = scanner.nextLine(); //(Open AI, 2024)
            
            for (int i = 0; i < 10; i++) //(Farrell, 2022)
            {
                if (deleteSearch == arrIDs[i])
                {
                    System.out.println("Are you sure you want to delete student " + deleteSearch + " from the system ? (Y) or (N)");
                    System.out.println("--------------------------------------------------------------------");
                    arrNames[i] = null;
                    arrCourses[i] = null;
                    arrAges[i] = 0;
                    arrIDs[i] = null;
                    arrEmails[i] = null;
                    System.out.println("Student with student ID " + deleteSearch + " WAS deleted!");
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("Enter (1) to launch menu or any other key to exit");
                    int deleteVar = scanner.nextInt(); //(Open AI, 2024)
                    if (deleteVar == 1) //(Farrell, 2022)
                    {
                        menu();
                    }
                    else
                    {
                        startScreen();
                    }
                }
                else
                {
                    if (i == 10) //(Farrell, 2022)
                    {
                        System.out.println("Student with student ID " + deleteSearch + " is not found.");
                        System.out.println("Enter (1) to lauch menu or any other key to exit.");
                        int deleteVar = scanner.nextInt(); //(Open AI, 2024)
                        if (deleteVar == 1) //(Farrell, 2022)
                        {
                            menu();
                        }
                        else
                        {
                            startScreen();
                        }
                    }
                }
                
            }     
        }
        
        //METHOD FOR SEARCHING A STUDENT.
        public void searchStudent() //(Farrell, 2019)
        {
            System.out.println("Enter the student ID to search: ");
            studentSearch = scanner.nextLine(); //(Open AI, 2024)
            
            for (int i = 0; i < 10; i++)
            {
                if (studentSearch == arrIDs[i])
                {
                    System.out.println("STUDENT ID: " + studentSearch);
                    System.out.println("STUDENT NAME: " + arrNames[i]);
                    System.out.println("STUDENT AGE: " + Integer.toString(arrAges[i]));
                    System.out.println("STUDENT E-MAIL: " + arrEmails[i]);
                    System.out.println("STUDENT COURSE:" + arrCourses[i]);
                }
                else
                {
                    if (i == 10) //(Farrell, 2022)
                    {
                        System.out.println("Student with student ID " + studentSearch + " is not found.");
                        System.out.println("Enter (1) to lauch menu or any other key to exit.");
                        int deleteVar = scanner.nextInt(); //(Open AI, 2024)
                        if (deleteVar == 1)
                        {
                            menu();
                        }
                        else
                        {
                            startScreen();
                        }
                    }
                }
                
            }     
        }
        
        //METHOD FOR STORING THE STUDENT DETAILS.
        public void saveStudent() //(Farrell, 2019)
        {
            arrNames[studentCount -1] = studentName;
            arrIDs[studentCount -1] = studentID;
            arrEmails[studentCount -1] = studentEmail;
            arrCourses[studentCount -1] = studentCourse;
            arrAges[studentCount -1] = studentAge;
            System.out.println("Deatails successfully saved");
        }
        
        //METHOD FOR GETTING THE STUDENT ID.
        public void getStudentID() //(Farrell, 2019)
        {
            System.out.println("Enter the student ID: ");
            studentID = scanner.nextLine(); //(Open AI, 2024)
        }
        
        
        //METHOD FOR GETTING THE STUDENT NAME.
        public void getStudentName() //(Farrell, 2019)
        {
            System.out.println("Enter the student ID: ");
            studentName = scanner.nextLine(); //(Open AI, 2024)
        }
        
        
        //METHOD FOR GETTING THE STUDENT E-MAIL.
        public void getStudentEmail() //(Farrell, 2019)
        {
            System.out.println("Enter the student e-mail: ");
            studentEmail = scanner.nextLine(); //(Open AI, 2024)
        }
        
        
        //METHOD FOR GETTING THE STUDENT AGE.
        public void getStudentAge() //(Farrell, 2019)
        {
            System.out.println("Enter the student age: ");
                        studentAge = scanner.nextInt();
                        if (studentAge < 16) //(Farrell, 2022)
                        {
                            System.out.println("You have entered an incorrect age!");
                            System.out.println("Please re-enter the age>>");
                            studentAge = scanner.nextInt(); //(Open AI, 2024)
                        }
        }
        
        //METHOD FOR GETTING THE STUDENT COURSE.
        public void getStudentCourse() //(Farrell, 2019) 
        {
            System.out.println("Enter the student course: ");
            studentCourse = scanner.nextLine(); //(Open AI, 2024)
        }
    }

}

//REFERENCE LIST:
//Farrell J. 2019. Java Programming. 10th ed. Boston: Cengage.
//Farrell J. 2022. Java Programming. 10th ed. Boston: Cengage.
//Open AI. (2024). ChatGPT [Language model]. https://chatgpt.com/
