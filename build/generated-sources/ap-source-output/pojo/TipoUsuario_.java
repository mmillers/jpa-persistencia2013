package pojo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import pojo.Usuario;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2013-09-05T17:05:22")
@StaticMetamodel(TipoUsuario.class)
public class TipoUsuario_ { 

    public static volatile SingularAttribute<TipoUsuario, String> status;
    public static volatile SingularAttribute<TipoUsuario, Integer> idtipoUsuario;
    public static volatile ListAttribute<TipoUsuario, Usuario> usuarioList;
    public static volatile SingularAttribute<TipoUsuario, String> descricao;

}