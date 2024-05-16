import java.io.File;
import java.util.Scanner;

public class bai1 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập đường dẫn file: ");
	        String filePath = scanner.nextLine();
	        
	        File file = new File(filePath);
	        if (file.exists() && file.isFile()) {
	            long fileSize = file.length();
	            System.out.println("Độ lớn của file: " + fileSize + " bytes");
	        } else {
	            System.out.println("File không tồn tại hoặc không phải là file.");
	        }
	        
	        scanner.close();
	    }
	
}
