package generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * staff
 * @author 
 */
@Data
public class Staff implements Serializable {
    private Byte staffId;

    private String firstName;

    private String lastName;

    private Short addressId;

    private String email;

    private Byte storeId;

    private Boolean active;

    private String username;

    private String password;

    private Date lastUpdate;

    private byte[] picture;

    private static final long serialVersionUID = 1L;
}