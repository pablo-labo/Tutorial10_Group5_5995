package defpackage;

import androidx.compose.runtime.r;
import androidx.emoji2.text.d;

/* JADX INFO: loaded from: classes.dex */
public final class ko3 {
    public ese<Boolean> a;

    public static final class a extends d.f {
        public final /* synthetic */ g4a<Boolean> a;
        public final /* synthetic */ ko3 b;

        public a(g4a<Boolean> g4aVar, ko3 ko3Var) {
            this.a = g4aVar;
            this.b = ko3Var;
        }

        @Override // androidx.emoji2.text.d.f
        public final void a() {
            this.b.a = c0h.b0;
        }

        @Override // androidx.emoji2.text.d.f
        public final void b() {
            ((gme) this.a).setValue(Boolean.TRUE);
            this.b.a = new w37(true);
        }
    }

    public final ese<Boolean> a() {
        d dVarA = d.a();
        if (dVarA.c() == 1) {
            return new w37(true);
        }
        g4a g4aVarF = r.f(Boolean.FALSE);
        dVarA.h(new a(g4aVarF, this));
        return g4aVarF;
    }
}
