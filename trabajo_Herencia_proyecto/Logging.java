
package trabajo_Herencia_proyecto;

public class Logging {
    public String logging_usuario(String usuario, String password)
    {
        // auxi
        String mensaje;
        if (usuario.equals("Admin")&& password.equals("1111"))
            mensaje = "Usuario Admin logeado";
        else if ((usuario.equals("Luis")&& password.equals("1234")))
                mensaje = "Usuari@ Luis logeado";
        else if ((usuario.equals("Maria")&& password.equals("7777")))
                mensaje = "Usuari@ Maria logeado";
        else if ((usuario.equals("Kevin")&& password.equals("9895")))
                mensaje = "Usuari@ Kevin logeado";
        else 
            mensaje = "Invalido";
        
        return mensaje;
                         
    }
}
