package org.example;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class XmlGenerator {
    public void convertToXml(Employee employee, File file) {
        try {
            JAXBContext context = JAXBContext.newInstance(Employee.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(employee, new FileOutputStream(file));
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
