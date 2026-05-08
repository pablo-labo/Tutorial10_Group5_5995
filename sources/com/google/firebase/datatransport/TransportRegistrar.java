package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.as1;
import defpackage.btf;
import defpackage.etf;
import defpackage.fg2;
import defpackage.my3;
import defpackage.r40;
import defpackage.uf2;
import defpackage.zu8;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ btf lambda$getComponents$0(fg2 fg2Var) {
        etf.b((Context) fg2Var.get(Context.class));
        return etf.a().c(as1.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<uf2<?>> getComponents() {
        uf2.a aVarB = uf2.b(btf.class);
        aVarB.a = LIBRARY_NAME;
        aVarB.a(my3.b(Context.class));
        aVarB.f = new r40(22);
        return Arrays.asList(aVarB.b(), zu8.a(LIBRARY_NAME, "18.1.8"));
    }
}
