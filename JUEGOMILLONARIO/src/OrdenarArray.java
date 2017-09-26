
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AYALA
 */
public class OrdenarArray implements Comparator<Preguntas>{

    @Override
    public int compare(Preguntas o1, Preguntas o2) {
        if(o1.getNivel()!=o2.getNivel()){
            return o1.getNivel()-o2.getNivel();
        }else {
            return o1.getPregunta().compareTo(o2.getPregunta());
        }
    }
    
}
