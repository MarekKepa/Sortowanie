public class Sortowanie
    {
        public static void main(String[] args)
        {
            int[] tab = {4, 8, 5, 3, 10, 9, 2, 6, 7, 1};
            int i, j, t;

            for (i = 0; i < tab.length - 1; i++){ //
                for (j = 0; j < tab.length - 1; j++){
                    if (tab[j] > tab[j +1]) {
                        t = tab[j];
                        tab[j] = tab[j + 1];
                        tab[j + 1] = t;
                    }
                }
            }
            for (i = 0; i < tab.length; i++)
                System.out.println(tab[i]);


        }
    }