package br.com.voll.med.domain.consult;

import java.time.LocalDateTime;

/**
 * Use only the IDs of other Domain classes.
 * This way you avoid unnecessary coupling and limit the context of this class.
 * In the future, this Consult class may be a separate service and will not have direct
 * coupling with other classes (in this example, coupling with Doctor and Patient).
 */
public class Consult {
    private String crmDoctor;
    private String ppsPatient;
    private LocalDateTime dateAndHours;
    private ConsultStatus consultStatus;
}
