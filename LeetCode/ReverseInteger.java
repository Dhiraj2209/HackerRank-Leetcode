class Solution {
    public int reverse(int x) {
        int fin=0;
        while(x != 0){
            int temp = x % 10;
            // fin += temp;
            if (fin > Integer.MAX_VALUE / 10 || (fin == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
            if (fin < Integer.MIN_VALUE / 10 || (fin == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
            fin = fin * 10 + temp;
            x /= 10;
        }
        // if (fin > (Integer.MAX_VALUE)) return 0;

        return fin;
    }
}
