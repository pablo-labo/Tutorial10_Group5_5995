package defpackage;

import io.jsonwebtoken.JwtParser;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class z7e implements Externalizable {
    private static final long serialVersionUID = 0;
    private Collection<?> collection;
    private final int tag;

    public z7e(int i, Collection collection) {
        this.collection = collection;
        this.tag = i;
    }

    private final Object readResolve() {
        return this.collection;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Collection<?> collectionL;
        objectInput.getClass();
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException(bg.c(JwtParser.SEPARATOR_CHAR, b, "Unsupported flags value: "));
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException(bg.c(JwtParser.SEPARATOR_CHAR, i2, "Illegal size value: "));
        }
        int i3 = 0;
        if (i == 0) {
            iy8 iy8Var = new iy8(i2);
            while (i3 < i2) {
                iy8Var.add(objectInput.readObject());
                i3++;
            }
            collectionL = iy8Var.l();
        } else {
            if (i != 1) {
                throw new InvalidObjectException(bg.c(JwtParser.SEPARATOR_CHAR, i, "Unsupported collection type tag: "));
            }
            fae faeVar = new fae(i2);
            while (i3 < i2) {
                faeVar.add(objectInput.readObject());
                i3++;
            }
            collectionL = faeVar.b();
        }
        this.collection = collectionL;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        Iterator<?> it = this.collection.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public z7e() {
        this(0, zr4.a);
    }
}
