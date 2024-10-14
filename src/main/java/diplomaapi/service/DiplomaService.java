package diplomaapi.service;

import diplomaapi.dto.DiplomaRequest;
import diplomaapi.dto.DiplomaResponse;
import diplomaapi.model.Diploma;
import org.springframework.stereotype.Service;

@Service
public class DiplomaService {

    public Diploma requestToDiploma(DiplomaRequest diplomaRequest) {
        Diploma diploma = new Diploma();
        diploma.setNomeDiplomado(diplomaRequest.getNomeDiplomado());
        diploma.setNacionalidade(diplomaRequest.getNacionalidade());
        diploma.setNaturalidade(diplomaRequest.getNaturalidade());
        diploma.setRg(diplomaRequest.getRg());
        diploma.setNomeCurso(diplomaRequest.getNomeCurso());
        diploma.setTipoCurso(diplomaRequest.getTipoCurso());
        diploma.setDataConclusao(diplomaRequest.getDataConclusao());
        diploma.setNomeReitor(diplomaRequest.getNomeReitor());
        diploma.setSexoReitor(diplomaRequest.getSexoReitor());
        return diploma;
    }

    public DiplomaResponse diplomaToResponse(Diploma diploma) {
        DiplomaResponse diplomaResponse = new DiplomaResponse();
        diplomaResponse.setId(diploma.getId().toString()); // Converter UUID para String
        diplomaResponse.setNomeDiplomado(diploma.getNomeDiplomado());
        diplomaResponse.setNacionalidade(diploma.getNacionalidade());
        diplomaResponse.setNaturalidade(diploma.getNaturalidade());
        diplomaResponse.setRg(diploma.getRg());
        diplomaResponse.setNomeCurso(diploma.getNomeCurso());
        diplomaResponse.setTipoCurso(diploma.getTipoCurso().name()); // Obter nome do Enum
        diplomaResponse.setDataConclusao(diploma.getDataConclusao());
        diplomaResponse.setNomeReitor(diploma.getNomeReitor());
        diplomaResponse.setSexoReitor(diploma.getSexoReitor());
        return diplomaResponse;
    }

    public DiplomaRequest diplomaToRequest(Diploma diploma) {
        DiplomaRequest diplomaRequest = new DiplomaRequest();
        diplomaRequest.setNomeDiplomado(diploma.getNomeDiplomado());
        diplomaRequest.setNacionalidade(diploma.getNacionalidade());
        diplomaRequest.setNaturalidade(diploma.getNaturalidade());
        diplomaRequest.setRg(diploma.getRg());
        diplomaRequest.setNomeCurso(diploma.getNomeCurso());
        diplomaRequest.setTipoCurso(diploma.getTipoCurso());
        diplomaRequest.setDataConclusao(diploma.getDataConclusao());
        diplomaRequest.setNomeReitor(diploma.getNomeReitor());
        diplomaRequest.setSexoReitor(diploma.getSexoReitor());
        return diplomaRequest;
    }
}
