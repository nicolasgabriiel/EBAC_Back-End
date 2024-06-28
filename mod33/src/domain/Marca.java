package domain;


    @Entity
    @Table(name = "TB_MARCA")
    public class Marca {

        @Id
        @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="marca_seq")
        @SequenceGenerator(name="marca_seq", sequenceName="sq_marca", initialValue = 1, allocationSize = 1)
        private Long id;

        @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
        private String codigo;

        @Column(name = "NOME", length = 30, nullable = false)
        private String nome;

        @OneToOne
        @JoinColumn(name = "id_carro_fk",
                foreignKey = @ForeignKey(name = "fk_carro_marca"),
                referencedColumnName = "id", nullable = false
        )
        private Carro carro;
}

