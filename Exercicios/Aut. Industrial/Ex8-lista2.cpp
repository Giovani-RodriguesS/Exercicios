//Variaveis
    int BT = 6;
    int LED = 4;
	int tempo = 2000;
    bool estado_BT = false;
    bool repouso_BT = true;

void setup ()
{
	pinMode(BT,INPUT);
  	pinMode(LED,OUTPUT);
}

void loop () 
{   
    estado_BT = digitalRead(BT);
  	
    if(estado_BT && repouso_BT)
    {
        digitalWrite(LED,1);
        delay(tempo);
        digitalWrite(LED,0);
        repouso_BT = false;
    }
    else if(estado_BT == false)
        	repouso_BT = true;
}