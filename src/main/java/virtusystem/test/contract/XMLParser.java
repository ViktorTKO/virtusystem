package virtusystem.test.contract;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParser {

    public Double XmlParserToFindACoefficient(String coefName){
        double soughtCoeff = 0.0;
        try {
            // Создается построитель документа
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            // Создается дерево DOM документа из файла
            Document document = documentBuilder.parse("C:\\Users\\Zombiechamp\\Desktop\\contract\\src\\main\\resources\\static\\coefficients.xml");

            // Получаем корневой элемент
            Node root = document.getDocumentElement();


            // Просматриваем все подэлементы корневого - т.е. всех коэффициентов
            NodeList coeffs = root.getChildNodes();
            for (int i = 0; i < coeffs.getLength(); i++) {
                Node coefficient = coeffs.item(i);
                // Если нода не текст, то это тип коэффициента - заходим внутрь
                if (coefficient.getNodeType() != Node.TEXT_NODE) {
                    NodeList coefProps = coefficient.getChildNodes();
                    for(int j = 0; j < coefProps.getLength(); j++) {
                        Node coefProp = coefProps.item(j);
                        // Если нода не текст, то это один из параметров коэффициентов - печатаем
                        if (coefProp.getNodeType() != Node.TEXT_NODE) {
                            if(coefProp.getNodeName().equals(coefName)) {
                                soughtCoeff = Double.parseDouble(coefProp.getChildNodes().item(0).getTextContent());
                                System.out.println("Coef of " +coefficient.getNodeName()+":=" + coefProp.getNodeName());
                                System.out.println("Coefficient for this param equal: =" + soughtCoeff);
                            }
                        }
                    }
                }
            }
        } catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
        } catch (SAXException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return soughtCoeff;
    }

    public static void main(String[] args) {
        XMLParser domExample = new XMLParser();
        double a = domExample.XmlParserToFindACoefficient("Apartment");
        System.out.println("This double= "+ a);
    }
}