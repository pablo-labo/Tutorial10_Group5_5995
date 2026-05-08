package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.g5;
import defpackage.my3;
import defpackage.n20;
import defpackage.uf2;
import defpackage.ypd;
import defpackage.zu8;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<uf2<?>> getComponents() {
        uf2.a aVarB = uf2.b(g5.class);
        aVarB.a(my3.b(Context.class));
        aVarB.a(new my3(0, 0, n20.class));
        aVarB.f = ypd.d0;
        return Arrays.asList(aVarB.b(), zu8.a("fire-abt", "17.1.1"));
    }
}
