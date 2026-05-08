package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d4 implements in9 {
    @Override // defpackage.in9
    public final Set<n8a> a() {
        return i().a();
    }

    @Override // defpackage.in9
    public Collection b(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        return i().b(n8aVar, diaVar);
    }

    @Override // defpackage.in9
    public final Set<n8a> c() {
        return i().c();
    }

    @Override // defpackage.z4d
    public final v62 d(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        diaVar.getClass();
        return i().d(n8aVar, diaVar);
    }

    @Override // defpackage.in9
    public Collection<sfe> e(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        return i().e(n8aVar, diaVar);
    }

    @Override // defpackage.z4d
    public Collection<aj3> f(lz3 lz3Var, Function1<? super n8a, Boolean> function1) {
        lz3Var.getClass();
        return i().f(lz3Var, function1);
    }

    @Override // defpackage.in9
    public final Set<n8a> g() {
        return i().g();
    }

    public final in9 h() {
        if (!(i() instanceof d4)) {
            return i();
        }
        in9 in9VarI = i();
        in9VarI.getClass();
        return ((d4) in9VarI).h();
    }

    public abstract in9 i();
}
