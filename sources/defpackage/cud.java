package defpackage;

import android.util.Log;
import androidx.compose.runtime.r;
import com.indeed.android.jsmappservices.bridge.SearchType;
import defpackage.azg;
import defpackage.cd4;
import defpackage.lyg;
import defpackage.rsc;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class cud extends brg implements xh8 {
    public final ytd V;
    public final Lazy W;
    public final g4a X;
    public kud Y;
    public final g4a Z;
    public final g4a a0;
    public final qsc b;
    public final g4a b0;
    public final oha c;
    public uqe c0;
    public final mfa d;
    public final g4a d0;
    public final wrb e;
    public final g4a e0;
    public final m19 f;
    public final g4a f0;
    public uqe g0;
    public uqe h0;
    public long i0;
    public final g4a j0;
    public uqe k0;
    public String l0;

    @uh3(c = "com.indeed.android.jobsearch.searchoverlay.ui.SearchOverlayViewModel$deleteRecentSearch$1$1$1", f = "SearchOverlayViewModel.kt", l = {523}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ lsc $recentSearch;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lsc lscVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$recentSearch = lscVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return cud.this.new a(this.$recentSearch, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                qsc qscVar = cud.this.b;
                lsc lscVar = this.$recentSearch;
                this.label = 1;
                Object objB = qscVar.b(lscVar, this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.searchoverlay.ui.SearchOverlayViewModel$getWhatSuggestions$1$1", f = "SearchOverlayViewModel.kt", l = {214}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public b(lu2<? super b> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return cud.this.new b(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    cud cudVar = cud.this;
                    mfa mfaVar = cudVar.d;
                    String str = cudVar.l().a;
                    this.label = 1;
                    obj = mfaVar.a(str, this);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                List list = (List) obj;
                cud.this.x(list.isEmpty() ? lyg.c.a : new lyg.b(3, list, false));
            } catch (CancellationException unused) {
                ArrayList arrayList = lz2.a;
                Log.d("SearchOverlayViewModel", "Cancelled", null);
            } catch (Exception e) {
                ArrayList arrayList2 = lz2.a;
                lz2.b("SearchOverlayViewModel", "getWhatSuggestions", false, e);
                cud cudVar2 = cud.this;
                cudVar2.x(new lyg.a(new oj(cudVar2, 18)));
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.searchoverlay.ui.SearchOverlayViewModel$getWhereSuggestions$1$1", f = "SearchOverlayViewModel.kt", l = {299}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        public c(lu2<? super c> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return cud.this.new c(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            azg dVar;
            int i = this.label;
            try {
                if (i == 0) {
                    r7d.b(obj);
                    cud cudVar = cud.this;
                    mfa mfaVar = cudVar.d;
                    String str = cudVar.l().b;
                    this.label = 1;
                    obj = mfaVar.b(str, this);
                    g13 g13Var = g13.a;
                    if (obj == g13Var) {
                        return g13Var;
                    }
                } else {
                    if (i != 1) {
                        r6.g("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7d.b(obj);
                }
                List list = (List) obj;
                cud cudVar2 = cud.this;
                if (list.isEmpty()) {
                    dVar = azg.i.a;
                } else {
                    cud cudVar3 = cud.this;
                    ((gme) cudVar3.f0).setValue(!zve.U(cudVar3.l().b) ? zyg.c : zyg.b);
                    dVar = new azg.d(list);
                }
                cudVar2.y(dVar);
            } catch (CancellationException unused) {
                ArrayList arrayList = lz2.a;
                Log.d("SearchOverlayViewModel", "Cancelled", null);
            } catch (Exception e) {
                ArrayList arrayList2 = lz2.a;
                lz2.b("SearchOverlayViewModel", "getWhereSuggestions", true, e);
                cud cudVar4 = cud.this;
                cudVar4.y(new azg.c(new fy(cudVar4, 18)));
            }
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.jobsearch.searchoverlay.ui.SearchOverlayViewModel$startDetectingLocation$1$1", f = "SearchOverlayViewModel.kt", l = {365, 367}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        Object L$0;
        int label;

        public d(lu2<? super d> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return cud.this.new d(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
        
            if (defpackage.cud.g(r5, r6, r8, r10) != r4) goto L34;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                int r0 = r11.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L24
                if (r0 == r3) goto L20
                if (r0 != r2) goto L1a
                java.lang.Object r0 = r11.L$0
                mz5 r0 = (defpackage.mz5) r0
                defpackage.r7d.b(r12)     // Catch: java.lang.Exception -> L16
                goto L75
            L16:
                r0 = move-exception
                r12 = r0
                r10 = r11
                goto L5a
            L1a:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r11)
                return r1
            L20:
                defpackage.r7d.b(r12)     // Catch: java.lang.Exception -> L16
                goto L3a
            L24:
                defpackage.r7d.b(r12)
                cud r12 = defpackage.cud.this     // Catch: java.lang.Exception -> L51
                kotlin.Lazy r12 = r12.W     // Catch: java.lang.Exception -> L56
                java.lang.Object r12 = r12.getValue()     // Catch: java.lang.Exception -> L56
                com.indeed.android.jsmappservices.util.LocationSensor r12 = (com.indeed.android.jsmappservices.util.LocationSensor) r12     // Catch: java.lang.Exception -> L56
                r11.label = r3     // Catch: java.lang.Exception -> L51
                java.lang.Object r12 = r12.b(r11)     // Catch: java.lang.Exception -> L51
                if (r12 != r4) goto L3a
                goto L4d
            L3a:
                mz5 r12 = (defpackage.mz5) r12     // Catch: java.lang.Exception -> L51
                cud r5 = defpackage.cud.this     // Catch: java.lang.Exception -> L51
                double r6 = r12.a     // Catch: java.lang.Exception -> L51
                double r8 = r12.b     // Catch: java.lang.Exception -> L51
                r11.L$0 = r1     // Catch: java.lang.Exception -> L51
                r11.label = r2     // Catch: java.lang.Exception -> L51
                r10 = r11
                java.lang.Object r11 = defpackage.cud.g(r5, r6, r8, r10)     // Catch: java.lang.Exception -> L4e
                if (r11 != r4) goto L75
            L4d:
                return r4
            L4e:
                r0 = move-exception
            L4f:
                r12 = r0
                goto L5a
            L51:
                r0 = move-exception
                r10 = r11
                goto L4f
            L54:
                r12 = r11
                goto L5a
            L56:
                r0 = move-exception
                r10 = r11
                r11 = r0
                goto L54
            L5a:
                java.util.ArrayList r11 = defpackage.lz2.a
                java.lang.String r11 = "startDetectingLocation error"
                r0 = 0
                java.lang.String r1 = "SearchOverlayViewModel"
                defpackage.lz2.g(r1, r11, r0, r12)
                cud r11 = defpackage.cud.this
                azg$b r12 = new azg$b
                i30 r0 = new i30
                r1 = 14
                r0.<init>(r11, r1)
                r12.<init>(r0)
                r11.y(r12)
            L75:
                j6g r11 = defpackage.j6g.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: cud.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public cud(qsc qscVar, oha ohaVar, mfa mfaVar, wrb wrbVar, m19 m19Var, ytd ytdVar) {
        qscVar.getClass();
        ohaVar.getClass();
        wrbVar.getClass();
        this.b = qscVar;
        this.c = ohaVar;
        this.d = mfaVar;
        this.e = wrbVar;
        this.f = m19Var;
        this.V = ytdVar;
        this.W = boa.E(qt8.a, new gud(this));
        Boolean bool = Boolean.FALSE;
        this.X = r.f(bool);
        this.Y = kud.X;
        this.Z = r.f(new jud("", ""));
        this.a0 = r.f(SearchType.b);
        this.b0 = r.f(lyg.c.a);
        this.d0 = r.f(bool);
        this.e0 = r.f(azg.f.a);
        this.f0 = r.f(zyg.a);
        this.j0 = r.f(rsc.b.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008f A[Catch: Exception -> 0x00b9, TryCatch #0 {Exception -> 0x00b9, blocks: (B:14:0x0034, B:33:0x0085, B:35:0x008f, B:36:0x00a3, B:19:0x0042, B:26:0x0062, B:28:0x0071, B:22:0x0049), top: B:41:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(defpackage.cud r16, double r17, double r19, defpackage.pu2 r21) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cud.g(cud, double, double, pu2):java.lang.Object");
    }

    public final void A(String str, boolean z) {
        str.getClass();
        w(jud.a(l(), str, null, 2));
        if (!z) {
            ((gme) this.d0).setValue(Boolean.TRUE);
        }
        o();
    }

    public final void B(String str) {
        str.getClass();
        w(jud.a(l(), null, str, 1));
        if (zve.U(str)) {
            v();
        } else {
            p();
        }
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public final void h(String str) {
        str.getClass();
        synchronized (this) {
            rsc rscVarK = k();
            rsc.a aVar = rscVarK instanceof rsc.a ? (rsc.a) rscVarK : null;
            if (aVar == null) {
                return;
            }
            rsc rscVarK2 = k();
            rscVarK2.getClass();
            LinkedHashMap linkedHashMapI0 = lc9.i0(((rsc.a) rscVarK2).a);
            lsc lscVar = (lsc) linkedHashMapI0.get(str);
            if (lscVar != null) {
                linkedHashMapI0.put(lscVar.a, lsc.a(lscVar, null, 15));
                ((gme) this.j0).setValue(rsc.a.b(aVar, linkedHashMapI0, 6));
                u63.Y(ee3.p(this), null, null, new a(lscVar, null), 3);
            }
        }
    }

    public final void i() {
        lyg lygVar = (lyg) ((gme) this.b0).getValue();
        lyg.b bVar = lygVar instanceof lyg.b ? (lyg.b) lygVar : null;
        if (bVar == null) {
            return;
        }
        List<zye> list = bVar.a;
        int i = bVar.b;
        list.getClass();
        x(new lyg.b(i, list, true));
    }

    public final boolean j() {
        return (zve.U(l().a) && zve.U(l().b)) ? false : true;
    }

    public final rsc k() {
        return (rsc) ((gme) this.j0).getValue();
    }

    public final jud l() {
        return (jud) ((gme) this.Z).getValue();
    }

    public final SearchType m() {
        return (SearchType) ((gme) this.a0).getValue();
    }

    public final kyg n() {
        return zve.U(l().a) ? kyg.b : ((Boolean) ((gme) this.d0).getValue()).booleanValue() ? kyg.a : kyg.c;
    }

    public final void o() {
        synchronized (this) {
            uqe uqeVar = this.c0;
            if (uqeVar != null) {
                uqeVar.h(null);
            }
            this.c0 = null;
            this.c0 = u63.Y(ee3.p(this), null, null, new b(null), 3);
            j6g j6gVar = j6g.a;
        }
    }

    public final void p() {
        synchronized (this) {
            uqe uqeVar = this.g0;
            if (uqeVar != null) {
                uqeVar.h(null);
            }
            this.g0 = null;
            this.g0 = u63.Y(ee3.p(this), null, null, new c(null), 3);
            j6g j6gVar = j6g.a;
        }
    }

    public final void q(int i, String str) {
        str.getClass();
        try {
            rsc rscVarK = k();
            rscVarK.getClass();
            lsc lscVar = (lsc) lc9.Y(str, ((rsc.a) rscVarK).a);
            r(lscVar.b, kud.e, lscVar, Integer.valueOf(i));
        } catch (NoSuchElementException e) {
            ArrayList arrayList = lz2.a;
            lz2.b("SearchOverlayViewModel", "Call made to getRecentSearchByUid with invalid uid: ".concat(str), false, e);
        } catch (Exception e2) {
            ArrayList arrayList2 = lz2.a;
            lz2.b("SearchOverlayViewModel", "Exception in getRecentSearchByUid with uid: ".concat(str), false, e2);
        }
    }

    public final void r(jud judVar, kud kudVar, lsc lscVar, Integer num) {
        kud kudVar2;
        judVar.getClass();
        kudVar.getClass();
        w(judVar);
        dd4 dd4Var = dd4.a;
        ad4 ad4Var = dd4.n().a;
        ad4Var.getClass();
        if (ad4Var.e(cd4.a.T0) == cd4.p2.c.getValue() && (kudVar2 = this.Y) != kud.X) {
            kudVar = kudVar2;
        }
        this.V.j(judVar, kudVar, lscVar, num);
    }

    public final void s(int i, boolean z) {
        lyg lygVar = (lyg) ((gme) this.b0).getValue();
        lygVar.getClass();
        List list = lygVar instanceof lyg.b ? ((lyg.b) lygVar).a : zr4.a;
        if (i < 0 || i >= list.size()) {
            ArrayList arrayList = lz2.a;
            lz2.b("SearchOverlayViewModel", p6.c(i, "Received invalid index for selecting suggestion: "), false, new IndexOutOfBoundsException());
            return;
        }
        String str = ((zye) list.get(i)).c;
        x(new lyg.d(str));
        this.Y = zve.U(l().a) ? kud.b : ((Boolean) ((gme) this.d0).getValue()).booleanValue() ? kud.d : kud.c;
        if (z) {
            r(jud.a(l(), str, null, 2), this.Y, null, null);
        }
        A(str, false);
    }

    public final void t(int i) {
        azg azgVar = (azg) ((gme) this.e0).getValue();
        azgVar.getClass();
        List list = azgVar instanceof azg.d ? ((azg.d) azgVar).a : zr4.a;
        if (i < 0 || i >= list.size()) {
            ArrayList arrayList = lz2.a;
            lz2.b("SearchOverlayViewModel", p6.c(i, "Received invalid index for selecting suggestion: "), false, new IndexOutOfBoundsException());
        } else {
            String str = ((zye) list.get(i)).c;
            y(new azg.j(str));
            r(jud.a(l(), null, str, 1), kud.f, null, null);
        }
    }

    public final void u() {
        synchronized (this) {
            uqe uqeVar = this.c0;
            if (uqeVar != null) {
                uqeVar.h(null);
            }
            this.c0 = null;
            j6g j6gVar = j6g.a;
        }
        x(lyg.c.a);
        w(jud.a(l(), "", null, 2));
        o();
    }

    public final void v() {
        synchronized (this) {
            uqe uqeVar = this.g0;
            if (uqeVar != null) {
                uqeVar.h(null);
            }
            this.g0 = null;
            j6g j6gVar = j6g.a;
        }
        y(azg.f.a);
        w(jud.a(l(), null, "", 1));
        p();
    }

    public final void w(jud judVar) {
        judVar.getClass();
        ((gme) this.Z).setValue(judVar);
    }

    public final void x(lyg lygVar) {
        ((gme) this.b0).setValue(lygVar);
    }

    public final void y(azg azgVar) {
        ((gme) this.e0).setValue(azgVar);
    }

    public final void z() {
        synchronized (this) {
            uqe uqeVar = this.h0;
            if (uqeVar != null) {
                uqeVar.h(null);
            }
            this.h0 = null;
            y(azg.a.a);
            this.i0 = System.currentTimeMillis();
            this.h0 = u63.Y(ee3.p(this), null, null, new d(null), 3);
            j6g j6gVar = j6g.a;
        }
    }
}
