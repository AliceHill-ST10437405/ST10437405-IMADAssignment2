# Assignment 2
## Pet App


### Introduction

This readme file has my creation of an  pet care app using Kotlin programming language in Android Studio. 
The app will allow users to feed, clean, and play with a virtual pet. The apps status is updated in real-time.
The app also features a timer that decrements the pet's hunger, cleanliness, and playfulness levels over time.

### Creating the Project in Android Studio



Step 1: Opened Android Studio and clicked on "Start a new Android Studio project" on the welcome screen.

Step2: clicked "Empty Activity" as the project template and clicked "Next".

Step 3: Entered the project name which is "MyApplication2", package name, and save location, and clicked "Finish".

Step 4:  carefully chose all and placed the Buttons, Texts and widgets needed from the pallette on to template.

Step 5 : In MainActivity Wrote all the needed code for the button on the first screen to link to the sceond screen for the user to be directed to when clicking the button.

Step 6: Created a new activity called MainActivity2 to handle the pet care functionality.

Step 7: Designed the user interface for MainActivity2 using the Android layout editor, adding buttons for feeding, cleaning, and playing with the pet, as well as text views to display the pet's status.

Step 8: Created a Pet class to represent the virtual pet, with properties for hunger, cleanliness, and playfulness.

Step 9: Created a PetManager class to handle the timer and decrement the pet's status over time. 





## Created a new activity called MainActivity2 to handle the pet care functionality.

Designed the user interface for MainActivity2 using the Android layout editor, adding buttons for feeding, cleaning, and playing with the pet, as well as text views to display the pet's status.
Created a Pet class to represent the virtual pet, with properties for feed, clean, and play.
Created a PetManager class to handle the timer and decrement the pet's status over time.
Linking Github to the Project

To link the project to Github, I followed these steps:

Step 1: Created a new repository on Github and copied the repositories URL.

Step 2: In Android Studio, went to VCS > Enable Version Control Integration and selected Git.


Step 3 :Initialized a new Git repository in the project directory using the command git init.

Step 4: Added the project files to the Git repository using the command git add

Step 5: Committed the changes with a meaningful commit message using the command git commit -m "push yeeeeeee".


Step 6: Linked the local repository to the Github repository using the command git remote add origin <https://github.com/AliceHill-ST10437405/ST10437405-IMADAssignment2>.

Step 7: Pushed the changes to the Github repository using the command git push -u origin master.


I used four images in the app, all obtained from Google:

These are the steps I used to obtain and place the dog images:

step 1:Saved my image off google.

Step 2:Added the image to the project's resources.

Step 3:Load it into your app using the ImageView.

Step 4: Applied constraints.

Step 5: Move to where you would like it placed.

### Using Images in the App

I used four images in the app, all obtained from Google:

A main image of a dog sitting, used as the cover image.
<https://https://r.bing.com/rp/zYRmeqAEd4Z0yDRz8nuL0syHMEI.svg>


An image of a dog being fed, used when the user clicks the "Feed" button.
<https://https://www.shutterstock.com/image-vector/cute-corgi-dog-eating-bone-260nw-1885276633.jpg>


The image of a dog playing will show up when the user clicks "play", its a image and used when the user clicks the "Play" button.
<https://https://image.freepik.com/free-vector/cute-welsh-corgi-dog-running-cartoon_42750-463.jpg>


An image of a dog being cleaned,the image appears when the user clicks the 
"Clean" button.


### These are the steps I used to obtain and place the dog images:
step 1:Saved my image off google

Step 2:Added the image to the project's resources

Step 3:Load it into your app using the ImageView

Step 4: Applied constraints

Step 5: Move to where you would like it placed.

## App Functionality

### The app has the following functionality:

The user will be able to feed, clean, and play with the pet by clicking the buttons that corrosponds to them.
The pet's status is updated in real-time, it will decrease by 1 every 1 Minute and 30 Seconds , displaying the current hunger, cleanliness, and playfulness levels.
A timer decrements the pet's status over time, requiring the user to interact with the pet regularly to keep it happy and healthy.
The app uses a PetManager class to handle the timer and decrement the pet's status.


### Youtube Link

<https://https://youtu.be/odpdFXgoVWw>
