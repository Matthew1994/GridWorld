package quickCrab;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

import kingCrab.KingCrab;

/**
 * This class runs a world that contains critters. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class QuickCrabRunner
{
	
	private static final int SEVEN = 7;
	private static final int FIVE = 5;
	private static final int FOUR = 4;
	private static final int ONE = 1;
	private static final int EIGHT = 8;
	private static final int THREE = 3;
	private static final int TWO = 2;
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new Location(FIVE, FIVE), new Rock(Color.PINK));
        world.add(new Location(ONE, FIVE), new Rock(Color.RED));
        world.add(new Location(SEVEN, TWO), new Rock(Color.YELLOW));
        world.add(new Location(FOUR, FOUR), new QuickCrab());
        world.add(new Location(FIVE, EIGHT), new QuickCrab());
        world.add(new Location(SEVEN, EIGHT), new Bug());
        world.add(new Location(THREE, THREE), new Rock());
        world.add(new Location(TWO, EIGHT), new Rock(Color.BLUE));
        world.show();
    }
}
