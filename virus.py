n=int(input("enter population (n>100) : "))
if n<100:
    raise ValueError
affected=int(n/6)
days=0
remaining=n-affected
while affected>0:
    affected+=10
    affected-=15
    remaining-=10
    days+=1
print("people without effected are : ",remaining)
print("city will be free from virus in  : ",days,"days")
