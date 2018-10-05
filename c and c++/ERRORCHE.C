#include<stdio.h>
#include<conio.h>
#include<graphics.h>
#include<stdlib.h>
void main()
{
int gd=DETECT,gm,err ;
initgraph (&gd,&gm,"c://turboc3//bgi");
err=graphresult();
if(err!=grOk)
{
printf("graphics error %s",grapherrormsg(err));
getch();
exit(1);
}
outtext("graphdisplayed");
getch();
closegraph();
}
