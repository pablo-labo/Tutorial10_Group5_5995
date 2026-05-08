package defpackage;

import defpackage.d04;
import defpackage.hv1;
import defpackage.lf0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class ww4 implements in9 {
    public final String b;

    public ww4(xw4 xw4Var, String... strArr) {
        String strA = xw4Var.a();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.b = String.format(strA, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // defpackage.in9
    public Set<n8a> a() {
        return is4.a;
    }

    @Override // defpackage.in9
    public Set<n8a> c() {
        return is4.a;
    }

    @Override // defpackage.z4d
    public v62 d(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        diaVar.getClass();
        return new jw4(n8a.n(String.format(mw4.ERROR_CLASS.a(), Arrays.copyOf(new Object[]{n8aVar}, 1))));
    }

    @Override // defpackage.z4d
    public Collection<aj3> f(lz3 lz3Var, Function1<? super n8a, Boolean> function1) {
        lz3Var.getClass();
        return zr4.a;
    }

    @Override // defpackage.in9
    public Set<n8a> g() {
        return is4.a;
    }

    @Override // defpackage.in9
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set e(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        jw4 jw4Var = lx4.c;
        jw4Var.getClass();
        nw4 nw4Var = new nw4(jw4Var, null, lf0.a.a, n8a.n(mw4.ERROR_FUNCTION.a()), hv1.a.a, qne.p);
        hx4 hx4VarC = lx4.c(kx4.c, new String[0]);
        ax9 ax9Var = ax9.d;
        d04.h hVar = d04.e;
        zr4 zr4Var = zr4.a;
        nw4Var.P0(null, null, zr4Var, zr4Var, zr4Var, hx4VarC, ax9Var, hVar);
        return pi3.k(nw4Var);
    }

    @Override // defpackage.in9
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set b(n8a n8aVar, dia diaVar) {
        n8aVar.getClass();
        return lx4.f;
    }

    public String toString() {
        return w40.f(new StringBuilder("ErrorScope{"), this.b, '}');
    }
}
