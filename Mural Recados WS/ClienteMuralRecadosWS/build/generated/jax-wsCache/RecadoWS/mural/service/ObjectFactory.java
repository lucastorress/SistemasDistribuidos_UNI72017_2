
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

    private final static QName _HelloResponse_QNAME = new QName("http://service.mural/", "helloResponse");
    private final static QName _Hello_QNAME = new QName("http://service.mural/", "hello");
    private final static QName _GetCodigoResponse_QNAME = new QName("http://service.mural/", "getCodigoResponse");
    private final static QName _SetTexto_QNAME = new QName("http://service.mural/", "setTexto");
    private final static QName _GetTexto_QNAME = new QName("http://service.mural/", "getTexto");
    private final static QName _SetCodigo_QNAME = new QName("http://service.mural/", "setCodigo");
    private final static QName _GetApelidoRecado_QNAME = new QName("http://service.mural/", "getApelidoRecado");
    private final static QName _GetCodigo_QNAME = new QName("http://service.mural/", "getCodigo");
    private final static QName _SetTextoResponse_QNAME = new QName("http://service.mural/", "setTextoResponse");
    private final static QName _SetCodigoResponse_QNAME = new QName("http://service.mural/", "setCodigoResponse");
    private final static QName _GetTextoResponse_QNAME = new QName("http://service.mural/", "getTextoResponse");
    private final static QName _GetApelidoRecadoResponse_QNAME = new QName("http://service.mural/", "getApelidoRecadoResponse");
    private final static QName _SetApelidoRecadoResponse_QNAME = new QName("http://service.mural/", "setApelidoRecadoResponse");
    private final static QName _SetApelidoRecado_QNAME = new QName("http://service.mural/", "setApelidoRecado");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mural.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTextoResponse }
     * 
     */
    public GetTextoResponse createGetTextoResponse() {
        return new GetTextoResponse();
    }

    /**
     * Create an instance of {@link SetTextoResponse }
     * 
     */
    public SetTextoResponse createSetTextoResponse() {
        return new SetTextoResponse();
    }

    /**
     * Create an instance of {@link SetCodigoResponse }
     * 
     */
    public SetCodigoResponse createSetCodigoResponse() {
        return new SetCodigoResponse();
    }

    /**
     * Create an instance of {@link GetApelidoRecadoResponse }
     * 
     */
    public GetApelidoRecadoResponse createGetApelidoRecadoResponse() {
        return new GetApelidoRecadoResponse();
    }

    /**
     * Create an instance of {@link SetApelidoRecado }
     * 
     */
    public SetApelidoRecado createSetApelidoRecado() {
        return new SetApelidoRecado();
    }

    /**
     * Create an instance of {@link SetApelidoRecadoResponse }
     * 
     */
    public SetApelidoRecadoResponse createSetApelidoRecadoResponse() {
        return new SetApelidoRecadoResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetCodigoResponse }
     * 
     */
    public GetCodigoResponse createGetCodigoResponse() {
        return new GetCodigoResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link GetTexto }
     * 
     */
    public GetTexto createGetTexto() {
        return new GetTexto();
    }

    /**
     * Create an instance of {@link SetCodigo }
     * 
     */
    public SetCodigo createSetCodigo() {
        return new SetCodigo();
    }

    /**
     * Create an instance of {@link GetApelidoRecado }
     * 
     */
    public GetApelidoRecado createGetApelidoRecado() {
        return new GetApelidoRecado();
    }

    /**
     * Create an instance of {@link GetCodigo }
     * 
     */
    public GetCodigo createGetCodigo() {
        return new GetCodigo();
    }

    /**
     * Create an instance of {@link SetTexto }
     * 
     */
    public SetTexto createSetTexto() {
        return new SetTexto();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCodigoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "getCodigoResponse")
    public JAXBElement<GetCodigoResponse> createGetCodigoResponse(GetCodigoResponse value) {
        return new JAXBElement<GetCodigoResponse>(_GetCodigoResponse_QNAME, GetCodigoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetTexto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "setTexto")
    public JAXBElement<SetTexto> createSetTexto(SetTexto value) {
        return new JAXBElement<SetTexto>(_SetTexto_QNAME, SetTexto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTexto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "getTexto")
    public JAXBElement<GetTexto> createGetTexto(GetTexto value) {
        return new JAXBElement<GetTexto>(_GetTexto_QNAME, GetTexto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCodigo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "setCodigo")
    public JAXBElement<SetCodigo> createSetCodigo(SetCodigo value) {
        return new JAXBElement<SetCodigo>(_SetCodigo_QNAME, SetCodigo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApelidoRecado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "getApelidoRecado")
    public JAXBElement<GetApelidoRecado> createGetApelidoRecado(GetApelidoRecado value) {
        return new JAXBElement<GetApelidoRecado>(_GetApelidoRecado_QNAME, GetApelidoRecado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCodigo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "getCodigo")
    public JAXBElement<GetCodigo> createGetCodigo(GetCodigo value) {
        return new JAXBElement<GetCodigo>(_GetCodigo_QNAME, GetCodigo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetTextoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "setTextoResponse")
    public JAXBElement<SetTextoResponse> createSetTextoResponse(SetTextoResponse value) {
        return new JAXBElement<SetTextoResponse>(_SetTextoResponse_QNAME, SetTextoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCodigoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "setCodigoResponse")
    public JAXBElement<SetCodigoResponse> createSetCodigoResponse(SetCodigoResponse value) {
        return new JAXBElement<SetCodigoResponse>(_SetCodigoResponse_QNAME, SetCodigoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTextoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "getTextoResponse")
    public JAXBElement<GetTextoResponse> createGetTextoResponse(GetTextoResponse value) {
        return new JAXBElement<GetTextoResponse>(_GetTextoResponse_QNAME, GetTextoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApelidoRecadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "getApelidoRecadoResponse")
    public JAXBElement<GetApelidoRecadoResponse> createGetApelidoRecadoResponse(GetApelidoRecadoResponse value) {
        return new JAXBElement<GetApelidoRecadoResponse>(_GetApelidoRecadoResponse_QNAME, GetApelidoRecadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetApelidoRecadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "setApelidoRecadoResponse")
    public JAXBElement<SetApelidoRecadoResponse> createSetApelidoRecadoResponse(SetApelidoRecadoResponse value) {
        return new JAXBElement<SetApelidoRecadoResponse>(_SetApelidoRecadoResponse_QNAME, SetApelidoRecadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetApelidoRecado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "setApelidoRecado")
    public JAXBElement<SetApelidoRecado> createSetApelidoRecado(SetApelidoRecado value) {
        return new JAXBElement<SetApelidoRecado>(_SetApelidoRecado_QNAME, SetApelidoRecado.class, null, value);
    }

}
