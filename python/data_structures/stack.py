'''
Lists in Python doubles down as stacks and queues.
'''
stack = []
stack.append(1)
stack.append(2)
stack.append(3)
print(stack)  # [1, 2, 3]
print(stack.pop())  # 3
print(stack)  # [1, 2]
print(stack[-1]) # Top element of the stack