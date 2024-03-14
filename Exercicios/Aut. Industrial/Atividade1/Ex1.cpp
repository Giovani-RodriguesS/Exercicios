//Variaveis
    int BT = 6;
    int LED = 4;
    bool estado_BT = false;
void setup ()
{
	pinMode(BT,INPUT);
  	pinMode(LED,OUTPUT);
  	
}

void loop () 
{   
    estado_BT = digitalRead(BT);
    
    if(estado_BT == true)
        digitalWrite(LED,1);
    else
        digitalWrite(LED,0);
}
