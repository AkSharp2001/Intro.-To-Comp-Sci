/*************************************************************************
 *  Compilation:  javac ArtCollage.java
 *  Execution:    java ArtCollage
 *
 *  @author: Akshar Patel, aap279@scarletmail.rutgers.edu, aap279
 *
 *************************************************************************/

import java.awt.Color;

public class ArtCollage {

    // The original picture
    private Picture original;

    // The collage picture
    private Picture collage;

    // The collage Picture consists of collageDimension X collageDimension tiles
    private int collageDimension;

    // A tile consists of tileDimension X tileDimension pixels
    private int tileDimension;
    
    /*
     * One-argument Constructor
     * 1. set default values of collageDimension to 4 and tileDimension to 100
     * 2. initializes original with the filename image
     * 3. initializes collage as a Picture of tileDimension*collageDimension x tileDimension*collageDimension, 
     *    where each pixel is black (see all constructors for the Picture class).
     * 4. update collage to be a scaled version of original (see scaling filter on Week 9 slides)
     *
     * @param filename the image filename
     */
    public ArtCollage (String filename) {

		this.collageDimension = 4;
		this.tileDimension = 100;
		this.original = new Picture(filename);
		this.collage = new Picture(400, 400);

		for (int col = 0; col < 400; col++) {
			for (int row = 0; row < 400; row++) {
				int originalcol = col * original.width() / 400;
				int originalrow = row * original.height() / 400;
				Color color = original.get(originalcol, originalrow);
				collage.set(col, row, color);
			}
		}
    }

    /*
     * Three-arguments Constructor
     * 1. set default values of collageDimension to cd and tileDimension to td
     * 2. initializes original with the filename image
     * 3. initializes collage as a Picture of tileDimension*collageDimension x tileDimension*collageDimension, 
     *    where each pixel is black (see all constructors for the Picture class).
     * 4. update collage to be a scaled version of original (see scaling filter on Week 9 slides)
     *
     * @param filename the image filename
     */
    public ArtCollage (String filename, int td, int cd) {

    	this.collageDimension = cd;
    	this.tileDimension = td;
    	this.original = new Picture(filename);
    	this.collage = new Picture(td*cd, td*cd);

    	for (int col = 0; col < td*cd; col++) {
			for (int row = 0; row < td*cd; row++) {
				int originalcol = col * original.width() / (td*cd);
				int originalrow = row * original.height() / (td*cd);
				Color color = original.get(originalcol, originalrow);
				collage.set(col, row, color);
			}
		}

    }

    /*
     * Returns the collageDimension instance variable
     *
     * @return collageDimension
     */
    public int getCollageDimension() {
    	return collageDimension;
    }

    /*
     * Returns the tileDimension instance variable
     *
     * @return tileDimension
     */
    public int getTileDimension() {
    	return tileDimension;
    }

    /*
     * Returns original instance variable
     *
     * @return original
     */
    public Picture getOriginalPicture() {
    	return original;
    }

    /*
     * Returns collage instance variable
     *
     * @return collage
     */
    public Picture getCollagePicture() {
    	return collage;
    }
    
    /*
     * Display the original image
     * Assumes that original has been initialized
     */
    public void showOriginalPicture() {
    	original.show();
    }

    /*
     * Display the collage image
     * Assumes that collage has been initialized
     */
    public void showCollagePicture() {
		collage.show();
    }

    /*
     * Replaces the tile at collageCol,collageRow with the image from filename
     * Tile (0,0) is the upper leftmost tile
     *
     * @param filename image to replace tile
     * @param collageCol tile column
     * @param collageRow tile row
     */
    public void replaceTile (String filename,  int collageCol, int collageRow) {

    	Picture pic = new Picture(filename);

    	for (int tileCol=0; tileCol<tileDimension; tileCol++) {
			for (int tileRow=0; tileRow<tileDimension; tileRow++) {

				int col = tileCol * pic.width() / tileDimension;
	    		int row = tileRow * pic.height() / tileDimension;
				collage.set(collageCol*tileDimension+tileCol, collageRow*tileDimension+tileRow, pic.get(col, row));
			}
		}
		
    }
    
    /*
     * Makes a collage of tiles from original Picture
     * original will have collageDimension x collageDimension tiles, each tile
     * has tileDimension X tileDimension pixels
     */
    public void makeCollage () {

    	for (int collageCol=0; collageCol<collageDimension; collageCol++) {
    		for (int collageRow=0; collageRow<collageDimension; collageRow++) {

    			for (int tileCol=0; tileCol<tileDimension; tileCol++) {
	    			for (int tileRow=0; tileRow<tileDimension; tileRow++) {
	    				
	    				int col = tileCol * original.width() / tileDimension;
	    				int row = tileRow * original.height() / tileDimension;
	    				collage.set(collageCol*tileDimension+tileCol, collageRow*tileDimension+tileRow, original.get(col, row));
	    			}
    			}
    		}
    	}
    }

    /*
     * Colorizes the tile at (collageCol, collageRow) with component 
     * (see Week 9 slides, the code for color separation is at the 
     *  book's website)
     *
     * @param component is either red, blue or green
     * @param collageCol tile column
     * @param collageRow tile row
     */
    public void colorizeTile (String component,  int collageCol, int collageRow) {

		
		for (int tileCol=0; tileCol<tileDimension; tileCol++) {
			for (int tileRow=0; tileRow<tileDimension; tileRow++) {

				Color color = collage.get(collageCol*tileDimension+tileCol, collageRow*tileDimension+tileRow);
    			int r = color.getRed();
    			int g = color.getGreen();
    			int b = color.getBlue();
    			if (component == "red") {
    				g = 0;
    				b = 0;
    			}
    			else if (component == "green") {
    				r = 0;
    				b = 0;
    			}
    			else if (component == "blue") {
    				r = 0;
    				g = 0;
    			}

				collage.set(collageCol*tileDimension+tileCol, collageRow*tileDimension+tileRow, new Color(r,g,b));

			}
		}
    }

    /*
     * Greyscale tile at (collageCol, collageRow)
     * (see Week 9 slides, the code for luminance is at the book's website)
     *
     * @param collageCol tile column
     * @param collageRow tile row
     */
    public void greyscaleTile (int collageCol, int collageRow) {
		
		for (int tileCol=0; tileCol<tileDimension; tileCol++) {
			for (int tileRow=0; tileRow<tileDimension; tileRow++) {

				collage.set(collageCol*tileDimension+tileCol, collageRow*tileDimension+tileRow, Luminance.toGray(collage.get(collageCol*tileDimension+tileCol, collageRow*tileDimension+tileRow)));
			}
		}			
    }


    // Test client 
    public static void main (String[] args) {

		// ArtCollage art = new ArtCollage(args[0],200,3);
		// art.makeCollage();
		
		// art.replaceTile(args[1],1,1);
		// art.colorizeTile("red",0,0);
		// art.greyscaleTile(1,1);
		// art.showCollagePicture();
		
    }
}
