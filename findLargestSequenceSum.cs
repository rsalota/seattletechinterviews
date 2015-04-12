using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace largestSeqSum
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine(97 ^ 75);
            Random rnd = new Random();
            int[] numbers = new int[6];
            int LS;

            for (int i = 1; i < 10; i++)
            {
                for (int j = 0; j < 6; j++) {
                    numbers[j] = rnd.Next(-10, 10);
                }
                LS = largestSeqSum(numbers);
                Console.WriteLine("{0}........... {1}", String.Join(" ", numbers.Select(x => x.ToString()).ToArray()), LS);
                Console.WriteLine();
            }
            numbers = new int[6] {2, -8, 3, -2, 4, -10};
            LS = largestSeqSum(numbers);
            Console.WriteLine("{0}........... {1}", String.Join(" ", numbers.Select(x => x.ToString()).ToArray()), LS);
            Console.WriteLine();
        }


        public static int largestSeqSum(int[] numbers)
        {
            int highest = int.MinValue;  //highest sequence sum so far, init to lowww value (-2147483648)
            int seqSum = 0;   //sum of the sequence under consideration

            foreach (int n in numbers) {
                if (n <= 0 && n > highest) { //handle if all values are negative
                    highest = n;
                    continue;
                }

                seqSum += n;

                if (seqSum < 0) {  //current n makes sequence sum negative => end of sequence
                    seqSum = 0;  //start new sequence
                    continue;
                }

                highest = (seqSum > highest) ? seqSum : highest;
            } //foreach

            return highest;
        }
    }
}
