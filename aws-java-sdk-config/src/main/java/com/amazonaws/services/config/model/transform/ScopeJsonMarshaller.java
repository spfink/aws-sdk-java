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
package com.amazonaws.services.config.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ScopeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScopeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Scope scope, StructuredJsonGenerator jsonGenerator) {

        if (scope == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            com.amazonaws.internal.SdkInternalList<String> complianceResourceTypesList = (com.amazonaws.internal.SdkInternalList<String>) scope
                    .getComplianceResourceTypes();
            if (!complianceResourceTypesList.isEmpty() || !complianceResourceTypesList.isAutoConstruct()) {
                jsonGenerator.writeFieldName("ComplianceResourceTypes");
                jsonGenerator.writeStartArray();
                for (String complianceResourceTypesListValue : complianceResourceTypesList) {
                    if (complianceResourceTypesListValue != null) {
                        jsonGenerator.writeValue(complianceResourceTypesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (scope.getTagKey() != null) {
                jsonGenerator.writeFieldName("TagKey").writeValue(scope.getTagKey());
            }
            if (scope.getTagValue() != null) {
                jsonGenerator.writeFieldName("TagValue").writeValue(scope.getTagValue());
            }
            if (scope.getComplianceResourceId() != null) {
                jsonGenerator.writeFieldName("ComplianceResourceId").writeValue(scope.getComplianceResourceId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ScopeJsonMarshaller instance;

    public static ScopeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScopeJsonMarshaller();
        return instance;
    }

}
