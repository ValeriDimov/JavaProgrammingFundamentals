package Exams.Mid;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class T03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> inputList = Arrays.stream(input.split("\\s+")).collect(Collectors.toList());
        int movesCount = 0;
        String pairs = scanner.nextLine();
        boolean isListEmpty = false;

        while (!pairs.equals("end")) {
            String[] pairsArray = pairs.split("\\s+");
            int firstIndex = Integer.parseInt(pairsArray[0]);
            int secondIndex = Integer.parseInt(pairsArray[1]);
            movesCount++;

            if ((firstIndex < 0 || firstIndex >= inputList.size()) || (secondIndex < 0 || secondIndex >= inputList.size())) {
                System.out.println("Invalid input! Adding additional elements to the board");
                String insertElements = String.format("-%da", movesCount);
                inputList.add(inputList.size() / 2, insertElements);
                inputList.add(inputList.size() / 2, insertElements);
                pairs = scanner.nextLine();
                continue;
            }

            if (inputList.get(firstIndex).equals(inputList.get(secondIndex))) {
                if (firstIndex > secondIndex) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", inputList.get(firstIndex));
                    inputList.remove(firstIndex);
                    inputList.remove(secondIndex);

                } else if (secondIndex > firstIndex) {
                    System.out.printf("Congrats! You have found matching elements - %s!%n", inputList.get(firstIndex));
                    inputList.remove(secondIndex);
                    inputList.remove(firstIndex);

                } else {
                    System.out.println("Invalid input! Adding additional elements to the board");
                    String insertElements = String.format("-%da", movesCount);
                    inputList.add(inputList.size() / 2, insertElements);
                    inputList.add(inputList.size() / 2, insertElements);
                }
            } else {
                System.out.println("Try again!");
            }

            if (inputList.size() == 0) {
                isListEmpty = true;
                break;
            }

            pairs = scanner.nextLine();
        }
        if (isListEmpty) {
            System.out.printf("You have won in %d turns!", movesCount);
        } else {
            System.out.println("Sorry you lose :(");
            for ( String temp : inputList) {
                System.out.print(temp + " ");
            }
        }
    }
}
