const obj = {
    name : "abcd",
    age:18
};

for(const key in obj){
    console.log(`${key} : ${obj[key]}`);
    
}