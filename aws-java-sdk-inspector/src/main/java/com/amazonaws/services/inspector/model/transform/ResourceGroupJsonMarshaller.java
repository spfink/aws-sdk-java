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
package com.amazonaws.services.inspector.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ResourceGroupMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceGroupJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ResourceGroup resourceGroup, StructuredJsonGenerator jsonGenerator) {

        if (resourceGroup == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (resourceGroup.getArn() != null) {
                jsonGenerator.writeFieldName("arn").writeValue(resourceGroup.getArn());
            }

            java.util.List<ResourceGroupTag> tagsList = resourceGroup.getTags();
            if (tagsList != null) {
                jsonGenerator.writeFieldName("tags");
                jsonGenerator.writeStartArray();
                for (ResourceGroupTag tagsListValue : tagsList) {
                    if (tagsListValue != null) {

                        ResourceGroupTagJsonMarshaller.getInstance().marshall(tagsListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (resourceGroup.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("createdAt").writeValue(resourceGroup.getCreatedAt());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ResourceGroupJsonMarshaller instance;

    public static ResourceGroupJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ResourceGroupJsonMarshaller();
        return instance;
    }

}
