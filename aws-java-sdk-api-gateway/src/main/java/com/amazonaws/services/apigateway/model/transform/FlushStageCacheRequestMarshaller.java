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

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * FlushStageCacheRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlushStageCacheRequestMarshaller implements Marshaller<Request<FlushStageCacheRequest>, FlushStageCacheRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public FlushStageCacheRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<FlushStageCacheRequest> marshall(FlushStageCacheRequest flushStageCacheRequest) {

        if (flushStageCacheRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<FlushStageCacheRequest> request = new DefaultRequest<FlushStageCacheRequest>(flushStageCacheRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/restapis/{restapi_id}/stages/{stage_name}/cache/data";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "restapi_id", flushStageCacheRequest.getRestApiId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "stage_name", flushStageCacheRequest.getStageName());
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
