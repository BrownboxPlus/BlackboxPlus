public class node{
    private int value;
    private int next;
    private node[] sides;
    private boolean isexit;
    public node(int value,int s){
        this.value=value;
        this.sides=new node[s];
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value){
        this.value=value;
    }
    public void setSides(int i,node v){
        this.sides[i]=v;
    }
    public node getSides(int i) {
        return this.sides[i];
    }
    public void setexit(boolean b){
        this.isexit=b;
    }
    public boolean isexit(){
        return this.isexit;
    }
    public void setnext(int n){
        this.next=n;
    }
    public int getnext(){
       return this.next;
    }


}
