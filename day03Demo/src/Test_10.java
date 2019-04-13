import java.util.Arrays;

public class Test_10 {

    public static void main(String[] args) {
        ChickenManage cm = new ChickenManage(6);
        cm.addChicken(new Chicken(1 , "小鸡1" , 3 , 5));
        cm.addChicken(new Chicken(2 , "小鸡2" , 1 , 1));
        cm.addChicken(new Chicken(3 , "小鸡3" , 2 , 7));
        cm.addChicken(new Chicken(4 , "小鸡4" , 7 , 9));
        cm.addChicken(new Chicken(5 , "小鸡5" , 5 , 6));
        cm.addChicken(new Chicken(6 , "小鸡6" , 5 , 6));
        cm.addChicken(new Chicken(7 , "小鸡7" , 5 , 6));
      /*  cm.printInfo();
        System.out.println("----------------");
        cm.updateChicken(new Chicken(2 , "呜呜" , 11, 55));
        cm.printInfo();
        System.out.println("--------------");
        System.out.println(cm.getChickenById(3));
        System.out.println("--------------");*/
        cm.deleteChickenById(2);
        cm.printInfo();
    }
}

class ChickenManage{

    private Chicken[] chickens; //定义一个鸡舍
    private int count = 0;
    public ChickenManage(int size){
        chickens = new Chicken[size];
    }

    /**
     * 添加方法
     */
    public void addChicken(Chicken c){
        if(count == chickens.length){//已经满了
            chickens = Arrays.copyOf(chickens , chickens.length +1);
        }
        chickens[count++] = c;
    }

    /**
     * 更新鸡
     */
    public void updateChicken(Chicken c){
        for(Chicken cs : chickens){
            if(cs.getId() == c.getId()){
                cs.setName(c.getName());
                cs.setWeight(c.getWeight());
                cs.setAge(c.getAge());
            }
        }
    }

    /**
     * 删除一只鸡，根据ID
     */
    public void deleteChickenById(int id){
        for(int i = 0 ; i < chickens.length ; i++){
            if(chickens[i].getId() == id){
                for(int j = i ; j < count ; j++){
                    if(j + 1 == count){
                        break;
                    }
                    chickens[j] = chickens[j+1];
                }

            }
        }
        chickens[chickens.length - 1] = null;
    }

    /**
     * 查询一只鸡根据ID
     */
    public Chicken getChickenById(int id){
        for(Chicken cs : chickens) {
            if (cs.getId() == id) {
                return cs;
            }
        }
        return null;
    }

    /**
     * 打印所有鸡
     */
    public void printInfo(){
        for(Chicken c : chickens){
            if(null != c){
                System.out.println(c);
            }
        }
    }

}

class Chicken{
    private int id;
    private String name;
    private int age;
    private int weight;

    public Chicken(){}
    public Chicken(int id , String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

}
