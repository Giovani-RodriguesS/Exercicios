#include <stdio.h>
#include <stdlib.h>

int main()
{
    int arr[] = {2,1,7,6,8,4,93,11,21,14};
    int n = sizeof(arr)/sizeof(arr[0]);
    int op;
    printf("Qual tipo de ordenacao sera: \n1.crescente \n2.decrescente\n");
    scanf("%d", &op);
    if (op == 1)
        bSortCres(arr, n);
    if (op == 2)
        bSortDec(arr,n);
    if(op != 1 && op != 2)
        printf("Valor invalido");

    return 0;
}
void bSortCres (int arr[], int n) {
    int i,j;
    for(i=0;i<n-1;i++)
        for(j=0;j<n-i-1;j++)
            if(arr[j]> arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }

    for(int k=0;k<n;k++)
        printf("%d,%c ", arr[k],' ');
}
void bSortDec (int arr[], int n) {
    int i,j;
    for(i=0;i<n-1;i++)
        for(j=0;j<n-i-1;j++)
            if(arr[j]<arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }

    for(int k=0;k<n;k++)
        printf("%d,%c ", arr[k],' ');
}

