package defpackage;

import io.jsonwebtoken.JwtParser;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a8e implements Externalizable {
    private static final long serialVersionUID = 0;
    private Map<?, ?> map;

    public a8e() {
        this.map = bs4.a;
    }

    private final Object readResolve() {
        return this.map;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        objectInput.getClass();
        byte b = objectInput.readByte();
        if (b != 0) {
            throw new InvalidObjectException(p6.c(b, "Unsupported flags value: "));
        }
        int i = objectInput.readInt();
        if (i < 0) {
            throw new InvalidObjectException(bg.c(JwtParser.SEPARATOR_CHAR, i, "Illegal size value: "));
        }
        hb9 hb9Var = new hb9(i);
        for (int i2 = 0; i2 < i; i2++) {
            hb9Var.put(objectInput.readObject(), objectInput.readObject());
        }
        this.map = hb9Var.j();
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.map.size());
        for (Map.Entry<?, ?> entry : this.map.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    public a8e(hb9 hb9Var) {
        this.map = hb9Var;
    }
}
