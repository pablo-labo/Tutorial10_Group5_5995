package com.apollographql.apollo.exception;

import defpackage.l5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/apollographql/apollo/exception/CacheMissException;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "fieldName", "getFieldName", "", "stale", "Z", "getStale", "()Z", "getStale$annotations", "()V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CacheMissException extends ApolloException {
    private final String fieldName;
    private final String key;
    private final boolean stale;

    /* JADX WARN: Illegal instructions before constructor call */
    public CacheMissException(String str, String str2) {
        String strM;
        str.getClass();
        if (str2 == null) {
            strM = l5.m("Object '", str, "' not found");
        } else {
            strM = "Object '" + str + "' has no field named '" + str2 + '\'';
        }
        super(strM, null);
        this.key = str;
        this.fieldName = str2;
        this.stale = false;
    }
}
