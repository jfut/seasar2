/*
 * Copyright 2004-2007 the Seasar Foundation and the Others.
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
package org.seasar.extension.persistence;

/**
 * 結果セットの行をオブジェクトにマッピングするためのインターフェースです。
 * 
 * @author higa
 * 
 */
public interface RowMapper {

    /**
     * 行の処理を開始するときに呼び出されます。
     */
    void enterRow();

    /**
     * 列の値を設定します。indexは、0から始まります。
     * 
     * @param index
     * @param value
     */
    void setValue(int index, Object value);

    /**
     * 行の処理を終了するときに呼び出されます。
     * 
     * @return 行がマッピングされたオブジェクト
     */
    Object leaveRow();
}