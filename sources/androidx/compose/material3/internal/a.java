package androidx.compose.material3.internal;

import androidx.compose.ui.e;
import defpackage.c1f;
import defpackage.cme;
import defpackage.dwa;
import defpackage.g13;
import defpackage.iq2;
import defpackage.iuc;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.mj8;
import defpackage.n4a;
import defpackage.oa4;
import defpackage.q30;
import defpackage.r6;
import defpackage.r7d;
import defpackage.th7;
import defpackage.uh3;
import defpackage.x0f;
import defpackage.xu5;
import defpackage.y20;
import defpackage.yd0;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.compose.material3.internal.a$a, reason: collision with other inner class name */
    @uh3(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {685}, m = "invokeSuspend")
    public static final class C0017a<T> extends c1f implements xu5<y20, oa4<T>, T, lu2<? super j6g>, Object> {
        final /* synthetic */ q30<T> $this_animateTo;
        final /* synthetic */ float $velocity;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.internal.a$a$a, reason: collision with other inner class name */
        public static final class C0018a extends mj8 implements Function2<Float, Float, j6g> {
            final /* synthetic */ y20 $$this$anchoredDrag;
            final /* synthetic */ iuc $prev;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0018a(y20 y20Var, iuc iucVar) {
                super(2);
                this.$$this$anchoredDrag = y20Var;
                this.$prev = iucVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final j6g invoke(Float f, Float f2) {
                float fFloatValue = f.floatValue();
                this.$$this$anchoredDrag.a(fFloatValue, f2.floatValue());
                this.$prev.element = fFloatValue;
                return j6g.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0017a(q30<T> q30Var, float f, lu2<? super C0017a> lu2Var) {
            super(4, lu2Var);
            this.$this_animateTo = q30Var;
            this.$velocity = f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                y20 y20Var = (y20) this.L$0;
                float f = ((oa4) this.L$1).f(this.L$2);
                if (!Float.isNaN(f)) {
                    iuc iucVar = new iuc();
                    float fG = Float.isNaN(((cme) this.$this_animateTo.j).g()) ? 0.0f : ((cme) this.$this_animateTo.j).g();
                    iucVar.element = fG;
                    float f2 = this.$velocity;
                    yd0<Float> yd0Var = this.$this_animateTo.c;
                    C0018a c0018a = new C0018a(y20Var, iucVar);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    Object objA = x0f.a(fG, f, f2, yd0Var, c0018a, this);
                    g13 g13Var = g13.a;
                    if (objA == g13Var) {
                        return g13Var;
                    }
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

        @Override // defpackage.xu5
        public final Object j(y20 y20Var, Object obj, Object obj2, lu2<? super j6g> lu2Var) {
            C0017a c0017a = new C0017a(this.$this_animateTo, this.$velocity, lu2Var);
            c0017a.L$0 = y20Var;
            c0017a.L$1 = (oa4) obj;
            c0017a.L$2 = obj2;
            return c0017a.invokeSuspend(j6g.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.gu5 r4, kotlin.jvm.functions.Function2 r5, defpackage.pu2 r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.material3.internal.b
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.internal.b r0 = (androidx.compose.material3.internal.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.internal.b r0 = new androidx.compose.material3.internal.b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.r7d.b(r6)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L3f
            goto L3f
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r4)
            return r2
        L2c:
            defpackage.r7d.b(r6)
            androidx.compose.material3.internal.c r6 = new androidx.compose.material3.internal.c     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L3f
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L3f
            r0.label = r3     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L3f
            java.lang.Object r4 = defpackage.f13.d(r6, r0)     // Catch: androidx.compose.material3.internal.AnchoredDragFinishedSignal -> L3f
            g13 r5 = defpackage.g13.a
            if (r4 != r5) goto L3f
            return r5
        L3f:
            j6g r4 = defpackage.j6g.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.a.a(gu5, kotlin.jvm.functions.Function2, pu2):java.lang.Object");
    }

    public static final <T> Object b(q30<T> q30Var, T t, float f, lu2<? super j6g> lu2Var) {
        Object objB = q30Var.b(t, n4a.a, new C0017a(q30Var, f, null), lu2Var);
        return objB == g13.a ? objB : j6g.a;
    }

    public static final <T> e c(e eVar, q30<T> q30Var, dwa dwaVar, Function2<? super th7, ? super iq2, ? extends Pair<? extends oa4<T>, ? extends T>> function2) {
        return eVar.o(new DraggableAnchorsElement(q30Var, function2, dwaVar));
    }
}
