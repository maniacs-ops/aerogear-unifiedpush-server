/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.unifiedpush.api;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Metadata object that contains various informations around a submitted push message request
 */
public class PushMessageInformation extends BaseModel {

    @NotNull
    private String pushApplicationId;

    private String rawJsonMessage;
    private String ipAddress;

    private Date submitDate = new Date();
    private Set<VariantMetricInformation> variantInformations = new HashSet<VariantMetricInformation>();

    /**
     * The raw JSON payload of the push message request
     */
    public String getRawJsonMessage() {
        return rawJsonMessage;
    }

    public void setRawJsonMessage(String rawJsonMessage) {
        this.rawJsonMessage = rawJsonMessage;
    }

    /**
     * The IP from the submitter of the push message request
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * The date when the push message request has been processed on the UPS
     */
    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    /**
     * Collection of specific infos around the related variants
     */
    public Set<VariantMetricInformation> getVariantInformations() {
        return variantInformations;
    }

    public void setVariantInformations(Set<VariantMetricInformation> variantInformations) {
        this.variantInformations = variantInformations;
    }

    /**
     * The ID of the root push application, for which the push message request has been submitted
     */
    public String getPushApplicationId() {
        return pushApplicationId;
    }

    public void setPushApplicationId(String pushApplicationId) {
        this.pushApplicationId = pushApplicationId;
    }

}
