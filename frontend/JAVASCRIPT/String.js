// let str = "Hello JavaScript";

// console.log(str.startsWith("Hello"));
// console.log(str.endsWith("JavaScript"));
// console.log(str.startsWith("e"));
// console.log(str.endsWith("t"));
// console.log(str.startsWith("v", 4));
// console.log(str.endsWith("v", 7));

//! Split
// let str = "Hello web Tech";

//console.log(str.split()); //!['Hello web Tech']
//? Split method is used to convert the string into array
//?  is no argument is passed then all the string is stored in array in 0th index

//console.log(str.split("")); //! ['H', 'e', 'l', 'l', 'o', ' ', 'w', 'e', 'b', ' ', 'T', 'e', 'c', 'h']

//console.log(str.split(" ")); //!  ['Hello', 'web', 'Tech']

//console.log(str.split("web")); //!['Hello ', ' Tech']

//console.log(str.split("e")); //! ['H', 'llo w', 'b T', 'ch']

//console.log(str.split("E")); //! ['Hello web Tech']

// console.log(str.split("e", 2)); //! ['H', 'llo w']
// //? second argument tell the count means of arrays

// console.log(str.split("e", -2)); //! ['H', 'llo w', 'b T', 'ch']

//? split is used to convert the strong intooo array of sub strongs

//* syntax
//? split(seperator)
//? split(seperator, count) count is optional

//! includes
// let str = "Hello web Tech";

// console.log(str.includes("e"));
// console.log(str.includes("e", 2)); //? second parameter tell from where we have to search

//! Replace
let str = "Hello java and java script";

// console.log(str.replace("java", "html")); //! Hello html and java script
//? first is search string and second is replace string
//? it will replave only first string

// console.log(str.replace("java")); //! Hello undefined and java script

//console.log(str.replace("java", "")); //! Hello  and java script

//! ReplaceAll
console.log(str.replaceAll("java", "html")); //! Hello html and html script

console.log(str.replaceAll("java")); //! Hello undefined and undefined script

console.log(str.replaceAll("java", "")); //! Hello  and  script

console.log(str.replaceAll(" ", "")); //! Hellojavaandjavascript

console.log(str.replaceAll("java", (e) => e.toUpperCase()));
