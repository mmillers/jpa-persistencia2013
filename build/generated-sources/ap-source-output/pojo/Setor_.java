package pojo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pojo.Equipamento;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-09-05T17:05:22")
@StaticMetamodel(Setor.class)
public class Setor_ { 

    public static volatile SingularAttribute<Setor, String> ramal;
    public static volatile ListAttribute<Setor, Equipamento> equipamentoList;
    public static volatile SingularAttribute<Setor, Integer> idsetor;
    public static volatile SingularAttribute<Setor, String> descricao;

}