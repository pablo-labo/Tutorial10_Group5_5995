package defpackage;

import androidx.compose.ui.e;
import defpackage.hmb;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class om3 implements ua7 {
    public static final om3 a = new om3();

    public static final class a extends e.c implements eb4 {
        public final ei7 d0;
        public boolean e0;
        public boolean f0;
        public boolean g0;

        /* JADX INFO: renamed from: om3$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {228}, m = "invokeSuspend")
        public static final class C0370a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
            int label;

            /* JADX INFO: renamed from: om3$a$a$a, reason: collision with other inner class name */
            public static final class C0371a<T> implements wi5 {
                public final /* synthetic */ juc a;
                public final /* synthetic */ juc b;
                public final /* synthetic */ juc c;
                public final /* synthetic */ a d;

                public C0371a(juc jucVar, juc jucVar2, juc jucVar3, a aVar) {
                    this.a = jucVar;
                    this.b = jucVar2;
                    this.c = jucVar3;
                    this.d = aVar;
                }

                @Override // defpackage.wi5
                public final Object a(Object obj, lu2 lu2Var) {
                    ci7 ci7Var = (ci7) obj;
                    boolean z = ci7Var instanceof hmb.b;
                    juc jucVar = this.c;
                    juc jucVar2 = this.b;
                    juc jucVar3 = this.a;
                    boolean z2 = true;
                    if (z) {
                        jucVar3.element++;
                    } else if ((ci7Var instanceof hmb.c) || (ci7Var instanceof hmb.a)) {
                        jucVar3.element--;
                    } else if (ci7Var instanceof hk6) {
                        jucVar2.element++;
                    } else if (ci7Var instanceof ik6) {
                        jucVar2.element--;
                    } else if (ci7Var instanceof zl5) {
                        jucVar.element++;
                    } else if (ci7Var instanceof am5) {
                        jucVar.element--;
                    }
                    boolean z3 = false;
                    boolean z4 = jucVar3.element > 0;
                    boolean z5 = jucVar2.element > 0;
                    boolean z6 = jucVar.element > 0;
                    a aVar = this.d;
                    if (aVar.e0 != z4) {
                        aVar.e0 = z4;
                        z3 = true;
                    }
                    if (aVar.f0 != z5) {
                        aVar.f0 = z5;
                        z3 = true;
                    }
                    if (aVar.g0 != z6) {
                        aVar.g0 = z6;
                    } else {
                        z2 = z3;
                    }
                    if (z2) {
                        fb4.a(aVar);
                    }
                    return j6g.a;
                }
            }

            public C0370a(lu2<? super C0370a> lu2Var) {
                super(2, lu2Var);
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                return a.this.new C0370a(lu2Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
                return ((C0370a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
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
                juc jucVar = new juc();
                juc jucVar2 = new juc();
                juc jucVar3 = new juc();
                nde ndeVarB = a.this.d0.b();
                C0371a c0371a = new C0371a(jucVar, jucVar2, jucVar3, a.this);
                this.label = 1;
                ndeVarB.e(c0371a, this);
                return g13.a;
            }
        }

        public a(ei7 ei7Var) {
            this.d0 = ei7Var;
        }

        @Override // androidx.compose.ui.e.c
        public final void U1() {
            u63.Y(Q1(), null, null, new C0370a(null), 3);
        }

        @Override // defpackage.eb4
        public final void y(sm8 sm8Var) {
            ax1 ax1Var = sm8Var.a;
            sm8Var.N1();
            if (this.e0) {
                gb4.o1(sm8Var, da2.b(da2.b, 0.3f), 0L, ax1Var.c(), 0.0f, null, 122);
            } else if (this.f0 || this.g0) {
                gb4.o1(sm8Var, da2.b(da2.b, 0.1f), 0L, ax1Var.c(), 0.0f, null, 122);
            }
        }
    }

    @Override // defpackage.ua7
    public final ts3 a(ei7 ei7Var) {
        return new a(ei7Var);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // defpackage.ua7
    public final int hashCode() {
        return -1;
    }
}
