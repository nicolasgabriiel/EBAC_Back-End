package domain;
import javax.persistence.EntityManager;

@Entity
@Table(name = "TB_ACESSORIO")
public class Acessorio {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ACESS_seq")
    @SequenceGenerator(name="ACESS_seq", sequenceName="sq_acessorio", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "NOME", length = 30, nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_carro_fk",
            foreignKey = @ForeignKey(name = "fk_carro_acessorio"),
            referencedColumnName = "id", nullable = false
    )
    private Carro carro;
}
