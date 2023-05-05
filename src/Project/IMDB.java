package Project;

public class IMDB {
    public static void main(String[] args) {
        String name = "Deepika Padukone";
        int year = 1986;
        String[] movie = new String[6];
            movie[0]="Piku";
            movie[1]="Padmaavat";
            movie[2]="Pathaan";
            movie[3]="Chennai Express";
            movie[4]="RamLeela";
            movie[5]="Cocktail";
        double[] rating = new double[6];
            rating[0]=5.5;
            rating[1]=7.4;
            rating[2]=3.9;
            rating[3]=8.2;
            rating[4]=6.9;
            rating[5]=6.3;

        System.out.println("Name: "+name);
        int age = 2023-year;
        System.out.println("Age: "+age);
        System.out.println();
        for(int i=0;i<movie.length;i++){
            System.out.println(movie[i] + " - " + quality(rating[i]));
        }
    }

    static String quality(double rate){
        if(rate<=5.0){
            return "Bad";
        } else if (rate>5.0 && rate<6.5) {
            return "Average";
        }else if (rate>6.5 && rate<7.0) {
            return "Good";
        }else if (rate>7.0 && rate<8.0) {
            return "Very Good";
        }else {
            return "Amazing";
        }
    }
}
