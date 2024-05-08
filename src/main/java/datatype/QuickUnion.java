package datatype;

public class QuickUnion extends UF{

    public QuickUnion(int N) {
        super(N);
    }

    @Override
    public void union(int p, int q) {
       int i = root(p);
       int j = root(q);
       setComponentId(i, j);
    }

    @Override
    public boolean isConnected(int p, int q){
        return root(p) == root(q);
    }

    int root(int i){
        while (i != getComponentId(i))
            i = getComponentId(i);
        return i;
    }
}
