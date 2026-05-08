package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class xd3 implements kg8 {
    public final kg8 b;
    public final kg8 c;

    public xd3(kg8 kg8Var, kg8 kg8Var2) {
        this.b = kg8Var;
        this.c = kg8Var2;
    }

    @Override // defpackage.kg8
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.c.b(messageDigest);
    }

    @Override // defpackage.kg8
    public final boolean equals(Object obj) {
        if (obj instanceof xd3) {
            xd3 xd3Var = (xd3) obj;
            if (this.b.equals(xd3Var.b) && this.c.equals(xd3Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kg8
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
