import org.jetbrains.annotations.NotNull;

import javax.servlet.http.HttpServletRequest;

public class Timezone {
    public String parseTimeZone(@NotNull HttpServletRequest request) {
        if (request.getParameterMap().containsKey("timezone")) {
            return (request.getParameter("timezone").replace(" ", "+").length() < 1) ?
                    "UTC" : request.getParameter("timezone").replace(" ", "+").toUpperCase();
        }
        return "UTC";
    }
}