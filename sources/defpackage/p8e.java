package defpackage;

import android.content.Context;
import defpackage.kpa;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final class p8e extends mj8 implements Function1<iq4, j6g> {
    final /* synthetic */ t8e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8e(t8e t8eVar) {
        super(1);
        this.this$0 = t8eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final j6g invoke(iq4 iq4Var) {
        kpa kpaVar;
        kpa kpaVar2;
        kpa kpaVar3;
        iq4 iq4Var2 = iq4Var;
        iq4Var2.getClass();
        AtomicReference<rfa> atomicReference = iq4Var2.y;
        EnumSet<o5f> enumSet = iq4Var2.n;
        Context context = iq4Var2.f;
        String str = iq4Var2.g;
        boolean z = iq4Var2.b;
        iq4Var2.t = this.this$0.b().c();
        boolean z2 = iq4Var2.e;
        kpa kpaVar4 = null;
        if (!z2 && z) {
            Integer num = iq4Var2.w;
            if (num != null) {
                int iIntValue = num.intValue();
                if (str == null) {
                    wl7.g("uri");
                    throw null;
                }
                kpa.a aVar = new kpa.a(str, context);
                rl6 rl6Var = iq4Var2.t;
                rl6Var.getClass();
                aVar.c = rl6Var;
                enumSet.getClass();
                aVar.d = enumSet;
                aVar.e = iIntValue;
                aVar.h = iq4Var2.x;
                aVar.f = iq4Var2.l;
                aVar.g = iq4Var2.j;
                aVar.i = iq4Var2.z;
                aVar.j = iq4Var2.C;
                kpaVar3 = new kpa(aVar);
            } else {
                kpaVar3 = null;
            }
            iq4Var2.c(kpaVar3);
        }
        iq4Var2.v = this.this$0.b().g();
        if (!z2 && z) {
            Integer num2 = iq4Var2.w;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                if (str == null) {
                    wl7.g("uri");
                    throw null;
                }
                kpa.a aVar2 = new kpa.a(str, context);
                rl6 rl6Var2 = iq4Var2.t;
                rl6Var2.getClass();
                aVar2.c = rl6Var2;
                enumSet.getClass();
                aVar2.d = enumSet;
                aVar2.e = iIntValue2;
                aVar2.h = iq4Var2.x;
                aVar2.f = iq4Var2.l;
                aVar2.g = iq4Var2.j;
                aVar2.i = iq4Var2.z;
                aVar2.j = iq4Var2.C;
                kpaVar2 = new kpa(aVar2);
            } else {
                kpaVar2 = null;
            }
            iq4Var2.c(kpaVar2);
        }
        iq4Var2.c(this.this$0.b().d());
        String strA = this.this$0.b().a();
        iq4Var2.x = strA;
        if (!z2 && z) {
            Integer num3 = iq4Var2.w;
            if (num3 != null) {
                int iIntValue3 = num3.intValue();
                if (str == null) {
                    wl7.g("uri");
                    throw null;
                }
                kpa.a aVar3 = new kpa.a(str, context);
                rl6 rl6Var3 = iq4Var2.t;
                rl6Var3.getClass();
                aVar3.c = rl6Var3;
                enumSet.getClass();
                aVar3.d = enumSet;
                aVar3.e = iIntValue3;
                aVar3.h = strA;
                aVar3.f = iq4Var2.l;
                aVar3.g = iq4Var2.j;
                aVar3.i = iq4Var2.z;
                aVar3.j = iq4Var2.C;
                kpaVar = new kpa(aVar3);
            } else {
                kpaVar = null;
            }
            iq4Var2.c(kpaVar);
        }
        OkHttpClient okHttpClientE = this.this$0.b().e();
        if (!z) {
            iq4Var2.l = okHttpClientE;
        }
        CookieJar cookieJarF = this.this$0.b().f();
        if (!z) {
            iq4Var2.j = cookieJarF;
        }
        Integer numI = this.this$0.b().i();
        iq4Var2.w = numI;
        if (!z2 && z) {
            if (str == null) {
                wl7.g("uri");
                throw null;
            }
            kpa.a aVar4 = new kpa.a(str, context);
            rl6 rl6Var4 = iq4Var2.t;
            rl6Var4.getClass();
            aVar4.c = rl6Var4;
            enumSet.getClass();
            aVar4.d = enumSet;
            aVar4.e = numI.intValue();
            aVar4.h = iq4Var2.x;
            aVar4.f = iq4Var2.l;
            aVar4.g = iq4Var2.j;
            aVar4.i = iq4Var2.z;
            aVar4.j = iq4Var2.C;
            iq4Var2.c(new kpa(aVar4));
        }
        iq4Var2.q = this.this$0.a().e();
        do1 do1VarA = this.this$0.a().a();
        if (!iq4Var2.c.get()) {
            iq4Var2.u = do1VarA;
        }
        iq4Var2.s = this.this$0.a().c();
        iq4Var2.r = this.this$0.a().b();
        int iL = this.this$0.a().l();
        if (!z) {
            iq4Var2.k = iL;
        }
        this.this$0.a().i();
        Map<Integer, Boolean> mapD = this.this$0.a().d();
        AtomicReference<Map<Integer, Boolean>> atomicReference2 = iq4Var2.A;
        if (mapD == null) {
            mapD = new HashMap<>();
        }
        atomicReference2.set(mapD);
        boolean zK = this.this$0.a().k();
        iq4Var2.z = zK;
        if (!z2 && z && (atomicReference.get() instanceof kpa)) {
            rfa rfaVar = atomicReference.get();
            rfaVar.getClass();
            ((kpa) rfaVar).e = zK;
        }
        Map<String, String> mapH = this.this$0.b().h();
        iq4Var2.C = mapH;
        if (!z2 && z) {
            Integer num4 = iq4Var2.w;
            if (num4 != null) {
                int iIntValue4 = num4.intValue();
                if (str == null) {
                    wl7.g("uri");
                    throw null;
                }
                kpa.a aVar5 = new kpa.a(str, context);
                rl6 rl6Var5 = iq4Var2.t;
                rl6Var5.getClass();
                aVar5.c = rl6Var5;
                enumSet.getClass();
                aVar5.d = enumSet;
                aVar5.e = iIntValue4;
                aVar5.h = iq4Var2.x;
                aVar5.f = iq4Var2.l;
                aVar5.g = iq4Var2.j;
                aVar5.i = iq4Var2.z;
                aVar5.j = mapH;
                kpaVar4 = new kpa(aVar5);
            }
            iq4Var2.c(kpaVar4);
        }
        iq4Var2.B.set(Boolean.valueOf(this.this$0.a().j()));
        iq4Var2.E = this.this$0.a().g();
        iq4Var2.D = this.this$0.a().h();
        return j6g.a;
    }
}
