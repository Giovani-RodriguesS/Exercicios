const projects = document.querySelector(".projects")
const projectBT = document.querySelector("#projectBT")
const summary = document.querySelector(".summary")
const summaryBT = document.querySelector("#summaryBT")
const github = document.querySelector("#allProject")


function option (op) {
    if(op == 1){
        summary.style.display = "flex"
        projects.style.display = "none"
        summaryBT.style.backgroundColor = "#0003"
        projectBT.style.backgroundColor = "#fff"
        github.style.visibility = "hidden";
    }
    else{
        summary.style.display = "none"
        projects.style.display = "block"
        summaryBT.style.backgroundColor = "#fff"
        projectBT.style.backgroundColor = "#0003"
        github.style.visibility = "visible";
    }
}