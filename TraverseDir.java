import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;


/*
*Traverse a directory using Recursion
*/
public class TraverseDir {

	public static void traverseDir(File folder){
		
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
		    if (file.isFile()) {
		        System.out.println(file.getName());
		    }else if(file.isDirectory()){
		    	traverseDir(file);
		    }
		}
	}
	
	public static void main(String[] args) {
		//Enter file/directory path name below.
		File folder = new File("");
		traverseDir(folder);
	}
}
