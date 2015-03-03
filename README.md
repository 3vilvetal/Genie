# Genie
Hello World example for flash GUI automation testing

How to set up Genie?

Follow these steps to set up the Genie environment. You can run Genie with a debug version of Flash
Player:

1. Install the debug version of Flash Player (depending on your testing needs) from:
http://www.adobe.com/support/flashplayer/downloads.html
Install the appropriate version of Flash Player for your operating system and web browser.

2. JDK version 1.5 is required (Recommended is JDK 1.5 Release 22) for compiling recorded Genie
scripts and your other Java development needs. (You just require JRE in case you already have
compiled Script classes.) The JDK can be downloaded from:
http://www.oracle.com/technetwork/java/javasebusiness/downloads/java-archive-downloadsjavase5-419410.html

3. Install the Eclipse IDE for Java Developers, version 3.5.0 or above, for writing scripts. The latest
version of Eclipse can be downloaded from:
http://www.eclipse.org/downloads/

4. Get the latest build of Genie.zip provided to you; copy the ZIP file to any location on your disk
and extract it.
Note: In subsequent pages, <GeniePath> will refer to the location where you have unzipped the
Genie.zip file.

5. Copy GeniePlugin.jar from <GeniePath>\GeniePlugin\GeniePlugin.jar to the plug-in folder of your
Eclipse installation folder. For example: D:\Eclipse\Plugins

6. Copy the mm.cfg file from <GeniePath>\GenieLibrary\mm.cfg to the user folder.
o C:\Documents and Settings\testuser\ (For Windows XP)
o C:\Users\testuser\ (For Windows 7)
o /Users/testuser/ (For Mac Os X)

7. Open mm.cfg and edit it to update the path to the file GenieLibrary.swf. You just need to add one
line in mm.cfg, which will look like:
PreloadSWF = <GeniePath>\GenieLibrary\GenieLibrary.swf

8. Open the “Global Security Settings panel” topic in Flash Player Help:
http://www.macromedia.com/support/documentation/en/flashplayer/help/settings_manager04.html. What looks like an image on this page is actually the working Global Security Settings panel
for Flash Player in your browser.
o Select the “Always Allow” option.
o Click the “Edit locations” pop-up menu and add a location for GenieLibrary.swf. This is the
same location you added to mm.cfg.
o Close the browser.

Full instruction of usage you can find here:
http://download2.polytechnic.edu.na/pub4/sourceforge/g/ge/genie.adobe/documents/UserGuide.pdf
