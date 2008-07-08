/*
 * Copyright 2004-2008 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.seasar.extension.jdbc.gen;

import junitx.framework.Assert;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author taedium
 * 
 */
public class TableDescTest {

    @Test
    public void testEquals() throws Exception {
        TableDesc tableDesc = new TableDesc();
        tableDesc.setCatalogName("AAA");
        tableDesc.setSchemaName("BBB");
        tableDesc.setName("CCC");
        TableDesc tableDesc2 = new TableDesc();
        tableDesc2.setCatalogName("aaa");
        tableDesc2.setSchemaName("bbb");
        tableDesc2.setName("ccc");
        TableDesc tableDesc3 = new TableDesc();
        tableDesc3.setCatalogName("XXX");

        assertEquals(tableDesc, tableDesc2);
        assertEquals(tableDesc.hashCode(), tableDesc2.hashCode());
        Assert.assertNotEquals(tableDesc, tableDesc3);
        Assert.assertNotEquals(tableDesc.hashCode(), tableDesc3.hashCode());
    }
}
