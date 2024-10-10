const express = require('express')
const mongoose = require("mongoose");
const cors = require("cors");

const app = express()
const port = 5000


mongoose.connect("mongodb+srv://Renish:renish123@cluster0.jkj9k.mongodb.net/AdressBook").then(() => {
  console.log("connect") // ama connect ma connectionString nakhya pachi /databasenu name nakhvanu atle
  // mongo ma db bani jay je upar ma university che
})

var corsOptions = {
  origin: 'http://localhost:3000',
  mrthods: "POST,GET,PETCH,DELETE",
  optionsSuccessStatus: 200 // some legacy browsers (IE11, various SmartTVs) choke on 204
}
app.use(cors(corsOptions))
app.use((req, res, next) => {
  res.setHeader("Access-Control-Allow-Origin", "http://localhost:3000");
  res.header(
    "Access-Control-Allow-Headers",
    "Origin, X-Requested-Width, Content-Type, Accept"
  );
  next();
})

app.use(express.json());
const Address = require('./models/address');

//Get route for fetching addresses from database
app.get('/api/addresses', async (req, res) => {
try {
    const addresses = await Address.find();
    res.json(addresses);
} catch (err) {
    res.status(500).json({ error: err.message });
}
});

//Get By name
app.get("/api/addresses/:text",async (req,res)=>{
  const data = await Address.find()
        const result = data.filter((temp)=>{
            if(temp.name.includes(req.params.text)){
                return true;
            }
        })
        res.json(result);
})

//Post route for storing new address 
app.post('/api/addresses', async (req, res) => {
try {
    const newAddress = new Address(req.body);
    const savedAddress = await newAddress.save();
    res.status(201).json(savedAddress);
} catch (err) {
    res.status(400).json({ error: err.message });
}
});

//Put route for updating address with new data
app.put('/api/addresses/:id', async (req, res) => {
try {
    const updatedAddress = await Address.findByIdAndUpdate(
    req.params.id,
    req.body,
    { new: true }
    );
    res.json(updatedAddress);
} catch (err) {
    res.status(400).json({ error: err.message });
}
});

//Delete route for deleting address with specified id
app.delete('/api/addresses/:id', async (req, res) => {
try {
    await Address.findOneAndDelete(req.params.id);
    res.json({ message: 'Address deleted' });
} catch (err) {
    res.status(500).json({ error: err.message });
}
});

const PORT = 5000;
app.listen(PORT, () => {
console.log(`Server is started on port ${PORT}`);
});