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
package com.amazonaws.services.cloudsearchdomain.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.cloudsearchdomain.model.*;

import com.amazonaws.protocol.json.*;

/**
 * FieldStatsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldStatsJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(FieldStats fieldStats, StructuredJsonGenerator jsonGenerator) {

        if (fieldStats == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (fieldStats.getMin() != null) {
                jsonGenerator.writeFieldName("min").writeValue(fieldStats.getMin());
            }
            if (fieldStats.getMax() != null) {
                jsonGenerator.writeFieldName("max").writeValue(fieldStats.getMax());
            }
            if (fieldStats.getCount() != null) {
                jsonGenerator.writeFieldName("count").writeValue(fieldStats.getCount());
            }
            if (fieldStats.getMissing() != null) {
                jsonGenerator.writeFieldName("missing").writeValue(fieldStats.getMissing());
            }
            if (fieldStats.getSum() != null) {
                jsonGenerator.writeFieldName("sum").writeValue(fieldStats.getSum());
            }
            if (fieldStats.getSumOfSquares() != null) {
                jsonGenerator.writeFieldName("sumOfSquares").writeValue(fieldStats.getSumOfSquares());
            }
            if (fieldStats.getMean() != null) {
                jsonGenerator.writeFieldName("mean").writeValue(fieldStats.getMean());
            }
            if (fieldStats.getStddev() != null) {
                jsonGenerator.writeFieldName("stddev").writeValue(fieldStats.getStddev());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static FieldStatsJsonMarshaller instance;

    public static FieldStatsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FieldStatsJsonMarshaller();
        return instance;
    }

}
