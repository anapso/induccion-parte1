package data;

import com.mercadopago.resources.datastructures.preference.Item;
import com.mercadopago.resources.datastructures.preference.Payer;

public class PreferenceData {

    // Dados Item
    private String itemId;
    private String itemTitle;
    private Integer itemQuantity;
    private String itemDescription;
    private Float itemUnitPrice;

    // Dados Payer
    private String payerName;
    private String payerEmail;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public Float getItemUnitPrice() {
        return itemUnitPrice;
    }

    public void setItemUnitPrice(Float itemUnitPrice) {
        this.itemUnitPrice = itemUnitPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }


    public String getPayerEmail() {
        return payerEmail;
    }

    public void setPayerEmail(String payerEmail) {
        this.payerEmail = payerEmail;
    }

    public Item getItem(){
        return new Item().setTitle(this.getItemTitle())
                .setQuantity(this.getItemQuantity())
                .setDescription(this.getItemDescription())
                .setUnitPrice(this.getItemUnitPrice());
    }

    public Payer getPayer() {
        return new Payer().setName(this.getPayerName())
                .setEmail(this.getPayerEmail());
    }

}
