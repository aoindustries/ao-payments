/**
 * BANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResponseBANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.aoindustries.creditcards.sagePayments.transaction_processing;

public class BANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResponseBANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResult  implements java.io.Serializable, org.apache.axis.encoding.AnyContentType {
    private org.apache.axis.message.MessageElement [] _any;

    public BANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResponseBANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResult() {
    }

    public BANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResponseBANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResult(
           org.apache.axis.message.MessageElement [] _any) {
           this._any = _any;
    }


    /**
     * Gets the _any value for this BANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResponseBANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResult.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this BANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResponseBANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResult.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResponseBANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResult)) return false;
        BANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResponseBANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResult other = (BANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResponseBANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResponseBANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.sagepayments.net/web_services/vterm_extensions/TRANSACTION_PROCESSING", ">>BANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResponse>BANKCARD_RETAIL_KEYED_AUTHONLY_WITH_AVSResult"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
