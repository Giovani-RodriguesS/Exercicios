// Learn about the ESP32 WiFi simulation in
// https://docs.wokwi.com/guides/esp32-wifi

#include <LiquidCrystal_I2C.h>
#include <string>

LiquidCrystal_I2C LCD = LiquidCrystal_I2C(0x27, 16, 2);

String str = "";
String palavra = "";
int tempo =0;

void setup() 
{
  //LCD.setCursor(col,lin)
  Serial.begin(9600);
  inicializacao();
  LCD.print("Digite algo >");
}

void loop () 
{ 
  palavra = Serial.readString();
  if(palavra != "")
    if(palavra.length() < 16)
      escrever(0,0, palavra);
    else{
    escrever(3, 0, "Invalido");
    LCD.setCursor(3,0);
    LCD.print("Digite um");
    LCD.setCursor(2,1);
    LCD.print("Valor valido");
    delay(2000);
    }
  //scroll();
}
void escrever (int x, int y, String msg) 
{
  if(msg != str && msg != "")
    LCD.clear();
  LCD.setCursor(x,y);
  LCD.print(msg);
  delay(1000);
  
  str = msg;
}
void inicializacao () 
{
  LCD.init();
  LCD.backlight();
  LCD.setCursor(0,0);
  LCD.print("Inicializando...");
  delay(1500);
  LCD.clear();
  LCD.setCursor(5,0);
  LCD.print("Aguarde");
  delay(1500);
  LCD.clear();
}

void scroll() 
{
  LCD.setCursor(15, 1);           // selecionando coluna 16 e linha 1
  LCD.print("Hello");
  for(int i=0;i<23; i++){
  	LCD.scrollDisplayLeft();
    delay(50); 
  }
  for(int i=0;i<24; i++){
  	LCD.scrollDisplayRight();
    delay(40); 
  }
  LCD.clear();
  for(int i=0;i<5;i++){	
    LCD.setCursor(4,0);
    LCD.print("World");
    delay(200);
    LCD.clear();
    delay(200);
  }
}