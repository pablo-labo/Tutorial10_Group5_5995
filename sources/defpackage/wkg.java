package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: classes3.dex */
public final class wkg implements Externalizable {
    private static final long serialVersionUID = 0;
    private long leastSignificantBits;
    private long mostSignificantBits;

    public wkg(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    private final Object readResolve() {
        long j = this.mostSignificantBits;
        long j2 = this.leastSignificantBits;
        return (j == 0 && j2 == 0) ? vkg.a : new vkg(j, j2);
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        this.mostSignificantBits = objectInput.readLong();
        this.leastSignificantBits = objectInput.readLong();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeLong(this.mostSignificantBits);
        objectOutput.writeLong(this.leastSignificantBits);
    }

    public wkg() {
        this(0L, 0L);
    }
}
