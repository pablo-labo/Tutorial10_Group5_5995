package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.iid.FirebaseInstanceId;
import defpackage.boa;
import defpackage.g5;
import defpackage.my3;
import defpackage.n20;
import defpackage.o0d;
import defpackage.pf5;
import defpackage.uf2;
import defpackage.zu8;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<uf2<?>> getComponents() {
        uf2.a aVarB = uf2.b(o0d.class);
        aVarB.a(my3.b(Context.class));
        aVarB.a(my3.b(pf5.class));
        aVarB.a(my3.b(FirebaseInstanceId.class));
        aVarB.a(my3.b(g5.class));
        aVarB.a(new my3(0, 0, n20.class));
        aVarB.f = boa.i0;
        aVarB.c(1);
        return Arrays.asList(aVarB.b(), zu8.a("fire-rc", "17.0.0"));
    }
}
