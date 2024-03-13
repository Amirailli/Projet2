package amartt;
import java.util.ArrayList ;
import java.util.ListIterator; 
import java.util.Collections;
import java.util.LinkedList ;
public class cree {
  public static void main (String[]args) {
	  ArrayList< String>l = new ArrayList();
	  l.add("Informatique");
	  l.add("Mathématiques" );
	  l.add("Génie Civil");
	  l.add("Physique");
	  l.add("Chimie");
	  l.add("Biologie");
	  l.add("Géologie");
	  l.add("Génie Mécanique");
	  for(int i = 0 ; i< l.size(); i++){
		  System.out.println(l.get(i));
	  }
	  System.out.println("******************************");
	 Collections.sort(l);
      
	  ListIterator<String> li = l.listIterator();
	 while(li.hasNext()) {
		  System.out.println(li.next());
	  }
	  System.out.println("******************************");
	  System.out.println("Affichage avec boucle for-each :");
      for (String faculte : l) {
          System.out.println(faculte);
          
      }
      System.out.println(l.size());
      int i =0 ;
      String Géologie;
      while ( i<l.size() && !l.get(i).equals("Géologie")  ) {
    	  i++;
      }
      if (i < l.size()) {
       l.remove (i);
       l.add(i,"Sciences de la Terre");
       System.out.println("Element 'Géologie' remplacé par 'Sciences de la Terre'");
      } else {
          System.out.println("L'élément 'Géologie' n'a pas été trouvé dans la liste.");
      }
      while ( i<l.size() && !l.get(i).equals("Sciences de la Terre")  ) {
    	  i++;
      }
      if (i < l.size()) {
    	  System.out.println(l.get(i));
      }
   //LinkedList<String> linkedList = new LinkedList<>(l);
  // System.out.println("Affichage des éléments de la LinkedList :");
   //ListIterator<String> li = l.listIterator();
   //while (li.hasNext()) {
	 //  System.out.println(li.next());
  //}
}
}

