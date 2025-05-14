str = "pizza"
nums = [0] * 26
for c in str:
    nums[ord(c) - 97] += 1

print(nums)