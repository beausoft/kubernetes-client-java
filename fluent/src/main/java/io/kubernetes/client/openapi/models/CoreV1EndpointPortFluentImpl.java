package io.kubernetes.client.openapi.models;

import java.lang.Integer;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

 /**
  * Generated
  */
public class CoreV1EndpointPortFluentImpl<A extends io.kubernetes.client.openapi.models.CoreV1EndpointPortFluent<A>> extends io.kubernetes.client.fluent.BaseFluent<A> implements io.kubernetes.client.openapi.models.CoreV1EndpointPortFluent<A>{
  public CoreV1EndpointPortFluentImpl() {
  }
  public CoreV1EndpointPortFluentImpl(io.kubernetes.client.openapi.models.CoreV1EndpointPort instance) {
    this.withAppProtocol(instance.getAppProtocol());

    this.withName(instance.getName());

    this.withPort(instance.getPort());

    this.withProtocol(instance.getProtocol());

  }
  private java.lang.String appProtocol;
  private java.lang.String name;
  private java.lang.Integer port;
  private io.kubernetes.client.openapi.models.CoreV1EndpointPort.ProtocolEnum protocol;
  public java.lang.String getAppProtocol() {
    return this.appProtocol;
  }
  public A withAppProtocol(java.lang.String appProtocol) {
    this.appProtocol=appProtocol; return (A) this;
  }
  public java.lang.Boolean hasAppProtocol() {
    return this.appProtocol != null;
  }
  
  /**
   * Method is deprecated. use withAppProtocol instead.
   */
  @java.lang.Deprecated
  public A withNewAppProtocol(java.lang.String original) {
    return (A)withAppProtocol(new String(original));
  }
  public java.lang.String getName() {
    return this.name;
  }
  public A withName(java.lang.String name) {
    this.name=name; return (A) this;
  }
  public java.lang.Boolean hasName() {
    return this.name != null;
  }
  
  /**
   * Method is deprecated. use withName instead.
   */
  @java.lang.Deprecated
  public A withNewName(java.lang.String original) {
    return (A)withName(new String(original));
  }
  public java.lang.Integer getPort() {
    return this.port;
  }
  public A withPort(java.lang.Integer port) {
    this.port=port; return (A) this;
  }
  public java.lang.Boolean hasPort() {
    return this.port != null;
  }
  public io.kubernetes.client.openapi.models.CoreV1EndpointPort.ProtocolEnum getProtocol() {
    return this.protocol;
  }
  public A withProtocol(io.kubernetes.client.openapi.models.CoreV1EndpointPort.ProtocolEnum protocol) {
    this.protocol=protocol; return (A) this;
  }
  public java.lang.Boolean hasProtocol() {
    return this.protocol != null;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CoreV1EndpointPortFluentImpl that = (CoreV1EndpointPortFluentImpl) o;
    if (appProtocol != null ? !appProtocol.equals(that.appProtocol) :that.appProtocol != null) return false;
    if (name != null ? !name.equals(that.name) :that.name != null) return false;
    if (port != null ? !port.equals(that.port) :that.port != null) return false;
    if (protocol != null ? !protocol.equals(that.protocol) :that.protocol != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(appProtocol,  name,  port,  protocol,  super.hashCode());
  }
  
}