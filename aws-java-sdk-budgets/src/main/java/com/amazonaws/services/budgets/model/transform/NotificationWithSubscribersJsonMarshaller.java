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
package com.amazonaws.services.budgets.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.budgets.model.*;

import com.amazonaws.protocol.json.*;

/**
 * NotificationWithSubscribersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationWithSubscribersJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(NotificationWithSubscribers notificationWithSubscribers, StructuredJsonGenerator jsonGenerator) {

        if (notificationWithSubscribers == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (notificationWithSubscribers.getNotification() != null) {
                jsonGenerator.writeFieldName("Notification");
                NotificationJsonMarshaller.getInstance().marshall(notificationWithSubscribers.getNotification(), jsonGenerator);
            }

            java.util.List<Subscriber> subscribersList = notificationWithSubscribers.getSubscribers();
            if (subscribersList != null) {
                jsonGenerator.writeFieldName("Subscribers");
                jsonGenerator.writeStartArray();
                for (Subscriber subscribersListValue : subscribersList) {
                    if (subscribersListValue != null) {

                        SubscriberJsonMarshaller.getInstance().marshall(subscribersListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static NotificationWithSubscribersJsonMarshaller instance;

    public static NotificationWithSubscribersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NotificationWithSubscribersJsonMarshaller();
        return instance;
    }

}
