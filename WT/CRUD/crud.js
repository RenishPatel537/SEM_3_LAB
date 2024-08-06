const express = require('express');
const fs = require("fs");
const app = express();
const port = 3000;

app.use(express.json()); 

let list = [];

app.get("/list",(req,res)=>{
    res.send(list);
})

app.post("/list",(req,res)=>{
    const obj = req.body;
    list.push(obj);
    res.send(list);
})

app.put("/list/:index/:key",(req,res)=>{
    const id = req.params.index;
    const key = req.params.key;

    req.body = list[id];

    list[id] = req.body.name;
    res.send(list);
})

app.delete("/list/:index",(req,res)=>{
    const id = req.params.index;

    list.splice(id,1);
    res.send(list);
})

app.get('/', (req, res) => res.send('Hello World!'));
app.listen(port, () => console.log(`Example app listening on port ${port}!`));