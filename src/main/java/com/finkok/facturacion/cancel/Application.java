
package com.finkok.facturacion.cancel;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Application", targetNamespace = "http://facturacion.finkok.com/cancel")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Application {


    /**
     * This method cancels a CFDI by the given enveloped signature
     * 
     * @param password
     * @param xml
     * @param storePending
     * @param username
     * @return
     *     returns com.finkok.facturacion.cancel.CancelaCFDResult
     */
    @WebMethod(operationName = "cancel_signature", action = "cancel_signature")
    @WebResult(name = "cancel_signatureResult", targetNamespace = "http://facturacion.finkok.com/cancel")
    @RequestWrapper(localName = "cancel_signature", targetNamespace = "http://facturacion.finkok.com/cancel", className = "com.finkok.facturacion.cancel.CancelSignature")
    @ResponseWrapper(localName = "cancel_signatureResponse", targetNamespace = "http://facturacion.finkok.com/cancel", className = "com.finkok.facturacion.cancel.CancelSignatureResponse")
    public CancelaCFDResult cancelSignature(
        @WebParam(name = "xml", targetNamespace = "http://facturacion.finkok.com/cancel")
        byte[] xml,
        @WebParam(name = "username", targetNamespace = "http://facturacion.finkok.com/cancel")
        String username,
        @WebParam(name = "password", targetNamespace = "http://facturacion.finkok.com/cancel")
        String password,
        @WebParam(name = "store_pending", targetNamespace = "http://facturacion.finkok.com/cancel")
        Boolean storePending);

    /**
     * This method returns the status of a peding buffer invoice by using an uuid
     * 
     * @param password
     * @param uuid
     * @param username
     * @return
     *     returns com.finkok.facturacion.cancel.QueryPendingResult
     */
    @WebMethod(operationName = "query_pending_cancellation", action = "query_pending_cancellation")
    @WebResult(name = "query_pending_cancellationResult", targetNamespace = "http://facturacion.finkok.com/cancel")
    @RequestWrapper(localName = "query_pending_cancellation", targetNamespace = "http://facturacion.finkok.com/cancel", className = "com.finkok.facturacion.cancel.QueryPendingCancellation")
    @ResponseWrapper(localName = "query_pending_cancellationResponse", targetNamespace = "http://facturacion.finkok.com/cancel", className = "com.finkok.facturacion.cancel.QueryPendingCancellationResponse")
    public QueryPendingResult queryPendingCancellation(
        @WebParam(name = "username", targetNamespace = "http://facturacion.finkok.com/cancel")
        String username,
        @WebParam(name = "password", targetNamespace = "http://facturacion.finkok.com/cancel")
        String password,
        @WebParam(name = "uuid", targetNamespace = "http://facturacion.finkok.com/cancel")
        String uuid);

    /**
     * This method returns a session id for work with the webservices
     * 
     * @param password
     * @param serial
     * @param storePending
     * @param taxpayerId
     * @param uuids
     * @param username
     * @return
     *     returns com.finkok.facturacion.cancel.CancelaCFDResult
     */
    @WebMethod(operationName = "sign_cancel", action = "sign_cancel")
    @WebResult(name = "sign_cancelResult", targetNamespace = "http://facturacion.finkok.com/cancel")
    @RequestWrapper(localName = "sign_cancel", targetNamespace = "http://facturacion.finkok.com/cancel", className = "com.finkok.facturacion.cancel.SignCancel")
    @ResponseWrapper(localName = "sign_cancelResponse", targetNamespace = "http://facturacion.finkok.com/cancel", className = "com.finkok.facturacion.cancel.SignCancelResponse")
    public CancelaCFDResult signCancel(
        @WebParam(name = "UUIDS", targetNamespace = "http://facturacion.finkok.com/cancel")
        UUIDS uuids,
        @WebParam(name = "username", targetNamespace = "http://facturacion.finkok.com/cancel")
        String username,
        @WebParam(name = "password", targetNamespace = "http://facturacion.finkok.com/cancel")
        String password,
        @WebParam(name = "taxpayer_id", targetNamespace = "http://facturacion.finkok.com/cancel")
        String taxpayerId,
        @WebParam(name = "serial", targetNamespace = "http://facturacion.finkok.com/cancel")
        String serial,
        @WebParam(name = "store_pending", targetNamespace = "http://facturacion.finkok.com/cancel")
        Boolean storePending);

    /**
     * This method returns the sat receipt (response) of the cancellation webservice
     * 
     * @param password
     * @param type
     * @param uuid
     * @param taxpayerId
     * @param username
     * @return
     *     returns com.finkok.facturacion.cancel.ReceiptResult
     */
    @WebMethod(operationName = "get_receipt", action = "get_receipt")
    @WebResult(name = "get_receiptResult", targetNamespace = "http://facturacion.finkok.com/cancel")
    @RequestWrapper(localName = "get_receipt", targetNamespace = "http://facturacion.finkok.com/cancel", className = "com.finkok.facturacion.cancel.GetReceipt")
    @ResponseWrapper(localName = "get_receiptResponse", targetNamespace = "http://facturacion.finkok.com/cancel", className = "com.finkok.facturacion.cancel.GetReceiptResponse")
    public ReceiptResult getReceipt(
        @WebParam(name = "username", targetNamespace = "http://facturacion.finkok.com/cancel")
        String username,
        @WebParam(name = "password", targetNamespace = "http://facturacion.finkok.com/cancel")
        String password,
        @WebParam(name = "taxpayer_id", targetNamespace = "http://facturacion.finkok.com/cancel")
        String taxpayerId,
        @WebParam(name = "uuid", targetNamespace = "http://facturacion.finkok.com/cancel")
        String uuid,
        @WebParam(name = "type", targetNamespace = "http://facturacion.finkok.com/cancel")
        String type);

    /**
     * This method returns a session id for work with the webservices
     * 
     * @param cer
     * @param password
     * @param storePending
     * @param taxpayerId
     * @param key
     * @param uuids
     * @param username
     * @return
     *     returns com.finkok.facturacion.cancel.CancelaCFDResult
     */
    @WebMethod(action = "cancel")
    @WebResult(name = "cancelResult", targetNamespace = "http://facturacion.finkok.com/cancel")
    @RequestWrapper(localName = "cancel", targetNamespace = "http://facturacion.finkok.com/cancel", className = "com.finkok.facturacion.cancel.Cancel")
    @ResponseWrapper(localName = "cancelResponse", targetNamespace = "http://facturacion.finkok.com/cancel", className = "com.finkok.facturacion.cancel.CancelResponse")
    public CancelaCFDResult cancel(
        @WebParam(name = "UUIDS", targetNamespace = "http://facturacion.finkok.com/cancel")
        UUIDS uuids,
        @WebParam(name = "username", targetNamespace = "http://facturacion.finkok.com/cancel")
        String username,
        @WebParam(name = "password", targetNamespace = "http://facturacion.finkok.com/cancel")
        String password,
        @WebParam(name = "taxpayer_id", targetNamespace = "http://facturacion.finkok.com/cancel")
        String taxpayerId,
        @WebParam(name = "cer", targetNamespace = "http://facturacion.finkok.com/cancel")
        byte[] cer,
        @WebParam(name = "key", targetNamespace = "http://facturacion.finkok.com/cancel")
        byte[] key,
        @WebParam(name = "store_pending", targetNamespace = "http://facturacion.finkok.com/cancel")
        Boolean storePending);

    /**
     * 
     * @param cer
     * @param password
     * @param xml
     * @param storePending
     * @param taxpayerId
     * @param key
     * @param username
     * @return
     *     returns com.finkok.facturacion.cancel.CancelaCFDResult
     */
    @WebMethod(operationName = "out_cancel", action = "out_cancel")
    @WebResult(name = "out_cancelResult", targetNamespace = "http://facturacion.finkok.com/cancel")
    @RequestWrapper(localName = "out_cancel", targetNamespace = "http://facturacion.finkok.com/cancel", className = "com.finkok.facturacion.cancel.OutCancel")
    @ResponseWrapper(localName = "out_cancelResponse", targetNamespace = "http://facturacion.finkok.com/cancel", className = "com.finkok.facturacion.cancel.OutCancelResponse")
    public CancelaCFDResult outCancel(
        @WebParam(name = "xml", targetNamespace = "http://facturacion.finkok.com/cancel")
        byte[] xml,
        @WebParam(name = "username", targetNamespace = "http://facturacion.finkok.com/cancel")
        String username,
        @WebParam(name = "password", targetNamespace = "http://facturacion.finkok.com/cancel")
        String password,
        @WebParam(name = "taxpayer_id", targetNamespace = "http://facturacion.finkok.com/cancel")
        String taxpayerId,
        @WebParam(name = "cer", targetNamespace = "http://facturacion.finkok.com/cancel")
        byte[] cer,
        @WebParam(name = "key", targetNamespace = "http://facturacion.finkok.com/cancel")
        byte[] key,
        @WebParam(name = "store_pending", targetNamespace = "http://facturacion.finkok.com/cancel")
        Boolean storePending);

}
