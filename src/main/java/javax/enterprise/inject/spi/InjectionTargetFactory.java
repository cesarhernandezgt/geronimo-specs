/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package javax.enterprise.inject.spi;

import javax.enterprise.inject.spi.configurator.AnnotatedTypeConfigurator;

/**
 * A factory which is able to create container provided
 * {@link InjectionTarget}s.
 */
public interface InjectionTargetFactory<T>
{
    /**
     * Creates an InjectionTarget for the given Bean
     * @param bean the Bean or <code>null</code> if the InjectionTarget should not get managed by the container.
     */
    InjectionTarget<T> createInjectionTarget(Bean<T> bean);

    /**
     * @return a new annotated type configurator which can be used to set up an {@link AnnotatedType}
     *      to be used to create the {@link InjectionTarget}.
     */
    default AnnotatedTypeConfigurator<T> configure()
    {
        throw new UnsupportedOperationException("AnnotatedType Configuration not supported by default");
    }
}
