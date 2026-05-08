package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.kxe;
import defpackage.my3;
import defpackage.n20;
import defpackage.pf5;
import defpackage.uf2;
import defpackage.ypd;
import defpackage.zu8;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<uf2<?>> getComponents() {
        uf2.a aVarB = uf2.b(n20.class);
        aVarB.a(my3.b(pf5.class));
        aVarB.a(my3.b(Context.class));
        aVarB.a(my3.b(kxe.class));
        aVarB.f = ypd.g0;
        aVarB.c(2);
        return Arrays.asList(aVarB.b(), zu8.a("fire-analytics", "17.4.3"));
    }
}
