
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

    private final static QName _GetApelido_QNAME = new QName("http://service.mural/", "getApelido");
    private final static QName _GetApelidoResponse_QNAME = new QName("http://service.mural/", "getApelidoResponse");
    private final static QName _SetApelido_QNAME = new QName("http://service.mural/", "SetApelido");
    private final static QName _HelloResponse_QNAME = new QName("http://service.mural/", "helloResponse");
    private final static QName _GetId_QNAME = new QName("http://service.mural/", "getId");
    private final static QName _SetApelidoResponse_QNAME = new QName("http://service.mural/", "SetApelidoResponse");
    private final static QName _Hello_QNAME = new QName("http://service.mural/", "hello");
    private final static QName _SetId_QNAME = new QName("http://service.mural/", "setId");
    private final static QName _GetIdResponse_QNAME = new QName("http://service.mural/", "getIdResponse");
    private final static QName _SetIdResponse_QNAME = new QName("http://service.mural/", "setIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mural.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetApelido }
     * 
     */
    public SetApelido createSetApelido() {
        return new SetApelido();
    }

    /**
     * Create an instance of {@link GetApelido }
     * 
     */
    public GetApelido createGetApelido() {
        return new GetApelido();
    }

    /**
     * Create an instance of {@link GetApelidoResponse }
     * 
     */
    public GetApelidoResponse createGetApelidoResponse() {
        return new GetApelidoResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link SetId }
     * 
     */
    public SetId createSetId() {
        return new SetId();
    }

    /**
     * Create an instance of {@link GetId }
     * 
     */
    public GetId createGetId() {
        return new GetId();
    }

    /**
     * Create an instance of {@link SetApelidoResponse }
     * 
     */
    public SetApelidoResponse createSetApelidoResponse() {
        return new SetApelidoResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link GetIdResponse }
     * 
     */
    public GetIdResponse createGetIdResponse() {
        return new GetIdResponse();
    }

    /**
     * Create an instance of {@link SetIdResponse }
     * 
     */
    public SetIdResponse createSetIdResponse() {
        return new SetIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApelido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "getApelido")
    public JAXBElement<GetApelido> createGetApelido(GetApelido value) {
        return new JAXBElement<GetApelido>(_GetApelido_QNAME, GetApelido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetApelidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "getApelidoResponse")
    public JAXBElement<GetApelidoResponse> createGetApelidoResponse(GetApelidoResponse value) {
        return new JAXBElement<GetApelidoResponse>(_GetApelidoResponse_QNAME, GetApelidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetApelido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "SetApelido")
    public JAXBElement<SetApelido> createSetApelido(SetApelido value) {
        return new JAXBElement<SetApelido>(_SetApelido_QNAME, SetApelido.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "getId")
    public JAXBElement<GetId> createGetId(GetId value) {
        return new JAXBElement<GetId>(_GetId_QNAME, GetId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetApelidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "SetApelidoResponse")
    public JAXBElement<SetApelidoResponse> createSetApelidoResponse(SetApelidoResponse value) {
        return new JAXBElement<SetApelidoResponse>(_SetApelidoResponse_QNAME, SetApelidoResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SetId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "setId")
    public JAXBElement<SetId> createSetId(SetId value) {
        return new JAXBElement<SetId>(_SetId_QNAME, SetId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "getIdResponse")
    public JAXBElement<GetIdResponse> createGetIdResponse(GetIdResponse value) {
        return new JAXBElement<GetIdResponse>(_GetIdResponse_QNAME, GetIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.mural/", name = "setIdResponse")
    public JAXBElement<SetIdResponse> createSetIdResponse(SetIdResponse value) {
        return new JAXBElement<SetIdResponse>(_SetIdResponse_QNAME, SetIdResponse.class, null, value);
    }

}
