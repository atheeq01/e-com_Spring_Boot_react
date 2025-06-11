package com.ecommerce.project.model;

public class Category {
    private Long categotyID;
    private String categoryName;

    public Category(Long categotyID, String categoryName) {
        this.categotyID = categotyID;
        this.categoryName = categoryName;
    }

    public Long getCategotyID() {
        return categotyID;
    }

    public void setCategotyID(Long categotyID) {
        this.categotyID = categotyID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
