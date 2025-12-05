const mongoose = require("mongoose")
const Chat = require("./models/chat.js");

main()
.then(() => {
    console.log("connection successful");
    

}).catch ((err) => {

    console.log(err); 

})
async function main() {
  await mongoose.connect('mongodb://127.0.0.1:27017/whatsapp');

}

let allChats = [
  {
 from: "Ram",
    to: "priyaa",
    msg: "Hii baby",
    created_at: new Date(),
  },
  {
    
    from: "neha",
    to: "priya",
    msg: "Send me your photos",
    created_at: new Date(),
  },
  {
    from: "sushi",
    to: "juhi",
    msg: "hii juhi",
    created_at: new Date(),
  },
  {
    from: "Rabi",
    to: "riya",
    msg: "Send me your nudes",
    created_at: new Date(),
  }, 

];

 Chat.insertMany(allChats);