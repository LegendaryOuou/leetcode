class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] split = text.split(" ");
        int res=0;
        for(String word:split){
            int wordLen = word.length();
            for(char ch:brokenLetters.toCharArray()){
                if(word.replaceAll(String.valueOf(ch),"").length()!=wordLen){
                    res++;
                    break;
                }
            }
        }
        return split.length-res;
    }
}