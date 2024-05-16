class SumOfNumberAndReverse {
    public static int reverse(int n){
        String s = "" + n;
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        s = sb.toString();
        int out = Integer.parseInt(s);
        return out;
    }
    public boolean sumOfNumberAndReverse(int num) {
        if(num==0){
            return true;
        }
        
        for(int i=1; i<num; i++){
            int a = reverse(i);
            if(i+a == num){
                return true;
            }
        }
        return false;
    }
}
