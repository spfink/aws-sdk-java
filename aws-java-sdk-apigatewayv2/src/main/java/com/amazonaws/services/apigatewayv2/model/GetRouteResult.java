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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRouteResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether an API key is required for this route.
     * </p>
     */
    private Boolean apiKeyRequired;
    /**
     * <p>
     * A list of authorization scopes configured on a route. The scopes are used with a COGNITO_USER_POOLS authorizer to
     * authorize the method invocation. The authorization works by matching the route scopes against the scopes parsed
     * from the access token in the incoming request. The method invocation is authorized if any route scope matches a
     * claimed scope in the access token. Otherwise, the invocation is not authorized. When the route scope is
     * configured, the client must provide an access token instead of an identity token for authorization purposes.
     * </p>
     */
    private java.util.List<String> authorizationScopes;
    /**
     * <p>
     * The authorization type for the route. Valid values are NONE for open access, AWS_IAM for using AWS IAM
     * permissions, and CUSTOM for using a Lambda authorizer
     * </p>
     */
    private String authorizationType;
    /**
     * <p>
     * The identifier of the Authorizer resource to be associated with this route, if the authorizationType is CUSTOM .
     * The authorizer identifier is generated by API Gateway when you created the authorizer.
     * </p>
     */
    private String authorizerId;
    /**
     * <p>
     * The model selection expression for the route.
     * </p>
     */
    private String modelSelectionExpression;
    /**
     * <p>
     * The operation name for the route.
     * </p>
     */
    private String operationName;
    /**
     * <p>
     * The request models for the route.
     * </p>
     */
    private java.util.Map<String, String> requestModels;
    /**
     * <p>
     * The request parameters for the route.
     * </p>
     */
    private java.util.Map<String, ParameterConstraints> requestParameters;
    /**
     * <p>
     * The route ID.
     * </p>
     */
    private String routeId;
    /**
     * <p>
     * The route key for the route.
     * </p>
     */
    private String routeKey;
    /**
     * <p>
     * The route response selection expression for the route.
     * </p>
     */
    private String routeResponseSelectionExpression;
    /**
     * <p>
     * The target for the route.
     * </p>
     */
    private String target;

    /**
     * <p>
     * Specifies whether an API key is required for this route.
     * </p>
     * 
     * @param apiKeyRequired
     *        Specifies whether an API key is required for this route.
     */

    public void setApiKeyRequired(Boolean apiKeyRequired) {
        this.apiKeyRequired = apiKeyRequired;
    }

    /**
     * <p>
     * Specifies whether an API key is required for this route.
     * </p>
     * 
     * @return Specifies whether an API key is required for this route.
     */

    public Boolean getApiKeyRequired() {
        return this.apiKeyRequired;
    }

    /**
     * <p>
     * Specifies whether an API key is required for this route.
     * </p>
     * 
     * @param apiKeyRequired
     *        Specifies whether an API key is required for this route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withApiKeyRequired(Boolean apiKeyRequired) {
        setApiKeyRequired(apiKeyRequired);
        return this;
    }

    /**
     * <p>
     * Specifies whether an API key is required for this route.
     * </p>
     * 
     * @return Specifies whether an API key is required for this route.
     */

    public Boolean isApiKeyRequired() {
        return this.apiKeyRequired;
    }

    /**
     * <p>
     * A list of authorization scopes configured on a route. The scopes are used with a COGNITO_USER_POOLS authorizer to
     * authorize the method invocation. The authorization works by matching the route scopes against the scopes parsed
     * from the access token in the incoming request. The method invocation is authorized if any route scope matches a
     * claimed scope in the access token. Otherwise, the invocation is not authorized. When the route scope is
     * configured, the client must provide an access token instead of an identity token for authorization purposes.
     * </p>
     * 
     * @return A list of authorization scopes configured on a route. The scopes are used with a COGNITO_USER_POOLS
     *         authorizer to authorize the method invocation. The authorization works by matching the route scopes
     *         against the scopes parsed from the access token in the incoming request. The method invocation is
     *         authorized if any route scope matches a claimed scope in the access token. Otherwise, the invocation is
     *         not authorized. When the route scope is configured, the client must provide an access token instead of an
     *         identity token for authorization purposes.
     */

    public java.util.List<String> getAuthorizationScopes() {
        return authorizationScopes;
    }

    /**
     * <p>
     * A list of authorization scopes configured on a route. The scopes are used with a COGNITO_USER_POOLS authorizer to
     * authorize the method invocation. The authorization works by matching the route scopes against the scopes parsed
     * from the access token in the incoming request. The method invocation is authorized if any route scope matches a
     * claimed scope in the access token. Otherwise, the invocation is not authorized. When the route scope is
     * configured, the client must provide an access token instead of an identity token for authorization purposes.
     * </p>
     * 
     * @param authorizationScopes
     *        A list of authorization scopes configured on a route. The scopes are used with a COGNITO_USER_POOLS
     *        authorizer to authorize the method invocation. The authorization works by matching the route scopes
     *        against the scopes parsed from the access token in the incoming request. The method invocation is
     *        authorized if any route scope matches a claimed scope in the access token. Otherwise, the invocation is
     *        not authorized. When the route scope is configured, the client must provide an access token instead of an
     *        identity token for authorization purposes.
     */

    public void setAuthorizationScopes(java.util.Collection<String> authorizationScopes) {
        if (authorizationScopes == null) {
            this.authorizationScopes = null;
            return;
        }

        this.authorizationScopes = new java.util.ArrayList<String>(authorizationScopes);
    }

    /**
     * <p>
     * A list of authorization scopes configured on a route. The scopes are used with a COGNITO_USER_POOLS authorizer to
     * authorize the method invocation. The authorization works by matching the route scopes against the scopes parsed
     * from the access token in the incoming request. The method invocation is authorized if any route scope matches a
     * claimed scope in the access token. Otherwise, the invocation is not authorized. When the route scope is
     * configured, the client must provide an access token instead of an identity token for authorization purposes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthorizationScopes(java.util.Collection)} or {@link #withAuthorizationScopes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param authorizationScopes
     *        A list of authorization scopes configured on a route. The scopes are used with a COGNITO_USER_POOLS
     *        authorizer to authorize the method invocation. The authorization works by matching the route scopes
     *        against the scopes parsed from the access token in the incoming request. The method invocation is
     *        authorized if any route scope matches a claimed scope in the access token. Otherwise, the invocation is
     *        not authorized. When the route scope is configured, the client must provide an access token instead of an
     *        identity token for authorization purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withAuthorizationScopes(String... authorizationScopes) {
        if (this.authorizationScopes == null) {
            setAuthorizationScopes(new java.util.ArrayList<String>(authorizationScopes.length));
        }
        for (String ele : authorizationScopes) {
            this.authorizationScopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of authorization scopes configured on a route. The scopes are used with a COGNITO_USER_POOLS authorizer to
     * authorize the method invocation. The authorization works by matching the route scopes against the scopes parsed
     * from the access token in the incoming request. The method invocation is authorized if any route scope matches a
     * claimed scope in the access token. Otherwise, the invocation is not authorized. When the route scope is
     * configured, the client must provide an access token instead of an identity token for authorization purposes.
     * </p>
     * 
     * @param authorizationScopes
     *        A list of authorization scopes configured on a route. The scopes are used with a COGNITO_USER_POOLS
     *        authorizer to authorize the method invocation. The authorization works by matching the route scopes
     *        against the scopes parsed from the access token in the incoming request. The method invocation is
     *        authorized if any route scope matches a claimed scope in the access token. Otherwise, the invocation is
     *        not authorized. When the route scope is configured, the client must provide an access token instead of an
     *        identity token for authorization purposes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withAuthorizationScopes(java.util.Collection<String> authorizationScopes) {
        setAuthorizationScopes(authorizationScopes);
        return this;
    }

    /**
     * <p>
     * The authorization type for the route. Valid values are NONE for open access, AWS_IAM for using AWS IAM
     * permissions, and CUSTOM for using a Lambda authorizer
     * </p>
     * 
     * @param authorizationType
     *        The authorization type for the route. Valid values are NONE for open access, AWS_IAM for using AWS IAM
     *        permissions, and CUSTOM for using a Lambda authorizer
     * @see AuthorizationType
     */

    public void setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
    }

    /**
     * <p>
     * The authorization type for the route. Valid values are NONE for open access, AWS_IAM for using AWS IAM
     * permissions, and CUSTOM for using a Lambda authorizer
     * </p>
     * 
     * @return The authorization type for the route. Valid values are NONE for open access, AWS_IAM for using AWS IAM
     *         permissions, and CUSTOM for using a Lambda authorizer
     * @see AuthorizationType
     */

    public String getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * <p>
     * The authorization type for the route. Valid values are NONE for open access, AWS_IAM for using AWS IAM
     * permissions, and CUSTOM for using a Lambda authorizer
     * </p>
     * 
     * @param authorizationType
     *        The authorization type for the route. Valid values are NONE for open access, AWS_IAM for using AWS IAM
     *        permissions, and CUSTOM for using a Lambda authorizer
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizationType
     */

    public GetRouteResult withAuthorizationType(String authorizationType) {
        setAuthorizationType(authorizationType);
        return this;
    }

    /**
     * <p>
     * The authorization type for the route. Valid values are NONE for open access, AWS_IAM for using AWS IAM
     * permissions, and CUSTOM for using a Lambda authorizer
     * </p>
     * 
     * @param authorizationType
     *        The authorization type for the route. Valid values are NONE for open access, AWS_IAM for using AWS IAM
     *        permissions, and CUSTOM for using a Lambda authorizer
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorizationType
     */

    public GetRouteResult withAuthorizationType(AuthorizationType authorizationType) {
        this.authorizationType = authorizationType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the Authorizer resource to be associated with this route, if the authorizationType is CUSTOM .
     * The authorizer identifier is generated by API Gateway when you created the authorizer.
     * </p>
     * 
     * @param authorizerId
     *        The identifier of the Authorizer resource to be associated with this route, if the authorizationType is
     *        CUSTOM . The authorizer identifier is generated by API Gateway when you created the authorizer.
     */

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    /**
     * <p>
     * The identifier of the Authorizer resource to be associated with this route, if the authorizationType is CUSTOM .
     * The authorizer identifier is generated by API Gateway when you created the authorizer.
     * </p>
     * 
     * @return The identifier of the Authorizer resource to be associated with this route, if the authorizationType is
     *         CUSTOM . The authorizer identifier is generated by API Gateway when you created the authorizer.
     */

    public String getAuthorizerId() {
        return this.authorizerId;
    }

    /**
     * <p>
     * The identifier of the Authorizer resource to be associated with this route, if the authorizationType is CUSTOM .
     * The authorizer identifier is generated by API Gateway when you created the authorizer.
     * </p>
     * 
     * @param authorizerId
     *        The identifier of the Authorizer resource to be associated with this route, if the authorizationType is
     *        CUSTOM . The authorizer identifier is generated by API Gateway when you created the authorizer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withAuthorizerId(String authorizerId) {
        setAuthorizerId(authorizerId);
        return this;
    }

    /**
     * <p>
     * The model selection expression for the route.
     * </p>
     * 
     * @param modelSelectionExpression
     *        The model selection expression for the route.
     */

    public void setModelSelectionExpression(String modelSelectionExpression) {
        this.modelSelectionExpression = modelSelectionExpression;
    }

    /**
     * <p>
     * The model selection expression for the route.
     * </p>
     * 
     * @return The model selection expression for the route.
     */

    public String getModelSelectionExpression() {
        return this.modelSelectionExpression;
    }

    /**
     * <p>
     * The model selection expression for the route.
     * </p>
     * 
     * @param modelSelectionExpression
     *        The model selection expression for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withModelSelectionExpression(String modelSelectionExpression) {
        setModelSelectionExpression(modelSelectionExpression);
        return this;
    }

    /**
     * <p>
     * The operation name for the route.
     * </p>
     * 
     * @param operationName
     *        The operation name for the route.
     */

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    /**
     * <p>
     * The operation name for the route.
     * </p>
     * 
     * @return The operation name for the route.
     */

    public String getOperationName() {
        return this.operationName;
    }

    /**
     * <p>
     * The operation name for the route.
     * </p>
     * 
     * @param operationName
     *        The operation name for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withOperationName(String operationName) {
        setOperationName(operationName);
        return this;
    }

    /**
     * <p>
     * The request models for the route.
     * </p>
     * 
     * @return The request models for the route.
     */

    public java.util.Map<String, String> getRequestModels() {
        return requestModels;
    }

    /**
     * <p>
     * The request models for the route.
     * </p>
     * 
     * @param requestModels
     *        The request models for the route.
     */

    public void setRequestModels(java.util.Map<String, String> requestModels) {
        this.requestModels = requestModels;
    }

    /**
     * <p>
     * The request models for the route.
     * </p>
     * 
     * @param requestModels
     *        The request models for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withRequestModels(java.util.Map<String, String> requestModels) {
        setRequestModels(requestModels);
        return this;
    }

    public GetRouteResult addRequestModelsEntry(String key, String value) {
        if (null == this.requestModels) {
            this.requestModels = new java.util.HashMap<String, String>();
        }
        if (this.requestModels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestModels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestModels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult clearRequestModelsEntries() {
        this.requestModels = null;
        return this;
    }

    /**
     * <p>
     * The request parameters for the route.
     * </p>
     * 
     * @return The request parameters for the route.
     */

    public java.util.Map<String, ParameterConstraints> getRequestParameters() {
        return requestParameters;
    }

    /**
     * <p>
     * The request parameters for the route.
     * </p>
     * 
     * @param requestParameters
     *        The request parameters for the route.
     */

    public void setRequestParameters(java.util.Map<String, ParameterConstraints> requestParameters) {
        this.requestParameters = requestParameters;
    }

    /**
     * <p>
     * The request parameters for the route.
     * </p>
     * 
     * @param requestParameters
     *        The request parameters for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withRequestParameters(java.util.Map<String, ParameterConstraints> requestParameters) {
        setRequestParameters(requestParameters);
        return this;
    }

    public GetRouteResult addRequestParametersEntry(String key, ParameterConstraints value) {
        if (null == this.requestParameters) {
            this.requestParameters = new java.util.HashMap<String, ParameterConstraints>();
        }
        if (this.requestParameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestParameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestParameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult clearRequestParametersEntries() {
        this.requestParameters = null;
        return this;
    }

    /**
     * <p>
     * The route ID.
     * </p>
     * 
     * @param routeId
     *        The route ID.
     */

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    /**
     * <p>
     * The route ID.
     * </p>
     * 
     * @return The route ID.
     */

    public String getRouteId() {
        return this.routeId;
    }

    /**
     * <p>
     * The route ID.
     * </p>
     * 
     * @param routeId
     *        The route ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withRouteId(String routeId) {
        setRouteId(routeId);
        return this;
    }

    /**
     * <p>
     * The route key for the route.
     * </p>
     * 
     * @param routeKey
     *        The route key for the route.
     */

    public void setRouteKey(String routeKey) {
        this.routeKey = routeKey;
    }

    /**
     * <p>
     * The route key for the route.
     * </p>
     * 
     * @return The route key for the route.
     */

    public String getRouteKey() {
        return this.routeKey;
    }

    /**
     * <p>
     * The route key for the route.
     * </p>
     * 
     * @param routeKey
     *        The route key for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withRouteKey(String routeKey) {
        setRouteKey(routeKey);
        return this;
    }

    /**
     * <p>
     * The route response selection expression for the route.
     * </p>
     * 
     * @param routeResponseSelectionExpression
     *        The route response selection expression for the route.
     */

    public void setRouteResponseSelectionExpression(String routeResponseSelectionExpression) {
        this.routeResponseSelectionExpression = routeResponseSelectionExpression;
    }

    /**
     * <p>
     * The route response selection expression for the route.
     * </p>
     * 
     * @return The route response selection expression for the route.
     */

    public String getRouteResponseSelectionExpression() {
        return this.routeResponseSelectionExpression;
    }

    /**
     * <p>
     * The route response selection expression for the route.
     * </p>
     * 
     * @param routeResponseSelectionExpression
     *        The route response selection expression for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withRouteResponseSelectionExpression(String routeResponseSelectionExpression) {
        setRouteResponseSelectionExpression(routeResponseSelectionExpression);
        return this;
    }

    /**
     * <p>
     * The target for the route.
     * </p>
     * 
     * @param target
     *        The target for the route.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The target for the route.
     * </p>
     * 
     * @return The target for the route.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target for the route.
     * </p>
     * 
     * @param target
     *        The target for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRouteResult withTarget(String target) {
        setTarget(target);
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
        if (getApiKeyRequired() != null)
            sb.append("ApiKeyRequired: ").append(getApiKeyRequired()).append(",");
        if (getAuthorizationScopes() != null)
            sb.append("AuthorizationScopes: ").append(getAuthorizationScopes()).append(",");
        if (getAuthorizationType() != null)
            sb.append("AuthorizationType: ").append(getAuthorizationType()).append(",");
        if (getAuthorizerId() != null)
            sb.append("AuthorizerId: ").append(getAuthorizerId()).append(",");
        if (getModelSelectionExpression() != null)
            sb.append("ModelSelectionExpression: ").append(getModelSelectionExpression()).append(",");
        if (getOperationName() != null)
            sb.append("OperationName: ").append(getOperationName()).append(",");
        if (getRequestModels() != null)
            sb.append("RequestModels: ").append(getRequestModels()).append(",");
        if (getRequestParameters() != null)
            sb.append("RequestParameters: ").append(getRequestParameters()).append(",");
        if (getRouteId() != null)
            sb.append("RouteId: ").append(getRouteId()).append(",");
        if (getRouteKey() != null)
            sb.append("RouteKey: ").append(getRouteKey()).append(",");
        if (getRouteResponseSelectionExpression() != null)
            sb.append("RouteResponseSelectionExpression: ").append(getRouteResponseSelectionExpression()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRouteResult == false)
            return false;
        GetRouteResult other = (GetRouteResult) obj;
        if (other.getApiKeyRequired() == null ^ this.getApiKeyRequired() == null)
            return false;
        if (other.getApiKeyRequired() != null && other.getApiKeyRequired().equals(this.getApiKeyRequired()) == false)
            return false;
        if (other.getAuthorizationScopes() == null ^ this.getAuthorizationScopes() == null)
            return false;
        if (other.getAuthorizationScopes() != null && other.getAuthorizationScopes().equals(this.getAuthorizationScopes()) == false)
            return false;
        if (other.getAuthorizationType() == null ^ this.getAuthorizationType() == null)
            return false;
        if (other.getAuthorizationType() != null && other.getAuthorizationType().equals(this.getAuthorizationType()) == false)
            return false;
        if (other.getAuthorizerId() == null ^ this.getAuthorizerId() == null)
            return false;
        if (other.getAuthorizerId() != null && other.getAuthorizerId().equals(this.getAuthorizerId()) == false)
            return false;
        if (other.getModelSelectionExpression() == null ^ this.getModelSelectionExpression() == null)
            return false;
        if (other.getModelSelectionExpression() != null && other.getModelSelectionExpression().equals(this.getModelSelectionExpression()) == false)
            return false;
        if (other.getOperationName() == null ^ this.getOperationName() == null)
            return false;
        if (other.getOperationName() != null && other.getOperationName().equals(this.getOperationName()) == false)
            return false;
        if (other.getRequestModels() == null ^ this.getRequestModels() == null)
            return false;
        if (other.getRequestModels() != null && other.getRequestModels().equals(this.getRequestModels()) == false)
            return false;
        if (other.getRequestParameters() == null ^ this.getRequestParameters() == null)
            return false;
        if (other.getRequestParameters() != null && other.getRequestParameters().equals(this.getRequestParameters()) == false)
            return false;
        if (other.getRouteId() == null ^ this.getRouteId() == null)
            return false;
        if (other.getRouteId() != null && other.getRouteId().equals(this.getRouteId()) == false)
            return false;
        if (other.getRouteKey() == null ^ this.getRouteKey() == null)
            return false;
        if (other.getRouteKey() != null && other.getRouteKey().equals(this.getRouteKey()) == false)
            return false;
        if (other.getRouteResponseSelectionExpression() == null ^ this.getRouteResponseSelectionExpression() == null)
            return false;
        if (other.getRouteResponseSelectionExpression() != null
                && other.getRouteResponseSelectionExpression().equals(this.getRouteResponseSelectionExpression()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKeyRequired() == null) ? 0 : getApiKeyRequired().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationScopes() == null) ? 0 : getAuthorizationScopes().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationType() == null) ? 0 : getAuthorizationType().hashCode());
        hashCode = prime * hashCode + ((getAuthorizerId() == null) ? 0 : getAuthorizerId().hashCode());
        hashCode = prime * hashCode + ((getModelSelectionExpression() == null) ? 0 : getModelSelectionExpression().hashCode());
        hashCode = prime * hashCode + ((getOperationName() == null) ? 0 : getOperationName().hashCode());
        hashCode = prime * hashCode + ((getRequestModels() == null) ? 0 : getRequestModels().hashCode());
        hashCode = prime * hashCode + ((getRequestParameters() == null) ? 0 : getRequestParameters().hashCode());
        hashCode = prime * hashCode + ((getRouteId() == null) ? 0 : getRouteId().hashCode());
        hashCode = prime * hashCode + ((getRouteKey() == null) ? 0 : getRouteKey().hashCode());
        hashCode = prime * hashCode + ((getRouteResponseSelectionExpression() == null) ? 0 : getRouteResponseSelectionExpression().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public GetRouteResult clone() {
        try {
            return (GetRouteResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
