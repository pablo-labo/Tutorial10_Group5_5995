package defpackage;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class bn7 extends xb1<an7, a> {
    public final qhb V;
    public final phb W;
    public final rhb X;
    public final h06 Y;
    public final zjd Z;
    public final f9g a0;
    public final wc9 b0;
    public final xjd c0;
    public final c16 d0;
    public final c39 e0;
    public final c85 f;
    public boolean f0;
    public Map<String, Long> g0 = bs4.a;

    public static abstract class a implements uo6 {

        /* JADX INFO: renamed from: bn7$a$a, reason: collision with other inner class name */
        public static final class C0096a extends a {
            public static final C0096a a = new C0096a();
        }

        public static final class b extends a {
            public static final b a = new b();
        }

        public static final class c extends a {
            public static final c a = new c();
        }
    }

    @uh3(c = "com.indeed.android.myjobs.presentation.tabs.InvitationTabViewModel$onTriggerEvent$1", f = "InvitationTabViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ a $event;
        int label;
        final /* synthetic */ bn7 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, bn7 bn7Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$event = aVar;
            this.this$0 = bn7Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$event, this.this$0, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            a aVar = this.$event;
            if (aVar instanceof a.b) {
                Function1<lx5, j6g> function1 = c05.a;
                c05.g("Invitations");
            } else if (aVar instanceof a.C0096a) {
                Function1<lx5, j6g> function12 = c05.a;
                c05.a("Invitations");
            } else {
                if (!(aVar instanceof a.c)) {
                    l.g();
                    return null;
                }
                if (i6a.q()) {
                    bn7 bn7Var = this.this$0;
                    bn7Var.getClass();
                    if (i6a.q()) {
                        u63.Y(ee3.p(bn7Var), null, null, new jn7(bn7Var, null), 3);
                    }
                }
            }
            return j6g.a;
        }
    }

    public bn7(c85 c85Var, qhb qhbVar, phb phbVar, rhb rhbVar, d16 d16Var, h06 h06Var, zjd zjdVar, f9g f9gVar, i1d i1dVar, wc9 wc9Var, xjd xjdVar, c16 c16Var, c39 c39Var) {
        this.f = c85Var;
        this.V = qhbVar;
        this.W = phbVar;
        this.X = rhbVar;
        this.Y = h06Var;
        this.Z = zjdVar;
        this.a0 = f9gVar;
        this.b0 = wc9Var;
        this.c0 = xjdVar;
        this.d0 = c16Var;
        this.e0 = c39Var;
        if (i6a.i()) {
            u63.Y(ee3.p(this), null, null, new en7(this, false, false, null), 3);
        }
    }

    @Override // defpackage.xb1
    public final xo6 h() {
        return new an7(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(int r20, int r21, defpackage.pu2 r22) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn7.l(int, int, pu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (r2 == r4) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(int r11, defpackage.pu2 r12) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn7.m(int, pu2):java.lang.Object");
    }

    public final void n(a aVar) {
        aVar.getClass();
        u63.Y(ee3.p(this), null, null, new b(aVar, this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0051 -> B:21:0x0054). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(defpackage.pu2 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.kn7
            if (r0 == 0) goto L13
            r0 = r7
            kn7 r0 = (defpackage.kn7) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kn7 r0 = new kn7
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            int r1 = r0.I$1
            int r3 = r0.I$0
            defpackage.r7d.b(r7)
            goto L54
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            r6 = 0
            return r6
        L30:
            defpackage.r7d.b(r7)
            r7 = 0
            r1 = 100
            r3 = r7
        L37:
            xo6 r7 = r6.i()
            an7 r7 = (defpackage.an7) r7
            boolean r7 = r7.b
            if (r7 == 0) goto L56
            if (r3 >= r1) goto L56
            r0.I$0 = r3
            r0.I$1 = r1
            r0.label = r2
            r4 = 100
            java.lang.Object r7 = defpackage.ls3.b(r4, r0)
            g13 r4 = defpackage.g13.a
            if (r7 != r4) goto L54
            return r4
        L54:
            int r3 = r3 + r2
            goto L37
        L56:
            xo6 r6 = r6.i()
            an7 r6 = (defpackage.an7) r6
            boolean r6 = r6.b
            r6 = r6 ^ r2
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bn7.o(pu2):java.lang.Object");
    }
}
