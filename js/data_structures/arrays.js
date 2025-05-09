const arr = [1, 2, 3, 4, 5];
console.log(arr[0]); // 1
console.log(arr); // [1, 2, 3, 4, 5]

// Mix of data types
const mixedArr = [1, "hello", true, null, undefined];
console.log(mixedArr); // [1, 'hello', true, null, undefined]

// Slicing arrays
const slicedArr = mixedArr.slice(1, 3);
console.log(slicedArr); // ['hello', true]

mixedArr.slice(-2); // [null, undefined]

mixedArr.push("This is Sparta");
console.log(mixedArr); // [1, 'hello', true, null, undefined, 'This is Sparta']

// Removing from the beginning and end of an array
mixedArr.shift();
console.log(mixedArr); // ['hello', true, null, undefined, 'This is Sparta']

// Adding to the beginning and end of an array
mixedArr.unshift(100);
console.log(mixedArr); // [100, 'hello', true, null, undefined, 'This is Sparta']

// Removing from the end of an array
mixedArr.pop();
console.log(mixedArr); // [100, 'hello', true, null, undefined]
