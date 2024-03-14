//Variaveis
    int G = 9;
    int F = 8;
    int A = 3;
    int B = 4;
    int E = 7;
    int D = 6;
    int C = 5;
    int BT = 2;
	
    bool estado_BT = false;

void setup ()
{
  	for(int i=3;i<=9;i++){
        pinMode(i,OUTPUT);
    }
  	pinMode(BT,INPUT);
  	
}

void loop () 
{   estado_BT = digitalRead(BT);
    if (estado_BT == true) {
        for(int j = 9;j>=0;j--){
            visor(j);
            delay(500);
        }
    }else {
        visor(0);
    }
}

//Controle do visor
void visor(int num) {

  switch(num){
        case 0:
            for(int j=3;j<=9;j++){
                if (j == G) {
                    digitalWrite(j,0);
                }
                else {
                    digitalWrite(j,1);
                }
            }
            break;
        case 1:
            for(int j=3;j<=9;j++){
                if (j == B || j == C) {
                    digitalWrite(j,1);
                }
                else {
                    digitalWrite(j,0);
                }
            }
            break;
        case 2:
            for(int j=3;j<=9;j++){
                if (j == C || j == F) {
                    digitalWrite(j,0);
                }
                else {
                    digitalWrite(j,1);
                }
            }
            break;
        case 3:
            for(int j=3;j<=9;j++){
                if (j == E || j == F) {
                    digitalWrite(j,0);
                }
                else {
                    digitalWrite(j,1);
                }
            }
            break;
        case 4:
            for(int j=3;j<=9;j++){
                if (j == A || j == D || j == E) {
                    digitalWrite(j,0);
                }
                else {
                    digitalWrite(j,1);
                }
            }
            break;
        case 5:
            for(int j=3;j<=9;j++){
                if (j == B || j == E) {
                    digitalWrite(j,0);
                }
                else {
                    digitalWrite(j,1);
                }
            }
            break;
        case 6:
            for(int j=3;j<=9;j++){
                if (j == B) {
                    digitalWrite(j,0);
                }
                else {
                    digitalWrite(j,1);
                }
            }
            break;
        case 7:
            for(int j=3;j<=9;j++){
                if (j == A || j == B ||j == C) {
                    digitalWrite(j,1);
                }
                else {
                    digitalWrite(j,0);
                }
            }
            break;
        case 8:
            for(int j=3;j<=9;j++)
                digitalWrite(j,1);
            break;
        case 9:
            for(int j=3;j<=9;j++){
                if (j == E) {
                    digitalWrite(j,0);
                }
                else {
                    digitalWrite(j,1);
                }
            }
            break;
        default:
            for(int j=3;j<=9;j++)
                digitalWrite(j,0);
  }
}