package org.vpryst.downloadLinkTest;

import org.testng.annotations.Test;
import org.vpryst.downloadLink.ConnectionManager;
import org.vpryst.downloadLink.FileFetcher;

import static org.testng.Assert.*;
import static org.mockito.Mockito.*;

public class FileFetcherTest {
    @Test
    public void CheckFileExtentionMock() {
        ConnectionManager conection = mock(ConnectionManager.class);
        FileFetcher fileFetch = new FileFetcher(conection);
        assertEquals(fileFetch.getFileExtension("application/pdf"), ".pdf");
        assertEquals(fileFetch.getFileExtension("sdgdfdgdfg"), ".html");
    }

    @Test(expectedExceptions = java.lang.NullPointerException.class)
    public void CheckFileDatasaveMock() {
        ConnectionManager conection = mock(ConnectionManager.class);
        FileFetcher fileFetch = new FileFetcher(conection);
        fileFetch.fileDataSave("sdgsdg", "sdfsdfsdfsgs");
    }

    @Test
    public void CheckFileDatasave() {
        ConnectionManager conection = new ConnectionManager("Anonim123", "123456");
        FileFetcher fileFetch = new FileFetcher(conection);
        fileFetch.fileDataSave("http://refcardz.dzone.com/assets/request/refcard/4855?oid=rchom4855&direct=true", "dfgdfg");
    }
    
    @Test
    public void CheckFileDataLink() {
        ConnectionManager conection = new ConnectionManager("Anonim123", "123456");
        FileFetcher fileFetch = new FileFetcher(conection);
        fileFetch.fileDataLink("http://refcardz.dzone.com/assets/request/refcard/4855?oid=rchom4855&direct=true");
    }
    
    @Test
    public void CheckFileDatasaveSave() {
        ConnectionManager conection = new ConnectionManager("Anonim123", "123456");
        FileFetcher fileFetch = new FileFetcher(conection);
        fileFetch.fileDataSave("http://refcardz.dzone.com/assets/request/refcard/131201?oid=rchom131201&direct=true", "dfgdfg");
    }
}
