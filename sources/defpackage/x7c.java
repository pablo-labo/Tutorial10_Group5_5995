package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class x7c implements w7c {
    public static final ko2 b = new ko2(a.a, b.a);
    public final zb0<Float, ce0> a;

    public static final class a extends mj8 implements Function2<vld, x7c, Float> {
        public static final a a = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Float invoke(vld vldVar, x7c x7cVar) {
            return x7cVar.a.d();
        }
    }

    public static final class b extends mj8 implements Function1<Float, x7c> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final x7c invoke(Float f) {
            return new x7c(new zb0(Float.valueOf(f.floatValue()), q92.c0, null, 12));
        }
    }

    public x7c() {
        this(new zb0(Float.valueOf(0.0f), q92.c0, null, 12));
    }

    @Override // defpackage.w7c
    public final Object a(r7c r7cVar) {
        Object objC = zb0.c(this.a, new Float(0.0f), null, null, r7cVar, 14);
        return objC == g13.a ? objC : j6g.a;
    }

    @Override // defpackage.w7c
    public final float b() {
        return this.a.d().floatValue();
    }

    @Override // defpackage.w7c
    public final Object c(float f, c1f c1fVar) {
        Object objE = this.a.e(c1fVar, new Float(f));
        return objE == g13.a ? objE : j6g.a;
    }

    @Override // defpackage.w7c
    public final Object d(s7c s7cVar) {
        Object objC = zb0.c(this.a, new Float(1.0f), null, null, s7cVar, 14);
        return objC == g13.a ? objC : j6g.a;
    }

    @Override // defpackage.w7c
    public final boolean e() {
        return ((Boolean) ((gme) this.a.d).getValue()).booleanValue();
    }

    public x7c(zb0<Float, ce0> zb0Var) {
        this.a = zb0Var;
    }
}
