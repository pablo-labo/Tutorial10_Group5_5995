package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.b0;
import defpackage.bjg;
import defpackage.cj8;
import defpackage.fh6;
import defpackage.gh6;
import defpackage.hh6;
import defpackage.k6;
import defpackage.l;
import defpackage.l6;
import defpackage.m6;
import defpackage.my3;
import defpackage.n71;
import defpackage.ob3;
import defpackage.pf5;
import defpackage.uf2;
import defpackage.xn3;
import defpackage.xu8;
import defpackage.y8c;
import defpackage.zu8;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<uf2<?>> getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        uf2.a aVarB = uf2.b(bjg.class);
        aVarB.a(new my3(2, 0, xu8.class));
        aVarB.f = new l(5);
        arrayList.add(aVarB.b());
        y8c y8cVar = new y8c(n71.class, Executor.class);
        uf2.a aVar = new uf2.a(xn3.class, new Class[]{gh6.class, hh6.class});
        aVar.a(my3.b(Context.class));
        aVar.a(my3.b(pf5.class));
        aVar.a(new my3(2, 0, fh6.class));
        aVar.a(new my3(1, 1, bjg.class));
        aVar.a(new my3((y8c<?>) y8cVar, 1, 0));
        aVar.f = new ob3(y8cVar, 1);
        arrayList.add(aVar.b());
        arrayList.add(zu8.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(zu8.a("fire-core", "20.4.2"));
        arrayList.add(zu8.a("device-name", a(Build.PRODUCT)));
        arrayList.add(zu8.a("device-model", a(Build.DEVICE)));
        arrayList.add(zu8.a("device-brand", a(Build.BRAND)));
        arrayList.add(zu8.b("android-target-sdk", new k6()));
        arrayList.add(zu8.b("android-min-sdk", new l6()));
        arrayList.add(zu8.b("android-platform", new m6(10)));
        arrayList.add(zu8.b("android-installer", new b0(10)));
        try {
            string = cj8.e.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(zu8.a("kotlin", string));
        }
        return arrayList;
    }
}
