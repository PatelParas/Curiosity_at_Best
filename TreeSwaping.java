/** Swap Nodes of Tree  https://www.hackerrank.com/challenges/swap-nodes-algo **/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Tree {

    class Node {
        int index;
        Node left;
        Node right;

        public Node(int index) {
            this.index = index;
        }
    }

    Queue<Node> queue = new LinkedList();
    Node root;
    Scanner scanner;

    Tree(Scanner scanner) {
        this.root = new Node(1);
        this.scanner = scanner;
        queue.add(root);
    }

    void build(Node node, int left, int right) {

        if (left != -1) {
            Node leftN = new Node(left);
            node.left = leftN;
            queue.add(leftN);
        }
        if (right != -1) {
            Node rightN = new Node(right);
            node.right = rightN;
            queue.add(rightN);
        }

    }

    void swapSubTreeAndPrint() {
        int sizeOne = scanner.nextInt();
        for (int i = 0; i < sizeOne; i++) {
            Node node = queue.remove();
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            build(node, left, right);
        }
        int sizeTwo = scanner.nextInt();
        for (int i = 0; i < sizeTwo; i++) {
            int swapLayer = scanner.nextInt();
            swapRec(root, swapLayer, 1);
            System.out.println();
        }
    }

    private void swapRec(Node node, int swapLeft, int currentLeft) {
        if (node == null) return;
        if (currentLeft % swapLeft == 0) {
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        swapRec(node.left, swapLeft, currentLeft + 1);
        System.out.print(node.index+" ");
        swapRec(node.right, swapLeft, currentLeft + 1);
    }
}

public class TreeSwaping {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tree tree = new Tree(scanner);
        tree.swapSubTreeAndPrint();
    }
}
