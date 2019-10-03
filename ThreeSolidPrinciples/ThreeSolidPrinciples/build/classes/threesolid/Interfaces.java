package threesolid;
/*
  Name: Diego Santana   
    NetID: dsp50
    Reasoning: The reason for reorganizing the code is to make modification and updating
    a simpler process. It also allows for edits and debugging to be more focused.
    Principles used: Interface Segregation was used in order to ensure that new 
    classes can be made and are not forced to use both functions of an interface. 
    */
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
