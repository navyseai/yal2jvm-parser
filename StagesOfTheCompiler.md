# Introduction #

The suggested development stages for the **yal2jvm** compiler are the following:


# Details #

  1. Develop a _parser_ for **yal** using JavaCC and taking as starting point the yal grammar furnished (note that the original grammar may originate conflicts when implemented with parsers of LL(1) _(we can use `LOOKAHEAD` more than 1 to avoid errors)_ type and in that case you need to modify the grammar in order to eliminate those conflicts);
  1. Proceed with the specification of the file **jjt** to generate, using JJTree, a new version of the parser including in this case the generation of the syntax tree (the generated tree should be an AST ), annotating the nodes and leafs of the tree with the information (including tokens) necessary to perform the subsequent compiler steps;
  1. Include the necessary symbol tables;
  1. Semantic Analysis; **`[checkpoint 1]`**
  1. Generate JVM code accepted by _jasmin_ corresponding to the invocation of functions in **yal**;
  1. Generate JVM code accepted by _jasmin_ for arithmetic expressions;
  1. Generate JVM code accepted by _jasmin_ for conditional instructions (`if` and `if-else`);
  1. Generate JVM code accepted by _jasmin_ for loops; **`[checkpoint 2]`**
  1. Generate JVM code accepted by _jasmin_ to deal with arrays.
  1. Complete the compiler and test it using a set of **yal** modules;
  1. Proceed with the optimizations related to the code generation, related to the register allocation (**“-r”** option) and the optimizations related to the “-o” option.  **`[`this task is necessary for students intending to be eligible for final project grades greater or equal than 18 (out of 20)`]`**