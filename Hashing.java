import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
import java.util.*;
public class Hashing {
    public static void main(String args[]){
//     //    //create 
//     //    HashSet<Integer> set = new HashSet<>();
//     //    set.add(1);
//     //    set.add(2);
//     //    set.add(3);
//     //    set.add(1);

//     // //size
//     // System.out.println("size of set is: "+ set.size());



//     // //    //search - contains
//     // //    if(set.contains(1)){
//     // //     System.out.println("set contains");

//     // //    }
//     // //    if(!set.contains(6)){
//     // //     System.out.println("Does not contains");
//     // //    }

//     // //   //Delete
//     // //   set.remove(1);
//     // //   if(!set.contains(1)){
//     // //     System.out.println("does not contains 1");
//     // //   }

//     //  // Iterator
//     //   Iterator it = set.iterator();
      
//     //   while(it.hasNext()){
//     //     System.out.println(it.next());
//     //   }
    
//     //Country Population
    HashMap<String, Integer> map = new HashMap<>();
    
//     //Insertion
    map.put("Bangladesh",16);
     map.put("India",120);
     map.put("USA",30);
     System.out.println(map);


//  // Search
// //   if(map.containsKey("Indi")){
// //     System.out.println("KEY is preseent");
// //   }

//   System.out.println(map.get("India"));
//   System.out.println(map.get("Indo"));

//   int array[]={1,3,4,5,6,8};
//       for(int val : array){
//    System.out.print(val+" ");
//       }
//       System.out.println();

 for(Map.Entry<String, Integer> e : map.entrySet()){
    System.out.println(e.getKey());
    System.out.println(e.getValue());
 }

}

}