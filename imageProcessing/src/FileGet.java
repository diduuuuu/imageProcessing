import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FileGet extends Component {
    private JFileChooser fileComponent = new JFileChooser();
    BufferedImage img;
    static Image image;
    public FileGet(){
        try {
            System.out.println(FileOpen.path);
            //String filename= "image/test.jpg"; // 파일의 경로
            //img = ImageIO.read(new File(filename)); //이미지 파일 경로를 읽음
            System.out.println(FileOpen.path);
            image = ImageIO.read(new File(FileOpen.path)); //이미지 파일 경로를 읽음
            //getPreferredSize();
//            Graphics g1 = image.getGraphics();
//            g1.drawImage(image, 0, 0, null); //그림을 그리는 메소드
            System.out.println("이미지 출력");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        System.out.println("페인트임");
//        g.drawImage(img, 0, 0, null); //그림을 그리는 메소드
//        System.out.println("페인트임");
//    }

    public Dimension getPreferredSize() {
        if (img == null) {
            return new Dimension(100,100); //그림 파일이 없을 경우 프레임의 크기를 100,100으로 만든다
        } else {
            System.out.println("되냐");
            return new Dimension(img.getWidth(null), img.getHeight(null)); //그림의 크기에 따라 화면의 크기를 변경한다.
        }
    }
}
