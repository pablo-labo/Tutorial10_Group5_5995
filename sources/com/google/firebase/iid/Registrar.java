package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bjg;
import defpackage.cr8;
import defpackage.hh6;
import defpackage.kxe;
import defpackage.my3;
import defpackage.pf5;
import defpackage.q92;
import defpackage.uf2;
import defpackage.vf5;
import defpackage.wf5;
import defpackage.zu8;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class Registrar implements ComponentRegistrar {

    public static class a implements wf5 {
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public final List<uf2<?>> getComponents() {
        uf2.a aVarB = uf2.b(FirebaseInstanceId.class);
        aVarB.a(my3.b(pf5.class));
        aVarB.a(my3.b(kxe.class));
        aVarB.a(my3.b(bjg.class));
        aVarB.a(my3.b(hh6.class));
        aVarB.a(my3.b(vf5.class));
        aVarB.f = q92.l0;
        aVarB.c(1);
        uf2 uf2VarB = aVarB.b();
        uf2.a aVarB2 = uf2.b(wf5.class);
        aVarB2.a(my3.b(FirebaseInstanceId.class));
        aVarB2.f = cr8.V;
        return Arrays.asList(uf2VarB, aVarB2.b(), zu8.a("fire-iid", "20.2.0"));
    }
}
