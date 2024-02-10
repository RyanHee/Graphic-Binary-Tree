public class BinaryNode{
    private BinaryNode left;
    private BinaryNode right;
    private int value;

    public BinaryNode(int val){
        value=val;
        left=null;
        right=null;
    }

    public void setRight(BinaryNode r){
        right=r;
    }
    public void setLeft(BinaryNode l){
        left=l;
    }

    public BinaryNode left(){
        return left;
    }

    public BinaryNode right(){
        return right;
    }
    public int value(){
        return value;
    }

    public void setValue(int i){
        value=i;
    }



}