package newSuit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test {

	public static void main(String[] args) throws IOException {
		num(2);
	}
	public static void num(int num) {
		if(num<100) {
			System.out.println(num);
			num++;
			num(num);
		}
	}
}
