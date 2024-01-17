//package Example38;
//
//public class Floor {
//    double length;
//    double width;
//
//    // Parameterized constructor
//    Floor(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    int totalTiles(Tile tile) 	
//    { 
//        double tileArea = tile.edgeLength * 2;
//        double floorArea = length * width;
//        return (int) (floorArea / tileArea);
//    }
//
//
//    public static void main(String[] args) {
//
//    	Tile tile = new Tile(2.0); 
//    	
//        Floor floor = new Floor(10.0, 8.0); 
//
//        int totalTilesNeeded = floor.totalTiles(tile);
//
//        // Displaying the result
//        System.out.println("Total number of tiles needed: " + totalTilesNeeded);
//    }
//
//}

package Example38;

public class Floor {
    int length;
    int width;

    // Parameterized constructor
    Floor(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int totalTiles(Tile tile) 	
    { 
        int tArea = tile.edgeLength * 2;
        int fArea = length * width;
        return (int) (fArea / tArea);
    }


    public static void main(String[] args) {

    	Tile tile = new Tile(2); 
    	
        Floor floor = new Floor(10, 8); 

        int totalTilesNeeded = floor.totalTiles(tile);

        // Displaying the result
        System.out.println("Total number of tiles needed: " + totalTilesNeeded);
    }

}