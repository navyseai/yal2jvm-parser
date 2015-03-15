After we compile a a simple `HelloWorld.java` class and then use `javap -c Hello` we have this particular output:

```
public class Hello extends java.lang.Object{ 
public Hello(); 
  Code: 
   0:  aload_0 
   1:  invokespecial  #1; //Method java/lang/Object."<init>":()V 
   4:  return  
public static void main(java.lang.String[]); 
  Code: 
   0:  getstatic  #2; //Field java/lang/System.out:Ljava/io/PrintStream; 
   3:  ldc  #3; //String Hello World! 
   5:  invokevirtual  #4; //Method java/io/PrintStream.println:(Ljava/lang/String;)V 
   8:  return 
} 
```

This is:  **JVM instructions in the _bytecodes_ obtained after compilation of the “Hello” class with  _javac_.**

We can program with JVM instructions a class equivalent to the previous class. In this case, we will obtain the _bytecodes_ Java from the _assembly_ with  JVM instructions using _jasmin_.
The class equivalent to the Hello class (in the file `Hello.java`) is the class described in the file `Hello.j` using an assembly language with JVM instructions and syntax supported by _jasmin_.

Next code presents the code of the Hello class in file `Hello.j`.

```
; class with sintax accepted by jasmin 2.3 
 
.class public Hello 
.super java/lang/Object 
 
; 
; standard initializer 
.method public <init>()V 
   aload_0 
  
   invokenonvirtual java/lang/Object/<init>()V 
   return 
.end method 
 
.method public static main([Ljava/lang/String;)V 
   .limit stack 2 
   ;.limit locals 2 ; este exemplo não requer variáveis locais 
 
   getstatic java/lang/System.out Ljava/io/PrintStream; 
   ldc "Hello World!" 
   invokevirtual java/io/PrintStream.println(Ljava/lang/String;)V 
   return 
.end method 

```
Again, This is : **Programming of the “Hello” class (file `Hello.j`) using JVM instructions in a syntax accepted by _jasmin_.**

We can now generate the Java bytecodes for this class using _jasmin_ :

`java –jar jasmine.jar Hello.j `

(this way we obtain the `Hello.class` classfile which has the same functionality as the class generated previously from the Java code)

## Final Summation ##
**This really good fits with the explanation in the beginning of the assignment:
I will put it with my words:**
  * We compile **.yal** files with our **yal2jvm** compiler to JVM instructions.
  * Then we use **jasmin** to compile the program to **Java Bytecodes**

![http://i193.photobucket.com/albums/z251/anlazarov/compilationflow.png](http://i193.photobucket.com/albums/z251/anlazarov/compilationflow.png)