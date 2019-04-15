package test;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Jenkin");
		System.out.println("Hello Jenkin");
		System.out.println("Test hello");
		
		  String content = "This is the content to write into file\n";

	        // If the file doesn't exists, create and write to it
			// If the file exists, truncate (remove all content) and write to it
	        try (FileWriter writer = new FileWriter("app.log");
	             BufferedWriter bw = new BufferedWriter(writer)) {

	            bw.write(content);

	        } catch (IOException e) {
	            System.err.format("IOException: %s%n", e);
	        }

	    }

	}

