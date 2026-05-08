package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class y9b implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean hasDomesticCarrierCodeFormattingRule;
    private boolean hasFormat;
    private boolean hasNationalPrefixFormattingRule;
    private boolean hasNationalPrefixOptionalWhenFormatting;
    private boolean hasPattern;
    private String pattern_ = "";
    private String format_ = "";
    private List<String> leadingDigitsPattern_ = new ArrayList();
    private String nationalPrefixFormattingRule_ = "";
    private boolean nationalPrefixOptionalWhenFormatting_ = false;
    private String domesticCarrierCodeFormattingRule_ = "";

    public final String a(int i) {
        return this.leadingDigitsPattern_.get(i);
    }

    public final int b() {
        return this.leadingDigitsPattern_.size();
    }

    public final String c() {
        return this.nationalPrefixFormattingRule_;
    }

    public final boolean d() {
        return this.nationalPrefixOptionalWhenFormatting_;
    }

    public final String e() {
        return this.pattern_;
    }

    public final boolean f() {
        return this.hasDomesticCarrierCodeFormattingRule;
    }

    public final String getFormat() {
        return this.format_;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        String utf = objectInput.readUTF();
        this.hasPattern = true;
        this.pattern_ = utf;
        String utf2 = objectInput.readUTF();
        this.hasFormat = true;
        this.format_ = utf2;
        int i = objectInput.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.leadingDigitsPattern_.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            String utf3 = objectInput.readUTF();
            this.hasNationalPrefixFormattingRule = true;
            this.nationalPrefixFormattingRule_ = utf3;
        }
        if (objectInput.readBoolean()) {
            String utf4 = objectInput.readUTF();
            this.hasDomesticCarrierCodeFormattingRule = true;
            this.domesticCarrierCodeFormattingRule_ = utf4;
        }
        boolean z = objectInput.readBoolean();
        this.hasNationalPrefixOptionalWhenFormatting = true;
        this.nationalPrefixOptionalWhenFormatting_ = z;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.pattern_);
        objectOutput.writeUTF(this.format_);
        int size = this.leadingDigitsPattern_.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            objectOutput.writeUTF(this.leadingDigitsPattern_.get(i));
        }
        objectOutput.writeBoolean(this.hasNationalPrefixFormattingRule);
        if (this.hasNationalPrefixFormattingRule) {
            objectOutput.writeUTF(this.nationalPrefixFormattingRule_);
        }
        objectOutput.writeBoolean(this.hasDomesticCarrierCodeFormattingRule);
        if (this.hasDomesticCarrierCodeFormattingRule) {
            objectOutput.writeUTF(this.domesticCarrierCodeFormattingRule_);
        }
        objectOutput.writeBoolean(this.nationalPrefixOptionalWhenFormatting_);
    }
}
