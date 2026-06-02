import java.util.Arrays;
import java.util.Scanner;

public class VincentOpurum {
    public static int[][] scores;
    public static double[] quizTotal;
    public static double[] averagesOfQuizes;
    public static double[] total;
    public static double[] studentsAverage;    
    public static int numOfStudent = 0;
    public static int numOfQuizes = 0;

    public static int[][] getScores(){
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter the number of Students: ");
        numOfStudent = input.nextInt();
        
        System.out.print("Enter the number of Quiz taken: ");
        numOfQuizes = input.nextInt();                 
        scores = new int[numOfStudent][numOfQuizes];
        
        for(int student = 0; student < numOfStudent; student++){            
            System.out.printf("--------Student %d--------- %n", student+1);
            
            for(int quiz = 0; quiz < numOfQuizes; quiz++){
                System.out.printf(" Score for Quiz %.1f: ", quiz+1.0);
                scores[student][quiz] = input.nextInt();
                if(scores[student][quiz] < 0 || scores[student][quiz] > 100){
                    System.out.printf("Invalid Score entered! Score must be between 0 and 100.");
                    quiz--;
                    continue;
                }
                
            }
                System.out.println();
                System.out.println(); 
        }
        return scores;
        
    }
    
    public static double[] getAveragesOfQuizes(int[][] scoresOfStudents){
        quizTotal = new double[numOfQuizes];
        averagesOfQuizes = new double[numOfQuizes];
        for(int quiz = 0; quiz < numOfQuizes; quiz++){
            for(int score = 0; score < numOfStudent; score++){
                quizTotal[quiz] += scoresOfStudents[score][quiz];
            }
            averagesOfQuizes[quiz] = quizTotal[quiz] / numOfStudent;          
        }
        for (int index = 0; index < averagesOfQuizes.length; index++) {
            averagesOfQuizes[index] = Math.round(averagesOfQuizes[index] * 100.0) / 100.0;
        }
        return averagesOfQuizes;   
    }
    
    public static double[] getHighestAverageOfQuizes(double[] average){
        double[] highestAverage = new double[2];
        double max = averagesOfQuizes[0];
        double quizNumber = 0;
            for(int index = 1; index < averagesOfQuizes.length; index++){
                if(averagesOfQuizes[index] > max){
                    max = averagesOfQuizes[index];
                    quizNumber = index;
                }     
            }
        highestAverage[0] = max;
        highestAverage[1] = quizNumber + 1;
        System.out.printf("Highest Average of quizes: %.2f%n", highestAverage[0]);
        System.out.printf("Quiz with highest average: Quiz %.2f%n", highestAverage[1]);
        return highestAverage;
    }
    
    
        public static double[] getTotal(int[][] scoresOfStudents){
        total = new double[scoresOfStudents.length];
        studentsAverage = new double[scoresOfStudents.length];
        for(int student = 0; student < scoresOfStudents.length; student++){
            for(int score = 0; score < scoresOfStudents[student].length; score++){
                total[student] += scoresOfStudents[student][score];
            }
            studentsAverage[student] = total[student] / studentsAverage.length;          
        }
        return total;   
    }
    
    
    public static double[] getAverage(){
        return studentsAverage;
         
    }
           
        
    public static void main(String[] args){
        System.out.println(Arrays.deepToString(getScores()));
        System.out.println("Total Scores: " + Arrays.toString(getTotal(scores)));
        System.out.println("Average Scores: " + Arrays.toString(getAverage())); 
        System.out.println(Arrays.toString(getAveragesOfQuizes(scores)));
        getHighestAverageOfQuizes(averagesOfQuizes);


        
        }      
    }
    
