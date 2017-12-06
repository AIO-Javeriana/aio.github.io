/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sensors;

/**
 *
 * @author rmunoz
 */
public class BodyGestures {
    
    //manos y brazos
    private boolean chasquidos;
    private boolean sacarseLasYucas;
    private boolean frotarManosYEstirarBrazos;
    private boolean tocarMesaConLosDedos;
    private boolean frotarDedos;
    private boolean manoAlMenton;
    private boolean rascarseCabeza;
    private boolean morderUnas;
    private boolean alzarBrazos;
    
    //cara o cabeza
    private boolean subirCeja;
    private boolean voltearOjos;
    private boolean morderLabio;
    private boolean cerrarOjos;
    private boolean despeinarse;
    private boolean voltearCabeza;
    private boolean risaNerviosa;
    private boolean sonrisa;
    private boolean prepocupacionConLaBoca;
    private boolean guinarOjo;
    private boolean ruidoConLaBoca;
    private boolean juntarCuelloConCabeza;

    public BodyGestures() {
    }

    public BodyGestures(boolean chasquidos, boolean sacarseLasYucas, boolean frotarManosYEstirarBrazos, boolean tocarMesaConLosDedos, boolean frotarDedos, boolean manoAlMenton, boolean rascarseCabeza, boolean morderUnas, boolean alzarBrazos, boolean subirCeja, boolean voltearOjos, boolean morderLabio, boolean cerrarOjos, boolean despeinarse, boolean voltearCabeza, boolean risaNerviosa, boolean sonrisa, boolean prepocupacionConLaBoca, boolean guinarOjo, boolean ruidoConLaBoca, boolean juntarCuelloConCabeza) {
        this.chasquidos = chasquidos;
        this.sacarseLasYucas = sacarseLasYucas;
        this.frotarManosYEstirarBrazos = frotarManosYEstirarBrazos;
        this.tocarMesaConLosDedos = tocarMesaConLosDedos;
        this.frotarDedos = frotarDedos;
        this.manoAlMenton = manoAlMenton;
        this.rascarseCabeza = rascarseCabeza;
        this.morderUnas = morderUnas;
        this.alzarBrazos = alzarBrazos;
        this.subirCeja = subirCeja;
        this.voltearOjos = voltearOjos;
        this.morderLabio = morderLabio;
        this.cerrarOjos = cerrarOjos;
        this.despeinarse = despeinarse;
        this.voltearCabeza = voltearCabeza;
        this.risaNerviosa = risaNerviosa;
        this.sonrisa = sonrisa;
        this.prepocupacionConLaBoca = prepocupacionConLaBoca;
        this.guinarOjo = guinarOjo;
        this.ruidoConLaBoca = ruidoConLaBoca;
        this.juntarCuelloConCabeza = juntarCuelloConCabeza;
    }

    public boolean isChasquidos() {
        return chasquidos;
    }

    public void setChasquidos(boolean chasquidos) {
        this.chasquidos = chasquidos;
    }

    public boolean isSacarseLasYucas() {
        return sacarseLasYucas;
    }

    public void setSacarseLasYucas(boolean sacarseLasYucas) {
        this.sacarseLasYucas = sacarseLasYucas;
    }

    public boolean isFrotarManosYEstirarBrazos() {
        return frotarManosYEstirarBrazos;
    }

    public void setFrotarManosYEstirarBrazos(boolean frotarManosYEstirarBrazos) {
        this.frotarManosYEstirarBrazos = frotarManosYEstirarBrazos;
    }

    public boolean isTocarMesaConLosDedos() {
        return tocarMesaConLosDedos;
    }

    public void setTocarMesaConLosDedos(boolean tocarMesaConLosDedos) {
        this.tocarMesaConLosDedos = tocarMesaConLosDedos;
    }

    public boolean isFrotarDedos() {
        return frotarDedos;
    }

    public void setFrotarDedos(boolean frotarDedos) {
        this.frotarDedos = frotarDedos;
    }

    public boolean isManoAlMenton() {
        return manoAlMenton;
    }

    public void setManoAlMenton(boolean manoAlMenton) {
        this.manoAlMenton = manoAlMenton;
    }

    public boolean isRascarseCabeza() {
        return rascarseCabeza;
    }

    public void setRascarseCabeza(boolean rascarseCabeza) {
        this.rascarseCabeza = rascarseCabeza;
    }

    public boolean isMorderUnas() {
        return morderUnas;
    }

    public void setMorderUnas(boolean morderUnas) {
        this.morderUnas = morderUnas;
    }

    public boolean isAlzarBrazos() {
        return alzarBrazos;
    }

    public void setAlzarBrazos(boolean alzarBrazos) {
        this.alzarBrazos = alzarBrazos;
    }

    public boolean isSubirCeja() {
        return subirCeja;
    }

    public void setSubirCeja(boolean subirCeja) {
        this.subirCeja = subirCeja;
    }

    public boolean isVoltearOjos() {
        return voltearOjos;
    }

    public void setVoltearOjos(boolean voltearOjos) {
        this.voltearOjos = voltearOjos;
    }

    public boolean isMorderLabio() {
        return morderLabio;
    }

    public void setMorderLabio(boolean morderLabio) {
        this.morderLabio = morderLabio;
    }

    public boolean isCerrarOjos() {
        return cerrarOjos;
    }

    public void setCerrarOjos(boolean cerrarOjos) {
        this.cerrarOjos = cerrarOjos;
    }

    public boolean isDespeinarse() {
        return despeinarse;
    }

    public void setDespeinarse(boolean despeinarse) {
        this.despeinarse = despeinarse;
    }

    public boolean isVoltearCabeza() {
        return voltearCabeza;
    }

    public void setVoltearCabeza(boolean voltearCabeza) {
        this.voltearCabeza = voltearCabeza;
    }

    public boolean isRisaNerviosa() {
        return risaNerviosa;
    }

    public void setRisaNerviosa(boolean risaNerviosa) {
        this.risaNerviosa = risaNerviosa;
    }

    public boolean isSonrisa() {
        return sonrisa;
    }

    public void setSonrisa(boolean sonrisa) {
        this.sonrisa = sonrisa;
    }

    public boolean isPrepocupacionConLaBoca() {
        return prepocupacionConLaBoca;
    }

    public void setPrepocupacionConLaBoca(boolean prepocupacionConLaBoca) {
        this.prepocupacionConLaBoca = prepocupacionConLaBoca;
    }

    public boolean isGuinarOjo() {
        return guinarOjo;
    }

    public void setGuinarOjo(boolean guinarOjo) {
        this.guinarOjo = guinarOjo;
    }

    public boolean isRuidoConLaBoca() {
        return ruidoConLaBoca;
    }

    public void setRuidoConLaBoca(boolean ruidoConLaBoca) {
        this.ruidoConLaBoca = ruidoConLaBoca;
    }

    public boolean isJuntarCuelloConCabeza() {
        return juntarCuelloConCabeza;
    }

    public void setJuntarCuelloConCabeza(boolean juntarCuelloConCabeza) {
        this.juntarCuelloConCabeza = juntarCuelloConCabeza;
    }
    
    
    
}
