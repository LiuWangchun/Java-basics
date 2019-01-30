package com.mystudy.socket.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {

    public static void main(String[] args) {
        System.out.println("服务端启动，等待连接。。。");
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket server = ss.accept();
            InputStream is = server.getInputStream();

            byte[] b = new byte[1024];

            int len = is.read(b);
            String msg = new String(b, 0, len);
            System.out.println(msg);

            // =================回写数据=======================
            // 5. 通过 socket 获取输出流
            OutputStream os = server.getOutputStream();
            // 6. 回写数据
            os.write("我很好,谢谢你".getBytes());

            os.close();
            is.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
