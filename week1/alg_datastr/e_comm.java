package alg_datastr;

class Product{
    int productId;
    String productName;
    String category;
    Product(int id,String name,String cat){
        productId=id;
        productName=name;
        category=cat;
    }
    public String toString(){
        return productId+" | "+productName+" | "+category;
    }
}

public class e_comm{
    static int linearSearch(Product[] a,int id){
        for(int i=0;i<a.length;i++){
            if(a[i].productId==id)return i;
        }
        return -1;
    }
    static int binarySearch(Product[] a,int id){
        int low=0,high=a.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid].productId==id)return mid;
            if(a[mid].productId<id)low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    static void printArr(Product[] a){
        for(Product p:a)System.out.println(p);
        System.out.println("--------------------");
    }
    public static void main(String[] args){
        Product[] prod={
            new Product(105,"Keyboard","Electronics"),
            new Product(101,"Shoes","Fashion"),
            new Product(110,"Book","Books"),
            new Product(103,"Phone","Electronics"),
            new Product(107,"Bag","Accessories")
        };
        int key=103;
        int idxL=linearSearch(prod,key);
        System.out.println("Linear Search index="+idxL);
        System.out.println(idxL!=-1?prod[idxL]:"NOT FOUND");

        Product[] sorted=java.util.Arrays.copyOf(prod,prod.length);
        java.util.Arrays.sort(sorted,(a,b)->a.productId-b.productId);

        int idxB=binarySearch(sorted,key);
        System.out.println("Binary Search index="+idxB);
        System.out.println(idxB!=-1?sorted[idxB]:"NOT FOUND");

        System.out.println("Unsorted:");
        printArr(prod);
        System.out.println("Sorted:");
        printArr(sorted);

        System.out.println("O(n) vs O(log n)");
    }
}
