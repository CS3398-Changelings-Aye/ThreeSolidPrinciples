package threesolid;


/*
    Name: Dalton Melville
    NetID: Drm143
    Reasoning: The reason for reorganizing the code is to enable
    readability, organization, to make debugging simpler, and to ensure that
    errors can be found fast and taken care of swiftly.
    Principles used: The principles used in this file is the Open Close Principle.
    The Open Close Principle is used to allow the method to be extended with the minimum amount
    of modification to the methods. Single Responsibility is also used for each function
    such as work() and eat() work for Robot and no other class.
    Interface Segregation is not used.
 */
class Robot implements IWorker
{
    public void work()
    {
        //.. Work goes here
        System.out.format("OwO I did it!\n");

    }
    public void eat()
    {
        //.. Eating Here
    }
}
