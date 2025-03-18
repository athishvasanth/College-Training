public class frequencyofstring {
    public static void main(String[] args) {
        String str = "athish vasanth";
        char[] array = str.toCharArray();
        for (int i=0;i< array.length;i++){
            int count =0;
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (array[k] == array[i]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;

            }
            for(int j=i;j< array.length;j++){
                if (array[i]==array[j])
                    count ++;
            }
            System.out.println(array[i]+":"+count);
        }
    }
}
