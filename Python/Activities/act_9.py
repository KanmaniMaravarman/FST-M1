list1= list(input("provide the list 1 with spaces :").strip().split())
print(list1)
list2 = list(input("provide the list 2 with spaces :").strip().split())
print(list2)
list3=[]

for num in list1:
    if (int(num) %2 !=0):
       list3.append(num)
print(list3)
for num in list2:
    if(int(num)%2 == 0):
        list3.append(num)
print("list3 contains the odd number from list1 and even number from list2 :" ,list3)