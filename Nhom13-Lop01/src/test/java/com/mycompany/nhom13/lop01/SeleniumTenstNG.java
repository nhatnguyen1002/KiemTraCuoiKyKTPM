/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nhom13.lop01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

/**
 *
 * @author Admin
 */
public class SeleniumTenstNG {
    @BeforeClass
    public void launchBrowser(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.vlu.edu.vn/");
    }
}
