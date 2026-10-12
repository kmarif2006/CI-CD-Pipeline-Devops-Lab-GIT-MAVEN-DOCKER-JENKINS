package com.college;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest{
    @Test
    void test(){
        StudentApplication s=new StudentApplication();
        s.add("Arif");
        assertTrue(s.view().contains("Arif"));
    }
}