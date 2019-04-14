import java.util.Arrays;

public class Test_02 {
    public static void main(String[] args) {
        CosmeticManager cm = new CosmeticManager();

        //cm.printInfo();

        SortCosmeticManager scm = new SortCosmeticManager();
        scm.addCosmetic(new Cosmetic("雅诗拉带", "进口", 23));
        scm.addCosmetic(new Cosmetic("曼秀雷敦", "进口", 33));
        scm.addCosmetic(new Cosmetic("大宝", "国产", 2));
        scm.addCosmetic(new Cosmetic("曼秀雷敦", "进口", 11));
        scm.addCosmetic(new Cosmetic("曼秀雷敦", "进口", 66));
        scm.printInfo();

     /*   TypeCosmeticManager tcm = new TypeCosmeticManager();
        tcm.addCosmetic(new Cosmetic("雅诗拉带" , "进口" , 23));
        tcm.addCosmetic(new Cosmetic("曼秀雷敦" , "进口" , 33));
        tcm.addCosmetic(new Cosmetic("大宝" , "国产" , 2));
        tcm.addCosmetic(new Cosmetic("曼秀雷敦" , "进口" , 11));
        tcm.addCosmetic(new Cosmetic("曼秀雷敦" , "进口" , 66));

        tcm.printInfo();*/
    }
}

/**
 * 、使用继承实现一个只输出进口化妆品的功能
 */
class TypeCosmeticManager extends CosmeticManager {
    public void printInfo() {
        for (int i = 0; i < count; i++) {
            if (cosmetics[i].getType().equals("进口")) {
                System.out.println(cosmetics[i]);
            }
        }
    }
}

/**
 * 使用继承实现一个可按单价排序输出所有化妆品的功能
 */
class SortCosmeticManager extends CosmeticManager {

    public void printInfo() {

        Cosmetic[] css = Arrays.copyOf(cosmetics, cosmetics.length);

        //选择排序  minIndex
        for (int i = 0; i < count; i++) {
            int minIndex = i;
            for (int j = i + 1; j < count; j++) {
                if (css[minIndex].getPrice() > css[j].getPrice()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Cosmetic cosmetic = css[minIndex];
                css[minIndex] = css[i];
                css[i] = cosmetic;
            }
        }
        for (
                Cosmetic c : css) {
            System.out.println(c);
        }
    }


}


class CosmeticManager {
    public Cosmetic[] cosmetics = new Cosmetic[5];
    public int count = 0;

    /**
     * 进货功能
     */
    public void addCosmetic(Cosmetic c) {
        if (count == cosmetics.length) {
            cosmetics = Arrays.copyOf(cosmetics, cosmetics.length + 1);
        }
        cosmetics[count++] = c;
    }

    /**
     * 输出化妆品
     */
    public void printInfo() {
        for (Cosmetic c : cosmetics) {
            if (null != c) {
                System.out.println(c);
            }
        }
    }


}

class Cosmetic {
    //name,type,price
    private String name;
    private String type;
    private int price;

    public Cosmetic(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cosmetic{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
