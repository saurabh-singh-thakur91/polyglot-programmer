const stack = [];

stack.push(1);
stack.push("focus");
stack.push(true);
stack.push(null);
stack.push(undefined);
stack.push({ name: "John" });
stack.push([1, 2, 3]);
stack.push(function () {
  console.log("This is a function");
});

console.log(stack);

console.log(stack[stack.length - 1]);

console.log(stack.pop());
console.log(stack);
