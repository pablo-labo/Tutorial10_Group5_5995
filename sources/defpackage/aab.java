package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class aab implements Externalizable {
    private static final long serialVersionUID = 1;
    private List<z9b> metadata_ = new ArrayList();

    public final List<z9b> a() {
        return this.metadata_;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            z9b z9bVar = new z9b();
            z9bVar.readExternal(objectInput);
            this.metadata_.add(z9bVar);
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        int size = this.metadata_.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            this.metadata_.get(i).writeExternal(objectOutput);
        }
    }
}
