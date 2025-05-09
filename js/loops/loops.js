let numbers = [1, 2, 3, 4, 5];
for (let i = 0; i < numbers.length; i++) {
  console.log(numbers[i]);
}

numbers.forEach(function (num, index) {
  console.log(`Index: ${index}, Value: ${num}`);
});

// Using arrow function in forEach
numbers.forEach((num, index) => {
  console.log(`Index: ${index}, Value: ${num}`);
});

// Using for...of loop
// This loop is used to iterate over iterable objects like arrays, strings, etc.
for (const num of numbers) {
  console.log(num);
}
