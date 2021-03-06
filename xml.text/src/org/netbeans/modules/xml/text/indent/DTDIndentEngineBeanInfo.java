/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.xml.text.indent;

import java.beans.BeanDescriptor;
import java.util.MissingResourceException;

import org.netbeans.modules.editor.FormatterIndentEngineBeanInfo;
import org.netbeans.modules.editor.NbEditorUtilities;
import org.openide.util.NbBundle;

/**
 * @author  Libor Kramolis
 * @version 0.1
 */
public class DTDIndentEngineBeanInfo extends FormatterIndentEngineBeanInfo {

    /** */
    private BeanDescriptor beanDescriptor;


    //
    // init
    //

    /** */
    public DTDIndentEngineBeanInfo () {
    }


    //
    // FormatterIndentEngineBeanInfo
    //

    /**
     */
    public BeanDescriptor getBeanDescriptor () {
        if (beanDescriptor == null) {
            beanDescriptor = new BeanDescriptor (getBeanClass());
            beanDescriptor.setDisplayName (getString ("LAB_DTDIndentEngine"));
            beanDescriptor.setShortDescription (getString ("HINT_DTDIndentEngine"));
        }
        return beanDescriptor;
    }

    /**
     */
    protected Class getBeanClass () {
        return DTDIndentEngine.class;
    }

    /**
     */
    protected String[] createPropertyNames () {
        return NbEditorUtilities.mergeStringArrays
            (super.createPropertyNames(),
             new String[] {
             }
             );
    }

    /**
     */
    protected String getString (String key) {
        try {
            return NbBundle.getMessage(DTDIndentEngineBeanInfo.class, key);
        } catch (MissingResourceException e) {
            return super.getString (key);
        }
    }

}
