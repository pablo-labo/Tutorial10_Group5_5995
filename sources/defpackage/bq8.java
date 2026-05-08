package defpackage;

import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import defpackage.we1;
import defpackage.zp8;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bq8 extends e.c implements nx9, we1, lm8 {
    public static final a h0 = new a();
    public cq8 d0;
    public zp8 e0;
    public boolean f0;
    public dwa g0;

    public static final class a implements we1.a {
        @Override // we1.a
        public final boolean a() {
            return false;
        }
    }

    public static final class b implements we1.a {
        public final /* synthetic */ luc<zp8.a> b;
        public final /* synthetic */ int c;

        public b(luc<zp8.a> lucVar, int i) {
            this.b = lucVar;
            this.c = i;
        }

        @Override // we1.a
        public final boolean a() {
            return bq8.this.c2(this.b.element, this.c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object, zp8$a] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.Object, zp8$a] */
    @Override // defpackage.we1
    public final Object O(Function1 function1, int i) {
        if (this.d0.a() <= 0 || !this.d0.c() || !this.c0) {
            return function1.invoke(h0);
        }
        boolean zD2 = d2(i);
        cq8 cq8Var = this.d0;
        int iE = zD2 ? cq8Var.e() : cq8Var.d();
        luc lucVar = new luc();
        zp8 zp8Var = this.e0;
        zp8Var.getClass();
        ?? aVar = new zp8.a(iE, iE);
        zp8Var.a.b(aVar);
        lucVar.element = aVar;
        int iB = this.d0.b() * 2;
        int iA = this.d0.a();
        if (iB > iA) {
            iB = iA;
        }
        Object objInvoke = null;
        int i2 = 0;
        while (objInvoke == null && c2((zp8.a) lucVar.element, i) && i2 < iB) {
            zp8.a aVar2 = (zp8.a) lucVar.element;
            int i3 = aVar2.a;
            int i4 = aVar2.b;
            if (d2(i)) {
                i4++;
            } else {
                i3--;
            }
            zp8 zp8Var2 = this.e0;
            zp8Var2.getClass();
            ?? aVar3 = new zp8.a(i3, i4);
            zp8Var2.a.b(aVar3);
            this.e0.a.j((zp8.a) lucVar.element);
            lucVar.element = aVar3;
            i2++;
            us3.f(this).e();
            objInvoke = function1.invoke(new b(lucVar, i));
        }
        this.e0.a.j((zp8.a) lucVar.element);
        us3.f(this).e();
        return objInvoke;
    }

    public final boolean c2(zp8.a aVar, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.g0 != dwa.a) {
                }
            } else if (i != 1 && i != 2) {
                r6.g("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (d2(i) ? aVar.a > 0 : aVar.b < this.d0.a() - 1) {
                return true;
            }
        } else if (this.g0 != dwa.b) {
            if (d2(i)) {
            }
        }
        return false;
    }

    @Override // defpackage.lm8
    public final bg9 d(q qVar, vf9 vf9Var, long j) {
        w wVarR = vf9Var.R(j);
        return qVar.Y0(wVarR.a, wVarR.b, bs4.a, new aq8(wVarR, 0));
    }

    public final boolean d2(int i) {
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i == 5) {
                return this.f0;
            }
            if (i == 6) {
                if (this.f0) {
                    return false;
                }
            } else if (i == 3) {
                int iOrdinal = us3.f(this).n0.ordinal();
                if (iOrdinal == 0) {
                    return this.f0;
                }
                if (iOrdinal != 1) {
                    l.g();
                    return false;
                }
                if (this.f0) {
                    return false;
                }
            } else {
                if (i != 4) {
                    r6.g("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
                int iOrdinal2 = us3.f(this).n0.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        return this.f0;
                    }
                    l.g();
                    return false;
                }
                if (this.f0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.nx9
    public final v1 j0() {
        Pair pair = new Pair(xe1.a, this);
        wge wgeVar = new wge((kx9) pair.d());
        kx9<?> kx9Var = (kx9) pair.d();
        Object objE = pair.e();
        if (kx9Var != wgeVar.b) {
            ae7.b("Check failed.");
        }
        ((gme) wgeVar.c).setValue(objE);
        return wgeVar;
    }
}
