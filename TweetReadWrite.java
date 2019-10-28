import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.io.IOException;

public class TweetReadWrite {
	public static void main(String[] args) {
		clearConsole();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int tweetType = scanner.nextInt();
			switch (tweetType) {
			case 1:
				clearConsoleAndwelcomeToTweetType(tweetType);
				while (scanner.hasNext()) {
					try {
						int changeTweetType = scanner.nextInt();
						clearConsole();
						break;
					} catch (InputMismatchException ime) {
						String tweet = scanner.nextLine();
						System.out.println();
						clearConsoleAndEnterTweet(1, tweet);
					}
				}
				break;
			case 2:
				clearConsoleAndwelcomeToTweetType(tweetType);
				while (scanner.hasNext()) {
					try {
						int changeTweetType = scanner.nextInt();
						clearConsole();
						break;
					} catch (InputMismatchException ime) {
						String tweet = scanner.nextLine();
						System.out.println();
						clearConsoleAndEnterTweet(2, tweet);
					}
				}
				break;
			case 3:
				clearConsoleAndwelcomeToTweetType(tweetType);
				while (scanner.hasNext()) {
					try {
						int changeTweetType = scanner.nextInt();
						clearConsole();
						break;
					} catch (InputMismatchException ime) {
						String tweet = scanner.nextLine();
						System.out.println();
						clearConsoleAndEnterTweet(3, tweet);
					}
				}
				break;
			case 4:
				clearConsoleAndwelcomeToTweetType(tweetType);
				while (scanner.hasNext()) {
					try {
						int changeTweetType = scanner.nextInt();
						clearConsole();
						break;
					} catch (InputMismatchException ime) {
						String tweet = scanner.nextLine();
						System.out.println();
						clearConsoleAndEnterTweet(4, tweet);
					}
				}
				break;
			case 5:
				clearConsoleAndwelcomeToTweetType(tweetType);
				while (scanner.hasNext()) {
					try {
						int changeTweetType = scanner.nextInt();
						clearConsole();
						break;
					} catch (InputMismatchException ime) {
						String tweet = scanner.nextLine();
						System.out.println();
						clearConsoleAndEnterTweet(5, tweet);
					}
				}
				break;
			default:
				clearConsole();
			}
		}
	}

	public static void clearConsole() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("\n\n\n\n\n\n");
		System.out.println("                  ---------------------------------------                  ");
		System.out.println("                  ---------------------------------------                  ");
		System.out.println("                  ----- PLEASE ENTER A TWEET TYPE -------                  ");
		System.out.println("                  ----- 1 for Baseball ------------------                  ");
		System.out.println("                  ----- 2 for Basketball ----------------                  ");
		System.out.println("                  ----- 3 for Movies --------------------                  ");
		System.out.println("                  ----- 4 for Books ---------------------                  ");
		System.out.println("                  ----- 5 for Computers -----------------                  ");
		System.out.println("                  ---------------------------------------                  ");
		System.out.println("                  ---------------------------------------                  ");
		System.out.println("                  ----- Any non number to EXIT ----------                  ");
		System.out.println("                  ---------------------------------------                  \n\n\n");
	}

	public static void clearConsoleAndwelcomeToTweetType(int tweetType) {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("\n\n\n\n\n\n");
		System.out.println("                  ---------------------------------------                  ");
		System.out.println("                  ---------------------------------------                  ");
		System.out.println("                  ----- PLEASE ENTER A TWEET ABOUT ------                  ");
		switch (tweetType) {
		case 1:
			System.out.println("                  ------------- BASEBALL ----------------                  ");
			break;
		case 2:
			System.out.println("                  ------------- BASKETBALL --------------                  ");
			break;
		case 3:
			System.out.println("                  ------------- MOVIES ------------------                  ");
			break;
		case 4:
			System.out.println("                  ------------- BOOKS -------------------                  ");
			break;
		case 5:
			System.out.println("                  ------------- COMPUTERS ---------------                  ");
			break;
		}
		System.out.println("                  ---------------------------------------                  \n\n\n");
	}

	public static void clearConsoleAndEnterTweet(int tweetType, String tweet) {
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println("\n\n\n\n\n\n");
		System.out.println("                  ---------------------------------------                  ");

		switch (tweetType) {
		case 1:
			System.out.println("                  -------- YOUR BASEBALL TWEET ----------                  ");
			break;
		case 2:
			System.out.println("                  ------ YOUR BASKETBALL TWEET ----------                  ");
			break;
		case 3:
			System.out.println("                  --------- YOUR MOVIES TWEET -----------                  ");
			break;
		case 4:
			System.out.println("                  --------- YOUR BOOKS TWEET ------------                  ");
			break;
		case 5:
			System.out.println("                  ------- YOUR COMPUTERS TWEET ----------                  ");
			break;
		}
		System.out.println("                  ---------------------------------------                  \n\n\n");
		wrteIntoFile(tweetType, tweet);
		System.out.println("YOUR TWEET: \n\n *** " + tweet + " *** \n\n");
		System.out.println("\n\n\n");
		System.out.print("                  ----- PLEASE ENTER A TWEET ABOUT ");
		switch (tweetType) {
		case 1:
			System.out.println("** BASEBALL ** ------------------\n\n");
			break;
		case 2:
			System.out.println("** BASKETBALL ** ------------\n\n");
			break;
		case 3:
			System.out.println("** MOVIES ** --------------------\n\n");
			break;
		case 4:
			System.out.println("** BOOKS ** --------------------\n\n");
			break;
		case 5:
			System.out.println("** COMPUTERS ** -----------------\n\n");
			break;
		}
		System.out
				.println("                  ----- OR ENTER A NUMBER TO MOVE TO THE MAIN MENU -----------------\n\n\n");
	}

	public static void wrteIntoFile(int tweetType, String tweet) {

		List<String> newLines = new ArrayList<>();
		File fileName = new File("baseball.txt");
		fileName = new File("basketball.txt");
		fileName = new File("movies.txt");
		fileName = new File("books.txt");
		fileName = new File("computers.txt");
		switch (tweetType) {
		case 1:
			fileName = new File("baseball.txt");
			break;
		case 2:
			fileName = new File("basketball.txt");
			break;
		case 3:
			fileName = new File("movies.txt");
			break;
		case 4:
			fileName = new File("books.txt");
			break;
		case 5:
			fileName = new File("computers.txt");
			break;
		}
		try {
			fileName.createNewFile();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		try {
			for (String line : Files.readAllLines(fileName.toPath(), StandardCharsets.UTF_8)) {
				newLines.add(line);
			}
			newLines.add(tweet);
			Files.write(fileName.toPath(), newLines, StandardCharsets.UTF_8);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}

/*******
 * References: https://www.baeldung.com/java-console-input-output
 * https://stackoverflow.com/questions/2979383/java-clear-the-console
 * https://www.journaldev.com/878/java-write-to-file
 *********/