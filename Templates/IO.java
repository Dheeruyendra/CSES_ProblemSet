import java.io.*;
import java.util.*;

public class template {
    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() { // reads in the next string
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() { // reads in the next int
            return Integer.parseInt(next());
        }

        public long nextLong() { // reads in the next long
            return Long.parseLong(next());
        }

        public double nextDouble() { // reads in the next double
            return Double.parseDouble(next());
        }
    }

    static InputReader r = new InputReader(System.in);
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) {
                String a = r.next()            //Reads the next token (up to a whitespace) and returns a String
                int b = r.nextInt()           //Reads the next token (up to a whitespace) and returns as an int
                long c = r.nextLong()        //Reads the next token (up to a whitespace) and returns as a long
                double d = r.nextDouble()   //Reads the next token (up to a whitespace) and returns as a double
                    pw.println()            //Prints the argument to designated output stream and adds newline
                    pw.print()              //Prints the argument to designated output stream
                    
        // YOUR CODE HERE
        pw.close(); // flushes the output once printing is done
    }
}
