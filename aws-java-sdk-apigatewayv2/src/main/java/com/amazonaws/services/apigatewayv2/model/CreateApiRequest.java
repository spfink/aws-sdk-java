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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApiRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An API key selection expression. See <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     * >API Key Selection Expressions</a>.
     * </p>
     */
    private String apiKeySelectionExpression;
    /**
     * <p>
     * The description of the API.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Avoid validating models when creating a deployment.
     * </p>
     */
    private Boolean disableSchemaValidation;
    /**
     * <p>
     * The name of the API.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The API protocol: Currently only WEBSOCKET is supported.
     * </p>
     */
    private String protocolType;
    /**
     * <p>
     * The route selection expression for the API.
     * </p>
     */
    private String routeSelectionExpression;
    /**
     * <p>
     * A version identifier for the API.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters
     * and must not start with aws:. The tag value can be up to 256 characters..
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * An API key selection expression. See <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     * >API Key Selection Expressions</a>.
     * </p>
     * 
     * @param apiKeySelectionExpression
     *        An API key selection expression. See <a href=
     *        "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     *        >API Key Selection Expressions</a>.
     */

    public void setApiKeySelectionExpression(String apiKeySelectionExpression) {
        this.apiKeySelectionExpression = apiKeySelectionExpression;
    }

    /**
     * <p>
     * An API key selection expression. See <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     * >API Key Selection Expressions</a>.
     * </p>
     * 
     * @return An API key selection expression. See <a href=
     *         "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     *         >API Key Selection Expressions</a>.
     */

    public String getApiKeySelectionExpression() {
        return this.apiKeySelectionExpression;
    }

    /**
     * <p>
     * An API key selection expression. See <a href=
     * "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     * >API Key Selection Expressions</a>.
     * </p>
     * 
     * @param apiKeySelectionExpression
     *        An API key selection expression. See <a href=
     *        "https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-apikey-selection-expressions"
     *        >API Key Selection Expressions</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiRequest withApiKeySelectionExpression(String apiKeySelectionExpression) {
        setApiKeySelectionExpression(apiKeySelectionExpression);
        return this;
    }

    /**
     * <p>
     * The description of the API.
     * </p>
     * 
     * @param description
     *        The description of the API.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the API.
     * </p>
     * 
     * @return The description of the API.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the API.
     * </p>
     * 
     * @param description
     *        The description of the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Avoid validating models when creating a deployment.
     * </p>
     * 
     * @param disableSchemaValidation
     *        Avoid validating models when creating a deployment.
     */

    public void setDisableSchemaValidation(Boolean disableSchemaValidation) {
        this.disableSchemaValidation = disableSchemaValidation;
    }

    /**
     * <p>
     * Avoid validating models when creating a deployment.
     * </p>
     * 
     * @return Avoid validating models when creating a deployment.
     */

    public Boolean getDisableSchemaValidation() {
        return this.disableSchemaValidation;
    }

    /**
     * <p>
     * Avoid validating models when creating a deployment.
     * </p>
     * 
     * @param disableSchemaValidation
     *        Avoid validating models when creating a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiRequest withDisableSchemaValidation(Boolean disableSchemaValidation) {
        setDisableSchemaValidation(disableSchemaValidation);
        return this;
    }

    /**
     * <p>
     * Avoid validating models when creating a deployment.
     * </p>
     * 
     * @return Avoid validating models when creating a deployment.
     */

    public Boolean isDisableSchemaValidation() {
        return this.disableSchemaValidation;
    }

    /**
     * <p>
     * The name of the API.
     * </p>
     * 
     * @param name
     *        The name of the API.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the API.
     * </p>
     * 
     * @return The name of the API.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the API.
     * </p>
     * 
     * @param name
     *        The name of the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The API protocol: Currently only WEBSOCKET is supported.
     * </p>
     * 
     * @param protocolType
     *        The API protocol: Currently only WEBSOCKET is supported.
     * @see ProtocolType
     */

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    /**
     * <p>
     * The API protocol: Currently only WEBSOCKET is supported.
     * </p>
     * 
     * @return The API protocol: Currently only WEBSOCKET is supported.
     * @see ProtocolType
     */

    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * <p>
     * The API protocol: Currently only WEBSOCKET is supported.
     * </p>
     * 
     * @param protocolType
     *        The API protocol: Currently only WEBSOCKET is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolType
     */

    public CreateApiRequest withProtocolType(String protocolType) {
        setProtocolType(protocolType);
        return this;
    }

    /**
     * <p>
     * The API protocol: Currently only WEBSOCKET is supported.
     * </p>
     * 
     * @param protocolType
     *        The API protocol: Currently only WEBSOCKET is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolType
     */

    public CreateApiRequest withProtocolType(ProtocolType protocolType) {
        this.protocolType = protocolType.toString();
        return this;
    }

    /**
     * <p>
     * The route selection expression for the API.
     * </p>
     * 
     * @param routeSelectionExpression
     *        The route selection expression for the API.
     */

    public void setRouteSelectionExpression(String routeSelectionExpression) {
        this.routeSelectionExpression = routeSelectionExpression;
    }

    /**
     * <p>
     * The route selection expression for the API.
     * </p>
     * 
     * @return The route selection expression for the API.
     */

    public String getRouteSelectionExpression() {
        return this.routeSelectionExpression;
    }

    /**
     * <p>
     * The route selection expression for the API.
     * </p>
     * 
     * @param routeSelectionExpression
     *        The route selection expression for the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiRequest withRouteSelectionExpression(String routeSelectionExpression) {
        setRouteSelectionExpression(routeSelectionExpression);
        return this;
    }

    /**
     * <p>
     * A version identifier for the API.
     * </p>
     * 
     * @param version
     *        A version identifier for the API.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * A version identifier for the API.
     * </p>
     * 
     * @return A version identifier for the API.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * A version identifier for the API.
     * </p>
     * 
     * @param version
     *        A version identifier for the API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiRequest withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters
     * and must not start with aws:. The tag value can be up to 256 characters..
     * </p>
     * 
     * @return The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128
     *         characters and must not start with aws:. The tag value can be up to 256 characters..
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters
     * and must not start with aws:. The tag value can be up to 256 characters..
     * </p>
     * 
     * @param tags
     *        The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128
     *        characters and must not start with aws:. The tag value can be up to 256 characters..
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters
     * and must not start with aws:. The tag value can be up to 256 characters..
     * </p>
     * 
     * @param tags
     *        The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128
     *        characters and must not start with aws:. The tag value can be up to 256 characters..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateApiRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateApiRequest clearTagsEntries() {
        this.tags = null;
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
        if (getApiKeySelectionExpression() != null)
            sb.append("ApiKeySelectionExpression: ").append(getApiKeySelectionExpression()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisableSchemaValidation() != null)
            sb.append("DisableSchemaValidation: ").append(getDisableSchemaValidation()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getProtocolType() != null)
            sb.append("ProtocolType: ").append(getProtocolType()).append(",");
        if (getRouteSelectionExpression() != null)
            sb.append("RouteSelectionExpression: ").append(getRouteSelectionExpression()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
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

        if (obj instanceof CreateApiRequest == false)
            return false;
        CreateApiRequest other = (CreateApiRequest) obj;
        if (other.getApiKeySelectionExpression() == null ^ this.getApiKeySelectionExpression() == null)
            return false;
        if (other.getApiKeySelectionExpression() != null && other.getApiKeySelectionExpression().equals(this.getApiKeySelectionExpression()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisableSchemaValidation() == null ^ this.getDisableSchemaValidation() == null)
            return false;
        if (other.getDisableSchemaValidation() != null && other.getDisableSchemaValidation().equals(this.getDisableSchemaValidation()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProtocolType() == null ^ this.getProtocolType() == null)
            return false;
        if (other.getProtocolType() != null && other.getProtocolType().equals(this.getProtocolType()) == false)
            return false;
        if (other.getRouteSelectionExpression() == null ^ this.getRouteSelectionExpression() == null)
            return false;
        if (other.getRouteSelectionExpression() != null && other.getRouteSelectionExpression().equals(this.getRouteSelectionExpression()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
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

        hashCode = prime * hashCode + ((getApiKeySelectionExpression() == null) ? 0 : getApiKeySelectionExpression().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisableSchemaValidation() == null) ? 0 : getDisableSchemaValidation().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProtocolType() == null) ? 0 : getProtocolType().hashCode());
        hashCode = prime * hashCode + ((getRouteSelectionExpression() == null) ? 0 : getRouteSelectionExpression().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateApiRequest clone() {
        return (CreateApiRequest) super.clone();
    }

}
