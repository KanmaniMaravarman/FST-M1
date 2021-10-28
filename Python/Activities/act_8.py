numbers = list(input("provide the number with space : ").strip().split())
firstElement = numbers[0]
lastElement = numbers[-1]
if(firstElement == lastElement):
    print("True")
else:
    print("False")
