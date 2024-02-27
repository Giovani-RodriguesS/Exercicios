//Variaveis
    int vermelho = 3;
    int verde = 5;
	int amarelo = 4;

void setup ()
{
  	pinMode(verde,OUTPUT);
  	pinMode(vermelho,OUTPUT);
  	pinMode(amarelo,OUTPUT);
  	
}

void loop () 
{   
    controla_led(vermelho,2500);
    controla_led(verde,2500);
    controla_led(amarelo,2500);

}

void controla_led (int cor, int tempo)
{
    digitalWrite(cor,1);
    delay(tempo);
    digitalWrite(cor,0);
}