package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zt4 implements kg8 {
    public final Object b;
    public final int c;
    public final int d;
    public final Class<?> e;
    public final Class<?> f;
    public final kg8 g;
    public final Map<Class<?>, prf<?>> h;
    public final ova i;
    public int j;

    public zt4(Object obj, kg8 kg8Var, int i, int i2, Map<Class<?>, prf<?>> map, Class<?> cls, Class<?> cls2, ova ovaVar) {
        beb.e(obj, "Argument must not be null");
        this.b = obj;
        beb.e(kg8Var, "Signature must not be null");
        this.g = kg8Var;
        this.c = i;
        this.d = i2;
        beb.e(map, "Argument must not be null");
        this.h = map;
        beb.e(cls, "Resource class must not be null");
        this.e = cls;
        beb.e(cls2, "Transcode class must not be null");
        this.f = cls2;
        beb.e(ovaVar, "Argument must not be null");
        this.i = ovaVar;
    }

    @Override // defpackage.kg8
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.kg8
    public final boolean equals(Object obj) {
        if (obj instanceof zt4) {
            zt4 zt4Var = (zt4) obj;
            if (this.b.equals(zt4Var.b) && this.g.equals(zt4Var.g) && this.d == zt4Var.d && this.c == zt4Var.c && this.h.equals(zt4Var.h) && this.e.equals(zt4Var.e) && this.f.equals(zt4Var.f) && this.i.equals(zt4Var.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kg8
    public final int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.b.hashCode();
            this.j = iHashCode;
            int iHashCode2 = ((((this.g.hashCode() + (iHashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = iHashCode2;
            int iHashCode3 = this.h.hashCode() + (iHashCode2 * 31);
            this.j = iHashCode3;
            int iHashCode4 = this.e.hashCode() + (iHashCode3 * 31);
            this.j = iHashCode4;
            int iHashCode5 = this.f.hashCode() + (iHashCode4 * 31);
            this.j = iHashCode5;
            this.j = this.i.b.hashCode() + (iHashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
