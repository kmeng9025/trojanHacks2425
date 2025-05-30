/**DO NOT MODIFY THIS FILE */
import java.io.*;
import java.util.*;
class IOReader{

    private BufferedReader br;
    private PrintWriter pw;
    public IOReader(String fileName) throws Exception{
        br = new BufferedReader(new FileReader(fileName + ".in"));
        pw = new PrintWriter(fileName + ".out");
    }
    public IOReader(){
        br = new BufferedReader(new InputStreamReader(System.in));
        pw = new PrintWriter(System.out);
    }
    public String readLine() throws Exception{
        return br.readLine();
    }
    public void print(Object x){
        pw.print(x);
    }
    public void println(Object x){
        pw.println(x);
    }
    public void close(){
        pw.close();
    }
    public void flush(){
        pw.flush();
    }
}