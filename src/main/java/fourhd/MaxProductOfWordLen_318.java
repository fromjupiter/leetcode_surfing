package fourhd;


public class MaxProductOfWordLen_318 {
    /**
     * we use a 26-bit mask to represent each word,
     * every bit stands for whether this char exists in this word.
     *
     */
    public int maxProduct(String[] words) {
        int[] masks = new int[words.length];
        for(int i=0;i<words.length;++i) {
            masks[i] = getMask(words[i]);
        }
        int max = 0;
        for(int i=0;i<words.length;++i) {
            for(int j=i;j<words.length;++j) {
                if(0 == (masks[i] & masks[j])) {
                    max = Math.max(max, words[i].length()*words[j].length());
                }
            }
        }
        return max;
    }

    private int getMask(String wd) {
        int mask=0;
        for(int i=0;i<wd.length();++i) {
            mask = mask | (1<<(wd.charAt(i)-'a'));
        }
        return mask;
    }
}
