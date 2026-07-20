package EscapeRoomGame;

import java.util.Scanner;

class EscapeRoomGame {
Scanner sc = new Scanner(System.in);
int lives = 3;

public void startGame() {
System.out.println("================================");
System.out.println(" ESCAPE ROOM GAME");
System.out.println("================================");
System.out.println("You have " + lives + " lives.");

if (!room1()) return;
if (!room2()) return;
if (!room3()) return;
if (!room4()) return;

System.out.println("\n************************");
System.out.println("EXIT DOOR OPENS!");
System.out.println("YOU ESCAPED!");
System.out.println("************************");
}

public boolean room1() {
while (lives > 0) {
try {
System.out.println("\nRoom 1 - Guess the Number");
System.out.print("Guess a number between 1 and 10: ");
int guess = sc.nextInt();

if (guess == 7) {
System.out.println("Correct! Room 2 unlocked.");
return true;
} else {
lives--;
System.out.println("Wrong! Lives left: " + lives);
}
} catch (Exception e) {
System.out.println("Invalid input! Enter a number.");
sc.nextLine();
}
}
gameOver();
return false;
}

public boolean room2() {
while (lives > 0) {
try {
System.out.println("\nRoom 2 - Array Puzzle");
int[] arr = {5, 10, 15, 20};
System.out.print("What is arr[2]? ");
int ans = sc.nextInt();

if (ans == arr[2]) {
System.out.println("Correct! Room 3 unlocked.");
return true;
} else {
lives--;
System.out.println("Wrong! Lives left: " + lives);
}
} catch (Exception e) {
System.out.println("Invalid input!");
sc.nextLine();
}
}
gameOver();
return false;
}

public boolean room3() {
while (lives > 0) {
try {
System.out.println("\nRoom 3 - String Puzzle");
System.out.print("Reverse of JAVA: ");
String ans = sc.next();

if (ans.equalsIgnoreCase("AVAJ")) {
System.out.println("Correct! Room 4 unlocked.");
return true;
} else {
lives--;
System.out.println("Wrong! Lives left: " + lives);
}
} catch (Exception e) {
System.out.println("Invalid input!");
sc.nextLine();
}
}
gameOver();
return false;
}

public boolean room4() {
while (lives > 0) {
try {
System.out.println("\nRoom 4 - Java MCQ");
System.out.println("Which keyword is used to inherit a class?");
System.out.println("1. implements");
System.out.println("2. extends");
System.out.println("3. import");
System.out.println("4. package");
System.out.print("Enter your choice: ");

int choice = sc.nextInt();

if (choice == 2) {
System.out.println("Correct!");
return true;
} else {
lives--;
System.out.println("Wrong! Lives left: " + lives);
}
} catch (Exception e) {
System.out.println("Invalid input!");
sc.nextLine();
}
}
gameOver();
return false;
}

public void gameOver() {
System.out.println("\nGAME OVER!");
System.out.println("You lost all your lives.");
}
}

public class Main {
public static void main(String[] args) {
EscapeRoomGame game = new EscapeRoomGame();
game.startGame();
}

}
    

