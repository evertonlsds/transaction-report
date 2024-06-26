package br.com.evertonsantos.transactionreport.web;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import br.com.evertonsantos.transactionreport.service.CnabService;



@RestController
@RequestMapping("cnab")
public class CnabController {
    private final CnabService service;

    public CnabController(CnabService service) {
        this.service = service;
    }
    @CrossOrigin(origins = {"http://localhost:9090"})
    @PostMapping("upload")
    public String upload(@RequestParam("file") MultipartFile file) throws Exception {
        service.uploadCnabFile(file);
        return "Processamento iniciado";
    }

}
