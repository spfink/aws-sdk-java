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
package com.amazonaws.services.opsworkscm.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.opsworkscm.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ServerEventMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerEventJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ServerEvent serverEvent, StructuredJsonGenerator jsonGenerator) {

        if (serverEvent == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (serverEvent.getCreatedAt() != null) {
                jsonGenerator.writeFieldName("CreatedAt").writeValue(serverEvent.getCreatedAt());
            }
            if (serverEvent.getServerName() != null) {
                jsonGenerator.writeFieldName("ServerName").writeValue(serverEvent.getServerName());
            }
            if (serverEvent.getMessage() != null) {
                jsonGenerator.writeFieldName("Message").writeValue(serverEvent.getMessage());
            }
            if (serverEvent.getLogUrl() != null) {
                jsonGenerator.writeFieldName("LogUrl").writeValue(serverEvent.getLogUrl());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ServerEventJsonMarshaller instance;

    public static ServerEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ServerEventJsonMarshaller();
        return instance;
    }

}
