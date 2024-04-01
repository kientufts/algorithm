package me.iansky.algorithm.datatype;

import java.util.HashSet;
import java.util.Set;

public class UF implements UnionFind {

    private int[] ids;

    public UF(int N){
        initializeIds(N);
    }

    public void union(int p, int q) {
        int pid = ids[p];
        int qid = ids[q];
        for(int i = 0; i <= ids.length - 1; i++){
            if(ids[i] == pid) ids[i] = qid;
        }
    }

    public boolean connected(int p, int q) {
        return ids[p] == ids[q];
    }

    public int getComponentId (int p) {
        return ids[p];
    }

    public int getNumberOfComponents(){
        Set<Integer> componentId = new HashSet<>();
        for(int i = 0; i <= ids.length - 1; i++){
            componentId.add(ids[i]);
        }
        return componentId.size();
    }

    private void initializeIds(int N){
        ids = new int[N];
        for(int i = 0; i <= N - 1; i++){
            ids[i] = 1;
        }
    }
}
