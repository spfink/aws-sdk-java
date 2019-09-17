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
package com.amazonaws.services.eventbridge;

import javax.annotation.Generated;

import com.amazonaws.services.eventbridge.model.*;

/**
 * Interface for accessing Amazon EventBridge asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.eventbridge.AbstractAmazonEventBridgeAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon EventBridge helps you to respond to state changes in your AWS resources. When your resources change state,
 * they automatically send events into an event stream. You can create rules that match selected events in the stream
 * and route them to targets to take action. You can also use rules to take action on a predetermined schedule. For
 * example, you can configure rules to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Automatically invoke an AWS Lambda function to update DNS entries when an event notifies you that Amazon EC2 instance
 * enters the running state
 * </p>
 * </li>
 * <li>
 * <p>
 * Direct specific API records from AWS CloudTrail to an Amazon Kinesis data stream for detailed analysis of potential
 * security or availability risks
 * </p>
 * </li>
 * <li>
 * <p>
 * Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about the features of Amazon EventBridge, see the <a
 * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/">Amazon EventBridge User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonEventBridgeAsync extends AmazonEventBridge {

    /**
     * <p>
     * Activates a partner event source that has been deactivated. Once activated, your matching event bus will start
     * receiving events from the event source.
     * </p>
     * <note>
     * <p>
     * This operation is performed by AWS customers, not by SaaS partners.
     * </p>
     * </note>
     * 
     * @param activateEventSourceRequest
     * @return A Java Future containing the result of the ActivateEventSource operation returned by the service.
     * @sample AmazonEventBridgeAsync.ActivateEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ActivateEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ActivateEventSourceResult> activateEventSourceAsync(ActivateEventSourceRequest activateEventSourceRequest);

    /**
     * <p>
     * Activates a partner event source that has been deactivated. Once activated, your matching event bus will start
     * receiving events from the event source.
     * </p>
     * <note>
     * <p>
     * This operation is performed by AWS customers, not by SaaS partners.
     * </p>
     * </note>
     * 
     * @param activateEventSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ActivateEventSource operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.ActivateEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ActivateEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ActivateEventSourceResult> activateEventSourceAsync(ActivateEventSourceRequest activateEventSourceRequest,
            com.amazonaws.handlers.AsyncHandler<ActivateEventSourceRequest, ActivateEventSourceResult> asyncHandler);

    /**
     * <p>
     * Creates a new event bus within your account. This can be a custom event bus which you can use to receive events
     * from your own custom applications and services, or it can be a partner event bus which can be matched to a
     * partner event source.
     * </p>
     * <note>
     * <p>
     * This operation is used by AWS customers, not by SaaS partners.
     * </p>
     * </note>
     * 
     * @param createEventBusRequest
     * @return A Java Future containing the result of the CreateEventBus operation returned by the service.
     * @sample AmazonEventBridgeAsync.CreateEventBus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/CreateEventBus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEventBusResult> createEventBusAsync(CreateEventBusRequest createEventBusRequest);

    /**
     * <p>
     * Creates a new event bus within your account. This can be a custom event bus which you can use to receive events
     * from your own custom applications and services, or it can be a partner event bus which can be matched to a
     * partner event source.
     * </p>
     * <note>
     * <p>
     * This operation is used by AWS customers, not by SaaS partners.
     * </p>
     * </note>
     * 
     * @param createEventBusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEventBus operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.CreateEventBus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/CreateEventBus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateEventBusResult> createEventBusAsync(CreateEventBusRequest createEventBusRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEventBusRequest, CreateEventBusResult> asyncHandler);

    /**
     * <p>
     * Called by an SaaS partner to create a partner event source.
     * </p>
     * <note>
     * <p>
     * This operation is not used by AWS customers.
     * </p>
     * </note>
     * <p>
     * Each partner event source can be used by one AWS account to create a matching partner event bus in that AWS
     * account. A SaaS partner must create one partner event source for each AWS account that wants to receive those
     * event types.
     * </p>
     * <p>
     * A partner event source creates events based on resources in the SaaS partner's service or application.
     * </p>
     * <p>
     * An AWS account that creates a partner event bus that matches the partner event source can use that event bus to
     * receive events from the partner, and then process them using AWS Events rules and targets.
     * </p>
     * <p>
     * Partner event source names follow this format:
     * </p>
     * <p>
     * <code>aws.partner/<i>partner_name</i>/<i>event_namespace</i>/<i>event_name</i> </code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>partner_name</i> is determined during partner registration and identifies the partner to AWS customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <i>event_namespace</i>, we recommend that partners use a string that identifies the AWS customer within the
     * partner's system. This should not be the customer's AWS account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>event_name</i> is determined by the partner, and should uniquely identify an event-generating resource within
     * the partner system. This should help AWS customers decide whether to create an event bus to receive these events.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createPartnerEventSourceRequest
     * @return A Java Future containing the result of the CreatePartnerEventSource operation returned by the service.
     * @sample AmazonEventBridgeAsync.CreatePartnerEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/CreatePartnerEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePartnerEventSourceResult> createPartnerEventSourceAsync(CreatePartnerEventSourceRequest createPartnerEventSourceRequest);

    /**
     * <p>
     * Called by an SaaS partner to create a partner event source.
     * </p>
     * <note>
     * <p>
     * This operation is not used by AWS customers.
     * </p>
     * </note>
     * <p>
     * Each partner event source can be used by one AWS account to create a matching partner event bus in that AWS
     * account. A SaaS partner must create one partner event source for each AWS account that wants to receive those
     * event types.
     * </p>
     * <p>
     * A partner event source creates events based on resources in the SaaS partner's service or application.
     * </p>
     * <p>
     * An AWS account that creates a partner event bus that matches the partner event source can use that event bus to
     * receive events from the partner, and then process them using AWS Events rules and targets.
     * </p>
     * <p>
     * Partner event source names follow this format:
     * </p>
     * <p>
     * <code>aws.partner/<i>partner_name</i>/<i>event_namespace</i>/<i>event_name</i> </code>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>partner_name</i> is determined during partner registration and identifies the partner to AWS customers.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <i>event_namespace</i>, we recommend that partners use a string that identifies the AWS customer within the
     * partner's system. This should not be the customer's AWS account ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>event_name</i> is determined by the partner, and should uniquely identify an event-generating resource within
     * the partner system. This should help AWS customers decide whether to create an event bus to receive these events.
     * </p>
     * </li>
     * </ul>
     * 
     * @param createPartnerEventSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePartnerEventSource operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.CreatePartnerEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/CreatePartnerEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePartnerEventSourceResult> createPartnerEventSourceAsync(CreatePartnerEventSourceRequest createPartnerEventSourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePartnerEventSourceRequest, CreatePartnerEventSourceResult> asyncHandler);

    /**
     * <p>
     * An AWS customer uses this operation to temporarily stop receiving events from the specified partner event source.
     * The matching event bus isn't deleted.
     * </p>
     * <p>
     * When you deactivate a partner event source, the source goes into <code>PENDING</code> state. If it remains in
     * <code>PENDING</code> state for more than two weeks, it's deleted.
     * </p>
     * <p>
     * To activate a deactivated partner event source, use <a>ActivateEventSource</a>.
     * </p>
     * 
     * @param deactivateEventSourceRequest
     * @return A Java Future containing the result of the DeactivateEventSource operation returned by the service.
     * @sample AmazonEventBridgeAsync.DeactivateEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DeactivateEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeactivateEventSourceResult> deactivateEventSourceAsync(DeactivateEventSourceRequest deactivateEventSourceRequest);

    /**
     * <p>
     * An AWS customer uses this operation to temporarily stop receiving events from the specified partner event source.
     * The matching event bus isn't deleted.
     * </p>
     * <p>
     * When you deactivate a partner event source, the source goes into <code>PENDING</code> state. If it remains in
     * <code>PENDING</code> state for more than two weeks, it's deleted.
     * </p>
     * <p>
     * To activate a deactivated partner event source, use <a>ActivateEventSource</a>.
     * </p>
     * 
     * @param deactivateEventSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeactivateEventSource operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.DeactivateEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DeactivateEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeactivateEventSourceResult> deactivateEventSourceAsync(DeactivateEventSourceRequest deactivateEventSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeactivateEventSourceRequest, DeactivateEventSourceResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified custom event bus or partner event bus. All rules associated with this event bus are also
     * deleted. You can't delete your account's default event bus.
     * </p>
     * <note>
     * <p>
     * This operation is performed by AWS customers, not by SaaS partners.
     * </p>
     * </note>
     * 
     * @param deleteEventBusRequest
     * @return A Java Future containing the result of the DeleteEventBus operation returned by the service.
     * @sample AmazonEventBridgeAsync.DeleteEventBus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DeleteEventBus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventBusResult> deleteEventBusAsync(DeleteEventBusRequest deleteEventBusRequest);

    /**
     * <p>
     * Deletes the specified custom event bus or partner event bus. All rules associated with this event bus are also
     * deleted. You can't delete your account's default event bus.
     * </p>
     * <note>
     * <p>
     * This operation is performed by AWS customers, not by SaaS partners.
     * </p>
     * </note>
     * 
     * @param deleteEventBusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEventBus operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.DeleteEventBus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DeleteEventBus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteEventBusResult> deleteEventBusAsync(DeleteEventBusRequest deleteEventBusRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEventBusRequest, DeleteEventBusResult> asyncHandler);

    /**
     * <p>
     * This operation is used by SaaS partners to delete a partner event source. AWS customers don't use this operation.
     * </p>
     * <p>
     * When you delete an event source, the status of the corresponding partner event bus in the AWS customer account
     * becomes <code>DELETED</code>.
     * </p>
     * 
     * @param deletePartnerEventSourceRequest
     * @return A Java Future containing the result of the DeletePartnerEventSource operation returned by the service.
     * @sample AmazonEventBridgeAsync.DeletePartnerEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DeletePartnerEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePartnerEventSourceResult> deletePartnerEventSourceAsync(DeletePartnerEventSourceRequest deletePartnerEventSourceRequest);

    /**
     * <p>
     * This operation is used by SaaS partners to delete a partner event source. AWS customers don't use this operation.
     * </p>
     * <p>
     * When you delete an event source, the status of the corresponding partner event bus in the AWS customer account
     * becomes <code>DELETED</code>.
     * </p>
     * 
     * @param deletePartnerEventSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePartnerEventSource operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.DeletePartnerEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DeletePartnerEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePartnerEventSourceResult> deletePartnerEventSourceAsync(DeletePartnerEventSourceRequest deletePartnerEventSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePartnerEventSourceRequest, DeletePartnerEventSourceResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * <p>
     * Before you can delete the rule, you must remove all targets, using <a>RemoveTargets</a>.
     * </p>
     * <p>
     * When you delete a rule, incoming events might continue to match to the deleted rule. Allow a short period of time
     * for changes to take effect.
     * </p>
     * <p>
     * Managed rules are rules created and managed by another AWS service on your behalf. These rules are created by
     * those other AWS services to support functionality in those services. You can delete these rules using the
     * <code>Force</code> option, but you should do so only if you're sure that the other service isn't still using that
     * rule.
     * </p>
     * 
     * @param deleteRuleRequest
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonEventBridgeAsync.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest);

    /**
     * <p>
     * Deletes the specified rule.
     * </p>
     * <p>
     * Before you can delete the rule, you must remove all targets, using <a>RemoveTargets</a>.
     * </p>
     * <p>
     * When you delete a rule, incoming events might continue to match to the deleted rule. Allow a short period of time
     * for changes to take effect.
     * </p>
     * <p>
     * Managed rules are rules created and managed by another AWS service on your behalf. These rules are created by
     * those other AWS services to support functionality in those services. You can delete these rules using the
     * <code>Force</code> option, but you should do so only if you're sure that the other service isn't still using that
     * rule.
     * </p>
     * 
     * @param deleteRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRule operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.DeleteRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DeleteRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest deleteRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler);

    /**
     * <p>
     * Displays details about an event bus in your account. This can include the external AWS accounts that are
     * permitted to write events to your default event bus, and the associated policy. For custom event buses and
     * partner event buses, it displays the name, ARN, policy, state, and creation time.
     * </p>
     * <p>
     * To enable your account to receive events from other accounts on its default event bus, use <a>PutPermission</a>.
     * </p>
     * <p>
     * For more information about partner event buses, see <a>CreateEventBus</a>.
     * </p>
     * 
     * @param describeEventBusRequest
     * @return A Java Future containing the result of the DescribeEventBus operation returned by the service.
     * @sample AmazonEventBridgeAsync.DescribeEventBus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribeEventBus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventBusResult> describeEventBusAsync(DescribeEventBusRequest describeEventBusRequest);

    /**
     * <p>
     * Displays details about an event bus in your account. This can include the external AWS accounts that are
     * permitted to write events to your default event bus, and the associated policy. For custom event buses and
     * partner event buses, it displays the name, ARN, policy, state, and creation time.
     * </p>
     * <p>
     * To enable your account to receive events from other accounts on its default event bus, use <a>PutPermission</a>.
     * </p>
     * <p>
     * For more information about partner event buses, see <a>CreateEventBus</a>.
     * </p>
     * 
     * @param describeEventBusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventBus operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.DescribeEventBus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribeEventBus" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventBusResult> describeEventBusAsync(DescribeEventBusRequest describeEventBusRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventBusRequest, DescribeEventBusResult> asyncHandler);

    /**
     * <p>
     * This operation lists details about a partner event source that is shared with your account.
     * </p>
     * <note>
     * <p>
     * This operation is run by AWS customers, not by SaaS partners.
     * </p>
     * </note>
     * 
     * @param describeEventSourceRequest
     * @return A Java Future containing the result of the DescribeEventSource operation returned by the service.
     * @sample AmazonEventBridgeAsync.DescribeEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribeEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventSourceResult> describeEventSourceAsync(DescribeEventSourceRequest describeEventSourceRequest);

    /**
     * <p>
     * This operation lists details about a partner event source that is shared with your account.
     * </p>
     * <note>
     * <p>
     * This operation is run by AWS customers, not by SaaS partners.
     * </p>
     * </note>
     * 
     * @param describeEventSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEventSource operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.DescribeEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribeEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEventSourceResult> describeEventSourceAsync(DescribeEventSourceRequest describeEventSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEventSourceRequest, DescribeEventSourceResult> asyncHandler);

    /**
     * <p>
     * An SaaS partner can use this operation to list details about a partner event source that they have created.
     * </p>
     * <note>
     * <p>
     * AWS customers do not use this operation. Instead, AWS customers can use <a>DescribeEventSource</a> to see details
     * about a partner event source that is shared with them.
     * </p>
     * </note>
     * 
     * @param describePartnerEventSourceRequest
     * @return A Java Future containing the result of the DescribePartnerEventSource operation returned by the service.
     * @sample AmazonEventBridgeAsync.DescribePartnerEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribePartnerEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePartnerEventSourceResult> describePartnerEventSourceAsync(
            DescribePartnerEventSourceRequest describePartnerEventSourceRequest);

    /**
     * <p>
     * An SaaS partner can use this operation to list details about a partner event source that they have created.
     * </p>
     * <note>
     * <p>
     * AWS customers do not use this operation. Instead, AWS customers can use <a>DescribeEventSource</a> to see details
     * about a partner event source that is shared with them.
     * </p>
     * </note>
     * 
     * @param describePartnerEventSourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePartnerEventSource operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.DescribePartnerEventSource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribePartnerEventSource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePartnerEventSourceResult> describePartnerEventSourceAsync(
            DescribePartnerEventSourceRequest describePartnerEventSourceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePartnerEventSourceRequest, DescribePartnerEventSourceResult> asyncHandler);

    /**
     * <p>
     * Describes the specified rule.
     * </p>
     * <p>
     * <code>DescribeRule</code> doesn't list the targets of a rule. To see the targets associated with a rule, use
     * <a>ListTargetsByRule</a>.
     * </p>
     * 
     * @param describeRuleRequest
     * @return A Java Future containing the result of the DescribeRule operation returned by the service.
     * @sample AmazonEventBridgeAsync.DescribeRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribeRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest describeRuleRequest);

    /**
     * <p>
     * Describes the specified rule.
     * </p>
     * <p>
     * <code>DescribeRule</code> doesn't list the targets of a rule. To see the targets associated with a rule, use
     * <a>ListTargetsByRule</a>.
     * </p>
     * 
     * @param describeRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRule operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.DescribeRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribeRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest describeRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRuleRequest, DescribeRuleResult> asyncHandler);

    /**
     * <p>
     * Disables the specified rule. A disabled rule won't match any events and won't self-trigger if it has a schedule
     * expression.
     * </p>
     * <p>
     * When you disable a rule, incoming events might continue to match to the disabled rule. Allow a short period of
     * time for changes to take effect.
     * </p>
     * 
     * @param disableRuleRequest
     * @return A Java Future containing the result of the DisableRule operation returned by the service.
     * @sample AmazonEventBridgeAsync.DisableRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DisableRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableRuleResult> disableRuleAsync(DisableRuleRequest disableRuleRequest);

    /**
     * <p>
     * Disables the specified rule. A disabled rule won't match any events and won't self-trigger if it has a schedule
     * expression.
     * </p>
     * <p>
     * When you disable a rule, incoming events might continue to match to the disabled rule. Allow a short period of
     * time for changes to take effect.
     * </p>
     * 
     * @param disableRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableRule operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.DisableRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DisableRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisableRuleResult> disableRuleAsync(DisableRuleRequest disableRuleRequest,
            com.amazonaws.handlers.AsyncHandler<DisableRuleRequest, DisableRuleResult> asyncHandler);

    /**
     * <p>
     * Enables the specified rule. If the rule doesn't exist, the operation fails.
     * </p>
     * <p>
     * When you enable a rule, incoming events might not immediately start matching to a newly enabled rule. Allow a
     * short period of time for changes to take effect.
     * </p>
     * 
     * @param enableRuleRequest
     * @return A Java Future containing the result of the EnableRule operation returned by the service.
     * @sample AmazonEventBridgeAsync.EnableRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/EnableRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableRuleResult> enableRuleAsync(EnableRuleRequest enableRuleRequest);

    /**
     * <p>
     * Enables the specified rule. If the rule doesn't exist, the operation fails.
     * </p>
     * <p>
     * When you enable a rule, incoming events might not immediately start matching to a newly enabled rule. Allow a
     * short period of time for changes to take effect.
     * </p>
     * 
     * @param enableRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableRule operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.EnableRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/EnableRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<EnableRuleResult> enableRuleAsync(EnableRuleRequest enableRuleRequest,
            com.amazonaws.handlers.AsyncHandler<EnableRuleRequest, EnableRuleResult> asyncHandler);

    /**
     * <p>
     * Lists all the event buses in your account, including the default event bus, custom event buses, and partner event
     * buses.
     * </p>
     * <note>
     * <p>
     * This operation is run by AWS customers, not by SaaS partners.
     * </p>
     * </note>
     * 
     * @param listEventBusesRequest
     * @return A Java Future containing the result of the ListEventBuses operation returned by the service.
     * @sample AmazonEventBridgeAsync.ListEventBuses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListEventBuses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEventBusesResult> listEventBusesAsync(ListEventBusesRequest listEventBusesRequest);

    /**
     * <p>
     * Lists all the event buses in your account, including the default event bus, custom event buses, and partner event
     * buses.
     * </p>
     * <note>
     * <p>
     * This operation is run by AWS customers, not by SaaS partners.
     * </p>
     * </note>
     * 
     * @param listEventBusesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEventBuses operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.ListEventBuses
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListEventBuses" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListEventBusesResult> listEventBusesAsync(ListEventBusesRequest listEventBusesRequest,
            com.amazonaws.handlers.AsyncHandler<ListEventBusesRequest, ListEventBusesResult> asyncHandler);

    /**
     * <p>
     * You can use this to see all the partner event sources that have been shared with your AWS account. For more
     * information about partner event sources, see <a>CreateEventBus</a>.
     * </p>
     * <note>
     * <p>
     * This operation is run by AWS customers, not by SaaS partners.
     * </p>
     * </note>
     * 
     * @param listEventSourcesRequest
     * @return A Java Future containing the result of the ListEventSources operation returned by the service.
     * @sample AmazonEventBridgeAsync.ListEventSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListEventSources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEventSourcesResult> listEventSourcesAsync(ListEventSourcesRequest listEventSourcesRequest);

    /**
     * <p>
     * You can use this to see all the partner event sources that have been shared with your AWS account. For more
     * information about partner event sources, see <a>CreateEventBus</a>.
     * </p>
     * <note>
     * <p>
     * This operation is run by AWS customers, not by SaaS partners.
     * </p>
     * </note>
     * 
     * @param listEventSourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEventSources operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.ListEventSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListEventSources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListEventSourcesResult> listEventSourcesAsync(ListEventSourcesRequest listEventSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListEventSourcesRequest, ListEventSourcesResult> asyncHandler);

    /**
     * <p>
     * An SaaS partner can use this operation to display the AWS account ID that a particular partner event source name
     * is associated with.
     * </p>
     * <note>
     * <p>
     * This operation is used by SaaS partners, not by AWS customers.
     * </p>
     * </note>
     * 
     * @param listPartnerEventSourceAccountsRequest
     * @return A Java Future containing the result of the ListPartnerEventSourceAccounts operation returned by the
     *         service.
     * @sample AmazonEventBridgeAsync.ListPartnerEventSourceAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListPartnerEventSourceAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPartnerEventSourceAccountsResult> listPartnerEventSourceAccountsAsync(
            ListPartnerEventSourceAccountsRequest listPartnerEventSourceAccountsRequest);

    /**
     * <p>
     * An SaaS partner can use this operation to display the AWS account ID that a particular partner event source name
     * is associated with.
     * </p>
     * <note>
     * <p>
     * This operation is used by SaaS partners, not by AWS customers.
     * </p>
     * </note>
     * 
     * @param listPartnerEventSourceAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPartnerEventSourceAccounts operation returned by the
     *         service.
     * @sample AmazonEventBridgeAsyncHandler.ListPartnerEventSourceAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListPartnerEventSourceAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPartnerEventSourceAccountsResult> listPartnerEventSourceAccountsAsync(
            ListPartnerEventSourceAccountsRequest listPartnerEventSourceAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPartnerEventSourceAccountsRequest, ListPartnerEventSourceAccountsResult> asyncHandler);

    /**
     * <p>
     * An SaaS partner can use this operation to list all the partner event source names that they have created.
     * </p>
     * <note>
     * <p>
     * This operation is not used by AWS customers.
     * </p>
     * </note>
     * 
     * @param listPartnerEventSourcesRequest
     * @return A Java Future containing the result of the ListPartnerEventSources operation returned by the service.
     * @sample AmazonEventBridgeAsync.ListPartnerEventSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListPartnerEventSources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPartnerEventSourcesResult> listPartnerEventSourcesAsync(ListPartnerEventSourcesRequest listPartnerEventSourcesRequest);

    /**
     * <p>
     * An SaaS partner can use this operation to list all the partner event source names that they have created.
     * </p>
     * <note>
     * <p>
     * This operation is not used by AWS customers.
     * </p>
     * </note>
     * 
     * @param listPartnerEventSourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPartnerEventSources operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.ListPartnerEventSources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListPartnerEventSources"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPartnerEventSourcesResult> listPartnerEventSourcesAsync(ListPartnerEventSourcesRequest listPartnerEventSourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPartnerEventSourcesRequest, ListPartnerEventSourcesResult> asyncHandler);

    /**
     * <p>
     * Lists the rules for the specified target. You can see which rules can invoke a specific target in your account.
     * </p>
     * 
     * @param listRuleNamesByTargetRequest
     * @return A Java Future containing the result of the ListRuleNamesByTarget operation returned by the service.
     * @sample AmazonEventBridgeAsync.ListRuleNamesByTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListRuleNamesByTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRuleNamesByTargetResult> listRuleNamesByTargetAsync(ListRuleNamesByTargetRequest listRuleNamesByTargetRequest);

    /**
     * <p>
     * Lists the rules for the specified target. You can see which rules can invoke a specific target in your account.
     * </p>
     * 
     * @param listRuleNamesByTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRuleNamesByTarget operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.ListRuleNamesByTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListRuleNamesByTarget"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRuleNamesByTargetResult> listRuleNamesByTargetAsync(ListRuleNamesByTargetRequest listRuleNamesByTargetRequest,
            com.amazonaws.handlers.AsyncHandler<ListRuleNamesByTargetRequest, ListRuleNamesByTargetResult> asyncHandler);

    /**
     * <p>
     * Lists your EventBridge rules. You can either list all the rules or provide a prefix to match to the rule names.
     * </p>
     * <p>
     * <code>ListRules</code> doesn't list the targets of a rule. To see the targets associated with a rule, use
     * <a>ListTargetsByRule</a>.
     * </p>
     * 
     * @param listRulesRequest
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AmazonEventBridgeAsync.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest);

    /**
     * <p>
     * Lists your EventBridge rules. You can either list all the rules or provide a prefix to match to the rule names.
     * </p>
     * <p>
     * <code>ListRules</code> doesn't list the targets of a rule. To see the targets associated with a rule, use
     * <a>ListTargetsByRule</a>.
     * </p>
     * 
     * @param listRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRules operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.ListRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListRules" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest listRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler);

    /**
     * <p>
     * Displays the tags associated with an EventBridge resource. In EventBridge, rules can be tagged.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonEventBridgeAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Displays the tags associated with an EventBridge resource. In EventBridge, rules can be tagged.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Lists the targets assigned to the specified rule.
     * </p>
     * 
     * @param listTargetsByRuleRequest
     * @return A Java Future containing the result of the ListTargetsByRule operation returned by the service.
     * @sample AmazonEventBridgeAsync.ListTargetsByRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListTargetsByRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTargetsByRuleResult> listTargetsByRuleAsync(ListTargetsByRuleRequest listTargetsByRuleRequest);

    /**
     * <p>
     * Lists the targets assigned to the specified rule.
     * </p>
     * 
     * @param listTargetsByRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTargetsByRule operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.ListTargetsByRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/ListTargetsByRule" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTargetsByRuleResult> listTargetsByRuleAsync(ListTargetsByRuleRequest listTargetsByRuleRequest,
            com.amazonaws.handlers.AsyncHandler<ListTargetsByRuleRequest, ListTargetsByRuleResult> asyncHandler);

    /**
     * <p>
     * Sends custom events to EventBridge so that they can be matched to rules. These events can be from your custom
     * applications and services.
     * </p>
     * 
     * @param putEventsRequest
     * @return A Java Future containing the result of the PutEvents operation returned by the service.
     * @sample AmazonEventBridgeAsync.PutEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PutEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest putEventsRequest);

    /**
     * <p>
     * Sends custom events to EventBridge so that they can be matched to rules. These events can be from your custom
     * applications and services.
     * </p>
     * 
     * @param putEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutEvents operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.PutEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PutEvents" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest putEventsRequest,
            com.amazonaws.handlers.AsyncHandler<PutEventsRequest, PutEventsResult> asyncHandler);

    /**
     * <p>
     * This is used by SaaS partners to write events to a customer's partner event bus.
     * </p>
     * <note>
     * <p>
     * AWS customers do not use this operation. Instead, AWS customers can use <a>PutEvents</a> to write custom events
     * from their own applications to an event bus.
     * </p>
     * </note>
     * 
     * @param putPartnerEventsRequest
     * @return A Java Future containing the result of the PutPartnerEvents operation returned by the service.
     * @sample AmazonEventBridgeAsync.PutPartnerEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PutPartnerEvents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutPartnerEventsResult> putPartnerEventsAsync(PutPartnerEventsRequest putPartnerEventsRequest);

    /**
     * <p>
     * This is used by SaaS partners to write events to a customer's partner event bus.
     * </p>
     * <note>
     * <p>
     * AWS customers do not use this operation. Instead, AWS customers can use <a>PutEvents</a> to write custom events
     * from their own applications to an event bus.
     * </p>
     * </note>
     * 
     * @param putPartnerEventsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPartnerEvents operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.PutPartnerEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PutPartnerEvents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutPartnerEventsResult> putPartnerEventsAsync(PutPartnerEventsRequest putPartnerEventsRequest,
            com.amazonaws.handlers.AsyncHandler<PutPartnerEventsRequest, PutPartnerEventsResult> asyncHandler);

    /**
     * <p>
     * Running <code>PutPermission</code> permits the specified AWS account or AWS organization to put events to the
     * specified <i>event bus</i>. Rules in your account are triggered by these events arriving to an event bus in your
     * account.
     * </p>
     * <p>
     * For another account to send events to your account, that external account must have a rule with your account's
     * event bus as a target.
     * </p>
     * <p>
     * To enable multiple AWS accounts to put events to an event bus, run <code>PutPermission</code> once for each of
     * these accounts. Or, if all the accounts are members of the same AWS organization, you can run
     * <code>PutPermission</code> once specifying <code>Principal</code> as "*" and specifying the AWS organization ID
     * in <code>Condition</code>, to grant permissions to all accounts in that organization.
     * </p>
     * <p>
     * If you grant permissions using an organization, then accounts in that organization must specify a
     * <code>RoleArn</code> with proper permissions when they use <code>PutTarget</code> to add your account's event bus
     * as a target. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html"
     * >Sending and Receiving Events Between AWS Accounts</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * <p>
     * The permission policy on an event bus can't exceed 10 KB in size.
     * </p>
     * 
     * @param putPermissionRequest
     * @return A Java Future containing the result of the PutPermission operation returned by the service.
     * @sample AmazonEventBridgeAsync.PutPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PutPermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutPermissionResult> putPermissionAsync(PutPermissionRequest putPermissionRequest);

    /**
     * <p>
     * Running <code>PutPermission</code> permits the specified AWS account or AWS organization to put events to the
     * specified <i>event bus</i>. Rules in your account are triggered by these events arriving to an event bus in your
     * account.
     * </p>
     * <p>
     * For another account to send events to your account, that external account must have a rule with your account's
     * event bus as a target.
     * </p>
     * <p>
     * To enable multiple AWS accounts to put events to an event bus, run <code>PutPermission</code> once for each of
     * these accounts. Or, if all the accounts are members of the same AWS organization, you can run
     * <code>PutPermission</code> once specifying <code>Principal</code> as "*" and specifying the AWS organization ID
     * in <code>Condition</code>, to grant permissions to all accounts in that organization.
     * </p>
     * <p>
     * If you grant permissions using an organization, then accounts in that organization must specify a
     * <code>RoleArn</code> with proper permissions when they use <code>PutTarget</code> to add your account's event bus
     * as a target. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html"
     * >Sending and Receiving Events Between AWS Accounts</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * <p>
     * The permission policy on an event bus can't exceed 10 KB in size.
     * </p>
     * 
     * @param putPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPermission operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.PutPermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PutPermission" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutPermissionResult> putPermissionAsync(PutPermissionRequest putPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<PutPermissionRequest, PutPermissionResult> asyncHandler);

    /**
     * <p>
     * Creates or updates the specified rule. Rules are enabled by default or based on value of the state. You can
     * disable a rule using <a>DisableRule</a>.
     * </p>
     * <p>
     * A single rule watches for events from a single event bus. Events generated by AWS services go to your account's
     * default event bus. Events generated by SaaS partner services or applications go to the matching partner event
     * bus. If you have custom applications or services, you can specify whether their events go to your default event
     * bus or a custom event bus that you have created. For more information, see <a>CreateEventBus</a>.
     * </p>
     * <p>
     * If you're updating an existing rule, the rule is replaced with what you specify in this <code>PutRule</code>
     * command. If you omit arguments in <code>PutRule</code>, the old values for those arguments aren't kept. Instead,
     * they're replaced with null values.
     * </p>
     * <p>
     * When you create or update a rule, incoming events might not immediately start matching to new or updated rules.
     * Allow a short period of time for changes to take effect.
     * </p>
     * <p>
     * A rule must contain at least an <code>EventPattern</code> or <code>ScheduleExpression</code>. Rules with
     * <code>EventPatterns</code> are triggered when a matching event is observed. Rules with
     * <code>ScheduleExpressions</code> self-trigger based on the given schedule. A rule can have both an
     * <code>EventPattern</code> and a <code>ScheduleExpression</code>, in which case the rule triggers on matching
     * events as well as on a schedule.
     * </p>
     * <p>
     * When you initially create a rule, you can optionally assign one or more tags to the rule. Tags can help you
     * organize and categorize your resources. You can also use them to scope user permissions, by granting a user
     * permission to access or change only rules with certain tag values. To use the <code>PutRule</code> operation and
     * assign tags, you must have both the <code>events:PutRule</code> and <code>events:TagResource</code> permissions.
     * </p>
     * <p>
     * If you are updating an existing rule, any tags you specify in the <code>PutRule</code> operation are ignored. To
     * update the tags of an existing rule, use <a>TagResource</a> and <a>UntagResource</a>.
     * </p>
     * <p>
     * Most services in AWS treat <code>:</code> or <code>/</code> as the same character in Amazon Resource Names
     * (ARNs). However, EventBridge uses an exact match in event patterns and rules. Be sure to use the correct ARN
     * characters when creating event patterns so that they match the ARN syntax in the event that you want to match.
     * </p>
     * <p>
     * In EventBridge, you could create rules that lead to infinite loops, where a rule is fired repeatedly. For
     * example, a rule might detect that ACLs have changed on an S3 bucket, and trigger software to change them to the
     * desired state. If you don't write the rule carefully, the subsequent change to the ACLs fires the rule again,
     * creating an infinite loop.
     * </p>
     * <p>
     * To prevent this, write the rules so that the triggered actions don't refire the same rule. For example, your rule
     * could fire only if ACLs are found to be in a bad state, instead of after any change.
     * </p>
     * <p>
     * An infinite loop can quickly cause higher than expected charges. We recommend that you use budgeting, which
     * alerts you when charges exceed your specified limit. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/budgets-managing-costs.html">Managing Your
     * Costs with Budgets</a>.
     * </p>
     * 
     * @param putRuleRequest
     * @return A Java Future containing the result of the PutRule operation returned by the service.
     * @sample AmazonEventBridgeAsync.PutRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PutRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutRuleResult> putRuleAsync(PutRuleRequest putRuleRequest);

    /**
     * <p>
     * Creates or updates the specified rule. Rules are enabled by default or based on value of the state. You can
     * disable a rule using <a>DisableRule</a>.
     * </p>
     * <p>
     * A single rule watches for events from a single event bus. Events generated by AWS services go to your account's
     * default event bus. Events generated by SaaS partner services or applications go to the matching partner event
     * bus. If you have custom applications or services, you can specify whether their events go to your default event
     * bus or a custom event bus that you have created. For more information, see <a>CreateEventBus</a>.
     * </p>
     * <p>
     * If you're updating an existing rule, the rule is replaced with what you specify in this <code>PutRule</code>
     * command. If you omit arguments in <code>PutRule</code>, the old values for those arguments aren't kept. Instead,
     * they're replaced with null values.
     * </p>
     * <p>
     * When you create or update a rule, incoming events might not immediately start matching to new or updated rules.
     * Allow a short period of time for changes to take effect.
     * </p>
     * <p>
     * A rule must contain at least an <code>EventPattern</code> or <code>ScheduleExpression</code>. Rules with
     * <code>EventPatterns</code> are triggered when a matching event is observed. Rules with
     * <code>ScheduleExpressions</code> self-trigger based on the given schedule. A rule can have both an
     * <code>EventPattern</code> and a <code>ScheduleExpression</code>, in which case the rule triggers on matching
     * events as well as on a schedule.
     * </p>
     * <p>
     * When you initially create a rule, you can optionally assign one or more tags to the rule. Tags can help you
     * organize and categorize your resources. You can also use them to scope user permissions, by granting a user
     * permission to access or change only rules with certain tag values. To use the <code>PutRule</code> operation and
     * assign tags, you must have both the <code>events:PutRule</code> and <code>events:TagResource</code> permissions.
     * </p>
     * <p>
     * If you are updating an existing rule, any tags you specify in the <code>PutRule</code> operation are ignored. To
     * update the tags of an existing rule, use <a>TagResource</a> and <a>UntagResource</a>.
     * </p>
     * <p>
     * Most services in AWS treat <code>:</code> or <code>/</code> as the same character in Amazon Resource Names
     * (ARNs). However, EventBridge uses an exact match in event patterns and rules. Be sure to use the correct ARN
     * characters when creating event patterns so that they match the ARN syntax in the event that you want to match.
     * </p>
     * <p>
     * In EventBridge, you could create rules that lead to infinite loops, where a rule is fired repeatedly. For
     * example, a rule might detect that ACLs have changed on an S3 bucket, and trigger software to change them to the
     * desired state. If you don't write the rule carefully, the subsequent change to the ACLs fires the rule again,
     * creating an infinite loop.
     * </p>
     * <p>
     * To prevent this, write the rules so that the triggered actions don't refire the same rule. For example, your rule
     * could fire only if ACLs are found to be in a bad state, instead of after any change.
     * </p>
     * <p>
     * An infinite loop can quickly cause higher than expected charges. We recommend that you use budgeting, which
     * alerts you when charges exceed your specified limit. For more information, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/budgets-managing-costs.html">Managing Your
     * Costs with Budgets</a>.
     * </p>
     * 
     * @param putRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutRule operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.PutRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PutRule" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutRuleResult> putRuleAsync(PutRuleRequest putRuleRequest,
            com.amazonaws.handlers.AsyncHandler<PutRuleRequest, PutRuleResult> asyncHandler);

    /**
     * <p>
     * Adds the specified targets to the specified rule, or updates the targets if they're already associated with the
     * rule.
     * </p>
     * <p>
     * Targets are the resources that are invoked when a rule is triggered.
     * </p>
     * <p>
     * You can configure the following as targets in EventBridge:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EC2 instances
     * </p>
     * </li>
     * <li>
     * <p>
     * SSM Run Command
     * </p>
     * </li>
     * <li>
     * <p>
     * SSM Automation
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Lambda functions
     * </p>
     * </li>
     * <li>
     * <p>
     * Data streams in Amazon Kinesis Data Streams
     * </p>
     * </li>
     * <li>
     * <p>
     * Data delivery streams in Amazon Kinesis Data Firehose
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon ECS tasks
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Step Functions state machines
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Batch jobs
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS CodeBuild projects
     * </p>
     * </li>
     * <li>
     * <p>
     * Pipelines in AWS CodePipeline
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Inspector assessment templates
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SNS topics
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SQS queues, including FIFO queues
     * </p>
     * </li>
     * <li>
     * <p>
     * The default event bus of another AWS account
     * </p>
     * </li>
     * </ul>
     * <p>
     * Creating rules with built-in targets is supported only on the AWS Management Console. The built-in targets are
     * <code>EC2 CreateSnapshot API call</code>, <code>EC2 RebootInstances API call</code>,
     * <code>EC2 StopInstances API call</code>, and <code>EC2 TerminateInstances API call</code>.
     * </p>
     * <p>
     * For some target types, <code>PutTargets</code> provides target-specific parameters. If the target is a Kinesis
     * data stream, you can optionally specify which shard the event goes to by using the <code>KinesisParameters</code>
     * argument. To invoke a command on multiple EC2 instances with one rule, you can use the
     * <code>RunCommandParameters</code> field.
     * </p>
     * <p>
     * To be able to make API calls against the resources that you own, Amazon EventBridge needs the appropriate
     * permissions. For AWS Lambda and Amazon SNS resources, EventBridge relies on resource-based policies. For EC2
     * instances, Kinesis data streams, and AWS Step Functions state machines, EventBridge relies on IAM roles that you
     * specify in the <code>RoleARN</code> argument in <code>PutTargets</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/auth-and-access-control-eventbridge.html"
     * >Authentication and Access Control</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * <p>
     * If another AWS account is in the same Region and has granted you permission (using <code>PutPermission</code>),
     * you can send events to that account. Set that account's event bus as a target of the rules in your account. To
     * send the matched events to the other account, specify that account's event bus as the <code>Arn</code> value when
     * you run <code>PutTargets</code>. If your account sends events to another account, your account is charged for
     * each sent event. Each event sent to another account is charged as a custom event. The account receiving the event
     * isn't charged. For more information, see <a href="https://aws.amazon.com/eventbridge/pricing/">Amazon EventBridge
     * Pricing</a>.
     * </p>
     * <p>
     * If you're setting an event bus in another account as the target and that account granted permission to your
     * account through an organization instead of directly by the account ID, you must specify a <code>RoleArn</code>
     * with proper permissions in the <code>Target</code> structure. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html"
     * >Sending and Receiving Events Between AWS Accounts</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * <p>
     * For more information about enabling cross-account events, see <a>PutPermission</a>.
     * </p>
     * <p>
     * <code>Input</code>, <code>InputPath</code>, and <code>InputTransformer</code> are mutually exclusive and optional
     * parameters of a target. When a rule is triggered due to a matched event:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If none of the following arguments are specified for a target, the entire event is passed to the target in JSON
     * format (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event is
     * passed to the target).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Input</code> is specified in the form of valid JSON, then the matched event is overridden with this
     * constant.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>InputPath</code> is specified in the form of JSONPath (for example, <code>$.detail</code>), only the
     * part of the event specified in the path is passed to the target (for example, only the detail part of the event
     * is passed).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>InputTransformer</code> is specified, one or more specified JSONPaths are extracted from the event and
     * used as values in a template that you specify as the input to the target.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify <code>InputPath</code> or <code>InputTransformer</code>, you must use JSON dot notation, not
     * bracket notation.
     * </p>
     * <p>
     * When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be
     * immediately invoked. Allow a short period of time for changes to take effect.
     * </p>
     * <p>
     * This action can partially fail if too many requests are made at the same time. If that happens,
     * <code>FailedEntryCount</code> is nonzero in the response, and each entry in <code>FailedEntries</code> provides
     * the ID of the failed target and the error code.
     * </p>
     * 
     * @param putTargetsRequest
     * @return A Java Future containing the result of the PutTargets operation returned by the service.
     * @sample AmazonEventBridgeAsync.PutTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PutTargets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutTargetsResult> putTargetsAsync(PutTargetsRequest putTargetsRequest);

    /**
     * <p>
     * Adds the specified targets to the specified rule, or updates the targets if they're already associated with the
     * rule.
     * </p>
     * <p>
     * Targets are the resources that are invoked when a rule is triggered.
     * </p>
     * <p>
     * You can configure the following as targets in EventBridge:
     * </p>
     * <ul>
     * <li>
     * <p>
     * EC2 instances
     * </p>
     * </li>
     * <li>
     * <p>
     * SSM Run Command
     * </p>
     * </li>
     * <li>
     * <p>
     * SSM Automation
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Lambda functions
     * </p>
     * </li>
     * <li>
     * <p>
     * Data streams in Amazon Kinesis Data Streams
     * </p>
     * </li>
     * <li>
     * <p>
     * Data delivery streams in Amazon Kinesis Data Firehose
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon ECS tasks
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Step Functions state machines
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS Batch jobs
     * </p>
     * </li>
     * <li>
     * <p>
     * AWS CodeBuild projects
     * </p>
     * </li>
     * <li>
     * <p>
     * Pipelines in AWS CodePipeline
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Inspector assessment templates
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SNS topics
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon SQS queues, including FIFO queues
     * </p>
     * </li>
     * <li>
     * <p>
     * The default event bus of another AWS account
     * </p>
     * </li>
     * </ul>
     * <p>
     * Creating rules with built-in targets is supported only on the AWS Management Console. The built-in targets are
     * <code>EC2 CreateSnapshot API call</code>, <code>EC2 RebootInstances API call</code>,
     * <code>EC2 StopInstances API call</code>, and <code>EC2 TerminateInstances API call</code>.
     * </p>
     * <p>
     * For some target types, <code>PutTargets</code> provides target-specific parameters. If the target is a Kinesis
     * data stream, you can optionally specify which shard the event goes to by using the <code>KinesisParameters</code>
     * argument. To invoke a command on multiple EC2 instances with one rule, you can use the
     * <code>RunCommandParameters</code> field.
     * </p>
     * <p>
     * To be able to make API calls against the resources that you own, Amazon EventBridge needs the appropriate
     * permissions. For AWS Lambda and Amazon SNS resources, EventBridge relies on resource-based policies. For EC2
     * instances, Kinesis data streams, and AWS Step Functions state machines, EventBridge relies on IAM roles that you
     * specify in the <code>RoleARN</code> argument in <code>PutTargets</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/auth-and-access-control-eventbridge.html"
     * >Authentication and Access Control</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * <p>
     * If another AWS account is in the same Region and has granted you permission (using <code>PutPermission</code>),
     * you can send events to that account. Set that account's event bus as a target of the rules in your account. To
     * send the matched events to the other account, specify that account's event bus as the <code>Arn</code> value when
     * you run <code>PutTargets</code>. If your account sends events to another account, your account is charged for
     * each sent event. Each event sent to another account is charged as a custom event. The account receiving the event
     * isn't charged. For more information, see <a href="https://aws.amazon.com/eventbridge/pricing/">Amazon EventBridge
     * Pricing</a>.
     * </p>
     * <p>
     * If you're setting an event bus in another account as the target and that account granted permission to your
     * account through an organization instead of directly by the account ID, you must specify a <code>RoleArn</code>
     * with proper permissions in the <code>Target</code> structure. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html"
     * >Sending and Receiving Events Between AWS Accounts</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * <p>
     * For more information about enabling cross-account events, see <a>PutPermission</a>.
     * </p>
     * <p>
     * <code>Input</code>, <code>InputPath</code>, and <code>InputTransformer</code> are mutually exclusive and optional
     * parameters of a target. When a rule is triggered due to a matched event:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If none of the following arguments are specified for a target, the entire event is passed to the target in JSON
     * format (unless the target is Amazon EC2 Run Command or Amazon ECS task, in which case nothing from the event is
     * passed to the target).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>Input</code> is specified in the form of valid JSON, then the matched event is overridden with this
     * constant.
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>InputPath</code> is specified in the form of JSONPath (for example, <code>$.detail</code>), only the
     * part of the event specified in the path is passed to the target (for example, only the detail part of the event
     * is passed).
     * </p>
     * </li>
     * <li>
     * <p>
     * If <code>InputTransformer</code> is specified, one or more specified JSONPaths are extracted from the event and
     * used as values in a template that you specify as the input to the target.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When you specify <code>InputPath</code> or <code>InputTransformer</code>, you must use JSON dot notation, not
     * bracket notation.
     * </p>
     * <p>
     * When you add targets to a rule and the associated rule triggers soon after, new or updated targets might not be
     * immediately invoked. Allow a short period of time for changes to take effect.
     * </p>
     * <p>
     * This action can partially fail if too many requests are made at the same time. If that happens,
     * <code>FailedEntryCount</code> is nonzero in the response, and each entry in <code>FailedEntries</code> provides
     * the ID of the failed target and the error code.
     * </p>
     * 
     * @param putTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutTargets operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.PutTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/PutTargets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutTargetsResult> putTargetsAsync(PutTargetsRequest putTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<PutTargetsRequest, PutTargetsResult> asyncHandler);

    /**
     * <p>
     * Revokes the permission of another AWS account to be able to put events to the specified event bus. Specify the
     * account to revoke by the <code>StatementId</code> value that you associated with the account when you granted it
     * permission with <code>PutPermission</code>. You can find the <code>StatementId</code> by using
     * <a>DescribeEventBus</a>.
     * </p>
     * 
     * @param removePermissionRequest
     * @return A Java Future containing the result of the RemovePermission operation returned by the service.
     * @sample AmazonEventBridgeAsync.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/RemovePermission" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest removePermissionRequest);

    /**
     * <p>
     * Revokes the permission of another AWS account to be able to put events to the specified event bus. Specify the
     * account to revoke by the <code>StatementId</code> value that you associated with the account when you granted it
     * permission with <code>PutPermission</code>. You can find the <code>StatementId</code> by using
     * <a>DescribeEventBus</a>.
     * </p>
     * 
     * @param removePermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemovePermission operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.RemovePermission
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/RemovePermission" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest removePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler);

    /**
     * <p>
     * Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be
     * invoked.
     * </p>
     * <p>
     * When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Allow
     * a short period of time for changes to take effect.
     * </p>
     * <p>
     * This action can partially fail if too many requests are made at the same time. If that happens,
     * <code>FailedEntryCount</code> is non-zero in the response and each entry in <code>FailedEntries</code> provides
     * the ID of the failed target and the error code.
     * </p>
     * 
     * @param removeTargetsRequest
     * @return A Java Future containing the result of the RemoveTargets operation returned by the service.
     * @sample AmazonEventBridgeAsync.RemoveTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/RemoveTargets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTargetsResult> removeTargetsAsync(RemoveTargetsRequest removeTargetsRequest);

    /**
     * <p>
     * Removes the specified targets from the specified rule. When the rule is triggered, those targets are no longer be
     * invoked.
     * </p>
     * <p>
     * When you remove a target, when the associated rule triggers, removed targets might continue to be invoked. Allow
     * a short period of time for changes to take effect.
     * </p>
     * <p>
     * This action can partially fail if too many requests are made at the same time. If that happens,
     * <code>FailedEntryCount</code> is non-zero in the response and each entry in <code>FailedEntries</code> provides
     * the ID of the failed target and the error code.
     * </p>
     * 
     * @param removeTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTargets operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.RemoveTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/RemoveTargets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RemoveTargetsResult> removeTargetsAsync(RemoveTargetsRequest removeTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTargetsRequest, RemoveTargetsResult> asyncHandler);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified EventBridge resource. Tags can help you organize and
     * categorize your resources. You can also use them to scope user permissions by granting a user permission to
     * access or change only resources with certain tag values. In EventBridge, rules can be tagged.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a rule that already has tags. If you specify a new tag key
     * for the rule, this tag is appended to the list of tags associated with the rule. If you specify a tag key that is
     * already associated with the rule, the new tag value that you specify replaces the previous value for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonEventBridgeAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified EventBridge resource. Tags can help you organize and
     * categorize your resources. You can also use them to scope user permissions by granting a user permission to
     * access or change only resources with certain tag values. In EventBridge, rules can be tagged.
     * </p>
     * <p>
     * Tags don't have any semantic meaning to AWS and are interpreted strictly as strings of characters.
     * </p>
     * <p>
     * You can use the <code>TagResource</code> action with a rule that already has tags. If you specify a new tag key
     * for the rule, this tag is appended to the list of tags associated with the rule. If you specify a tag key that is
     * already associated with the rule, the new tag value that you specify replaces the previous value for that tag.
     * </p>
     * <p>
     * You can associate as many as 50 tags with a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Tests whether the specified event pattern matches the provided event.
     * </p>
     * <p>
     * Most services in AWS treat <code>:</code> or <code>/</code> as the same character in Amazon Resource Names
     * (ARNs). However, EventBridge uses an exact match in event patterns and rules. Be sure to use the correct ARN
     * characters when creating event patterns so that they match the ARN syntax in the event that you want to match.
     * </p>
     * 
     * @param testEventPatternRequest
     * @return A Java Future containing the result of the TestEventPattern operation returned by the service.
     * @sample AmazonEventBridgeAsync.TestEventPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/TestEventPattern" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TestEventPatternResult> testEventPatternAsync(TestEventPatternRequest testEventPatternRequest);

    /**
     * <p>
     * Tests whether the specified event pattern matches the provided event.
     * </p>
     * <p>
     * Most services in AWS treat <code>:</code> or <code>/</code> as the same character in Amazon Resource Names
     * (ARNs). However, EventBridge uses an exact match in event patterns and rules. Be sure to use the correct ARN
     * characters when creating event patterns so that they match the ARN syntax in the event that you want to match.
     * </p>
     * 
     * @param testEventPatternRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TestEventPattern operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.TestEventPattern
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/TestEventPattern" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TestEventPatternResult> testEventPatternAsync(TestEventPatternRequest testEventPatternRequest,
            com.amazonaws.handlers.AsyncHandler<TestEventPatternRequest, TestEventPatternResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from the specified EventBridge resource. In EventBridge, rules can be tagged.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonEventBridgeAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from the specified EventBridge resource. In EventBridge, rules can be tagged.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonEventBridgeAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
