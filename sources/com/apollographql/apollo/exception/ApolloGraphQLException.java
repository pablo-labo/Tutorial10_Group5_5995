package com.apollographql.apollo.exception;

import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import defpackage.iw4;
import defpackage.u63;
import defpackage.w40;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/apollographql/apollo/exception/ApolloGraphQLException;", "Lcom/apollographql/apollo/exception/ApolloException;", "Liw4;", "error", "Liw4;", "getError", "()Liw4;", "", SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "getErrors$annotations", "()V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApolloGraphQLException extends ApolloException {
    private final iw4 error;
    private final List<iw4> errors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloGraphQLException(iw4 iw4Var) {
        super(w40.f(new StringBuilder("GraphQL error: '"), iw4Var.a, '\''), null);
        iw4Var.getClass();
        this.error = iw4Var;
        this.errors = u63.Z(iw4Var);
    }
}
