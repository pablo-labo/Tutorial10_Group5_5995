package com.apollographql.apollo.cache.normalized.sql;

import android.content.Context;
import defpackage.j6g;
import defpackage.nd7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/apollographql/apollo/cache/normalized/sql/ApolloInitializer;", "Lnd7;", "Lj6g;", "<init>", "()V", "apollo-normalized-cache-sqlite_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ApolloInitializer implements nd7<j6g> {
    public static Context a;

    @Override // defpackage.nd7
    public final j6g create(Context context) {
        context.getClass();
        a = context;
        return j6g.a;
    }

    @Override // defpackage.nd7
    public final List<Class<? extends nd7<?>>> dependencies() {
        return new ArrayList();
    }
}
