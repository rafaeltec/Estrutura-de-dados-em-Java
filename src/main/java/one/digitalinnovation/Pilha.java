package one.digitalinnovation;

public class Pilha {
    private  No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;

    }
    public  void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refNoEntradaPilha);
    }
    public No pop(){
        if(this.isEmpty()){
            No noPoped =refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return  noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha = null;
    }

    public boolean isEmpty(){
             if(refNoEntradaPilha == null){
                  return true;
             }
                  return false;

           //  return refNoEntradaPilha == null ? true : false;
            }

}