import java.util.Scanner;

public class MessageSystem {
	char[] message;
	private int length;
	private int finalLength = 0;
	
	public MessageSystem() {
		length = 280;
	}
	public MessageSystem(int length) {
		this.length = length;
	}
	
	public void getMessage() {
		//Create keyboard
		Scanner keyboard = new Scanner(System.in);
		
		//Create stop boolean
		boolean stop = false;
		
		//Ask message length
		//System.out.println("How long is your message?");
		//length = keyboard.nextInt();
		
		
		//Create message array
		message = new char[length];
		
		//Ask user for each character of their message
	while (stop == false){
		for (int i = 0; i < message.length; i++) {
			System.out.println("What is char " + (i + 1) + ": (Spaces are -.) ");
			message[i] = keyboard.next().charAt(0);
			finalLength++;
			if (String.valueOf(message[i]).equals(";")) {
				stop = true;
				break;
			}
		}
		}
		keyboard.close();
	}
	
	public void printMessage() {
		//Prints message
		for (int i = 0; i < finalLength; i++) {
			//Prints dashes as spaces, ignores else
			if (String.valueOf(message[i]).equals("-")) {
				System.out.print(" ");
			} else if (String.valueOf(message[i]).equals(";")) {
				System.out.print(" ");
			}
			else {
				System.out.print(message[i]);
			}
		}
	}
}
