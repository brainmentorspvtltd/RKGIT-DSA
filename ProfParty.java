class ProfParty{
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,9};
        int max = Integer.MIN_VALUE;
        for(int element : arr){
            if(element>max){
                max = element;
            }
        }
        //System.out.println(max);
        int hash [] = new int[max + 1]; // default value 0
        for(int element : arr){
            if(hash[element]==1){ // Already Visited
                System.out.println("Boys Party");
                return ;
            }
            hash[element] = 1; // Visited Mark
        }
        System.out.println("Girls Party");

    }
}