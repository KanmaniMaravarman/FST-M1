import pandas

data = {
    "usernames" : ["admin","george","Deepu"],
    "passwords" : ["password","charl113","Deeps123"]
}

dataframe = pandas.DataFrame(data)
print(dataframe)
dataframe.to_csv("sample.csv",index=False)