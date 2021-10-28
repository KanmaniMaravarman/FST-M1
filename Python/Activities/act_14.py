def fibonacci(number):
    if number <= 1:
        return number
    else:
        return(fibonacci(number-1) + fibonacci(number-2))


nterms = int(input("enter the nth term :"))
if nterms < 0:
    print("please enter the number greater than 1")
else:
    for i in range (nterms):
        print(fibonacci(i))