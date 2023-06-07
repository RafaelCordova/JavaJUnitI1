package org.example;

public class Planilla {

    public float calculaSalarioNeto(float salarioBruto) throws Exception {
        if (salarioBruto < 0) {
            throw new Exception("Salario bruto inválido. Debe ser mayor o igual a cero.");
        }

        float retencion = 0;
        if (salarioBruto >= 1000 && salarioBruto < 1500) {
            retencion = 0.16f;
        } else if (salarioBruto >= 1500) {
            retencion = 0.18f;
        }

        return salarioBruto * (1 - retencion);
    }

    public float calculaSalarioBruto( int tipoempleado,float montoVentas,int horasExtra ) throws Exception
    {
        float salarioBase = 0.0f;
        if (montoVentas<0)
            throw new Exception("El monto de ventas no puede ser menor que 0 ");
        else
            switch(tipoempleado)
            {
                case 1:
                    salarioBase = 1000;
                    if (montoVentas >= 1000 && montoVentas<1500)
                        salarioBase = salarioBase + 100;
                    if (montoVentas >= 1500 )
                        salarioBase = salarioBase + 200;
                    if (montoVentas==0)
                        salarioBase = salarioBase + 0;
                    break;
                case 2:
                    salarioBase = 1500;
                    if (montoVentas >= 1000 && montoVentas<=1500)
                        salarioBase = salarioBase + 100;
                    if (montoVentas >= 1500 )
                        salarioBase = salarioBase + 200;
                    if (montoVentas==0)
                        salarioBase = salarioBase + 0;
                    break;
                default:
                    throw new Exception("No existe el tipo de empleado");
                    //return "No existe el tipo de empleado";
            }

        if (horasExtra >= 0)
            salarioBase = salarioBase + horasExtra*20;
        else
            throw new Exception("La cantidad de horas extra no puede ser menor a 0 ");

        return salarioBase;
    }


}