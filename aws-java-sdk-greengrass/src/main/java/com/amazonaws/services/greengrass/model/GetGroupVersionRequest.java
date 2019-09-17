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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GetGroupVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGroupVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The ID of the Greengrass group. */
    private String groupId;
    /**
     * The ID of the group version. This value maps to the ''Version'' property of the corresponding
     * ''VersionInformation'' object, which is returned by ''ListGroupVersions'' requests. If the version is the last
     * one that was associated with a group, the value also maps to the ''LatestVersion'' property of the corresponding
     * ''GroupInformation'' object.
     */
    private String groupVersionId;

    /**
     * The ID of the Greengrass group.
     * 
     * @param groupId
     *        The ID of the Greengrass group.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * The ID of the Greengrass group.
     * 
     * @return The ID of the Greengrass group.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * The ID of the Greengrass group.
     * 
     * @param groupId
     *        The ID of the Greengrass group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupVersionRequest withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * The ID of the group version. This value maps to the ''Version'' property of the corresponding
     * ''VersionInformation'' object, which is returned by ''ListGroupVersions'' requests. If the version is the last
     * one that was associated with a group, the value also maps to the ''LatestVersion'' property of the corresponding
     * ''GroupInformation'' object.
     * 
     * @param groupVersionId
     *        The ID of the group version. This value maps to the ''Version'' property of the corresponding
     *        ''VersionInformation'' object, which is returned by ''ListGroupVersions'' requests. If the version is the
     *        last one that was associated with a group, the value also maps to the ''LatestVersion'' property of the
     *        corresponding ''GroupInformation'' object.
     */

    public void setGroupVersionId(String groupVersionId) {
        this.groupVersionId = groupVersionId;
    }

    /**
     * The ID of the group version. This value maps to the ''Version'' property of the corresponding
     * ''VersionInformation'' object, which is returned by ''ListGroupVersions'' requests. If the version is the last
     * one that was associated with a group, the value also maps to the ''LatestVersion'' property of the corresponding
     * ''GroupInformation'' object.
     * 
     * @return The ID of the group version. This value maps to the ''Version'' property of the corresponding
     *         ''VersionInformation'' object, which is returned by ''ListGroupVersions'' requests. If the version is the
     *         last one that was associated with a group, the value also maps to the ''LatestVersion'' property of the
     *         corresponding ''GroupInformation'' object.
     */

    public String getGroupVersionId() {
        return this.groupVersionId;
    }

    /**
     * The ID of the group version. This value maps to the ''Version'' property of the corresponding
     * ''VersionInformation'' object, which is returned by ''ListGroupVersions'' requests. If the version is the last
     * one that was associated with a group, the value also maps to the ''LatestVersion'' property of the corresponding
     * ''GroupInformation'' object.
     * 
     * @param groupVersionId
     *        The ID of the group version. This value maps to the ''Version'' property of the corresponding
     *        ''VersionInformation'' object, which is returned by ''ListGroupVersions'' requests. If the version is the
     *        last one that was associated with a group, the value also maps to the ''LatestVersion'' property of the
     *        corresponding ''GroupInformation'' object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGroupVersionRequest withGroupVersionId(String groupVersionId) {
        setGroupVersionId(groupVersionId);
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getGroupVersionId() != null)
            sb.append("GroupVersionId: ").append(getGroupVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGroupVersionRequest == false)
            return false;
        GetGroupVersionRequest other = (GetGroupVersionRequest) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
            return false;
        if (other.getGroupVersionId() == null ^ this.getGroupVersionId() == null)
            return false;
        if (other.getGroupVersionId() != null && other.getGroupVersionId().equals(this.getGroupVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getGroupVersionId() == null) ? 0 : getGroupVersionId().hashCode());
        return hashCode;
    }

    @Override
    public GetGroupVersionRequest clone() {
        return (GetGroupVersionRequest) super.clone();
    }

}
