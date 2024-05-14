package br.com.evertonsantos.transactionreport.web;

import br.com.evertonsantos.transactionreport.domain.CnabService;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("cnab")
public class CnabController {
    private final CnabService service;

    public CnabController(CnabService service) {
        this.service = service;
    }

    @PostMapping("upload")
    public String upload(@RequestParam("file") MultipartFile file) throws Exception {
        service.uploadCnabFile(file);
        return "Processamento iniciado";
    }

}
