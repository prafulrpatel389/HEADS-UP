Proposed Application Name: "Concussion Safety Challenge" 

Source Code: https://github.com/prafulrpatel389/F7204_HEADS-UP

# Installation Guide

End User: Currently, this application is not tested or compiled for commercial use. It needs to be fully integrated with a stable database and web application for content maintenance.

## For Developers

Required Application(s) / Pre-requisites (ONLY APPLICABLE to ANDROID ENVIORNMENT)

	Android Studio 2.6 or Newer
	System Requirements to Run Android Studio w/ Emulator for Testing and Troubleshooting

	Android SDK Version: 25.0 
	Android Build Tools Version: 26.0.2
	Gradle Build Version: 3.1.0

	Windows:
		Microsoft® Windows® 7/8/10 (32- or 64-bit)
		3 GB RAM minimum, 8 GB RAM recommended; plus 1 GB for the Android Emulator
		2 GB of available disk space minimum,
		4 GB Recommended (500 MB for IDE + 1.5 GB for Android SDK and emulator system image)
		1280 x 800 minimum screen resolution

	Mac:
		Mac® OS X® 10.10 (Yosemite) or higher, up to 10.13 (macOS High Sierra)
		3 GB RAM minimum, 8 GB RAM recommended; plus 1 GB for the Android Emulator
		2 GB of available disk space minimum,
		4 GB Recommended (500 MB for IDE + 1.5 GB for Android SDK and emulator system image)
		1280 x 800 minimum screen resolution

	Linux:
		GNOME or KDE desktop
		Tested on Ubuntu® 14.04 LTS, Trusty Tahr
		64-bit distribution capable of running 32-bit applications
		GNU C Library (glibc) 2.19 or later
		3 GB RAM minimum, 8 GB RAM recommended; plus 1 GB for the Android Emulator
		2 GB of available disk space minimum,
		4 GB Recommended (500 MB for IDE + 1.5 GB for Android SDK and emulator system image)
		1280 x 800 minimum screen resolution

** Above Requirements are from https://developer.android.com/studio/index.html **


## Dependent Libraries

	Android Studio is an all-in-one developing tool. No external software are required for development and testing. 

	** Git Bash or Git integration with Android Studio is required to clone/checkout F7202_HEADS-UP repository

	git(Bash) for Windows: https://git-for-windows.github.io/ or https://git-scm.com/downloads

## Download Instructions (Clone with HTTPS)

	Use Git or checkout with SVN using the web URL: https://github.com/prafulrpatel389/F7204_HEADS-UP.git

## Download Instructions (ZIP archive download)
	
	https://github.com/prafulrpatel389/F7204_HEADS-UP/archive/android.zip

## Build Instructions

	Open Android Studio
	
	Step 1: Select "Open an existing Android Studio project"
	Step 2: Navigate to download/clone destination
	Step 3: Select "F7204_HEADS-UP" folder with Android Studio icon
	Step 4: Click OK 

	For first instance it will take few seconds to a minute to Auto Build and compile the project.

	Step 5: Go to "Run" menu in Android Studio and select the Run'app'
	Step 6: Select Deployment window will prompt to select Virtual Devices
		(If no device is added then add new by selecting "Create New Virtual Device". Select any device and complete the installation.)
	Step 7: Android Emulator will open Virtual Device.
		(This will take few minutes based on PC Hardware.)
	
	This should open a live environment of the CDC HEADS UP application.

## Installation Instructions

	No additional installation needed.

	The application is still in the Development phase. It has not been compiled as a stand-alone application. Refer to the Build Instructions for testing and demo of the current state of the application.

## Run Instructions

	The application runs within Android Studio.

	The application is still in the Development phase. It has not been compiled as a stand-alone application. Refer to the Build Instructions for testing and demo of the current state of the application.

## Troubleshooting (If application does not compile/build) 

	Check SDK Version with build.gradle (Project: HEADS_UP)
	Check Gradle Version with Gradle Classpath (Module: app)

	If Emulator Crashes: Make sure project compiles fully and builds successfully

	If Login fails: Check username and password

	If Login fails (with correct credentials): Check database status

	If Registration fails: Check database status

	Please contact Team Code @ ppatel389@gatech.edu for issues that are not mentioned above.
	
# Release Notes v0.9

## New Features

  * User interface improvements
  * Added the ability to create and leave groups
  * Graphical representation of personal score history

## Bug Fixes

  * User’s score is calculated automatically upon completion of quizzes and surveys
  * Application no longer crashes when the “Add” button on the Group screen is clicked
  * User created tasks are now persistent and completable, and task creation features a new calendar view

## Known Bugs

  * “Add” button on the Group screen does not send an invitation to other users via email
  * Push notifications for new quizzes and surveys do not work
  * Full connectivity of main functionality with the database
  * Storage of personal icon or profile pictures in the database
  * Password reset through email confirmation instead of user profile credential check
  * Ability to share progress within the application on social medias (e.g. Facebook, Twitter, etc.) 

** Known bugs also include features to be implemented in the future



