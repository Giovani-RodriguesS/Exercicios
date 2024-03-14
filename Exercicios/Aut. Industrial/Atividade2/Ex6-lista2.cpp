int led1 = 3;
int led2 = 4;
int led3 = 5;
int BT = 2;
int quantidade =0;
bool estado_BT;
bool liberado;

void setup () 
{    
    for (int i = 3; i < 6; i++)
    {
    pinMode(i,OUTPUT);
    }
    pinMode(BT,INPUT);
}
void loop () 
{	estado_BT = digitalRead(BT);
    if (estado_BT && liberado)
    {
        quantidade += 1;
        delay(1000);
        liberado = false;
    }
    if (!estado_BT)
    {
        liberado = true;
    }
    switch (quantidade)
    {
    case 1:
        digitalWrite(led3,0);
        digitalWrite(led1,1);
        break;
    case 2:
        digitalWrite(led1,0);
        digitalWrite(led2,1);
        break;
    case 3:
        digitalWrite(led2,0);
        digitalWrite(led3,1);
        break;
    default:
        quantidade = 0;
        break;
    }

}

//https://www.tinkercad.com/things/3PjNkScFmiR-copy-of-copy-of-semaforo/editel?tenant=circuits