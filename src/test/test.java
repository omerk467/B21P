package test;

public class test {
    public static void main(String[] args) {

        String str = "aaabcdef";
        String result  = "";
        String result1 = "";
        String result2 = "";
        String result3 = "";
        String result4 = "";

        for (int j=0;j<str.length();j++){
            char ch = str.charAt(j);
            int count =0;
            for (int i =0;i<str.length();i++){
                char eachCh = str.charAt(i);
                if(ch==eachCh){
                    count++;
                }
            }
            if(! result.contains(""+ch) && count>1 ){   // 'a'
                result += ""+ch;
            }
            if(count>1){                 //aaa
                result1 += ""+ch;
            }
            if(count==1){             // bcdef
                result2 += ""+ch;
            }
            if(! result3.contains(""+ch)){    // abcdef
                result3 += ""+ch;
            }
            if(! result4.contains(""+ch)){       // a3b1c1d1e1f1
                result4 += ""+ch+count;
            }
        }
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        // test test again
        // test 2

        // branch test
    }



}
