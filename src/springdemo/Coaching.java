/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

/**
 *
 * @author MRuser
 */
public class Coaching {
    
    private String name;
    private Faculty faculty;
    
    private Room room;
    
    public Coaching() {}
    
    public Coaching(Room room) {
        this.room = room;
    }
    
    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void coach() {
        System.out.println(this.getName() + 
                " is having faculty as " + faculty.getName() + 
                " who is teaching right now having room filled with capacity of!"+
                room.getCapacity());
    }
            
}
