Copyright (c) 2012, Nikita Lipsky, Excelsior LLC.

... because everything comes from nothing.

PREFACE

The Nothing System is a free open source project aiming to replace HTML+JavaScript based Internet.

The Manifest of the project can be seen here -- http://devday.2gis.ru/report/22 (in Russian). 
The transcript in English will appear soon.

The whole idea of the project is based on ideas of Niklaus Wirth and his Oberon System -- http://www.oberon.ethz.ch
The target platform of the system is Java however. So basically it is Oberon System written in Java.

HOW TO BUILD

   Correct JDK_DIR environment variable in build.bat|build.sh and execute it.

HOW TO RUN

   Correct JDK_DIR environment variable in run.bat|run.sh and execute it.

PLAING WITH THE NOTHING SYSTEM

The motto of the system is "Everything is a text".

The basic thing of the system is called "command". 
Command has a form of [ClassName].[MethodName] or [ClassName].[StaticField].[MethodName]. 
Arguments of the command are space-delimited constants after the command.
In the future any Java expression can be used as a command.

On the right of the main window you will see two internal text windows. 
Upper text window is standard output. Lower is basic commands window such as command creating a new text window (Sys.newText),
command saving the text (Sys.save), command opening saved text (Sys.open), command compiling a new source of the system (Sys.compile).

With this basic you may extend the system writing your own commands right in the system: 

  1. First you need to create a new text window executing Sys.newText by clicking on the appropriate text.

  2. Write a Java source code. For instance

    public class SayHello {
       
       public static void sayHello() {
           System.out.println("Hello!");
       }

    }
 
  3. Save the text executing the command 

     Sys.save SayHello.java

  4. Compile your source executing 

     Sys.compile

  5. Write down your command in the commands window or in any text window, e.g.

     SayHello.sayHello

  6. Enjoy your new functionality executing your own command!


It is only the beginning of the system written in one day -- http://www.excelsior.ru/news/hack-day-one.

HOW TO CONTRIBUTE 

You may find TODO.txt in this directory with the pool of tasks. 
If you would like to get some task to develop -- please contact me -- nlipsky@excelsior-usa.com to discuss the details.

REFERENCE IMPLEMENTATION

I know that Oberon home page looks ugly with many broken links, pity :(. And it is hard to find a page where you can download the system.
Here it is -- ftp://ftp.ethoberon.ethz.ch/ETHOberon
There are distros for Windows, Linux, Mac in it and scientific papers explaining the concepts.
System requirements: 32-bit systems with non-wide monitor (change resoltion to non-wide temporally if you have wide) else you may face with glitches.
If you are able to start it, do not be disappointed with its very unusual and inconvinient user interface. 
Try to read "Introduction" document carefully it is enough to start exploring the system. 
If you cut through the Oberon system glitches you will get a lot of fun!

To be continued ...

----------------------------
Dedicated to my daughter Varvara who doesn't want to see scary pictures in the Internet
