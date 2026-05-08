package com.indeed.android.myjobs.data.model;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.b0;
import defpackage.fe2;
import defpackage.hf2;
import defpackage.hva;
import defpackage.lf2;
import defpackage.oe2;
import defpackage.te2;
import defpackage.w40;
import defpackage.wl7;
import defpackage.xe2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0004\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0004\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0004\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0018\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\"J\u0018\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0004HÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0018\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0018\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0004HÆ\u0003¢\u0006\u0004\b*\u0010\"J\u0018\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0018\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b,\u0010\"J\u0018\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b-\u0010\"J\u0018\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010\"J\u0018\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0004HÆ\u0003¢\u0006\u0004\b/\u0010\"J\u0018\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0004HÆ\u0003¢\u0006\u0004\b0\u0010\"J\u0018\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b1\u0010\"J\u0018\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u0010\"J\u0010\u00103\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b3\u0010%J¼\u0002\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00042\b\b\u0002\u0010\t\u001a\u00020\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00042\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00042\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00042\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b6\u0010%J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010;\u001a\u00020\u00072\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010 R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010\"R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\b\b\u0010\"R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010%R\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\bC\u0010\"R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\bD\u0010\"R\u001f\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\bE\u0010\"R\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\bF\u0010\"R\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\bG\u0010\"R\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bH\u0010\"R\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\bI\u0010\"R\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010?\u001a\u0004\bJ\u0010\"R\u001f\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\bK\u0010\"R\u001f\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010?\u001a\u0004\bL\u0010\"R\u001f\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010?\u001a\u0004\bM\u0010\"R\u001f\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010?\u001a\u0004\bN\u0010\"R\u001f\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010?\u001a\u0004\bO\u0010\"R\u0017\u0010\u001c\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010A\u001a\u0004\bP\u0010%¨\u0006Q"}, d2 = {"Lcom/indeed/android/myjobs/data/model/CancelOrRescheduleUrlParams;", "", "Loe2;", "applyDomain", "Lhva;", "", "source", "", "isSponsored", "jobTitle", "jobCompanyName", "advertiserNumber", "Llf2;", "smartApplyIntegration", "Lhf2;", "standardFields", "Lte2;", "jobIntegration", "jobKey", "jobId", "jobLocation", "jobUri", "Lxe2;", "screenerQuestions", "Lfe2;", "indeedApplyInterviewMeta", "from", "href", "apiToken", "<init>", "(Loe2;Lhva;Lhva;Ljava/lang/String;Lhva;Lhva;Lhva;Lhva;Lhva;Lhva;Lhva;Lhva;Lhva;Lhva;Lhva;Lhva;Lhva;Ljava/lang/String;)V", "component1", "()Loe2;", "component2", "()Lhva;", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Loe2;Lhva;Lhva;Ljava/lang/String;Lhva;Lhva;Lhva;Lhva;Lhva;Lhva;Lhva;Lhva;Lhva;Lhva;Lhva;Lhva;Lhva;Ljava/lang/String;)Lcom/indeed/android/myjobs/data/model/CancelOrRescheduleUrlParams;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Loe2;", "getApplyDomain", "Lhva;", "getSource", "Ljava/lang/String;", "getJobTitle", "getJobCompanyName", "getAdvertiserNumber", "getSmartApplyIntegration", "getStandardFields", "getJobIntegration", "getJobKey", "getJobId", "getJobLocation", "getJobUri", "getScreenerQuestions", "getIndeedApplyInterviewMeta", "getFrom", "getHref", "getApiToken", "myjobs_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CancelOrRescheduleUrlParams {
    public static final int $stable = 8;
    private final hva<String> advertiserNumber;
    private final String apiToken;
    private final oe2 applyDomain;
    private final hva<String> from;
    private final hva<Object> href;
    private final hva<fe2> indeedApplyInterviewMeta;
    private final hva<Boolean> isSponsored;
    private final hva<String> jobCompanyName;
    private final hva<String> jobId;
    private final hva<te2> jobIntegration;
    private final hva<String> jobKey;
    private final hva<String> jobLocation;
    private final String jobTitle;
    private final hva<Object> jobUri;
    private final hva<xe2> screenerQuestions;
    private final hva<lf2> smartApplyIntegration;
    private final hva<String> source;
    private final hva<hf2> standardFields;

    public /* synthetic */ CancelOrRescheduleUrlParams(oe2 oe2Var, hva hvaVar, hva hvaVar2, String str, hva hvaVar3, hva hvaVar4, hva hvaVar5, hva hvaVar6, hva hvaVar7, hva hvaVar8, hva hvaVar9, hva hvaVar10, hva hvaVar11, hva hvaVar12, hva hvaVar13, hva hvaVar14, hva hvaVar15, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oe2Var, (i & 2) != 0 ? hva.a.a : hvaVar, (i & 4) != 0 ? hva.a.a : hvaVar2, str, (i & 16) != 0 ? hva.a.a : hvaVar3, (i & 32) != 0 ? hva.a.a : hvaVar4, (i & 64) != 0 ? hva.a.a : hvaVar5, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? hva.a.a : hvaVar6, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? hva.a.a : hvaVar7, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? hva.a.a : hvaVar8, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? hva.a.a : hvaVar9, (i & 2048) != 0 ? hva.a.a : hvaVar10, (i & 4096) != 0 ? hva.a.a : hvaVar11, (i & 8192) != 0 ? hva.a.a : hvaVar12, (i & 16384) != 0 ? hva.a.a : hvaVar13, (32768 & i) != 0 ? hva.a.a : hvaVar14, (i & 65536) != 0 ? hva.a.a : hvaVar15, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CancelOrRescheduleUrlParams copy$default(CancelOrRescheduleUrlParams cancelOrRescheduleUrlParams, oe2 oe2Var, hva hvaVar, hva hvaVar2, String str, hva hvaVar3, hva hvaVar4, hva hvaVar5, hva hvaVar6, hva hvaVar7, hva hvaVar8, hva hvaVar9, hva hvaVar10, hva hvaVar11, hva hvaVar12, hva hvaVar13, hva hvaVar14, hva hvaVar15, String str2, int i, Object obj) {
        String str3;
        hva hvaVar16;
        oe2 oe2Var2 = (i & 1) != 0 ? cancelOrRescheduleUrlParams.applyDomain : oe2Var;
        hva hvaVar17 = (i & 2) != 0 ? cancelOrRescheduleUrlParams.source : hvaVar;
        hva hvaVar18 = (i & 4) != 0 ? cancelOrRescheduleUrlParams.isSponsored : hvaVar2;
        String str4 = (i & 8) != 0 ? cancelOrRescheduleUrlParams.jobTitle : str;
        hva hvaVar19 = (i & 16) != 0 ? cancelOrRescheduleUrlParams.jobCompanyName : hvaVar3;
        hva hvaVar20 = (i & 32) != 0 ? cancelOrRescheduleUrlParams.advertiserNumber : hvaVar4;
        hva hvaVar21 = (i & 64) != 0 ? cancelOrRescheduleUrlParams.smartApplyIntegration : hvaVar5;
        hva hvaVar22 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? cancelOrRescheduleUrlParams.standardFields : hvaVar6;
        hva hvaVar23 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? cancelOrRescheduleUrlParams.jobIntegration : hvaVar7;
        hva hvaVar24 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? cancelOrRescheduleUrlParams.jobKey : hvaVar8;
        hva hvaVar25 = (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? cancelOrRescheduleUrlParams.jobId : hvaVar9;
        hva hvaVar26 = (i & 2048) != 0 ? cancelOrRescheduleUrlParams.jobLocation : hvaVar10;
        hva hvaVar27 = (i & 4096) != 0 ? cancelOrRescheduleUrlParams.jobUri : hvaVar11;
        hva hvaVar28 = (i & 8192) != 0 ? cancelOrRescheduleUrlParams.screenerQuestions : hvaVar12;
        oe2 oe2Var3 = oe2Var2;
        hva hvaVar29 = (i & 16384) != 0 ? cancelOrRescheduleUrlParams.indeedApplyInterviewMeta : hvaVar13;
        hva hvaVar30 = (i & 32768) != 0 ? cancelOrRescheduleUrlParams.from : hvaVar14;
        hva hvaVar31 = (i & 65536) != 0 ? cancelOrRescheduleUrlParams.href : hvaVar15;
        if ((i & 131072) != 0) {
            hvaVar16 = hvaVar31;
            str3 = cancelOrRescheduleUrlParams.apiToken;
        } else {
            str3 = str2;
            hvaVar16 = hvaVar31;
        }
        return cancelOrRescheduleUrlParams.copy(oe2Var3, hvaVar17, hvaVar18, str4, hvaVar19, hvaVar20, hvaVar21, hvaVar22, hvaVar23, hvaVar24, hvaVar25, hvaVar26, hvaVar27, hvaVar28, hvaVar29, hvaVar30, hvaVar16, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final oe2 getApplyDomain() {
        return this.applyDomain;
    }

    public final hva<String> component10() {
        return this.jobKey;
    }

    public final hva<String> component11() {
        return this.jobId;
    }

    public final hva<String> component12() {
        return this.jobLocation;
    }

    public final hva<Object> component13() {
        return this.jobUri;
    }

    public final hva<xe2> component14() {
        return this.screenerQuestions;
    }

    public final hva<fe2> component15() {
        return this.indeedApplyInterviewMeta;
    }

    public final hva<String> component16() {
        return this.from;
    }

    public final hva<Object> component17() {
        return this.href;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getApiToken() {
        return this.apiToken;
    }

    public final hva<String> component2() {
        return this.source;
    }

    public final hva<Boolean> component3() {
        return this.isSponsored;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getJobTitle() {
        return this.jobTitle;
    }

    public final hva<String> component5() {
        return this.jobCompanyName;
    }

    public final hva<String> component6() {
        return this.advertiserNumber;
    }

    public final hva<lf2> component7() {
        return this.smartApplyIntegration;
    }

    public final hva<hf2> component8() {
        return this.standardFields;
    }

    public final hva<te2> component9() {
        return this.jobIntegration;
    }

    public final CancelOrRescheduleUrlParams copy(oe2 applyDomain, hva<String> source, hva<Boolean> isSponsored, String jobTitle, hva<String> jobCompanyName, hva<String> advertiserNumber, hva<lf2> smartApplyIntegration, hva<hf2> standardFields, hva<te2> jobIntegration, hva<String> jobKey, hva<String> jobId, hva<String> jobLocation, hva<? extends Object> jobUri, hva<xe2> screenerQuestions, hva<fe2> indeedApplyInterviewMeta, hva<String> from, hva<? extends Object> href, String apiToken) {
        applyDomain.getClass();
        source.getClass();
        isSponsored.getClass();
        jobTitle.getClass();
        jobCompanyName.getClass();
        advertiserNumber.getClass();
        smartApplyIntegration.getClass();
        standardFields.getClass();
        jobIntegration.getClass();
        jobKey.getClass();
        jobId.getClass();
        jobLocation.getClass();
        jobUri.getClass();
        screenerQuestions.getClass();
        indeedApplyInterviewMeta.getClass();
        from.getClass();
        href.getClass();
        apiToken.getClass();
        return new CancelOrRescheduleUrlParams(applyDomain, source, isSponsored, jobTitle, jobCompanyName, advertiserNumber, smartApplyIntegration, standardFields, jobIntegration, jobKey, jobId, jobLocation, jobUri, screenerQuestions, indeedApplyInterviewMeta, from, href, apiToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelOrRescheduleUrlParams)) {
            return false;
        }
        CancelOrRescheduleUrlParams cancelOrRescheduleUrlParams = (CancelOrRescheduleUrlParams) other;
        return this.applyDomain == cancelOrRescheduleUrlParams.applyDomain && wl7.b(this.source, cancelOrRescheduleUrlParams.source) && wl7.b(this.isSponsored, cancelOrRescheduleUrlParams.isSponsored) && wl7.b(this.jobTitle, cancelOrRescheduleUrlParams.jobTitle) && wl7.b(this.jobCompanyName, cancelOrRescheduleUrlParams.jobCompanyName) && wl7.b(this.advertiserNumber, cancelOrRescheduleUrlParams.advertiserNumber) && wl7.b(this.smartApplyIntegration, cancelOrRescheduleUrlParams.smartApplyIntegration) && wl7.b(this.standardFields, cancelOrRescheduleUrlParams.standardFields) && wl7.b(this.jobIntegration, cancelOrRescheduleUrlParams.jobIntegration) && wl7.b(this.jobKey, cancelOrRescheduleUrlParams.jobKey) && wl7.b(this.jobId, cancelOrRescheduleUrlParams.jobId) && wl7.b(this.jobLocation, cancelOrRescheduleUrlParams.jobLocation) && wl7.b(this.jobUri, cancelOrRescheduleUrlParams.jobUri) && wl7.b(this.screenerQuestions, cancelOrRescheduleUrlParams.screenerQuestions) && wl7.b(this.indeedApplyInterviewMeta, cancelOrRescheduleUrlParams.indeedApplyInterviewMeta) && wl7.b(this.from, cancelOrRescheduleUrlParams.from) && wl7.b(this.href, cancelOrRescheduleUrlParams.href) && wl7.b(this.apiToken, cancelOrRescheduleUrlParams.apiToken);
    }

    public final hva<String> getAdvertiserNumber() {
        return this.advertiserNumber;
    }

    public final String getApiToken() {
        return this.apiToken;
    }

    public final oe2 getApplyDomain() {
        return this.applyDomain;
    }

    public final hva<String> getFrom() {
        return this.from;
    }

    public final hva<Object> getHref() {
        return this.href;
    }

    public final hva<fe2> getIndeedApplyInterviewMeta() {
        return this.indeedApplyInterviewMeta;
    }

    public final hva<String> getJobCompanyName() {
        return this.jobCompanyName;
    }

    public final hva<String> getJobId() {
        return this.jobId;
    }

    public final hva<te2> getJobIntegration() {
        return this.jobIntegration;
    }

    public final hva<String> getJobKey() {
        return this.jobKey;
    }

    public final hva<String> getJobLocation() {
        return this.jobLocation;
    }

    public final String getJobTitle() {
        return this.jobTitle;
    }

    public final hva<Object> getJobUri() {
        return this.jobUri;
    }

    public final hva<xe2> getScreenerQuestions() {
        return this.screenerQuestions;
    }

    public final hva<lf2> getSmartApplyIntegration() {
        return this.smartApplyIntegration;
    }

    public final hva<String> getSource() {
        return this.source;
    }

    public final hva<hf2> getStandardFields() {
        return this.standardFields;
    }

    public int hashCode() {
        return this.apiToken.hashCode() + b0.e(this.href, b0.e(this.from, b0.e(this.indeedApplyInterviewMeta, b0.e(this.screenerQuestions, b0.e(this.jobUri, b0.e(this.jobLocation, b0.e(this.jobId, b0.e(this.jobKey, b0.e(this.jobIntegration, b0.e(this.standardFields, b0.e(this.smartApplyIntegration, b0.e(this.advertiserNumber, b0.e(this.jobCompanyName, akb.d(b0.e(this.isSponsored, b0.e(this.source, this.applyDomain.hashCode() * 31, 31), 31), 31, this.jobTitle), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final hva<Boolean> isSponsored() {
        return this.isSponsored;
    }

    public String toString() {
        oe2 oe2Var = this.applyDomain;
        hva<String> hvaVar = this.source;
        hva<Boolean> hvaVar2 = this.isSponsored;
        String str = this.jobTitle;
        hva<String> hvaVar3 = this.jobCompanyName;
        hva<String> hvaVar4 = this.advertiserNumber;
        hva<lf2> hvaVar5 = this.smartApplyIntegration;
        hva<hf2> hvaVar6 = this.standardFields;
        hva<te2> hvaVar7 = this.jobIntegration;
        hva<String> hvaVar8 = this.jobKey;
        hva<String> hvaVar9 = this.jobId;
        hva<String> hvaVar10 = this.jobLocation;
        hva<Object> hvaVar11 = this.jobUri;
        hva<xe2> hvaVar12 = this.screenerQuestions;
        hva<fe2> hvaVar13 = this.indeedApplyInterviewMeta;
        hva<String> hvaVar14 = this.from;
        hva<Object> hvaVar15 = this.href;
        String str2 = this.apiToken;
        StringBuilder sb = new StringBuilder("CancelOrRescheduleUrlParams(applyDomain=");
        sb.append(oe2Var);
        sb.append(", source=");
        sb.append(hvaVar);
        sb.append(", isSponsored=");
        sb.append(hvaVar2);
        sb.append(", jobTitle=");
        sb.append(str);
        sb.append(", jobCompanyName=");
        w40.o(sb, hvaVar3, ", advertiserNumber=", hvaVar4, ", smartApplyIntegration=");
        w40.o(sb, hvaVar5, ", standardFields=", hvaVar6, ", jobIntegration=");
        w40.o(sb, hvaVar7, ", jobKey=", hvaVar8, ", jobId=");
        w40.o(sb, hvaVar9, ", jobLocation=", hvaVar10, ", jobUri=");
        w40.o(sb, hvaVar11, ", screenerQuestions=", hvaVar12, ", indeedApplyInterviewMeta=");
        w40.o(sb, hvaVar13, ", from=", hvaVar14, ", href=");
        sb.append(hvaVar15);
        sb.append(", apiToken=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public CancelOrRescheduleUrlParams(oe2 oe2Var, hva<String> hvaVar, hva<Boolean> hvaVar2, String str, hva<String> hvaVar3, hva<String> hvaVar4, hva<lf2> hvaVar5, hva<hf2> hvaVar6, hva<te2> hvaVar7, hva<String> hvaVar8, hva<String> hvaVar9, hva<String> hvaVar10, hva<? extends Object> hvaVar11, hva<xe2> hvaVar12, hva<fe2> hvaVar13, hva<String> hvaVar14, hva<? extends Object> hvaVar15, String str2) {
        oe2Var.getClass();
        hvaVar.getClass();
        hvaVar2.getClass();
        str.getClass();
        hvaVar3.getClass();
        hvaVar4.getClass();
        hvaVar5.getClass();
        hvaVar6.getClass();
        hvaVar7.getClass();
        hvaVar8.getClass();
        hvaVar9.getClass();
        hvaVar10.getClass();
        hvaVar11.getClass();
        hvaVar12.getClass();
        hvaVar13.getClass();
        hvaVar14.getClass();
        hvaVar15.getClass();
        str2.getClass();
        this.applyDomain = oe2Var;
        this.source = hvaVar;
        this.isSponsored = hvaVar2;
        this.jobTitle = str;
        this.jobCompanyName = hvaVar3;
        this.advertiserNumber = hvaVar4;
        this.smartApplyIntegration = hvaVar5;
        this.standardFields = hvaVar6;
        this.jobIntegration = hvaVar7;
        this.jobKey = hvaVar8;
        this.jobId = hvaVar9;
        this.jobLocation = hvaVar10;
        this.jobUri = hvaVar11;
        this.screenerQuestions = hvaVar12;
        this.indeedApplyInterviewMeta = hvaVar13;
        this.from = hvaVar14;
        this.href = hvaVar15;
        this.apiToken = str2;
    }
}
