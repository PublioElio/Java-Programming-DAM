package addact_05;

/**
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class ItemList {

    private Item[] list;
    private int itemTotal;

    public ItemList(int itemNum) {
        itemNum = itemNum < 3 ? 3 : itemNum;
        this.list = new Item[itemNum];
        this.itemTotal = 0;
    }

    public int searchItem(Item itemToSearch) {
        int pos = -1;
        for (int i = 0; (i < itemTotal) && (pos == -1); i++) {
            pos = this.list[i].getCode().equals(itemToSearch.getCode()) ? i : -1;
        }
        return (pos);
    }

    public boolean insertItem(Item itemToInsert) {
        boolean inserted = false;
        if ((!maxItemReached()) && (searchItem(itemToInsert) == -1)) {
            this.list[itemTotal++] = itemToInsert;
            inserted = true;
        }
        return (inserted);
    }

    public Item deleteItem(Item itemToDelete) {
        int pos = searchItem(itemToDelete);
        Item cloned;
        if (pos != -1) {
            cloned = this.list[pos].clone();
            for (int i = pos; (i < this.itemTotal - 1); i++) {
                this.list[i] = this.list[i + 1];
            }
            this.itemTotal--;
        } else {
            cloned = new Item(null);
        }
        return (cloned);
    }

    public boolean maxItemReached() {
        return (this.list.length == itemTotal);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; (i < this.itemTotal) && (this.list[i] != null); i++) {
            s += this.list[i].toString();
        }
        return (s);
    }

    public Item[] getList() {
        return list;
    }

    public int getItemTotal() {
        return itemTotal;
    }
}
