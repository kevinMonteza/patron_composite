/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Componente;
import modelo.Edificada;
import modelo.Empotrada;
import modelo.Habitacion;
import modelo.Instalacion;
import modelo.Mesa;
import modelo.Mobiliario;
import modelo.Mueble;
import modelo.Pared;
import modelo.Silla;
import modelo.Techo;
import modelo.Television;

/**
 *
 * @author LABO08
 */
public class Controlador extends HttpServlet {

    Habitacion habitacion;
    Instalacion instalacion;
    Mobiliario mobiliario;
    Edificada edificada;
    Empotrada empotrada;
    Componente comp;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        habitacion = new Habitacion("Habitacion");
        String lista = "";
        String servicio = request.getParameter("servicio");
        String Tinstalacions = request.getParameter("Tinstalacion");
        String edi = request.getParameter("Tedificada");
        String mob = request.getParameter("mobiliario");

        if (servicio.equals("Instalacion")) {
            instalacion = new Instalacion("Intalar: ");
            if (Tinstalacions.equals("edificada")) {
                edificada = new Edificada("Instalacion Edificada");
                if (edi.equals("techo")) {
                    comp = new Techo();
                } else {
                    comp = new Pared();
                }
                edificada.add(comp);
                instalacion.add(edificada);
            } else {
                empotrada = new Empotrada();
                instalacion.add(empotrada);
            }
            habitacion.add(instalacion);
            lista = habitacion.getDescripcion();

        } else {
            if (mob != null) {
                mobiliario = new Mobiliario("Mobiliario");
                mobiliario.add(getTipo(mob));
                habitacion.add(mobiliario);
                lista = habitacion.getDescripcion();
            }

        }
        request.setAttribute("lista", lista);
        RequestDispatcher disp = request.getRequestDispatcher("Mostrar.jsp");
        disp.forward(request, response);

        System.out.println(servicio + Tinstalacions + edi + mob);
        System.out.println(lista);

    }

    private Componente getTipo(String tipo) {
        Componente compo = null;
        switch (tipo) {
            case "silla":
                compo = new Silla();
                break;
            case "mesa":
                compo = new Mesa();
                break;
            case "tele":
                compo = new Television();
                break;
            case "mueble":
                compo = new Mueble();
                break;
        }
        return compo;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
