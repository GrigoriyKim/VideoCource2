package IO_NIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


public class Buffers_And_Channels {
    // Buffer - block pamyati, v kotoriy mojno i zapisat i prochitat information
    // Channel - mojet kak chitat tak i zapisivat v nego fail
    // read - programm <- Buffer <- Channel <- file
    // write - programm -> Buffer -> Channel -> file

    public static void main(String[] args) {
        try(RandomAccessFile file =
                    new RandomAccessFile("test10.txt", "rw");
            FileChannel channel = file.getChannel();){
            // method allocate - videlyaet ukazanniy ob`em pamyati
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder stix = new StringBuilder();

            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("Read " + byteRead);
                buffer.flip();

                while (buffer.hasRemaining()){
                    stix.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(stix);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
