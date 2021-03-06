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
package com.amazonaws.services.simpleworkflow.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * TerminateWorkflowExecutionRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminateWorkflowExecutionRequestMarshaller implements Marshaller<Request<TerminateWorkflowExecutionRequest>, TerminateWorkflowExecutionRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public TerminateWorkflowExecutionRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<TerminateWorkflowExecutionRequest> marshall(TerminateWorkflowExecutionRequest terminateWorkflowExecutionRequest) {

        if (terminateWorkflowExecutionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<TerminateWorkflowExecutionRequest> request = new DefaultRequest<TerminateWorkflowExecutionRequest>(terminateWorkflowExecutionRequest,
                "AmazonSimpleWorkflow");
        request.addHeader("X-Amz-Target", "SimpleWorkflowService.TerminateWorkflowExecution");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (terminateWorkflowExecutionRequest.getDomain() != null) {
                jsonGenerator.writeFieldName("domain").writeValue(terminateWorkflowExecutionRequest.getDomain());
            }
            if (terminateWorkflowExecutionRequest.getWorkflowId() != null) {
                jsonGenerator.writeFieldName("workflowId").writeValue(terminateWorkflowExecutionRequest.getWorkflowId());
            }
            if (terminateWorkflowExecutionRequest.getRunId() != null) {
                jsonGenerator.writeFieldName("runId").writeValue(terminateWorkflowExecutionRequest.getRunId());
            }
            if (terminateWorkflowExecutionRequest.getReason() != null) {
                jsonGenerator.writeFieldName("reason").writeValue(terminateWorkflowExecutionRequest.getReason());
            }
            if (terminateWorkflowExecutionRequest.getDetails() != null) {
                jsonGenerator.writeFieldName("details").writeValue(terminateWorkflowExecutionRequest.getDetails());
            }
            if (terminateWorkflowExecutionRequest.getChildPolicy() != null) {
                jsonGenerator.writeFieldName("childPolicy").writeValue(terminateWorkflowExecutionRequest.getChildPolicy());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
