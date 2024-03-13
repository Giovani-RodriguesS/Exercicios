//variaveis
int BT1 = 6;
int BT2 = 4;
int LED = 3;
bool estadoBT1;
bool estadoBT2;

void setup()
{
	pinMode(BT1,INPUT);
  	pinMode(BT2,INPUT);
	pinMode(LED,OUTPUT);

}
void loop() 
{   
    estadoBT1 = digitalRead(BT1);
    estadoBT2 = digitalRead(BT2);

    if (estadoBT1 && estadoBT2)
        digitalWrite(LED,0);            
	else if(estadoBT1)
        digitalWrite(LED,1);
    else if (estadoBT2)
        digitalWrite(LED,1);
}
