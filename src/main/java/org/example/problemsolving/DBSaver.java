package org.example.problemsolving;

public abstract class DBSaver implements DataSaver{

    final void saveToDB(String data){
        System.out.println("saving data to database: "+ data);
    }

    abstract void doSomeThing();
}
