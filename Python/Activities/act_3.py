user1 = input("User 1 : do you want to choose rock, paper or scissors?")
user2 = input("User 2 : do you want to choose rock, paper or scissors?")
if user1 == user2:
    print("It is a tie !")
elif user1 =="rock": 
    if user2 == "paper":
        print("user 2 wins !")
    else :
        print("User 1 wins !")
elif user1 == "paper":
    if user2 == "rock":
        print("user 1 wins !")
    else :
        print("User 2 wins !")
elif user1 == "scissors":
    if user2 == "rock":
        print("user 2 wins !")
    else :
        print("User 1 wins !")

else:
    print("Invalid input! You have not entered rock, paper or scissors, try again")


