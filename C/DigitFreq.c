#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    char num[1000];
    scanf("%s", num);
    int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,s=0,j=0;
    for(int i = 0 ; num[i] != '\0';i++){
        if(num[i] == '0'){
            a++;
        }
        else if(num[i] == '1'){
            b++;
        }
        else if(num[i] == '2'){
            c++;
        }
        else if(num[i] == '3'){
            d++;
        }
        else if(num[i] == '4'){
            e++;
        }
        else if(num[i] == '5'){
            f++;
        }
        else if(num[i] == '6'){
            g++;
        }
        else if(num[i] == '7'){
            h++;
        }
        else if(num[i] == '8'){
            s++;
        }
        else if(num[i] == '9'){
            j++;
        }
    }
    printf("%d %d %d %d %d %d %d %d %d %d", a,b,c,d,e,f,g,h,s,j);    
    return 0;
}
