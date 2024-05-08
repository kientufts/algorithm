package datatype;

public class WeightedQuickUnion extends QuickUnion {

    private int[] sizeTrack;

    public WeightedQuickUnion(int N) {
        super(N);
        initializeSizeTrack();
    }

    @Override
    public void union(int p, int q){
        int i = root(p);
        int j = root(q);
        if(i == j) return;
        if(sizeTrack[i] < sizeTrack[j]){
            setComponentId(i, j);
            sizeTrack[j] += sizeTrack[i];
        } else {
            setComponentId(j, i);
            sizeTrack[i] += sizeTrack[j];
        }
    }

    private void initializeSizeTrack(){
        sizeTrack = new int[getUFSize()];
        for(int i = 0; i <= sizeTrack.length - 1; i++){
            sizeTrack[i] = 1;
        }
    }
}
