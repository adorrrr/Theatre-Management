/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

import java.io.Serializable;



public class Script implements Serializable{
    String writer;
    String showsName;
    String script;

    public Script(String writer, String showsName, String script) {
        this.writer = writer;
        this.showsName = showsName;
        this.script = script;
    }

    public String getWriter() {
        return writer;
    }

    public String getShowsName() {
        return showsName;
    }

    public String getScript() {
        return script;
    }
    
}
