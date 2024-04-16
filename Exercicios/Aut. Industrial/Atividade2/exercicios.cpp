//ex1
// vars
int led = 13;

void setup() 
{   
     //monitor serial
    Serial.begin(9600); //baud rate
  	pinMode(led,OUTPUT);
}


void loop ()
{ 
  	digitalWrite(led, 1);
  	Serial.println("Estado do LED: Ligado");	
  	delay(1000);
  	digitalWrite(led, 0);
  	Serial.println("Estado do LED: Desligado");	
  	delay(1000);
  	
}

//ex2

// vars
int count = 0;
void setup() 
{   
     //monitor serial
    Serial.begin(9600); //baud rate
  	pinMode(3,OUTPUT);
}


void loop ()

{ 	
	Serial.println("Valor da intensidade: ");
  	Serial.println(count);
 	if(count > 255){
      count = 0;
      analogWrite(3, count);
      delay(1000);
    }
 	 else{ 
  		analogWrite(3, count);
      	delay(300);
  	}
  	count += 50;
}
//ex3
int vermelho = 8;
int amarelo = 10;
int verde = 9;

    void setup() {
    pinMode(vermelho, OUTPUT);
    pinMode(verde, OUTPUT);
    pinMode(amarelo, OUTPUT);
    Serial.begin(9600);
    }

    void loop() {
    
	char entrada = Serial.read();
//vermelho
	if (entrada == 'r' || entrada =='R'){
    digitalWrite(vermelho,1);
    digitalWrite(verde,0);
    digitalWrite(amarelo,0);
    Serial.println("vermelho: Ligado!");
    }
//verde
    else if (entrada == 'g' || entrada =='G'){ 
        digitalWrite(verde,1);
        digitalWrite(amarelo,0);
        digitalWrite(vermelho,0);
        Serial.println("Verde: Ligado!");
    }
//amarelo
    else if (entrada == 'y' || entrada =='Y'){
        digitalWrite(amarelo,1);
        digitalWrite(vermelho,0);
        digitalWrite(verde,0);
        Serial.println("amarelo: Ligado!");
            }
	}
//ex4
int bt = 2;
bool estadoBt = 0;

void setup(){

  pinMode(bt,INPUT);
  Serial.begin(9600);
}

void loop(){
    estadoBt = digitalRead(bt);

    if(estadoBt == 0){
        Serial.println("Desligado!");
    }
    else{
        Serial.println("Ligado!");
    }
}
//ex5
int bt1 = 6;
int bt2 = 4; 
int led_amarelo = 10;
int led_verde = 9;
int led_vermelho = 8;

int vermelho = 0;
int amarelo = 0;
int verde = 0;

bool estadobt1 = 0;
bool estadobt2 = 0;

void setup(){
    Serial.begin(9600);
    pinMode(bt1,INPUT);
    pinMode(bt2,INPUT);
  
    pinMode(led_amarelo,OUTPUT);
  	pinMode(led_verde,OUTPUT);
  	pinMode(led_vermelho,OUTPUT);
}

void loop(){
    digitalWrite(led_amarelo,0);
    digitalWrite(led_vermelho,0);
    digitalWrite(led_verde,0);
    estadobt1 = digitalRead(bt1);
    estadobt2 = digitalRead(bt2);

    if(estadobt1 == 1 && estadobt2 == 1){
        digitalWrite(led_vermelho,1);
        digitalWrite(led_verde,0);
        digitalWrite(led_amarelo,0);
        if(vermelho > 0){
            Serial.println("led_vermelho: Ligado!");
            vermelho = 0;
    
        }
        else{
            Serial.println("led_vermelho: Desligado!");
            vermelho = 1;
        }
        
    }

    if(estadobt1 == 1 ^ estadobt2 == 1){
        digitalWrite(led_amarelo,1);
        digitalWrite(led_vermelho,0);
        digitalWrite(led_verde,0);
        if(amarelo > 0){
                Serial.println("led_amarelo: Ligado!");
                amarelo = 0;
            }
            else{
                Serial.println("led_amarelo: Desligado!");
                amarelo = 1;
        }
    }
  
    if(estadobt1 == 1 || estadobt2 == 1){
        digitalWrite(led_amarelo,0);
        digitalWrite(led_vermelho,0);
        digitalWrite(led_verde,1);
        if(verde > 0){
            Serial.println("led_verde: Ligado!");
            verde = 0;
        }
        else{
            Serial.println("led_verde: Desligado!");
            verde = 1;
        }
    }
}

//ex6
int estado_pot;
int pot = A0;
String val = "Valor do potenciomentro: ";

void setup() 
{   
     //monitor serial
    Serial.begin(9600); //baud rate
}


void loop ()
{ 	
  estado_pot = analogRead(pot); // leitura da A0
  Serial.println(val + estado_pot); // 
  delay(100);
  
}

//ex7
int bits = 0;
int led = 9;

void setup(){
  
  pinMode(led, OUTPUT);
  Serial.begin(9600);
}

void loop(){
    bits = analogRead(A0)/4;
    if(bits == 0){
        digitalWrite(led,0);
        Serial.println("Desligado!");
    }
    else{
        analogWrite(led, bits);
        Serial.println("Ligado!");
    }
}
// ex8

int tmp, volt,val;
String celsius = " Celsius";

void setup() 
{   
     //monitor serial
    Serial.begin(9600); //baud rate
}


void loop ()
{ 	
  	val= analogRead(A0);
  	volt = (val/1024.0) * 5000; // mVolts
  	tmp = (volt-500) * 0.1; // temperatura em C ;
  	Serial.println("Temperatura: ");
  	Serial.println(tmp + celsius);
  	delay(1000);
}

//ex9
int foto = A0;
int val;
int led = 3;

void setup() 
{   
     //monitor serial
    Serial.begin(9600); //baud rate
  	pinMode(led, OUTPUT);
}


void loop ()
{ 	
  val = analogRead(A0);
  if(val < 1){
    Serial.println(val);
  	digitalWrite(led, 0);
  }
  
  if(val == 1 )
    Serial.println(val);
  	digitalWrite(led, 1);
}
//ex10
int tmp, volt,val;
const int BUZZ = 2;
//limites tmp > 50 e tmp < 90 graus c - 1 toc, tmp > 90 - 2 tocs

void setup() 
{   
     //monitor serial
  	pinMode(BUZZ, OUTPUT);
    Serial.begin(9600); //baud rate
}


void loop ()
{ 	
  temperatura();
}
void temperatura () {
	val= analogRead(A0);
  	volt = (val/1024.0) * 5000; // mVolts
  	tmp = (volt-500) * 0.1; // temperatura em C ;
  	Serial.println("Temperatura: ");
  	Serial.println(tmp);
  	if(tmp > 50 && tmp < 90)
      apito(1); //
  	if(tmp > 90)
      apito(2); // 
  	delay(1000);
}


void apito(int n) {
  for(int i=0;i<n;i++)
  {
  tone(BUZZ, 220,100);
  delay(200);
  }
}
