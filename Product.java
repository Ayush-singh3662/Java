public class Product {
    public static void main(String[] args) {
        Product_Test item = new Product_Test("A123-52F", "Jeans");
        item.setItemPrice(1250);
        item.setItemQty(1500);
        System.out.println("Details:");
        System.out.println("Item Number : "+item.getItemNo());
        System.out.println("Item Name : "+item.getItemName());
        System.out.println("Item Price : Rs."+item.getItemPrice());
        System.out.println("Item Quantity : "+item.getItemQty()+" pieces");
    }
}

class Product_Test {
    private String itemNo;
    private String itemName;
    private int itemPrice;
    private long itemQty;

    public String getItemNo() {
        return itemNo;
    }
    public String getItemName() {
        return itemName;
    }
    public int getItemPrice() {
        return itemPrice;
    }
    public long getItemQty() {
        return itemQty;
    }
    public void setItemPrice(int price) {
        itemPrice = price;
    }
    public void setItemQty(long qty) {
        itemQty = qty;
    }

    public Product_Test(String number, String name) {
        itemNo = number;
        itemName = name;
    }
}