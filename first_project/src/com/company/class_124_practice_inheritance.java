package com.company;
class Tree{
    void printTree()
    {
        System.out.println("This is tree.");
    }
    
    void hello()
    {
        System.out.println("Hello");
    }
}

class MangoTree extends Tree{
    @Override
    void printTree()
    {
        System.out.println("This is mango tree. ");
    }
    
    void pritnMangoTree()
    {
        System.out.println("This is mango treeeeeeee");
        printTree();
        super.printTree();
        hello();
        
    }
       
}


public class class_124_practice_inheritance {
    public static void main(String[] args)
    {
        MangoTree obj1=new MangoTree();
        obj1.printTree();  //This is mango tree
        obj1.pritnMangoTree();
        
        Tree obj2=new MangoTree();
        obj2.printTree();
    }
    
}
