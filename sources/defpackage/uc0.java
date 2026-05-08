package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {418}, m = "invokeSuspend")
public final class uc0 extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ ese<yd0<Object>> $animSpec$delegate;
    final /* synthetic */ zb0<Object, Object> $animatable;
    final /* synthetic */ u12<Object> $channel;
    final /* synthetic */ ese<Function1<Object, j6g>> $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @uh3(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", l = {427}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ ese<yd0<Object>> $animSpec$delegate;
        final /* synthetic */ zb0<Object, Object> $animatable;
        final /* synthetic */ ese<Function1<Object, j6g>> $listener$delegate;
        final /* synthetic */ Object $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, zb0<Object, Object> zb0Var, ese<? extends yd0<Object>> eseVar, ese<? extends Function1<Object, j6g>> eseVar2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$newTarget = obj;
            this.$animatable = zb0Var;
            this.$animSpec$delegate = eseVar;
            this.$listener$delegate = eseVar2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            a aVar;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                if (!wl7.b(this.$newTarget, ((gme) this.$animatable.e).getValue())) {
                    zb0<Object, Object> zb0Var = this.$animatable;
                    Object obj2 = this.$newTarget;
                    ese<yd0<Object>> eseVar = this.$animSpec$delegate;
                    vpe<Float> vpeVar = vc0.a;
                    yd0<Object> value = eseVar.getValue();
                    this.label = 1;
                    aVar = this;
                    Object objC = zb0.c(zb0Var, obj2, value, null, aVar, 12);
                    g13 g13Var = g13.a;
                    if (objC == g13Var) {
                        return g13Var;
                    }
                }
                return j6g.a;
            }
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            aVar = this;
            ese<Function1<Object, j6g>> eseVar2 = aVar.$listener$delegate;
            vpe<Float> vpeVar2 = vc0.a;
            Function1<Object, j6g> value2 = eseVar2.getValue();
            if (value2 != null) {
                value2.invoke(aVar.$animatable.d());
            }
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uc0(u12<Object> u12Var, zb0<Object, Object> zb0Var, ese<? extends yd0<Object>> eseVar, ese<? extends Function1<Object, j6g>> eseVar2, lu2<? super uc0> lu2Var) {
        super(2, lu2Var);
        this.$channel = u12Var;
        this.$animatable = zb0Var;
        this.$animSpec$delegate = eseVar;
        this.$listener$delegate = eseVar2;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        uc0 uc0Var = new uc0(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, lu2Var);
        uc0Var.L$0 = obj;
        return uc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((uc0) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0034 -> B:12:0x0037). Please report as a decompilation issue!!! */
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
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 != r2) goto L14
            java.lang.Object r0 = r11.L$1
            g22 r0 = (defpackage.g22) r0
            java.lang.Object r3 = r11.L$0
            e13 r3 = (defpackage.e13) r3
            defpackage.r7d.b(r12)
            goto L37
        L14:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r11)
            return r1
        L1a:
            defpackage.r7d.b(r12)
            java.lang.Object r12 = r11.L$0
            e13 r12 = (defpackage.e13) r12
            u12<java.lang.Object> r0 = r11.$channel
            g22 r0 = r0.iterator()
            r3 = r12
        L28:
            r11.L$0 = r3
            r11.L$1 = r0
            r11.label = r2
            java.lang.Object r12 = r0.b(r11)
            g13 r4 = defpackage.g13.a
            if (r12 != r4) goto L37
            return r4
        L37:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L63
            java.lang.Object r12 = r0.next()
            u12<java.lang.Object> r4 = r11.$channel
            java.lang.Object r4 = r4.j()
            java.lang.Object r4 = defpackage.j22.a(r4)
            if (r4 != 0) goto L51
            r6 = r12
            goto L52
        L51:
            r6 = r4
        L52:
            uc0$a r5 = new uc0$a
            zb0<java.lang.Object, java.lang.Object> r7 = r11.$animatable
            ese<yd0<java.lang.Object>> r8 = r11.$animSpec$delegate
            ese<kotlin.jvm.functions.Function1<java.lang.Object, j6g>> r9 = r11.$listener$delegate
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = 3
            defpackage.u63.Y(r3, r1, r1, r5, r12)
            goto L28
        L63:
            j6g r11 = defpackage.j6g.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
