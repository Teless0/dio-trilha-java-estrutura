package com.teles;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novNo = new No<>(conteudo);
        if (this.isEmpty()) {
            referenciaEntrada = novNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size()-1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novNo);
    }
    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remomve(int index){
        No<T> noPivor = this.getNo(index);
        if (index ==0) {
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo( index -1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }
    public int size(){
        int tamanhoLista = 0;

        No<T> referenciaAux = referenciaEntrada;

        while (true) {
            if (referenciaAux != null){
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();

                }else{
                    break;
                }
            }else{
                break;
            }
        }
    
        return tamanhoLista;
    }

    private void validaIndice(int index){

        int tamanho = size();

        if (index >= tamanho) {
            int ultimoIndece = size() -1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no indice " + index + " desta lista. Essa lista só vai até o indice " + ultimoIndece + '.' );
            
        }
    }

    public boolean isEmpty(){
      return referenciaEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "No [conteudo=" + noAuxiliar.getConteudo() + "]----->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";

        return strRetorno;
    }
    
    

}
