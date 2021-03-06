/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servicecatalog.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ProductViewDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductViewDetailJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ProductViewDetail productViewDetail, StructuredJsonGenerator jsonGenerator) {

        if (productViewDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (productViewDetail.getProductViewSummary() != null) {
                jsonGenerator.writeFieldName("ProductViewSummary");
                ProductViewSummaryJsonMarshaller.getInstance().marshall(productViewDetail.getProductViewSummary(), jsonGenerator);
            }
            if (productViewDetail.getStatus() != null) {
                jsonGenerator.writeFieldName("Status").writeValue(productViewDetail.getStatus());
            }
            if (productViewDetail.getProductARN() != null) {
                jsonGenerator.writeFieldName("ProductARN").writeValue(productViewDetail.getProductARN());
            }
            if (productViewDetail.getCreatedTime() != null) {
                jsonGenerator.writeFieldName("CreatedTime").writeValue(productViewDetail.getCreatedTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ProductViewDetailJsonMarshaller instance;

    public static ProductViewDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProductViewDetailJsonMarshaller();
        return instance;
    }

}
