package pers.tunan.web;
/**
 * @author Tunan
 * @version 1.0
 */

import pers.tunan.pojo.Brand;
import pers.tunan.service.BrandService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllServlet")
public class SelectAllServlet extends HttpServlet {
    private BrandService service = new BrandService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.调用BrandService完成查询
        //BrandService service = new BrandService();
        List<Brand> brands = service.selectAll();
        //2.存入req域中
        request.setAttribute("brands",brands);
        //3.转发到brand.jsp中
        request.getRequestDispatcher("/brand.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
