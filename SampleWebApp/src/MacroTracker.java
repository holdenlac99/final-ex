
@WebServlet("/MacroTracker")
public class MacroTracker extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);


        String nameOfFood = request.getParameter("nameOfFood");
        int cal = Integer.parseInt(request.getParameter("cal"));
        int protein = Integer.parseInt(request.getParameter("protein"));
        int amount = Integer.parseInt(request.getParameter("amount"));


        response.getWriter().println("Data received: " + nameOfFood + ", Calories: " + cal +
                ", Protein: " + protein + ", amount: " + amount);
    }
}
