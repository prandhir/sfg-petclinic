package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;

/**
 * Created by jt on 7/29/18.
 */
/*@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialties")*/
public class Speciality extends BaseEntity {

    @Column(name = "description")
    private String description;

}
