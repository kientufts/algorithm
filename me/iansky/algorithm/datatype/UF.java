package me.iansky.algorithm.datatype;

import java.util.HashSet;
import java.util.Set;

public class UF implements UnionFind{

    private int[] ids;

    public UF(int N){
        initializeIds(N);
    }

    @Override
    public void union(int p, int q) {

    }

    @Override
    public boolean isConnected(int p, int q) {
        return ids[p] == ids[q];
    }

    private void initializeIds(int N){
        ids = new int[N];
        for(int i = 0; i <= N - 1; i++){
            ids[i] = 1;
        }
    }

    public int getNumberOfComponents(){
        Set<Integer> componentId = new HashSet<>();
        for(int i = 0; i <= ids.length - 1; i++){
            componentId.add(ids[i]);
        }
        return componentId.size();
    }

    int getComponentId(int i){
        return ids[i];
    }

    void setComponentId(int i, int value){
        ids[i] = value;
    }

    int getUFSize(){
        return ids.length;
    }
}
