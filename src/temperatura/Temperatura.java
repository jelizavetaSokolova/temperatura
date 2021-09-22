/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // инимальная и максимальная температура
        int min =-30, max=30;
        //Создаём зубчатый массив из 12 строчек
        int[][] dayTempInYear = new int[12][];
        dayTempInYear[0] = new int[31]; //January
        dayTempInYear[1] = new int[28]; //February
        dayTempInYear[2] = new int[31]; //March
        dayTempInYear[3] = new int[30]; //April
        dayTempInYear[4] = new int[31]; //May
        dayTempInYear[5] = new int[30]; //June
        dayTempInYear[6] = new int[31]; //July
        dayTempInYear[7] = new int[31]; //August
        dayTempInYear[8] = new int[30]; //September
        dayTempInYear[9] = new int[31]; //October
        dayTempInYear[10] = new int[30]; //November
        dayTempInYear[11] = new int[31]; //December
        Random random = new Random();
        for(int i=0;i<dayTempInYear.length; i++){
            for(int j=0; j<dayTempInYear[i].length; j++){
                if(i==11 || i==0 || i==1){
                    min = -30;
                    max = 0;
                }else if(i==2 || i==3 || i==4){
                    min =-5;
                    max =15;
                }else if(i==5 || i==6 || i==7){
                    min =5;
                    max =30;
                }else if(i==8 || i==9 || i==10){
                    min =-10;
                    max =10;
                }
                dayTempInYear[i][j] = random.nextInt(max-min+1)+min;
            }
        }
        for(int i=0;i<dayTempInYear.length; i++){
            for(int j=0; j<dayTempInYear[i].length; j++){ 
                System.out.printf("%4d",dayTempInYear[i][j]);
            }
            System.out.println();
        }
        double [] averageTemperaturInMonth = new double[12];
        for(int i=0;i<dayTempInYear.length; i++){
            int daysInMonth = 0;
            for(int j=0; j<dayTempInYear[i].length; j++){ 
                averageTemperaturInMonth[i]+=(double)dayTempInYear[i][j];
                daysInMonth = j+1;
            }
            averageTemperaturInMonth[i]=averageTemperaturInMonth[i]/daysInMonth;
        }
        System.out.println("Средняя температура по месяцам: ");
        for(int i=0;i<averageTemperaturInMonth.length; i++ ){
            switch (i) {
                case 0:
                    System.out.printf("January: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 1:
                    System.out.printf("February: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 2:
                    System.out.printf("March: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 3:
                    System.out.printf("April: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 4:
                    System.out.printf("May: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 5:
                    System.out.printf("June: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 6:
                    System.out.printf("July: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 7:
                    System.out.printf("August: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 8:
                    System.out.printf("September: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 9:
                    System.out.printf("October: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 10:
                    System.out.printf("November: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
                case 11:
                    System.out.printf("December: %-4.2f%n",averageTemperaturInMonth[i]);
                    break;
            }
        }
        
    }
    
}
