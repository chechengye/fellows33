/**
 * 一起来参加屌丝程序员大赛吧，有3个班级各3名学员参赛，
 * 	记录每个学员的成绩，并计算每个班的平均分
 */

public class Test_04 {
    public static void main(String[] args) {
        int[][] clazz = {{11,22,443,3,34,5,54},{44,23,66},{56,33,55}};

        for(int i = 0 ; i< clazz.length ; i++){
            float total = 0.0F;
            for(int j = 0 ; j < clazz[i].length ; j++){
                total += clazz[i][j];
            }
            System.out.println((i+1) + "班平均分:" + total / clazz[i].length);
        }

    }
}
