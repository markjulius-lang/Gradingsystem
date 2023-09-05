#This is the seperator for my code
sep_length = 50
separator = "\n\t" + "=" * sep_length + "\t\n"
print(separator)

#My information, It is not required but I prefered to add this because this is how I create code when I'm in STI
name = "Bongalbal Mark Julius P."
course = "BSIT"
grade = "1st Year"
block = "Block 4"

#This is the formatted output for my Information, this is in one line
formatted_str = f"\t{name:<10}  {course:<5} {grade:<5}  {block}"
print(formatted_str)

#The separator
sep_length = 50
separator = "\n\t" + "=" * sep_length + "\t\n"
print(separator)

#First number
numerator = float(input("\tEnter your numerator: "))

#Second number
denominator = float(input("\tEnter your denominator: "))

#Formula
quotient = numerator / denominator

#I used if and else statement because in division not all quotient is not an int.
if quotient.is_integer():
    print(f"\tThe result is: {int(quotient)}")#No Decimal point
    
else:
    print(f"\n\tThe result is: {quotient:.2f}")#With decimal point. I add ":.2f" to get the two numbers after decimal point. Maybe it is not required but for easily readable only.


#This is what I code using java so that I apply my some knowledge for this code like if and else.