package threesolid;
// interface segregation principle - good example
interface IWorker {
    public void work();
    public void eat();
}
interface IWorkable
{
    public void work();
}
interface IFeedable
{
    public void eat();
}