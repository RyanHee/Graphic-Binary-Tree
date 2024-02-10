import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree{
    private BinaryNode root;
    public BinarySearchTree(){

    }

    public void add(int i){

        if (root==null){
            root=new BinaryNode(i);
        }
        else{
            add(new BinaryNode(i), root);
        }
    }

    private void add(BinaryNode addNode, BinaryNode b){

        if (addNode.value()<b.value()){
            if (b.left()==null){
                b.setLeft(addNode);
            }
            else{
                add(addNode,b.left());

            }
        }
        else{
            if (b.right()==null){
                b.setRight(addNode);
            }
            else{
                add(addNode,b.right());
            }
        }
    }

    public boolean isFull(){
        return isFull(root);
    }

    private boolean isFull(BinaryNode node){
        if (node.right()!=null && node.left()!=null){
            return isFull(node.right()) && isFull(node.left());
        }
        else if (node.right()==null && node.left()==null){
            return true;
        }
        return false;
    }
    public boolean contains(int i){
        return contains(root,i);
    }

    private boolean contains(BinaryNode node, int i){
        //System.out.println("here");
        if (node==null){
            return false;
        }
        if (node.value()==i){
            return true;
        }
        else if (node.value()>i){
            if (node.left()!=null){
                return contains(node.left(),i);
            }
            return false;
        }
        else{
            if (node.right()!=null){
                return contains(node.right(),i);
            }
            return false;
        }
    }

    public int getLevel(int n){
        if (root==null){
            return 0;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        int cnt=0;
        while (cnt<=getNumLevels()){
            int length = queue.size();
            for (int i=0;i<length;i++){
                BinaryNode node = queue.remove();
                if (node.value()==n){
                    return cnt;
                }
                if (node.right()!=null){
                    queue.add(node.right());
                }
                if (node.left()!=null){
                    queue.add(node.left());
                }
            }
            cnt++;
        }
        return cnt;
    }
    public int getWidthAtLevel(int level){
        if (root==null){
            return 0;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        int width=0;
        int cnt=0;
        while (cnt<=level){
            int length = queue.size();
            width=length;
            for (int i=0;i<length;i++){
                BinaryNode node = queue.remove();
                if (node.right()!=null){
                    queue.add(node.right());
                }
                if (node.left()!=null){
                    queue.add(node.left());
                }
            }
            cnt++;
        }
        return width;
    }
    public int getDiameter(){
        return getHeight(root.left())+getHeight(root.right())+3;
    }
    public int getNumLevels(){
        return getHeight()+1;
    }
    public int getHeight(){
        return getHeight(root);
    }

    private int getHeight(BinaryNode node){
        if (node==null){
            return -1;
        }
        else{
            return 1 + Math.max(getHeight(node.right()),getHeight(node.left()));
        }
    }

    public int getNumNodes(){
        if (root==null){
            return 0;
        }
        return 1+getNumNodes(root.right())+getNumNodes(root.left());
    }

    private int getNumNodes(BinaryNode node){
        if (node==null){
            return 0;
        }
        return 1+getNumNodes(node.right())+getNumNodes(node.left());
    }

    public int getNumLeaves(){
        if (root==null){
            return 0;
        }
        if (root.right()==null && root.left()==null){
            return 1;
        }
        return getNumLeaves(root.right())+getNumLeaves(root.left());
    }

    private int getNumLeaves(BinaryNode node){
        if (node==null){
            return 0;
        }
        if (node.right()==null && node.left()==null){
            return 1;
        }
        return getNumLeaves(node.right())+getNumLeaves(node.left());
    }

    public int getWidth(){
        if (root==null){
            return 0;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        int maxWidth=0;
        while (!queue.isEmpty()){
            int length = queue.size();
            maxWidth=Math.max(length,maxWidth);
            for (int i=0;i<length;i++){
                BinaryNode node = queue.remove();
                if (node.right()!=null){
                    queue.add(node.right());
                }
                if (node.left()!=null){
                    queue.add(node.left());
                }
            }
        }
        return maxWidth;
    }

    public int getSmallest(){
        if (root==null){
            return 0;
        }
        if (root.left()==null){
            return root.value();
        }
        else{
            BinaryNode node= root;
            while (node.left()!=null){
                node=node.left();
            }
            return node.value();
        }
    }

    public int getLargest(){
        if (root==null){
            return 0;
        }
        if (root.right()==null){
            return root.value();
        }
        else{
            BinaryNode node= root;
            while (node.right()!=null){
                node=node.right();
            }
            return node.value();
        }

    }
    public String preOrder(){
        return preOrder(root);
    }

    private String preOrder(BinaryNode node){
        if (node==null){
            return "";
        }
        String s=node.value()+" ";
        s+=preOrder(node.left());
        s+=preOrder(node.right());
        return s;

    }


    public String postOrder(){
        return postOrder(root);
    }

    private String postOrder(BinaryNode node){
        if (node==null){
            return "";
        }
        String s="";
        s+=postOrder(node.left());
        s+=postOrder(node.right());
        s+=node.value()+" ";
        return s;
    }

    public String inOrder(){
        return inOrder(root);
    }

    private String inOrder(BinaryNode node){
        String s="";
        if (node==null){
            return s;
        }
        s+=inOrder(node.left());
        s+=node.value()+" ";
        s+=inOrder(node.right());
        return s;
    }

    public String reverseOrder(){
        return reverseOrder(root);
    }

    private String reverseOrder(BinaryNode node){
        String s="";
        if (node==null){
            return s;
        }
        s+=reverseOrder(node.right());
        s+=node.value()+" ";
        s+=reverseOrder(node.left());
        return s;
    }

    public String levelOrder(){
        return levelOrder(root).trim();
    }

    private String levelOrder(BinaryNode node){
        String s="";
        if (node==null){
            return "";
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            BinaryNode n = queue.remove();
            s+=n.value()+" ";
            if (n.left()!=null){
                queue.add(n.left());
            }
            if (n.right()!=null){
                queue.add(n.right());
            }
        }
        return s;
    }

    private BinaryNode successor(BinaryNode node){
        BinaryNode returnNode=node.right();
        while (returnNode.left()!=null){
            returnNode=returnNode.left();
        }
        return returnNode;
    }

    private BinaryNode parent(BinaryNode node, int i){
        if (node==null){
            return null;
        }
        if (node.left()!=null){
            if (node.left().value()==i){
                return node;
            }
        }
        if (node.right()!=null){
            if (node.right().value()==i){
                return node;
            }
        }
        if (i<node.value()){
            return parent(node.left(),i);
        }
        else{
            return parent(node.right(),i);
        }

    }
    private void swap(BinaryNode a, BinaryNode b){
        int i=a.value();
        a.setValue(b.value());
        b.setValue(i);
    }
    public BinaryNode remove(int i){
        if (root==null){
            return null;
        }
        BinaryNode iosuccessor;
        BinaryNode temp=root;
        if (root.value()==i){

            if (root.right()==null && root.left()==null){
                root=null;
                return temp;
            }

            else if (root.right()==null){
                root=root.left();
                temp.setLeft(null);
                return temp;
            }

            else if (root.left()==null){
                root=root.right();
                temp.setRight(null);
                return temp;
            }

            else{
                iosuccessor = successor(temp);
                swap(temp,iosuccessor);
                if (root.right()==iosuccessor){
                    root.setRight(iosuccessor.right());
                    iosuccessor.setRight(null);
                    return iosuccessor;
                }
                return remove(root.right(),i);
            }
        }
        return remove(root,i);
    }

    private BinaryNode remove(BinaryNode node, int i){
        BinaryNode iosuccessor;
        BinaryNode parent = parent(node, i);
        if (parent==null){
            return null;
        }
        BinaryNode removeNode;
        boolean removeLeft;
        if (parent.left()!=null && parent.left().value()==i){
            removeNode=parent.left();
            removeLeft=true;
        }
        else{
            removeNode=parent.right();
            removeLeft=false;
        }
        if (removeNode.right()==null && removeNode.left()==null){
            if (removeLeft){
                parent.setLeft(null);
            }
            else{
                parent.setRight(null);
            }
            return removeNode;
        }
        else if (removeNode.right()==null){
            if (removeLeft){
                parent.setLeft(removeNode.left());
            }
            else{
                parent.setRight(removeNode.left());
            }
            removeNode.setLeft(null);
            return removeNode;
        }
        else if (removeNode.left()==null){
            if (removeLeft){
                parent.setLeft(removeNode.right());
            }
            else{
                parent.setRight(removeNode.right());
            }
            removeNode.setRight(null);
            return removeNode;
        }
        else{
            iosuccessor = successor(removeNode);
            swap(iosuccessor, removeNode);
            if (iosuccessor==removeNode.right()){
                removeNode.setRight(iosuccessor.right());
                iosuccessor.setRight(null);
                return iosuccessor;
            }
            return remove(removeNode.right(),i);
        }
    }


    public String[] forDraw(){
        String[]lst=new String[63];
        Queue<BinaryNode>queue = new LinkedList<>();
        queue.add(root);
        int idx=0;
        for (int x=0;x<6;x++){
            int length = queue.size();
            //String s="";
            for (int i=0;i<length;i++){
                //s="";
                if (queue.peek()==null){
                    queue.remove();
                    lst[idx]=" ";
                    queue.add(null);
                    queue.add(null);
                }
                else{
                    BinaryNode n = queue.remove();
                    lst[idx]= String.valueOf(n.value());
                    queue.add(n.left());
                    queue.add(n.right());
                }
                idx++;
            }
            //s=s.substring(0,s.length()-1);
            //lst[x]=s;
        }

        return lst;
    }
    public String fullLevelOrder(){
        String s="";

        Queue<BinaryNode>queue = new LinkedList<>();
        queue.add(root);
        int x=0;
        while (x<getNumLevels()){
            int length = queue.size();
            for (int i=0;i<length;i++){
                if (queue.peek()==null){
                    queue.remove();
                    s+="----";
                    queue.add(null);
                    queue.add(null);
                }
                else{
                    BinaryNode n = queue.remove();
                    s+=String.format("%04d",n.value());
                    queue.add(n.left());
                    queue.add(n.right());
                }
                s+="|";
            }
            s=s.substring(0,s.length()-1);
            if (x!=getNumLevels()-1){
                s+="\n";
            }
            x++;
        }
        return s;

    }


    public String toString(){
        return fullLevelOrder();
    }

}
