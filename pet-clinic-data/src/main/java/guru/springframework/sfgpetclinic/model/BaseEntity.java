package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by jt on 7/18/18.
 */
/*@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass*/
public class BaseEntity implements Serializable {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public boolean isNew() {
        return this.id == null;
    }
}
