package org.example.entities;

public class LongestProject {
    private String project_name;
    private int count_mounth;

    public LongestProject(String project_name, int count_count_mounth) {
        this.project_name = project_name;
        this.count_mounth = count_count_mounth;
    }

    @Override
    public String toString() {
        return "LongestProject{" +
                "project_name='" + project_name + '\'' +
                ", count_mounth=" + count_mounth +
                '}';
    }
}
