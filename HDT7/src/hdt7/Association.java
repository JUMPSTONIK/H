/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt7;

/**
 *
 * @author JUMPSTONIK
 */
public class Association<K,V> extends java.lang.Object implements java.util.Map.Entry<K,V> {
    K Key;
    V Value;
    public Association(K key, V value) {
        this.Key = key;
        this.Value = value;
    }
    
    @Override
    public K getKey() {
        return this.Key;
        
    }

    @Override
    public V getValue() {
        return this.Value;
        
    }

    @Override
    public V setValue(V value) {
        return null;
        
    }
    
}
