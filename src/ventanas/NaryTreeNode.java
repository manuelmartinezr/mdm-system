/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author manuel
 */
public class NaryTreeNode {
    
    private String data;
    
    private ArrayList<NaryTreeNode> children;
    
    public NaryTreeNode(String data) {
        this.data = data;
        children = new ArrayList<>();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<NaryTreeNode> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<NaryTreeNode> children) {
        this.children = children;
    }

    public void addChild(NaryTreeNode child) {
        children.add(child);
    }
}
