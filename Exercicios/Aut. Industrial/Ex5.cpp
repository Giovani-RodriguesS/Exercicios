//Ex5
//vars
    
    int LED = 4;

void setup ()
{
  	pinMode(LED,OUTPUT);
  	
}

void loop () 
{   
    piscar_led(LED);
}

void piscar_led (int led)
{
    //300ms
    digitalWrite(led,1);
    delay(300);
    digitalWrite(led,0);
    delay(300);
    //500ms
    digitalWrite(led,1);
    delay(500);
    digitalWrite(led,0);
    delay(500);
    //700ms
    digitalWrite(led,1);
    delay(700);
    digitalWrite(led,0);
    delay(700);
    //900ms
    digitalWrite(led,1);
    delay(900);
    digitalWrite(led,0);
    delay(900);
    //700ms
    digitalWrite(led,1);
    delay(700);
    digitalWrite(led,0);
    delay(700);
    //500ms
    digitalWrite(led,1);
    delay(500);
    digitalWrite(led,0);
    delay(500);
    }
