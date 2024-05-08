package datatype;

public class QuickFind extends UF {

    public QuickFind(int N){
        super(N);
    }

    @Override
    public void union(int p, int q) {
        int pid = getComponentId(p);
        int qid = getComponentId(q);
        for(int i = 0; i <= getUFSize() - 1; i++){
            if(getComponentId(i) == pid) setComponentId(i, qid);
        }
    }
}
