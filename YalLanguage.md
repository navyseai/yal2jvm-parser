# Description #

Main characteristics of the yal language

## Details ##
  * In **yal**, there are only integer scalar variables and one-dimensional arrays with integer elements. By default, all data are integers (in this version of the language there is no support for other data types);
  * A scalar variable can only be used after having a value assigned to it (just like Java);
  * Arrays must be declared before being accessed (e.g., the instruction `A=[20]`; declares an array with 20 elements of the integer type);
  * In each **yal** function, an identifier can only be used to identify one scalar variable or one array variable (for instance, in the same function, the same name cannot be used to first identify a scalar and later to identify an array);
  * It is possible to use the same identifier for a function and a variable  (i.e.,  in an  **yal** module, a function “max” may co-exist with a variable “max”);
  * In function argument passing and return values, the scalar variables are passed by value and the array variables by reference;
  * There is only one control flow statement that allows code to be executed repeatedly: `while`;
  * Each  **yal** module can be seen as a static class in Java,  with static attributes  and methods;
  * The language does not distinguish between lower and upper case (i.e., it is _case insensitive_).