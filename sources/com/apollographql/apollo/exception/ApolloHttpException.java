package com.apollographql.apollo.exception;

import defpackage.nl6;
import defpackage.to1;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloHttpException;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "statusCode", "I", "getStatusCode", "()I", "", "Lnl6;", "headers", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "Lto1;", "body", "Lto1;", "getBody", "()Lto1;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApolloHttpException extends ApolloException {
    private final to1 body;
    private final List<nl6> headers;
    private final int statusCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloHttpException(int i, List list, to1 to1Var, String str) {
        super(str, null);
        list.getClass();
        this.statusCode = i;
        this.headers = list;
        this.body = to1Var;
    }
}
