package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class binarySearch {
public static void main(String args[]) {
    
    int[] a = {5, 4, 3, 2, 1};
/*
 * for(int i=0;i<a.length;i++) {
 * for(int j=1;j<a.length-i;j++) {
 * if(a[j-1]>a[j]) {
 * swap(a,j-1,j);
 * }
 * 
 * }
 * }
 */
//binarySearch.selectionSort(a);
   // cyclicSort(a);
    int[] arr = {2, 3, 5, 4, 19};
    int num = 10;
    String name = "Kunal Kushwaha";
//    System.out.println(name);

    String a1 = "Kunal";
    System.out.println(a1);
    a1 = "Kushwaha";
    System.out.println(a1);
    System.out.println("     Kunal   ".strip());


System.out.println(Arrays.toString(a));
System.out.println((char)('a' + 'b'));
System.out.println("a" + "b");
System.out.println("Kunal" + new ArrayList<>());
System.out.println("Kunal" + new Integer(56));
String ans = new Integer(56) + "" + new ArrayList<>();
System.out.println(ans);
System.out.println("a" + 'b');

String series = "";
for (int i = 0; i < 26; i++) {
    char ch = (char)('a' + i);
    series +=   ch; // series += ch
}

System.out.println(series);
StringBuilder builder = new StringBuilder();
for (int i = 0; i < 26; i++) {
    char ch = (char)('a' + i);
    builder.append(ch);
}

System.out.println(builder.toString());

builder.reverse();

System.out.println(builder);
String a12[]={"1","string"};
main(a12);
}

public static void selectionSort(int a[]) {
    for(int i=0;i<a.length;i++) {
        int endInd=a.length-i-1;
        int maxind=getMaxindex(a,0,endInd);
        swap(a, maxind, endInd);
    }
    System.out.println("selection sort");
    System.out.println(Arrays.toString(a));

}


public static void cyclicSort(int a[]) {
    int i=0;
    while(i<a.length) {
        int correct=a[i]-1;
        if(a[i]!=a[correct]) {
            swap(a, i, correct);
        }
        else {
            i++;
        }
    }
}



private static int getMaxindex(int[] a, int startind, int endInd) {
    // TODO Auto-generated method stub
    int max=startind;
    for(int i=startind+1;i<=endInd;i++) {
        if(a[max]<a[i]) {
            max=i;        }
    }
    return max;
}

public static void swap(int a[],int src,int trg) {
    int temp=a[src];
    a[src]=a[trg];
    a[trg]=temp;
}
}




