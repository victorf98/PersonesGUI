/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.boscdelacoma.model.business.entities;

import cat.boscdelacoma.model.business.utilities.NumberUtils;

/**
 *
 * @author Victo
 */
public abstract class Entity {
    private long id;
    
    public Entity(){
        id = NumberUtils.UNSAVED_VALUE;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if(getId() != NumberUtils.UNSAVED_VALUE){
            throw new UnsupportedOperationException("id cannot be changed");
        }
        
        if(id <= NumberUtils.ZERO){
            throw new IllegalArgumentException("id cannot be negative or zero");
        }
        this.id = id;
    }
}
