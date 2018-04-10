import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    void levelOrder(Node root) {

        final Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.data + " ");

            if(curr.left != null) {
                queue.add(curr.left);
            }

            if(curr.right != null) {
                queue.add(curr.right);
            }
        }

    }
}
