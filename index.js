const express = require("express");
const path = require("path");

const app = express();

// Middleware
app.use(express.json());
app.use(express.urlencoded({ extended: true }));

// Serve static files
app.use(express.static(path.join(__dirname, "public")));

// Set EJS as template engine
app.set("view engine", "ejs");

// Home route
app.get("/", (req, res) => {
    res.render("index");
});

// Start server
app.listen(3000, () => {
    console.log("Server is running on http://localhost:3000");
});