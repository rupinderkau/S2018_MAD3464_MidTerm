/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0737381_midterm_mads3464;

/**
 *
 * @author macstudent
 */
public class C0737381_MidTerm_MADS3464 {

    
    public static void main(String[] args) {
        // TODO code application logic here
         String st="Lambton";
         String rst="";
         String str="James tiBeriUs kiRK";
          String str2;
  
         {
         for(int i=st.length()-1;i>=0;i--)
           rst = rst + st.charAt(i);
         System.out.println("the reverse string is" + rst);
        
    }
       if(str==null)
       {
        System.out.println("The String is empty");
        }
       

       for (int j=1;j<=str.length();j++)
           
       str2= str.toUpperCase();
       
       System.out.println(str2);
    }
}





