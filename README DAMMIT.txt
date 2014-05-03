Ok so heres a brief explanation of how the engine works

1. An '>' appears and you enter the line (Sys.scan())
2. What you enter is stored after it is trimmed and put to lower case.

3. This string is generalized and the crap is removed (Sys.generalize())

4. Generalize returns a String Array, lets call this commands

5. Commands is sent to the Parser

6. THe parser attempts to do non-map reliant things (menu, save, exit)

7. If the parser cant do anything, it sends commands to the parser in the World class for map reliant things.

8. The World parser does its stuff(looks, go NOrth, take item)

9. If it cant, it tells the current map to do what it can with commands

10. The current map does what it can (toggle switch)

11. If not, it prints "I dont understand"

12. Rinse and Repeat