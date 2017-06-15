animal(mamifero,perro).
animal(mamifero,leon).
animal(oviparo,aguila).
animal(oviparo,gallina).
animal(oviparo,pez).
animal(oviparo,tortuga).
animal(mamifero,gato).
animal(mamifero,elefante).
animal(mamifero,tigre).
animal(mamifero,jirafa).

viven_en_selva(1,X,Y):-
     write('El animal vive en la selva?'),
     X is si,
     write('El animal es un leon'),
     Y is no,
     write(X).

toma(1,X,Y):-
    write('toma leche?'),
    X is si,
    write('el animal es el gato'),
    Y is no. 
    write(X).

vuela(1,X,Y):-
    write('El animal vuele?'),
    X is si,
    write('El animal es la aguila'),
    Y is no,
    write ('El animal es la gallina').

nada(1,X,Y):-
   write('El animal nada?'),
   X is si,
   write('El animal es un pez'),
   Y is no,
   write ('El animal es una tortuga').

gigante(1,X,Y):-
  write('El animal es grande?'),
  X is si,
  write('El animal es un elefante'),
  Y is no,
  write(X).

