# SeleniumProject
# Install Java
1. Go to https://download.eclipse.org/oomph/jre/?vm=1_1_8_0_64_0&pn=Eclipse%20Installer&pu=http://wiki.eclipse.org/Eclipse_Installer&pi=http://download.eclipse.org/oomph/jre/128x128.png
2. Click “Oracle JDK 8”
3. Download the right executable file for your machine (e.g. jdk-8u241-windows-x64.exe)
4. Check the agreement box and click Download
5. Create an account
6. Verify account
7. The executable file should begin downloading
8. Run the executable file (continue clicking next; nothing should be changed)

# Install Eclipse and add TestNG plugin
9. Download Eclipse IDE installer from the Eclipse website: https://www.eclipse.org/downloads/
10. Run installer from your downloads folder
11. Select “Eclipse IDE for Java Developers”
12. Click “Install”
13. Click “Accept Now”
14. Click “Launch” after installation
15. Once installed, go to Help > Install New Software
16. Enter the update site URL:
- https://dl.bintray.com/testng-team/testng-eclipse-release/
- Link is from the following site: https://testng.org/doc/download.html
17. Check the checkbox for the package added
18. Click Next
19. Click Install Anyway
20. Restart Eclipse to use the features of the installed plugin
21. Once restarted, verify TestNG plugin was installed File - New - Java Project - Other.. - TestNG - TestNG class

# Install Selenium Driver
22. Go to C:\ or Local Disk(C:) directory and create a Selenium folder
23. Open browser and navigate to http://www.seleniumhq.org/
24. Under Selenium WebDriver click Download
25. On the Selenium Server (Grid) click to the right of the Latest stable version (e.g. 3.141.xx)
26. Copy and paste .jar file in the C:\Selenium directory
27. On the same page as the Selenium Server, download the Selenium Java Client
28. Extract All, and copy and paste extracted content into the C:\Selenium directory
29. Install chrome driver if you’re using Google Chrome Driver: https://chromedriver.chromium.org/downloads
30. Downloaded guice-4.2.2.jar from: https://github.com/google/guice/wiki/Guice422
31. Added in Selenium folder directory

# Create Project and Import Dependencies
32. File New - Projects - Java - Java Project and click Next
33. Project name: AutomatedTestCases and click Finished
34. Right click src - Other…- TestNG - TestNG class
35. Import the package name like in the video
36. Checked the BeforeClass and AfterClass annotation
37. Source folder should click Browse - click project name - then src - and click OK 
38. Right click project name - Build Path - Configure Build Path… - Libraries -click Add External JARs..
39. Add the following JARs:
- client-combined-3.141.59
- client-combined-3.141.59-sources
- byte-buddy-1.8.15
- commons-exec-1.3
- guava-25.0-jre
- okhttp-3.11.0
- okio-1.14.0
- guice-4.2.2
40. Added it to the Project properties - Java Build Path
41. Click Add Library - TestNG
42. Click Apply, then Apply and Close