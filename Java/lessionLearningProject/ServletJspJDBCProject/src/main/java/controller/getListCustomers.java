package controller;

import model.CustomerModel;
import querysource.CustomersService;
import javax.servlet.annotation.WebServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;


public class getListCustomers extends HttpServlet {
    //    private static final Logger LOGGER = Logger.getLogger(getListCustomers.class.getSimpleName());
    private CustomersService customersService;


//    @Override
//    public void init(ServletConfig config) throws ServletException {
//        super.init(config);
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<CustomerModel> listCustomers = customersService.listCustomers();
        req.setAttribute("viewListCustomer", listCustomers);

        String task = req.getRequestURI().substring(req.getContextPath().length());
        if ("/home".equals(task)) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("view/servletTag.jsp");
            dispatcher.forward(req, resp);

//        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/view/_viewlistcustomer.jsp" );
//        requestDispatcher.forward(req, resp);
//        LOGGER.info(String.format("Method: %s; Servlet Path: %s; Num of Customer: %d"
//                , req.getMethod(), req.getServletPath(), list.size()));


        }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        this.doPost(req, resp);
//    }
    }
}
