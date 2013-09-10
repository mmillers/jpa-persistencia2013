package pojo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pojo.Equipamento;
import pojo.Ocorrencia;
import pojo.TipoAtendimento;
import pojo.Usuario;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-09-05T17:05:22")
@StaticMetamodel(Chamado.class)
public class Chamado_ { 

    public static volatile SingularAttribute<Chamado, Usuario> idUsuario;
    public static volatile SingularAttribute<Chamado, String> inicio;
    public static volatile ListAttribute<Chamado, Equipamento> equipamentoList;
    public static volatile ListAttribute<Chamado, Ocorrencia> ocorrenciaList;
    public static volatile SingularAttribute<Chamado, String> status;
    public static volatile SingularAttribute<Chamado, Integer> idchamado;
    public static volatile SingularAttribute<Chamado, TipoAtendimento> idTipoAtendimento;
    public static volatile SingularAttribute<Chamado, String> fim;
    public static volatile SingularAttribute<Chamado, String> descricao;
    public static volatile SingularAttribute<Chamado, String> observacao;

}