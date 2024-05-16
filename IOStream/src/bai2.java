import java.io.File;
import java.util.Scanner;

public class bai2 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đường dẫn file hoặc thư mục: ");
        String path = scanner.nextLine();
        
        File fileOrDirectory = new File(path);
        if (fileOrDirectory.exists()) {
            deleteRecursively(fileOrDirectory);
            System.out.println("Xoá thành công: " + path);
        } else {
            System.out.println("File hoặc thư mục không tồn tại.");
        }
        
        scanner.close();
    }
    
    public static void deleteRecursively(File fileOrDirectory) {
        if (fileOrDirectory.isDirectory()) {
            for (File child : fileOrDirectory.listFiles()) {
                deleteRecursively(child);
            }
        }
        fileOrDirectory.delete();
    }

}
