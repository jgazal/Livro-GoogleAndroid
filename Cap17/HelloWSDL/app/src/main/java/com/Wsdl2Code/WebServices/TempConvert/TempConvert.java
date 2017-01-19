package com.Wsdl2Code.WebServices.TempConvert;
//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.6
//
// Date Of Creation: 10/21/2016 7:12:29 PM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//

import android.os.AsyncTask;

import com.Wsdl2Code.WebServices.TempConvert.WS_Enums.SoapProtocolVersion;

import org.ksoap2.HeaderProperty;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.List;

public class TempConvert {

    public String NAMESPACE = "http://www.w3schools.com/xml/";
    public String url = "http://www.w3schools.com/xml/tempconvert.asmx";
    public int timeOut = 60000;
    public IWsdl2CodeEvents eventHandler;
    public SoapProtocolVersion soapVersion;

    public TempConvert() {
    }

    public TempConvert(IWsdl2CodeEvents eventHandler) {
        this.eventHandler = eventHandler;
    }

    public TempConvert(IWsdl2CodeEvents eventHandler, String url) {
        this.eventHandler = eventHandler;
        this.url = url;
    }

    public TempConvert(IWsdl2CodeEvents eventHandler, String url, int timeOutInSeconds) {
        this.eventHandler = eventHandler;
        this.url = url;
        this.setTimeOut(timeOutInSeconds);
    }

    public void setTimeOut(int seconds) {
        this.timeOut = seconds * 1000;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void FahrenheitToCelsiusAsync(String fahrenheit) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires com.Wsdl2Code.WebServices.TempConvert.IWsdl2CodeEvents");
        FahrenheitToCelsiusAsync(fahrenheit, null);
    }

    public void FahrenheitToCelsiusAsync(final String fahrenheit, final List<HeaderProperty> headers) throws Exception {

        new AsyncTask<Void, Void, String>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected String doInBackground(Void... params) {
                return FahrenheitToCelsius(fahrenheit, headers);
            }

            @Override
            protected void onPostExecute(String result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("FahrenheitToCelsius", result);
                }
            }
        }.execute();
    }

    public String FahrenheitToCelsius(String fahrenheit) {
        return FahrenheitToCelsius(fahrenheit, null);
    }

    public String FahrenheitToCelsius(String fahrenheit, List<HeaderProperty> headers) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://www.w3schools.com/xml/", "FahrenheitToCelsius");
        soapReq.addProperty("Fahrenheit", fahrenheit);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            if (headers != null) {
                httpTransport.call("http://www.w3schools.com/xml/FahrenheitToCelsius", soapEnvelope, headers);
            } else {
                httpTransport.call("http://www.w3schools.com/xml/FahrenheitToCelsius", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    } else if (obj != null && obj instanceof String) {
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }

    public void CelsiusToFahrenheitAsync(String celsius) throws Exception {
        if (this.eventHandler == null)
            throw new Exception("Async Methods Requires com.Wsdl2Code.WebServices.TempConvert.IWsdl2CodeEvents");
        CelsiusToFahrenheitAsync(celsius, null);
    }

    public void CelsiusToFahrenheitAsync(final String celsius, final List<HeaderProperty> headers) throws Exception {

        new AsyncTask<Void, Void, String>() {
            @Override
            protected void onPreExecute() {
                eventHandler.Wsdl2CodeStartedRequest();
            }

            ;

            @Override
            protected String doInBackground(Void... params) {
                return CelsiusToFahrenheit(celsius, headers);
            }

            @Override
            protected void onPostExecute(String result) {
                eventHandler.Wsdl2CodeEndedRequest();
                if (result != null) {
                    eventHandler.Wsdl2CodeFinished("CelsiusToFahrenheit", result);
                }
            }
        }.execute();
    }

    public String CelsiusToFahrenheit(String celsius) {
        return CelsiusToFahrenheit(celsius, null);
    }

    public String CelsiusToFahrenheit(String celsius, List<HeaderProperty> headers) {
        SoapSerializationEnvelope soapEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        soapEnvelope.implicitTypes = true;
        soapEnvelope.dotNet = true;
        SoapObject soapReq = new SoapObject("http://www.w3schools.com/xml/", "CelsiusToFahrenheit");
        soapReq.addProperty("Celsius", celsius);
        soapEnvelope.setOutputSoapObject(soapReq);
        HttpTransportSE httpTransport = new HttpTransportSE(url, timeOut);
        try {
            if (headers != null) {
                httpTransport.call("http://www.w3schools.com/xml/CelsiusToFahrenheit", soapEnvelope, headers);
            } else {
                httpTransport.call("http://www.w3schools.com/xml/CelsiusToFahrenheit", soapEnvelope);
            }
            Object retObj = soapEnvelope.bodyIn;
            if (retObj instanceof SoapFault) {
                SoapFault fault = (SoapFault) retObj;
                Exception ex = new Exception(fault.faultstring);
                if (eventHandler != null)
                    eventHandler.Wsdl2CodeFinishedWithException(ex);
            } else {
                SoapObject result = (SoapObject) retObj;
                if (result.getPropertyCount() > 0) {
                    Object obj = result.getProperty(0);
                    if (obj != null && obj.getClass().equals(SoapPrimitive.class)) {
                        SoapPrimitive j = (SoapPrimitive) obj;
                        String resultVariable = j.toString();
                        return resultVariable;
                    } else if (obj != null && obj instanceof String) {
                        String resultVariable = (String) obj;
                        return resultVariable;
                    }
                }
            }
        } catch (Exception e) {
            if (eventHandler != null)
                eventHandler.Wsdl2CodeFinishedWithException(e);
            e.printStackTrace();
        }
        return "";
    }

}