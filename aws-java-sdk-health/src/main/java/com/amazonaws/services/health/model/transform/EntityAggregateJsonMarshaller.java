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
package com.amazonaws.services.health.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.health.model.*;

import com.amazonaws.protocol.json.*;

/**
 * EntityAggregateMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityAggregateJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EntityAggregate entityAggregate, StructuredJsonGenerator jsonGenerator) {

        if (entityAggregate == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (entityAggregate.getEventArn() != null) {
                jsonGenerator.writeFieldName("eventArn").writeValue(entityAggregate.getEventArn());
            }
            if (entityAggregate.getCount() != null) {
                jsonGenerator.writeFieldName("count").writeValue(entityAggregate.getCount());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EntityAggregateJsonMarshaller instance;

    public static EntityAggregateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EntityAggregateJsonMarshaller();
        return instance;
    }

}
