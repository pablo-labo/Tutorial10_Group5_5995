package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class h5d implements kg8 {
    public static final z79<Class<?>, byte[]> j = new z79<>(50);
    public final kt0 b;
    public final kg8 c;
    public final kg8 d;
    public final int e;
    public final int f;
    public final Class<?> g;
    public final ova h;
    public final prf<?> i;

    public h5d(kt0 kt0Var, kg8 kg8Var, kg8 kg8Var2, int i, int i2, prf<?> prfVar, Class<?> cls, ova ovaVar) {
        this.b = kt0Var;
        this.c = kg8Var;
        this.d = kg8Var2;
        this.e = i;
        this.f = i2;
        this.i = prfVar;
        this.g = cls;
        this.h = ovaVar;
    }

    @Override // defpackage.kg8
    public final void b(MessageDigest messageDigest) {
        kt0 kt0Var = this.b;
        byte[] bArr = (byte[]) kt0Var.d();
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        prf<?> prfVar = this.i;
        if (prfVar != null) {
            prfVar.b(messageDigest);
        }
        this.h.b(messageDigest);
        z79<Class<?>, byte[]> z79Var = j;
        Class<?> cls = this.g;
        byte[] bArrA = z79Var.a(cls);
        if (bArrA == null) {
            bArrA = cls.getName().getBytes(kg8.a);
            z79Var.d(cls, bArrA);
        }
        messageDigest.update(bArrA);
        kt0Var.put(bArr);
    }

    @Override // defpackage.kg8
    public final boolean equals(Object obj) {
        if (obj instanceof h5d) {
            h5d h5dVar = (h5d) obj;
            if (this.f == h5dVar.f && this.e == h5dVar.e && xjg.b(this.i, h5dVar.i) && this.g.equals(h5dVar.g) && this.c.equals(h5dVar.c) && this.d.equals(h5dVar.d) && this.h.equals(h5dVar.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kg8
    public final int hashCode() {
        int iHashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        prf<?> prfVar = this.i;
        if (prfVar != null) {
            iHashCode = (iHashCode * 31) + prfVar.hashCode();
        }
        int iHashCode2 = this.g.hashCode();
        return this.h.b.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
