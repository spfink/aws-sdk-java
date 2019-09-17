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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyFpgaImageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the new AFI.
     * </p>
     */
    private String fpgaImageId;

    /**
     * <p>
     * The ID of the new AFI.
     * </p>
     * 
     * @param fpgaImageId
     *        The ID of the new AFI.
     */

    public void setFpgaImageId(String fpgaImageId) {
        this.fpgaImageId = fpgaImageId;
    }

    /**
     * <p>
     * The ID of the new AFI.
     * </p>
     * 
     * @return The ID of the new AFI.
     */

    public String getFpgaImageId() {
        return this.fpgaImageId;
    }

    /**
     * <p>
     * The ID of the new AFI.
     * </p>
     * 
     * @param fpgaImageId
     *        The ID of the new AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyFpgaImageResult withFpgaImageId(String fpgaImageId) {
        setFpgaImageId(fpgaImageId);
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
        if (getFpgaImageId() != null)
            sb.append("FpgaImageId: ").append(getFpgaImageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyFpgaImageResult == false)
            return false;
        CopyFpgaImageResult other = (CopyFpgaImageResult) obj;
        if (other.getFpgaImageId() == null ^ this.getFpgaImageId() == null)
            return false;
        if (other.getFpgaImageId() != null && other.getFpgaImageId().equals(this.getFpgaImageId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFpgaImageId() == null) ? 0 : getFpgaImageId().hashCode());
        return hashCode;
    }

    @Override
    public CopyFpgaImageResult clone() {
        try {
            return (CopyFpgaImageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
