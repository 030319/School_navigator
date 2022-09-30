package user;

//存储
public class daposit {
    int NLFF = 1000;

    public int[][] dep() {
        /**
         * 每个坐标与其可直接连接的点最多为5个
         * 数组中数字代表相连坐标下标
         * 第6个数代表状态
         * 0为未经过
         */
        int arr[][] = new int[][]{{2 ,12 ,0 ,0 ,0 ,0},//1
                {1 ,3 ,0 ,0 ,0 ,0},{2 ,4 ,7 ,16 ,15 ,0},//3
                {3,5,0,0,0,0},{4,6,9,0,0,0},{5,11,17,0,0,0},//6
                {3,0,0,0,0,0},{0,15,20,21,0,0},{5,13,0,0,0,0},//9
                {3,14,17,0,0,0},{6,22,0,0,0,0},{1,19,0,0,0,0},//12
                {9,0,0,0,0,0},{10,16,0,0,0,0},{3,8,16,0,0,0},//15
                {14,15,3,0,0,0},{6,10,0,0,0,0},{0,19,0,0,0,0},//18
                {12,18,0,0,0,0},{8,0,0,0,0,0},{8,0,0,0,0,0},
                {11,0,0,0,0,0}};//21

        for (int i = 0; i < 22; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] != 0)
                    arr[i][j]--;
            }
        }
        return arr;
    }
}
