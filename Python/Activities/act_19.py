import pandas
from pandas import ExcelWriter
from pandas.core.frame import DataFrame

data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

dataFrame = pandas.DataFrame(data)
print(dataFrame)

writer = ExcelWriter("sample.xlsx")
dataFrame.to_excel(writer,'sheet1',index=False)
writer.save()