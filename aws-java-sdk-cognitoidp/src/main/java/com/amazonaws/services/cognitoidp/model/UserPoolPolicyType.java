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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The type of policy in a user pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UserPoolPolicyType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserPoolPolicyType implements Serializable, Cloneable {

    /**
     * <p>
     * A container with information about the user pool password policy.
     * </p>
     */
    private PasswordPolicyType passwordPolicy;

    /**
     * <p>
     * A container with information about the user pool password policy.
     * </p>
     * 
     * @param passwordPolicy
     *        A container with information about the user pool password policy.
     */

    public void setPasswordPolicy(PasswordPolicyType passwordPolicy) {
        this.passwordPolicy = passwordPolicy;
    }

    /**
     * <p>
     * A container with information about the user pool password policy.
     * </p>
     * 
     * @return A container with information about the user pool password policy.
     */

    public PasswordPolicyType getPasswordPolicy() {
        return this.passwordPolicy;
    }

    /**
     * <p>
     * A container with information about the user pool password policy.
     * </p>
     * 
     * @param passwordPolicy
     *        A container with information about the user pool password policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolPolicyType withPasswordPolicy(PasswordPolicyType passwordPolicy) {
        setPasswordPolicy(passwordPolicy);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPasswordPolicy() != null)
            sb.append("PasswordPolicy: ").append(getPasswordPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserPoolPolicyType == false)
            return false;
        UserPoolPolicyType other = (UserPoolPolicyType) obj;
        if (other.getPasswordPolicy() == null ^ this.getPasswordPolicy() == null)
            return false;
        if (other.getPasswordPolicy() != null && other.getPasswordPolicy().equals(this.getPasswordPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPasswordPolicy() == null) ? 0 : getPasswordPolicy().hashCode());
        return hashCode;
    }

    @Override
    public UserPoolPolicyType clone() {
        try {
            return (UserPoolPolicyType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
