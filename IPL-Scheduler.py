def round(lst):
    j=len(lst)-1
    a=lst[1]
    for i in range(1,len(lst)-1):
        lst[i]=lst[i+1]
    lst[-1]=a
    return lst
def match(lst):
    teams=len(lst)
    j=teams-1
    for i in range(0,teams+1):
        if(j>i):
            print(lst[i], 'VS',lst[j])
            j-=1

lst=['MI','CSK','RCB','KKR','SRH','KXIP','RR','DC']
match(lst)
for r in range(0, len(lst)-2):
    round(lst)
    match(lst)
    
    
#if you want double round robin(like actual IPL) then run this code for two times within a loop :)
