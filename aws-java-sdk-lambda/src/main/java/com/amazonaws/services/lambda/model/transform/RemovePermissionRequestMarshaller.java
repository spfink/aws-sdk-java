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
package com.amazonaws.services.lambda.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

import com.amazonaws.protocol.json.*;

/**
 * RemovePermissionRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemovePermissionRequestMarshaller implements Marshaller<Request<RemovePermissionRequest>, RemovePermissionRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public RemovePermissionRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<RemovePermissionRequest> marshall(RemovePermissionRequest removePermissionRequest) {

        if (removePermissionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RemovePermissionRequest> request = new DefaultRequest<RemovePermissionRequest>(removePermissionRequest, "AWSLambda");

        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/2015-03-31/functions/{FunctionName}/policy/{StatementId}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "FunctionName",
                removePermissionRequest.getFunctionName());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "StatementId", removePermissionRequest.getStatementId());
        request.setResourcePath(uriResourcePath);

        if (removePermissionRequest.getQualifier() != null) {
            request.addParameter("Qualifier", StringUtils.fromString(removePermissionRequest.getQualifier()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
