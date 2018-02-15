
package com.finkok.facturacion.registration;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.finkok.facturacion.registration package. 
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

    private final static QName _RegistrationResult_QNAME = new QName("apps.services.soap.core.views", "RegistrationResult");
    private final static QName _ResellerUser_QNAME = new QName("apps.services.soap.core.views", "ResellerUser");
    private final static QName _Assign_QNAME = new QName("http://facturacion.finkok.com/registration", "assign");
    private final static QName _AssignResponse_QNAME = new QName("http://facturacion.finkok.com/registration", "assignResponse");
    private final static QName _EditResponse_QNAME = new QName("http://facturacion.finkok.com/registration", "editResponse");
    private final static QName _Get_QNAME = new QName("http://facturacion.finkok.com/registration", "get");
    private final static QName _ResellerUserArray_QNAME = new QName("apps.services.soap.core.views", "ResellerUserArray");
    private final static QName _RegistrationListResult_QNAME = new QName("apps.services.soap.core.views", "RegistrationListResult");
    private final static QName _Add_QNAME = new QName("http://facturacion.finkok.com/registration", "add");
    private final static QName _AssingResult_QNAME = new QName("apps.services.soap.core.views", "AssingResult");
    private final static QName _Edit_QNAME = new QName("http://facturacion.finkok.com/registration", "edit");
    private final static QName _AddResponse_QNAME = new QName("http://facturacion.finkok.com/registration", "addResponse");
    private final static QName _GetResponse_QNAME = new QName("http://facturacion.finkok.com/registration", "getResponse");
    private final static QName _RegistrationResultMessage_QNAME = new QName("apps.services.soap.core.views", "message");
    private final static QName _RegistrationResultSuccess_QNAME = new QName("apps.services.soap.core.views", "success");
    private final static QName _AssignResponseAssignResult_QNAME = new QName("http://facturacion.finkok.com/registration", "assignResult");
    private final static QName _EditResponseEditResult_QNAME = new QName("http://facturacion.finkok.com/registration", "editResult");
    private final static QName _GetResponseGetResult_QNAME = new QName("http://facturacion.finkok.com/registration", "getResult");
    private final static QName _AddResponseAddResult_QNAME = new QName("http://facturacion.finkok.com/registration", "addResult");
    private final static QName _AddResellerUsername_QNAME = new QName("http://facturacion.finkok.com/registration", "reseller_username");
    private final static QName _AddPassphrase_QNAME = new QName("http://facturacion.finkok.com/registration", "passphrase");
    private final static QName _AddKey_QNAME = new QName("http://facturacion.finkok.com/registration", "key");
    private final static QName _AddResellerPassword_QNAME = new QName("http://facturacion.finkok.com/registration", "reseller_password");
    private final static QName _AddCer_QNAME = new QName("http://facturacion.finkok.com/registration", "cer");
    private final static QName _AddTypeUser_QNAME = new QName("http://facturacion.finkok.com/registration", "type_user");
    private final static QName _AddAdded_QNAME = new QName("http://facturacion.finkok.com/registration", "added");
    private final static QName _AddCoupon_QNAME = new QName("http://facturacion.finkok.com/registration", "coupon");
    private final static QName _AddTaxpayerId_QNAME = new QName("http://facturacion.finkok.com/registration", "taxpayer_id");
    private final static QName _AssignCredit_QNAME = new QName("http://facturacion.finkok.com/registration", "credit");
    private final static QName _EditStatus_QNAME = new QName("http://facturacion.finkok.com/registration", "status");
    private final static QName _ResellerUserCounter_QNAME = new QName("apps.services.soap.core.views", "counter");
    private final static QName _ResellerUserCredit_QNAME = new QName("apps.services.soap.core.views", "credit");
    private final static QName _ResellerUserStatus_QNAME = new QName("apps.services.soap.core.views", "status");
    private final static QName _ResellerUserTaxpayerId_QNAME = new QName("apps.services.soap.core.views", "taxpayer_id");
    private final static QName _RegistrationListResultUsers_QNAME = new QName("apps.services.soap.core.views", "users");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.finkok.facturacion.registration
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AssingResult }
     * 
     */
    public AssingResult createAssingResult() {
        return new AssingResult();
    }

    /**
     * Create an instance of {@link ResellerUserArray }
     * 
     */
    public ResellerUserArray createResellerUserArray() {
        return new ResellerUserArray();
    }

    /**
     * Create an instance of {@link ResellerUser }
     * 
     */
    public ResellerUser createResellerUser() {
        return new ResellerUser();
    }

    /**
     * Create an instance of {@link RegistrationResult }
     * 
     */
    public RegistrationResult createRegistrationResult() {
        return new RegistrationResult();
    }

    /**
     * Create an instance of {@link RegistrationListResult }
     * 
     */
    public RegistrationListResult createRegistrationListResult() {
        return new RegistrationListResult();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link EditResponse }
     * 
     */
    public EditResponse createEditResponse() {
        return new EditResponse();
    }

    /**
     * Create an instance of {@link AssignResponse }
     * 
     */
    public AssignResponse createAssignResponse() {
        return new AssignResponse();
    }

    /**
     * Create an instance of {@link Edit }
     * 
     */
    public Edit createEdit() {
        return new Edit();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link Get }
     * 
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link Assign }
     * 
     */
    public Assign createAssign() {
        return new Assign();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "RegistrationResult")
    public JAXBElement<RegistrationResult> createRegistrationResult(RegistrationResult value) {
        return new JAXBElement<RegistrationResult>(_RegistrationResult_QNAME, RegistrationResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResellerUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "ResellerUser")
    public JAXBElement<ResellerUser> createResellerUser(ResellerUser value) {
        return new JAXBElement<ResellerUser>(_ResellerUser_QNAME, ResellerUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Assign }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "assign")
    public JAXBElement<Assign> createAssign(Assign value) {
        return new JAXBElement<Assign>(_Assign_QNAME, Assign.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "assignResponse")
    public JAXBElement<AssignResponse> createAssignResponse(AssignResponse value) {
        return new JAXBElement<AssignResponse>(_AssignResponse_QNAME, AssignResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "editResponse")
    public JAXBElement<EditResponse> createEditResponse(EditResponse value) {
        return new JAXBElement<EditResponse>(_EditResponse_QNAME, EditResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Get }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "get")
    public JAXBElement<Get> createGet(Get value) {
        return new JAXBElement<Get>(_Get_QNAME, Get.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResellerUserArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "ResellerUserArray")
    public JAXBElement<ResellerUserArray> createResellerUserArray(ResellerUserArray value) {
        return new JAXBElement<ResellerUserArray>(_ResellerUserArray_QNAME, ResellerUserArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationListResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "RegistrationListResult")
    public JAXBElement<RegistrationListResult> createRegistrationListResult(RegistrationListResult value) {
        return new JAXBElement<RegistrationListResult>(_RegistrationListResult_QNAME, RegistrationListResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "AssingResult")
    public JAXBElement<AssingResult> createAssingResult(AssingResult value) {
        return new JAXBElement<AssingResult>(_AssingResult_QNAME, AssingResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "edit")
    public JAXBElement<Edit> createEdit(Edit value) {
        return new JAXBElement<Edit>(_Edit_QNAME, Edit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "getResponse")
    public JAXBElement<GetResponse> createGetResponse(GetResponse value) {
        return new JAXBElement<GetResponse>(_GetResponse_QNAME, GetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "message", scope = RegistrationResult.class)
    public JAXBElement<String> createRegistrationResultMessage(String value) {
        return new JAXBElement<String>(_RegistrationResultMessage_QNAME, String.class, RegistrationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "success", scope = RegistrationResult.class)
    public JAXBElement<Boolean> createRegistrationResultSuccess(Boolean value) {
        return new JAXBElement<Boolean>(_RegistrationResultSuccess_QNAME, Boolean.class, RegistrationResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "assignResult", scope = AssignResponse.class)
    public JAXBElement<AssingResult> createAssignResponseAssignResult(AssingResult value) {
        return new JAXBElement<AssingResult>(_AssignResponseAssignResult_QNAME, AssingResult.class, AssignResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "editResult", scope = EditResponse.class)
    public JAXBElement<RegistrationResult> createEditResponseEditResult(RegistrationResult value) {
        return new JAXBElement<RegistrationResult>(_EditResponseEditResult_QNAME, RegistrationResult.class, EditResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationListResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "getResult", scope = GetResponse.class)
    public JAXBElement<RegistrationListResult> createGetResponseGetResult(RegistrationListResult value) {
        return new JAXBElement<RegistrationListResult>(_GetResponseGetResult_QNAME, RegistrationListResult.class, GetResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "addResult", scope = AddResponse.class)
    public JAXBElement<RegistrationResult> createAddResponseAddResult(RegistrationResult value) {
        return new JAXBElement<RegistrationResult>(_AddResponseAddResult_QNAME, RegistrationResult.class, AddResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "reseller_username", scope = Add.class)
    public JAXBElement<String> createAddResellerUsername(String value) {
        return new JAXBElement<String>(_AddResellerUsername_QNAME, String.class, Add.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "passphrase", scope = Add.class)
    public JAXBElement<String> createAddPassphrase(String value) {
        return new JAXBElement<String>(_AddPassphrase_QNAME, String.class, Add.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "key", scope = Add.class)
    public JAXBElement<byte[]> createAddKey(byte[] value) {
        return new JAXBElement<byte[]>(_AddKey_QNAME, byte[].class, Add.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "reseller_password", scope = Add.class)
    public JAXBElement<String> createAddResellerPassword(String value) {
        return new JAXBElement<String>(_AddResellerPassword_QNAME, String.class, Add.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "cer", scope = Add.class)
    public JAXBElement<byte[]> createAddCer(byte[] value) {
        return new JAXBElement<byte[]>(_AddCer_QNAME, byte[].class, Add.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "type_user", scope = Add.class)
    public JAXBElement<String> createAddTypeUser(String value) {
        return new JAXBElement<String>(_AddTypeUser_QNAME, String.class, Add.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "added", scope = Add.class)
    public JAXBElement<String> createAddAdded(String value) {
        return new JAXBElement<String>(_AddAdded_QNAME, String.class, Add.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "coupon", scope = Add.class)
    public JAXBElement<String> createAddCoupon(String value) {
        return new JAXBElement<String>(_AddCoupon_QNAME, String.class, Add.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "taxpayer_id", scope = Add.class)
    public JAXBElement<String> createAddTaxpayerId(String value) {
        return new JAXBElement<String>(_AddTaxpayerId_QNAME, String.class, Add.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "credit", scope = Assign.class)
    public JAXBElement<BigInteger> createAssignCredit(BigInteger value) {
        return new JAXBElement<BigInteger>(_AssignCredit_QNAME, BigInteger.class, Assign.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "reseller_username", scope = Edit.class)
    public JAXBElement<String> createEditResellerUsername(String value) {
        return new JAXBElement<String>(_AddResellerUsername_QNAME, String.class, Edit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "passphrase", scope = Edit.class)
    public JAXBElement<String> createEditPassphrase(String value) {
        return new JAXBElement<String>(_AddPassphrase_QNAME, String.class, Edit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "status", scope = Edit.class)
    public JAXBElement<String> createEditStatus(String value) {
        return new JAXBElement<String>(_EditStatus_QNAME, String.class, Edit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "key", scope = Edit.class)
    public JAXBElement<byte[]> createEditKey(byte[] value) {
        return new JAXBElement<byte[]>(_AddKey_QNAME, byte[].class, Edit.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "reseller_password", scope = Edit.class)
    public JAXBElement<String> createEditResellerPassword(String value) {
        return new JAXBElement<String>(_AddResellerPassword_QNAME, String.class, Edit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "cer", scope = Edit.class)
    public JAXBElement<byte[]> createEditCer(byte[] value) {
        return new JAXBElement<byte[]>(_AddCer_QNAME, byte[].class, Edit.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "taxpayer_id", scope = Edit.class)
    public JAXBElement<String> createEditTaxpayerId(String value) {
        return new JAXBElement<String>(_AddTaxpayerId_QNAME, String.class, Edit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "counter", scope = ResellerUser.class)
    public JAXBElement<BigInteger> createResellerUserCounter(BigInteger value) {
        return new JAXBElement<BigInteger>(_ResellerUserCounter_QNAME, BigInteger.class, ResellerUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "credit", scope = ResellerUser.class)
    public JAXBElement<BigInteger> createResellerUserCredit(BigInteger value) {
        return new JAXBElement<BigInteger>(_ResellerUserCredit_QNAME, BigInteger.class, ResellerUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "status", scope = ResellerUser.class)
    public JAXBElement<String> createResellerUserStatus(String value) {
        return new JAXBElement<String>(_ResellerUserStatus_QNAME, String.class, ResellerUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "taxpayer_id", scope = ResellerUser.class)
    public JAXBElement<String> createResellerUserTaxpayerId(String value) {
        return new JAXBElement<String>(_ResellerUserTaxpayerId_QNAME, String.class, ResellerUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "reseller_username", scope = Get.class)
    public JAXBElement<String> createGetResellerUsername(String value) {
        return new JAXBElement<String>(_AddResellerUsername_QNAME, String.class, Get.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "reseller_password", scope = Get.class)
    public JAXBElement<String> createGetResellerPassword(String value) {
        return new JAXBElement<String>(_AddResellerPassword_QNAME, String.class, Get.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/registration", name = "taxpayer_id", scope = Get.class)
    public JAXBElement<String> createGetTaxpayerId(String value) {
        return new JAXBElement<String>(_AddTaxpayerId_QNAME, String.class, Get.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "credit", scope = AssingResult.class)
    public JAXBElement<BigInteger> createAssingResultCredit(BigInteger value) {
        return new JAXBElement<BigInteger>(_ResellerUserCredit_QNAME, BigInteger.class, AssingResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "message", scope = AssingResult.class)
    public JAXBElement<String> createAssingResultMessage(String value) {
        return new JAXBElement<String>(_RegistrationResultMessage_QNAME, String.class, AssingResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "success", scope = AssingResult.class)
    public JAXBElement<Boolean> createAssingResultSuccess(Boolean value) {
        return new JAXBElement<Boolean>(_RegistrationResultSuccess_QNAME, Boolean.class, AssingResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "message", scope = RegistrationListResult.class)
    public JAXBElement<String> createRegistrationListResultMessage(String value) {
        return new JAXBElement<String>(_RegistrationResultMessage_QNAME, String.class, RegistrationListResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResellerUserArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "users", scope = RegistrationListResult.class)
    public JAXBElement<ResellerUserArray> createRegistrationListResultUsers(ResellerUserArray value) {
        return new JAXBElement<ResellerUserArray>(_RegistrationListResultUsers_QNAME, ResellerUserArray.class, RegistrationListResult.class, value);
    }

}
