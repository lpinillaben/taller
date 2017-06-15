mover(1,X,Y,_) :-  
    write('Mover disco de: '), 
    write(X), 
    write(' a '), 
    write(Y), 
    nl. 
mover(D,X,Y,Z) :- 
    D>1, 
    M is D-1, 
    mover(M,X,Z,Y), 
    mover(1,X,Y,_), 
    mover(M,Z,Y,X). 