/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

/**
 * <p>
 * You have reached the limit on the number of recorders you can create.
 * </p>
 */
public class MaxNumberOfConfigurationRecordersExceededException extends com.amazonaws.services.config.model.AmazonConfigException {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new MaxNumberOfConfigurationRecordersExceededException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public MaxNumberOfConfigurationRecordersExceededException(String message) {
        super(message);
    }

}
