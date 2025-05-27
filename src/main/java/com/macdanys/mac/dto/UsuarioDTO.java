package com.macdanys.mac.dto;

import com.macdanys.mac.entitys.TipoDeUsuario;

public class UsuarioDTO {
    private Integer idUsuario;
    private String nombreDeUsuario;
    private String password;
    private TipoDeUsuario tipoDeUsuario;

     public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TipoDeUsuario getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombreDeUsuario='" + nombreDeUsuario + '\'' +
                ", password='" + password + '\'' +
                ", tipoDeUsuario=" + tipoDeUsuario +
                '}';
    }

}
