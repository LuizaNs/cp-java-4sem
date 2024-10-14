package diplomaapi.dto;

import diplomaapi.model.Sexo;
import org.springframework.hateoas.Link;

import java.time.LocalDate;

public class DiplomaResponse {
    private String id;
    private String nomeDiplomado;
    private String nacionalidade;
    private String naturalidade;
    private String rg;
    private String nomeCurso;
    private String tipoCurso;
    private LocalDate dataConclusao;
    private String tituloReitor;
    private String cargoReitor;
    private Link link;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeDiplomado() {
        return nomeDiplomado;
    }

    public void setNomeDiplomado(String nomeDiplomado) {
        this.nomeDiplomado = nomeDiplomado;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public String getTituloReitor() {
        return tituloReitor;
    }

    public void setTituloReitor(String tituloReitor) {
        this.tituloReitor = tituloReitor;
    }

    public String getCargoReitor() {
        return cargoReitor;
    }

    public void setCargoReitor(String cargoReitor) {
        this.cargoReitor = cargoReitor;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public void setNomeReitor(String nomeReitor) {
    }

    public void setSexoReitor(Sexo sexoReitor) {
    }
}