/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thisoldhouse;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;


/**
 *
 * @author tatianaeng
 */

/*

Using constructs from this chapter or earlier, complete Programming Challenges #1, This Old House, on p995.
In addition to drawing the house as specified, add some landscaping (use your imagination) and add the sun or the moon (any phase).
If drawing the sun, consider drawing an eclipse of the sun with the moon.

Each class should be in a separate file (except for event listeners).
When you are done, find the source file(s) in the project directory, find your java file(s) there and attach them to this assignment.
You also need to include a screenshot of the results. Your screenshot needs to display your name somewhere in the results.

1. This Old House
Use the basic shapes you learned in this chapter to draw a house.
Be sure to include at least two windows and a door.  Feel free to draw other shapes as well,
such as the sky, sun, and even clouds.

*/
public class ThisOldHouse extends Application
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // launch the application
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage)
    {
        // constants for the scene size
        final double sceneWidth = 800.0;
        final double sceneHeight = 600.0;
                
        // set the stage title
        primaryStage.setTitle("Tatiana Eng - This Old House");
        
        // make the sky blue
        Rectangle sky = new Rectangle(0, 0, 800, 575); // x, y, width, height; to section off the sky from the grass
        sky.setFill(Color.LIGHTBLUE);
        
        // add in green grass
        Rectangle grass = new Rectangle(0, 575, 800, 25); // x, y, width, height
        grass.setFill(Color.LIGHTGREEN);
        
        // draw a circle to represent the sun
        Circle sun = new Circle(125, 125, 70, Color.YELLOW); // centerX, centerY, radius, fill
        
        // draw lines to represent the sun's rays
        Line line1 = new Line(125, 25, 125,225); // startX, startY, endX, endY; runs through the sun top through bottom
        Line line2 = new Line(125, 125, 225, 80); // center of sun to top right
        Line line3 = new Line(125, 125, 45, 75); // center of sun to top left
        Line line4 = new Line(125, 125, 200, 200); // center of sun to bottom right
        Line line5 = new Line(125, 125, 35, 180); // center of sun to bottom left
        
        // make the lines (rays) yellow
        line1.setStroke(Color.YELLOW); 
        line2.setStroke(Color.YELLOW);
        line3.setStroke(Color.YELLOW);
        line4.setStroke(Color.YELLOW);
        line5.setStroke(Color.YELLOW);
        
        // increase line thickness for the sun's rays
        line1.setStrokeWidth(5.0);
        line2.setStrokeWidth(5.0);
        line3.setStrokeWidth(5.0);
        line4.setStrokeWidth(5.0);
        line5.setStrokeWidth(5.0);
        
        // draw a rectangle to represent the house
        Rectangle myHouse = new Rectangle();
        myHouse.setX(225);
        myHouse.setY(400);
        myHouse.setWidth(300);
        myHouse.setHeight(200);
        myHouse.setFill(Color.LINEN);
        
        // create a polygon (triangle) to represent the roof of the house
        Polygon roof = new Polygon(375.0, 275.0, // top corner x and y values
                525.0, 400.0, // bottom right corner x and y values
                225.0, 400.0); // bottom left corner x and y values
        
        // make the roof brown
        roof.setFill(Color.BROWN);
        
        /* 
        for my reference: 
        top left corner of the house = 225, 400
        top right corner of the house = 525, 400  
        */
        
        // draw the door of the house (width 40, height 60)
        Line line6 = new Line(350, 540, 350, 600); // startX, startY, endX, endY; left side of the door
        Line line7 = new Line(350, 540, 390, 540); // top of door
        Line line8 = new Line(390, 540, 390, 600); // right side of door
        
        // use a circle to draw the dooorknob
        Circle doorknob = new Circle(360,570, 3); // centerX, centerY, radius
        
        // draw the windows
        Rectangle leftWindow = new Rectangle(275, 450, 50, 60); // x, y, width, height
        Rectangle rightWindow = new Rectangle(425, 450, 50, 60);
        leftWindow.setFill(Color.LINEN); // change fill color from default black to the same color as the house
        leftWindow.setStroke(Color.BLACK); // change stroke color from linen to black so we can see the window
        rightWindow.setFill(Color.LINEN);
        rightWindow.setStroke(Color.BLACK);
        Line line9 = new Line(300, 450, 300, 510); // vertical line in the middle of the left window
        Line line10 = new Line(275, 480, 325, 480); // horizontal line in the middle of the left window
        Line line11 = new Line(450, 450, 450, 510); // vertical line in the right window
        Line line12 = new Line(425, 480, 475, 480); // horizontal line in the right window
        
        // draw the tree trunk and make it brown (tree to the right of the house)
        Rectangle rightTreeTrunk = new Rectangle(660, 540, 10, 60); // x, y, width, height
        rightTreeTrunk.setFill(Color.BROWN);
        
        // draw tree leaves and make them green (tree to the right of the house)
        Polygon rightTreeLeaves1 = new Polygon(600, 540, 730, 540, 665, 475); // x1, y1, x2, y2, x3, y3
        rightTreeLeaves1.setFill(Color.GREEN);
        Polygon rightTreeLeaves2 = new Polygon(610, 500, 720, 500, 665, 425);
        rightTreeLeaves2.setFill(Color.GREEN);
        Polygon rightTreeLeaves3 = new Polygon(620, 460, 710, 460, 665, 375);
        rightTreeLeaves3.setFill(Color.GREEN);
        
        // draw the tree trunk and make it brown (tree to the left of the house)
        Rectangle leftTreeTrunk = new Rectangle(110, 560, 6, 40); // x, y, width, height
        leftTreeTrunk.setFill(Color.BROWN);
        
        // draw tree leaves and make them green (tree to the left of the house)
        Polygon leftTreeLeaves1 = new Polygon(85, 560, 141, 560, 113, 520); // x1, y1, x2, y2, x3, y3
        leftTreeLeaves1.setFill(Color.GREEN);
        Polygon leftTreeLeaves2 = new Polygon(90, 535, 136, 535, 113, 495);
        leftTreeLeaves2.setFill(Color.GREEN);
        Polygon leftTreeLeaves3 = new Polygon(95, 510, 131, 510, 113, 470);
        leftTreeLeaves3.setFill(Color.GREEN);
        
        // draw a cloud
        Circle circle1 = new Circle(650, 125, 30, Color.LIGHTGRAY); // centerX, centerY, radius, fill
        Circle circle2 = new Circle(600, 125, 30, Color.LIGHTGRAY);
        Circle circle3 = new Circle(570, 150, 30, Color.LIGHTGRAY);
        Circle circle4 = new Circle(620, 160, 30, Color.LIGHTGRAY);
        Circle circle5 = new Circle(660, 150, 30, Color.LIGHTGRAY);
        
        // add everything to a pane
        Pane pane = new Pane(sky,grass,sun,line1,line2,line3,line4, line5,
                myHouse, roof, line6, line7, line8, doorknob, leftWindow, rightWindow, 
                line9, line10, line11, line12, rightTreeTrunk, 
                rightTreeLeaves1, rightTreeLeaves2, rightTreeLeaves3,
                leftTreeTrunk, leftTreeLeaves1, leftTreeLeaves2, leftTreeLeaves3,
                circle1, circle2, circle3, circle4, circle5);
        
        // create a scene and display it
        Scene scene = new Scene(pane, sceneWidth, sceneHeight);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
