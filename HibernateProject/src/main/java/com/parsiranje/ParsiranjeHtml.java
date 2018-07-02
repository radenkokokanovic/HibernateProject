package com.parsiranje;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParsiranjeHtml {
	
	public static void main(String[] args) throws IOException {
		
		//PARSING HTML FILE AND SEARCH OVER TAGS
		File fajl=new File("TelradNet.html");
		Document document=Jsoup.parse(fajl, "UTF-8", "");
		
		String naslov=document.title();
		
		System.out.println("Naslov strancie je " +naslov);
		Elements elemenat=document.select("body");
		
		
		System.out.println(elemenat.text());
		
		Elements linkovi=document.select("a[href]");
		
		for (Element link:linkovi)
		{
			System.out.println(link.attr("href"));
		}
		
		System.out.println(fajl.getAbsolutePath());
		System.out.println(fajl.exists());
	}

}
