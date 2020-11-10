import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Main extends Thread {
    @Override
    public void run() {
        while(true) {
            System.out.println("საძიებო სიტყვა ?");
            Scanner scanner = new Scanner(System.in);
            String SearchKey = scanner.nextLine();

            File x = new File("C:\\Users\\Gio\\Desktop\\BTU_DOCUMENT");
            FilenameFilter filelist = (directory, filename) -> filename.contains(SearchKey);
            File[] fullfilelist = x.listFiles(filelist);

            assert fullfilelist != null;

            for (File f : fullfilelist ){
                System.out.println("ნაპოვნია" + f );
            }
        }
    }
}
