Problem Solving and Programming 2 - Lab 1

To get back into the swing of things after the break we’ll start nice and gentle with a very simple View and Controller example.

The Controller

Write a program which represents a Water Tank called WaterTankController

It should contain all the logic to do with (.e. A method for each of these):
Adding water to the tank. 
Removing water from the tank
Checking how much is in the tank

It should have variable to store the current volume in the tank
It should have a constant to indicate the maximum volume of the tank

Things to consider : 
When adding water to the tank which will overfill it beyond capacity, how will I indicate back to the View that this is the case. A boolean result, a String message ???

Likewise for removing. Obviously we cannot remove any more than what is currently in the tank.

Messages should not be displayed by the controller class. The View layer is responsible for receiving and displaying information.

All units will be in litres.


The View

For the purposes of tonight’s lab your main method can serve as the user interface (i.e. View)

You should display a menu with the following options.

Add to Tank
Remove from Tank
Display Current Volume in Tank
Exit.

Remember the UI should have no logic in it to do with the Tank. 



