package threesolid;

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