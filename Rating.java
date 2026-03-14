public class Rating {
    //Function used to find most frequently occured ratings
    public static int findFrequentRating(int [] ratings) {
        //Intializing the value(fr)
        int fr = ratings[0];
        //Intialize max value
        int max = 0;
        //Iterates over each rating
        for (int i = 0; i < ratings.length; i++) {
            //Initialize count variable
            int count = 0;
            //Iterates over each rating
            for (int j = 0; j < ratings.length; j++) {
                //Current rating should be equal to previous rating
                if (ratings[j] == ratings[i]) {
                    //increments the counter
                    count++;
                }
            }
            //Check whether count is greater than maximum rating
            if (count > max) {
                //if it is true then max is equal to count
                max = count;
                //Updates the current rating
                fr = ratings[i];
            }
        }
        return fr;
    }
    public static void main(String [] args) {
        //Array of integers
        int[] ratings = {5, 6, 9, 8, 4, 2, 1, 3, 6, 7};
        //argument that passes ratings
        int fr = findFrequentRating(ratings);
        //Print
        System.out.println("The rating that appears most frequently is: " + fr); 
    }
}
