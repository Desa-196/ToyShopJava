public class Toy {
    private int id;
    public int getId(){
        return id;
    }
    private String name;
    public String getName(){
        return name;
    }
    private int weight;
    public int getWeight(){
        return weight;
    }

    Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }
    @Override
        public boolean equals(Object obj) {
            if (obj == null || obj.getClass() != this.getClass()) {
                return false;
            }
            final Toy toy = (Toy) obj;
            return toy.name == name && toy.id == id;
        }
}
