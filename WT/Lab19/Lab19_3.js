const express = require('express')
const fs = require("fs");
const app = express()
const port = 3000

app.get('/', (req, res) => res.send('Hello World!'))

app.get("/about",(req,res)=>{
    let data = fs.readFileSync("about.txt",'utf-8');
    // res.write(data);
    res.send(data);
});

app.get("/contact",(req,res)=>{
     let data = fs.readFileSync("contact.txt",'utf-8');
    //  res.write(data);
     res.send(data);
});

app.listen(port, () => console.log(`Example app listening on port ${port}!`))