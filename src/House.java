public class House implements Enterable {

    private Human human;

    public House() {

    }

    public void enter(Human human) {
        this.human = human;
    }

    public Human leave() {
        Human human = this.human;
        this.human = null;

        return human;
    }

    public boolean hasHumanInside() {
        return this.human != null;
    }
}
