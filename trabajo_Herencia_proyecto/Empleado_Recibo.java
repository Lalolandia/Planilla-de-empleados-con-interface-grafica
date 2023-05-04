
package trabajo_Herencia_proyecto;

public class Empleado_Recibo extends Empleado{
    
    private String strRuc;
   
    
    public Empleado_Recibo(){
        
    }
    public Empleado_Recibo( String nombre, String apellido, String dni, String direccion, int edad, String formacionAcademica, int añosExperiencia, int horas_trabajadas, int pago_horas) {
        super(nombre, apellido, dni, direccion, edad, formacionAcademica, añosExperiencia, horas_trabajadas, pago_horas);
        
       
    }

    public Empleado_Recibo(String text, String text0, String text1, String text2, int parseInt, String toString, int parseInt0, int parseInt1, int parseInt2, String text3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    @Override
     public int cant_horas_extras()
    {    int horasExtras = getHoras_trabajadas() - 40;
         if (getHoras_trabajadas() > 40)
        return  horasExtras;
         else 
        return 0;
    }
    
    @Override
        public int  horasExtras()
    {
         int horaExtras = getHoras_trabajadas() -  40;
         if (getHoras_trabajadas() > 40 )
             return getPagoPorHora() * 2 * horaExtras;
         else 
             return 0;
    }
    @Override
       public double sueldoBruto(){
            return getHoras_trabajadas() * getPagoPorHora();
       }
    @Override
       public double sueldoNeto(){
           return sueldoBruto() + horasExtras();
       }
    
    @Override
    public String imprimirBoletaPago() {
               return      "INFORME DEL TRABAJADOR" + "\n" +
                           "----------------------" + "\n" +
                           "                       "+ "\n" +
                           "Datos del Empleado" + "\n" +
                           "Nombres: " + super.getNombre()+"\n" +
                           "Apellidos: " + super.getApellido()+"\n" +
                           "DNI: "  + super.getDni()+ "\n" +
                           "Edad: " + super.getEdad()+"\n" +
                           "Dirección: " + super.getDireccion()+"\n" +
                           "Formación Academica: " + super.getFormacionAcademica()+ "\n" +
                           "Años de experiencia: " + super.getAñosExperiencia()+ "\n" +
                           "                        " + "\n" +
                           "Resumen de Pago" + "\n" +
                           "Sueldo Bruto: S/ " + sueldoBruto()+ "\n" +
                           "Horas Extras: " + cant_horas_extras()+ "\n" +
                           "Pago por horas Extras: S/ " + horasExtras() + "\n" +
                           "Sueldo Neto: S/ " + sueldoNeto();
    }

}
