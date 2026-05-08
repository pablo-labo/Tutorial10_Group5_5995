package com.apollographql.apollo.exception;

import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/apollographql/apollo/exception/SubscriptionOperationException;", "Lcom/apollographql/apollo/exception/ApolloException;", "", "payload", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SubscriptionOperationException extends ApolloException {
    private final Object payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionOperationException(String str, Map map) {
        super("Operation error ".concat(str), null);
        str.getClass();
        this.payload = map;
    }
}
