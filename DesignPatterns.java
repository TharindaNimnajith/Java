
/*

---Design Patterns---




---Command Pattern---


Front End -> (Request [eg: execute()]) -> Back End

This is like a remote controller
Remote controller doesn't know how to switch on TV or display video and audio
When you press "ON" button it just only sends the command to the TV which knows how to do it


<<interface>>
Command
execute()


<<Class>> implements Command interface
OnCommand
execute() {
	//
}


<<Class>> implements Command interface
OffCommand
execute() {
	//
}


<<Interface>>
Light
On()
Off()


<<Class>> implements Light interface
LivingRoomLight
On() {
	//
}
Off{
	//
}


<<Class>> implements Light interface
BedRoomLight
On() {
	//
}
Off() {
	//
}


<<Class>>
Invoker 
//This is like the remote controller
//There is a aggregation relationship between Command interface and Invoker class
setCommand() {
	//
}
onButtonPushed() {
	//
}
offButtonPushed() {
	//
}


<<Class>> uses the Invoker class and the Light interface
Client



---Template Pattern---


//



---Bridge Pattern---


//

*/
