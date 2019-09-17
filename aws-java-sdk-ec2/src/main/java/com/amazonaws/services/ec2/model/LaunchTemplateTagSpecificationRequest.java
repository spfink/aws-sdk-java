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

/**
 * <p>
 * The tags specification for the launch template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LaunchTemplateTagSpecificationRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateTagSpecificationRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of resource to tag. Currently, the resource types that support tagging on creation are
     * <code>instance</code> and <code>volume</code>. To tag a resource after it has been created, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The tags to apply to the resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The type of resource to tag. Currently, the resource types that support tagging on creation are
     * <code>instance</code> and <code>volume</code>. To tag a resource after it has been created, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to tag. Currently, the resource types that support tagging on creation are
     *        <code>instance</code> and <code>volume</code>. To tag a resource after it has been created, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource to tag. Currently, the resource types that support tagging on creation are
     * <code>instance</code> and <code>volume</code>. To tag a resource after it has been created, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     * </p>
     * 
     * @return The type of resource to tag. Currently, the resource types that support tagging on creation are
     *         <code>instance</code> and <code>volume</code>. To tag a resource after it has been created, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource to tag. Currently, the resource types that support tagging on creation are
     * <code>instance</code> and <code>volume</code>. To tag a resource after it has been created, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to tag. Currently, the resource types that support tagging on creation are
     *        <code>instance</code> and <code>volume</code>. To tag a resource after it has been created, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LaunchTemplateTagSpecificationRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource to tag. Currently, the resource types that support tagging on creation are
     * <code>instance</code> and <code>volume</code>. To tag a resource after it has been created, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to tag. Currently, the resource types that support tagging on creation are
     *        <code>instance</code> and <code>volume</code>. To tag a resource after it has been created, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateTags.html">CreateTags</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LaunchTemplateTagSpecificationRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The tags to apply to the resource.
     * </p>
     * 
     * @return The tags to apply to the resource.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags to apply to the resource.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags to apply to the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateTagSpecificationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags to apply to the resource.
     * </p>
     * 
     * @param tags
     *        The tags to apply to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LaunchTemplateTagSpecificationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateTagSpecificationRequest == false)
            return false;
        LaunchTemplateTagSpecificationRequest other = (LaunchTemplateTagSpecificationRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public LaunchTemplateTagSpecificationRequest clone() {
        try {
            return (LaunchTemplateTagSpecificationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
