package diplomaapi.dto;

import diplomaapi.model.Sexo;
import diplomaapi.model.TipoCurso;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class DiplomaRequest {
    @NotBlank(message = "O nome do diplomado é obrigatório")
    private String nomeDiplomado;

    @NotBlank(message = "A nacionalidade é obrigatória")
    private String nacionalidade;

    @NotBlank(message = "A naturalidade é obrigatória")
    private String naturalidade;

    @NotBlank(message = "O RG é obrigatório")
    private String rg;

    @NotBlank(message = "O nome do curso é obrigatório")
    private String nomeCurso;

    @NotNull(message = "O tipo do curso é obrigatório")
    private TipoCurso tipoCurso;

    @NotNull(message = "A data de conclusão é obrigatória")
    private LocalDate dataConclusao;

    @NotBlank(message = "O nome do reitor é obrigatório")
    private String nomeReitor;

    @NotNull(message = "O sexo do reitor é obrigatório")
    private Sexo sexoReitor;

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

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public String getNomeReitor() {
        return nomeReitor;
    }

    public void setNomeReitor(String nomeReitor) {
        this.nomeReitor = nomeReitor;
    }

    public Sexo getSexoReitor() {
        return sexoReitor;
    }

    public void setSexoReitor(Sexo sexoReitor) {
        this.sexoReitor = sexoReitor;
    }
}