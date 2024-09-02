const express = require('express');
const fs = require("fs");
const app = express();
const port = 3000;

app.use(express.json()); 

let stu = [];
let fac = [];

app.get("/:list",(req,res)=>{

    if(req.params.list=="student"){
    res.send(stu);
    }
    if(req.params.list=="faculty"){
        res.send(fac);
    }
})

// get by id
app.get("/:list/:id",(req,res)=>{
    id = req.params.id;
    if(list=="student"){
        index = stu.find(temp => temp.id==id)
        
        res.send(index);
    }
    if(list=="faculty"){
        index = fac.find(temp => temp.id==id)
        res.send(fac[index]);
    }
    res.send("updated");
})

app.post("/:list",(req,res)=>{
    const obj = req.body;
    list = req.params.list;
    if(list=='student'){
    stu.push(obj);
    }
    if(list=='faculty'){
        fac.push(obj);
    }

    res.send("aded");
    
})

app.put("/:list/:id",(req,res)=>{
    const id = req.params.id;
    const list = req.params.list;
    //const key = req.params.key;

    
    if(list=='student'){
        let index = stu.find(temp=>temp = req.params.id)
        req.body = index;
    }
    if(list=='faculty'){
        let index = fac.findIndex(temp=>temp = req.params.id)
        req.body=index;
    }
    app.put("/:list/:id/u",(req,res)=>{

    if(list=='student'){
        let index = stu.findIndex(temp=>temp = req.params.id)
        stu[index] = req.body;
    }
    if(list=='faculty'){
        let index = fac.findIndex(temp=>temp = req.params.id)
        fac[index] = req.body;
    }
    res.send("updated");
    res.send("updated");
    })
})

app.delete("/:list/:id",(req,res)=>{
    const id = req.params.index;

    if(list=="student"){
        index = stu.findIndex(temp => temp.id==id)
        stu.splice(index,1);
    }
    if(list=="faculty"){
        index = fac.findIndex(temp => temp.id==id)
        fac.splice(index,1);
    }

    res.send("delete");
})

// function get(obj,req,next){
//     req.body = obj;
//     let change = false;
//     let a = req.body;
// }

app.post('/')

app.get('/', (req, res) => res.send('Hello World!'));
app.listen(port, () => console.log(`Example app listening on port ${port}!`));