import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Exceptions {
	
	public static void main(String[] args) {
		
		System.out.println("Try/Catch Implementations");
		System.out.println("**************************");
		try {
			int[] numbers = {3,6,2,4};
			for(int i =0 ; i <= numbers.length; i++) {
				System.out.println(numbers[i]);
			}
		}catch(IndexOutOfBoundsException e){
			System.out.println("Exception thrown : "+ e);
		}
		
		System.out.println("Try/finally Implementations");
		System.out.println("**************************");
		try {
			int a[] = {3,54,21,34};
			for(int value: a) {
				System.out.print(value+ " ,");
			}
		}finally {
			System.out.println();
			System.out.println("finally Block executed successfully");
		}
		
		System.out.println("Try-with-resource Implementations");
		System.out.println("**************************");
		Path file = Paths.get("Files/names2");
		
		try( BufferedReader br = Files.newBufferedReader(file)){
			StringBuilder sb = new StringBuilder();
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch(IOException e){
			System.out.println(e);
		}
		System.out.println("Try/multiple-catch Implementations");
		System.out.println("**************************");
		try {
			int[] a = {3,2,4,2};
			System.out.println("Accessing 8th element of an array which does'nt exist");
			System.out.println(a[7]);
			Object i = a[2];
			String valueOfA = (String)i;
			System.out.println(valueOfA);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Exception Occur: "+ e);
		}catch(ClassCastException e) {
			System.out.println("Exception Occur: "+ e);
		}catch(Exception e) {
			System.out.println("Exception Occured: "+ e);
		}
		
	}

}
