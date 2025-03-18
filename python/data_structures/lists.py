flowers_list = ['rose', 'lily', 'tulip', 'daisy', 'sunflower']
print(flowers_list)  # ['rose', 'lily', 'tulip', 'daisy', 'sunflower']

# Accessing elements in a list
# Indexing starts from 0
print(flowers_list[0])  # rose

# Slicing
print(flowers_list[:3])  # ['rose', 'lily', 'tulip']
print(flowers_list[1:3])  # ['lily', 'tulip']
print(flowers_list[3:])  # ['daisy', 'sunflower']
print(flowers_list[-1])  # sunflower
print(flowers_list[-3:])  # ['tulip', 'daisy', 'sunflower']

# Adding elements to a list
flowers_list.append('orchid')
print(flowers_list)  # ['rose', 'lily', 'tulip', 'daisy', 'sunflower', 'orchid']

# List of numbers
numbers_list = [1, 2, 3, 4, 5]
## Sum
print(sum(numbers_list))  # 15
## Average
print(sum(numbers_list) / len(numbers_list))  # 3.0
print(sum(numbers_list) // len(numbers_list))  # 3
print(sum(numbers_list[:5])/5)

# List of strings and numbers
mixed_list = ['apple', 1, 'banana', 2, None]
print(mixed_list)  # ['apple', 1, 'banana', 2, None]