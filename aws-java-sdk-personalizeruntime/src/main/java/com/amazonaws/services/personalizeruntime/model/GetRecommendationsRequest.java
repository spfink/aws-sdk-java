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
package com.amazonaws.services.personalizeruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-runtime-2018-05-22/GetRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRecommendationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.
     * </p>
     */
    private String campaignArn;
    /**
     * <p>
     * The item ID to provide recommendations for.
     * </p>
     * <p>
     * Required for <code>RELATED_ITEMS</code> recipe type.
     * </p>
     */
    private String itemId;
    /**
     * <p>
     * The user ID to provide recommendations for.
     * </p>
     * <p>
     * Required for <code>USER_PERSONALIZATION</code> recipe type.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The number of results to return. The default is 25. The maximum is 100.
     * </p>
     */
    private Integer numResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.
     * </p>
     * 
     * @param campaignArn
     *        The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.
     */

    public void setCampaignArn(String campaignArn) {
        this.campaignArn = campaignArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.
     */

    public String getCampaignArn() {
        return this.campaignArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.
     * </p>
     * 
     * @param campaignArn
     *        The Amazon Resource Name (ARN) of the campaign to use for getting recommendations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsRequest withCampaignArn(String campaignArn) {
        setCampaignArn(campaignArn);
        return this;
    }

    /**
     * <p>
     * The item ID to provide recommendations for.
     * </p>
     * <p>
     * Required for <code>RELATED_ITEMS</code> recipe type.
     * </p>
     * 
     * @param itemId
     *        The item ID to provide recommendations for.</p>
     *        <p>
     *        Required for <code>RELATED_ITEMS</code> recipe type.
     */

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * <p>
     * The item ID to provide recommendations for.
     * </p>
     * <p>
     * Required for <code>RELATED_ITEMS</code> recipe type.
     * </p>
     * 
     * @return The item ID to provide recommendations for.</p>
     *         <p>
     *         Required for <code>RELATED_ITEMS</code> recipe type.
     */

    public String getItemId() {
        return this.itemId;
    }

    /**
     * <p>
     * The item ID to provide recommendations for.
     * </p>
     * <p>
     * Required for <code>RELATED_ITEMS</code> recipe type.
     * </p>
     * 
     * @param itemId
     *        The item ID to provide recommendations for.</p>
     *        <p>
     *        Required for <code>RELATED_ITEMS</code> recipe type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsRequest withItemId(String itemId) {
        setItemId(itemId);
        return this;
    }

    /**
     * <p>
     * The user ID to provide recommendations for.
     * </p>
     * <p>
     * Required for <code>USER_PERSONALIZATION</code> recipe type.
     * </p>
     * 
     * @param userId
     *        The user ID to provide recommendations for.</p>
     *        <p>
     *        Required for <code>USER_PERSONALIZATION</code> recipe type.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user ID to provide recommendations for.
     * </p>
     * <p>
     * Required for <code>USER_PERSONALIZATION</code> recipe type.
     * </p>
     * 
     * @return The user ID to provide recommendations for.</p>
     *         <p>
     *         Required for <code>USER_PERSONALIZATION</code> recipe type.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The user ID to provide recommendations for.
     * </p>
     * <p>
     * Required for <code>USER_PERSONALIZATION</code> recipe type.
     * </p>
     * 
     * @param userId
     *        The user ID to provide recommendations for.</p>
     *        <p>
     *        Required for <code>USER_PERSONALIZATION</code> recipe type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The number of results to return. The default is 25. The maximum is 100.
     * </p>
     * 
     * @param numResults
     *        The number of results to return. The default is 25. The maximum is 100.
     */

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    /**
     * <p>
     * The number of results to return. The default is 25. The maximum is 100.
     * </p>
     * 
     * @return The number of results to return. The default is 25. The maximum is 100.
     */

    public Integer getNumResults() {
        return this.numResults;
    }

    /**
     * <p>
     * The number of results to return. The default is 25. The maximum is 100.
     * </p>
     * 
     * @param numResults
     *        The number of results to return. The default is 25. The maximum is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRecommendationsRequest withNumResults(Integer numResults) {
        setNumResults(numResults);
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
        if (getCampaignArn() != null)
            sb.append("CampaignArn: ").append(getCampaignArn()).append(",");
        if (getItemId() != null)
            sb.append("ItemId: ").append(getItemId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getNumResults() != null)
            sb.append("NumResults: ").append(getNumResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecommendationsRequest == false)
            return false;
        GetRecommendationsRequest other = (GetRecommendationsRequest) obj;
        if (other.getCampaignArn() == null ^ this.getCampaignArn() == null)
            return false;
        if (other.getCampaignArn() != null && other.getCampaignArn().equals(this.getCampaignArn()) == false)
            return false;
        if (other.getItemId() == null ^ this.getItemId() == null)
            return false;
        if (other.getItemId() != null && other.getItemId().equals(this.getItemId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getNumResults() == null ^ this.getNumResults() == null)
            return false;
        if (other.getNumResults() != null && other.getNumResults().equals(this.getNumResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCampaignArn() == null) ? 0 : getCampaignArn().hashCode());
        hashCode = prime * hashCode + ((getItemId() == null) ? 0 : getItemId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getNumResults() == null) ? 0 : getNumResults().hashCode());
        return hashCode;
    }

    @Override
    public GetRecommendationsRequest clone() {
        return (GetRecommendationsRequest) super.clone();
    }

}
