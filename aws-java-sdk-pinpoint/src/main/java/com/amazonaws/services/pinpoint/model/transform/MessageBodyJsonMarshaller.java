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
package com.amazonaws.services.pinpoint.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.pinpoint.model.*;

import com.amazonaws.protocol.json.*;

/**
 * MessageBodyMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageBodyJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(MessageBody messageBody, StructuredJsonGenerator jsonGenerator) {

        if (messageBody == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (messageBody.getMessage() != null) {
                jsonGenerator.writeFieldName("Message").writeValue(messageBody.getMessage());
            }
            if (messageBody.getRequestID() != null) {
                jsonGenerator.writeFieldName("RequestID").writeValue(messageBody.getRequestID());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MessageBodyJsonMarshaller instance;

    public static MessageBodyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MessageBodyJsonMarshaller();
        return instance;
    }

}
