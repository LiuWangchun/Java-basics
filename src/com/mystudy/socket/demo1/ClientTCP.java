package com.mystudy.socket.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {

    public static void main(String[] args) {
        System.out.println("客户端发送数据。。");

        try {
            Socket client = new Socket("localhost",6666);
            OutputStream os = client.getOutputStream();
            os.write("你好吗？TCP，我来了".getBytes());

            // 4. 通过Scoket,获取 输入流对象
            InputStream in = client.getInputStream();
            // 5. 读取数据数据
            byte[] b = new byte[100];
            int len = in.read(b);
            System.out.println(new String(b, 0, len));

            in.close();
            os.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
