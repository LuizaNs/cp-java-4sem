package diplomaapi.controller;

import diplomaapi.model.Diploma;
import diplomaapi.model.Sexo;
import diplomaapi.repository.DiplomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diplomas")
public class DiplomaController {

    @Autowired
    private DiplomaRepository diplomaRepository;

    @GetMapping
    public ResponseEntity<String> getDiplomas() {
        List<Diploma> diplomas = diplomaRepository.findAll();

        StringBuilder responseText = new StringBuilder();
        for (Diploma diploma : diplomas) {
            String tituloReitor = (diploma.getSexoReitor() == Sexo.M ? "Prof. Dr. " : "Profa. Dra. ") + diploma.getNomeReitor();
            String cargoReitor = (diploma.getSexoReitor() == Sexo.M ? "reitor" : "reitora");
            String tipoCurso = diploma.getCurso().getTipo().name();
            String nomeDiplomado = diploma.getDiplomado().getNome();
            String nacionalidade = diploma.getDiplomado().getNacionalidade();
            String naturalidade = diploma.getDiplomado().getNaturalidade();
            String rg = diploma.getDiplomado().getRg();
            String dataConclusao = diploma.getDataConclusao().toString(); // Pode formatar como desejar

            String diplomaText = String.format(
                    "%s, %s da Universidade Fake, no uso de suas atribuições, confere a %s, de nacionalidade %s, natural de %s, portador do rg %s, o presente diploma de %s, do curso de %s, por ter concluído seus estudos nesta instituição de ensino no dia %s.",
                    tituloReitor, cargoReitor, nomeDiplomado, nacionalidade, naturalidade, rg, tipoCurso, diploma.getCurso().getNome(), dataConclusao
            );

            responseText.append(diplomaText).append("\n\n");
        }

        return ResponseEntity.ok(responseText.toString());
    }
}
