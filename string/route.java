// to get the shortest distance from the the start position
// also we are going to see the comparision of string
package string;

public class route {
    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'S') {
                y--;
            } else if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'W') {
                x--;
            } else {
                x++;
            }
        }

        int X2 = x * x;
        int Y2 = y * y;
        float pathDistance = (float) Math.sqrt(X2 + Y2);
        return pathDistance;
    }

    public static void main(String args[]) {
        // String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));

        String s1 = "medhankar";
        System.out.println(s1.substring(0, 4));
        // String s2 = "medhankar";
        // String s3 = new String("medhankar");
        // here s1=s2 but s1!=s3
    }
}
