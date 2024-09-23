//Ex5
//vars
    
    int LED = 4;

void setup ()
{
  	pinMode(LED,OUTPUT);
  	
}

void loop () 
{   
    analog_led_led(LED);
}

void analog_led (int led){
    for (int i=0; i <= 10; i++)
    {
        analogWrite(led,(i/10)*256);
        delay(300);
    }
    for (int j=10; i >= 0; i--)
    {
        analogWrite(led,(i/10)*256);
        delay(300);
    }

}
