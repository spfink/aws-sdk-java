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
package com.amazonaws.services.kinesis.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.kinesis.model.*;

import com.amazonaws.protocol.json.*;

/**
 * PutRecordsResultEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRecordsResultEntryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(PutRecordsResultEntry putRecordsResultEntry, StructuredJsonGenerator jsonGenerator) {

        if (putRecordsResultEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (putRecordsResultEntry.getSequenceNumber() != null) {
                jsonGenerator.writeFieldName("SequenceNumber").writeValue(putRecordsResultEntry.getSequenceNumber());
            }
            if (putRecordsResultEntry.getShardId() != null) {
                jsonGenerator.writeFieldName("ShardId").writeValue(putRecordsResultEntry.getShardId());
            }
            if (putRecordsResultEntry.getErrorCode() != null) {
                jsonGenerator.writeFieldName("ErrorCode").writeValue(putRecordsResultEntry.getErrorCode());
            }
            if (putRecordsResultEntry.getErrorMessage() != null) {
                jsonGenerator.writeFieldName("ErrorMessage").writeValue(putRecordsResultEntry.getErrorMessage());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static PutRecordsResultEntryJsonMarshaller instance;

    public static PutRecordsResultEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PutRecordsResultEntryJsonMarshaller();
        return instance;
    }

}
