package dayNine225;

public class MiGOng {
    public static void main(String[] args) {
        //先创建迷宫，用用二维数组表示 int[][] map = new int[8][7];
        ///先规定map 数组的元素值；0可以表示可以走  1 表示障碍物
        int[][] map = new int[8][7];
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //将最上面的一列和最下面的一列设置为1
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;

        //输出当天的地图
        System.out.println("\n===当前地图情况====");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");//输出一行
            }
            System.out.println( );
        }

        T t1 = new T();
        t1.findWay(map, 1, 1);

        System.out.println("\n===找路的情况如下====");

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");//输出一行
            }
            System.out.println();
        }

    }

    class B {
        //使用递归回溯的思想来解决老鼠出迷宫
        public boolean findWay(int[][] map, int i, int j) {
            if (map[6][5] == 2) {
                return true;
            } else {
                if (map[i][j] == 0) {
                    map[i][j] = 2;
                    if (findWay(map, i + 1, j)) {
                        return true;
                    } else if (findWay(map, i, j + 1)) {
                        return true;
                    } else if (findWay(map, i - 1, j)) {
                        return false;
                    } else if (findWay(map, i, j - 1)) {
                        return true;
                    } else {
                        map[i][j] = 3;
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
    }
}
