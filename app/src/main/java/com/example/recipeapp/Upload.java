package com.example.recipeapp;

public class Upload {
    private String mName;
    private String mImageUrl;
    private String mIngredients;
    private String mDescription;

    public Upload(){
        //empty constructor needed
    }

    public Upload(String name, String imageUrl, String ingredients, String description) {
        if (name.trim().equals("")) {
            name = "No Name";
            ingredients = "No Ingredients";
            description = "No Description";
        }

        mName = name;
        mImageUrl = imageUrl;
        mIngredients = ingredients;
        mDescription = description;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public String getIngredients() {
        return mIngredients;
    }

    public void setIngredients(String ingredients) {
        mIngredients = ingredients;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }
}
