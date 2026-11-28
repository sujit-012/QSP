// let car = {
//   brand: "BMW",
//   price: 98987909708097,
// };

// console.log(car.brand); //? Reading the property
// console.log(car["brand"]);
// car.color = "red"; //? Adding a new property
// car.price = "8979869876978"; //? updating the existing property
// console.log(car);

// delete car.color; //? deleting the property
// console.log(car);

//? CRUD Operation

// let mobile = {
//   brand: "Iphone",
//   models: ["Iphone15", "Iphone16", "Iphone17", "Iphone18"],
//   price: [55000, 70000, 85000, 100000],
//   color: ["Black", "Silver", "Orange"],
//   capacity: {
//     RAM: "10GB",
//     ROM: "256GB",
//   },
//   camera: {
//     frontCamera: "12MP",
//     backCamera: "48MP",
//   },
//   isChargerIncluded: false,
// };

// console.log(mobile);

// console.log(mobile.brand);

// mobile.models.forEach((ele) => {
//   console.log(ele);
// });

// mobile.price.forEach((ele) => {
//   console.log(ele);
// });

// mobile.color.forEach((ele) => {
//   console.log(ele);
// });

// console.log(mobile.camera.backCamera);
// console.log(mobile.camera.frontCamera);

// console.log(mobile.capacity.RAM);
// console.log(mobile.capacity.ROM);

// console.log(mobile.isChargerIncluded);

// let XYZ = {
//   name: "XYZ",
//   age: 23,
//   address: "Gondia",
//   mobile: 8411087916,
//   hoby: ["cricket", "travelling", "reading"],
//   gender: "Male",
//   relationship: "Single",
//   weight: 78,
//   height: 182,
//   color: "brown",
//   qualifications: {
//     ssc: 74.6,
//     hsc: 71.5,
//     graduation: 7.51,
//   },
//   skills: ["java", "javaScript", "SQL", "Manual", "HTML", "CSS"],
// };

// console.log(XYZ);

// console.log(XYZ.name);
// console.log(XYZ.age);
// console.log(XYZ.address);
// console.log(XYZ.mobile);

// XYZ.hoby.forEach((ele) => {
//   console.log(ele);
// });

// console.log(XYZ.gender);
// console.log(XYZ.relationship);
// console.log(XYZ.weight);
// console.log(XYZ.height);
// console.log(XYZ.color);
// console.log(XYZ.qualifications.ssc);
// console.log(XYZ.qualifications.hsc);
// console.log(XYZ.qualifications.graduation);

// XYZ.skills.forEach((ele) => {
//   console.log(ele);
// });

// let laptop = {
//   brand: "LENOVO",
//   price: 55000,
// };

// // console.log(Object.keys(laptop)); //! Is is used to return the keys of the object in the form of array

// // console.log(Object.values(laptop)); //! It is used tp return the values of object in the form of array

// // console.log(Object.entries(laptop)); //! Is it used to return the kays and value in the form of array where each key value pair is one array
// // //  ?(2) [Array(2), Array(2)]
// // //  ?0 : (2) ['brand', 'LENOVO']
// // //  ?1 : (2) ['price', 55000]

// //? Freeze
// // Object.freeze(laptop); //! when we freeze the then we can not add, update, delete we can only do is read

// // laptop.color = "black";

// // laptop.brand = "HP";

// // delete laptop.brand;

// // console.log(laptop);

// // console.log(Object.isFrozen(laptop)); //! It is used to check the whether obbject is frozen or not

// //? Seal
// Object.seal(laptop); //! when we seal the object then we can not add, delete we can do update, read

// laptop.color = "black";

// laptop.brand = "HP";

// delete laptop.brand;

// console.log(laptop);

// console.log(Object.isSealed(laptop)); //! It is used to check the whether object is sealed or not

//! 2. second way to create the object

// let laptop = new Object();
// console.log(laptop);
// ((laptop.brand = "LENOVO"), (laptop.price = 87699));

// console.log(laptop);

//! 3.Function Constructor
// function laptop() {
//   console.log(this);
// }

// new laptop();.

function laptop(brand, price) {
  this.brand = brand; //Its like //* laptop.brand = "brand"
  this.price = price;
  console.log(this);
}

new laptop("Hp", 82698);

let a = () => {
  console.log(this);
};

new a();
