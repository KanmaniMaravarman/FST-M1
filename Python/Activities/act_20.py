import pandas

dataframe = pandas.read_excel('sample.xlsx')

print(dataframe)
print("number of rows and columns :" ,dataframe.shape)
print("Emails :")
print(dataframe['Email'])
print("sorted data :")
print(dataframe.sort_values('FirstName'))