
package com.finkok.facturacion.cancel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.finkok.facturacion.cancel package. 
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

    private final static QName _GetRelated_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_related");
    private final static QName _GetPending_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_pending");
    private final static QName _StringArray_QNAME = new QName("http://facturacion.finkok.com/cancellation", "stringArray");
    private final static QName _GetRelatedResponse_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_relatedResponse");
    private final static QName _FolioArray_QNAME = new QName("apps.services.soap.core.views", "FolioArray");
    private final static QName _AcuseSatEstatus_QNAME = new QName("apps.services.soap.core.views", "AcuseSatEstatus");
    private final static QName _CancelResponse_QNAME = new QName("http://facturacion.finkok.com/cancel", "cancelResponse");
    private final static QName _AcceptReject_QNAME = new QName("http://facturacion.finkok.com/cancel", "accept_reject");
    private final static QName _GetOutRelatedResponse_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_out_relatedResponse");
    private final static QName _GetReceipt_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_receipt");
    private final static QName _UUIDS_QNAME = new QName("apps.services.soap.core.views", "UUIDS");
    private final static QName _GetPendingResponse_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_pendingResponse");
    private final static QName _AcceptRejectResult_QNAME = new QName("apps.services.soap.core.views", "AcceptRejectResult");
    private final static QName _GetOutSatStatus_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_out_sat_status");
    private final static QName _OutCancelResponse_QNAME = new QName("http://facturacion.finkok.com/cancel", "out_cancelResponse");
    private final static QName _CancelPendingResult_QNAME = new QName("apps.services.soap.core.views", "CancelPendingResult");
    private final static QName _PadreArray_QNAME = new QName("apps.services.soap.core.views", "PadreArray");
    private final static QName _CancelSignature_QNAME = new QName("http://facturacion.finkok.com/cancel", "cancel_signature");
    private final static QName _CancelaCFDResult_QNAME = new QName("apps.services.soap.core.views", "CancelaCFDResult");
    private final static QName _Acepta_QNAME = new QName("apps.services.soap.core.views", "Acepta");
    private final static QName _UUIDAR_QNAME = new QName("apps.services.soap.core.views", "UUID_AR");
    private final static QName _GetOutPendingResponse_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_out_pendingResponse");
    private final static QName _Hijo_QNAME = new QName("apps.services.soap.core.views", "Hijo");
    private final static QName _SignCancelResponse_QNAME = new QName("http://facturacion.finkok.com/cancel", "sign_cancelResponse");
    private final static QName _Folio_QNAME = new QName("apps.services.soap.core.views", "Folio");
    private final static QName _GetOutPending_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_out_pending");
    private final static QName _GetOutRelated_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_out_related");
    private final static QName _GetSatStatus_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_sat_status");
    private final static QName _HijoArray_QNAME = new QName("apps.services.soap.core.views", "HijoArray");
    private final static QName _OutAcceptReject_QNAME = new QName("http://facturacion.finkok.com/cancel", "out_accept_reject");
    private final static QName _Padre_QNAME = new QName("apps.services.soap.core.views", "Padre");
    private final static QName _Cancel_QNAME = new QName("http://facturacion.finkok.com/cancel", "cancel");
    private final static QName _UUIDSAR_QNAME = new QName("apps.services.soap.core.views", "UUIDS_AR");
    private final static QName _AcceptRejectResponse_QNAME = new QName("http://facturacion.finkok.com/cancel", "accept_rejectResponse");
    private final static QName _QueryPendingCancellationResponse_QNAME = new QName("http://facturacion.finkok.com/cancel", "query_pending_cancellationResponse");
    private final static QName _GetReceiptResponse_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_receiptResponse");
    private final static QName _Rechaza_QNAME = new QName("apps.services.soap.core.views", "Rechaza");
    private final static QName _OutCancel_QNAME = new QName("http://facturacion.finkok.com/cancel", "out_cancel");
    private final static QName _UUIDARArray_QNAME = new QName("apps.services.soap.core.views", "UUID_ARArray");
    private final static QName _CancelSignatureResponse_QNAME = new QName("http://facturacion.finkok.com/cancel", "cancel_signatureResponse");
    private final static QName _GetOutSatStatusResponse_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_out_sat_statusResponse");
    private final static QName _OutAcceptRejectResponse_QNAME = new QName("http://facturacion.finkok.com/cancel", "out_accept_rejectResponse");
    private final static QName _RelatedResult_QNAME = new QName("apps.services.soap.core.views", "RelatedResult");
    private final static QName _QueryPendingCancellation_QNAME = new QName("http://facturacion.finkok.com/cancel", "query_pending_cancellation");
    private final static QName _GetSatStatusResponse_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_sat_statusResponse");
    private final static QName _QueryPendingResult_QNAME = new QName("apps.services.soap.core.views", "QueryPendingResult");
    private final static QName _AcuseSATConsulta_QNAME = new QName("apps.services.soap.core.views", "AcuseSATConsulta");
    private final static QName _AceptaArray_QNAME = new QName("apps.services.soap.core.views", "AceptaArray");
    private final static QName _RechazaArray_QNAME = new QName("apps.services.soap.core.views", "RechazaArray");
    private final static QName _ReceiptResult_QNAME = new QName("apps.services.soap.core.views", "ReceiptResult");
    private final static QName _SignCancel_QNAME = new QName("http://facturacion.finkok.com/cancel", "sign_cancel");
    private final static QName _GetOutRelatedRtaxpayerId_QNAME = new QName("http://facturacion.finkok.com/cancel", "rtaxpayer_id");
    private final static QName _GetOutRelatedUuid_QNAME = new QName("http://facturacion.finkok.com/cancel", "uuid");
    private final static QName _GetOutRelatedKey_QNAME = new QName("http://facturacion.finkok.com/cancel", "key");
    private final static QName _GetOutRelatedUsername_QNAME = new QName("http://facturacion.finkok.com/cancel", "username");
    private final static QName _GetOutRelatedCer_QNAME = new QName("http://facturacion.finkok.com/cancel", "cer");
    private final static QName _GetOutRelatedPassword_QNAME = new QName("http://facturacion.finkok.com/cancel", "password");
    private final static QName _OutCancelResponseOutCancelResult_QNAME = new QName("http://facturacion.finkok.com/cancel", "out_cancelResult");
    private final static QName _GetOutSatStatusTaxpayerId_QNAME = new QName("http://facturacion.finkok.com/cancel", "taxpayer_id");
    private final static QName _GetOutSatStatusTotal_QNAME = new QName("http://facturacion.finkok.com/cancel", "total");
    private final static QName _CancelSignatureResponseCancelSignatureResult_QNAME = new QName("http://facturacion.finkok.com/cancel", "cancel_signatureResult");
    private final static QName _AcuseSatEstatusError_QNAME = new QName("apps.services.soap.core.views", "error");
    private final static QName _AcuseSatEstatusSat_QNAME = new QName("apps.services.soap.core.views", "sat");
    private final static QName _GetReceiptType_QNAME = new QName("http://facturacion.finkok.com/cancel", "type");
    private final static QName _GetRelatedResponseGetRelatedResult_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_relatedResult");
    private final static QName _RechazaUuid_QNAME = new QName("apps.services.soap.core.views", "uuid");
    private final static QName _RechazaStatus_QNAME = new QName("apps.services.soap.core.views", "status");
    private final static QName _SignCancelUUIDS_QNAME = new QName("http://facturacion.finkok.com/cancel", "UUIDS");
    private final static QName _SignCancelSerial_QNAME = new QName("http://facturacion.finkok.com/cancel", "serial");
    private final static QName _SignCancelStorePending_QNAME = new QName("http://facturacion.finkok.com/cancel", "store_pending");
    private final static QName _CancelSignatureXml_QNAME = new QName("http://facturacion.finkok.com/cancel", "xml");
    private final static QName _QueryPendingCancellationResponseQueryPendingCancellationResult_QNAME = new QName("http://facturacion.finkok.com/cancel", "query_pending_cancellationResult");
    private final static QName _GetOutPendingResponseGetOutPendingResult_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_out_pendingResult");
    private final static QName _GetPendingResponseGetPendingResult_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_pendingResult");
    private final static QName _SignCancelResponseSignCancelResult_QNAME = new QName("http://facturacion.finkok.com/cancel", "sign_cancelResult");
    private final static QName _GetOutSatStatusResponseGetOutSatStatusResult_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_out_sat_statusResult");
    private final static QName _GetSatStatusResponseGetSatStatusResult_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_sat_statusResult");
    private final static QName _OutAcceptRejectUUIDAR_QNAME = new QName("http://facturacion.finkok.com/cancel", "UUID_AR");
    private final static QName _GetReceiptResponseGetReceiptResult_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_receiptResult");
    private final static QName _AcceptRejectResponseAcceptRejectResult_QNAME = new QName("http://facturacion.finkok.com/cancel", "accept_rejectResult");
    private final static QName _GetOutRelatedResponseGetOutRelatedResult_QNAME = new QName("http://facturacion.finkok.com/cancel", "get_out_relatedResult");
    private final static QName _AcceptRejectUUIDSAR_QNAME = new QName("http://facturacion.finkok.com/cancel", "UUIDS_AR");
    private final static QName _RelatedResultHijos_QNAME = new QName("apps.services.soap.core.views", "Hijos");
    private final static QName _RelatedResultPadres_QNAME = new QName("apps.services.soap.core.views", "Padres");
    private final static QName _PadreEmisor_QNAME = new QName("apps.services.soap.core.views", "emisor");
    private final static QName _PadreReceptor_QNAME = new QName("apps.services.soap.core.views", "receptor");
    private final static QName _CancelaCFDResultCodEstatus_QNAME = new QName("apps.services.soap.core.views", "CodEstatus");
    private final static QName _CancelaCFDResultFolios_QNAME = new QName("apps.services.soap.core.views", "Folios");
    private final static QName _CancelaCFDResultRfcEmisor_QNAME = new QName("apps.services.soap.core.views", "RfcEmisor");
    private final static QName _CancelaCFDResultFecha_QNAME = new QName("apps.services.soap.core.views", "Fecha");
    private final static QName _CancelaCFDResultAcuse_QNAME = new QName("apps.services.soap.core.views", "Acuse");
    private final static QName _UUIDSARUuidsAr_QNAME = new QName("apps.services.soap.core.views", "uuids_ar");
    private final static QName _CancelPendingResultUuids_QNAME = new QName("apps.services.soap.core.views", "uuids");
    private final static QName _UUIDARRespuesta_QNAME = new QName("apps.services.soap.core.views", "respuesta");
    private final static QName _OutAcceptRejectResponseOutAcceptRejectResult_QNAME = new QName("http://facturacion.finkok.com/cancel", "out_accept_rejectResult");
    private final static QName _QueryPendingResultUuidStatus_QNAME = new QName("apps.services.soap.core.views", "uuid_status");
    private final static QName _QueryPendingResultAttempts_QNAME = new QName("apps.services.soap.core.views", "attempts");
    private final static QName _QueryPendingResultNextAttempt_QNAME = new QName("apps.services.soap.core.views", "next_attempt");
    private final static QName _QueryPendingResultDate_QNAME = new QName("apps.services.soap.core.views", "date");
    private final static QName _QueryPendingResultXml_QNAME = new QName("apps.services.soap.core.views", "xml");
    private final static QName _AcuseSATConsultaEstatusCancelacion_QNAME = new QName("apps.services.soap.core.views", "EstatusCancelacion");
    private final static QName _AcuseSATConsultaEstado_QNAME = new QName("apps.services.soap.core.views", "Estado");
    private final static QName _AcuseSATConsultaCodigoEstatus_QNAME = new QName("apps.services.soap.core.views", "CodigoEstatus");
    private final static QName _AcuseSATConsultaEsCancelable_QNAME = new QName("apps.services.soap.core.views", "EsCancelable");
    private final static QName _AcceptRejectResultRechazo_QNAME = new QName("apps.services.soap.core.views", "rechazo");
    private final static QName _AcceptRejectResultAceptacion_QNAME = new QName("apps.services.soap.core.views", "aceptacion");
    private final static QName _FolioUUID_QNAME = new QName("apps.services.soap.core.views", "UUID");
    private final static QName _FolioEstatusUUID_QNAME = new QName("apps.services.soap.core.views", "EstatusUUID");
    private final static QName _CancelResponseCancelResult_QNAME = new QName("http://facturacion.finkok.com/cancel", "cancelResult");
    private final static QName _ReceiptResultReceipt_QNAME = new QName("apps.services.soap.core.views", "receipt");
    private final static QName _ReceiptResultTaxpayerId_QNAME = new QName("apps.services.soap.core.views", "taxpayer_id");
    private final static QName _ReceiptResultSuccess_QNAME = new QName("apps.services.soap.core.views", "success");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.finkok.facturacion.cancel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UUIDARArray }
     * 
     */
    public UUIDARArray createUUIDARArray() {
        return new UUIDARArray();
    }

    /**
     * Create an instance of {@link AceptaArray }
     * 
     */
    public AceptaArray createAceptaArray() {
        return new AceptaArray();
    }

    /**
     * Create an instance of {@link AcuseSATConsulta }
     * 
     */
    public AcuseSATConsulta createAcuseSATConsulta() {
        return new AcuseSATConsulta();
    }

    /**
     * Create an instance of {@link Hijo }
     * 
     */
    public Hijo createHijo() {
        return new Hijo();
    }

    /**
     * Create an instance of {@link AcceptRejectResult }
     * 
     */
    public AcceptRejectResult createAcceptRejectResult() {
        return new AcceptRejectResult();
    }

    /**
     * Create an instance of {@link RechazaArray }
     * 
     */
    public RechazaArray createRechazaArray() {
        return new RechazaArray();
    }

    /**
     * Create an instance of {@link ReceiptResult }
     * 
     */
    public ReceiptResult createReceiptResult() {
        return new ReceiptResult();
    }

    /**
     * Create an instance of {@link Folio }
     * 
     */
    public Folio createFolio() {
        return new Folio();
    }

    /**
     * Create an instance of {@link QueryPendingResult }
     * 
     */
    public QueryPendingResult createQueryPendingResult() {
        return new QueryPendingResult();
    }

    /**
     * Create an instance of {@link Rechaza }
     * 
     */
    public Rechaza createRechaza() {
        return new Rechaza();
    }

    /**
     * Create an instance of {@link UUIDS }
     * 
     */
    public UUIDS createUUIDS() {
        return new UUIDS();
    }

    /**
     * Create an instance of {@link RelatedResult }
     * 
     */
    public RelatedResult createRelatedResult() {
        return new RelatedResult();
    }

    /**
     * Create an instance of {@link AcuseSatEstatus }
     * 
     */
    public AcuseSatEstatus createAcuseSatEstatus() {
        return new AcuseSatEstatus();
    }

    /**
     * Create an instance of {@link HijoArray }
     * 
     */
    public HijoArray createHijoArray() {
        return new HijoArray();
    }

    /**
     * Create an instance of {@link CancelPendingResult }
     * 
     */
    public CancelPendingResult createCancelPendingResult() {
        return new CancelPendingResult();
    }

    /**
     * Create an instance of {@link FolioArray }
     * 
     */
    public FolioArray createFolioArray() {
        return new FolioArray();
    }

    /**
     * Create an instance of {@link Padre }
     * 
     */
    public Padre createPadre() {
        return new Padre();
    }

    /**
     * Create an instance of {@link PadreArray }
     * 
     */
    public PadreArray createPadreArray() {
        return new PadreArray();
    }

    /**
     * Create an instance of {@link UUIDSAR }
     * 
     */
    public UUIDSAR createUUIDSAR() {
        return new UUIDSAR();
    }

    /**
     * Create an instance of {@link CancelaCFDResult }
     * 
     */
    public CancelaCFDResult createCancelaCFDResult() {
        return new CancelaCFDResult();
    }

    /**
     * Create an instance of {@link Acepta }
     * 
     */
    public Acepta createAcepta() {
        return new Acepta();
    }

    /**
     * Create an instance of {@link UUIDAR }
     * 
     */
    public UUIDAR createUUIDAR() {
        return new UUIDAR();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link Cancel }
     * 
     */
    public Cancel createCancel() {
        return new Cancel();
    }

    /**
     * Create an instance of {@link CancelResponse }
     * 
     */
    public CancelResponse createCancelResponse() {
        return new CancelResponse();
    }

    /**
     * Create an instance of {@link AcceptReject }
     * 
     */
    public AcceptReject createAcceptReject() {
        return new AcceptReject();
    }

    /**
     * Create an instance of {@link OutAcceptReject }
     * 
     */
    public OutAcceptReject createOutAcceptReject() {
        return new OutAcceptReject();
    }

    /**
     * Create an instance of {@link GetSatStatus }
     * 
     */
    public GetSatStatus createGetSatStatus() {
        return new GetSatStatus();
    }

    /**
     * Create an instance of {@link GetRelatedResponse }
     * 
     */
    public GetRelatedResponse createGetRelatedResponse() {
        return new GetRelatedResponse();
    }

    /**
     * Create an instance of {@link GetOutPending }
     * 
     */
    public GetOutPending createGetOutPending() {
        return new GetOutPending();
    }

    /**
     * Create an instance of {@link GetRelated }
     * 
     */
    public GetRelated createGetRelated() {
        return new GetRelated();
    }

    /**
     * Create an instance of {@link GetOutRelated }
     * 
     */
    public GetOutRelated createGetOutRelated() {
        return new GetOutRelated();
    }

    /**
     * Create an instance of {@link GetPending }
     * 
     */
    public GetPending createGetPending() {
        return new GetPending();
    }

    /**
     * Create an instance of {@link GetOutSatStatus }
     * 
     */
    public GetOutSatStatus createGetOutSatStatus() {
        return new GetOutSatStatus();
    }

    /**
     * Create an instance of {@link CancelSignatureResponse }
     * 
     */
    public CancelSignatureResponse createCancelSignatureResponse() {
        return new CancelSignatureResponse();
    }

    /**
     * Create an instance of {@link GetPendingResponse }
     * 
     */
    public GetPendingResponse createGetPendingResponse() {
        return new GetPendingResponse();
    }

    /**
     * Create an instance of {@link OutCancel }
     * 
     */
    public OutCancel createOutCancel() {
        return new OutCancel();
    }

    /**
     * Create an instance of {@link AcceptRejectResponse }
     * 
     */
    public AcceptRejectResponse createAcceptRejectResponse() {
        return new AcceptRejectResponse();
    }

    /**
     * Create an instance of {@link GetOutRelatedResponse }
     * 
     */
    public GetOutRelatedResponse createGetOutRelatedResponse() {
        return new GetOutRelatedResponse();
    }

    /**
     * Create an instance of {@link QueryPendingCancellationResponse }
     * 
     */
    public QueryPendingCancellationResponse createQueryPendingCancellationResponse() {
        return new QueryPendingCancellationResponse();
    }

    /**
     * Create an instance of {@link GetReceipt }
     * 
     */
    public GetReceipt createGetReceipt() {
        return new GetReceipt();
    }

    /**
     * Create an instance of {@link GetReceiptResponse }
     * 
     */
    public GetReceiptResponse createGetReceiptResponse() {
        return new GetReceiptResponse();
    }

    /**
     * Create an instance of {@link QueryPendingCancellation }
     * 
     */
    public QueryPendingCancellation createQueryPendingCancellation() {
        return new QueryPendingCancellation();
    }

    /**
     * Create an instance of {@link CancelSignature }
     * 
     */
    public CancelSignature createCancelSignature() {
        return new CancelSignature();
    }

    /**
     * Create an instance of {@link GetSatStatusResponse }
     * 
     */
    public GetSatStatusResponse createGetSatStatusResponse() {
        return new GetSatStatusResponse();
    }

    /**
     * Create an instance of {@link OutAcceptRejectResponse }
     * 
     */
    public OutAcceptRejectResponse createOutAcceptRejectResponse() {
        return new OutAcceptRejectResponse();
    }

    /**
     * Create an instance of {@link GetOutSatStatusResponse }
     * 
     */
    public GetOutSatStatusResponse createGetOutSatStatusResponse() {
        return new GetOutSatStatusResponse();
    }

    /**
     * Create an instance of {@link OutCancelResponse }
     * 
     */
    public OutCancelResponse createOutCancelResponse() {
        return new OutCancelResponse();
    }

    /**
     * Create an instance of {@link SignCancelResponse }
     * 
     */
    public SignCancelResponse createSignCancelResponse() {
        return new SignCancelResponse();
    }

    /**
     * Create an instance of {@link SignCancel }
     * 
     */
    public SignCancel createSignCancel() {
        return new SignCancel();
    }

    /**
     * Create an instance of {@link GetOutPendingResponse }
     * 
     */
    public GetOutPendingResponse createGetOutPendingResponse() {
        return new GetOutPendingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelated }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_related")
    public JAXBElement<GetRelated> createGetRelated(GetRelated value) {
        return new JAXBElement<GetRelated>(_GetRelated_QNAME, GetRelated.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPending }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_pending")
    public JAXBElement<GetPending> createGetPending(GetPending value) {
        return new JAXBElement<GetPending>(_GetPending_QNAME, GetPending.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancellation", name = "stringArray")
    public JAXBElement<StringArray> createStringArray(StringArray value) {
        return new JAXBElement<StringArray>(_StringArray_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRelatedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_relatedResponse")
    public JAXBElement<GetRelatedResponse> createGetRelatedResponse(GetRelatedResponse value) {
        return new JAXBElement<GetRelatedResponse>(_GetRelatedResponse_QNAME, GetRelatedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolioArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "FolioArray")
    public JAXBElement<FolioArray> createFolioArray(FolioArray value) {
        return new JAXBElement<FolioArray>(_FolioArray_QNAME, FolioArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcuseSatEstatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "AcuseSatEstatus")
    public JAXBElement<AcuseSatEstatus> createAcuseSatEstatus(AcuseSatEstatus value) {
        return new JAXBElement<AcuseSatEstatus>(_AcuseSatEstatus_QNAME, AcuseSatEstatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "cancelResponse")
    public JAXBElement<CancelResponse> createCancelResponse(CancelResponse value) {
        return new JAXBElement<CancelResponse>(_CancelResponse_QNAME, CancelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptReject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "accept_reject")
    public JAXBElement<AcceptReject> createAcceptReject(AcceptReject value) {
        return new JAXBElement<AcceptReject>(_AcceptReject_QNAME, AcceptReject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOutRelatedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_out_relatedResponse")
    public JAXBElement<GetOutRelatedResponse> createGetOutRelatedResponse(GetOutRelatedResponse value) {
        return new JAXBElement<GetOutRelatedResponse>(_GetOutRelatedResponse_QNAME, GetOutRelatedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReceipt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_receipt")
    public JAXBElement<GetReceipt> createGetReceipt(GetReceipt value) {
        return new JAXBElement<GetReceipt>(_GetReceipt_QNAME, GetReceipt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UUIDS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "UUIDS")
    public JAXBElement<UUIDS> createUUIDS(UUIDS value) {
        return new JAXBElement<UUIDS>(_UUIDS_QNAME, UUIDS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPendingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_pendingResponse")
    public JAXBElement<GetPendingResponse> createGetPendingResponse(GetPendingResponse value) {
        return new JAXBElement<GetPendingResponse>(_GetPendingResponse_QNAME, GetPendingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptRejectResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "AcceptRejectResult")
    public JAXBElement<AcceptRejectResult> createAcceptRejectResult(AcceptRejectResult value) {
        return new JAXBElement<AcceptRejectResult>(_AcceptRejectResult_QNAME, AcceptRejectResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOutSatStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_out_sat_status")
    public JAXBElement<GetOutSatStatus> createGetOutSatStatus(GetOutSatStatus value) {
        return new JAXBElement<GetOutSatStatus>(_GetOutSatStatus_QNAME, GetOutSatStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutCancelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "out_cancelResponse")
    public JAXBElement<OutCancelResponse> createOutCancelResponse(OutCancelResponse value) {
        return new JAXBElement<OutCancelResponse>(_OutCancelResponse_QNAME, OutCancelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPendingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "CancelPendingResult")
    public JAXBElement<CancelPendingResult> createCancelPendingResult(CancelPendingResult value) {
        return new JAXBElement<CancelPendingResult>(_CancelPendingResult_QNAME, CancelPendingResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PadreArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "PadreArray")
    public JAXBElement<PadreArray> createPadreArray(PadreArray value) {
        return new JAXBElement<PadreArray>(_PadreArray_QNAME, PadreArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelSignature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "cancel_signature")
    public JAXBElement<CancelSignature> createCancelSignature(CancelSignature value) {
        return new JAXBElement<CancelSignature>(_CancelSignature_QNAME, CancelSignature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelaCFDResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "CancelaCFDResult")
    public JAXBElement<CancelaCFDResult> createCancelaCFDResult(CancelaCFDResult value) {
        return new JAXBElement<CancelaCFDResult>(_CancelaCFDResult_QNAME, CancelaCFDResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Acepta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "Acepta")
    public JAXBElement<Acepta> createAcepta(Acepta value) {
        return new JAXBElement<Acepta>(_Acepta_QNAME, Acepta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UUIDAR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "UUID_AR")
    public JAXBElement<UUIDAR> createUUIDAR(UUIDAR value) {
        return new JAXBElement<UUIDAR>(_UUIDAR_QNAME, UUIDAR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOutPendingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_out_pendingResponse")
    public JAXBElement<GetOutPendingResponse> createGetOutPendingResponse(GetOutPendingResponse value) {
        return new JAXBElement<GetOutPendingResponse>(_GetOutPendingResponse_QNAME, GetOutPendingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hijo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "Hijo")
    public JAXBElement<Hijo> createHijo(Hijo value) {
        return new JAXBElement<Hijo>(_Hijo_QNAME, Hijo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignCancelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "sign_cancelResponse")
    public JAXBElement<SignCancelResponse> createSignCancelResponse(SignCancelResponse value) {
        return new JAXBElement<SignCancelResponse>(_SignCancelResponse_QNAME, SignCancelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Folio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "Folio")
    public JAXBElement<Folio> createFolio(Folio value) {
        return new JAXBElement<Folio>(_Folio_QNAME, Folio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOutPending }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_out_pending")
    public JAXBElement<GetOutPending> createGetOutPending(GetOutPending value) {
        return new JAXBElement<GetOutPending>(_GetOutPending_QNAME, GetOutPending.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOutRelated }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_out_related")
    public JAXBElement<GetOutRelated> createGetOutRelated(GetOutRelated value) {
        return new JAXBElement<GetOutRelated>(_GetOutRelated_QNAME, GetOutRelated.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSatStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_sat_status")
    public JAXBElement<GetSatStatus> createGetSatStatus(GetSatStatus value) {
        return new JAXBElement<GetSatStatus>(_GetSatStatus_QNAME, GetSatStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HijoArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "HijoArray")
    public JAXBElement<HijoArray> createHijoArray(HijoArray value) {
        return new JAXBElement<HijoArray>(_HijoArray_QNAME, HijoArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutAcceptReject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "out_accept_reject")
    public JAXBElement<OutAcceptReject> createOutAcceptReject(OutAcceptReject value) {
        return new JAXBElement<OutAcceptReject>(_OutAcceptReject_QNAME, OutAcceptReject.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Padre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "Padre")
    public JAXBElement<Padre> createPadre(Padre value) {
        return new JAXBElement<Padre>(_Padre_QNAME, Padre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cancel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "cancel")
    public JAXBElement<Cancel> createCancel(Cancel value) {
        return new JAXBElement<Cancel>(_Cancel_QNAME, Cancel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UUIDSAR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "UUIDS_AR")
    public JAXBElement<UUIDSAR> createUUIDSAR(UUIDSAR value) {
        return new JAXBElement<UUIDSAR>(_UUIDSAR_QNAME, UUIDSAR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptRejectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "accept_rejectResponse")
    public JAXBElement<AcceptRejectResponse> createAcceptRejectResponse(AcceptRejectResponse value) {
        return new JAXBElement<AcceptRejectResponse>(_AcceptRejectResponse_QNAME, AcceptRejectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPendingCancellationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "query_pending_cancellationResponse")
    public JAXBElement<QueryPendingCancellationResponse> createQueryPendingCancellationResponse(QueryPendingCancellationResponse value) {
        return new JAXBElement<QueryPendingCancellationResponse>(_QueryPendingCancellationResponse_QNAME, QueryPendingCancellationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReceiptResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_receiptResponse")
    public JAXBElement<GetReceiptResponse> createGetReceiptResponse(GetReceiptResponse value) {
        return new JAXBElement<GetReceiptResponse>(_GetReceiptResponse_QNAME, GetReceiptResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rechaza }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "Rechaza")
    public JAXBElement<Rechaza> createRechaza(Rechaza value) {
        return new JAXBElement<Rechaza>(_Rechaza_QNAME, Rechaza.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutCancel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "out_cancel")
    public JAXBElement<OutCancel> createOutCancel(OutCancel value) {
        return new JAXBElement<OutCancel>(_OutCancel_QNAME, OutCancel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UUIDARArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "UUID_ARArray")
    public JAXBElement<UUIDARArray> createUUIDARArray(UUIDARArray value) {
        return new JAXBElement<UUIDARArray>(_UUIDARArray_QNAME, UUIDARArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelSignatureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "cancel_signatureResponse")
    public JAXBElement<CancelSignatureResponse> createCancelSignatureResponse(CancelSignatureResponse value) {
        return new JAXBElement<CancelSignatureResponse>(_CancelSignatureResponse_QNAME, CancelSignatureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOutSatStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_out_sat_statusResponse")
    public JAXBElement<GetOutSatStatusResponse> createGetOutSatStatusResponse(GetOutSatStatusResponse value) {
        return new JAXBElement<GetOutSatStatusResponse>(_GetOutSatStatusResponse_QNAME, GetOutSatStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutAcceptRejectResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "out_accept_rejectResponse")
    public JAXBElement<OutAcceptRejectResponse> createOutAcceptRejectResponse(OutAcceptRejectResponse value) {
        return new JAXBElement<OutAcceptRejectResponse>(_OutAcceptRejectResponse_QNAME, OutAcceptRejectResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "RelatedResult")
    public JAXBElement<RelatedResult> createRelatedResult(RelatedResult value) {
        return new JAXBElement<RelatedResult>(_RelatedResult_QNAME, RelatedResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPendingCancellation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "query_pending_cancellation")
    public JAXBElement<QueryPendingCancellation> createQueryPendingCancellation(QueryPendingCancellation value) {
        return new JAXBElement<QueryPendingCancellation>(_QueryPendingCancellation_QNAME, QueryPendingCancellation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSatStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_sat_statusResponse")
    public JAXBElement<GetSatStatusResponse> createGetSatStatusResponse(GetSatStatusResponse value) {
        return new JAXBElement<GetSatStatusResponse>(_GetSatStatusResponse_QNAME, GetSatStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPendingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "QueryPendingResult")
    public JAXBElement<QueryPendingResult> createQueryPendingResult(QueryPendingResult value) {
        return new JAXBElement<QueryPendingResult>(_QueryPendingResult_QNAME, QueryPendingResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcuseSATConsulta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "AcuseSATConsulta")
    public JAXBElement<AcuseSATConsulta> createAcuseSATConsulta(AcuseSATConsulta value) {
        return new JAXBElement<AcuseSATConsulta>(_AcuseSATConsulta_QNAME, AcuseSATConsulta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AceptaArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "AceptaArray")
    public JAXBElement<AceptaArray> createAceptaArray(AceptaArray value) {
        return new JAXBElement<AceptaArray>(_AceptaArray_QNAME, AceptaArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechazaArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "RechazaArray")
    public JAXBElement<RechazaArray> createRechazaArray(RechazaArray value) {
        return new JAXBElement<RechazaArray>(_RechazaArray_QNAME, RechazaArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "ReceiptResult")
    public JAXBElement<ReceiptResult> createReceiptResult(ReceiptResult value) {
        return new JAXBElement<ReceiptResult>(_ReceiptResult_QNAME, ReceiptResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignCancel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "sign_cancel")
    public JAXBElement<SignCancel> createSignCancel(SignCancel value) {
        return new JAXBElement<SignCancel>(_SignCancel_QNAME, SignCancel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "rtaxpayer_id", scope = GetOutRelated.class)
    public JAXBElement<String> createGetOutRelatedRtaxpayerId(String value) {
        return new JAXBElement<String>(_GetOutRelatedRtaxpayerId_QNAME, String.class, GetOutRelated.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "uuid", scope = GetOutRelated.class)
    public JAXBElement<String> createGetOutRelatedUuid(String value) {
        return new JAXBElement<String>(_GetOutRelatedUuid_QNAME, String.class, GetOutRelated.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "key", scope = GetOutRelated.class)
    public JAXBElement<byte[]> createGetOutRelatedKey(byte[] value) {
        return new JAXBElement<byte[]>(_GetOutRelatedKey_QNAME, byte[].class, GetOutRelated.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "username", scope = GetOutRelated.class)
    public JAXBElement<String> createGetOutRelatedUsername(String value) {
        return new JAXBElement<String>(_GetOutRelatedUsername_QNAME, String.class, GetOutRelated.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "cer", scope = GetOutRelated.class)
    public JAXBElement<byte[]> createGetOutRelatedCer(byte[] value) {
        return new JAXBElement<byte[]>(_GetOutRelatedCer_QNAME, byte[].class, GetOutRelated.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "password", scope = GetOutRelated.class)
    public JAXBElement<String> createGetOutRelatedPassword(String value) {
        return new JAXBElement<String>(_GetOutRelatedPassword_QNAME, String.class, GetOutRelated.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelaCFDResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "out_cancelResult", scope = OutCancelResponse.class)
    public JAXBElement<CancelaCFDResult> createOutCancelResponseOutCancelResult(CancelaCFDResult value) {
        return new JAXBElement<CancelaCFDResult>(_OutCancelResponseOutCancelResult_QNAME, CancelaCFDResult.class, OutCancelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "rtaxpayer_id", scope = GetOutSatStatus.class)
    public JAXBElement<String> createGetOutSatStatusRtaxpayerId(String value) {
        return new JAXBElement<String>(_GetOutRelatedRtaxpayerId_QNAME, String.class, GetOutSatStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "uuid", scope = GetOutSatStatus.class)
    public JAXBElement<String> createGetOutSatStatusUuid(String value) {
        return new JAXBElement<String>(_GetOutRelatedUuid_QNAME, String.class, GetOutSatStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "username", scope = GetOutSatStatus.class)
    public JAXBElement<String> createGetOutSatStatusUsername(String value) {
        return new JAXBElement<String>(_GetOutRelatedUsername_QNAME, String.class, GetOutSatStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "taxpayer_id", scope = GetOutSatStatus.class)
    public JAXBElement<String> createGetOutSatStatusTaxpayerId(String value) {
        return new JAXBElement<String>(_GetOutSatStatusTaxpayerId_QNAME, String.class, GetOutSatStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "password", scope = GetOutSatStatus.class)
    public JAXBElement<String> createGetOutSatStatusPassword(String value) {
        return new JAXBElement<String>(_GetOutRelatedPassword_QNAME, String.class, GetOutSatStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "total", scope = GetOutSatStatus.class)
    public JAXBElement<String> createGetOutSatStatusTotal(String value) {
        return new JAXBElement<String>(_GetOutSatStatusTotal_QNAME, String.class, GetOutSatStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelaCFDResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "cancel_signatureResult", scope = CancelSignatureResponse.class)
    public JAXBElement<CancelaCFDResult> createCancelSignatureResponseCancelSignatureResult(CancelaCFDResult value) {
        return new JAXBElement<CancelaCFDResult>(_CancelSignatureResponseCancelSignatureResult_QNAME, CancelaCFDResult.class, CancelSignatureResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "error", scope = AcuseSatEstatus.class)
    public JAXBElement<String> createAcuseSatEstatusError(String value) {
        return new JAXBElement<String>(_AcuseSatEstatusError_QNAME, String.class, AcuseSatEstatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcuseSATConsulta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "sat", scope = AcuseSatEstatus.class)
    public JAXBElement<AcuseSATConsulta> createAcuseSatEstatusSat(AcuseSATConsulta value) {
        return new JAXBElement<AcuseSATConsulta>(_AcuseSatEstatusSat_QNAME, AcuseSATConsulta.class, AcuseSatEstatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "type", scope = GetReceipt.class)
    public JAXBElement<String> createGetReceiptType(String value) {
        return new JAXBElement<String>(_GetReceiptType_QNAME, String.class, GetReceipt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "uuid", scope = GetReceipt.class)
    public JAXBElement<String> createGetReceiptUuid(String value) {
        return new JAXBElement<String>(_GetOutRelatedUuid_QNAME, String.class, GetReceipt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "username", scope = GetReceipt.class)
    public JAXBElement<String> createGetReceiptUsername(String value) {
        return new JAXBElement<String>(_GetOutRelatedUsername_QNAME, String.class, GetReceipt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "taxpayer_id", scope = GetReceipt.class)
    public JAXBElement<String> createGetReceiptTaxpayerId(String value) {
        return new JAXBElement<String>(_GetOutSatStatusTaxpayerId_QNAME, String.class, GetReceipt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "password", scope = GetReceipt.class)
    public JAXBElement<String> createGetReceiptPassword(String value) {
        return new JAXBElement<String>(_GetOutRelatedPassword_QNAME, String.class, GetReceipt.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "rtaxpayer_id", scope = GetOutPending.class)
    public JAXBElement<String> createGetOutPendingRtaxpayerId(String value) {
        return new JAXBElement<String>(_GetOutRelatedRtaxpayerId_QNAME, String.class, GetOutPending.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "username", scope = GetOutPending.class)
    public JAXBElement<String> createGetOutPendingUsername(String value) {
        return new JAXBElement<String>(_GetOutRelatedUsername_QNAME, String.class, GetOutPending.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "password", scope = GetOutPending.class)
    public JAXBElement<String> createGetOutPendingPassword(String value) {
        return new JAXBElement<String>(_GetOutRelatedPassword_QNAME, String.class, GetOutPending.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_relatedResult", scope = GetRelatedResponse.class)
    public JAXBElement<RelatedResult> createGetRelatedResponseGetRelatedResult(RelatedResult value) {
        return new JAXBElement<RelatedResult>(_GetRelatedResponseGetRelatedResult_QNAME, RelatedResult.class, GetRelatedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "uuid", scope = Rechaza.class)
    public JAXBElement<String> createRechazaUuid(String value) {
        return new JAXBElement<String>(_RechazaUuid_QNAME, String.class, Rechaza.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "status", scope = Rechaza.class)
    public JAXBElement<String> createRechazaStatus(String value) {
        return new JAXBElement<String>(_RechazaStatus_QNAME, String.class, Rechaza.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UUIDS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "UUIDS", scope = SignCancel.class)
    public JAXBElement<UUIDS> createSignCancelUUIDS(UUIDS value) {
        return new JAXBElement<UUIDS>(_SignCancelUUIDS_QNAME, UUIDS.class, SignCancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "username", scope = SignCancel.class)
    public JAXBElement<String> createSignCancelUsername(String value) {
        return new JAXBElement<String>(_GetOutRelatedUsername_QNAME, String.class, SignCancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "serial", scope = SignCancel.class)
    public JAXBElement<String> createSignCancelSerial(String value) {
        return new JAXBElement<String>(_SignCancelSerial_QNAME, String.class, SignCancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "taxpayer_id", scope = SignCancel.class)
    public JAXBElement<String> createSignCancelTaxpayerId(String value) {
        return new JAXBElement<String>(_GetOutSatStatusTaxpayerId_QNAME, String.class, SignCancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "store_pending", scope = SignCancel.class)
    public JAXBElement<Boolean> createSignCancelStorePending(Boolean value) {
        return new JAXBElement<Boolean>(_SignCancelStorePending_QNAME, Boolean.class, SignCancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "password", scope = SignCancel.class)
    public JAXBElement<String> createSignCancelPassword(String value) {
        return new JAXBElement<String>(_GetOutRelatedPassword_QNAME, String.class, SignCancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "username", scope = CancelSignature.class)
    public JAXBElement<String> createCancelSignatureUsername(String value) {
        return new JAXBElement<String>(_GetOutRelatedUsername_QNAME, String.class, CancelSignature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "xml", scope = CancelSignature.class)
    public JAXBElement<byte[]> createCancelSignatureXml(byte[] value) {
        return new JAXBElement<byte[]>(_CancelSignatureXml_QNAME, byte[].class, CancelSignature.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "store_pending", scope = CancelSignature.class)
    public JAXBElement<Boolean> createCancelSignatureStorePending(Boolean value) {
        return new JAXBElement<Boolean>(_SignCancelStorePending_QNAME, Boolean.class, CancelSignature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "password", scope = CancelSignature.class)
    public JAXBElement<String> createCancelSignaturePassword(String value) {
        return new JAXBElement<String>(_GetOutRelatedPassword_QNAME, String.class, CancelSignature.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "uuid", scope = Acepta.class)
    public JAXBElement<String> createAceptaUuid(String value) {
        return new JAXBElement<String>(_RechazaUuid_QNAME, String.class, Acepta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "status", scope = Acepta.class)
    public JAXBElement<String> createAceptaStatus(String value) {
        return new JAXBElement<String>(_RechazaStatus_QNAME, String.class, Acepta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "rtaxpayer_id", scope = GetRelated.class)
    public JAXBElement<String> createGetRelatedRtaxpayerId(String value) {
        return new JAXBElement<String>(_GetOutRelatedRtaxpayerId_QNAME, String.class, GetRelated.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "uuid", scope = GetRelated.class)
    public JAXBElement<String> createGetRelatedUuid(String value) {
        return new JAXBElement<String>(_GetOutRelatedUuid_QNAME, String.class, GetRelated.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "key", scope = GetRelated.class)
    public JAXBElement<byte[]> createGetRelatedKey(byte[] value) {
        return new JAXBElement<byte[]>(_GetOutRelatedKey_QNAME, byte[].class, GetRelated.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "username", scope = GetRelated.class)
    public JAXBElement<String> createGetRelatedUsername(String value) {
        return new JAXBElement<String>(_GetOutRelatedUsername_QNAME, String.class, GetRelated.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "cer", scope = GetRelated.class)
    public JAXBElement<byte[]> createGetRelatedCer(byte[] value) {
        return new JAXBElement<byte[]>(_GetOutRelatedCer_QNAME, byte[].class, GetRelated.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "password", scope = GetRelated.class)
    public JAXBElement<String> createGetRelatedPassword(String value) {
        return new JAXBElement<String>(_GetOutRelatedPassword_QNAME, String.class, GetRelated.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPendingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "query_pending_cancellationResult", scope = QueryPendingCancellationResponse.class)
    public JAXBElement<QueryPendingResult> createQueryPendingCancellationResponseQueryPendingCancellationResult(QueryPendingResult value) {
        return new JAXBElement<QueryPendingResult>(_QueryPendingCancellationResponseQueryPendingCancellationResult_QNAME, QueryPendingResult.class, QueryPendingCancellationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPendingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_out_pendingResult", scope = GetOutPendingResponse.class)
    public JAXBElement<CancelPendingResult> createGetOutPendingResponseGetOutPendingResult(CancelPendingResult value) {
        return new JAXBElement<CancelPendingResult>(_GetOutPendingResponseGetOutPendingResult_QNAME, CancelPendingResult.class, GetOutPendingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelPendingResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_pendingResult", scope = GetPendingResponse.class)
    public JAXBElement<CancelPendingResult> createGetPendingResponseGetPendingResult(CancelPendingResult value) {
        return new JAXBElement<CancelPendingResult>(_GetPendingResponseGetPendingResult_QNAME, CancelPendingResult.class, GetPendingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "rtaxpayer_id", scope = GetSatStatus.class)
    public JAXBElement<String> createGetSatStatusRtaxpayerId(String value) {
        return new JAXBElement<String>(_GetOutRelatedRtaxpayerId_QNAME, String.class, GetSatStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "uuid", scope = GetSatStatus.class)
    public JAXBElement<String> createGetSatStatusUuid(String value) {
        return new JAXBElement<String>(_GetOutRelatedUuid_QNAME, String.class, GetSatStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "username", scope = GetSatStatus.class)
    public JAXBElement<String> createGetSatStatusUsername(String value) {
        return new JAXBElement<String>(_GetOutRelatedUsername_QNAME, String.class, GetSatStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "taxpayer_id", scope = GetSatStatus.class)
    public JAXBElement<String> createGetSatStatusTaxpayerId(String value) {
        return new JAXBElement<String>(_GetOutSatStatusTaxpayerId_QNAME, String.class, GetSatStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "password", scope = GetSatStatus.class)
    public JAXBElement<String> createGetSatStatusPassword(String value) {
        return new JAXBElement<String>(_GetOutRelatedPassword_QNAME, String.class, GetSatStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "total", scope = GetSatStatus.class)
    public JAXBElement<String> createGetSatStatusTotal(String value) {
        return new JAXBElement<String>(_GetOutSatStatusTotal_QNAME, String.class, GetSatStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelaCFDResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "sign_cancelResult", scope = SignCancelResponse.class)
    public JAXBElement<CancelaCFDResult> createSignCancelResponseSignCancelResult(CancelaCFDResult value) {
        return new JAXBElement<CancelaCFDResult>(_SignCancelResponseSignCancelResult_QNAME, CancelaCFDResult.class, SignCancelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcuseSatEstatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_out_sat_statusResult", scope = GetOutSatStatusResponse.class)
    public JAXBElement<AcuseSatEstatus> createGetOutSatStatusResponseGetOutSatStatusResult(AcuseSatEstatus value) {
        return new JAXBElement<AcuseSatEstatus>(_GetOutSatStatusResponseGetOutSatStatusResult_QNAME, AcuseSatEstatus.class, GetOutSatStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcuseSatEstatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_sat_statusResult", scope = GetSatStatusResponse.class)
    public JAXBElement<AcuseSatEstatus> createGetSatStatusResponseGetSatStatusResult(AcuseSatEstatus value) {
        return new JAXBElement<AcuseSatEstatus>(_GetSatStatusResponseGetSatStatusResult_QNAME, AcuseSatEstatus.class, GetSatStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "rtaxpayer_id", scope = OutAcceptReject.class)
    public JAXBElement<String> createOutAcceptRejectRtaxpayerId(String value) {
        return new JAXBElement<String>(_GetOutRelatedRtaxpayerId_QNAME, String.class, OutAcceptReject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "key", scope = OutAcceptReject.class)
    public JAXBElement<byte[]> createOutAcceptRejectKey(byte[] value) {
        return new JAXBElement<byte[]>(_GetOutRelatedKey_QNAME, byte[].class, OutAcceptReject.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "username", scope = OutAcceptReject.class)
    public JAXBElement<String> createOutAcceptRejectUsername(String value) {
        return new JAXBElement<String>(_GetOutRelatedUsername_QNAME, String.class, OutAcceptReject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UUIDAR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "UUID_AR", scope = OutAcceptReject.class)
    public JAXBElement<UUIDAR> createOutAcceptRejectUUIDAR(UUIDAR value) {
        return new JAXBElement<UUIDAR>(_OutAcceptRejectUUIDAR_QNAME, UUIDAR.class, OutAcceptReject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "cer", scope = OutAcceptReject.class)
    public JAXBElement<byte[]> createOutAcceptRejectCer(byte[] value) {
        return new JAXBElement<byte[]>(_GetOutRelatedCer_QNAME, byte[].class, OutAcceptReject.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "password", scope = OutAcceptReject.class)
    public JAXBElement<String> createOutAcceptRejectPassword(String value) {
        return new JAXBElement<String>(_GetOutRelatedPassword_QNAME, String.class, OutAcceptReject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_receiptResult", scope = GetReceiptResponse.class)
    public JAXBElement<ReceiptResult> createGetReceiptResponseGetReceiptResult(ReceiptResult value) {
        return new JAXBElement<ReceiptResult>(_GetReceiptResponseGetReceiptResult_QNAME, ReceiptResult.class, GetReceiptResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptRejectResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "accept_rejectResult", scope = AcceptRejectResponse.class)
    public JAXBElement<AcceptRejectResult> createAcceptRejectResponseAcceptRejectResult(AcceptRejectResult value) {
        return new JAXBElement<AcceptRejectResult>(_AcceptRejectResponseAcceptRejectResult_QNAME, AcceptRejectResult.class, AcceptRejectResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "get_out_relatedResult", scope = GetOutRelatedResponse.class)
    public JAXBElement<RelatedResult> createGetOutRelatedResponseGetOutRelatedResult(RelatedResult value) {
        return new JAXBElement<RelatedResult>(_GetOutRelatedResponseGetOutRelatedResult_QNAME, RelatedResult.class, GetOutRelatedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "rtaxpayer_id", scope = AcceptReject.class)
    public JAXBElement<String> createAcceptRejectRtaxpayerId(String value) {
        return new JAXBElement<String>(_GetOutRelatedRtaxpayerId_QNAME, String.class, AcceptReject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "key", scope = AcceptReject.class)
    public JAXBElement<byte[]> createAcceptRejectKey(byte[] value) {
        return new JAXBElement<byte[]>(_GetOutRelatedKey_QNAME, byte[].class, AcceptReject.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "username", scope = AcceptReject.class)
    public JAXBElement<String> createAcceptRejectUsername(String value) {
        return new JAXBElement<String>(_GetOutRelatedUsername_QNAME, String.class, AcceptReject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UUIDSAR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "UUIDS_AR", scope = AcceptReject.class)
    public JAXBElement<UUIDSAR> createAcceptRejectUUIDSAR(UUIDSAR value) {
        return new JAXBElement<UUIDSAR>(_AcceptRejectUUIDSAR_QNAME, UUIDSAR.class, AcceptReject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "cer", scope = AcceptReject.class)
    public JAXBElement<byte[]> createAcceptRejectCer(byte[] value) {
        return new JAXBElement<byte[]>(_GetOutRelatedCer_QNAME, byte[].class, AcceptReject.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "password", scope = AcceptReject.class)
    public JAXBElement<String> createAcceptRejectPassword(String value) {
        return new JAXBElement<String>(_GetOutRelatedPassword_QNAME, String.class, AcceptReject.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HijoArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "Hijos", scope = RelatedResult.class)
    public JAXBElement<HijoArray> createRelatedResultHijos(HijoArray value) {
        return new JAXBElement<HijoArray>(_RelatedResultHijos_QNAME, HijoArray.class, RelatedResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "error", scope = RelatedResult.class)
    public JAXBElement<String> createRelatedResultError(String value) {
        return new JAXBElement<String>(_AcuseSatEstatusError_QNAME, String.class, RelatedResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PadreArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "Padres", scope = RelatedResult.class)
    public JAXBElement<PadreArray> createRelatedResultPadres(PadreArray value) {
        return new JAXBElement<PadreArray>(_RelatedResultPadres_QNAME, PadreArray.class, RelatedResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "uuid", scope = Padre.class)
    public JAXBElement<String> createPadreUuid(String value) {
        return new JAXBElement<String>(_RechazaUuid_QNAME, String.class, Padre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "emisor", scope = Padre.class)
    public JAXBElement<String> createPadreEmisor(String value) {
        return new JAXBElement<String>(_PadreEmisor_QNAME, String.class, Padre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "receptor", scope = Padre.class)
    public JAXBElement<String> createPadreReceptor(String value) {
        return new JAXBElement<String>(_PadreReceptor_QNAME, String.class, Padre.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UUIDS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "UUIDS", scope = Cancel.class)
    public JAXBElement<UUIDS> createCancelUUIDS(UUIDS value) {
        return new JAXBElement<UUIDS>(_SignCancelUUIDS_QNAME, UUIDS.class, Cancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "key", scope = Cancel.class)
    public JAXBElement<byte[]> createCancelKey(byte[] value) {
        return new JAXBElement<byte[]>(_GetOutRelatedKey_QNAME, byte[].class, Cancel.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "username", scope = Cancel.class)
    public JAXBElement<String> createCancelUsername(String value) {
        return new JAXBElement<String>(_GetOutRelatedUsername_QNAME, String.class, Cancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "taxpayer_id", scope = Cancel.class)
    public JAXBElement<String> createCancelTaxpayerId(String value) {
        return new JAXBElement<String>(_GetOutSatStatusTaxpayerId_QNAME, String.class, Cancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "cer", scope = Cancel.class)
    public JAXBElement<byte[]> createCancelCer(byte[] value) {
        return new JAXBElement<byte[]>(_GetOutRelatedCer_QNAME, byte[].class, Cancel.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "store_pending", scope = Cancel.class)
    public JAXBElement<Boolean> createCancelStorePending(Boolean value) {
        return new JAXBElement<Boolean>(_SignCancelStorePending_QNAME, Boolean.class, Cancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "password", scope = Cancel.class)
    public JAXBElement<String> createCancelPassword(String value) {
        return new JAXBElement<String>(_GetOutRelatedPassword_QNAME, String.class, Cancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "CodEstatus", scope = CancelaCFDResult.class)
    public JAXBElement<String> createCancelaCFDResultCodEstatus(String value) {
        return new JAXBElement<String>(_CancelaCFDResultCodEstatus_QNAME, String.class, CancelaCFDResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolioArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "Folios", scope = CancelaCFDResult.class)
    public JAXBElement<FolioArray> createCancelaCFDResultFolios(FolioArray value) {
        return new JAXBElement<FolioArray>(_CancelaCFDResultFolios_QNAME, FolioArray.class, CancelaCFDResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "RfcEmisor", scope = CancelaCFDResult.class)
    public JAXBElement<String> createCancelaCFDResultRfcEmisor(String value) {
        return new JAXBElement<String>(_CancelaCFDResultRfcEmisor_QNAME, String.class, CancelaCFDResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "Fecha", scope = CancelaCFDResult.class)
    public JAXBElement<String> createCancelaCFDResultFecha(String value) {
        return new JAXBElement<String>(_CancelaCFDResultFecha_QNAME, String.class, CancelaCFDResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "Acuse", scope = CancelaCFDResult.class)
    public JAXBElement<String> createCancelaCFDResultAcuse(String value) {
        return new JAXBElement<String>(_CancelaCFDResultAcuse_QNAME, String.class, CancelaCFDResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "uuid", scope = Hijo.class)
    public JAXBElement<String> createHijoUuid(String value) {
        return new JAXBElement<String>(_RechazaUuid_QNAME, String.class, Hijo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "emisor", scope = Hijo.class)
    public JAXBElement<String> createHijoEmisor(String value) {
        return new JAXBElement<String>(_PadreEmisor_QNAME, String.class, Hijo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "receptor", scope = Hijo.class)
    public JAXBElement<String> createHijoReceptor(String value) {
        return new JAXBElement<String>(_PadreReceptor_QNAME, String.class, Hijo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UUIDARArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "uuids_ar", scope = UUIDSAR.class)
    public JAXBElement<UUIDARArray> createUUIDSARUuidsAr(UUIDARArray value) {
        return new JAXBElement<UUIDARArray>(_UUIDSARUuidsAr_QNAME, UUIDARArray.class, UUIDSAR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "key", scope = OutCancel.class)
    public JAXBElement<byte[]> createOutCancelKey(byte[] value) {
        return new JAXBElement<byte[]>(_GetOutRelatedKey_QNAME, byte[].class, OutCancel.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "username", scope = OutCancel.class)
    public JAXBElement<String> createOutCancelUsername(String value) {
        return new JAXBElement<String>(_GetOutRelatedUsername_QNAME, String.class, OutCancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "xml", scope = OutCancel.class)
    public JAXBElement<byte[]> createOutCancelXml(byte[] value) {
        return new JAXBElement<byte[]>(_CancelSignatureXml_QNAME, byte[].class, OutCancel.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "taxpayer_id", scope = OutCancel.class)
    public JAXBElement<String> createOutCancelTaxpayerId(String value) {
        return new JAXBElement<String>(_GetOutSatStatusTaxpayerId_QNAME, String.class, OutCancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "cer", scope = OutCancel.class)
    public JAXBElement<byte[]> createOutCancelCer(byte[] value) {
        return new JAXBElement<byte[]>(_GetOutRelatedCer_QNAME, byte[].class, OutCancel.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "store_pending", scope = OutCancel.class)
    public JAXBElement<Boolean> createOutCancelStorePending(Boolean value) {
        return new JAXBElement<Boolean>(_SignCancelStorePending_QNAME, Boolean.class, OutCancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "password", scope = OutCancel.class)
    public JAXBElement<String> createOutCancelPassword(String value) {
        return new JAXBElement<String>(_GetOutRelatedPassword_QNAME, String.class, OutCancel.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "error", scope = CancelPendingResult.class)
    public JAXBElement<String> createCancelPendingResultError(String value) {
        return new JAXBElement<String>(_AcuseSatEstatusError_QNAME, String.class, CancelPendingResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "uuids", scope = CancelPendingResult.class)
    public JAXBElement<StringArray> createCancelPendingResultUuids(StringArray value) {
        return new JAXBElement<StringArray>(_CancelPendingResultUuids_QNAME, StringArray.class, CancelPendingResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "uuid", scope = QueryPendingCancellation.class)
    public JAXBElement<String> createQueryPendingCancellationUuid(String value) {
        return new JAXBElement<String>(_GetOutRelatedUuid_QNAME, String.class, QueryPendingCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "username", scope = QueryPendingCancellation.class)
    public JAXBElement<String> createQueryPendingCancellationUsername(String value) {
        return new JAXBElement<String>(_GetOutRelatedUsername_QNAME, String.class, QueryPendingCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "password", scope = QueryPendingCancellation.class)
    public JAXBElement<String> createQueryPendingCancellationPassword(String value) {
        return new JAXBElement<String>(_GetOutRelatedPassword_QNAME, String.class, QueryPendingCancellation.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "respuesta", scope = UUIDAR.class)
    public JAXBElement<String> createUUIDARRespuesta(String value) {
        return new JAXBElement<String>(_UUIDARRespuesta_QNAME, String.class, UUIDAR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "uuid", scope = UUIDAR.class)
    public JAXBElement<String> createUUIDARUuid(String value) {
        return new JAXBElement<String>(_RechazaUuid_QNAME, String.class, UUIDAR.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptRejectResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "out_accept_rejectResult", scope = OutAcceptRejectResponse.class)
    public JAXBElement<AcceptRejectResult> createOutAcceptRejectResponseOutAcceptRejectResult(AcceptRejectResult value) {
        return new JAXBElement<AcceptRejectResult>(_OutAcceptRejectResponseOutAcceptRejectResult_QNAME, AcceptRejectResult.class, OutAcceptRejectResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "uuid", scope = QueryPendingResult.class)
    public JAXBElement<String> createQueryPendingResultUuid(String value) {
        return new JAXBElement<String>(_RechazaUuid_QNAME, String.class, QueryPendingResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "uuid_status", scope = QueryPendingResult.class)
    public JAXBElement<String> createQueryPendingResultUuidStatus(String value) {
        return new JAXBElement<String>(_QueryPendingResultUuidStatus_QNAME, String.class, QueryPendingResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "error", scope = QueryPendingResult.class)
    public JAXBElement<String> createQueryPendingResultError(String value) {
        return new JAXBElement<String>(_AcuseSatEstatusError_QNAME, String.class, QueryPendingResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "status", scope = QueryPendingResult.class)
    public JAXBElement<String> createQueryPendingResultStatus(String value) {
        return new JAXBElement<String>(_RechazaStatus_QNAME, String.class, QueryPendingResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "attempts", scope = QueryPendingResult.class)
    public JAXBElement<String> createQueryPendingResultAttempts(String value) {
        return new JAXBElement<String>(_QueryPendingResultAttempts_QNAME, String.class, QueryPendingResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "next_attempt", scope = QueryPendingResult.class)
    public JAXBElement<String> createQueryPendingResultNextAttempt(String value) {
        return new JAXBElement<String>(_QueryPendingResultNextAttempt_QNAME, String.class, QueryPendingResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "date", scope = QueryPendingResult.class)
    public JAXBElement<String> createQueryPendingResultDate(String value) {
        return new JAXBElement<String>(_QueryPendingResultDate_QNAME, String.class, QueryPendingResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "xml", scope = QueryPendingResult.class)
    public JAXBElement<String> createQueryPendingResultXml(String value) {
        return new JAXBElement<String>(_QueryPendingResultXml_QNAME, String.class, QueryPendingResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "rtaxpayer_id", scope = GetPending.class)
    public JAXBElement<String> createGetPendingRtaxpayerId(String value) {
        return new JAXBElement<String>(_GetOutRelatedRtaxpayerId_QNAME, String.class, GetPending.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "username", scope = GetPending.class)
    public JAXBElement<String> createGetPendingUsername(String value) {
        return new JAXBElement<String>(_GetOutRelatedUsername_QNAME, String.class, GetPending.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "password", scope = GetPending.class)
    public JAXBElement<String> createGetPendingPassword(String value) {
        return new JAXBElement<String>(_GetOutRelatedPassword_QNAME, String.class, GetPending.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "EstatusCancelacion", scope = AcuseSATConsulta.class)
    public JAXBElement<String> createAcuseSATConsultaEstatusCancelacion(String value) {
        return new JAXBElement<String>(_AcuseSATConsultaEstatusCancelacion_QNAME, String.class, AcuseSATConsulta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "Estado", scope = AcuseSATConsulta.class)
    public JAXBElement<String> createAcuseSATConsultaEstado(String value) {
        return new JAXBElement<String>(_AcuseSATConsultaEstado_QNAME, String.class, AcuseSATConsulta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "CodigoEstatus", scope = AcuseSATConsulta.class)
    public JAXBElement<String> createAcuseSATConsultaCodigoEstatus(String value) {
        return new JAXBElement<String>(_AcuseSATConsultaCodigoEstatus_QNAME, String.class, AcuseSATConsulta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "EsCancelable", scope = AcuseSATConsulta.class)
    public JAXBElement<String> createAcuseSATConsultaEsCancelable(String value) {
        return new JAXBElement<String>(_AcuseSATConsultaEsCancelable_QNAME, String.class, AcuseSATConsulta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechazaArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "rechazo", scope = AcceptRejectResult.class)
    public JAXBElement<RechazaArray> createAcceptRejectResultRechazo(RechazaArray value) {
        return new JAXBElement<RechazaArray>(_AcceptRejectResultRechazo_QNAME, RechazaArray.class, AcceptRejectResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AceptaArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "aceptacion", scope = AcceptRejectResult.class)
    public JAXBElement<AceptaArray> createAcceptRejectResultAceptacion(AceptaArray value) {
        return new JAXBElement<AceptaArray>(_AcceptRejectResultAceptacion_QNAME, AceptaArray.class, AcceptRejectResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "error", scope = AcceptRejectResult.class)
    public JAXBElement<String> createAcceptRejectResultError(String value) {
        return new JAXBElement<String>(_AcuseSatEstatusError_QNAME, String.class, AcceptRejectResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "EstatusCancelacion", scope = Folio.class)
    public JAXBElement<String> createFolioEstatusCancelacion(String value) {
        return new JAXBElement<String>(_AcuseSATConsultaEstatusCancelacion_QNAME, String.class, Folio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "UUID", scope = Folio.class)
    public JAXBElement<String> createFolioUUID(String value) {
        return new JAXBElement<String>(_FolioUUID_QNAME, String.class, Folio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "EstatusUUID", scope = Folio.class)
    public JAXBElement<String> createFolioEstatusUUID(String value) {
        return new JAXBElement<String>(_FolioEstatusUUID_QNAME, String.class, Folio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "uuids", scope = UUIDS.class)
    public JAXBElement<StringArray> createUUIDSUuids(StringArray value) {
        return new JAXBElement<StringArray>(_CancelPendingResultUuids_QNAME, StringArray.class, UUIDS.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelaCFDResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://facturacion.finkok.com/cancel", name = "cancelResult", scope = CancelResponse.class)
    public JAXBElement<CancelaCFDResult> createCancelResponseCancelResult(CancelaCFDResult value) {
        return new JAXBElement<CancelaCFDResult>(_CancelResponseCancelResult_QNAME, CancelaCFDResult.class, CancelResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "receipt", scope = ReceiptResult.class)
    public JAXBElement<String> createReceiptResultReceipt(String value) {
        return new JAXBElement<String>(_ReceiptResultReceipt_QNAME, String.class, ReceiptResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "uuid", scope = ReceiptResult.class)
    public JAXBElement<String> createReceiptResultUuid(String value) {
        return new JAXBElement<String>(_RechazaUuid_QNAME, String.class, ReceiptResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "error", scope = ReceiptResult.class)
    public JAXBElement<String> createReceiptResultError(String value) {
        return new JAXBElement<String>(_AcuseSatEstatusError_QNAME, String.class, ReceiptResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "date", scope = ReceiptResult.class)
    public JAXBElement<String> createReceiptResultDate(String value) {
        return new JAXBElement<String>(_QueryPendingResultDate_QNAME, String.class, ReceiptResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "taxpayer_id", scope = ReceiptResult.class)
    public JAXBElement<String> createReceiptResultTaxpayerId(String value) {
        return new JAXBElement<String>(_ReceiptResultTaxpayerId_QNAME, String.class, ReceiptResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "apps.services.soap.core.views", name = "success", scope = ReceiptResult.class)
    public JAXBElement<Boolean> createReceiptResultSuccess(Boolean value) {
        return new JAXBElement<Boolean>(_ReceiptResultSuccess_QNAME, Boolean.class, ReceiptResult.class, value);
    }

}
