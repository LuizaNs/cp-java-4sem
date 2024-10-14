package diplomaapi.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "tb_diploma")
public class Diploma {
    @Id
    private UUID id = UUID.randomUUID();

    @ManyToOne
    private Diplomado diplomado;

    @ManyToOne
    private Curso curso;

    @Column(name = "data_conclusao")
    private LocalDate dataConclusao;

    @Column(name = "sexo_reitor")
    @Enumerated(EnumType.STRING)
    private Sexo sexoReitor;

    @Column(name = "nome_reitor")
    private String nomeReitor;

    public UUID getId() {
        return id;
    }

    public Diplomado getDiplomado() {
        return diplomado;
    }

    public void setDiplomado(Diplomado diplomado) {
        this.diplomado = diplomado;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Sexo getSexoReitor() {
        return sexoReitor;
    }

    public void setSexoReitor(Sexo sexoReitor) {
        this.sexoReitor = sexoReitor;
    }

    public String getNomeReitor() {
        return nomeReitor;
    }

    public void setNomeReitor(String nomeReitor) {
        this.nomeReitor = nomeReitor;
    }

    public void setNacionalidade(String nacionalidade) {
    }

    public String getNomeDiplomado() {
        return "";
    }

    public String getNacionalidade() {
        return "";
    }

    public String getNaturalidade() {
        return "";
    }

    public String getRg() {
        return "";
    }

    public String getNomeCurso() {
        return "";
    }

    public TipoCurso getTipoCurso() {
        return null;
    }

    public void setNomeDiplomado(String nomeDiplomado) {
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
    }

    public void setNaturalidade(String naturalidade) {
    }

    public void setRg(String rg) {
    }

    public void setNomeCurso(String nomeCurso) {
    }
}