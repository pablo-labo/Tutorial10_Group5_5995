package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ak2;
import defpackage.b7e;
import defpackage.fg2;
import defpackage.fh6;
import defpackage.gh6;
import defpackage.k20;
import defpackage.my3;
import defpackage.n71;
import defpackage.pf5;
import defpackage.u91;
import defpackage.uf2;
import defpackage.uh1;
import defpackage.vf5;
import defpackage.y8c;
import defpackage.zu8;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static vf5 lambda$getComponents$0(fg2 fg2Var) {
        return new a((pf5) fg2Var.get(pf5.class), fg2Var.e(gh6.class), (ExecutorService) fg2Var.c(new y8c(n71.class, ExecutorService.class)), new b7e((Executor) fg2Var.c(new y8c(uh1.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<uf2<?>> getComponents() {
        uf2.a aVarB = uf2.b(vf5.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(my3.b(pf5.class));
        aVarB.a(new my3(0, 1, gh6.class));
        aVarB.a(new my3((y8c<?>) new y8c(n71.class, ExecutorService.class), 1, 0));
        aVarB.a(new my3((y8c<?>) new y8c(uh1.class, Executor.class), 1, 0));
        aVarB.f = new k20(10);
        uf2 uf2VarB = aVarB.b();
        ak2 ak2Var = new ak2(18);
        uf2.a aVarB2 = uf2.b(fh6.class);
        aVarB2.e = 1;
        aVarB2.f = new u91(ak2Var, 2);
        return Arrays.asList(uf2VarB, aVarB2.b(), zu8.a(LIBRARY_NAME, "17.2.0"));
    }
}
