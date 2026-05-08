package defpackage;

import androidx.compose.ui.layout.q;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i1a implements ag9 {
    public final h1a a;

    public i1a(h1a h1aVar) {
        this.a = h1aVar;
    }

    @Override // defpackage.ag9
    public final int a(ql7 ql7Var, List<? extends pl7> list, int i) {
        return this.a.a(ql7Var, dg9.a(ql7Var), i);
    }

    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        return this.a.c(qVar, dg9.a(qVar), j);
    }

    @Override // defpackage.ag9
    public final int e(ql7 ql7Var, List<? extends pl7> list, int i) {
        return this.a.e(ql7Var, dg9.a(ql7Var), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1a) && wl7.b(this.a, ((i1a) obj).a);
    }

    @Override // defpackage.ag9
    public final int f(ql7 ql7Var, List<? extends pl7> list, int i) {
        return this.a.f(ql7Var, dg9.a(ql7Var), i);
    }

    @Override // defpackage.ag9
    public final int h(ql7 ql7Var, List<? extends pl7> list, int i) {
        return this.a.h(ql7Var, dg9.a(ql7Var), i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
