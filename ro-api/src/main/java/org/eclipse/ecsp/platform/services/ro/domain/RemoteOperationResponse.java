/*
 *
 * ******************************************************************************
 *
 *  Copyright (c) 2023-24 Harman International
 *
 *
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *
 *  you may not use this file except in compliance with the License.
 *
 *  You may obtain a copy of the License at
 *
 *
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 **
 *  Unless required by applicable law or agreed to in writing, software
 *
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *  See the License for the specific language governing permissions and
 *
 *  limitations under the License.
 *
 *
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  *******************************************************************************
 *
 */

package org.eclipse.ecsp.platform.services.ro.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.Setter;

/**
 * RemoteOperationResponse class.
 *
 * @author midnani
 */
@Setter
@Getter
@JsonInclude(Include.NON_NULL)
public class RemoteOperationResponse {

    private String message;

    private String roRequestId;

    public RemoteOperationResponse() {
    }

    public RemoteOperationResponse(String message, String roRequestId) {
        this.message = message;
        this.roRequestId = roRequestId;
    }

    public RemoteOperationResponse(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "RemoteOperationResponse ["
                + "message=" + message
                + ", roRequestId=" + roRequestId + "]";
    }

}
