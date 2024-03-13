//variaveis
int led1 = 3;
int led2 = 4;
int led3 = 5;
float tempo = 5;
void setup()
{
  for(int i=3;i<=5;i++)
  	pinMode(i,OUTPUT);
}

void loop(){ 
  tempoLed(tempo);
  tempo = 0.15*tempo+tempo;
  if(tempo > 5000)
    tempo = 5;
}
void tempoLed(float tempo){
    digitalWrite(led1,1);
    delay(tempo);
    digitalWrite(led1,0);
    digitalWrite(led2,1);
    delay(tempo);
    digitalWrite(led2,0);
    digitalWrite(led3,1);
    delay(tempo);
    digitalWrite(led3,0);
}