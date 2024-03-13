//Variaveis
    int BT = 6;
    int LED = 4;
	int quantidade = 0;
	int tempo = 1000;
	bool repouso_BT = false; 
    bool estado_BT = false;

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
  		quantidade += 1;
  		tempo = tempo/quantidade;
      	repouso_BT = false;
  	}else
     	repouso_BT = true; 
      
  if(estado_BT){
  		piscaLed();
    	
  }
}
void piscaLed() {
  for(int i=0;i<quantidade;i++){
    digitalWrite(LED,1);
  	delay(tempo);
  	digitalWrite(LED,0);
  	delay(tempo);
  }
}