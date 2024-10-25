public class marks {

    public static void totalMarks(String str){
        int result=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='0' || str.charAt(i)=='1'){
                if(str.charAt(i)=='1')
                    result+=3;
                else
                    result+=-1;
            }
        }
        System.out.print(result);
    }

    public static void main(String args[]){
        String ques="1010-1100";   //1 for correct answer and 0 for wrong and '-' if not answered
        totalMarks(ques);
    }
}
