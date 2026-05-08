package defpackage;

import defpackage.wl7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class fa implements fv5, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public fa(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = false;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj;
        return this.isTopLevel == faVar.isTopLevel && this.arity == faVar.arity && this.flags == faVar.flags && wl7.b(this.receiver, faVar.receiver) && wl7.b(this.owner, faVar.owner) && this.name.equals(faVar.name) && this.signature.equals(faVar.signature);
    }

    @Override // defpackage.fv5
    public final int getArity() {
        return this.arity;
    }

    public final int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((akb.d(akb.d((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.name), 31, this.signature) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public final String toString() {
        return fwc.a.i(this);
    }

    public fa(String str) {
        this(0, iv1.NO_RECEIVER, wl7.a.class, "refresh", str, 8);
    }
}
