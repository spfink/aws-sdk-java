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
package com.amazonaws.services.applicationdiscovery.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationdiscovery.model.*;

import com.amazonaws.protocol.json.*;

/**
 * TagFilterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TagFilterJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(TagFilter tagFilter, StructuredJsonGenerator jsonGenerator) {

        if (tagFilter == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (tagFilter.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(tagFilter.getName());
            }

            java.util.List<String> valuesList = tagFilter.getValues();
            if (valuesList != null) {
                jsonGenerator.writeFieldName("values");
                jsonGenerator.writeStartArray();
                for (String valuesListValue : valuesList) {
                    if (valuesListValue != null) {
                        jsonGenerator.writeValue(valuesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static TagFilterJsonMarshaller instance;

    public static TagFilterJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TagFilterJsonMarshaller();
        return instance;
    }

}
