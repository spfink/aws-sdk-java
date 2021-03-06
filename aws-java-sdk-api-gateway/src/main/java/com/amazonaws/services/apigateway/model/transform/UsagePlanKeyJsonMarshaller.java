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
package com.amazonaws.services.apigateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;

import com.amazonaws.protocol.json.*;

/**
 * UsagePlanKeyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsagePlanKeyJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(UsagePlanKey usagePlanKey, StructuredJsonGenerator jsonGenerator) {

        if (usagePlanKey == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (usagePlanKey.getId() != null) {
                jsonGenerator.writeFieldName("id").writeValue(usagePlanKey.getId());
            }
            if (usagePlanKey.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(usagePlanKey.getType());
            }
            if (usagePlanKey.getValue() != null) {
                jsonGenerator.writeFieldName("value").writeValue(usagePlanKey.getValue());
            }
            if (usagePlanKey.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(usagePlanKey.getName());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static UsagePlanKeyJsonMarshaller instance;

    public static UsagePlanKeyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UsagePlanKeyJsonMarshaller();
        return instance;
    }

}
