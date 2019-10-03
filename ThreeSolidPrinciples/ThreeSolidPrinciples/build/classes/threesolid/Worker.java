package threesolid;

/*
    Name: Lo Runas
    NetID: ner34
    Reasoning: The reason for reorganizing the code is to make the program more readable, 
    have better organization, to make debugging simpler, and make it so that finding errors is easier.
    Principles used: The principles used in this file is Single Responsibility.
    Single Responsibility is used so  that the human worker can be separated from the robot 
    and only has classes and functions that pretain to them, so that it only has one 
    reason to change and does not have to be shared with another.
 */

class Worker implements IWorker {
    public void work() {
        // ....working
        System.out.format("... \n");
    }

    public void eat() {
        //.... eating in launch break
    }
}
