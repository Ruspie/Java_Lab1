package com.Labs.Main;

import com.Labs.Tasks.Area_Task_2.Point;
import com.Labs.Tasks.Area_Task_2.ShadedArea;
import com.Labs.Tasks.ArrayOfPrime_Task_4.ArrayNumbers;
import com.Labs.Tasks.BasketBalls_Task_9.Ball;
import com.Labs.Tasks.BasketBalls_Task_9.Basket;
import com.Labs.Tasks.Expression_Task_1.Expression;
import com.Labs.Tasks.IncreasingSequence_Task_8.SequencesCombiner;
import com.Labs.Tasks.InscreasingSequence_Task_5.OrderList;
import com.Labs.Tasks.Matrix_Task_6.Matrix_1;
import com.Labs.Tasks.OverridingMethods_Task_12_14.Book;
import com.Labs.Tasks.OverridingMethods_Task_13.ProgrammerBook;
import com.Labs.Tasks.ShellSort_Task_7.ShellSort;
import com.Labs.Tasks.TangentTable_Task_3.TangentTable;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        runFirstTask();
        runSecondTask();
        runThirdTask();
        runFourthTask();
        runFifthTask();
        runSixthTask();
        runSeventhTask();
        runEighthTask();
        runNinthTask();
        runTwelfthTask();
    }

    private static void runFirstTask(){
        System.out.println("First Task:");
        Expression expression = new Expression(15, 11.2);
        System.out.println("Expression = " + expression.getResult());
        System.out.println();
    }

    private static void runSecondTask(){
        System.out.println("Second Task:");
        ShadedArea shadedArea = new ShadedArea();
        Point point = new Point(1.0, -1.0);
        System.out.println("Status finding points {" + point.getX() + ";" + point.getY() + "} in the shaded area is " + shadedArea.inShadedArea(point));;
        System.out.println();
    }

    private static void runThirdTask(){
        TangentTable tangentTable = new TangentTable(0, 3.14, 0.1);
        Map<Double, Double> tangentFunction = tangentTable.getTangentTable();
        System.out.println("Third Task:");
        for(Map.Entry entry : tangentFunction.entrySet()) {
            System.out.print(String.format("%1$5.2f| %2$6.3f", entry.getKey(), entry.getValue()) + System.lineSeparator());
        }
    }

    private static void runFourthTask(){
        System.out.println("Fourth Task:");
        List<Integer> numbers = Arrays.asList(2, 3, 8, 77, 78, 45, 11, 12, 15, 11, 5, 10);
        ArrayNumbers arrayNumbers = new ArrayNumbers(numbers);
        List<Integer> indexPrimeNumber = arrayNumbers.getArrayIndexPrimeNumbers();
        System.out.println("List numbers is " + numbers);
        System.out.println("List index prime numbers is " + indexPrimeNumber);
        System.out.println();
    }

    private static void runFifthTask(){
        System.out.println("Fifth Task:");
        List<Integer> numbers = Arrays.asList(2, 3, 8, 77, 78, 45, 11, 12, 15, 11, 5, 10);
        OrderList orderList = new OrderList(numbers);
        int countUnnecessaryElements = orderList.getNumberUnnecessaryElements();
        System.out.println("List numbers is " + numbers);
        System.out.println("Count unnecessary elements is " + countUnnecessaryElements);
        System.out.println();
    }

    private static void runSixthTask(){
        System.out.println("Sixth Task:");
        List<Double> numbers = Arrays.asList(2.0, 3.0, 8.0, 77.0, 78.0, 45.0, 11.0, 12.0, 15.0, 11.0, 5.0, 10.0);
        Matrix_1 matrix_1 = new Matrix_1(numbers);
        List<List<Double>> matrix = matrix_1.getMatrix();
        System.out.println("List numbers is " + numbers);
        System.out.println("Matrix is :");
        for(List<Double> row: matrix){
            for(Double value: row){
                System.out.print(String.format("%1$6.1f", value));
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void runSeventhTask(){
        System.out.println("Seventh Task:");
        List<Double> numbers = Arrays.asList(2.0, 3.0, 8.0, 77.0, 78.0, 45.0, 11.0, 12.0, 15.0, 11.0, 5.0, 10.0);
        System.out.println("List numbers is " + numbers);
        numbers = ShellSort.Sort(numbers);
        System.out.println("List numbers after sort is " + numbers);
        System.out.println();
    }

    private static void runEighthTask(){
        System.out.println("Eighth Task:");
        List<Double> firstSequence = Arrays.asList(2.0, 5.0, 8.0, 11.0, 15.0);
        System.out.println("First sequence is " + firstSequence);
        List<Double> secondSequence = Arrays.asList(1.0, 3.0, 6.0, 8.0, 10.0, 13.0, 18.0, 21.0);
        System.out.println("Second sequence is " + secondSequence);
        List<Integer> indexInsertInSequence = SequencesCombiner.getIndexInsertInSequence(firstSequence, secondSequence);
        System.out.println("List index insert in sequnce is " + indexInsertInSequence);
        System.out.println();
    }

    private static void runNinthTask(){
        System.out.println("Ninth Task:");
        List<Ball> balls = Arrays.asList(new Ball(Color.black, 5.0), new Ball(Color.blue, 2.2), new Ball(Color.blue, 1.0), new Ball(Color.green, 3.0));
        System.out.println("List of balls is :");
        for(Ball ball: balls){
            System.out.println(String.format("%1$s - %2$3.1f", ball.getColor().toString(), ball.getWeight()));
        }
        Basket basket = new Basket(balls);
        System.out.println("Total weight is " + basket.getBallsWeight());
        System.out.println("Count blue balls in basket is " + basket.getNumberColoredBalls(Color.blue));
        System.out.println();
    }

    private static void runTwelfthTask(){
        System.out.println("Twelfth Task:");

        Book book = new Book("The post office", "Rabindranath Tagore", 40, 0);
        Book.setEdition(1);
        System.out.println(book.toString());

        ProgrammerBook programmerBook = new ProgrammerBook("Effective Java", "Joshua Bloch", 25, 0, "Java", 3);
        Book.setEdition(2);
        System.out.println(programmerBook.toString());

    }
}
