import java.io.*;

public class Main {
    public static void main(String[] args) {
        String str = "MAKS hello BOBBY Sesuriti";
        int a  = str.indexOf("A");
        int b  = str.lastIndexOf("B");
        System.out.println("Первое вхождение символа (А) в строке -> " + a);
        System.out.println("Последнее вхождение символа (В) в строке -> " + b);
        char byff[] = new char [b+1 - a ];//или str = str.substring(a,b);
        str.getChars(a,b+1,byff,0);
        System.out.print("Вырезанная подстрока из строки " + str +" начиная с первого вхождения символа(А) до,последнего вхождения сивола(B) -> " );
        System.out.println( byff);
        char nach = str.charAt(0);
        char kon = str.charAt(3);
        System.out.print("После замены  всех вхождений символа стоящего в позиции (3) на сивол стоящий в позиции (0) -> ");
        System.out.println(str.replace(kon,nach));

        try(BufferedReader reader =new BufferedReader(new InputStreamReader(new FileInputStream("text.txt")));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("out.txt"))))
        {
            String line,line2 ;
            while ((line = reader.readLine()) != null){
                 line2 = line.toLowerCase();
                StringBuffer stringBuffer = new StringBuffer(line2);
                 stringBuffer.reverse();
                if (line2.contentEquals(stringBuffer) && line.length() > 1){
                     writer.write(line);
                     writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


