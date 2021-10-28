import pandas

dataframe= pandas.read_csv("sample.csv")
print("full data :")
print(dataframe)

print("usernames :")
print(dataframe["usernames"])

print("The username and password of the second row")
print(dataframe["usernames"][1], "|",dataframe["passwords"][1])

print("Data sorted in ascending Usernames:")
print(dataframe.sort_values('usernames'))

print("Data sorted in descending Passwords:")
print(dataframe.sort_values('passwords', ascending=False))
