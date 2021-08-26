package RealFinalExamFundamentals;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProblemThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> followerCommentsMap = new TreeMap<>();
        Map<String, Integer> followerLikesMap = new TreeMap<>();

        while (!input.equals("Log out")) {
            String[] inputArray = input.split(": ");
            String command = inputArray[0];
            String username = inputArray[1];

            switch (command) {
                case "New follower":
                    if (!followerCommentsMap.containsKey(username)) {
                        followerCommentsMap.put(username, 0);
                        followerLikesMap.put(username, 0);
                    }
                    break;
                case "Like":
                    int countLikes = Integer.parseInt(inputArray[2]);
                    if (followerLikesMap.containsKey(username)) {
                        int tempLikes = followerLikesMap.get(username);
                        followerLikesMap.put(username, countLikes + tempLikes);
                    } else {
                        followerLikesMap.put(username, countLikes);
                        followerCommentsMap.put(username, 0);
                    }
                    break;
                case "Comment":
                    int countComments = 1;
                    if (followerCommentsMap.containsKey(username)) {
                        int tempComments = followerCommentsMap.get(username);
                        followerCommentsMap.put(username, countComments + tempComments);
                    } else {
                        followerCommentsMap.put(username, countComments);
                        followerLikesMap.put(username, 0);
                    }
                    break;
                case "Blocked":
                    if (followerCommentsMap.containsKey(username)) {
                        followerCommentsMap.remove(username);
                        followerLikesMap.remove(username);
                    } else {
                        System.out.printf("%s doesn't exist.%n", username);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d followers%n", followerCommentsMap.size());
        Map<String, Integer> commentsAndLikesMap = new TreeMap<>();

        followerLikesMap
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(follower -> {
                    String tempFollower = follower.getKey();
                    commentsAndLikesMap.put(tempFollower, follower.getValue() + followerCommentsMap.get(tempFollower));
                });

        commentsAndLikesMap
                .entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(follower -> {
                    System.out.printf("%s: %d%n",follower.getKey(), follower.getValue());
                });
    }
}
