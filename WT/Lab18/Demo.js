const http = require("http");
const fs = require("fs");
const cp = require("child_process");

function about() {
  cp.exec("start chrome localhost:")
  let data = fs.readFileSync("./about.txt");
  //console.log(data);

}
function home() {

  //console.log(data);
  document.write("home");
  cp.exec("start chrome localhost:3000/home");
}

function contact() {
  let data = fs.readFileSync("./contact.txt");
  //console.log(data);
  res.end(data.toString());
}

const server = http.createServer((req, res) => {
  if (req.url === "/") {
    res.write("<a href='/home'><button>home</button><a>");
    res.write("<a href='/about'><button>about</button><a>");
    res.write("<a href='/contact'><button>contact</button><a>");
    ///res.write("<a href='/home'><button>home</button><a>");
    res.end();
  }
  else if (req.url === "/home") {
    res.end("welcome home");
  }
  else if (req.url === "/about") {
    let data = fs.readFileSync("./about.txt");
    res.end(data);
  }
  else if (req.url === "/contact") {
    let data = fs.readFileSync("./contact.txt");
    res.end(data);
  }
});

const port = 3000;

server.listen(port,
  () => {
    console.log(
      `Server running at http://localhost:${port}/`
    );
  });