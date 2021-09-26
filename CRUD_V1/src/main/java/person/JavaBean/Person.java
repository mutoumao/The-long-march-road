package person.JavaBean;

public class Person {
        private int ID;
        private String name;
        private String sex;
        private String adress;


        public Person(){

        }

    public Person(int ID, String name, String sex, String adress) {
            this.ID = ID;
            this.name = name;
            this.sex = sex;
            this.adress = adress;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }
    }

