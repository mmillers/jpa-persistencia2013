package pojo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pojo.Chamado;
import pojo.Setor;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-09-05T17:05:22")
@StaticMetamodel(Equipamento.class)
public class Equipamento_ { 

    public static volatile SingularAttribute<Equipamento, String> serie;
    public static volatile SingularAttribute<Equipamento, Integer> idequipamento;
    public static volatile ListAttribute<Equipamento, Chamado> chamadoList;
    public static volatile SingularAttribute<Equipamento, Setor> idSetor;
    public static volatile SingularAttribute<Equipamento, String> descricao;

}