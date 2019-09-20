process.stdout.write("Looping a triangle \n");
let number1;
let chara = "#";
for (number1 = 0; number1 < 7; number1++) {
  for (let counter = 0; counter <= number1; counter++){
    process.stdout.write(chara);
  }
  console.log();
}
console.log();

process.stdout.write("FizzBuzz \n");
let number2 = 0;
for (number2 = 1; number2 <= 100; number2++){
  if (number2%3==0 && number2%5 != 0) process.stdout.write("fizz ");
  else if (number2%5==0 && number2%3 !=0) process.stdout.write("buzz ");
  else if (number2%5==0 && number2%3 ==0) process.stdout.write("fizzbuzz ");
  else process.stdout.write(number2+" ");
}
console.log("\n");

process.stdout.write("Chessboard \n");
for (number1 = 0; number1 <= 7; number1++) {
  if (number1%2==0) process.stdout.write(" ");
  for (let counter = 0; counter <=7; counter++){
    if (counter%2==0)process.stdout.write(chara);
    else process.stdout.write(" ");
  }
  console.log();
}