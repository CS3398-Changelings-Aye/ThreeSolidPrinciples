package threesolid;
/*
  Name: Nisa Lateef   
    NetID: n_l110
    Reasoning: The reason for reorganizing the code is to make sure a class has
    one function so debugging/modifying the code is made easier.
    Principles used: The principle used in this file is Single Responsibility.
    Single Responsibility is used to split functionality between classes. Each
    class should handle one responsibility and if a change occurs, than we will
    make changes in the class that handles that responsibility. 
    */
class Manager {
    threesolid.IWorker worker;

    public void Manager() {

    }
    public void setWorker(threesolid.IWorker w) {
        worker=w;
    }

    public void manage() {
        worker.work();
    }
}
