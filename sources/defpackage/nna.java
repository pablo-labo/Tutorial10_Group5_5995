package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class nna implements kg8 {
    public final Object b;

    public nna(Object obj) {
        beb.e(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.kg8
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(kg8.a));
    }

    @Override // defpackage.kg8
    public final boolean equals(Object obj) {
        if (obj instanceof nna) {
            return this.b.equals(((nna) obj).b);
        }
        return false;
    }

    @Override // defpackage.kg8
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }
}
