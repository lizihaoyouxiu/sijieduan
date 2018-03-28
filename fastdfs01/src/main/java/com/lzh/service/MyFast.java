package com.lzh.service;

import com.sun.jmx.snmp.tasks.TaskServer;
import org.csource.common.MyException;
import org.csource.fastdfs.*;

import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.FileImageOutputStream;
import java.io.*;

/**
 * Created by DELL on 2018/3/26.
 */
public class MyFast {

    public void upload() {
        try {
            ClientGlobal.init("F:\\idea\\sijieduan\\fastdfs01\\src\\main\\resources\\client.conf");
            TrackerClient taClient = new TrackerClient();
            TrackerServer trackerServer = taClient.getConnection();
            StorageServer storageServer = null;
            StorageClient storageClient = new StorageClient(trackerServer, storageServer);
           String[] strings = storageClient.upload_file("C:\\Users\\DELL\\Desktop\\pic1.jpg", "jpg", null);
            for (String string : strings) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        MyFast myFast = new MyFast();
        myFast.upload();
    }
}