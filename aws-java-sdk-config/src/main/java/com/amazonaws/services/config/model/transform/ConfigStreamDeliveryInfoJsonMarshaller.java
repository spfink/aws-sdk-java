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
 * ConfigStreamDeliveryInfoMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigStreamDeliveryInfoJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ConfigStreamDeliveryInfo configStreamDeliveryInfo, StructuredJsonGenerator jsonGenerator) {

        if (configStreamDeliveryInfo == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (configStreamDeliveryInfo.getLastStatus() != null) {
                jsonGenerator.writeFieldName("lastStatus").writeValue(configStreamDeliveryInfo.getLastStatus());
            }
            if (configStreamDeliveryInfo.getLastErrorCode() != null) {
                jsonGenerator.writeFieldName("lastErrorCode").writeValue(configStreamDeliveryInfo.getLastErrorCode());
            }
            if (configStreamDeliveryInfo.getLastErrorMessage() != null) {
                jsonGenerator.writeFieldName("lastErrorMessage").writeValue(configStreamDeliveryInfo.getLastErrorMessage());
            }
            if (configStreamDeliveryInfo.getLastStatusChangeTime() != null) {
                jsonGenerator.writeFieldName("lastStatusChangeTime").writeValue(configStreamDeliveryInfo.getLastStatusChangeTime());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ConfigStreamDeliveryInfoJsonMarshaller instance;

    public static ConfigStreamDeliveryInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ConfigStreamDeliveryInfoJsonMarshaller();
        return instance;
    }

}
