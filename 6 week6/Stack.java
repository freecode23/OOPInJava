//**************************************************************************************************
// CLASS: Stack (Stack.java)
//
// DESCRIPTION
// Implements a stack data structure where the elements of the Stack are stored in a DList.
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// Web: http://www.devlang.com
//**************************************************************************************************

/**
 * Implements a stack data structure using a DList to store the elements.
 */
public class Stack {

    private DList mList;

    /**
     * Creates a new empty Stack by creating a new empty DList.
     */
    public Stack() {
        setList(new DList());
    }

    /**
     * Removes all of the elements from this Stack. After clear() returns this Stack is empty.
     */
    public void clear() {
        getList().clear();
    }

    /**
     * Accessor method for mList.
     */
    protected DList getList() {
        return mList;
    }

    public void indexzero(){
        System.out.println(mList.get(0));
    }

    /**
     * Returns true if this Stack is empty.
     */
    public boolean isEmpty() {
        return getList().isEmpty();
    }

    /**
     * Returns the top element on this Stack without removing it.
     */
    public Integer peek() {
        return getList().get(0);
    }

    /**
     * Removes the top element from this Stack and returns it.
     */
    public Integer pop() {
        Integer top = getList().remove(0);
        return top;
    }

    /**
     * Pushes pData onto the top of this Stack.
     */
    public void push(Integer pData) {
        getList().prepend(pData);
    }

    /**
     * Mutator method for mList.
     */
    protected void setList(DList pList) {
        mList = pList;
    }

    /**
     * Overrides toString() inherited from Object. Returns a String representation of the elements
     * of this Stack by calling the DList.toString() method.
     */
    @Override
    public String toString() {
        return getList().toString();
    }
}
