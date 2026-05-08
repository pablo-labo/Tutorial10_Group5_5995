package com.google.i18n.phonenumbers;

import defpackage.akb;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean hasCountryCode;
    private boolean hasCountryCodeSource;
    private boolean hasExtension;
    private boolean hasItalianLeadingZero;
    private boolean hasNationalNumber;
    private boolean hasNumberOfLeadingZeros;
    private boolean hasPreferredDomesticCarrierCode;
    private boolean hasRawInput;
    private int countryCode_ = 0;
    private long nationalNumber_ = 0;
    private String extension_ = "";
    private boolean italianLeadingZero_ = false;
    private int numberOfLeadingZeros_ = 1;
    private String rawInput_ = "";
    private String preferredDomesticCarrierCode_ = "";
    private a countryCodeSource_ = a.d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final /* synthetic */ a[] e;

        static {
            a aVar = new a("FROM_NUMBER_WITH_PLUS_SIGN", 0);
            a = aVar;
            a aVar2 = new a("FROM_NUMBER_WITH_IDD", 1);
            b = aVar2;
            a aVar3 = new a("FROM_NUMBER_WITHOUT_PLUS_SIGN", 2);
            a aVar4 = new a("FROM_DEFAULT_COUNTRY", 3);
            c = aVar4;
            a aVar5 = new a("UNSPECIFIED", 4);
            d = aVar5;
            e = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public final int a() {
        return this.countryCode_;
    }

    public final long b() {
        return this.nationalNumber_;
    }

    public final int c() {
        return this.numberOfLeadingZeros_;
    }

    public final boolean d() {
        return this.italianLeadingZero_;
    }

    public final void e(int i) {
        this.hasCountryCode = true;
        this.countryCode_ = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this == bVar) {
            return true;
        }
        return this.countryCode_ == bVar.countryCode_ && this.nationalNumber_ == bVar.nationalNumber_ && this.extension_.equals(bVar.extension_) && this.italianLeadingZero_ == bVar.italianLeadingZero_ && this.numberOfLeadingZeros_ == bVar.numberOfLeadingZeros_ && this.rawInput_.equals(bVar.rawInput_) && this.countryCodeSource_ == bVar.countryCodeSource_ && this.preferredDomesticCarrierCode_.equals(bVar.preferredDomesticCarrierCode_) && this.hasPreferredDomesticCarrierCode == bVar.hasPreferredDomesticCarrierCode;
    }

    public final void f(String str) {
        this.hasExtension = true;
        this.extension_ = str;
    }

    public final void g() {
        this.hasItalianLeadingZero = true;
        this.italianLeadingZero_ = true;
    }

    public final void h(long j) {
        this.hasNationalNumber = true;
        this.nationalNumber_ = j;
    }

    public final int hashCode() {
        return akb.d((this.countryCodeSource_.hashCode() + akb.d((((akb.d((Long.valueOf(this.nationalNumber_).hashCode() + ((2173 + this.countryCode_) * 53)) * 53, 53, this.extension_) + (this.italianLeadingZero_ ? 1231 : 1237)) * 53) + this.numberOfLeadingZeros_) * 53, 53, this.rawInput_)) * 53, 53, this.preferredDomesticCarrierCode_) + (this.hasPreferredDomesticCarrierCode ? 1231 : 1237);
    }

    public final void i(int i) {
        this.hasNumberOfLeadingZeros = true;
        this.numberOfLeadingZeros_ = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.countryCode_);
        sb.append(" National Number: ");
        sb.append(this.nationalNumber_);
        if (this.hasItalianLeadingZero && this.italianLeadingZero_) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.hasNumberOfLeadingZeros) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.numberOfLeadingZeros_);
        }
        if (this.hasExtension) {
            sb.append(" Extension: ");
            sb.append(this.extension_);
        }
        if (this.hasCountryCodeSource) {
            sb.append(" Country Code Source: ");
            sb.append(this.countryCodeSource_);
        }
        if (this.hasPreferredDomesticCarrierCode) {
            sb.append(" Preferred Domestic Carrier Code: ");
            sb.append(this.preferredDomesticCarrierCode_);
        }
        return sb.toString();
    }
}
