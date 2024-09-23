
//Declaração das variáveis
int vermelho = 3;
int amarelo = 4;
int verde = 5;
int vermelhoPed = 7;
int verdePed = 6;
int botao = 2;

//void setup
void setup(){
    //Determina que os pinos 3,4,5 serão saídas.
  	pinMode(vermelhoPed, OUTPUT);
	pinMode(verdePed, OUTPUT);	  
  	pinMode(vermelho, OUTPUT);
    pinMode(amarelo, OUTPUT);
    pinMode(verde, OUTPUT);
  	pinMode(botao, INPUT);
  //intermitente inicial
  	controlaCor(amarelo, 1000, false);
    controlaCor(amarelo, 1000, false);
    controlaCor(amarelo, 1000, false);
  }

void loop(){
	controlaCor(vermelho,5000,true);
   	controlaCor(verde,5000,true);
  	controlaCor(amarelo,2500,true);
}

// função intermitente

int interm (int cor) { 
  for(int i = 0; i<4; i++){
  digitalWrite(cor, 1);
     delay(400);
  	digitalWrite(cor,0);
    delay(400);}
  	digitalWrite(cor, 1);
      delay(500);
}
  
int controlaCor (int cor, int tempo, bool esta_no_loop) {
  //botao
  if(digitalRead(botao) == 1)
    tempo = 1000;
  else
    tempo = tempo;
	//controle de cor  
  if(cor == vermelho) { //vermelho
  		
    	digitalWrite(cor, 1);
    	delay(300);
    	digitalWrite(verdePed, 1);
    	delay(tempo);
    	digitalWrite(verdePed,0);
    	interm(vermelhoPed);
    	digitalWrite(vermelhoPed,1);
    	digitalWrite(cor, 0);
    
    }else if(cor == verde ) { // verde
    		digitalWrite(cor,1);
      		delay(tempo);
      		digitalWrite(cor,0);
    }else{ // amarelo
    	digitalWrite(cor,1);
    	delay(tempo);
    	digitalWrite(cor,0);
    	digitalWrite(vermelho,1);
    	delay(400);
    	digitalWrite(vermelhoPed,0);
    }
  	
    
 //Esta no loop 
  if(esta_no_loop == false){
        delay(tempo);
        return 0;      
    }
    else{
        return 1;
     	 }
}
