const express = require("express");
const bodyparser = require("body-parser")
const app = express();

const mongoose = require("mongoose");
const Faculty = require("./faculty");

app.use(bodyparser.urlencoded())

mongoose.connect("mongodb+srv://Renish:renish123@cluster0.jkj9k.mongodb.net/university").then(() => {
    console.log("connect") // ama connect ma connectionString nakhya pachi /databasenu name nakhvanu atle
                           // mongo ma db bani jay je upar ma university che

    app.get("/faculty", async (req, res) => {
        const data = await Faculty.find()
        res.send(data);
    })

    // getbyid
    app.get("/faculty/:id", async (req, res) => {
        const data = await Faculty.findOne({id : req.params.id})
        //const res = await Faculty.findById(req.params.id); other way
        res.send(data);
    })

    // getbycontain charcter
    app.get("/faculty/search/:text", async (req, res) => {
        const data = await Faculty.find()
        const result = data.filter((temp)=>{
            if(temp.name.includes(req.params.text)){
                return true;
            }
        })
        res.send(result);
    })

    // getbycontain any feild charcter
    app.get("/faculty/searchs/:text", async (req, res) => {
        const data = await Faculty.find()
        const result = data.filter((temp)=>{
            for(const key in temp){
                let compare = `${temp[key]}`
                if(compare.includes(req.params.text)){return true;}
                
            }
        })
        res.send(result);
    })

    app.post("/faculty", async (req, res) => {
        const fac = new Faculty(req.body);
        await fac.save();
        res.send("saved")
    })

    app.patch("/faculty/update/:id", async (req, res) => {
        const result = await Faculty.findOneAndUpdate({ id: req.params.id }, req.body);
       // const result = await Faculty.findByIdAndUpdate(req.params.id,req.body); other way
        res.send(result)
    })

    app.delete("/faculty/delete/:id", async (req, res) => {
        const result = await Faculty.findOneAndDelete({ id: req.params.id });
       // const res = await Faculty.findByIdAndDelete(req.params.id);   other way
        res.send(result)
    })



    app.listen(3000, () => {
        console.log("server start");

    })
})


