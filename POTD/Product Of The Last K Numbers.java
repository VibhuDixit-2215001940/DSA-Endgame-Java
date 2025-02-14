class ProductOfNumbers {
    List<Integer> ll;
    public ProductOfNumbers() {
        ll = new ArrayList();
        ll.add(1);
    }
    public void add(int num) {
        if(num==0){
            ll = new ArrayList();
            ll.add(1);
        }
        else ll.add(ll.get(ll.size()-1)*num);
    }
    public int getProduct(int k) {
        if(k>ll.size()-1) return 0;
        else return ll.get(ll.size()-1)/ll.get(ll.size()-1-k);
    }
}