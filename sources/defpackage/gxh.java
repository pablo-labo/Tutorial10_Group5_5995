package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class gxh {
    public long A;
    public long B;
    public long C;
    public String D;
    public boolean E;
    public long F;
    public long G;
    public final i0i a;
    public final String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public long i;
    public String j;
    public long k;
    public String l;
    public long m;
    public long n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public String s;
    public Boolean t;
    public long u;
    public ArrayList v;
    public String w;
    public long x;
    public long y;
    public long z;

    public gxh(i0i i0iVar, String str) {
        fib.i(i0iVar);
        fib.f(str);
        this.a = i0iVar;
        this.b = str;
        a0i a0iVar = i0iVar.Y;
        i0i.i(a0iVar);
        a0iVar.b();
    }

    public final String A() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.w;
    }

    public final void B(long j) {
        fib.b(j >= 0);
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.g != j;
        this.g = j;
    }

    public final void C(String str) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= !yei.f0(this.j, str);
        this.j = str;
    }

    public final void D(long j) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.F != j;
        this.F = j;
    }

    public final void E(String str) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= !yei.f0(this.l, str);
        this.l = str;
    }

    public final String F() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.f;
    }

    public final void G(long j) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.G != j;
        this.G = j;
    }

    public final void H(String str) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= !yei.f0(this.D, str);
        this.D = str;
    }

    public final void I(long j) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.x != j;
        this.x = j;
    }

    public final void J(long j) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.y != j;
        this.y = j;
    }

    public final String K() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.j;
    }

    public final void L(long j) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.z != j;
        this.z = j;
    }

    public final long M() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.k;
    }

    public final void N(long j) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.A != j;
        this.A = j;
    }

    public final String O() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.l;
    }

    public final void P(long j) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.C != j;
        this.C = j;
    }

    public final long Q() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.m;
    }

    public final void R(long j) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.B != j;
        this.B = j;
    }

    public final long S() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.n;
    }

    public final void T(long j) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.p != j;
        this.p = j;
    }

    public final long U() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.u;
    }

    public final boolean V() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.o;
    }

    public final void W() {
        i0i i0iVar = this.a;
        a0i a0iVar = i0iVar.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        long j = this.g + 1;
        if (j > 2147483647L) {
            ewh ewhVar = i0iVar.X;
            i0i.i(ewhVar);
            ewhVar.X.a(ewh.l(this.b), "Bundle index overflow. appId");
            j = 0;
        }
        this.E = true;
        this.g = j;
    }

    public final void a(long j) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.h != j;
        this.h = j;
    }

    public final void b(Boolean bool) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        boolean z = this.E;
        Boolean bool2 = this.t;
        this.E = z | (!((bool2 == null && bool == null) ? true : bool2 == null ? false : bool2.equals(bool)));
        this.t = bool;
    }

    public final void c(String str) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= !yei.f0(this.c, str);
        this.c = str;
    }

    public final void d(List<String> list) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        ArrayList arrayList = this.v;
        if ((arrayList == null && list == null) ? true : arrayList == null ? false : arrayList.equals(list)) {
            return;
        }
        this.E = true;
        this.v = list != null ? new ArrayList(list) : null;
    }

    public final void e(boolean z) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.o != z;
        this.o = z;
    }

    public final String f() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        String str = this.D;
        H(null);
        return str;
    }

    public final long g() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.p;
    }

    public final boolean h() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.q;
    }

    public final boolean i() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.r;
    }

    public final ArrayList j() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.v;
    }

    public final void k(long j) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.i != j;
        this.i = j;
    }

    public final void l(String str) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !yei.f0(this.d, str);
        this.d = str;
    }

    public final void m(boolean z) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.q != z;
        this.q = z;
    }

    public final String n() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.b;
    }

    public final void o(long j) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.k != j;
        this.k = j;
    }

    public final void p(String str) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !yei.f0(this.s, str);
        this.s = str;
    }

    public final void q(boolean z) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.r != z;
        this.r = z;
    }

    public final String r() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.c;
    }

    public final void s(long j) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.m != j;
        this.m = j;
    }

    public final void t(String str) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !yei.f0(this.w, str);
        this.w = str;
    }

    public final String u() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.d;
    }

    public final void v(long j) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.n != j;
        this.n = j;
    }

    public final void w(String str) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= !yei.f0(this.e, str);
        this.e = str;
    }

    public final String x() {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        return this.s;
    }

    public final void y(long j) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= this.u != j;
        this.u = j;
    }

    public final void z(String str) {
        a0i a0iVar = this.a.Y;
        i0i.i(a0iVar);
        a0iVar.b();
        this.E |= !yei.f0(this.f, str);
        this.f = str;
    }
}
