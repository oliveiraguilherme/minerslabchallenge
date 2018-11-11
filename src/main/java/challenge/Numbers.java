package challenge;

import challenge.exception.InvalidPositionException;

class Numbers {

    static void bubblesortdecrescente(int[] numbers){

        int n = numbers.length;
        int aux = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < (n-1); j++){
                if(numbers[j] < numbers[j+1]){
                    aux = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = aux;
                }
            }
        }

    }

    static void bubblesortcrescente(int[] numbers){

        int n = numbers.length;
        int aux = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < (n-1); j++){
                if(numbers[j] > numbers[j+1]){
                    aux = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = aux;
                }
            }
        }
    }


    static int findNLargest(int[] numbers, int position) throws InvalidPositionException {

        int n = numbers.length;
        if (position < 1 || position > n) {
            throw new InvalidPositionException();
        }
        bubblesortdecrescente(numbers);
        return numbers[position - 1];
    }

    static int findNShortest(int[] numbers, int position) throws InvalidPositionException {

        int n = numbers.length;
        if (position < 1 || position > n) {
            throw new InvalidPositionException();
        }
       bubblesortcrescente(numbers);
        return numbers[position - 1];
    }

    static boolean contains(int[] numbers, int n) {
        int número = numbers.length;
        for(int i = 0; i < número; i++){
            if(numbers[i] == n){
                return true;
            }
        }
        return false;
    }

    static int[] ascendingSort(int[] numbers) {
        bubblesortcrescente(numbers);
        return numbers;
    }

    static int[] descendingSort(int[] numbers) {
        bubblesortdecrescente(numbers);
        return numbers;
    }

}
