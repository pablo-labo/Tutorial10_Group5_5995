package defpackage;

import android.util.Log;
import androidx.compose.runtime.r;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.koin.core.error.NoBeanDefFoundException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lff6;", "Lbrg;", "Lxh8;", "app_playProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ff6 extends brg implements xh8 {
    public final gse V;
    public final gse W;
    public final rqc X;
    public final g4a Y;
    public final g3a Z;
    public final g4a a0;
    public final y03 b;
    public final Lazy c;
    public final g3a<jz2<j6g>> d;
    public final gse e;
    public final rqc f;

    @uh3(c = "com.indeed.android.jobsearch.bottomnav.hamburgermenu.HamburgerMenuViewModel$refreshData$1", f = "HamburgerMenuViewModel.kt", l = {108, 110}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        int label;

        /* JADX INFO: renamed from: ff6$a$a, reason: collision with other inner class name */
        @uh3(c = "com.indeed.android.jobsearch.bottomnav.hamburgermenu.HamburgerMenuViewModel$refreshData$1$1$1", f = "HamburgerMenuViewModel.kt", l = {116, 117}, m = "invokeSuspend")
        public static final class C0229a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ ff6 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0229a(ff6 ff6Var, lu2<? super C0229a> lu2Var) {
                super(2, lu2Var);
                this.this$0 = ff6Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new C0229a(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0229a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
            
                if (defpackage.ff6.h(r5, r0, r4) == r3) goto L15;
             */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    int r0 = r4.label
                    r1 = 2
                    r2 = 1
                    g13 r3 = defpackage.g13.a
                    if (r0 == 0) goto L1b
                    if (r0 == r2) goto L17
                    if (r0 != r1) goto L10
                    defpackage.r7d.b(r5)
                    goto L40
                L10:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r4)
                    r4 = 0
                    return r4
                L17:
                    defpackage.r7d.b(r5)
                    goto L2f
                L1b:
                    defpackage.r7d.b(r5)
                    ff6 r5 = r4.this$0
                    yba r0 = defpackage.ff6.g(r5)
                    java.util.List<zba> r0 = r0.d
                    r4.label = r2
                    java.lang.Object r5 = defpackage.ff6.i(r5, r0, r4)
                    if (r5 != r3) goto L2f
                    goto L3f
                L2f:
                    ff6 r5 = r4.this$0
                    yba r0 = defpackage.ff6.g(r5)
                    java.util.List<aca> r0 = r0.W
                    r4.label = r1
                    java.lang.Object r4 = defpackage.ff6.h(r5, r0, r4)
                    if (r4 != r3) goto L40
                L3f:
                    return r3
                L40:
                    j6g r4 = defpackage.j6g.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: ff6.a.C0229a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @uh3(c = "com.indeed.android.jobsearch.bottomnav.hamburgermenu.HamburgerMenuViewModel$refreshData$1$2$1", f = "HamburgerMenuViewModel.kt", l = {122}, m = "invokeSuspend")
        public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ ff6 this$0;

            /* JADX INFO: renamed from: ff6$a$b$a, reason: collision with other inner class name */
            public static final class C0230a<T> implements wi5 {
                public final /* synthetic */ ff6 a;

                public C0230a(ff6 ff6Var) {
                    this.a = ff6Var;
                }

                @Override // defpackage.wi5
                public final Object a(Object obj, lu2 lu2Var) throws NoBeanDefFoundException {
                    Object objI = ff6.i(this.a, (List) obj, lu2Var);
                    return objI == g13.a ? objI : j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(ff6 ff6Var, lu2<? super b> lu2Var) {
                super(2, lu2Var);
                this.this$0 = ff6Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new b(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        r7d.b(obj);
                        return j6g.a;
                    }
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                gse gseVar = ff6.g(this.this$0).b0;
                C0230a c0230a = new C0230a(this.this$0);
                this.label = 1;
                gseVar.e(c0230a, this);
                return g13.a;
            }
        }

        @uh3(c = "com.indeed.android.jobsearch.bottomnav.hamburgermenu.HamburgerMenuViewModel$refreshData$1$2$2", f = "HamburgerMenuViewModel.kt", l = {127}, m = "invokeSuspend")
        public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;
            final /* synthetic */ ff6 this$0;

            /* JADX INFO: renamed from: ff6$a$c$a, reason: collision with other inner class name */
            public static final class C0231a<T> implements wi5 {
                public final /* synthetic */ ff6 a;

                public C0231a(ff6 ff6Var) {
                    this.a = ff6Var;
                }

                @Override // defpackage.wi5
                public final Object a(Object obj, lu2 lu2Var) {
                    Object objH = ff6.h(this.a, (List) obj, lu2Var);
                    return objH == g13.a ? objH : j6g.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(ff6 ff6Var, lu2<? super c> lu2Var) {
                super(2, lu2Var);
                this.this$0 = ff6Var;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return new c(this.this$0, lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
            }

            @Override // defpackage.x81
            public final Object invokeSuspend(Object obj) throws Throwable {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        r7d.b(obj);
                        return j6g.a;
                    }
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
                gse gseVar = ff6.g(this.this$0).c0;
                C0231a c0231a = new C0231a(this.this$0);
                this.label = 1;
                gseVar.e(c0231a, this);
                return g13.a;
            }
        }

        public a(lu2<? super a> lu2Var) {
            super(2, lu2Var);
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return ff6.this.new a(lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (defpackage.yba.h(r7, r1, r3, r6, 4) == r4) goto L15;
         */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 0
                r2 = 2
                r3 = 1
                g13 r4 = defpackage.g13.a
                if (r0 == 0) goto L1b
                if (r0 == r3) goto L17
                if (r0 != r2) goto L11
                defpackage.r7d.b(r7)
                goto L51
            L11:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.r6.g(r6)
                return r1
            L17:
                defpackage.r7d.b(r7)
                goto L31
            L1b:
                defpackage.r7d.b(r7)
                ff6 r7 = defpackage.ff6.this
                gse r7 = r7.e
                r6.label = r3
                r7.getClass()
                af6 r0 = defpackage.af6.b
                r7.m(r1, r0)
                j6g r7 = defpackage.j6g.a
                if (r7 != r4) goto L31
                goto L50
            L31:
                ff6 r7 = defpackage.ff6.this
                yba r7 = defpackage.ff6.g(r7)
                ff6 r0 = defpackage.ff6.this
                ye r1 = new ye
                r3 = 9
                r1.<init>(r0, r3)
                la r3 = new la
                r5 = 10
                r3.<init>(r0, r5)
                r6.label = r2
                r0 = 4
                java.lang.Object r6 = defpackage.yba.h(r7, r1, r3, r6, r0)
                if (r6 != r4) goto L51
            L50:
                return r4
            L51:
                j6g r6 = defpackage.j6g.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ff6.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ff6() {
        eq3 eq3Var = a74.a;
        no3 no3Var = no3.c;
        no3Var.getClass();
        this.b = no3Var;
        this.c = boa.E(qt8.a, new if6(this));
        g3a<jz2<j6g>> g3aVar = new g3a<>();
        this.d = g3aVar;
        gse gseVarE = hh2.e(af6.a);
        this.e = gseVarE;
        this.f = wg2.j(gseVarE);
        zr4 zr4Var = zr4.a;
        this.V = hh2.e(zr4Var);
        gse gseVarE2 = hh2.e(zr4Var);
        this.W = gseVarE2;
        this.X = wg2.j(gseVarE2);
        Boolean bool = Boolean.FALSE;
        this.Y = r.f(bool);
        this.Z = g3aVar;
        this.a0 = r.f(bool);
        u63.Y(ee3.p(this), no3Var, null, new df6(this, null), 2);
        u63.Y(ee3.p(this), no3Var, null, new ef6(this, null), 2);
    }

    public static final yba g(ff6 ff6Var) {
        return (yba) ff6Var.c.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (defpackage.j6g.a == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(defpackage.ff6 r6, java.util.List r7, defpackage.lu2 r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof defpackage.gf6
            if (r0 == 0) goto L16
            r0 = r8
            gf6 r0 = (defpackage.gf6) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            gf6 r0 = new gf6
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            g13 r5 = defpackage.g13.a
            if (r1 == 0) goto L40
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            java.lang.Object r6 = r0.L$0
            java.util.List r6 = (java.util.List) r6
            defpackage.r7d.b(r8)
            goto L6d
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r2
        L38:
            java.lang.Object r7 = r0.L$0
            java.util.List r7 = (java.util.List) r7
            defpackage.r7d.b(r8)
            goto L51
        L40:
            defpackage.r7d.b(r8)
            gse r8 = r6.W
            r0.L$0 = r7
            r0.label = r4
            r8.setValue(r7)
            j6g r8 = defpackage.j6g.a
            if (r8 != r5) goto L51
            goto L6c
        L51:
            gse r6 = r6.e
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L5c
            af6 r7 = defpackage.af6.c
            goto L5e
        L5c:
            af6 r7 = defpackage.af6.a
        L5e:
            r0.L$0 = r2
            r0.label = r3
            r6.getClass()
            r6.m(r2, r7)
            j6g r6 = defpackage.j6g.a
            if (r6 != r5) goto L6d
        L6c:
            return r5
        L6d:
            j6g r6 = defpackage.j6g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff6.h(ff6, java.util.List, lu2):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0137, code lost:
    
        if (defpackage.j6g.a == r5) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(defpackage.ff6 r9, java.util.List r10, defpackage.lu2 r11) throws org.koin.core.error.NoBeanDefFoundException {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff6.i(ff6, java.util.List, lu2):java.lang.Object");
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    public final boolean j() {
        return ((Boolean) ((gme) this.Y).getValue()).booleanValue();
    }

    public final void k() {
        ArrayList arrayList = lz2.a;
        Log.d("HamburgerMenuViewModel", "Called refreshData", null);
        u63.Y(ee3.p(this), this.b, null, new a(null), 2);
    }
}
