package virtusystem.test.contract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XMLParserTest {

    @Test
    void xmlParserToFindACoefficient() {
        XMLParser xmlParser = new XMLParser();

        double expectedValueByYear = 2;
        double getValueByYear = xmlParser.XmlParserToFindACoefficient("AfterThen2000");
        assertEquals(expectedValueByYear,getValueByYear);

        double expectedValueByType = 1.5;
        double getValueByType = xmlParser.XmlParserToFindACoefficient("House");
        assertEquals(expectedValueByType,getValueByType);

        double expectedValueBySquare = 1.2;
        double getValueBySquare = xmlParser.XmlParserToFindACoefficient("LessThen50");
        assertEquals(expectedValueBySquare,getValueBySquare);
    }
}