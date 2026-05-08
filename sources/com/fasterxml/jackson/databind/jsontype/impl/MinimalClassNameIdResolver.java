package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* JADX INFO: loaded from: classes2.dex */
public class MinimalClassNameIdResolver extends ClassNameIdResolver {
    private static final long serialVersionUID = 1;
    protected final String _basePackageName;
    protected final String _basePackagePrefix;

    public MinimalClassNameIdResolver(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory, polymorphicTypeValidator);
        String name = javaType.getRawClass().getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            this._basePackageName = "";
            this._basePackagePrefix = ".";
        } else {
            this._basePackagePrefix = name.substring(0, iLastIndexOf + 1);
            this._basePackageName = name.substring(0, iLastIndexOf);
        }
    }

    public static MinimalClassNameIdResolver construct(JavaType javaType, MapperConfig<?> mapperConfig, PolymorphicTypeValidator polymorphicTypeValidator) {
        return new MinimalClassNameIdResolver(javaType, mapperConfig.getTypeFactory(), polymorphicTypeValidator);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver
    public JavaType _typeFromId(String str, DatabindContext databindContext) {
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder(this._basePackageName.length() + str.length());
            if (this._basePackageName.isEmpty()) {
                sb.append(str.substring(1));
            } else {
                sb.append(this._basePackageName);
                sb.append(str);
            }
            str = sb.toString();
        }
        return super._typeFromId(str, databindContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver, com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public String idFromValue(Object obj) {
        String name = obj.getClass().getName();
        return name.startsWith(this._basePackagePrefix) ? name.substring(this._basePackagePrefix.length() - 1) : name;
    }
}
