#include <stdio.h>
int main()
{
    char op[5];
    printf("Enter a Operator:\n");
    fgets(op, 5, stdin);
    switch (op[0])
    {
    case '+':
        printf("This is the addition operator.\n");
        break;
    case '-':
        printf("This is the substraction operator.\n");
        break;
    case '*':
        printf("This is the multiplication operator.\n");
        break;
    case '/':
        printf("This is the division operator.\n");
        break;
    case '<':
        if (op[1] == '=')
            printf("This is the less than or equal to operator.\n");
        else if (op[1] == '<')
            printf("This is left shift operator.\n");
        else
            printf("This is less than operator.\n");
        break;
    case '>':
        if (op[1] == '=')
            printf("This is the greater than or equal to operator.\n");
        else if (op[1] == '>')
            printf("This is the right shift operator.\n");
        else
            printf("This is greater than operator.\n");
        break;
    case '!':
        if (op[1] == '=')
            printf("This is the not equal to operator.\n");
        elseprintf("This is not a operator\n");
        break;
    case '&':
        if (op[1] == '&')
            printf("This is the and operator.\n");
        elseprintf("This is not a operator\n");
        break;
    case '|':
    {
        if (op[1] == '|')
            printf("This is the or operator.\n");
        elseprintf("This is not a operator\n");
    }
    break;
    case '=':
        if (op[1] == '=')
            printf("This is the comparative equal to operator.\n");
        elseprintf("This is equal to operator\n");
        break;
    default:
        printf("This is not a operator.\n");
        break;
    }
}