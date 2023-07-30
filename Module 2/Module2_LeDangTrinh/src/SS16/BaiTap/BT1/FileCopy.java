package SS16.BaiTap.BT1;
import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            // Nhập đường dẫn tệp nguồn và tệp đích từ tham số dòng lệnh
            String sourceFile = "src/SS16/BaiTap/BT1/source.txt";
            String targetFile = "src/SS16/BaiTap/BT1/target.txt";

            // Kiểm tra tệp nguồn có tồn tại hay không
            File file = new File(sourceFile);
            if (!file.exists()) {
                System.out.println("File does not exist.");
                System.exit(0);
            }

            // Kiểm tra tệp đích đã tồn tại hay chưa
            file = new File(targetFile);
            if (file.exists()) {
                System.out.println("Target file already exists.");
                System.exit(0);
            }

            // Sao chép tệp nguồn sang tệp đích
            InputStream in = new FileInputStream(sourceFile);
            OutputStream out = new FileOutputStream(targetFile);
            int bytesRead = 0;
            byte[] buffer = new byte[1024];
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            // Đóng luồng đầu vào và đầu ra
            in.close();
            out.close();

            // Hiển thị số ký tự trong tệp đích
            file = new File(targetFile);
            System.out.println("Number of characters in target file: " + file.length());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
