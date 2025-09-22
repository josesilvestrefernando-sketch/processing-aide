package com.processingaide;

import processing.core.PApplet;

public class Main extends PApplet {
    public void settings() {
        
        fullScreen();
    }

    public void setup() {
		background(255); // Fill the background with white
    }

    public void draw() {
		fill(0); // Fill inside with black
		rect(200, 400, 200, 200); // Draw a rectangle at position at (200, 400) 200x200 size
    }   
}

