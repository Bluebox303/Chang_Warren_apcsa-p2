/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test KeepOnlyBlue */
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  /** Method to test Negate */
  public static void testNegate() {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  /** Method to test Grayscale */
  public static void testGrayscale() {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  /** Method to test MirrorHorizontal */
  public static void testMirrorHorizontal() 
  {
	  Picture motorcycle = new Picture("src/images/redMotorcycle.jpg");
	  motorcycle.explore();
	  motorcycle.mirrorHorizontal();
	  motorcycle.explore();
  }
  
  /** Method to test water */
  public static void testWater() {
	  Picture water = new Picture("src/images/water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the mirrorarms method */
  public static void testMirrorArms() {
	  Picture snowman = new Picture("src/images/snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  /** Method to test the Gull method */
  public static void testGull() {
	  Picture gulls = new Picture("src/images/seagull.jpg");
	  gulls.explore();
	  gulls.mirrorGull();
	  gulls.explore();
  }
  
  /** Method to test the mirrorGull method */
  public static void testMirrorGull() {
	  Picture mgulls = new Picture("src/images/seagull.jpg");
	  mgulls.explore();
	  mgulls.mirrorGull();
	  mgulls.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test copy method */
  public static void testCopy()
  {
	  Picture canvas = new Picture("src/images/640x480.jpg");
	  canvas.myCollage();
	  canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Method to test edgeDetection2 */
  public static void testEdgeDetection2() {
	  Picture swan = new Picture("src/images/swan.jpg");
	  swan.explore();
	  swan.edgeDetection2(17);
	  swan.explore();
  }
  
  /** Method to test encoding */
  public static void testEncode()
  {
	    Picture msg = new Picture("src/images/msg.jpg");
	    msg.explore();
	    Picture beach = new Picture("src/images/beach.jpg");
	    beach.explore();
	    Picture message = new Picture("src/images/msg.jpg");
        beach.encode( message );
        beach.explore();
        Picture decoded = beach.decode();
        decoded.explore();
	  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	  
	  testEncode();
  }
}