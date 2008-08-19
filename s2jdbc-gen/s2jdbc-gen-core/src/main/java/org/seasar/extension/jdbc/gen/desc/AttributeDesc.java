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
package org.seasar.extension.jdbc.gen.desc;

import javax.persistence.TemporalType;

/**
 * エンティティの属性記述です。
 * 
 * @author taedium
 */
public class AttributeDesc {

    /** 名前 */
    protected String name;

    /** 属性のクラス */
    protected Class<?> attributeClass;

    /** 識別子の場合{@code true} */
    protected boolean id;

    /** 時制の種別 */
    protected TemporalType temporalType;

    /** バージョンの場合{@code true} */
    protected boolean version;

    /** 一時的の場合{@code true} */
    protected boolean trnsient;

    /** {@code LOB}の場合{@code true} */
    protected boolean lob;

    /** カラムの名前 */
    protected String columnName;

    /** 長さ */
    protected int length;

    /** 精度 */
    protected int precision;

    /** スケール */
    protected int scale;

    /** NULL可能の場合{@code true} */
    protected boolean nullable;

    /** カラム定義 */
    protected String columnDefinition;

    /** カラムの型名 */
    protected String columnTypeName;

    /**
     * インスタンスを構築します。
     */
    public AttributeDesc() {
    }

    /**
     * 名前を返します。
     * 
     * @return 名前
     */
    public String getName() {
        return name;
    }

    /**
     * 名前を設定します。
     * 
     * @param name
     *            名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 属性のクラスを返します。
     * 
     * @return 属性のクラス
     */
    public Class<?> getAttributeClass() {
        return attributeClass;
    }

    /**
     * 属性のクラスを設定します。
     * 
     * @param attributeClass
     *            属性のクラス
     */
    public void setAttributeClass(Class<?> attributeClass) {
        this.attributeClass = attributeClass;
    }

    /**
     * 識別子の場合{@code true}を返します。
     * 
     * @return 識別子の場合{@code true}、そうでなければ{@code false}
     */
    public boolean isId() {
        return id;
    }

    /**
     * 識別子の場合{@code true}を設定します。
     * 
     * @param id
     *            識別子の場合{@code true}
     */
    public void setId(boolean id) {
        this.id = id;
    }

    /**
     * 時制の種別を返します。
     * 
     * @return 時制の種別
     */
    public TemporalType getTemporalType() {
        return temporalType;
    }

    /**
     * 時制の種別を設定します。
     * 
     * @param temporalType
     *            時制の種別
     */
    public void setTemporalType(TemporalType temporalType) {
        this.temporalType = temporalType;
    }

    /**
     * バージョンの場合{@code true}を返します。
     * 
     * @return バージョンの場合{@code true}、そうでなければ{@code false}
     */
    public boolean isVersion() {
        return version;
    }

    /**
     * バージョンの場合{@code true}を設定します。
     * 
     * @param version
     *            バージョンの場合{@code true}
     */
    public void setVersion(boolean version) {
        this.version = version;
    }

    /**
     * 一時的の場合{@code true}を返します。
     * 
     * @return 一時的の場合{@code true}、そうでなければ{@code false}
     */
    public boolean isTransient() {
        return trnsient;
    }

    /**
     * 一時的の場合{@code true}を設定します。
     * 
     * @param trnsient
     *            一時的の場合{@code true}
     */
    public void setTransient(boolean trnsient) {
        this.trnsient = trnsient;
    }

    /**
     * {@code LOB}の場合{@code true}を返します。
     * 
     * @return {@code LOB}の場合{@code true}、そうでなければ{@code false}
     */
    public boolean isLob() {
        return lob;
    }

    /**
     * {@code LOB}の場合{@code true}を設定します。
     * 
     * @param lob
     *            {@code LOB}の場合{@code true}
     */
    public void setLob(boolean lob) {
        this.lob = lob;
    }

    /**
     * カラムの名前を返します。
     * 
     * @return カラムの名前
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * カラムの名前を設定します。
     * 
     * @param columnName
     *            カラムの名前
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * 長さを返します。
     * 
     * @return 長さ
     */
    public int getLength() {
        return length;
    }

    /**
     * 長さを設定します。
     * 
     * @param length
     *            長さ
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * 精度を返します。
     * 
     * @return 精度
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * 精度を設定します。
     * 
     * @param precision
     *            精度
     */
    public void setPrecision(int precision) {
        this.precision = precision;
    }

    /**
     * スケールを返します。
     * 
     * @return スケール
     */
    public int getScale() {
        return scale;
    }

    /**
     * スケールを設定します。
     * 
     * @param scale
     *            スケール
     */
    public void setScale(int scale) {
        this.scale = scale;
    }

    /**
     * NULL可能の場合{@code true}を返します。
     * 
     * @return NULL可能の場合{@code true}、そうでない場合{@code false}
     */
    public boolean isNullable() {
        return nullable;
    }

    /**
     * NULL可能の場合{@code true}を設定します。
     * 
     * @param nullable
     *            NULL可能の場合{@code true}
     */
    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    /**
     * カラム定義を返します。
     * 
     * @return カラム定義
     */
    public String getColumnDefinition() {
        return columnDefinition;
    }

    /**
     * カラム定義を設定します。
     * 
     * @param columnDefinition
     *            カラム定義
     */
    public void setColumnDefinition(String columnDefinition) {
        this.columnDefinition = columnDefinition;
    }

    /**
     * カラムの型名を返します。
     * 
     * @return カラムの型名
     */
    public String getColumnTypeName() {
        return columnTypeName;
    }

    /**
     * カラムの型名を設定します。
     * 
     * @param columnTypeName
     *            カラムの型名
     */
    public void setColumnTypeName(String columnTypeName) {
        this.columnTypeName = columnTypeName;
    }

}