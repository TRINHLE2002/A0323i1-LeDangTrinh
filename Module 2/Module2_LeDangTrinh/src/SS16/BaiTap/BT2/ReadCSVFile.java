package SS16.BaiTap.BT2;

import java.io.*;

public class    ReadCSVFile {
    public static void main(String[] args) {
        String csvFile = "src/SS16/BaiTap/BT2/Data.CSV";
        File file = new File(csvFile);
        String line = "";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                String fields[] = line.split(",");
                System.out.println("Mã " + fields[0] + "Viết tắt" + fields[1] + "Tên Quốc gia" + fields[2]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
