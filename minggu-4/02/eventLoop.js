const bar = () => console.log('bar')

const baz = () => console.log('baz')

const foo = () => {
  console.log('foo')
  setTimeout(bar, 0)
  new Promise((resolve, reject) =>
    resolve('should be right after baz, before bar')
  ).then(resolve => console.log(resolve))
  baz()
}

foo()

// console.log("Getting Data1");
// var data1 = getData('123');
// console.log("Data is:", data1);

// console.log("Getting Data2");
// var data2 = getData('456');
// console.log("Data is:", data2);

// var sum = 1 + 2;
// console.log("sum is:", sum);