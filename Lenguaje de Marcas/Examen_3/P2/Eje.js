
function cuentaBancaria(nombreT, saldo){
    this.nombreT = nombreT;
    this.saldo = saldo;

    this.saldo = function(){
        document.write("Ingresar saldo de " + (set.saldo + 100));
    }
}


document.write("<table border='1' cellspancing= '0' cellpading='10'>");

for(let i = 0; i < 7 ; i++){
     document.write("<tr>");
    document.write("<td>" +  alazar +  "</td>");
    document.write("<td>" +  alazar +  "</td>");
    document.write("<td>" +  alazar +  "</td>");
    document.write("<td>" +  alazar +  "</td>");
    document.write("<tr>");
    for(let j = 0; j < 7; j++){
    let alazar = Math.floor(Math.random()*49 + 1);
    document.write("<tr>");
    document.write("<td>" +  alazar +  "</td>");
    document.write("<td>" +  alazar +  "</td>");
    document.write("<td>" +  alazar +  "</td>");
    document.write("<td>" +  alazar +  "</td>");
    document.write("<tr>");
    }

}

