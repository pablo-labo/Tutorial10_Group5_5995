package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dvf<T> implements xd4<T> {
    public final int a;
    public final int b;
    public final af4 c;

    public dvf(int i, af4 af4Var, int i2) {
        this((i2 & 1) != 0 ? 300 : i, 0, (i2 & 4) != 0 ? bf4.a : af4Var);
    }

    @Override // defpackage.yd0
    public final lmg a(lvf lvfVar) {
        return new poa(this.a, this.b, this.c);
    }

    @Override // defpackage.jf5
    public final omg b() {
        return new poa(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dvf) {
            dvf dvfVar = (dvf) obj;
            if (dvfVar.a == this.a && dvfVar.b == this.b && wl7.b(dvfVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.xd4, defpackage.yd0
    public final nmg a(lvf lvfVar) {
        return new poa(this.a, this.b, this.c);
    }

    public dvf(int i, int i2, af4 af4Var) {
        this.a = i;
        this.b = i2;
        this.c = af4Var;
    }
}
