package PracticePrograms;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import javax.management.ValueExp;
import javax.management.openmbean.InvalidOpenTypeException;

class TreeNode {
    int value;
    int color;
    List<TreeNode> children;

    public TreeNode(int value, int color) {
        this.value = value;
        this.color = color;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }
    public void accept(TreeVis visitor) {
        visitor.visitNode(this);
        for (TreeNode child : children) {
            child.accept(visitor);
        }
    }
}

class Tree {
    private TreeNode root;

    public Tree(int[] values, int[] colors, int[][] edges) {
        int n = values.length;
        TreeNode[] nodes = new TreeNode[n];

        for (int i = 0; i < n; i++) {
            nodes[i] = (colors[i] == 0) ? new TreeLeaf(values[i], colors[i]) : new TreeNode(values[i], colors[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            int u = edges[i][0] - 1;
            int v = edges[i][1] - 1;
            nodes[u].addChild(nodes[v]);
        }

        this.root = nodes[0];
    }

    public TreeNode getRoot() {
        return root;
    }
}

class TreeLeaf extends TreeNode {
    public TreeLeaf(int value, int color) {
        super(value, color);
    }
    @Override
    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

// Base class for visitors
class TreeVis {
    public int getResult() {
        return 0; // Default implementation, to be overridden by subclasses
    }

    public void visitNode(TreeNode node) {
        // To be implemented by subclasses
    }

    public void visitLeaf(TreeLeaf leaf) {
        // To be implemented by subclasses
    }
}

// SumInLeavesVisitor class
class SumInLeavesVisitor extends TreeVis {
    private int result = 0;

    @Override
    public void visitLeaf(TreeLeaf leaf) {
        result += leaf.value;
    }

    @Override
    public int getResult() {
        return result;
    }
}

// ProductRedNodesVisitor class
class ProductRedNodesVisitor extends TreeVis {
    private static final int MODULO = 1000000007;
    private long result = 1;

    @Override
    public void visitNode(TreeNode node) {
        if (node.color == 1) { // Red node
            result = (result * node.value) % MODULO;
        }
    }

    @Override
    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.color == 1) { // Red leaf node
            result = (result * leaf.value) % MODULO;
        }
    }

    @Override
    public int getResult() {
        return (int) result;
    }
}

// FancyVisitor class
class FancyVisitor extends TreeVis {
    private int evenDepthSum = 0;
    private int greenLeavesSum = 0;

    @Override
    public void visitNode(TreeNode node) {
        if (node.value % 2 == 0 && node.color == 0) { // Even depth non-leaf node
            evenDepthSum += node.value;
        }
    }

    @Override
    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.color == 2) { // Green leaf node
            greenLeavesSum += leaf.value;
        }
    }

    @Override
    public int getResult() {
        return Math.abs(evenDepthSum - greenLeavesSum);
    }
}

public class Solution {
    public static Tree solve() {
     //   Scanner scanner = new Scanner(System.in);
        int n = 3;
        int[] values = new int[n];
        int[] colors = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = 2;
        }

        for (int i = 0; i < n; i++) {
            colors[i] = 2;
        }

        int[][] edges = new int[n - 1][2];

        for (int i = 0; i < n - 1; i++) {
            edges[i][0] = 1;
            edges[i][1] = 2;
        }

       // scanner.close();

        return new Tree(values, colors, edges);
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor sumVisitor = new SumInLeavesVisitor();
        ProductRedNodesVisitor productVisitor = new ProductRedNodesVisitor();
        FancyVisitor fancyVisitor = new FancyVisitor();

        root.getRoot().accept(sumVisitor);
        root.getRoot().accept(productVisitor);
        root.getRoot().accept(fancyVisitor);

        System.out.println(sumVisitor.getResult());
        System.out.println(productVisitor.getResult());
        System.out.println(fancyVisitor.getResult());
    }
}
