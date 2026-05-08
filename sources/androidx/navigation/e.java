package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.k;
import defpackage.akb;
import defpackage.awd;
import defpackage.by5;
import defpackage.d2f;
import defpackage.eo1;
import defpackage.ey5;
import defpackage.fwc;
import defpackage.g8f;
import defpackage.gse;
import defpackage.gu5;
import defpackage.h5;
import defpackage.hh2;
import defpackage.huc;
import defpackage.irg;
import defpackage.iwc;
import defpackage.j6g;
import defpackage.juc;
import defpackage.kc9;
import defpackage.kv8;
import defpackage.l5;
import defpackage.l6;
import defpackage.laa;
import defpackage.lc9;
import defpackage.mj8;
import defpackage.nde;
import defpackage.nea;
import defpackage.o6;
import defpackage.pxf;
import defpackage.r40;
import defpackage.r6;
import defpackage.rqc;
import defpackage.s6;
import defpackage.u63;
import defpackage.ui5;
import defpackage.uv8;
import defpackage.v6e;
import defpackage.vaa;
import defpackage.vp2;
import defpackage.w92;
import defpackage.waa;
import defpackage.wg2;
import defpackage.wl7;
import defpackage.wpa;
import defpackage.xaa;
import defpackage.yaa;
import defpackage.ygd;
import defpackage.z92;
import defpackage.zaa;
import defpackage.zr4;
import defpackage.zs0;
import defpackage.zv8;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public int A;
    public final ArrayList B;
    public final d2f C;
    public final nde D;
    public final Context a;
    public final Activity b;
    public l c;
    public Bundle d;
    public Parcelable[] e;
    public boolean f;
    public final zs0<androidx.navigation.d> g;
    public final gse h;
    public final gse i;
    public final rqc j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public final LinkedHashMap n;
    public zv8 o;
    public zaa p;
    public final CopyOnWriteArrayList<b> q;
    public kv8.b r;
    public final vaa s;
    public final C0071e t;
    public final boolean u;
    public final u v;
    public final LinkedHashMap w;
    public Function1<? super androidx.navigation.d, j6g> x;
    public waa y;
    public final LinkedHashMap z;

    public final class a extends nea {
        public final s<? extends k> g;
        public final /* synthetic */ e h;

        /* JADX INFO: renamed from: androidx.navigation.e$a$a, reason: collision with other inner class name */
        public static final class C0070a extends mj8 implements gu5<j6g> {
            final /* synthetic */ androidx.navigation.d $popUpTo;
            final /* synthetic */ boolean $saveState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0070a(androidx.navigation.d dVar, boolean z) {
                super(0);
                this.$popUpTo = dVar;
                this.$saveState = z;
            }

            @Override // defpackage.gu5
            public final j6g invoke() {
                a.super.d(this.$popUpTo, this.$saveState);
                return j6g.a;
            }
        }

        public a(e eVar, s<? extends k> sVar) {
            sVar.getClass();
            this.h = eVar;
            this.g = sVar;
        }

        @Override // defpackage.nea
        public final androidx.navigation.d a(k kVar, Bundle bundle) {
            e eVar = this.h;
            return d.a.a(eVar.a, kVar, bundle, eVar.j(), eVar.p);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
        @Override // defpackage.nea
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(androidx.navigation.d r8) {
            /*
                r7 = this;
                r8.getClass()
                java.lang.String r0 = r8.f
                androidx.navigation.e r1 = r7.h
                gse r2 = r1.i
                java.util.LinkedHashMap r3 = r1.z
                java.lang.Object r4 = r3.get(r8)
                java.lang.Boolean r5 = java.lang.Boolean.TRUE
                boolean r4 = defpackage.wl7.b(r4, r5)
                super.b(r8)
                r3.remove(r8)
                zs0<androidx.navigation.d> r3 = r1.g
                boolean r5 = r3.contains(r8)
                r6 = 0
                if (r5 != 0) goto L80
                r1.C(r8)
                aw8 r7 = r8.W
                kv8$b r7 = r7.d
                kv8$b r5 = kv8.b.c
                int r7 = r7.compareTo(r5)
                if (r7 < 0) goto L3a
                kv8$b r7 = kv8.b.a
                r8.Z = r7
                r8.b()
            L3a:
                if (r3 == 0) goto L43
                boolean r7 = r3.isEmpty()
                if (r7 == 0) goto L43
                goto L5c
            L43:
                java.util.Iterator r7 = r3.iterator()
            L47:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L5c
                java.lang.Object r8 = r7.next()
                androidx.navigation.d r8 = (androidx.navigation.d) r8
                java.lang.String r8 = r8.f
                boolean r8 = defpackage.wl7.b(r8, r0)
                if (r8 == 0) goto L47
                goto L72
            L5c:
                if (r4 != 0) goto L72
                zaa r7 = r1.p
                if (r7 == 0) goto L72
                r0.getClass()
                java.util.LinkedHashMap r7 = r7.b
                java.lang.Object r7 = r7.remove(r0)
                irg r7 = (defpackage.irg) r7
                if (r7 == 0) goto L72
                r7.a()
            L72:
                r1.D()
                java.util.ArrayList r7 = r1.w()
                r2.getClass()
                r2.m(r6, r7)
                return
            L80:
                boolean r7 = r7.d
                if (r7 != 0) goto L9d
                r1.D()
                gse r7 = r1.h
                java.util.ArrayList r8 = defpackage.z92.B1(r3)
                r7.getClass()
                r7.m(r6, r8)
                java.util.ArrayList r7 = r1.w()
                r2.getClass()
                r2.m(r6, r7)
            L9d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.e.a.b(androidx.navigation.d):void");
        }

        @Override // defpackage.nea
        public final void d(androidx.navigation.d dVar, boolean z) {
            dVar.getClass();
            e eVar = this.h;
            s sVarB = eVar.v.b(dVar.b.a);
            eVar.z.put(dVar, Boolean.valueOf(z));
            if (!sVarB.equals(this.g)) {
                Object obj = eVar.w.get(sVarB);
                obj.getClass();
                ((a) obj).d(dVar, z);
                return;
            }
            waa waaVar = eVar.y;
            if (waaVar != null) {
                waaVar.invoke(dVar);
                super.d(dVar, z);
                return;
            }
            C0070a c0070a = new C0070a(dVar, z);
            zs0<androidx.navigation.d> zs0Var = eVar.g;
            int iIndexOf = zs0Var.indexOf(dVar);
            if (iIndexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + dVar + " as it was not found on the current back stack");
                return;
            }
            int i = iIndexOf + 1;
            if (i != zs0Var.c) {
                eVar.s(zs0Var.get(i).b.W, true, false);
            }
            e.v(eVar, dVar);
            c0070a.invoke();
            eVar.E();
            eVar.c();
        }

        @Override // defpackage.nea
        public final void e(androidx.navigation.d dVar, boolean z) {
            dVar.getClass();
            super.e(dVar, z);
        }

        @Override // defpackage.nea
        public final void f(androidx.navigation.d dVar) {
            dVar.getClass();
            super.f(dVar);
            if (!this.h.g.contains(dVar)) {
                r6.g("Cannot transition entry that is not in the back stack");
            } else {
                dVar.Z = kv8.b.d;
                dVar.b();
            }
        }

        @Override // defpackage.nea
        public final void g(androidx.navigation.d dVar) {
            dVar.getClass();
            e eVar = this.h;
            s sVarB = eVar.v.b(dVar.b.a);
            if (!sVarB.equals(this.g)) {
                Object obj = eVar.w.get(sVarB);
                if (obj != null) {
                    ((a) obj).g(dVar);
                    return;
                } else {
                    akb.n(l6.i(new StringBuilder("NavigatorBackStack for "), dVar.b.a, " should already be created"));
                    return;
                }
            }
            Function1<? super androidx.navigation.d, j6g> function1 = eVar.x;
            if (function1 != null) {
                function1.invoke(dVar);
                super.g(dVar);
            } else {
                Log.i("NavController", "Ignoring add of destination " + dVar.b + " outside of the call to navigate(). ");
            }
        }

        public final void j(androidx.navigation.d dVar) {
            super.g(dVar);
        }
    }

    public interface b {
        void onDestinationChanged(e eVar, k kVar, Bundle bundle);
    }

    public static final class c extends mj8 implements Function1<Context, Context> {
        public static final c a = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Context invoke(Context context) {
            Context context2 = context;
            context2.getClass();
            if (context2 instanceof ContextWrapper) {
                return ((ContextWrapper) context2).getBaseContext();
            }
            return null;
        }
    }

    public static final class d extends mj8 implements gu5<o> {
        public d() {
            super(0);
        }

        @Override // defpackage.gu5
        public final o invoke() {
            e.this.getClass();
            e eVar = e.this;
            return new o(eVar.a, eVar.v);
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.e$e, reason: collision with other inner class name */
    public static final class C0071e extends wpa {
        public C0071e() {
            super(false);
        }

        @Override // defpackage.wpa
        public final void b() {
            e.this.r();
        }
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [vaa] */
    public e(Context context) {
        Object next;
        context.getClass();
        this.a = context;
        Iterator it = v6e.O(context, c.a).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.b = (Activity) next;
        this.g = new zs0<>();
        zr4 zr4Var = zr4.a;
        this.h = hh2.e(zr4Var);
        gse gseVarE = hh2.e(zr4Var);
        this.i = gseVarE;
        this.j = wg2.j(gseVarE);
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.q = new CopyOnWriteArrayList<>();
        this.r = kv8.b.b;
        this.s = new uv8() { // from class: vaa
            @Override // defpackage.uv8
            public final void G(zv8 zv8Var, kv8.a aVar) {
                kv8.b bVarA = aVar.a();
                e eVar = this.a;
                eVar.r = bVarA;
                if (eVar.c != null) {
                    for (d dVar : z92.B1(eVar.g)) {
                        dVar.getClass();
                        dVar.d = aVar.a();
                        dVar.b();
                    }
                }
            }
        };
        this.t = new C0071e();
        this.u = true;
        u uVar = new u();
        this.v = uVar;
        this.w = new LinkedHashMap();
        this.z = new LinkedHashMap();
        uVar.a(new n(uVar));
        uVar.a(new androidx.navigation.a(this.a));
        this.B = new ArrayList();
        this.C = new d2f(new d());
        this.D = wg2.d(1, 0, eo1.b, 2);
    }

    public static k f(k kVar, int i, boolean z, k kVar2) {
        l lVar;
        if (kVar.W == i && (kVar2 == null || (kVar.equals(kVar2) && wl7.b(kVar.b, kVar2.b)))) {
            return kVar;
        }
        if (kVar instanceof l) {
            lVar = (l) kVar;
        } else {
            lVar = kVar.b;
            lVar.getClass();
        }
        return lVar.o(i, lVar, z, kVar2);
    }

    public static void q(e eVar, Object obj) {
        eVar.getClass();
        obj.getClass();
        eVar.p(eVar.g(obj));
    }

    public static /* synthetic */ void v(e eVar, androidx.navigation.d dVar) {
        eVar.u(dVar, false, new zs0<>());
    }

    public final void A(int i) {
        B(((o) this.C.getValue()).b(i), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0236 A[LOOP:14: B:111:0x0230->B:113:0x0236, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(androidx.navigation.l r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 1211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.e.B(androidx.navigation.l, android.os.Bundle):void");
    }

    public final void C(androidx.navigation.d dVar) {
        dVar.getClass();
        androidx.navigation.d dVar2 = (androidx.navigation.d) this.k.remove(dVar);
        if (dVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.l;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(dVar2);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            a aVar = (a) this.w.get(this.v.b(dVar2.b.a));
            if (aVar != null) {
                aVar.b(dVar2);
            }
            linkedHashMap.remove(dVar2);
        }
    }

    public final void D() {
        AtomicInteger atomicInteger;
        rqc rqcVar;
        Set set;
        ArrayList<androidx.navigation.d> arrayListB1 = z92.B1(this.g);
        if (arrayListB1.isEmpty()) {
            return;
        }
        k kVar = ((androidx.navigation.d) z92.Y0(arrayListB1)).b;
        ArrayList arrayList = new ArrayList();
        if (kVar instanceof ui5) {
            Iterator it = z92.i1(arrayListB1).iterator();
            while (it.hasNext()) {
                k kVar2 = ((androidx.navigation.d) it.next()).b;
                arrayList.add(kVar2);
                if (!(kVar2 instanceof ui5) && !(kVar2 instanceof l)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (androidx.navigation.d dVar : z92.i1(arrayListB1)) {
            kv8.b bVar = dVar.Z;
            k kVar3 = dVar.b;
            kv8.b bVar2 = kv8.b.e;
            kv8.b bVar3 = kv8.b.d;
            if (kVar != null && kVar3.W == kVar.W) {
                if (bVar != bVar2) {
                    a aVar = (a) this.w.get(this.v.b(kVar3.a));
                    if (wl7.b((aVar == null || (rqcVar = aVar.f) == null || (set = (Set) rqcVar.a.getValue()) == null) ? null : Boolean.valueOf(set.contains(dVar)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.l.get(dVar)) != null && atomicInteger.get() == 0)) {
                        map.put(dVar, bVar3);
                    } else {
                        map.put(dVar, bVar2);
                    }
                }
                k kVar4 = (k) z92.Q0(arrayList);
                if (kVar4 != null && kVar4.W == kVar3.W) {
                    if (arrayList.isEmpty()) {
                        s6.j("List is empty.");
                        return;
                    }
                    arrayList.remove(0);
                }
                kVar = kVar.b;
            } else if (arrayList.isEmpty() || kVar3.W != ((k) z92.O0(arrayList)).W) {
                dVar.Z = kv8.b.c;
                dVar.b();
            } else {
                if (arrayList.isEmpty()) {
                    s6.j("List is empty.");
                    return;
                }
                k kVar5 = (k) arrayList.remove(0);
                if (bVar == bVar2) {
                    dVar.Z = bVar3;
                    dVar.b();
                } else if (bVar != bVar3) {
                    map.put(dVar, bVar3);
                }
                l lVar = kVar5.b;
                if (lVar != null && !arrayList.contains(lVar)) {
                    arrayList.add(lVar);
                }
            }
        }
        for (androidx.navigation.d dVar2 : arrayListB1) {
            kv8.b bVar4 = (kv8.b) map.get(dVar2);
            if (bVar4 != null) {
                dVar2.getClass();
                dVar2.Z = bVar4;
                dVar2.b();
            } else {
                dVar2.b();
            }
        }
    }

    public final void E() {
        int i;
        boolean z = false;
        if (this.u) {
            zs0<androidx.navigation.d> zs0Var = this.g;
            if (zs0Var == null || !zs0Var.isEmpty()) {
                Iterator<androidx.navigation.d> it = zs0Var.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!(it.next().b instanceof l) && (i = i + 1) < 0) {
                        u63.n0();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            if (i > 1) {
                z = true;
            }
        }
        this.t.f(z);
    }

    public final void a(k kVar, Bundle bundle, androidx.navigation.d dVar, List<androidx.navigation.d> list) {
        androidx.navigation.d dVarPrevious;
        androidx.navigation.d dVarPrevious2;
        k kVar2 = dVar.b;
        boolean z = kVar2 instanceof ui5;
        zs0<androidx.navigation.d> zs0Var = this.g;
        if (!z) {
            while (!zs0Var.isEmpty() && (zs0Var.last().b instanceof ui5) && s(zs0Var.last().b.W, true, false)) {
            }
        }
        zs0<androidx.navigation.d> zs0Var2 = new zs0();
        boolean z2 = kVar instanceof l;
        Context context = this.a;
        androidx.navigation.d dVar2 = null;
        if (z2) {
            k kVar3 = kVar2;
            do {
                kVar3.getClass();
                kVar3 = kVar3.b;
                if (kVar3 != null) {
                    ListIterator<androidx.navigation.d> listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            dVarPrevious2 = listIterator.previous();
                            if (wl7.b(dVarPrevious2.b, kVar3)) {
                                break;
                            }
                        } else {
                            dVarPrevious2 = null;
                            break;
                        }
                    }
                    androidx.navigation.d dVarA = dVarPrevious2;
                    if (dVarA == null) {
                        dVarA = d.a.a(context, kVar3, bundle, j(), this.p);
                    }
                    zs0Var2.addFirst(dVarA);
                    if (!zs0Var.isEmpty() && zs0Var.last().b == kVar3) {
                        v(this, zs0Var.last());
                    }
                }
                if (kVar3 == null) {
                    break;
                }
            } while (kVar3 != kVar);
        }
        k kVar4 = zs0Var2.isEmpty() ? kVar2 : ((androidx.navigation.d) zs0Var2.first()).b;
        while (kVar4 != null && e(kVar4.W, kVar4) != kVar4) {
            kVar4 = kVar4.b;
            if (kVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator<androidx.navigation.d> listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        dVarPrevious = listIterator2.previous();
                        if (wl7.b(dVarPrevious.b, kVar4)) {
                            break;
                        }
                    } else {
                        dVarPrevious = null;
                        break;
                    }
                }
                androidx.navigation.d dVarA2 = dVarPrevious;
                if (dVarA2 == null) {
                    dVarA2 = d.a.a(context, kVar4, kVar4.b(bundle2), j(), this.p);
                }
                zs0Var2.addFirst(dVarA2);
            }
        }
        if (!zs0Var2.isEmpty()) {
            kVar2 = ((androidx.navigation.d) zs0Var2.first()).b;
        }
        while (!zs0Var.isEmpty() && (zs0Var.last().b instanceof l)) {
            k kVar5 = zs0Var.last().b;
            kVar5.getClass();
            if (((l) kVar5).a0.e(kVar2.W) != null) {
                break;
            } else {
                v(this, zs0Var.last());
            }
        }
        androidx.navigation.d dVarG = zs0Var.g();
        if (dVarG == null) {
            dVarG = (androidx.navigation.d) zs0Var2.g();
        }
        if (!wl7.b(dVarG != null ? dVarG.b : null, this.c)) {
            ListIterator<androidx.navigation.d> listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                androidx.navigation.d dVarPrevious3 = listIterator3.previous();
                k kVar6 = dVarPrevious3.b;
                l lVar = this.c;
                lVar.getClass();
                if (wl7.b(kVar6, lVar)) {
                    dVar2 = dVarPrevious3;
                    break;
                }
            }
            androidx.navigation.d dVarA3 = dVar2;
            if (dVarA3 == null) {
                l lVar2 = this.c;
                lVar2.getClass();
                l lVar3 = this.c;
                lVar3.getClass();
                dVarA3 = d.a.a(context, lVar2, lVar3.b(bundle), j(), this.p);
            }
            zs0Var2.addFirst(dVarA3);
        }
        for (androidx.navigation.d dVar3 : zs0Var2) {
            Object obj = this.w.get(this.v.b(dVar3.b.a));
            if (obj == null) {
                akb.n(l6.i(new StringBuilder("NavigatorBackStack for "), kVar.a, " should already be created"));
                return;
            }
            ((a) obj).j(dVar3);
        }
        zs0Var.addAll(zs0Var2);
        zs0Var.addLast(dVar);
        for (androidx.navigation.d dVar4 : z92.g1(dVar, zs0Var2)) {
            l lVar4 = dVar4.b.b;
            if (lVar4 != null) {
                m(dVar4, h(lVar4.W));
            }
        }
    }

    public final void b(b bVar) {
        bVar.getClass();
        this.q.add(bVar);
        zs0<androidx.navigation.d> zs0Var = this.g;
        if (zs0Var.isEmpty()) {
            return;
        }
        androidx.navigation.d dVarLast = zs0Var.last();
        bVar.onDestinationChanged(this, dVarLast.b, dVarLast.a());
    }

    public final boolean c() {
        zs0<androidx.navigation.d> zs0Var;
        while (true) {
            zs0Var = this.g;
            if (zs0Var.isEmpty() || !(zs0Var.last().b instanceof l)) {
                break;
            }
            v(this, zs0Var.last());
        }
        androidx.navigation.d dVarJ = zs0Var.j();
        ArrayList arrayList = this.B;
        if (dVarJ != null) {
            arrayList.add(dVarJ);
        }
        this.A++;
        D();
        int i = this.A - 1;
        this.A = i;
        if (i == 0) {
            ArrayList<androidx.navigation.d> arrayListB1 = z92.B1(arrayList);
            arrayList.clear();
            for (androidx.navigation.d dVar : arrayListB1) {
                Iterator<b> it = this.q.iterator();
                while (it.hasNext()) {
                    it.next().onDestinationChanged(this, dVar.b, dVar.a());
                }
                this.D.b(dVar);
            }
            ArrayList arrayList2 = new ArrayList(zs0Var);
            gse gseVar = this.h;
            gseVar.getClass();
            gseVar.m(null, arrayList2);
            ArrayList arrayListW = w();
            gse gseVar2 = this.i;
            gseVar2.getClass();
            gseVar2.m(null, arrayListW);
        }
        return dVarJ != null;
    }

    public final boolean d(ArrayList arrayList, k kVar, boolean z, boolean z2) {
        e eVar;
        boolean z3;
        huc hucVar = new huc();
        zs0 zs0Var = new zs0();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                eVar = this;
                z3 = z2;
                break;
            }
            s sVar = (s) it.next();
            huc hucVar2 = new huc();
            androidx.navigation.d dVarLast = this.g.last();
            eVar = this;
            z3 = z2;
            eVar.y = new waa(hucVar2, hucVar, eVar, z3, zs0Var);
            sVar.i(dVarLast, z3);
            eVar.y = null;
            if (!hucVar2.element) {
                break;
            }
            this = eVar;
            z2 = z3;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = eVar.m;
            if (!z) {
                g8f.a aVar = new g8f.a(new g8f(v6e.O(kVar, by5.c), new xaa(eVar)));
                while (aVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((k) aVar.next()).W);
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) zs0Var.g();
                    linkedHashMap.put(numValueOf, navBackStackEntryState != null ? navBackStackEntryState.a : null);
                }
            }
            if (!zs0Var.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) zs0Var.first();
                int i = navBackStackEntryState2.b;
                String str = navBackStackEntryState2.a;
                g8f.a aVar2 = new g8f.a(new g8f(v6e.O(eVar.e(i, null), ey5.c), new yaa(eVar)));
                while (aVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((k) aVar2.next()).W), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    eVar.n.put(str, zs0Var);
                }
            }
        }
        eVar.E();
        return hucVar.element;
    }

    public final k e(int i, k kVar) {
        k kVar2;
        l lVar = this.c;
        if (lVar == null) {
            return null;
        }
        if (lVar.W == i) {
            if (kVar == null) {
                return lVar;
            }
            if (wl7.b(lVar, kVar) && kVar.b == null) {
                return this.c;
            }
        }
        androidx.navigation.d dVarJ = this.g.j();
        if (dVarJ == null || (kVar2 = dVarJ.b) == null) {
            kVar2 = this.c;
            kVar2.getClass();
        }
        return f(kVar2, i, false, kVar);
    }

    public final <T> String g(T t) {
        Class<?> cls = t.getClass();
        iwc iwcVar = fwc.a;
        int iB = ygd.b(awd.m(iwcVar.b(cls)));
        l lVar = this.c;
        if (lVar == null) {
            r6.g("You must call setGraph() before calling getGraph()");
            return null;
        }
        k kVarF = f(lVar, iB, true, null);
        if (kVarF == null) {
            h5.l("Destination with route ", iwcVar.b(t.getClass()).r(), " cannot be found in navigation graph ", this.c);
            return null;
        }
        Map mapG0 = lc9.g0(kVarF.V);
        LinkedHashMap linkedHashMap = new LinkedHashMap(kc9.V(mapG0.size()));
        for (Map.Entry entry : mapG0.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((androidx.navigation.b) entry.getValue()).a);
        }
        return ygd.c(t, linkedHashMap);
    }

    public final androidx.navigation.d h(int i) {
        androidx.navigation.d dVarPrevious;
        zs0<androidx.navigation.d> zs0Var = this.g;
        ListIterator<androidx.navigation.d> listIterator = zs0Var.listIterator(zs0Var.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                dVarPrevious = null;
                break;
            }
            dVarPrevious = listIterator.previous();
            if (dVarPrevious.b.W == i) {
                break;
            }
        }
        androidx.navigation.d dVar = dVarPrevious;
        if (dVar != null) {
            return dVar;
        }
        StringBuilder sbG = o6.g(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbG.append(i());
        throw new IllegalArgumentException(sbG.toString().toString());
    }

    public final k i() {
        androidx.navigation.d dVarJ = this.g.j();
        if (dVarJ != null) {
            return dVarJ.b;
        }
        return null;
    }

    public final kv8.b j() {
        return this.o == null ? kv8.b.c : this.r;
    }

    public final androidx.navigation.d k() {
        Object next;
        Iterator it = z92.i1(this.g).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = ((vp2) v6e.L(it)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!(((androidx.navigation.d) next).b instanceof l)) {
                break;
            }
        }
        return (androidx.navigation.d) next;
    }

    public final l l(zs0<androidx.navigation.d> zs0Var) {
        k kVar;
        androidx.navigation.d dVarJ = zs0Var.j();
        if (dVarJ == null || (kVar = dVarJ.b) == null) {
            kVar = this.c;
            kVar.getClass();
        }
        if (kVar instanceof l) {
            return (l) kVar;
        }
        l lVar = kVar.b;
        lVar.getClass();
        return lVar;
    }

    public final void m(androidx.navigation.d dVar, androidx.navigation.d dVar2) {
        this.k.put(dVar, dVar2);
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap.get(dVar2) == null) {
            linkedHashMap.put(dVar2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(dVar2);
        obj.getClass();
        ((AtomicInteger) obj).incrementAndGet();
    }

    public final void n(int i, Bundle bundle) {
        int i2;
        p pVar;
        Bundle bundle2;
        zs0<androidx.navigation.d> zs0Var = this.g;
        k kVar = zs0Var.isEmpty() ? this.c : zs0Var.last().b;
        if (kVar == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + JwtParser.SEPARATOR_CHAR);
        }
        laa laaVarD = kVar.d(i);
        if (laaVarD != null) {
            pVar = laaVarD.b;
            i2 = laaVarD.a;
            Bundle bundle3 = laaVarD.c;
            if (bundle3 != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundle3);
            } else {
                bundle2 = null;
            }
        } else {
            i2 = i;
            pVar = null;
            bundle2 = null;
        }
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (i2 == 0 && pVar != null) {
            boolean z = pVar.d;
            int i3 = pVar.c;
            if (i3 != -1) {
                if (i3 == -1 || !s(i3, z, false)) {
                    return;
                }
                c();
                return;
            }
        }
        if (i2 == 0) {
            l5.q("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            return;
        }
        k kVarE = e(i2, null);
        if (kVarE != null) {
            o(kVarE, bundle2, pVar);
            return;
        }
        int i4 = k.Z;
        Context context = this.a;
        String strA = k.a.a(context, i2);
        if (laaVarD == null) {
            h5.m("Navigation action/destination ", strA, " cannot be found from the current destination ", kVar);
            return;
        }
        StringBuilder sbM = akb.m("Navigation destination ", strA, " referenced from action ");
        sbM.append(k.a.a(context, i));
        sbM.append(" cannot be found from the current destination ");
        sbM.append(kVar);
        throw new IllegalArgumentException(sbM.toString().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(androidx.navigation.k r24, android.os.Bundle r25, androidx.navigation.p r26) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.e.o(androidx.navigation.k, android.os.Bundle, androidx.navigation.p):void");
    }

    public final void p(String str) {
        if (this.c == null) {
            o6.o("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", this, 46);
            return;
        }
        l lVarL = l(this.g);
        k.b bVarR = lVarL.r(str, true, lVarL);
        if (bVarR == null) {
            r40.k(akb.m("Navigation destination that matches route ", str, " cannot be found in the navigation graph "), this.c);
            return;
        }
        k kVar = bVarR.a;
        Bundle bundleB = kVar.b(bVarR.b);
        if (bundleB == null) {
            bundleB = new Bundle();
        }
        Intent intent = new Intent();
        int i = k.Z;
        String str2 = kVar.X;
        Uri uri = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        uri.getClass();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleB.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        o(kVar, bundleB, null);
    }

    public final boolean r() {
        if (this.g.isEmpty()) {
            return false;
        }
        k kVarI = i();
        kVarI.getClass();
        return s(kVarI.W, true, false) && c();
    }

    public final boolean s(int i, boolean z, boolean z2) {
        k kVar;
        zs0<androidx.navigation.d> zs0Var = this.g;
        if (zs0Var.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = z92.i1(zs0Var).iterator();
        while (true) {
            if (!it.hasNext()) {
                kVar = null;
                break;
            }
            kVar = ((androidx.navigation.d) it.next()).b;
            s sVarB = this.v.b(kVar.a);
            if (z || kVar.W != i) {
                arrayList.add(sVarB);
            }
            if (kVar.W == i) {
                break;
            }
        }
        if (kVar != null) {
            return d(arrayList, kVar, z, z2);
        }
        int i2 = k.Z;
        Log.i("NavController", "Ignoring popBackStack to destination " + k.a.a(this.a, i) + " as it was not found on the current back stack");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2 A[LOOP:0: B:6:0x001d->B:49:0x00d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d9 A[EDGE_INSN: B:60:0x00d9->B:51:0x00d9 BREAK  A[LOOP:0: B:6:0x001d->B:49:0x00d2], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(java.lang.String r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.e.t(java.lang.String, boolean, boolean):boolean");
    }

    public final void u(androidx.navigation.d dVar, boolean z, zs0<NavBackStackEntryState> zs0Var) {
        zaa zaaVar;
        rqc rqcVar;
        Set set;
        zs0<androidx.navigation.d> zs0Var2 = this.g;
        androidx.navigation.d dVarLast = zs0Var2.last();
        if (!wl7.b(dVarLast, dVar)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(dVar.b);
            k kVar = dVarLast.b;
            sb.append(", which is not the top of the back stack (");
            sb.append(kVar);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        w92.C0(zs0Var2);
        a aVar = (a) this.w.get(this.v.b(dVarLast.b.a));
        boolean z2 = true;
        if ((aVar == null || (rqcVar = aVar.f) == null || (set = (Set) rqcVar.a.getValue()) == null || !set.contains(dVarLast)) && !this.l.containsKey(dVarLast)) {
            z2 = false;
        }
        kv8.b bVar = dVarLast.W.d;
        kv8.b bVar2 = kv8.b.c;
        if (bVar.compareTo(bVar2) >= 0) {
            if (z) {
                dVarLast.Z = bVar2;
                dVarLast.b();
                zs0Var.addFirst(new NavBackStackEntryState(dVarLast));
            }
            if (z2) {
                dVarLast.Z = bVar2;
                dVarLast.b();
            } else {
                dVarLast.Z = kv8.b.a;
                dVarLast.b();
                C(dVarLast);
            }
        }
        if (z || z2 || (zaaVar = this.p) == null) {
            return;
        }
        String str = dVarLast.f;
        str.getClass();
        irg irgVar = (irg) zaaVar.b.remove(str);
        if (irgVar != null) {
            irgVar.a();
        }
    }

    public final ArrayList w() {
        kv8.b bVar;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.w.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            bVar = kv8.b.d;
            if (!zHasNext) {
                break;
            }
            Iterable iterable = (Iterable) ((a) it.next()).f.a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                androidx.navigation.d dVar = (androidx.navigation.d) obj;
                if (!arrayList.contains(dVar) && dVar.Z.compareTo(bVar) < 0) {
                    arrayList2.add(obj);
                }
            }
            w92.w0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (androidx.navigation.d dVar2 : this.g) {
            androidx.navigation.d dVar3 = dVar2;
            if (!arrayList.contains(dVar3) && dVar3.Z.compareTo(bVar) >= 0) {
                arrayList3.add(dVar2);
            }
        }
        w92.w0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((androidx.navigation.d) obj2).b instanceof l)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final void x(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.a.getClassLoader());
        this.d = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.e = bundle.getParcelableArray("android-support-nav:controller:backStack");
        LinkedHashMap linkedHashMap = this.n;
        linkedHashMap.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                this.m.put(Integer.valueOf(intArray[i]), stringArrayList.get(i2));
                i++;
                i2++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String str : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                if (parcelableArray != null) {
                    str.getClass();
                    zs0 zs0Var = new zs0(parcelableArray.length);
                    int i3 = 0;
                    while (i3 < parcelableArray.length) {
                        int i4 = i3 + 1;
                        try {
                            Parcelable parcelable = parcelableArray[i3];
                            parcelable.getClass();
                            zs0Var.addLast((NavBackStackEntryState) parcelable);
                            i3 = i4;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            s6.j(e.getMessage());
                            return;
                        }
                    }
                    linkedHashMap.put(str, zs0Var);
                }
            }
        }
        this.f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public final boolean y(int i, Bundle bundle, p pVar) {
        k kVar;
        androidx.navigation.d dVar;
        k kVar2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.m;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection collectionValues = linkedHashMap.values();
        i iVar = new i(str);
        collectionValues.getClass();
        w92.A0(collectionValues, iVar, true);
        zs0<NavBackStackEntryState> zs0Var = (zs0) pxf.b(this.n).remove(str);
        ArrayList arrayList = new ArrayList();
        androidx.navigation.d dVarJ = this.g.j();
        if ((dVarJ == null || (kVar = dVarJ.b) == null) && (kVar = this.c) == null) {
            r6.g("You must call setGraph() before calling getGraph()");
            return false;
        }
        if (zs0Var != null) {
            for (NavBackStackEntryState navBackStackEntryState : zs0Var) {
                k kVarF = f(kVar, navBackStackEntryState.b, true, null);
                Context context = this.a;
                if (kVarF == null) {
                    int i2 = k.Z;
                    o6.n("Restore State failed: destination ", k.a.a(context, navBackStackEntryState.b), " cannot be found from the current destination ", kVar);
                    return false;
                }
                arrayList.add(navBackStackEntryState.a(context, kVarF, j(), this.p));
                kVar = kVarF;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList<androidx.navigation.d> arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((androidx.navigation.d) obj).b instanceof l)) {
                arrayList3.add(obj);
            }
        }
        for (androidx.navigation.d dVar2 : arrayList3) {
            List list = (List) z92.Z0(arrayList2);
            if (wl7.b((list == null || (dVar = (androidx.navigation.d) z92.Y0(list)) == null || (kVar2 = dVar.b) == null) ? null : kVar2.a, dVar2.b.a)) {
                list.add(dVar2);
            } else {
                arrayList2.add(u63.d0(dVar2));
            }
        }
        huc hucVar = new huc();
        for (List list2 : arrayList2) {
            s sVarB = this.v.b(((androidx.navigation.d) z92.O0(list2)).b.a);
            this.x = new f(hucVar, arrayList, new juc(), this, bundle);
            sVarB.d(list2, pVar);
            this.x = null;
        }
        return hucVar.element;
    }

    public final Bundle z() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : lc9.g0(this.v.a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleH = ((s) entry.getValue()).h();
            if (bundleH != null) {
                arrayList.add(str);
                bundle2.putBundle(str, bundleH);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        zs0<androidx.navigation.d> zs0Var = this.g;
        if (!zs0Var.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[zs0Var.c];
            Iterator<androidx.navigation.d> it = zs0Var.iterator();
            int i = 0;
            while (it.hasNext()) {
                parcelableArr[i] = new NavBackStackEntryState(it.next());
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = this.m;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i2 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                iArr[i2] = iIntValue;
                arrayList2.add(str2);
                i2++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = this.n;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str3 = (String) entry3.getKey();
                zs0 zs0Var2 = (zs0) entry3.getValue();
                arrayList3.add(str3);
                Parcelable[] parcelableArr2 = new Parcelable[zs0Var2.c];
                int i3 = 0;
                for (Object obj : zs0Var2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        u63.o0();
                        throw null;
                    }
                    parcelableArr2[i3] = (NavBackStackEntryState) obj;
                    i3 = i4;
                }
                bundle.putParcelableArray(l5.l("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f);
        }
        return bundle;
    }
}
