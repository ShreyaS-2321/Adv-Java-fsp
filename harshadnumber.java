import java.io.*;

class HarshadNumber {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String[] tmp = br.readLine().split(" ");
            int S = Integer.parseInt(tmp[0]);
            int E = Integer.parseInt(tmp[1]);
            int count = 0;
            for(int n=S; n<=E; n++){
                int sum = 0;
                String tmp1 = Integer.toString(n);
                for (char ch : tmp1.toCharArray()){
                    sum += Character.getNumericValue(ch);
                }
                if (n % sum == 0) {
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }
}
