@WebServlet("/MacroTracker")
public class MacroTracker extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        handlePostRequest(request, response);
    }

    private void handlePostRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String nameOfFood = request.getParameter("nameOfFood");

        try {
            int cal = Integer.parseInt(request.getParameter("cal"));
            int protein = Integer.parseInt(request.getParameter("protein"));
            int carbs = Integer.parseInt(request.getParameter("carbs"));
            int amount = Integer.parseInt(request.getParameter("amount"));

            response.getWriter().println("Data received: " + nameOfFood + ", Calories: " + cal +
                    ", Protein: " + protein + ", Carbs: " + carbs + ", Amount: " + amount);
        } catch (NumberFormatException e) {
            response.getWriter().println("Invalid input for calories, protein, carbs, or amount.");
        }
    }
}

