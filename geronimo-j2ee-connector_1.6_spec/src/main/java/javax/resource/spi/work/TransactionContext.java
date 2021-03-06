/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//
// This source code implements specifications defined by the Java
// Community Process. In order to remain compliant with the specification
// DO NOT add / change / or delete method signatures!
//

package javax.resource.spi.work;

/**
 * @since 1.6
 * @version $Rev$ $Date$
 */
public class TransactionContext extends ExecutionContext implements WorkContext {

    private static final long serialVersionUID = 6205067498708597824L;
    private static final String NAME = "TransactionContext";
    private static final String DESCRIPTION = "TransactionContext";
    /**
     * Human readable name of the inflow context
     *
     * @return human readable name of the inflow context
     */
    public String getName() {
        return NAME;
    }

    /**
     * Human readable description of the inflow context
     *
     * @return human-readable description of the inflow context
     */
    public String getDescription() {
        return DESCRIPTION;
    }
}
