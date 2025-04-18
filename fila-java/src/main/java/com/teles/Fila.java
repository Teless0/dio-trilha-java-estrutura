package com.teles;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T object){
        No<T>  novNo = new No<> (object);
        novNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novNo;
    }

    @SuppressWarnings("unchecked")
    public T first(){
        if (!this.isEmpty()) {
            No<T>  primeirNo = refNoEntradaFila;
            while (true) {
                if(primeirNo.getRefNo() != null) {
                    primeirNo = primeirNo.getRefNo();
                }else{
                    break;
                }
            }
            return (T) primeirNo.getObject(); 

        }
        return null;
    }


    @SuppressWarnings("unchecked")
    public T dequeue(){
        if (!this.isEmpty()) {
            No<T> primeirNo = refNoEntradaFila;
            No<T> noAuxiliar = refNoEntradaFila;
            while (true) {
                if(primeirNo.getRefNo() != null) {
                    noAuxiliar = primeirNo;
                    primeirNo = primeirNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeirNo.getObject(); 
        }
        return null;
    }


    public boolean isEmpty(){
        return refNoEntradaFila == null? true : false; 
    }

    @Override
    public String toString() {
        String stringRetorno = "";

        No<T> noAuxiliar = refNoEntradaFila;
        
        if(refNoEntradaFila != null) {

            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]------>";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();

                }else{
                    stringRetorno += "null";
                    break;

                }
            }

        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
    

    
}
