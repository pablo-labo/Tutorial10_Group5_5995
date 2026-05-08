package com.google.firebase.analytics.ktx;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.u63;
import defpackage.uf2;
import defpackage.zu8;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/firebase/analytics/ktx/FirebaseAnalyticsKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "java.com.google.android.libraries.firebase.firebase_analytics_ktx_client_firebase_analytics_ktx_for_granular"}, k = 1, mv = {1, 4, 0})
public final class FirebaseAnalyticsKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<uf2<?>> getComponents() {
        return u63.Z(zu8.a("fire-analytics-ktx", "17.4.3"));
    }
}
