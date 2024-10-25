public class stringEvaluation {

public static void evaluation(String str){
    char[] ch=str.toCharArray();
    int result=Character.getNumericValue(ch[0]);
    for(int i=1;i<ch.length;i++){
        if(ch[i]=='A'|| ch[i]=='B'|| ch[i]=='C'){
            if(ch[i]=='A')
                result=result & Character.getNumericValue(ch[i+1]);
            if(ch[i]=='B')
                result=result | Character.getNumericValue(ch[i+1]);
            if(ch[i]=='C')
                result=result ^ Character.getNumericValue(ch[i+1]);
        }
    }
    System.out.print(result);
}
public static void main(String[] args){
    String s="1A0b1c1";
    evaluation(s.toUpperCase());
}

}

