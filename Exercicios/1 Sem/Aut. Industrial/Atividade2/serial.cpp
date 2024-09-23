// vars
int vermelho = 7;
int amarelo = 6;
int verde = 5;
int azul = 4;
int laranja = 3;
int branco = 2;

String opcao = " ";
bool contador = false;
int pot = 0;
int tempo = 0;

void setup() 
{   
     //monitor serial
    Serial.begin(9600); //baud rate
    Serial.println("Inicializando...");
    delay(1500);
    
    for(int i=2;i<8;i++){
        pinMode(i, OUTPUT);
      	String declaracao = "Pino definido: ";
        Serial.println(declaracao + i);
      	delay(250);
    }
  	Serial.println("Sistema pronto.");
}


void loop ()
{ 
    pot = analogRead(A0); 
    tempo = map(pot, 0, 1023, 5000, 200);
    Serial.println("Tempo (m/s): "tempo);

    if (contador == false)
    {
        Serial.println("Pressione D para decrescente");
        Serial.println("Pressione C para crescente");
      	contador = true;
    }
    
    if (Serial.available() > 0)
    {
        opcao = Serial.readString();
        Serial.println(opcao);
    }
    controla(opcao);
}
void controla (String sentido) {
    if (sentido == "C")
    {
        Serial.println("Crescente");
        for(int i=2; i<8; i++)
        {
            digitalWrite(i,1);
            delay(tempo);
            digitalWrite(i,0);
        }
    }
    else if (sentido == "D")
    {   
        Serial.println("Decrescente");
        for(int i=7; i>=2; i--)
        {
            digitalWrite(i,1);
            delay(tempo);
            digitalWrite(i,0);
        }
    }
    else if(sentido != "C" && sentido != "D" || contador ==true){
        Serial.println("Valor invalido");
        contador = false;
    }
}