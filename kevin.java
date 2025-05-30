import java.io.*;
public class kevin {
    public static void main(String[] args) throws Exception {
        IOReader io = new IOReader();
        int n = io.readInt();
        int result = 0;
        for(int i = 0; i < n; i++){
            String line = io.readLine();
            String[] parts = line.split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            int c = Integer.parseInt(parts[2]);
            if((a + b + c) >= 2){
                result ++;
            }
        }
        io.println(result);
        io.close();
    }
}

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
    public int readInt() throws Exception{
        return Integer.parseInt(br.readLine());
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