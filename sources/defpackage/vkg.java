package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class vkg implements Comparable<vkg>, Serializable {
    public static final vkg a = new vkg(0, 0);
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    public vkg(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new wkg(this.mostSignificantBits, this.leastSignificantBits);
    }

    @Override // java.lang.Comparable
    public final int compareTo(vkg vkgVar) {
        vkg vkgVar2 = vkgVar;
        vkgVar2.getClass();
        long j = this.mostSignificantBits;
        long j2 = vkgVar2.mostSignificantBits;
        return j != j2 ? Long.compareUnsigned(j, j2) : Long.compareUnsigned(this.leastSignificantBits, vkgVar2.leastSignificantBits);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkg)) {
            return false;
        }
        vkg vkgVar = (vkg) obj;
        return this.mostSignificantBits == vkgVar.mostSignificantBits && this.leastSignificantBits == vkgVar.leastSignificantBits;
    }

    public final int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        nn2.l(this.mostSignificantBits, bArr, 0, 0, 4);
        bArr[8] = 45;
        nn2.l(this.mostSignificantBits, bArr, 9, 4, 6);
        bArr[13] = 45;
        nn2.l(this.mostSignificantBits, bArr, 14, 6, 8);
        bArr[18] = 45;
        nn2.l(this.leastSignificantBits, bArr, 19, 0, 2);
        bArr[23] = 45;
        nn2.l(this.leastSignificantBits, bArr, 24, 2, 8);
        return new String(bArr, a32.b);
    }
}
