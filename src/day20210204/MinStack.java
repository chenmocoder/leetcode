package day20210204;

import java.util.ArrayList;

public class MinStack {

    public  ArrayList<Integer> minStack = new ArrayList<Integer>();

    public  ArrayList<Integer> _minStack = new ArrayList<Integer>();

    public void pushToStack(int o) {
        this.minStack.add(o);
        if(this._minStack.size() == 0 || o < this._minStack.get(this._minStack.size()-1)){
            this._minStack.add(o);
        }
    }

    public void popFromStack() {
        int temp = this.minStack.remove(this.minStack.size() -1);
        if(temp == this._minStack.get(this._minStack.size() -1)) {
            this._minStack.remove(this._minStack.size());
        }
    }

    public int top() {

        int temp = this.minStack.get(this.minStack.size() -1);
        return temp;
    }

    public int getMinFromStatic() {
        return this._minStack.get(this._minStack.size()-1);
    }
}
