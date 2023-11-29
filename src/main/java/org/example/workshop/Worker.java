package org.example.workshop;
import org.example.workshop.Tool;
import java.util.ArrayList;
import java.util.List;


public class Worker  {
    public void run() {
        Tool tool1 = new Tool("wiertarka");
        tool1.useTool();

        Tool tool2 = new Tool("wkrętarka");

        List<Tool> tools = new ArrayList<>();
        tools.add(tool1);
        tools.add(tool2);

        for (Tool tool : tools) {
            System.out.println("Narzędzie: " + tool.toolType);
        }
    }

    public static void main(String[] args) {
        Worker grzegorz = new Worker();

        grzegorz.run();
    }
}