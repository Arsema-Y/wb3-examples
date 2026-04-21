package com.pluralsight;

public class Exception1 {
    public static void main(String[] args) {
        String[] names = {
                // 0 , 1,   2
                "Ez", "El", "Ia",
        };

        /*try/catch library <~ fault tolerance env
         *catching any errors/exceptions
         */
        try{ //code you want to try (see if it errors)
            String name = names[3]; //3: N/A in list, list i = 2
            System.out.println(name);

          //what to do with the error
        }catch (Exception e) {//e = the Exception's name
            e.printStackTrace(); /*display exception: acknowledgment error
                                  *if not displayed, the error will be hidden
                                  *(hard to figuer out letter down the line)
                                  */
            //disregard error
            throw new RuntimeException();
        }
        //exception: a error class in java
        //when unexpected thing happens


    }
}
