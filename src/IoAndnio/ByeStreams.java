package IoAndnio;

import java.io.*;

public class ByeStreams {
    private final static File readingFile = new File("/mnt/hdd/Idea/CoreJava/names.txt");
    private final static File writeTo = new File("/mnt/hdd/Idea/CoreJava/write.txt");
    private final static File objectPath = new File("/mnt/hdd/Idea/CoreJava/obj.ser");

    public static void fileRead() throws IOException {
        FileInputStream fin = new FileInputStream(readingFile);
        int byteReader;
        while ((byteReader = fin.read()) != -1) {
            System.out.print((char) byteReader);
        }
        fin.close();
    }


    public static void writeFile(String message) throws IOException {
        OutputStream os = new FileOutputStream(writeTo, true);
        os.write(System.lineSeparator().getBytes());
        os.write(message.getBytes());
        os.close();
    }

    public static void bufferRead() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(readingFile));
        int readByte;
        while ((readByte = bis.read()) != -1) {
            System.out.print((char) readByte);
        }
        bis.close();
    }

    public static void bufferWrite(String message) throws IOException {
        OutputStream os = new BufferedOutputStream(new FileOutputStream(writeTo, true));
        os.write(System.lineSeparator().getBytes());
        os.write(message.getBytes());
        os.close();
    }


    public static void writeObject() throws IOException {

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(objectPath));
        SampleObject so = new SampleObject("Harry", 16);
        os.writeObject(so);
        os.close();
    }

    public static void readObject() throws IOException, ClassNotFoundException {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(objectPath));
        SampleObject obj = (SampleObject) is.readObject();
        System.out.println(obj.getName() + " is " + obj.getAge());
        is.close();
    }


    static class SampleObject implements Serializable {
        String name;
        int age;

        public SampleObject(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


}
