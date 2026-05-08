package defpackage;

import androidx.compose.ui.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class r94 extends e.c implements jtf, t94, ql8 {
    public final u63 d0;
    public r94 e0;
    public t94 f0;
    public long g0;

    public static final class a extends mj8 implements Function1<r94, itf> {
        final /* synthetic */ o94 $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o94 o94Var) {
            super(1);
            this.$event = o94Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final itf invoke(r94 r94Var) {
            r94 r94Var2 = r94Var;
            if (!r94Var2.a.c0) {
                return itf.b;
            }
            t94 t94Var = r94Var2.f0;
            if (t94Var != null) {
                t94Var.U(this.$event);
            }
            r94Var2.f0 = null;
            r94Var2.e0 = null;
            return itf.a;
        }
    }

    public static final class b extends mj8 implements Function1<r94, itf> {
        final /* synthetic */ o94 $event$inlined;
        final /* synthetic */ luc $match;
        final /* synthetic */ r94 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(luc lucVar, r94 r94Var, o94 o94Var) {
            super(1);
            this.$match = lucVar;
            this.this$0 = r94Var;
            this.$event$inlined = o94Var;
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [T, jtf] */
        @Override // kotlin.jvm.functions.Function1
        public final itf invoke(r94 r94Var) {
            r94 r94Var2 = r94Var;
            r94 r94Var3 = r94Var2;
            r94 r94Var4 = this.this$0;
            r94Var4.getClass();
            if (!us3.g(r94Var4).getDragAndDropManager().a(r94Var3) || !s94.a(r94Var3, h4.o(this.$event$inlined))) {
                return itf.a;
            }
            this.$match.element = r94Var2;
            return itf.c;
        }
    }

    public r94(Object obj) {
        this.d0 = u63.b;
        this.g0 = 0L;
    }

    @Override // defpackage.t94
    public final void A1(o94 o94Var) {
        jtf jtfVar;
        r94 r94Var;
        r94 r94Var2 = this.e0;
        if (r94Var2 == null || !s94.a(r94Var2, h4.o(o94Var))) {
            if (this.a.c0) {
                luc lucVar = new luc();
                pg8.Y(this, new b(lucVar, this, o94Var));
                jtfVar = (jtf) lucVar.element;
            } else {
                jtfVar = null;
            }
            r94Var = (r94) jtfVar;
        } else {
            r94Var = r94Var2;
        }
        if (r94Var != null && r94Var2 == null) {
            r94Var.M(o94Var);
            r94Var.A1(o94Var);
            t94 t94Var = this.f0;
            if (t94Var != null) {
                t94Var.u1(o94Var);
            }
        } else if (r94Var == null && r94Var2 != null) {
            t94 t94Var2 = this.f0;
            if (t94Var2 != null) {
                t94Var2.M(o94Var);
                t94Var2.A1(o94Var);
            }
            r94Var2.u1(o94Var);
        } else if (!wl7.b(r94Var, r94Var2)) {
            if (r94Var != null) {
                r94Var.M(o94Var);
                r94Var.A1(o94Var);
            }
            if (r94Var2 != null) {
                r94Var2.u1(o94Var);
            }
        } else if (r94Var != null) {
            r94Var.A1(o94Var);
        } else {
            t94 t94Var3 = this.f0;
            if (t94Var3 != null) {
                t94Var3.A1(o94Var);
            }
        }
        this.e0 = r94Var;
    }

    @Override // defpackage.jtf
    public final Object E() {
        return this.d0;
    }

    @Override // defpackage.ql8
    public final void G(long j) {
        this.g0 = j;
    }

    @Override // defpackage.t94
    public final boolean I0(o94 o94Var) {
        r94 r94Var = this.e0;
        if (r94Var != null) {
            return r94Var.I0(o94Var);
        }
        t94 t94Var = this.f0;
        if (t94Var != null) {
            return t94Var.I0(o94Var);
        }
        return false;
    }

    @Override // defpackage.t94
    public final void M(o94 o94Var) {
        t94 t94Var = this.f0;
        if (t94Var != null) {
            t94Var.M(o94Var);
            return;
        }
        r94 r94Var = this.e0;
        if (r94Var != null) {
            r94Var.M(o94Var);
        }
    }

    @Override // defpackage.t94
    public final void U(o94 o94Var) {
        a aVar = new a(o94Var);
        if (aVar.invoke(this) != itf.a) {
            return;
        }
        pg8.Y(this, aVar);
    }

    @Override // androidx.compose.ui.e.c
    public final void V1() {
        this.f0 = null;
        this.e0 = null;
    }

    @Override // defpackage.t94
    public final void u1(o94 o94Var) {
        t94 t94Var = this.f0;
        if (t94Var != null) {
            t94Var.u1(o94Var);
        }
        r94 r94Var = this.e0;
        if (r94Var != null) {
            r94Var.u1(o94Var);
        }
        this.e0 = null;
    }

    @Override // defpackage.t94
    public final void v0(o94 o94Var) {
        t94 t94Var = this.f0;
        if (t94Var != null) {
            t94Var.v0(o94Var);
            return;
        }
        r94 r94Var = this.e0;
        if (r94Var != null) {
            r94Var.v0(o94Var);
        }
    }

    public r94() {
        this(null);
    }
}
