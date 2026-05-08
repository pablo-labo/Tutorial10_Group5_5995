package com.apollographql.apollo.exception;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/exception/OfflineException;", "Ljava/io/IOException;", "Lokio/IOException;", "<init>", "()V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OfflineException extends IOException {
    public static final OfflineException a = new OfflineException();

    private OfflineException() {
        super("The device is offline");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof OfflineException);
    }

    public final int hashCode() {
        return -155984151;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "OfflineException";
    }
}
