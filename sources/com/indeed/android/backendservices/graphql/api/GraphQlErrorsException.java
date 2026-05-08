package com.indeed.android.backendservices.graphql.api;

import com.datadog.android.rum.internal.metric.SessionEndedMetric;
import defpackage.iw4;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/indeed/android/backendservices/graphql/api/GraphQlErrorsException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "Liw4;", SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "backendservices_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GraphQlErrorsException extends Exception {
    private final List<iw4> errors;

    public GraphQlErrorsException(List<iw4> list) {
        super(String.valueOf(list));
        this.errors = list;
    }
}
