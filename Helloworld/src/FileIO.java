import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {

	
				public static void main(String[] args) throws IOException {
					String sourceFile = "E:/source/new.txt";
					String destinationFile = "E:/destination" + File.separator + "copyfile.txt";
			
					copyFile(sourceFile, destinationFile);
				}
			
				/**
				 * Method to copy an image file
				 * 
				 * @param sourceFile
				 * @param destinationFile
				 * @throws IOException
				 */
				private static void copyFile(String sourceFile, String destinationFile) throws IOException {
					File inputFile = new File(sourceFile);
					FileInputStream fileInputStream = new FileInputStream(inputFile);
					FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);
					int c;
				while ((c = fileInputStream.read()) != -1) {
						fileOutputStream.write(c);
					}
					fileOutputStream.close();
					fileInputStream.close();
				}
	
	}

