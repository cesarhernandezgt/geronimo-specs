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

package javax.mail;

/**
 * @version $Rev$ $Date$
 */
public class FolderNotFoundException extends MessagingException {
	
	private static final long serialVersionUID = 472612108891249403L;
	
    private transient Folder _folder;

    public FolderNotFoundException() {
        super();
    }

    public FolderNotFoundException(final Folder folder) {
        this(folder, "Folder not found: " + folder.getName());
    }

    public FolderNotFoundException(final Folder folder, final String message) {
        super(message);
        _folder = folder;
    }

    public FolderNotFoundException(final String message, final Folder folder) {
        this(folder, message);
    }
    
    /**
     * Constructs a FolderNotFoundException with the specified
     * detail message and embedded exception.  The exception is chained
     * to this exception.
     *
     * @param folder The Folder
     * @param s      The detailed error message
     * @param e      The embedded exception
     * @since        JavaMail 1.5
     */
    public FolderNotFoundException(final Folder folder, final String s, final Exception e) {
        super(s, e);
        _folder = folder;
    }

    public Folder getFolder() {
        return _folder;
    }
}
