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
package com.amazonaws.services.kinesisanalytics.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesisanalytics.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AddApplicationOutputRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AddApplicationOutputRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApplicationName").build();
    private static final MarshallingInfo<Long> CURRENTAPPLICATIONVERSIONID_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CurrentApplicationVersionId").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Output").build();

    private static final AddApplicationOutputRequestMarshaller instance = new AddApplicationOutputRequestMarshaller();

    public static AddApplicationOutputRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AddApplicationOutputRequest addApplicationOutputRequest, ProtocolMarshaller protocolMarshaller) {

        if (addApplicationOutputRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(addApplicationOutputRequest.getApplicationName(), APPLICATIONNAME_BINDING);
            protocolMarshaller.marshall(addApplicationOutputRequest.getCurrentApplicationVersionId(), CURRENTAPPLICATIONVERSIONID_BINDING);
            protocolMarshaller.marshall(addApplicationOutputRequest.getOutput(), OUTPUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
