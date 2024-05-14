package br.com.evertonsantos.transactionreport.domain;


import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CnabService {
    private final Path fileStorogeLocation;

    public CnabService(@Value("${file.upload-dir}") String fileUploadDir) {
        this.fileStorogeLocation = Paths.get(fileUploadDir);
    }

    public void uploadCnabFile(MultipartFile file) throws Exception {
        var fileName = StringUtils.cleanPath(file.getOriginalFilename());
        var targetLocation = fileStorogeLocation.resolve(fileName);
        file.transferTo(targetLocation);
    }

}
