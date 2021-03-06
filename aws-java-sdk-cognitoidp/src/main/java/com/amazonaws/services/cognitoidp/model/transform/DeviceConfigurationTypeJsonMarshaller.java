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
package com.amazonaws.services.cognitoidp.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cognitoidp.model.*;

import com.amazonaws.protocol.json.*;

/**
 * DeviceConfigurationTypeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceConfigurationTypeJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(DeviceConfigurationType deviceConfigurationType, StructuredJsonGenerator jsonGenerator) {

        if (deviceConfigurationType == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (deviceConfigurationType.getChallengeRequiredOnNewDevice() != null) {
                jsonGenerator.writeFieldName("ChallengeRequiredOnNewDevice").writeValue(deviceConfigurationType.getChallengeRequiredOnNewDevice());
            }
            if (deviceConfigurationType.getDeviceOnlyRememberedOnUserPrompt() != null) {
                jsonGenerator.writeFieldName("DeviceOnlyRememberedOnUserPrompt").writeValue(deviceConfigurationType.getDeviceOnlyRememberedOnUserPrompt());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static DeviceConfigurationTypeJsonMarshaller instance;

    public static DeviceConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DeviceConfigurationTypeJsonMarshaller();
        return instance;
    }

}
