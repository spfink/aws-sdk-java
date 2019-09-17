/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MessageTemplateType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageTemplateTypeJsonUnmarshaller implements Unmarshaller<MessageTemplateType, JsonUnmarshallerContext> {

    public MessageTemplateType unmarshall(JsonUnmarshallerContext context) throws Exception {
        MessageTemplateType messageTemplateType = new MessageTemplateType();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("SMSMessage", targetDepth)) {
                    context.nextToken();
                    messageTemplateType.setSMSMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EmailMessage", targetDepth)) {
                    context.nextToken();
                    messageTemplateType.setEmailMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EmailSubject", targetDepth)) {
                    context.nextToken();
                    messageTemplateType.setEmailSubject(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return messageTemplateType;
    }

    private static MessageTemplateTypeJsonUnmarshaller instance;

    public static MessageTemplateTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MessageTemplateTypeJsonUnmarshaller();
        return instance;
    }
}
