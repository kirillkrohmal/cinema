package ru.job4j.model;


public class Halls {
    private int id;
    private String rows;
    private String columns;

    public Halls() {
    }

    public Halls(int id, String rows, String columns) {
        this.id = id;
        this.rows = rows;
        this.columns = columns;
    }

    public Halls(String rows, String columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRows() {
        return rows;
    }

    public void setRows(String rows) {
        this.rows = rows;
    }

    public String getColumns() {
        return columns;
    }

    public void setColumns(String columns) {
        this.columns = columns;
    }
}
