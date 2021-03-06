package gov.dot.its.jpo.sdcsdw.asn1.perxercodec;

import org.junit.jupiter.api.Test;

class DataRequestTest
{   
    @Test
    void testPerToXer() throws Exception
    {
        for (Asn1Type type : Asn1Types.getAllTypes()) {
            if (type.equals(Asn1Types.DataRequestType)) {
                TestData.assertPerDatumParses(type, TestData.HexPerTestDataRequest);
            } else {
                TestData.assertPerDatumFails(type, TestData.HexPerTestDataRequest);
            }
        }
    }

    @Test
    void testGuessPerToXer() throws Exception
    {
        TestData.assertPerDatumParsesAs(Asn1Types.getAllTypes(), Asn1Types.DataRequestType, TestData.HexPerTestDataRequest);
    }
    
    @Test
    void testXerToPer() throws Exception
    {
        for (Asn1Type type : Asn1Types.getAllTypes()) {
            if (type.equals(Asn1Types.DataRequestType)) {
                TestData.assertXerDatumParses(type, TestData.RawXerTestDataRequest);
            } else {
                TestData.assertXerDatumFails(type, TestData.RawXerTestDataRequest);
            }
        }
    }

    @Test
    void testGuessXerToPer() throws Exception
    {
        TestData.assertXerDatumParsesAs(Asn1Types.getAllTypes(), Asn1Types.DataRequestType, TestData.RawXerTestDataRequest);
    }
}
