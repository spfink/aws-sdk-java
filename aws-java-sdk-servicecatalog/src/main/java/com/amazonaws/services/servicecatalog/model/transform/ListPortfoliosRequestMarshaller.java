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
package com.amazonaws.services.servicecatalog.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * ListPortfoliosRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPortfoliosRequestMarshaller implements Marshaller<Request<ListPortfoliosRequest>, ListPortfoliosRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListPortfoliosRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListPortfoliosRequest> marshall(ListPortfoliosRequest listPortfoliosRequest) {

        if (listPortfoliosRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListPortfoliosRequest> request = new DefaultRequest<ListPortfoliosRequest>(listPortfoliosRequest, "AWSServiceCatalog");
        request.addHeader("X-Amz-Target", "AWS242ServiceCatalogService.ListPortfolios");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (listPortfoliosRequest.getAcceptLanguage() != null) {
                jsonGenerator.writeFieldName("AcceptLanguage").writeValue(listPortfoliosRequest.getAcceptLanguage());
            }
            if (listPortfoliosRequest.getPageToken() != null) {
                jsonGenerator.writeFieldName("PageToken").writeValue(listPortfoliosRequest.getPageToken());
            }
            if (listPortfoliosRequest.getPageSize() != null) {
                jsonGenerator.writeFieldName("PageSize").writeValue(listPortfoliosRequest.getPageSize());
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
