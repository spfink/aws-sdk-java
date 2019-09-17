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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateRoleAliasResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRoleAliasResultJsonUnmarshaller implements Unmarshaller<CreateRoleAliasResult, JsonUnmarshallerContext> {

    public CreateRoleAliasResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateRoleAliasResult createRoleAliasResult = new CreateRoleAliasResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createRoleAliasResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("roleAlias", targetDepth)) {
                    context.nextToken();
                    createRoleAliasResult.setRoleAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleAliasArn", targetDepth)) {
                    context.nextToken();
                    createRoleAliasResult.setRoleAliasArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createRoleAliasResult;
    }

    private static CreateRoleAliasResultJsonUnmarshaller instance;

    public static CreateRoleAliasResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateRoleAliasResultJsonUnmarshaller();
        return instance;
    }
}
