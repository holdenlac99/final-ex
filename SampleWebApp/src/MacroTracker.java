@WebServlet("/SaveDataServlet")
public class SaveDataServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        handlePostRequest(request, response);
    }

    private void handlePostRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        String foodName = request.getParameter("foodName");

        try {
            int calories = Integer.parseInt(request.getParameter("calories"));
            int protein = Integer.parseInt(request.getParameter("protein"));
            int carbs = Integer.parseInt(request.getParameter("carbs"));
            int amount = Integer.parseInt(request.getParameter("amount"));

            response.getWriter().println("Data received: " + foodName + ", Calories: " + calories +
                    ", Protein: " + protein + ", Carbs: " + carbs + ", Amount: " + amount);
        } catch (NumberFormatException e) {
            response.getWriter().println("Invalid input for calories, protein, carbs, or amount.");
        }
    }
}
