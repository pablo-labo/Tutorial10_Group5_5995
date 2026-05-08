package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class z9b implements Externalizable {
    private static final long serialVersionUID = 1;
    private boolean hasCarrierSpecific;
    private boolean hasCountryCode;
    private boolean hasEmergency;
    private boolean hasFixedLine;
    private boolean hasGeneralDesc;
    private boolean hasId;
    private boolean hasInternationalPrefix;
    private boolean hasLeadingDigits;
    private boolean hasLeadingZeroPossible;
    private boolean hasMainCountryForCode;
    private boolean hasMobile;
    private boolean hasMobileNumberPortableRegion;
    private boolean hasNationalPrefix;
    private boolean hasNationalPrefixForParsing;
    private boolean hasNationalPrefixTransformRule;
    private boolean hasNoInternationalDialling;
    private boolean hasPager;
    private boolean hasPersonalNumber;
    private boolean hasPreferredExtnPrefix;
    private boolean hasPreferredInternationalPrefix;
    private boolean hasPremiumRate;
    private boolean hasSameMobileAndFixedLinePattern;
    private boolean hasSharedCost;
    private boolean hasShortCode;
    private boolean hasSmsServices;
    private boolean hasStandardRate;
    private boolean hasTollFree;
    private boolean hasUan;
    private boolean hasVoicemail;
    private boolean hasVoip;
    private bab generalDesc_ = null;
    private bab fixedLine_ = null;
    private bab mobile_ = null;
    private bab tollFree_ = null;
    private bab premiumRate_ = null;
    private bab sharedCost_ = null;
    private bab personalNumber_ = null;
    private bab voip_ = null;
    private bab pager_ = null;
    private bab uan_ = null;
    private bab emergency_ = null;
    private bab voicemail_ = null;
    private bab shortCode_ = null;
    private bab standardRate_ = null;
    private bab carrierSpecific_ = null;
    private bab smsServices_ = null;
    private bab noInternationalDialling_ = null;
    private String id_ = "";
    private int countryCode_ = 0;
    private String internationalPrefix_ = "";
    private String preferredInternationalPrefix_ = "";
    private String nationalPrefix_ = "";
    private String preferredExtnPrefix_ = "";
    private String nationalPrefixForParsing_ = "";
    private String nationalPrefixTransformRule_ = "";
    private boolean sameMobileAndFixedLinePattern_ = false;
    private List<y9b> numberFormat_ = new ArrayList();
    private List<y9b> intlNumberFormat_ = new ArrayList();
    private boolean mainCountryForCode_ = false;
    private String leadingDigits_ = "";
    private boolean leadingZeroPossible_ = false;
    private boolean mobileNumberPortableRegion_ = false;

    public static final class a extends z9b {
        public final void A() {
            super.y("NA");
        }

        public final void z() {
            super.x("<ignored>");
        }
    }

    public final int a() {
        return this.countryCode_;
    }

    public final bab b() {
        return this.fixedLine_;
    }

    public final bab c() {
        return this.generalDesc_;
    }

    public final String d() {
        return this.id_;
    }

    public final String e() {
        return this.internationalPrefix_;
    }

    public final int f() {
        return this.intlNumberFormat_.size();
    }

    public final List<y9b> g() {
        return this.intlNumberFormat_;
    }

    public final String h() {
        return this.leadingDigits_;
    }

    public final bab i() {
        return this.mobile_;
    }

    public final String j() {
        return this.nationalPrefixForParsing_;
    }

    public final String k() {
        return this.nationalPrefixTransformRule_;
    }

    public final List<y9b> l() {
        return this.numberFormat_;
    }

    public final bab m() {
        return this.pager_;
    }

    public final bab n() {
        return this.personalNumber_;
    }

    public final bab o() {
        return this.premiumRate_;
    }

    public final boolean p() {
        return this.sameMobileAndFixedLinePattern_;
    }

    public final bab q() {
        return this.sharedCost_;
    }

    public final bab r() {
        return this.tollFree_;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            bab babVar = new bab();
            babVar.readExternal(objectInput);
            this.hasGeneralDesc = true;
            this.generalDesc_ = babVar;
        }
        if (objectInput.readBoolean()) {
            bab babVar2 = new bab();
            babVar2.readExternal(objectInput);
            this.hasFixedLine = true;
            this.fixedLine_ = babVar2;
        }
        if (objectInput.readBoolean()) {
            bab babVar3 = new bab();
            babVar3.readExternal(objectInput);
            this.hasMobile = true;
            this.mobile_ = babVar3;
        }
        if (objectInput.readBoolean()) {
            bab babVar4 = new bab();
            babVar4.readExternal(objectInput);
            this.hasTollFree = true;
            this.tollFree_ = babVar4;
        }
        if (objectInput.readBoolean()) {
            bab babVar5 = new bab();
            babVar5.readExternal(objectInput);
            this.hasPremiumRate = true;
            this.premiumRate_ = babVar5;
        }
        if (objectInput.readBoolean()) {
            bab babVar6 = new bab();
            babVar6.readExternal(objectInput);
            this.hasSharedCost = true;
            this.sharedCost_ = babVar6;
        }
        if (objectInput.readBoolean()) {
            bab babVar7 = new bab();
            babVar7.readExternal(objectInput);
            this.hasPersonalNumber = true;
            this.personalNumber_ = babVar7;
        }
        if (objectInput.readBoolean()) {
            bab babVar8 = new bab();
            babVar8.readExternal(objectInput);
            this.hasVoip = true;
            this.voip_ = babVar8;
        }
        if (objectInput.readBoolean()) {
            bab babVar9 = new bab();
            babVar9.readExternal(objectInput);
            this.hasPager = true;
            this.pager_ = babVar9;
        }
        if (objectInput.readBoolean()) {
            bab babVar10 = new bab();
            babVar10.readExternal(objectInput);
            this.hasUan = true;
            this.uan_ = babVar10;
        }
        if (objectInput.readBoolean()) {
            bab babVar11 = new bab();
            babVar11.readExternal(objectInput);
            this.hasEmergency = true;
            this.emergency_ = babVar11;
        }
        if (objectInput.readBoolean()) {
            bab babVar12 = new bab();
            babVar12.readExternal(objectInput);
            this.hasVoicemail = true;
            this.voicemail_ = babVar12;
        }
        if (objectInput.readBoolean()) {
            bab babVar13 = new bab();
            babVar13.readExternal(objectInput);
            this.hasShortCode = true;
            this.shortCode_ = babVar13;
        }
        if (objectInput.readBoolean()) {
            bab babVar14 = new bab();
            babVar14.readExternal(objectInput);
            this.hasStandardRate = true;
            this.standardRate_ = babVar14;
        }
        if (objectInput.readBoolean()) {
            bab babVar15 = new bab();
            babVar15.readExternal(objectInput);
            this.hasCarrierSpecific = true;
            this.carrierSpecific_ = babVar15;
        }
        if (objectInput.readBoolean()) {
            bab babVar16 = new bab();
            babVar16.readExternal(objectInput);
            this.hasSmsServices = true;
            this.smsServices_ = babVar16;
        }
        if (objectInput.readBoolean()) {
            bab babVar17 = new bab();
            babVar17.readExternal(objectInput);
            this.hasNoInternationalDialling = true;
            this.noInternationalDialling_ = babVar17;
        }
        x(objectInput.readUTF());
        int i = objectInput.readInt();
        this.hasCountryCode = true;
        this.countryCode_ = i;
        y(objectInput.readUTF());
        if (objectInput.readBoolean()) {
            String utf = objectInput.readUTF();
            this.hasPreferredInternationalPrefix = true;
            this.preferredInternationalPrefix_ = utf;
        }
        if (objectInput.readBoolean()) {
            String utf2 = objectInput.readUTF();
            this.hasNationalPrefix = true;
            this.nationalPrefix_ = utf2;
        }
        if (objectInput.readBoolean()) {
            String utf3 = objectInput.readUTF();
            this.hasPreferredExtnPrefix = true;
            this.preferredExtnPrefix_ = utf3;
        }
        if (objectInput.readBoolean()) {
            String utf4 = objectInput.readUTF();
            this.hasNationalPrefixForParsing = true;
            this.nationalPrefixForParsing_ = utf4;
        }
        if (objectInput.readBoolean()) {
            String utf5 = objectInput.readUTF();
            this.hasNationalPrefixTransformRule = true;
            this.nationalPrefixTransformRule_ = utf5;
        }
        boolean z = objectInput.readBoolean();
        this.hasSameMobileAndFixedLinePattern = true;
        this.sameMobileAndFixedLinePattern_ = z;
        int i2 = objectInput.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            y9b y9bVar = new y9b();
            y9bVar.readExternal(objectInput);
            this.numberFormat_.add(y9bVar);
        }
        int i4 = objectInput.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            y9b y9bVar2 = new y9b();
            y9bVar2.readExternal(objectInput);
            this.intlNumberFormat_.add(y9bVar2);
        }
        boolean z2 = objectInput.readBoolean();
        this.hasMainCountryForCode = true;
        this.mainCountryForCode_ = z2;
        if (objectInput.readBoolean()) {
            String utf6 = objectInput.readUTF();
            this.hasLeadingDigits = true;
            this.leadingDigits_ = utf6;
        }
        boolean z3 = objectInput.readBoolean();
        this.hasLeadingZeroPossible = true;
        this.leadingZeroPossible_ = z3;
        boolean z4 = objectInput.readBoolean();
        this.hasMobileNumberPortableRegion = true;
        this.mobileNumberPortableRegion_ = z4;
    }

    public final bab s() {
        return this.uan_;
    }

    public final bab t() {
        return this.voicemail_;
    }

    public final bab u() {
        return this.voip_;
    }

    public final boolean v() {
        return this.hasLeadingDigits;
    }

    public final boolean w() {
        return this.hasNationalPrefixForParsing;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.hasGeneralDesc);
        if (this.hasGeneralDesc) {
            this.generalDesc_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasFixedLine);
        if (this.hasFixedLine) {
            this.fixedLine_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasMobile);
        if (this.hasMobile) {
            this.mobile_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasTollFree);
        if (this.hasTollFree) {
            this.tollFree_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPremiumRate);
        if (this.hasPremiumRate) {
            this.premiumRate_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasSharedCost);
        if (this.hasSharedCost) {
            this.sharedCost_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPersonalNumber);
        if (this.hasPersonalNumber) {
            this.personalNumber_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoip);
        if (this.hasVoip) {
            this.voip_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasPager);
        if (this.hasPager) {
            this.pager_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasUan);
        if (this.hasUan) {
            this.uan_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasEmergency);
        if (this.hasEmergency) {
            this.emergency_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasVoicemail);
        if (this.hasVoicemail) {
            this.voicemail_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasShortCode);
        if (this.hasShortCode) {
            this.shortCode_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasStandardRate);
        if (this.hasStandardRate) {
            this.standardRate_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasCarrierSpecific);
        if (this.hasCarrierSpecific) {
            this.carrierSpecific_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasSmsServices);
        if (this.hasSmsServices) {
            this.smsServices_.writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.hasNoInternationalDialling);
        if (this.hasNoInternationalDialling) {
            this.noInternationalDialling_.writeExternal(objectOutput);
        }
        objectOutput.writeUTF(this.id_);
        objectOutput.writeInt(this.countryCode_);
        objectOutput.writeUTF(this.internationalPrefix_);
        objectOutput.writeBoolean(this.hasPreferredInternationalPrefix);
        if (this.hasPreferredInternationalPrefix) {
            objectOutput.writeUTF(this.preferredInternationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefix);
        if (this.hasNationalPrefix) {
            objectOutput.writeUTF(this.nationalPrefix_);
        }
        objectOutput.writeBoolean(this.hasPreferredExtnPrefix);
        if (this.hasPreferredExtnPrefix) {
            objectOutput.writeUTF(this.preferredExtnPrefix_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixForParsing);
        if (this.hasNationalPrefixForParsing) {
            objectOutput.writeUTF(this.nationalPrefixForParsing_);
        }
        objectOutput.writeBoolean(this.hasNationalPrefixTransformRule);
        if (this.hasNationalPrefixTransformRule) {
            objectOutput.writeUTF(this.nationalPrefixTransformRule_);
        }
        objectOutput.writeBoolean(this.sameMobileAndFixedLinePattern_);
        int size = this.numberFormat_.size();
        objectOutput.writeInt(size);
        for (int i = 0; i < size; i++) {
            this.numberFormat_.get(i).writeExternal(objectOutput);
        }
        int size2 = this.intlNumberFormat_.size();
        objectOutput.writeInt(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            this.intlNumberFormat_.get(i2).writeExternal(objectOutput);
        }
        objectOutput.writeBoolean(this.mainCountryForCode_);
        objectOutput.writeBoolean(this.hasLeadingDigits);
        if (this.hasLeadingDigits) {
            objectOutput.writeUTF(this.leadingDigits_);
        }
        objectOutput.writeBoolean(this.leadingZeroPossible_);
        objectOutput.writeBoolean(this.mobileNumberPortableRegion_);
    }

    public void x(String str) {
        this.hasId = true;
        this.id_ = str;
    }

    public void y(String str) {
        this.hasInternationalPrefix = true;
        this.internationalPrefix_ = str;
    }
}
