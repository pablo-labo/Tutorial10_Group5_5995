package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a5a;
import defpackage.dg5;
import defpackage.my3;
import defpackage.n20;
import defpackage.pf5;
import defpackage.r40;
import defpackage.rf5;
import defpackage.s33;
import defpackage.uf2;
import defpackage.vf5;
import defpackage.z9e;
import defpackage.zf5;
import defpackage.zu8;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int a = 0;

    static {
        Map<z9e.a, dg5.a> map = dg5.b;
        z9e.a aVar = z9e.a.a;
        if (map.containsKey(aVar)) {
            Log.d("SessionsDependencies", "Dependency " + aVar + " already added.");
            return;
        }
        map.put(aVar, new dg5.a(new a5a(true)));
        Log.d("SessionsDependencies", "Dependency to " + aVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<uf2<?>> getComponents() {
        uf2.a aVarB = uf2.b(rf5.class);
        aVarB.a = "fire-cls";
        aVarB.a(my3.b(pf5.class));
        aVarB.a(my3.b(vf5.class));
        aVarB.a(new my3(0, 2, s33.class));
        aVarB.a(new my3(0, 2, n20.class));
        aVarB.a(new my3(0, 2, zf5.class));
        aVarB.f = new r40(this, 4);
        aVarB.c(2);
        return Arrays.asList(aVarB.b(), zu8.a("fire-cls", "18.6.3"));
    }
}
