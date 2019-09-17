/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details about an event generated by an SaaS partner.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PutPartnerEventsRequestEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutPartnerEventsRequestEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time of the event.
     * </p>
     */
    private java.util.Date time;
    /**
     * <p>
     * The event source that is generating the evntry.
     * </p>
     */
    private String source;
    /**
     * <p>
     * AWS resources, identified by Amazon Resource Name (ARN), that the event primarily concerns. Any number, including
     * zero, can be present.
     * </p>
     */
    private java.util.List<String> resources;
    /**
     * <p>
     * A free-form string used to decide which fields to expect in the event detail.
     * </p>
     */
    private String detailType;
    /**
     * <p>
     * A valid JSON string. There is no other schema imposed. The JSON string can contain fields and nested subobjects.
     * </p>
     */
    private String detail;

    /**
     * <p>
     * The date and time of the event.
     * </p>
     * 
     * @param time
     *        The date and time of the event.
     */

    public void setTime(java.util.Date time) {
        this.time = time;
    }

    /**
     * <p>
     * The date and time of the event.
     * </p>
     * 
     * @return The date and time of the event.
     */

    public java.util.Date getTime() {
        return this.time;
    }

    /**
     * <p>
     * The date and time of the event.
     * </p>
     * 
     * @param time
     *        The date and time of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPartnerEventsRequestEntry withTime(java.util.Date time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * The event source that is generating the evntry.
     * </p>
     * 
     * @param source
     *        The event source that is generating the evntry.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The event source that is generating the evntry.
     * </p>
     * 
     * @return The event source that is generating the evntry.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The event source that is generating the evntry.
     * </p>
     * 
     * @param source
     *        The event source that is generating the evntry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPartnerEventsRequestEntry withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * AWS resources, identified by Amazon Resource Name (ARN), that the event primarily concerns. Any number, including
     * zero, can be present.
     * </p>
     * 
     * @return AWS resources, identified by Amazon Resource Name (ARN), that the event primarily concerns. Any number,
     *         including zero, can be present.
     */

    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * AWS resources, identified by Amazon Resource Name (ARN), that the event primarily concerns. Any number, including
     * zero, can be present.
     * </p>
     * 
     * @param resources
     *        AWS resources, identified by Amazon Resource Name (ARN), that the event primarily concerns. Any number,
     *        including zero, can be present.
     */

    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * AWS resources, identified by Amazon Resource Name (ARN), that the event primarily concerns. Any number, including
     * zero, can be present.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        AWS resources, identified by Amazon Resource Name (ARN), that the event primarily concerns. Any number,
     *        including zero, can be present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPartnerEventsRequestEntry withResources(String... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<String>(resources.length));
        }
        for (String ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * AWS resources, identified by Amazon Resource Name (ARN), that the event primarily concerns. Any number, including
     * zero, can be present.
     * </p>
     * 
     * @param resources
     *        AWS resources, identified by Amazon Resource Name (ARN), that the event primarily concerns. Any number,
     *        including zero, can be present.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPartnerEventsRequestEntry withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * A free-form string used to decide which fields to expect in the event detail.
     * </p>
     * 
     * @param detailType
     *        A free-form string used to decide which fields to expect in the event detail.
     */

    public void setDetailType(String detailType) {
        this.detailType = detailType;
    }

    /**
     * <p>
     * A free-form string used to decide which fields to expect in the event detail.
     * </p>
     * 
     * @return A free-form string used to decide which fields to expect in the event detail.
     */

    public String getDetailType() {
        return this.detailType;
    }

    /**
     * <p>
     * A free-form string used to decide which fields to expect in the event detail.
     * </p>
     * 
     * @param detailType
     *        A free-form string used to decide which fields to expect in the event detail.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPartnerEventsRequestEntry withDetailType(String detailType) {
        setDetailType(detailType);
        return this;
    }

    /**
     * <p>
     * A valid JSON string. There is no other schema imposed. The JSON string can contain fields and nested subobjects.
     * </p>
     * 
     * @param detail
     *        A valid JSON string. There is no other schema imposed. The JSON string can contain fields and nested
     *        subobjects.
     */

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * <p>
     * A valid JSON string. There is no other schema imposed. The JSON string can contain fields and nested subobjects.
     * </p>
     * 
     * @return A valid JSON string. There is no other schema imposed. The JSON string can contain fields and nested
     *         subobjects.
     */

    public String getDetail() {
        return this.detail;
    }

    /**
     * <p>
     * A valid JSON string. There is no other schema imposed. The JSON string can contain fields and nested subobjects.
     * </p>
     * 
     * @param detail
     *        A valid JSON string. There is no other schema imposed. The JSON string can contain fields and nested
     *        subobjects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPartnerEventsRequestEntry withDetail(String detail) {
        setDetail(detail);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTime() != null)
            sb.append("Time: ").append(getTime()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources()).append(",");
        if (getDetailType() != null)
            sb.append("DetailType: ").append(getDetailType()).append(",");
        if (getDetail() != null)
            sb.append("Detail: ").append(getDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutPartnerEventsRequestEntry == false)
            return false;
        PutPartnerEventsRequestEntry other = (PutPartnerEventsRequestEntry) obj;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null && other.getTime().equals(this.getTime()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getDetailType() == null ^ this.getDetailType() == null)
            return false;
        if (other.getDetailType() != null && other.getDetailType().equals(this.getDetailType()) == false)
            return false;
        if (other.getDetail() == null ^ this.getDetail() == null)
            return false;
        if (other.getDetail() != null && other.getDetail().equals(this.getDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getDetailType() == null) ? 0 : getDetailType().hashCode());
        hashCode = prime * hashCode + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return hashCode;
    }

    @Override
    public PutPartnerEventsRequestEntry clone() {
        try {
            return (PutPartnerEventsRequestEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eventbridge.model.transform.PutPartnerEventsRequestEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
