x ---> 1100 ------------> A 0's & 1's + 1 + B 0's
//x'-----> nx-----------> A 1's & 0's + 0 + B 1's
x"------>(nx + 1)----- -> A 1's & 0's + 1 + B 0's 
  
x & x" -----------------> A 0's & 0's + 1 + B 0's---------00000 1 00000 
  
RightShift set Bitmask ==== x & x"  ===>> (x & -x) 
  
  
