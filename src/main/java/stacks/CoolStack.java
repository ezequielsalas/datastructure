package stacks;

public class CoolStack<X> {
    private int stackPointer;
    private X [] container;

    public CoolStack(){
        container = (X[]) new Object[1000];
        stackPointer = 0;
    }

    public void push(X item){
        container[stackPointer++] = item;
    }

    public X pop(){
        if (stackPointer == 0){
            throw new IllegalStateException("No more item on the stack");
        }
        return container[stackPointer--];
    }

    public boolean cointains(X item){
        boolean found =  false;

        for(X data: container){
            if (data.equals(item)){
                found = true;
                break;
            }
        }

        return found;
    }

    public X access(X item){
        while(stackPointer > 0){
            X found = pop();
            if(found.equals(item)){
                return found;
            }
        }
        throw new IllegalArgumentException("Item not found");
    }

    public int size(){
        return stackPointer;
    }
}
