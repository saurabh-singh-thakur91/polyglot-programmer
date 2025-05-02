from collections import deque

q = deque()
q.append(1)
q.append(2)
q.append(3)
print(q)  # deque([1, 2, 3])
print(q.popleft())  # 1
print(q)  # deque([2, 3])
print(q.pop())  # 3
print(q)  # deque([2])
print(q.popleft())  # 2
q.extend([4, 5, 6])
print(q)  # deque([4, 5, 6]) 