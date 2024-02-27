//Variaveis
    int G = 9;
    int F = 8;
    int A = 3;
    int B = 4;
    int E = 7;
    int D = 6;
    int C = 5;
    int BT = 2;
    bool estado_BT = false;
void setup ()
{
  	pinMode(A,OUTPUT);
  	pinMode(B,OUTPUT);
  	pinMode(C,OUTPUT);
  	pinMode(D,OUTPUT);
  	pinMode(E,OUTPUT);
  	pinMode(F,OUTPUT);
  	pinMode(G,OUTPUT);
  	pinMode(BT,INPUT);
  	
}

void loop () 
{   estado_BT = digitalRead(BT);
    if(estado_BT == true) {
        digitalWrite(A,1);
        digitalWrite(B,1);
        digitalWrite(C,1);
        digitalWrite(D,1);
        digitalWrite(E,1);
        digitalWrite(F,1);
        digitalWrite(G,1);
    }
    else {
        digitalWrite(A,0);
        digitalWrite(B,0);
        digitalWrite(C,0);
        digitalWrite(D,0);
        digitalWrite(E,0);
        digitalWrite(F,0);
        digitalWrite(G,0);
    }
}
