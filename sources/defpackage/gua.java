package defpackage;

import android.content.SharedPreferences;
import com.linecorp.linesdk.openchat.OpenChatRoomInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class gua extends brg {
    public final g3a<sta> V;
    public final g3a<Boolean> W;
    public final g3a<OpenChatRoomInfo> X;
    public final g3a<ww8<OpenChatRoomInfo>> Y;
    public final g3a<Boolean> Z;
    public final g3a<Boolean> a0;
    public final SharedPreferences b;
    public final xm9 b0;
    public final tw8 c;
    public final xm9 c0;
    public final g3a<String> d;
    public final g3a<String> e;
    public final g3a<String> f;

    public gua(SharedPreferences sharedPreferences, tw8 tw8Var) {
        sharedPreferences.getClass();
        tw8Var.getClass();
        this.b = sharedPreferences;
        this.c = tw8Var;
        g3a<String> g3aVar = new g3a<>();
        this.d = g3aVar;
        g3a<String> g3aVar2 = new g3a<>();
        this.e = g3aVar2;
        g3a<String> g3aVar3 = new g3a<>();
        this.f = g3aVar3;
        g3a<sta> g3aVar4 = new g3a<>();
        this.V = g3aVar4;
        g3a<Boolean> g3aVar5 = new g3a<>();
        this.W = g3aVar5;
        this.X = new g3a<>();
        this.Y = new g3a<>();
        this.Z = new g3a<>();
        this.a0 = new g3a<>();
        this.b0 = srf.a(g3aVar, new n6(11));
        this.c0 = srf.a(g3aVar2, new o6(19));
        g3aVar.j("");
        String string = sharedPreferences.getString("key_profile_name", null);
        g3aVar2.j(string == null ? "" : string);
        g3aVar3.j("");
        g3aVar4.j(sta.NotSelected);
        g3aVar5.j(Boolean.TRUE);
        u63.Y(ee3.p(this), null, null, new aua(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(defpackage.gua r4, defpackage.pu2 r5) throws java.lang.Throwable {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof defpackage.bua
            if (r0 == 0) goto L16
            r0 = r5
            bua r0 = (defpackage.bua) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            bua r0 = new bua
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 != r3) goto L29
            defpackage.r7d.b(r5)
            goto L46
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L2f:
            defpackage.r7d.b(r5)
            eq3 r5 = defpackage.a74.a
            no3 r5 = defpackage.no3.c
            cua r1 = new cua
            r1.<init>(r4, r2)
            r0.label = r3
            java.lang.Object r5 = defpackage.u63.q0(r5, r1, r0)
            g13 r4 = defpackage.g13.a
            if (r5 != r4) goto L46
            return r4
        L46:
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gua.g(gua, pu2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(defpackage.gua r4, defpackage.hua r5, defpackage.pu2 r6) throws java.lang.Throwable {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof defpackage.dua
            if (r0 == 0) goto L16
            r0 = r6
            dua r0 = (defpackage.dua) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            dua r0 = new dua
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 != r3) goto L29
            defpackage.r7d.b(r6)
            goto L46
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L2f:
            defpackage.r7d.b(r6)
            eq3 r6 = defpackage.a74.a
            no3 r6 = defpackage.no3.c
            eua r1 = new eua
            r1.<init>(r4, r5, r2)
            r0.label = r3
            java.lang.Object r6 = defpackage.u63.q0(r6, r1, r0)
            g13 r4 = defpackage.g13.a
            if (r6 != r4) goto L46
            return r4
        L46:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gua.h(gua, hua, pu2):java.lang.Object");
    }
}
