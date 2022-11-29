package org.xmexg.OneOffWord;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.xmexg.OneOffWord.handle.Getword_Servlet;
import org.xmexg.OneOffWord.handle.Upword_Servlet;

import java.io.IOException;


/**
 * 处理请求
 * 只是一个转发器
 */
@Controller
public class MapController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/index")
    public String index2() {
        return "index";
    }

//    转发到Upword_Servlet
    @RequestMapping(value = "/updata", method = RequestMethod.POST)
    public void updata(HttpServletRequest request, HttpServletResponse response) throws IOException {
        new Upword_Servlet().doPost(request, response);
    }
    @RequestMapping(value = "/updata", method = RequestMethod.GET)
    public void updata2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        new Upword_Servlet().doGet(request, response);
    }

//    转发到Getword_Servlet
    @RequestMapping(value = "/getdata", method = RequestMethod.POST)
    public void getdata(HttpServletRequest request, HttpServletResponse response) throws IOException {
        new Getword_Servlet().doPost(request, response);
    }
    @RequestMapping(value = "/getdata", method = RequestMethod.GET)
    public void getdata2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        new Getword_Servlet().doGet(request, response);
    }


}
