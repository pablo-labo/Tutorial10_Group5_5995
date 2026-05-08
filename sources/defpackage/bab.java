package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bab implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean hasExampleNumber;
    private boolean hasNationalNumberPattern;
    private String nationalNumberPattern_ = "";
    private List<Integer> possibleLength_ = new ArrayList();
    private List<Integer> possibleLengthLocalOnly_ = new ArrayList();
    private String exampleNumber_ = "";

    public final String a() {
        return this.nationalNumberPattern_;
    }

    public final int b() {
        return this.possibleLength_.get(0).intValue();
    }

    public final int c() {
        return this.possibleLength_.size();
    }

    public final List<Integer> d() {
        return this.possibleLength_;
    }

    public final List<Integer> e() {
        return this.possibleLengthLocalOnly_;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.hasNationalNumberPattern = true;
            this.nationalNumberPattern_ = utf;
        }
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.possibleLength_.add(Integer.valueOf(objectInput.readInt()));
        }
        int i3 = objectInput.readInt();
        for (int i4 = 0; i4 < i3; i4++) {
            this.possibleLengthLocalOnly_.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.hasExampleNumber = true;
            this.exampleNumber_ = utf2;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.hasNationalNumberPattern);
        if (this.hasNationalNumberPattern) {
            objectOutput.writeUTF(this.nationalNumberPattern_);
        }
        int size = this.possibleLength_.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeInt(this.possibleLength_.get(i).intValue());
        }
        int size2 = this.possibleLengthLocalOnly_.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            objectOutput.writeInt(this.possibleLengthLocalOnly_.get(i2).intValue());
        }
        objectOutput.writeBoolean(this.hasExampleNumber);
        if (this.hasExampleNumber) {
            objectOutput.writeUTF(this.exampleNumber_);
        }
    }
}
