Java Fundamentals - Project Skeleton
===========

The project is intended for the Java Fundamentals class as a skeleton project. It is a [Maven](http://maven.apache.org/)
project with a dependency on [Apache Commons Lang](http://commons.apache.org/lang/) and it produces a single
JAR file that can be executed via

```shell
java -jar target/jf-homework1.jar
```

Getting Started
---------------

Start off by downloading this repository ([quick ZIP archive link](https://github.com/toomasr/jf-skeleton/zipball/master))
or cloning it via Git. Once you have the archive we will use Maven to build the project.

```shell
cd jf-skeleton
./mvnw clean package
java -jar target/jf-homework1.jar
```

This builds and executes the project. The current project will print the number 16 (just an example). When we check your
homework we will be using the very same steps! We will use *mvn clean package* to build your project and then
*java -jar target/jf-homework1.jar* to start the application.

Assignment structure
--------------------------

The project has a source folder *src/main/java/org/zeroturnaround/jf/*. The sample is based on the first homework and
also specifies a subfolder called *homework1*. You should **change this** depending on your assignment.

The project also has a folder for tests. See *src/test/java/org/zeroturnaround/jf/*. The sample is based on the first homework
and also specifies a folder *homework1*. You should **change this** depending on your assignment.

Using Eclipse
-------------

If you are an Eclipse user then you can import the project to your workspace. *File* - *Import* - *Existing Maven Projects*.

To run the project in Eclipse you should ..... oh wait! You are already familiar with your IDE and I'm not supposed to explain this!

Using the commandline
---------------------

Once you have downloaded the project and you want to run the main class you can do the following

```shell
cd jf-skeleton
mvn install
java -jar target/jf2016-executable.jar
```

Now you can edit your homework and rerun the sample. The *pom.xml* instructs the *jf2016-executable.jar* to execute
the *Main* class by default. If you want to use some other class then you also need to update the *pom.xml*.

Submitting your assignment
--------------------------

To submit your assignment, first run the following command in the homework root folder:

```
mvn clean deploy
```

It will ask you for your full name, Student Book Number (also known as *matrikli number*) and a comment (optional).

Example:

```bash
mvn clean deploy

#...skipping building, testing and packaging output from Maven...

[INFO] --- maven-antrun-plugin:1.7:run (package homework ZIP) ---
[INFO] Executing tasks

main:
Your full name (e.g. John Smith):
Jane Smith
Your Student Book Number (matrikli number, e.g. B12345):
B12345
Comment:
Java IO
      [zip] Building zip: /Users/jane/Workspaces/JF/jf-skeleton/target/jf-howework1-B12345.zip
   [delete] Deleting: /Users/jane/Workspaces/JF/jf-skeleton/homework.properties
[INFO] Executed tasks
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 45.028s
[INFO] Finished at: Thu Aug 28 15:36:19 EEST 2014
[INFO] Final Memory: 17M/99M
[INFO] ------------------------------------------------------------------------
```

After Maven has finished, you can find a ZIP file in *target* folder named
*jf-homework1-B12345.zip* (it contains the homework number and your Student Book Number/matrikli number).
This ZIP contains all the files that we need to check your homework

Attach the ZIP to an e-mail and **send it our way**, to *jf@zeroturnaround.com*.
