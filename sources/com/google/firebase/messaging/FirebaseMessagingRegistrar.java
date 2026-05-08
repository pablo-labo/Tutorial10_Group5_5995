package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.iid.FirebaseInstanceId;
import defpackage.ak2;
import defpackage.bjg;
import defpackage.btf;
import defpackage.dt4;
import defpackage.hh6;
import defpackage.htf;
import defpackage.my3;
import defpackage.pf5;
import defpackage.uf2;
import defpackage.vf5;
import defpackage.w2d;
import defpackage.wrf;
import defpackage.x21;
import defpackage.ysf;
import defpackage.zu8;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {

    public static class a<T> implements ysf<T> {
        @Override // defpackage.ysf
        public final void a(x21 x21Var) {
        }

        @Override // defpackage.ysf
        public final void b(x21 x21Var, htf htfVar) throws Throwable {
            ((w2d) htfVar).b(null);
        }
    }

    public static class b implements btf {
        @Override // defpackage.btf
        public final ysf a(String str, dt4 dt4Var, wrf wrfVar) {
            return new a();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<uf2<?>> getComponents() {
        uf2.a aVarB = uf2.b(FirebaseMessaging.class);
        aVarB.a(my3.b(pf5.class));
        aVarB.a(my3.b(FirebaseInstanceId.class));
        aVarB.a(my3.b(bjg.class));
        aVarB.a(my3.b(hh6.class));
        aVarB.a(new my3(0, 0, btf.class));
        aVarB.a(my3.b(vf5.class));
        aVarB.f = ak2.h0;
        aVarB.c(1);
        return Arrays.asList(aVarB.b(), zu8.a("fire-fcm", "20.2.0"));
    }
}
