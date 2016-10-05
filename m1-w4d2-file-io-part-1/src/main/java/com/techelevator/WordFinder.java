package com.techelevator;

import java.awt.List;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;

import javax.print.attribute.standard.Destination;

import org.omg.CORBA.portable.InputStream;


public class WordFinder {
	 BufferedInputStream in = null;
	    static FileOutputStream fout = null;
	  public static void main(String[] args) throws Exception {
	        BufferedReader readerUser = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("What would you like to search for? ");
//	        String userInput = readerUser.readLine();
//	        URL website = new URL("https://en.wikipedia.org/wiki/Non-blocking_I/O_(Java)");
//	        try (InputStream in = website.openStream()) {
//	            Files.copy(in, target, StandardCopyOption.REPLACE_EXISTING);
//	        }
//	        final byte data[] = new byte[1024];
//	       File file = new File("http://www.textfiles.com/humor/TAGLINES/aphorism.txt");
	        BufferedReader fileReader = new BufferedReader(new FileReader(file));

	        String line = null;
	        int index = 1;
	        while ((line = fileReader.readLine()) != null) {
	            if (line.contains(userInput)) {
	                System.out.println("Match on line " + index);
	                System.out.println(line);
	            }
	            index++;
	        }

	        fileReader.close();
	    }
	
	  public static void downloadFileFromURL(String urlString, File destination) {    
	        try {
	            URL website = new URL(urlString);
	           urlString = ("http://www.textfiles.com/humor/TAGLINES/aphorism.txt");
	            ReadableByteChannel rbc;
	            rbc = Channels.newChannel(website.openStream());
	            FileOutputStream fos = new FileOutputStream(destination);
	            Destination Users/rsapp/Development/workspaces/ryansapp-java-exercises/;

	            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
	            fos.close();
	            rbc.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
