import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     
    */
   public Player player = new Player();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(610, 600, 1); 
        prepare();
    }
    
    public void prepare()
    {
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        
        addObject(player, 300, 500);
        for(int i = 0; i < 9; i ++)
            for(int j = 0; j < 4; j++)
            addObject(new Block(), 30 + 70 * i, 20 + 30 * j);
        Ball ball = new Ball(player, this);
        addObject(ball, 300, 450);
    }
}
