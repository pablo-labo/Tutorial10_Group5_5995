package com.apollographql.apollo.internal;

import com.apollographql.apollo.internal.a;
import defpackage.wi5;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001b\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/apollographql/apollo/internal/AbortFlowException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lwi5;", "owner", "Lwi5;", "getOwner", "()Lwi5;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AbortFlowException extends CancellationException {
    private final wi5<?> owner;

    public AbortFlowException(a.C0111a c0111a) {
        super("Flow was aborted, no more elements needed");
        this.owner = c0111a;
    }

    public final void a(a.C0111a c0111a) {
        c0111a.getClass();
        if (this.owner != c0111a) {
            throw this;
        }
    }
}
