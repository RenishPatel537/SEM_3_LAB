const express = require('express')
const fs = require("fs");
const app = express()
const port = 3000

app.get('/', (req, res) => res.send('Hello World!'))

app.get("/about",(req,res)=>{
    let data = fs.readFileSync("about.txt");
    res.write(data);
    res.send();
});

app.get("/contact",(req,res)=>{
     let data = fs.readFileSync("contact.txt");
     res.write(data);
     res.send();
});

app.get("/GOT",(req,res)=>{
    let data = fs.readFileSync("GOT.txt");
    res.write(data);
    res.send();
});

app.get("/moneyheist",(req,res)=>{
    
    res.send("profeser");
});

app.get("/strangerthing",(req,res)=>{
    
    res.send("11");
});



app.listen(port, () => console.log(`Example app listening on port ${port}!`))