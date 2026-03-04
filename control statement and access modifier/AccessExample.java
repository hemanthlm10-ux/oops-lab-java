class AccessExample {

    public int a = 10;       
    private int b = 20;      
    protected int c = 30;    
    int d = 40;              

    public void showPublic() {
        System.out.println("Public method");
    }

    private void showPrivate() {
        System.out.println("Private method");
    }

    protected void showProtected() {
        System.out.println("Protected method");
    }

    void showDefault() {
        System.out.println("Default method");
    }

    public void accessPrivate() {
        // private members can be accessed inside the same class
        System.out.println("Private variable b = " + b);
        showPrivate();
    }
}