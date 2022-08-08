class Tv {
    int volume = 0, canal = 1;
    boolean mostrarStatus;
    boolean ligado=false, aumentarVolume=false, diminuirVolume=false, ligarTv=false, desligarTv=false, subirCanal=false, descerCanal=false;
    //retorna volume
    public int getVolume(){
        return volume;
    }
    //retorna canal
    public int getCanal(){
        return canal;
    }
    //retorna ligado
    public boolean isLigado(){
        return ligado;
    }
    //retorna o ligarTv
    public boolean isLigarTv(){
        return ligarTv;
    }
    //retorna o desligarTv
    public boolean isDesligarTv(){
        return desligarTv;
    }
    //retorna o aumentar volume
    public boolean isAumentarVolume(){
        return aumentarVolume;
    }
    //retorna o diminuir volume
    public boolean isDiminuirVolume(){
        return diminuirVolume;
    }
    //retorna o subir canal
    public boolean isSubirCanal(){
        return subirCanal;
    }
    //retorna descer canal
    public boolean isDescerCanal(){
        return descerCanal;
    }
    //retorna mostrar status
    public boolean isMostrarStatus(){
        return mostrarStatus;
    }
    //set do volume
    public void setVolume (int novoVolume){
        volume = novoVolume;
    }
    //set do canal
    public void setCanal (int novoCanal){
        volume = novoCanal;
    }
    //ferramenta para conferir se a televisão está ligada ou desligada
    public void setLigado (boolean ligado){
        this.ligado = ligado;
    }
    //feramenta para ligar a televisão
    public void setLigarTv (boolean ligarTv){
        this.ligarTv = ligarTv;
        if (isLigado()) {
            System.out.println("TV já está ligada!");
        }else{
            setLigado(true);
            System.out.println("Você ligou a TV, pode utilizá-la! ");
        }
    }
    //ferramenta para desligar a televisão
    public void setDesligarTv(boolean desligarTv){
        this.desligarTv = desligarTv;
        ligado = false;
        System.out.println("Você parou no volume "+volume+".");
        System.out.println("Você parou no canal "+canal+".");
        if(ligado==true){
            System.out.println("A televisão está ligada");
        }else{
            System.out.println("A televisão está desligada");
        }
    }
    //ferramenta para aumentar o volume
    public void setAumentarVolume (boolean aumentarVolume){
        this.aumentarVolume = aumentarVolume;
        if (volume<10){
            volume++;
            System.out.println("Volume aumentado. Você está no volume "+volume+".");
        }else{
            System.out.println("O volume já está no máximo.");
        }
    }
    //ferramenta para diminuir o volume
    public void setDiminuirVolume (boolean diminuirVolume){
        this.diminuirVolume = diminuirVolume;
        if (volume>0){
            volume--;
            System.out.println("Volume foi diminuído. Você está no volume "+volume+";");
        }else{
            System.out.println("O volume já está no mudo, não é possível diminuí-lo mais.");
        }
    }
    //ferramenta para subir o canal
    public void setSubirCanal (boolean subirCanal){
        this.subirCanal = subirCanal;
        if(canal<16){
            canal++;
            System.out.println("Você passou para o próximo canal. Atualmente você está no canal "+canal);
        }else{
            System.out.println("Você já está no canal "+canal+". Não é possível avançar mais canais, se quiser voltar a outro canal basta descre o canal.");
        }
    }
    //ferramenta para descer o canal 
    public void setDescerCanal (boolean descerCanal){
        this.descerCanal = descerCanal;
        if(canal>1){
            canal--;
            System.out.println("Você voltou um canal. Atualmente você está no canal "+canal);
        }else{
            System.out.println("Você já está no canal "+canal+". Não é possível retornar mais canais. Se quiser mudar para outros canais, suba o canal.");
        }
    }
    //ferramenta para mostrar Status da TV     
    public String retornStatus(){
        return "Canal: "+canal+";\n Volume: " + volume + "\n Ligada. ";
    }
}