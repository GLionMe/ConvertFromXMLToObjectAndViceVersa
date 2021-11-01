package org.example;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        XmlGenerator generator = new XmlGenerator();
        Employee employee = new Employee(101, "Christopher Robin",200000.0);

        generator.convertToXml(employee, new File("D:\\IdeaJ\\ConvertJavaObjectToXml\\src\\employee.xml"));
    }
}
