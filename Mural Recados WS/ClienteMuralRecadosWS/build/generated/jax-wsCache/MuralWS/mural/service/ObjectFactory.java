
package mural.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mural.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultarRecadoResponse_QNAME = new QName("http://service.mural/", "consultarRecadoResponse");
    private final static QName _CadastrarRecadoResponse_QNAME = new QName("http://service.mural/", "cadastrarRecadoResponse");
    private final static QName _RemoverRecado_QNAME = new QName("http://service.mural/", "removerRecado");
    private final static QName _CadastrarRecado_QNAME = new QName("http://service.mural/", "cadastrarRecado");
    private final static QName _ConsultarRecadosResponse_QNAME = new QName("http://service.mural/", "consultarRecadosResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://service.mural/", "helloResponse");
    private final static QName _Hello_QNAME = new QName("http://service.mural/", "hello");
    private final static QName _ConsultarRecados_QNAME = new QName("http://service.mural/", "consultarRecados");
    private final static QName _ConsultarRecado_QNAME = new QName("http://service.mural/", "consultarRecado");
    private final static QName _RemoverRecadoResponse_QNAME = new QName("http://service.mural/", "removerRecadoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mural.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CadastrarRecadoResponse }
     * 
     */
    public CadastrarRecadoResponse createCadastrarRecadoResponse() {
        return new CadastrarRecadoResponse();
    }

    /**
     * Create an instance of {@link RemoverRecado }
     * 
     */
    public RemoverRecado createRemoverRecado() {
        return new RemoverRecado();
    }

    /**
     * Create an instance of {@link CadastrarRecado }
     * 
     */
    public CadastrarRecado createCadastrarRecado() {
        return new CadastrarRecado();
    }

    /**
     * Create an instance of {@link ConsultarRecadoResponse }
     * 
     */
    public ConsultarRecadoResponse createConsultarRecadoResponse() {
        return new ConsultarRecadoResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ConsultarRecado }
     * 
     */
    public ConsultarRecado createConsultarRecado() {
        return new ConsultarRecado();
    }

    /**
     * Create an instance of {@link RemoverRecadoResponse }
     * 
     */
    public RemoverRecadoResponse createRemoverRecadoResponse() {
        return new RemoverRecadoResponse();
    }

    /**
     * Create an instance of {@link RecadoWS }
     * 
     */
    public RecadoWS createRecadoWS() {
        return new RecadoWS();
    }

    /**
     * Create an instance of {@link UsuarioWS }
     * 
     */
    public UsuarioWS createUsuarioWS() {
        return new UsuarioWS();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarRecadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "consultarRecadoResponse")
    public JAXBElement<ConsultarRecadoResponse> createConsultarRecadoResponse(ConsultarRecadoResponse value) {
        return new JAXBElement<ConsultarRecadoResponse>(_ConsultarRecadoResponse_QNAME, ConsultarRecadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarRecadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "cadastrarRecadoResponse")
    public JAXBElement<CadastrarRecadoResponse> createCadastrarRecadoResponse(CadastrarRecadoResponse value) {
        return new JAXBElement<CadastrarRecadoResponse>(_CadastrarRecadoResponse_QNAME, CadastrarRecadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverRecado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "removerRecado")
    public JAXBElement<RemoverRecado> createRemoverRecado(RemoverRecado value) {
        return new JAXBElement<RemoverRecado>(_RemoverRecado_QNAME, RemoverRecado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CadastrarRecado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "cadastrarRecado")
    public JAXBElement<CadastrarRecado> createCadastrarRecado(CadastrarRecado value) {
        return new JAXBElement<CadastrarRecado>(_CadastrarRecado_QNAME, CadastrarRecado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarRecadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "consultarRecadosResponse")
    public JAXBElement<ConsultarRecadoResponse> createConsultarRecadosResponse(ConsultarRecadoResponse value) {
        return new JAXBElement<ConsultarRecadoResponse>(_ConsultarRecadosResponse_QNAME, ConsultarRecadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarRecado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "consultarRecados")
    public JAXBElement<ConsultarRecado> createConsultarRecados(ConsultarRecado value) {
        return new JAXBElement<ConsultarRecado>(_ConsultarRecados_QNAME, ConsultarRecado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarRecado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "consultarRecado")
    public JAXBElement<ConsultarRecado> createConsultarRecado(ConsultarRecado value) {
        return new JAXBElement<ConsultarRecado>(_ConsultarRecado_QNAME, ConsultarRecado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoverRecadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "removerRecadoResponse")
    public JAXBElement<RemoverRecadoResponse> createRemoverRecadoResponse(RemoverRecadoResponse value) {
        return new JAXBElement<RemoverRecadoResponse>(_RemoverRecadoResponse_QNAME, RemoverRecadoResponse.class, null, value);
    }

}
