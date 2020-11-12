package com.ahead.school.action;

import com.ahead.school.entity.StudentScoreExcelEntity;
import com.ahead.school.servlet.ScoreServlet;
import com.ahead.school.util.FileExcelUtil;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/score")
public class ScoreAction {

    @Autowired
    private ScoreServlet scoreServlet;

    @GetMapping("/list")
    public String showScoreList(){
        return "scorelist";
    }

    @GetMapping("/a")
    public String getList(){
        return "a";
    }
    @PostMapping("/fileUpload")
    //@ResponseBody
    public String test(@RequestParam("scoreExcel") MultipartFile file){
        if(file.isEmpty()){
            return "上传的是空文件，请重新上传";
        }
        scoreServlet.saveScore(FileExcelUtil.scoreManage(file));
        return "a";
    }
}
