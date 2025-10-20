package Ejercicio3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            // Crear empleados
            Empleado e1 = new Empleado("Ana Gómez", 1, "Gerente", 50000);
            Empleado e2 = new Empleado("Pedro Martínez", 2, "Especialista", 40000);
            Empleado e3 = new Empleado("Laura Fernández", 3, "Desarrollador", 45000);
            Empleado e4 = new Empleado("Carlos García", 4, "Analista", 42000);

            // Crear departamentos
            Departamento d1 = new Departamento("Recursos Humanos", Arrays.asList(e1, e2));
            Departamento d2 = new Departamento("Tecnología", Arrays.asList(e3, e4));

            // Crear empresa
            Empresa empresa = new Empresa(Arrays.asList(d1, d2));

            // Serializar a XML
            JAXBContext context = JAXBContext.newInstance(Empresa.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            File archivo = new File("empresa.xml");
            marshaller.marshal(empresa, archivo);

            System.out.println("XML generado correctamente en: " + archivo.getAbsolutePath());

            // Deserializar desde XML
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Empresa empresaLeida = (Empresa) unmarshaller.unmarshal(archivo);

            // Mostrar datos
            for (Departamento dep : empresaLeida.getDepartamentos()) {
                System.out.println("\nDepartamento: " + dep.getNombre());
                for (Empleado emp : dep.getEmpleados()) {
                    System.out.println(" - " + emp.getNombre() + " (" + emp.getPuesto() + ") - Salario: " + emp.getSalario());
                }
            }

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

