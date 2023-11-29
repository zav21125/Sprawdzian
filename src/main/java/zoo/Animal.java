package zoo;

public class Animal {

String spiece;
int age; // liczba calkowita
long haircount; // liczba calkowita -2^32 - 2^32
double height; // liczba zmiennoprzecinkowa - 2 po przecinku
float weight; //liczba zmiennoprzecinkowa
boolean isAlive; // zmienna logiczna true/false

public void speak() {
    //sout
    System.out.println("hello I am " + spiece);
}
}

