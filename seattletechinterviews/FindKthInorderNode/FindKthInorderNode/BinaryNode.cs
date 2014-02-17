using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FindKthInorderNode
{
    class BinaryNode
    {
        public BinaryNode left;
        public BinaryNode right;
        public int data;
        public int leftNodeCount;

        public BinaryNode(int data)
        {
            this.data = data;
        }

        public void insert(BinaryNode node)
        {
            BinaryNode temp = this;

            while (temp != null)
            {
                if (temp.data <= node.data)
                {
                    if (temp.right == null)
                    {
                        temp.right = node;
                        break;
                    }
                    else
                        temp = temp.right;
                }

                else
                {
                    temp.leftNodeCount += 1;

                    if (temp.left == null)
                    {
                        temp.left = node;
                        break;
                    }
                    else
                        temp = temp.left;
                }
            }
        }        

        public void InorderTraversal()
        {
            this.InorderTraversal(this);
        }

        public void PrintKthInorderNode(int k)
        {
            this.PrintKthInorderNode(this, k);
        }

        private void PrintKthInorderNode(BinaryNode node, int k)
        {
            if (node.leftNodeCount + 1 == k)
                System.Console.WriteLine("\n\nKth inorder node is: " + node.data);
            else if (node.leftNodeCount + 1 > k)
                PrintKthInorderNode(node.left, k);
            else
                PrintKthInorderNode(node.right, k - (node.leftNodeCount + 1));
        }

        private void InorderTraversal(BinaryNode node)
        {
            if(node != null)
            {
                InorderTraversal(node.left);

                System.Console.Write(node.data + " ");

                InorderTraversal(node.right);
            }
        }
    }
}
