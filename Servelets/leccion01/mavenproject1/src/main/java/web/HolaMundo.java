package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author eber
 */

////////////////////////////////////////
//////////////////////////////////////
//ESTA VA A SER UNA CLASE TIPO SERVELET CASERA
//SIN USO DEL IDE


//La siguiente notacion nos permite acceder al servelet desde
//El navegador con la ruta entren comillas
@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet {
    
    
    //Este metodo como denota el override, lo estamos sobreescribiendo
    //de nuestra extencion HttpServlet, si requieres mas informacion ahi puedes revisarlo
    
    @Override 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        response.setContentType("text/html:charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        out.println("HOLA MUNDO DESDE SERVELETS");
        
        //DENTRO DE LOS SERVELETS NO SE RECOMIENDA USAR CODIGO HTML, POR QUE EN ESE CASO TENDRIAMOS QUE
        //ESCRIBIR TODO EL CODIGO ENTRE COMILLAS COMO EN LA LINEA ANTERIOR 
        //POR EJEMPLO ALGO QUE USE YA CON PHP FUE LA CREACION DE UN DOCUMENTO PDF
        //CADA LINEA DEL PDF SE DEBIA ESCRIBIR ENTRE COMILLAS EN UN METODO DE IMPRESION
    }
    
    
    
    
    
    
    
}
