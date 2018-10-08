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
outtextxy(100,20,"drawing line");
line(100,100,300,200);
getch();
closegraph();
}
