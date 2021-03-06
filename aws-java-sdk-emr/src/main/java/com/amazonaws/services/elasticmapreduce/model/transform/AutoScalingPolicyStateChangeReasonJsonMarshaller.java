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
package com.amazonaws.services.elasticmapreduce.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticmapreduce.model.*;

import com.amazonaws.protocol.json.*;

/**
 * AutoScalingPolicyStateChangeReasonMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoScalingPolicyStateChangeReasonJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(AutoScalingPolicyStateChangeReason autoScalingPolicyStateChangeReason, StructuredJsonGenerator jsonGenerator) {

        if (autoScalingPolicyStateChangeReason == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (autoScalingPolicyStateChangeReason.getCode() != null) {
                jsonGenerator.writeFieldName("Code").writeValue(autoScalingPolicyStateChangeReason.getCode());
            }
            if (autoScalingPolicyStateChangeReason.getMessage() != null) {
                jsonGenerator.writeFieldName("Message").writeValue(autoScalingPolicyStateChangeReason.getMessage());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AutoScalingPolicyStateChangeReasonJsonMarshaller instance;

    public static AutoScalingPolicyStateChangeReasonJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoScalingPolicyStateChangeReasonJsonMarshaller();
        return instance;
    }

}
