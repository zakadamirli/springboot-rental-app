package kodlama.io.rentACar.core.utilities.exceptions;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class ValidationProblemDetails extends ProblemDetails {
    public ValidationProblemDetails() {
        this.validationErrors = new HashMap<>();
    }

    private Map<String, String> validationErrors;
}
