class RecDemo{
    static void show(int val){
        if(val==11){
            return ;
        }
        
        if(val%2==0){
            System.out.println(val);
        }
        show(val+1);
        if(val%2!=0){
            System.out.println(val);
        }
        //System.out.println(val);
    }
    public static void main(String[] args) {
        show(1);
    }
}