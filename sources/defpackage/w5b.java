package defpackage;

import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class w5b implements Comparable<w5b> {
    public static final String b;
    public final vr1 a;

    public static final class a {
        public static w5b a(String str) {
            str.getClass();
            vr1 vr1Var = i.a;
            zn1 zn1Var = new zn1();
            zn1Var.Q0(str);
            return i.d(zn1Var, false);
        }

        public static w5b b(File file) {
            String str = w5b.b;
            String string = file.toString();
            string.getClass();
            return a(string);
        }
    }

    static {
        String str = File.separator;
        str.getClass();
        b = str;
    }

    public w5b(vr1 vr1Var) {
        vr1Var.getClass();
        this.a = vr1Var;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = i.a(this);
        vr1 vr1Var = this.a;
        if (iA == -1) {
            iA = 0;
        } else if (iA < vr1Var.h() && vr1Var.r(iA) == 92) {
            iA++;
        }
        int iH = vr1Var.h();
        int i = iA;
        while (iA < iH) {
            if (vr1Var.r(iA) == 47 || vr1Var.r(iA) == 92) {
                arrayList.add(vr1Var.w(i, iA));
                i = iA + 1;
            }
            iA++;
        }
        if (i < vr1Var.h()) {
            arrayList.add(vr1Var.w(i, vr1Var.h()));
        }
        return arrayList;
    }

    public final String c() {
        vr1 vr1Var = i.a;
        vr1 vr1VarX = this.a;
        int iT = vr1.t(vr1VarX, vr1Var);
        if (iT == -1) {
            iT = vr1.t(vr1VarX, i.b);
        }
        if (iT != -1) {
            vr1VarX = vr1.x(vr1VarX, iT + 1, 0, 2);
        } else if (m() != null && vr1VarX.h() == 2) {
            vr1VarX = vr1.c;
        }
        return vr1VarX.A();
    }

    @Override // java.lang.Comparable
    public final int compareTo(w5b w5bVar) {
        w5b w5bVar2 = w5bVar;
        w5bVar2.getClass();
        return this.a.compareTo(w5bVar2.a);
    }

    public final w5b e() {
        vr1 vr1Var = i.d;
        vr1 vr1Var2 = this.a;
        if (wl7.b(vr1Var2, vr1Var)) {
            return null;
        }
        vr1 vr1Var3 = i.a;
        if (wl7.b(vr1Var2, vr1Var3)) {
            return null;
        }
        vr1 vr1Var4 = i.b;
        if (wl7.b(vr1Var2, vr1Var4)) {
            return null;
        }
        vr1 vr1Var5 = i.e;
        vr1Var2.getClass();
        vr1Var5.getClass();
        if (vr1Var2.v(vr1Var2.h() - vr1Var5.h(), vr1Var5, vr1Var5.h()) && (vr1Var2.h() == 2 || vr1Var2.v(vr1Var2.h() - 3, vr1Var3, 1) || vr1Var2.v(vr1Var2.h() - 3, vr1Var4, 1))) {
            return null;
        }
        int iT = vr1.t(vr1Var2, vr1Var3);
        if (iT == -1) {
            iT = vr1.t(vr1Var2, vr1Var4);
        }
        if (iT == 2 && m() != null) {
            if (vr1Var2.h() == 3) {
                return null;
            }
            return new w5b(vr1.x(vr1Var2, 0, 3, 1));
        }
        if (iT == 1) {
            vr1Var4.getClass();
            if (vr1Var2.v(0, vr1Var4, vr1Var4.h())) {
                return null;
            }
        }
        if (iT != -1 || m() == null) {
            return iT == -1 ? new w5b(vr1Var) : iT == 0 ? new w5b(vr1.x(vr1Var2, 0, 1, 1)) : new w5b(vr1.x(vr1Var2, 0, iT, 1));
        }
        if (vr1Var2.h() == 2) {
            return null;
        }
        return new w5b(vr1.x(vr1Var2, 0, 2, 1));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w5b) && wl7.b(((w5b) obj).a, this.a);
    }

    public final w5b f(w5b w5bVar) {
        w5bVar.getClass();
        vr1 vr1Var = w5bVar.a;
        int iA = i.a(this);
        vr1 vr1Var2 = this.a;
        w5b w5bVar2 = iA == -1 ? null : new w5b(vr1Var2.w(0, iA));
        int iA2 = i.a(w5bVar);
        if (!wl7.b(w5bVar2, iA2 == -1 ? null : new w5b(vr1Var.w(0, iA2)))) {
            h5.l("Paths of different roots cannot be relative to each other: ", this, " and ", w5bVar);
            return null;
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = w5bVar.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && wl7.b(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && vr1Var2.h() == vr1Var.h()) {
            return a.a(".");
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(i.e) != -1) {
            h5.l("Impossible relative path to resolve: ", this, " and ", w5bVar);
            return null;
        }
        if (wl7.b(vr1Var, i.d)) {
            return this;
        }
        zn1 zn1Var = new zn1();
        vr1 vr1VarC = i.c(w5bVar);
        if (vr1VarC == null && (vr1VarC = i.c(this)) == null) {
            vr1VarC = i.f(b);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            zn1Var.o0(i.e);
            zn1Var.o0(vr1VarC);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            zn1Var.o0((vr1) arrayListA.get(i));
            zn1Var.o0(vr1VarC);
            i++;
        }
        return i.d(zn1Var, false);
    }

    public final w5b h(String str) {
        str.getClass();
        zn1 zn1Var = new zn1();
        zn1Var.Q0(str);
        return i.b(this, i.d(zn1Var, false), false);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Character m() {
        vr1 vr1Var = i.a;
        vr1 vr1Var2 = this.a;
        if (vr1.o(vr1Var2, vr1Var) != -1 || vr1Var2.h() < 2 || vr1Var2.r(1) != 58) {
            return null;
        }
        char cR = (char) vr1Var2.r(0);
        if (('a' > cR || cR >= '{') && ('A' > cR || cR >= '[')) {
            return null;
        }
        return Character.valueOf(cR);
    }

    public final File toFile() {
        return new File(this.a.A());
    }

    public final String toString() {
        return this.a.A();
    }
}
