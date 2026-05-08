package defpackage;

import androidx.paging.SingleRunner;
import defpackage.x6;
import defpackage.xz8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s0d<Key, Value> implements x0d<Key, Value> {
    public final e13 a;
    public final r0d<Key, Value> b;
    public final y6 c;
    public final SingleRunner d;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[zz8.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public static final class b extends mj8 implements Function1<x6<Key, Value>, j6g> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object obj) {
            x6 x6Var = (x6) obj;
            x6Var.getClass();
            x6Var.d = true;
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<x6<Key, Value>, Boolean> {
        final /* synthetic */ zz8 $loadType;
        final /* synthetic */ s2b<Key, Value> $pagingState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(zz8 zz8Var, s2b<Key, Value> s2bVar) {
            super(1);
            this.$loadType = zz8Var;
            this.$pagingState = s2bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            x6.b<Key, Value> next;
            x6 x6Var = (x6) obj;
            x6Var.getClass();
            zz8 zz8Var = this.$loadType;
            s2b<Key, Value> s2bVar = this.$pagingState;
            zz8Var.getClass();
            s2bVar.getClass();
            zs0<x6.b<Key, Value>> zs0Var = x6Var.c;
            Iterator<x6.b<Key, Value>> it = zs0Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.a == zz8Var) {
                    break;
                }
            }
            x6.b<Key, Value> bVar = next;
            boolean z = false;
            if (bVar != null) {
                bVar.b = s2bVar;
            } else {
                x6.a aVar = x6Var.a[zz8Var.ordinal()];
                x6.a aVar2 = x6.a.c;
                zz8 zz8Var2 = zz8.a;
                if (aVar == aVar2 && zz8Var != zz8Var2) {
                    zs0Var.addLast(new x6.b<>(zz8Var, s2bVar));
                } else if (aVar == x6.a.a || zz8Var == zz8Var2) {
                    if (zz8Var == zz8Var2) {
                        x6Var.e(zz8Var2, null);
                    }
                    if (x6Var.b[zz8Var.ordinal()] == null) {
                        zs0Var.addLast(new x6.b<>(zz8Var, s2bVar));
                        z = true;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class d extends mj8 implements Function1<x6<Key, Value>, j6g> {
        final /* synthetic */ s2b<Key, Value> $pagingState;
        final /* synthetic */ s0d<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s0d<Key, Value> s0dVar, s2b<Key, Value> s2bVar) {
            super(1);
            this.this$0 = s0dVar;
            this.$pagingState = s2bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object obj) {
            x6 x6Var = (x6) obj;
            x6Var.getClass();
            if (x6Var.d) {
                x6Var.d = false;
                s0d<Key, Value> s0dVar = this.this$0;
                s0dVar.f(s0dVar.c, zz8.a, this.$pagingState);
            }
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function1<x6<Key, Value>, j6g> {
        final /* synthetic */ List<zz8> $toBeStarted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ArrayList arrayList) {
            super(1);
            this.$toBeStarted = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Object obj) {
            x6 x6Var = (x6) obj;
            x6Var.getClass();
            zz8 zz8Var = zz8.a;
            xz8 xz8VarB = x6Var.b(zz8Var);
            zz8 zz8Var2 = zz8.c;
            xz8 xz8VarB2 = x6Var.b(zz8Var2);
            zz8 zz8Var3 = zz8.b;
            yz8 yz8Var = new yz8(xz8VarB, x6Var.b(zz8Var3), xz8VarB2);
            boolean z = xz8VarB instanceof xz8.a;
            xz8.a[] aVarArr = x6Var.b;
            int length = aVarArr.length;
            for (int i = 0; i < length; i++) {
                aVarArr[i] = null;
            }
            if (z) {
                this.$toBeStarted.add(zz8Var);
                x6Var.d(zz8Var, x6.a.a);
            }
            if (yz8Var.c instanceof xz8.a) {
                if (!z) {
                    this.$toBeStarted.add(zz8Var2);
                }
                x6Var.a(zz8Var2);
            }
            if (yz8Var.b instanceof xz8.a) {
                if (!z) {
                    this.$toBeStarted.add(zz8Var3);
                }
                x6Var.a(zz8Var3);
            }
            return j6g.a;
        }
    }

    public s0d(e13 e13Var, r0d<Key, Value> r0dVar) {
        e13Var.getClass();
        r0dVar.getClass();
        this.a = e13Var;
        this.b = r0dVar;
        this.c = new y6(0);
        this.d = new SingleRunner(false);
    }

    @Override // defpackage.y0d
    public final void a(s2b<Key, Value> s2bVar) {
        this.c.b(new d(this, s2bVar));
    }

    @Override // defpackage.y0d
    public final void b() {
        this.c.b(b.a);
    }

    @Override // defpackage.y0d
    public final void c(zz8 zz8Var, s2b<Key, Value> s2bVar) {
        zz8Var.getClass();
        s2bVar.getClass();
        f(this.c, zz8Var, s2bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.x0d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.pu2 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.t0d
            if (r0 == 0) goto L13
            r0 = r5
            t0d r0 = (defpackage.t0d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            t0d r0 = new t0d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Object r4 = r0.L$0
            s0d r4 = (defpackage.s0d) r4
            defpackage.r7d.b(r5)
            goto L42
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            r4 = 0
            return r4
        L30:
            defpackage.r7d.b(r5)
            r0.L$0 = r4
            r0.label = r2
            r0d<Key, Value> r5 = r4.b
            java.lang.Object r5 = r5.initialize(r0)
            g13 r0 = defpackage.g13.a
            if (r5 != r0) goto L42
            return r0
        L42:
            r0 = r5
            r0d$a r0 = (r0d.a) r0
            r0d$a r1 = r0d.a.a
            if (r0 != r1) goto L50
            y6 r4 = r4.c
            u0d r0 = defpackage.u0d.a
            r4.b(r0)
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s0d.d(pu2):java.lang.Object");
    }

    @Override // defpackage.y0d
    public final void e(s2b<Key, Value> s2bVar) {
        s2bVar.getClass();
        ArrayList arrayList = new ArrayList();
        this.c.b(new e(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c((zz8) it.next(), s2bVar);
        }
    }

    public final void f(y6 y6Var, zz8 zz8Var, s2b<Key, Value> s2bVar) {
        if (((Boolean) y6Var.b(new c(zz8Var, s2bVar))).booleanValue()) {
            int i = a.a[zz8Var.ordinal()];
            e13 e13Var = this.a;
            if (i == 1) {
                u63.Y(e13Var, null, null, new w0d(this, null), 3);
            } else {
                u63.Y(e13Var, null, null, new v0d(this, null), 3);
            }
        }
    }

    @Override // defpackage.x0d
    public final gse getState() {
        return (gse) this.c.b;
    }
}
