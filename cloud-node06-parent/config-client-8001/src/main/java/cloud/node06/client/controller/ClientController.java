package cloud.node06.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Value("${info.date}")
    private String date ;
    @Value("${info.author}")
    private String author ;
    @Value("${info.sign}")
    private String sign ;
    @Value("${info.version}")
    private String version ;

    /**
     * 获取配置信息
     */
    @RequestMapping("/getConfigInfo")
    public String getConfigInfo (){
        return date+"-"+author+"-"+sign+"-"+version ;
    }

}
