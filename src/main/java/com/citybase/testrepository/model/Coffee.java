package com.citybase.testrepository.model;

public class Coffee {

    private boolean cream;
    private boolean sugar;
    private Size size;

    private Coffee(Coffee.Builder builder){
        this.cream = builder.cream;
        this.sugar = builder.sugar;
        this.size = builder.size;
    }


    public static class Builder {

        private boolean cream;
        private boolean sugar;
        private Size size;

        public Coffee.Builder cream(boolean cream){
            this.cream = cream;
            return this;
        }

        public Coffee.Builder sugar(boolean sugar){
            this.sugar = sugar;
            return this;
        }

        public Coffee.Builder size(Size size){
            this.size = size;
            return this;
        }

        public Coffee build(){
            return new Coffee(this);
        }
    }

    @Override
    public String toString() {
        return "Coffee{" + "cream=" + cream + ", sugar=" + sugar +
                ", size=" + size + '}';
    }

    public enum Size{
        SMALL,
        GRANDE,
        VENTI
    }
}
