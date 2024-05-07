import java.util.Random;
import java.util.Scanner;

public class WordSearchGame {
    private static final int GRID_SIZE = 8;
    private static final char[][] grid = new char[GRID_SIZE][GRID_SIZE];

    private static final Random random = new Random();
    private static final String[] words = {"JAVA", "PYTHON", "CLOUD", "COMPUTER", "PROGRAMMING"};
    
    public static void main(String[] args) {
        initializeGrid();
        printGrid();
        
        String targetWord = getRandomWord();
        System.out.println("Find the word: " + targetWord);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your guess: ");
        String guess = scanner.nextLine().toUpperCase();
        
        if (guess.equals(targetWord)) {
            System.out.println("Congratulations! You found the word.");
        } else {
            System.out.println("Sorry, the word was not found.");
        }
        
        scanner.close();
    }
    
    private static void initializeGrid() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                grid[i][j] = (char) (random.nextInt(26) + 'A'); // Random uppercase letter
            }
        }
    }
    
    private static void printGrid() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private static String getRandomWord() {
        return words[random.nextInt(words.length)];
    }
}
