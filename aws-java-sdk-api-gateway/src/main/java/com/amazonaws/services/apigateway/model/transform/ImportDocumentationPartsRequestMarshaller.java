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
package com.amazonaws.services.apigateway.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;

import com.amazonaws.protocol.json.*;

/**
 * ImportDocumentationPartsRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportDocumentationPartsRequestMarshaller implements Marshaller<Request<ImportDocumentationPartsRequest>, ImportDocumentationPartsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ImportDocumentationPartsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ImportDocumentationPartsRequest> marshall(ImportDocumentationPartsRequest importDocumentationPartsRequest) {

        if (importDocumentationPartsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ImportDocumentationPartsRequest> request = new DefaultRequest<ImportDocumentationPartsRequest>(importDocumentationPartsRequest,
                "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/restapis/{restapi_id}/documentation/parts";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "restapi_id",
                importDocumentationPartsRequest.getRestApiId());
        request.setResourcePath(uriResourcePath);

        if (importDocumentationPartsRequest.getMode() != null) {
            request.addParameter("mode", StringUtils.fromString(importDocumentationPartsRequest.getMode()));
        }

        if (importDocumentationPartsRequest.getFailOnWarnings() != null) {
            request.addParameter("failonwarnings", StringUtils.fromBoolean(importDocumentationPartsRequest.getFailOnWarnings()));
        }

        request.setContent(BinaryUtils.toStream(importDocumentationPartsRequest.getBody()));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
