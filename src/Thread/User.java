package Thread;

class User {
    private String password;
    private String userName;
    private Data data;

    public User() {
        this.data=new Data();

    }

    public boolean register(String password, String userName) {
        data.map.put(userName, password);
        return true;
    }

    public boolean login(String password, String userName) {
        if (data.map.get(userName).equals(password)) {
            return true;
        } else {
            return false;
        }

    }
}
