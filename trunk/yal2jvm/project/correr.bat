del *.java
del *.class
echo -------------
echo Skipping - Tree
echo -------------
echo call jjtree yal2jvm.jjt
echo
echo -------------
echo Starting - Compiling yal2jvm.jj
echo -------------
call javacc yal2jvm.jj
echo
echo -------------
echo Starting - Compiling *.java
echo -------------
call javac *.java