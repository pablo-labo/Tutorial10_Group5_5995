package com.indeed.android.backendservices.graphql;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/indeed/android/backendservices/graphql/NotInitializedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "backendservices_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotInitializedException extends Exception {
    public NotInitializedException() {
        super("AndroidGraphQL Not Initialized. AndroidGraphQL.init must be called before the library can be used");
    }
}
