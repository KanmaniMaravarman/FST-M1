import pytest

@pytest.mark.great
def test_add():
    num1=10
    num2 =15

    #Sum of two numbers
    sum = num1+num2
    assert sum ==25

def test_subtract():
    num1= 30
    num2 =15
    
    #Difference of two numbers
    diff = num1-num2
    assert diff == 15

 # Multiplication test
def test_multiplication():
  
	# Initialize two numbers
	num1 = 5
	num2 = 20
    
	# Multiply them
	prod = num1 * num2
 
	# Assertion
	assert prod == 100
 
# Division test
def test_division():
  
	# Initialize two numbers
	num1 = 100
	num2 = 5
    
	# Divide them
	quot = num1 / num2
 
	# Assertion
	assert quot == 20
