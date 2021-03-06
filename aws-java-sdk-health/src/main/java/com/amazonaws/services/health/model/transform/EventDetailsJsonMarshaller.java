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

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.health.model.*;

import com.amazonaws.protocol.json.*;

/**
 * EventDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventDetailsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(EventDetails eventDetails, StructuredJsonGenerator jsonGenerator) {

        if (eventDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (eventDetails.getEvent() != null) {
                jsonGenerator.writeFieldName("event");
                EventJsonMarshaller.getInstance().marshall(eventDetails.getEvent(), jsonGenerator);
            }
            if (eventDetails.getEventDescription() != null) {
                jsonGenerator.writeFieldName("eventDescription");
                EventDescriptionJsonMarshaller.getInstance().marshall(eventDetails.getEventDescription(), jsonGenerator);
            }

            java.util.Map<String, String> eventMetadataMap = eventDetails.getEventMetadata();
            if (eventMetadataMap != null) {
                jsonGenerator.writeFieldName("eventMetadata");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> eventMetadataMapValue : eventMetadataMap.entrySet()) {
                    if (eventMetadataMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(eventMetadataMapValue.getKey());

                        jsonGenerator.writeValue(eventMetadataMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static EventDetailsJsonMarshaller instance;

    public static EventDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EventDetailsJsonMarshaller();
        return instance;
    }

}
