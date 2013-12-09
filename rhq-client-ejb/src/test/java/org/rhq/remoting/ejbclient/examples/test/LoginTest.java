/** 
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the 
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rhq.remoting.ejbclient.examples.test;

import junit.framework.Assert;

import org.junit.Test;
import org.rhq.core.domain.auth.Subject;
import org.rhq.enterprise.server.exception.LoginException;
import org.rhq.remoting.ejbclient.examples.Login;

public class LoginTest {

    @Test
    public void loginSuccessfull() {
        Subject subject = new Login().login("rhqadmin", "rhqadmin");
        Assert.assertNotNull(subject);
    }

    @Test(expected = Exception.class)
    public void loginFailed() {
        new Login().login("foo", "bar");
    }
}