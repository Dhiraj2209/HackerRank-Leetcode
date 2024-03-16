class IntegerToRoman{
  //Approch 2 Efficient O(log n)  SC = O(n)
  public static String intToRoman(int num) {
        int val[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String sym[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        String str = "";
        for(int i  = 0; i < val.length ;i++){
            while(num >= val[i]){
                str += sym[i];
                num -= val[i];
            }
            if(num == 0){
                break;
            }
        }
        return str;
  }
  
  //Approch 1 O(log n) SC = O(1)
  public static String Romen(int num){
        StringBuilder str = new StringBuilder();

        while(num > 0){
            if(num >= 1000){
                str.append("M");
                num -= 1000;
            }
            if(num >= 900 && num < 1000){
                str.append("CM");
                num -= 900;   
            }
            if(num >= 500 && num < 900){
                str.append("D");
                num -=500;
            }
            if(num == 400){
                str.append("CD");
                num -= 400;
            }
            if(num >= 100 && num < 400){
                str.append("C");
                num -= 100;
            }
            if(num == 90){
                str.append("XC");
                num -= 90;
            }
            if(num >= 50 && num < 90){
                str.append("L");
                num -= 50;
            }
            if(num == 40){
                str.append("XL");
                num -= 40;
            }
            if(num >= 10 && num < 50){
                str.append("X");
                num -= 10;
            }
            if(num == 9){
                str.append("IX");
                num -= 9;
            }
            if(num >=5 && num < 9){
                str.append("V");
                num -= 5;
            }
            if(num ==4){
                str.append("IV");
                num -= 4;
            }
            if(num >0 && num < 4){
                str.append("I");
                num -= 1;
            }
        }
        
        return str.toString();
  }

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        System.out.println(Romen(num));
  }
}
