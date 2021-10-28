def calculate_sum(num):
    sum=0
    for number in num:
      sum = sum+ int(number)
    return sum

list1= list(input("enter the number with space :").strip().split())
print(list1)
result = calculate_sum(list1)
	
print("The sum of all the elements is: " + str(result))
