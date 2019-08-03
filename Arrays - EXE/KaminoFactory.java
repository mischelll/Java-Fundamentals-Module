package JavaFundamentalsExe;


import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = Integer.parseInt(in.nextLine());

        int countSequence = 0;
        int countProbes = 0;
        int startIndex = 0;
        int biggestLengthofOnes = 0;
        int bestProbes = 0;
        int bestSum = 0;
        boolean clone = false;
        String bestDna = "";
        String seqeunceOfones = "";


        while (true) {
            String line = in.nextLine();
            if (line.equals("Clone them!")) {
                clone = true;
                break;
            }
            countProbes++;

            int currentLength = 0;
            int sumOfOnes = 0;
            String sequence = line.replaceAll("!", "");
            String[] input = sequence.split("0+");
            for (int i = 0; i < input.length; i++) {
                if (input[i].length() > currentLength) {
                    currentLength = input[i].length();
                    seqeunceOfones = input[i];
                }
                sumOfOnes += input[i].length();
            }
            int leftIndex = sequence.indexOf(seqeunceOfones);


            if (currentLength > biggestLengthofOnes) {
                biggestLengthofOnes = currentLength;
                bestDna = sequence;
                startIndex = leftIndex;
                bestSum = sumOfOnes;
                bestProbes = countProbes;
            }else if (currentLength == biggestLengthofOnes && (leftIndex < startIndex || sumOfOnes > bestSum)){
                biggestLengthofOnes = currentLength;
                bestSum = sumOfOnes;
                bestDna  = sequence;
                startIndex = leftIndex;
                bestProbes = countProbes;
            }else if(countProbes == 1){
                biggestLengthofOnes = currentLength;
                bestSum = sumOfOnes;
                startIndex  = leftIndex;
                bestDna = sequence;
                bestProbes = countProbes;
            }

        }

        if (clone){
            System.out.printf("Best DNA sample %d with sum: %d.\n", bestProbes, bestSum);
            String[] dna = bestDna.split("");
            System.out.println(String.join(" ",dna));
        }
    }
}
