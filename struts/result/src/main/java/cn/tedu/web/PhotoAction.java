package cn.tedu.web;

import java.awt.*;
import java.util.Random;

import java.io.*;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;

@Controller
@Scope("prototype")
public class PhotoAction {
    private InputStream photo;

    public InputStream getPhoto() {
        return photo;
    }

    public void setPhoto(InputStream photo) {
        this.photo = photo;
    }


    public String execute() throws IOException {
        BufferedImage img = new BufferedImage(400, 300, BufferedImage.TYPE_3BYTE_BGR);
        img.setRGB(0, 0, 0xffff00);
//        for (int i = 0; i < 1000; i++) {
//            int x = new Random().nextInt(img.getWidth());
//            int y = new Random().nextInt(img.getHeight());
//            int c = (int) (Math.random() * 0xffffff);
//            img.setRGB(x, y, c);
//        }
        long c = 0;
        for (int x = 0; x < 400; x++) {
            for (int y = 0; y < 300; y++) {
                img.setRGB(x, y, (int) (c += 100 % 0xffffff));
            }
        }
        //画笔，照片
        Graphics2D gc = img.createGraphics();
        gc.setColor(Color.cyan);
        gc.drawString("您好", 40, 80);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //将照片编码为png格式的数组
        ImageIO.write(img, "png", out);
        //将数组包装为InputStream
        this.photo = new ByteArrayInputStream(out.toByteArray());
        out.close();
        return "success";
    }
}
