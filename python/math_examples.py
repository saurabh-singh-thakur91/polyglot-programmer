import math

# Regular division in Python 3, Floating point result
print(math.ceil(3/2))

# Integer division in Python 3, Integer result
print(math.ceil(3//2))

# abs() is a built in function
print(abs(-3))

# fabs() for floating point abs value
print(math.fabs(-3.5))

almost_pi = 22/7
print(almost_pi)

rounded_pi = round(almost_pi, 5)
print(rounded_pi)

rounded_pi = round(almost_pi, 4)
print(rounded_pi)

# rounding to the nearest 10, 100, 1000 etc.
print(round(12345, -1))
print(round(12345, -2))
print(round(12345, -3))

