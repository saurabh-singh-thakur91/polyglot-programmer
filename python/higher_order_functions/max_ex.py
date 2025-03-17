def mod_5(x):
    return x % 5

# max function can take a key argument to specify a function to be called on each list element prior to making comparisons
print(
    'Which number is biggest?',
    max(100, 51, 14, 26),
    'Which number is the biggest modulo 5?',
    max(100, 51, 14, 26, key=mod_5),
    sep='\n'
    )