package JavaCollection;
/*
*ArrayDequeue is a double ended queue implementation that allows for efficient
* insertion and removal of elements from both ends of the queue. It does not have the capacity restriction of a fixed
* array.
*
* ArrayDequeue provides constant time performance for adding and removing elements from both ends.
* it is NOT thread safe and is not synchronized.
 */

import java.util.ArrayDeque;

public class DemoArrayDequeue {
    public static void main(String[] args) {
        //create an ArrayDequeue to simulate the call center queue
        ArrayDeque<Call> callQueue = new ArrayDeque<>();

        //simulate incoming calls
        callQueue.addLast(new Call("John"));
        callQueue.addLast(new Call("Mary"));
        callQueue.addLast(new Call("Peter"));

        //simulate outgoing calls(handling calls)
        while (!callQueue.isEmpty()) {
            //retrieve and remove the call from the front of the queue
            Call imcomingCall = callQueue.removeFirst();
            System.out.println("Handling incoming call: " + imcomingCall);

            System.out.println("call handled: " + imcomingCall.getCallerName());
        }
        System.out.println("incoming calls handled");

        callQueue.addFirst(new Call("David"));
        callQueue.addLast(new Call("Jane"));

        while (!callQueue.isEmpty()) {
            Call outgoingCall = callQueue.removeFirst();
            System.out.println("Handling outgoing call: " + outgoingCall);

            System.out.println("call handled: " + outgoingCall.getCallerName());
        }
        System.out.println("all follow up calls made");
    }
}

class Call{
    private String callerName;

    public Call(String callerName){
        this.callerName = callerName;
    }
    public String getCallerName(){
        return callerName;
    }
    @Override
    public String toString(){
        return "Call from " + callerName;
    }
}