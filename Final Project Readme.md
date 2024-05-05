>Summary of the Hospital Management System
I created a hospital management system that organizes all the important details about hospitals, doctors, patients, and appointments into one system. This system lets patients connect with many hospitals and doctors, and it lets hospitals connect with many patients too. Each doctor works at one specific hospital, and doctors and patients can make, change, or cancel their appointments easily.
When users first visit the system, they see a simple homepage with a navigation bar that helps them find different sections like "About Us," "Doctors," and "Departments." There's also a login button that users must click to enter their username and password. If they forget to fill these in, the system will tell them to make sure they complete these fields.
After logging in, the system shows different things depending on who's using it:
Patients can look at and change their own information, and handle their appointments.
Hospital staff can see a list of all the patients at their hospital and add new ones if needed.
Doctors can see their appointments and adjust them as needed.
Admins can see everything, including all the details about patients and which hospitals they visit, and they can also look at reports showing how many patients each hospital has.

>Design of the Hospital Management System
The system starts with a simple and clear homepage. There's a navigation bar at the top with buttons that take you to different parts of the page when you click on them. There's also a login button at the top right. If someone tries to log in without putting in their username or password, a message will pop up telling them to fill in those fields.
Once logged in:
* Patients go to a welcome page and then to their own page where they can check and update their information and manage their appointments.
* Hospital staff log in and go to a page that shows all the patients at their hospital, and they can also add new patients.
* Doctors log in and get to a page where they can set up new appointments or change existing ones.
This design makes it easy for everyone to use the system and helps hospitals and doctors take good care of their patients.


>Requirements (Installation, Compile, Runtime, Database, etc)
>Steps to install/ download
1.Install Java Development Kit (JDK)
Download the OpenJDK version 17.0.11+9 for Mac from Adoptium.
Install it using the PKG file or by typing brew install openjdk in your macOS terminal.
2.Set Up Environment Variables
In your macOS terminal, type these commands:bash export JAVA_HOME=$(/usr/libexec/java_home -v 17) export PATH=${JAVA_HOME}/bin:${PATH} 
Check if it's set up correctly by typing java -version and javac -version in the terminal.
3.Install and Set Up an IDE (Integrated Development Environment)
Download and install Apache NetBeans 21 from the NetBeans website.
Let NetBeans install any necessary plugins and set up Maven indexes when you first open it.
4.Install and Set Up Payara Server
Download Payara Server from the Payara website.
Extract the files to a folder that doesn’t have any spaces in its path.
Set up the Payara Server in NetBeans.
5.Install and Set Up MySQL
Download MySQL Community Server 8.0 for macOS.
Choose a Custom Setup and install both MySQL Server and MySQL Workbench.
During setup, choose “Development Machine” and set a root password.
Alternatively, install MySQL using Homebrew on macOS.
6.Set Up MySQL Workbench
Open MySQL Workbench and connect using the root user.
Create a new database schema called ‘itmd4515’ and a new user who has full access to this schema.
7.Configure NetBeans to Connect to MySQL
Set up NetBeans so it can connect to the MySQL database you just created.
8.Testing and Verification
Test the JDK installation with the version check commands you used earlier.
Confirm MySQL is working by running a test query in MySQL Workbench.
9.Add the following dependencies to your pom.xml file: jakarta.jakartaee-api with version ${jakartaee}, mysql-connector-j version 8.0.33, junit-jupiter-engine version 5.10.1, org.eclipse.persistence.jpa version 4.0.2, hibernate-validator version 8.0.1.Final, expressly version 5.0.0, and hibernate-validator-cdi version 8.0.1.Final.
10.To run your project, start the Payara Server, clean the project data, and then launch the project.
 
Screenshots



>Username and password to login
Patient:
Username:- patient1
Password:- patient1

Doctor:
Username:- doctor1
Password:- doctor1

Admin
Username:- admin
Password:- admin

Hospital
Username:- hospital1
Password:- hospital1

>Development Insights
I encountered several challenges in this project due to time constraints, and as a result, I wasn't able to implement all the functionalities planned.
Firstly, I aimed to establish an admin role with the capability to create new users. However, I faced persistent errors when trying to add usernames and passwords, and despite several days of troubleshooting, I was unable to resolve the issue.
Secondly, there's a problem with deleting appointments from both the patient and doctor sides. Although appointments are removed from the database, these changes are not reflected on the webpage.
Thirdly, I attempted to earn extra credit by integrating PrimeFaces or another JSF component library into my application. Unfortunately, numerous errors arose, and my debugging efforts were unsuccessful.



