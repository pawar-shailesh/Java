package collectionArrayList;

import java.util.*;
import java.lang.reflect.*;
 public class CheckCapacity
 {
	 

ArrayList al = new ArrayList();          //Size:  0, Capacity:  0
ArrayList a2 = new ArrayList(5);         //Size:  0, Capacity:  5
ArrayList a3 = new ArrayList(new ArrayList(5)); //Size:  0, Capacity:  0
  
      //Size:  1, Capacity: 10

public static void main( String[] args )
        throws Exception
    {
        ArrayList al = new ArrayList();
        getCapacity( al );
        al.add( "usha" );
        getCapacity( al );
    }

    static void getCapacity( ArrayList<?> l )
        throws Exception
    {
        Field dataField = ArrayList.class.getDeclaredField( "elementData" );
        dataField.setAccessible( true );
        System.out.format( "Size: %2d, Capacity: %2d%n", l.size(), ( (Object[]) dataField.get( l ) ).length );
}
 }

