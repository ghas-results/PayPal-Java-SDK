// This class was generated on Tue, 23 Jan 2018 10:55:03 CST by version 0.1.0-dev+20fb1e of Braintree SDK Generator
// PlanGetRequest.java
// @version 0.1.0-dev+20fb1e
// @type request
// @data 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
// DO NOT EDIT
package com.paypal.sdk.billingplans;

import com.braintreepayments.http.HttpRequest;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Shows details for a billing plan, by ID.
 */
public class PlanGetRequest extends HttpRequest<Plan> {

    public PlanGetRequest(String planId) {
        super("/v1/payments/billing-plans/{plan_id}?", "GET", Plan.class);
        try {
            path(path().replace("{plan_id}", URLEncoder.encode(String.valueOf(planId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    
}
