package androidx.compose.animation;

import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import defpackage.b4b;
import defpackage.bg9;
import defpackage.bs4;
import defpackage.c20;
import defpackage.csf;
import defpackage.dd0;
import defpackage.de0;
import defpackage.ese;
import defpackage.g4a;
import defpackage.j6g;
import defpackage.jf5;
import defpackage.lnd;
import defpackage.mj8;
import defpackage.nm8;
import defpackage.qx9;
import defpackage.sie;
import defpackage.th7;
import defpackage.vf9;
import defpackage.vl8;
import defpackage.wl7;
import defpackage.z3a;
import defpackage.zd0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements dd0<S> {
    public final csf<S> a;
    public c20 b;
    public final g4a c = r.f(new th7(0));
    public final z3a<S, ese<th7>> d = lnd.b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifierElement;", "S", "Lqx9;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$b;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SizeModifierElement<S> extends qx9<b<S>> {
        public final csf<S>.a<th7, de0> b;
        public final g4a c;
        public final AnimatedContentTransitionScopeImpl<S> d;

        public SizeModifierElement(csf.a aVar, g4a g4aVar, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
            this.b = aVar;
            this.c = g4aVar;
            this.d = animatedContentTransitionScopeImpl;
        }

        @Override // defpackage.qx9
        public final e.c a() {
            b bVar = new b();
            bVar.d0 = this.b;
            bVar.e0 = this.c;
            bVar.f0 = this.d;
            bVar.g0 = -9223372034707292160L;
            return bVar;
        }

        @Override // defpackage.qx9
        public final void b(e.c cVar) {
            b bVar = (b) cVar;
            bVar.d0 = this.b;
            bVar.e0 = this.c;
            bVar.f0 = this.d;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SizeModifierElement)) {
                return false;
            }
            SizeModifierElement sizeModifierElement = (SizeModifierElement) obj;
            return wl7.b(sizeModifierElement.b, this.b) && wl7.b(sizeModifierElement.c, this.c);
        }

        public final int hashCode() {
            int iHashCode = this.d.hashCode() * 31;
            csf<S>.a<th7, de0> aVar = this.b;
            return this.c.hashCode() + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }
    }

    public static final class a implements b4b {
        public final g4a b;

        public a(boolean z) {
            this.b = r.f(Boolean.valueOf(z));
        }

        @Override // defpackage.b4b
        public final Object A() {
            return this;
        }
    }

    public static final class b<S> extends nm8 {
        public csf<S>.a<th7, de0> d0;
        public g4a e0;
        public AnimatedContentTransitionScopeImpl<S> f0;
        public long g0;

        public static final class a extends mj8 implements Function1<w.a, j6g> {
            final /* synthetic */ long $measuredSize;
            final /* synthetic */ w $placeable;
            final /* synthetic */ b<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b<S> bVar, w wVar, long j) {
                super(1);
                this.this$0 = bVar;
                this.$placeable = wVar;
                this.$measuredSize = j;
            }

            @Override // kotlin.jvm.functions.Function1
            public final j6g invoke(w.a aVar) {
                c20 c20Var = this.this$0.f0.b;
                w wVar = this.$placeable;
                w.a.w(aVar, this.$placeable, c20Var.a((((long) wVar.a) << 32) | (((long) wVar.b) & 4294967295L), this.$measuredSize, vl8.a));
                return j6g.a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.animation.AnimatedContentTransitionScopeImpl$b$b, reason: collision with other inner class name */
        public static final class C0010b extends mj8 implements Function1<csf.b<S>, jf5<th7>> {
            final /* synthetic */ long $currentSize;
            final /* synthetic */ b<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0010b(b<S> bVar, long j) {
                super(1);
                this.this$0 = bVar;
                this.$currentSize = j;
            }

            @Override // kotlin.jvm.functions.Function1
            public final jf5<th7> invoke(Object obj) {
                long j;
                jf5<th7> jf5VarB;
                csf.b bVar = (csf.b) obj;
                boolean zB = wl7.b(bVar.b(), this.this$0.f0.b());
                b<S> bVar2 = this.this$0;
                if (zB) {
                    j = this.$currentSize;
                    if (!th7.b(bVar2.g0, -9223372034707292160L)) {
                        j = bVar2.g0;
                    }
                } else {
                    ese<th7> eseVarD = bVar2.f0.d.d((S) bVar.b());
                    j = eseVarD != null ? eseVarD.getValue().a : 0L;
                }
                ese<th7> eseVarD2 = this.this$0.f0.d.d((S) bVar.a());
                long j2 = eseVarD2 != null ? eseVarD2.getValue().a : 0L;
                sie sieVar = (sie) this.this$0.e0.getValue();
                return (sieVar == null || (jf5VarB = sieVar.b(j, j2)) == null) ? zd0.c(400.0f, null, 5) : jf5VarB;
            }
        }

        public static final class c extends mj8 implements Function1<S, th7> {
            final /* synthetic */ long $currentSize;
            final /* synthetic */ b<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b<S> bVar, long j) {
                super(1);
                this.this$0 = bVar;
                this.$currentSize = j;
            }

            @Override // kotlin.jvm.functions.Function1
            public final th7 invoke(Object obj) {
                long j;
                boolean zB = wl7.b(obj, this.this$0.f0.b());
                b<S> bVar = this.this$0;
                if (zB) {
                    j = this.$currentSize;
                    if (!th7.b(bVar.g0, -9223372034707292160L)) {
                        j = bVar.g0;
                    }
                } else {
                    ese<th7> eseVarD = bVar.f0.d.d(obj);
                    j = eseVarD != null ? eseVarD.getValue().a : 0L;
                }
                return new th7(j);
            }
        }

        public b() {
            throw null;
        }

        @Override // androidx.compose.ui.e.c
        public final void W1() {
            this.g0 = -9223372034707292160L;
        }

        @Override // defpackage.lm8
        public final bg9 d(q qVar, vf9 vf9Var, long j) {
            long j2;
            w wVarR = vf9Var.R(j);
            if (qVar.m0()) {
                j2 = (((long) wVarR.a) << 32) | (((long) wVarR.b) & 4294967295L);
            } else {
                csf<S>.a<th7, de0> aVar = this.d0;
                int i = wVarR.a;
                if (aVar == null) {
                    j2 = (((long) i) << 32) | (((long) wVarR.b) & 4294967295L);
                    this.g0 = j2;
                } else {
                    long j3 = (((long) wVarR.b) & 4294967295L) | (((long) i) << 32);
                    csf.a.C0199a c0199aA = aVar.a(new C0010b(this, j3), new c(this, j3));
                    this.f0.getClass();
                    j2 = ((th7) c0199aA.getValue()).a;
                    this.g0 = ((th7) c0199aA.getValue()).a;
                }
            }
            return qVar.Y0((int) (j2 >> 32), (int) (4294967295L & j2), bs4.a, new a(this, wVarR, j2));
        }
    }

    public AnimatedContentTransitionScopeImpl(csf csfVar, c20 c20Var) {
        this.a = csfVar;
        this.b = c20Var;
    }

    @Override // csf.b
    public final S a() {
        return this.a.f().a();
    }

    @Override // csf.b
    public final S b() {
        return this.a.f().b();
    }
}
