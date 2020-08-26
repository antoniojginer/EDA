package librerias.estructurasDeDatos.lineales;
import librerias.estructurasDeDatos.modelos.ListaConPI;

/**
 * Write a description of class LEGListaConPIOrdenada here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LEGListaConPIOrdenada<E extends Comparable> 
extends LEGListaConPI<E>
implements ListaConPI<E> 
{
    // Metodos Modificadores del estado de una Lista
    /** Inserta e en una Lista antes del Elemento que ocupa su PI, 
     *  que permanece inalterado */
    @Override
    public void insertar(E e){
        while(e.compareTo(this.recuperar())>0 && !this.esFin()){
            this.siguiente();
        }
        
        if(this.esFin()){
            super.insertar(e);            
        } else{
            this.siguiente();
            this.insertar(e);
        }
        
        talla++;
    }
    
    
   
   
}
