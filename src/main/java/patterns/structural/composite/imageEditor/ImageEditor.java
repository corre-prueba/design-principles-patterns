package patterns.structural.composite.imageEditor;

import java.util.ArrayList;

public class ImageEditor
{
    private CompoundGraphic all;

    public void load() {
        all = new CompoundGraphic();
        all.add(new Dot(1, 2));
        all.add(new Circle(5, 3, 10));
        all.add(new Circle(13, 7, 9));
        all.add(new Dot(16, 8));
    }

    public void groupSelected(ArrayList<Graphic> components) {
        CompoundGraphic group = new CompoundGraphic();

        for (Graphic child: components) {
            group.add(child);
            all.remove(child);
        }

        all.add(group);
        all.draw();
    }

    public static void main(String[] args) {
        ArrayList<Graphic> components = new ArrayList<>();
        components.add(new Dot(4, 8));
        components.add(new Circle(13, 27, 6));
        components.add(new Circle(33, 23, 11));
        components.add(new Dot(43, 56));

        ImageEditor imageEditor = new ImageEditor();
        imageEditor.load();
        imageEditor.groupSelected(components);
    }
}
