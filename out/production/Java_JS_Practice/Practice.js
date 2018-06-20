// Implement a function named factorial that has one parameter: an integer, n. It must return the value of n! (i.e.,  factorial).
//Factorials are recurive funcions
function Factoral(n){
    if(n < 0){
        return -1;
    }
    else if(n == 0){
        return 1;
    }
    else{
        return (n * factorial(n-1));
    }
}