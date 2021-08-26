package TextProcessing.Exercise;

import java.util.Scanner;

public class T03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] pathArray = input.split("\\\\");

        String fileNameAndExtension = pathArray[pathArray.length - 1];
        String[] fileNameAndExtensionArray = fileNameAndExtension.split("\\.");
        String fileName = fileNameAndExtensionArray[0];
        String extension = fileNameAndExtensionArray[1];

        System.out.printf("File name: %s%nFile extension: %s", fileName, extension);
    }
}
