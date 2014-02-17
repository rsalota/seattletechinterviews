using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FindKthInorderNode
{
    class Program
    {
        static void Main(string[] args)
        {
            BinaryNode root = new BinaryNode(7);

            root.insert(new BinaryNode(5));
            root.insert(new BinaryNode(6));
            root.insert(new BinaryNode(4));
            root.insert(new BinaryNode(10));
            root.insert(new BinaryNode(9));
            root.insert(new BinaryNode(12));

            System.Console.Write("Inoder traversal: ");
            root.InorderTraversal();

            // Print kth node of in-order traversal.
            root.PrintKthInorderNode(3); 

            System.Console.Read();
        }

        
    }
}
