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
package com.amazonaws.services.machinelearning.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.machinelearning.model.*;

import com.amazonaws.protocol.json.*;

/**
 * RealtimeEndpointInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealtimeEndpointInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(RealtimeEndpointInfo realtimeEndpointInfo, StructuredJsonGenerator jsonGenerator) {

        if (realtimeEndpointInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (realtimeEndpointInfo.getPeakRequestsPerSecond() != null) {
                jsonGenerator.writeFieldName("PeakRequestsPerSecond").writeValue(realtimeEndpointInfo.getPeakRequestsPerSecond());
            }
            if (realtimeEndpointInfo.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("CreatedAt").writeValue(realtimeEndpointInfo.getCreatedAt());
            }
            if (realtimeEndpointInfo.getEndpointUrl() != null) {
                jsonGenerator.writeFieldName("EndpointUrl").writeValue(realtimeEndpointInfo.getEndpointUrl());
            }
            if (realtimeEndpointInfo.getEndpointStatus() != null) {
                jsonGenerator.writeFieldName("EndpointStatus").writeValue(realtimeEndpointInfo.getEndpointStatus());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static RealtimeEndpointInfoJsonMarshaller instance;

    public static RealtimeEndpointInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RealtimeEndpointInfoJsonMarshaller();
        return instance;
    }

}
