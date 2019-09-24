package andi.uday.coffeetime;

public class Drinks {
    private String name;
    private String desc;
    private int imageId;

    public static final Drinks[] drinks={
            new Drinks("Cappuccino","this is description of Cappuccino",R.drawable.Cappuccino),
            new Drinks("beans","this is description of beans",R.drawable.beans),
            new Drinks("cyclecoffee","this is description of cyclecoffee",R.drawable.cyclecoffee)
    };
    private Drinks(String name,String desc,int imageId)
    {
        this.name=name;
        this.desc=desc;
        this.imageId=imageId;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImageId() {
        return imageId;
    }
    public String toString()
    {
        return this.name;
    }
}
