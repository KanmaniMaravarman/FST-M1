numbers = list(input("Enter a sequence with spaces: ").strip().split(" "))
print(numbers)
sum = 0
 
for number in numbers:
  sum = sum+ int(number)

print(sum)