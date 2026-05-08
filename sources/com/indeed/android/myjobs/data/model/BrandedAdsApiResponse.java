package com.indeed.android.myjobs.data.model;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.ia;
import defpackage.l6;
import defpackage.u40;
import defpackage.w20;
import defpackage.wl7;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b7\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J½\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017¨\u0006@"}, d2 = {"Lcom/indeed/android/myjobs/data/model/BrandedAdsApiResponse;", "", "creativeKey", "", "mobtk", "fccKey", "flowPage", "flowType", "imageUrl", "logoUrl", "gotoUrl", "gotoText", "trackingPixel", "companyName", "companyDescription", "companyRating", "numReviews", "advParentCompanyName", "targetingCriteria", "logLabel", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreativeKey", "()Ljava/lang/String;", "getMobtk", "getFccKey", "getFlowPage", "getFlowType", "getImageUrl", "getLogoUrl", "getGotoUrl", "getGotoText", "getTrackingPixel", "getCompanyName", "getCompanyDescription", "getCompanyRating", "getNumReviews", "getAdvParentCompanyName", "getTargetingCriteria", "getLogLabel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "equals", "", "other", "hashCode", "", "toString", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BrandedAdsApiResponse {
    public static final int $stable = 0;
    private final String advParentCompanyName;
    private final String companyDescription;
    private final String companyName;
    private final String companyRating;
    private final String creativeKey;
    private final String fccKey;
    private final String flowPage;
    private final String flowType;
    private final String gotoText;
    private final String gotoUrl;
    private final String imageUrl;
    private final String logLabel;
    private final String logoUrl;
    private final String mobtk;
    private final String numReviews;
    private final String targetingCriteria;
    private final String trackingPixel;

    public BrandedAdsApiResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        w20.p(str, str2, str3, str4, str5);
        w20.p(str6, str8, str9, str11, str12);
        str16.getClass();
        str17.getClass();
        this.creativeKey = str;
        this.mobtk = str2;
        this.fccKey = str3;
        this.flowPage = str4;
        this.flowType = str5;
        this.imageUrl = str6;
        this.logoUrl = str7;
        this.gotoUrl = str8;
        this.gotoText = str9;
        this.trackingPixel = str10;
        this.companyName = str11;
        this.companyDescription = str12;
        this.companyRating = str13;
        this.numReviews = str14;
        this.advParentCompanyName = str15;
        this.targetingCriteria = str16;
        this.logLabel = str17;
    }

    public static /* synthetic */ BrandedAdsApiResponse copy$default(BrandedAdsApiResponse brandedAdsApiResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, Object obj) {
        String str18;
        String str19;
        String str20;
        BrandedAdsApiResponse brandedAdsApiResponse2;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        String str35 = (i & 1) != 0 ? brandedAdsApiResponse.creativeKey : str;
        String str36 = (i & 2) != 0 ? brandedAdsApiResponse.mobtk : str2;
        String str37 = (i & 4) != 0 ? brandedAdsApiResponse.fccKey : str3;
        String str38 = (i & 8) != 0 ? brandedAdsApiResponse.flowPage : str4;
        String str39 = (i & 16) != 0 ? brandedAdsApiResponse.flowType : str5;
        String str40 = (i & 32) != 0 ? brandedAdsApiResponse.imageUrl : str6;
        String str41 = (i & 64) != 0 ? brandedAdsApiResponse.logoUrl : str7;
        String str42 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? brandedAdsApiResponse.gotoUrl : str8;
        String str43 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? brandedAdsApiResponse.gotoText : str9;
        String str44 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? brandedAdsApiResponse.trackingPixel : str10;
        String str45 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? brandedAdsApiResponse.companyName : str11;
        String str46 = (i & 2048) != 0 ? brandedAdsApiResponse.companyDescription : str12;
        String str47 = (i & 4096) != 0 ? brandedAdsApiResponse.companyRating : str13;
        String str48 = (i & 8192) != 0 ? brandedAdsApiResponse.numReviews : str14;
        String str49 = str35;
        String str50 = (i & 16384) != 0 ? brandedAdsApiResponse.advParentCompanyName : str15;
        String str51 = (i & 32768) != 0 ? brandedAdsApiResponse.targetingCriteria : str16;
        if ((i & 65536) != 0) {
            str19 = str51;
            str18 = brandedAdsApiResponse.logLabel;
            str21 = str50;
            str22 = str36;
            str23 = str37;
            str24 = str38;
            str25 = str39;
            str26 = str40;
            str27 = str41;
            str28 = str42;
            str29 = str43;
            str30 = str44;
            str31 = str45;
            str32 = str46;
            str33 = str47;
            str34 = str48;
            str20 = str49;
            brandedAdsApiResponse2 = brandedAdsApiResponse;
        } else {
            str18 = str17;
            str19 = str51;
            str20 = str49;
            brandedAdsApiResponse2 = brandedAdsApiResponse;
            str21 = str50;
            str22 = str36;
            str23 = str37;
            str24 = str38;
            str25 = str39;
            str26 = str40;
            str27 = str41;
            str28 = str42;
            str29 = str43;
            str30 = str44;
            str31 = str45;
            str32 = str46;
            str33 = str47;
            str34 = str48;
        }
        return brandedAdsApiResponse2.copy(str20, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str21, str19, str18);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCreativeKey() {
        return this.creativeKey;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTrackingPixel() {
        return this.trackingPixel;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCompanyDescription() {
        return this.companyDescription;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCompanyRating() {
        return this.companyRating;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getNumReviews() {
        return this.numReviews;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getAdvParentCompanyName() {
        return this.advParentCompanyName;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTargetingCriteria() {
        return this.targetingCriteria;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getLogLabel() {
        return this.logLabel;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMobtk() {
        return this.mobtk;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFccKey() {
        return this.fccKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFlowPage() {
        return this.flowPage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFlowType() {
        return this.flowType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getGotoUrl() {
        return this.gotoUrl;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getGotoText() {
        return this.gotoText;
    }

    public final BrandedAdsApiResponse copy(String creativeKey, String mobtk, String fccKey, String flowPage, String flowType, String imageUrl, String logoUrl, String gotoUrl, String gotoText, String trackingPixel, String companyName, String companyDescription, String companyRating, String numReviews, String advParentCompanyName, String targetingCriteria, String logLabel) {
        w20.p(creativeKey, mobtk, fccKey, flowPage, flowType);
        w20.p(imageUrl, gotoUrl, gotoText, companyName, companyDescription);
        targetingCriteria.getClass();
        logLabel.getClass();
        return new BrandedAdsApiResponse(creativeKey, mobtk, fccKey, flowPage, flowType, imageUrl, logoUrl, gotoUrl, gotoText, trackingPixel, companyName, companyDescription, companyRating, numReviews, advParentCompanyName, targetingCriteria, logLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrandedAdsApiResponse)) {
            return false;
        }
        BrandedAdsApiResponse brandedAdsApiResponse = (BrandedAdsApiResponse) other;
        return wl7.b(this.creativeKey, brandedAdsApiResponse.creativeKey) && wl7.b(this.mobtk, brandedAdsApiResponse.mobtk) && wl7.b(this.fccKey, brandedAdsApiResponse.fccKey) && wl7.b(this.flowPage, brandedAdsApiResponse.flowPage) && wl7.b(this.flowType, brandedAdsApiResponse.flowType) && wl7.b(this.imageUrl, brandedAdsApiResponse.imageUrl) && wl7.b(this.logoUrl, brandedAdsApiResponse.logoUrl) && wl7.b(this.gotoUrl, brandedAdsApiResponse.gotoUrl) && wl7.b(this.gotoText, brandedAdsApiResponse.gotoText) && wl7.b(this.trackingPixel, brandedAdsApiResponse.trackingPixel) && wl7.b(this.companyName, brandedAdsApiResponse.companyName) && wl7.b(this.companyDescription, brandedAdsApiResponse.companyDescription) && wl7.b(this.companyRating, brandedAdsApiResponse.companyRating) && wl7.b(this.numReviews, brandedAdsApiResponse.numReviews) && wl7.b(this.advParentCompanyName, brandedAdsApiResponse.advParentCompanyName) && wl7.b(this.targetingCriteria, brandedAdsApiResponse.targetingCriteria) && wl7.b(this.logLabel, brandedAdsApiResponse.logLabel);
    }

    public final String getAdvParentCompanyName() {
        return this.advParentCompanyName;
    }

    public final String getCompanyDescription() {
        return this.companyDescription;
    }

    public final String getCompanyName() {
        return this.companyName;
    }

    public final String getCompanyRating() {
        return this.companyRating;
    }

    public final String getCreativeKey() {
        return this.creativeKey;
    }

    public final String getFccKey() {
        return this.fccKey;
    }

    public final String getFlowPage() {
        return this.flowPage;
    }

    public final String getFlowType() {
        return this.flowType;
    }

    public final String getGotoText() {
        return this.gotoText;
    }

    public final String getGotoUrl() {
        return this.gotoUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLogLabel() {
        return this.logLabel;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getMobtk() {
        return this.mobtk;
    }

    public final String getNumReviews() {
        return this.numReviews;
    }

    public final String getTargetingCriteria() {
        return this.targetingCriteria;
    }

    public final String getTrackingPixel() {
        return this.trackingPixel;
    }

    public int hashCode() {
        int iD = akb.d(akb.d(akb.d(akb.d(akb.d(this.creativeKey.hashCode() * 31, 31, this.mobtk), 31, this.fccKey), 31, this.flowPage), 31, this.flowType), 31, this.imageUrl);
        String str = this.logoUrl;
        int iD2 = akb.d(akb.d((iD + (str == null ? 0 : str.hashCode())) * 31, 31, this.gotoUrl), 31, this.gotoText);
        String str2 = this.trackingPixel;
        int iD3 = akb.d(akb.d((iD2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.companyName), 31, this.companyDescription);
        String str3 = this.companyRating;
        int iHashCode = (iD3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.numReviews;
        int iHashCode2 = (iHashCode + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.advParentCompanyName;
        return this.logLabel.hashCode() + akb.d((iHashCode2 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.targetingCriteria);
    }

    public String toString() {
        String str = this.creativeKey;
        String str2 = this.mobtk;
        String str3 = this.fccKey;
        String str4 = this.flowPage;
        String str5 = this.flowType;
        String str6 = this.imageUrl;
        String str7 = this.logoUrl;
        String str8 = this.gotoUrl;
        String str9 = this.gotoText;
        String str10 = this.trackingPixel;
        String str11 = this.companyName;
        String str12 = this.companyDescription;
        String str13 = this.companyRating;
        String str14 = this.numReviews;
        String str15 = this.advParentCompanyName;
        String str16 = this.targetingCriteria;
        String str17 = this.logLabel;
        StringBuilder sbF = u40.f("BrandedAdsApiResponse(creativeKey=", str, ", mobtk=", str2, ", fccKey=");
        ia.r(sbF, str3, ", flowPage=", str4, ", flowType=");
        ia.r(sbF, str5, ", imageUrl=", str6, ", logoUrl=");
        ia.r(sbF, str7, ", gotoUrl=", str8, ", gotoText=");
        ia.r(sbF, str9, ", trackingPixel=", str10, ", companyName=");
        ia.r(sbF, str11, ", companyDescription=", str12, ", companyRating=");
        ia.r(sbF, str13, ", numReviews=", str14, ", advParentCompanyName=");
        ia.r(sbF, str15, ", targetingCriteria=", str16, ", logLabel=");
        return l6.i(sbF, str17, ")");
    }
}
