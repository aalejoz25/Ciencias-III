#include<stdio.h>
#include<iostream>
using namespace std;
int main() {
char ch;
printf("ESCRIBA_LA_VOCAL_");
cin>>ch;
switch(ch) {
case 'a': printf("Se_ha_pulsado_una_a");
break;
case 'e': printf("Se_ha_pulsado_una_e");
break;
case 'i': printf("Se_ha_pulsado_una_i");
break;
case 'o': printf("Sehapulsadouna_o");
break;
case 'u': printf("Se_ha_pulsado_una_u");
break;
default: printf("Error");
}
system("pause");
}