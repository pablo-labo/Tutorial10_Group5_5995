package com.datadog.android.rum.internal.domain;

import com.datadog.android.rum.internal.domain.event.RumEventMeta;
import com.datadog.android.rum.internal.domain.scope.RumSessionScope;
import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.ia;
import defpackage.k6;
import defpackage.lc9;
import defpackage.o6;
import defpackage.u40;
import defpackage.wl7;
import defpackage.z3;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b*\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0080\b\u0018\u0000 C2\u00020\u0001:\u0001CB§\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0010HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0014HÆ\u0003J\t\u00101\u001a\u00020\u0014HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\t\u0010:\u001a\u00020\u000eHÆ\u0003J«\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0006HÆ\u0001J\u0013\u0010<\u001a\u00020\u00062\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\u0014\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010AJ\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0015\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019¨\u0006D"}, d2 = {"Lcom/datadog/android/rum/internal/domain/RumContext;", "", "applicationId", "", RumSessionScope.RUM_SESSION_ID_BUS_MESSAGE_KEY, "isSessionActive", "", RumEventMeta.VIEW_ID_KEY, "viewName", "viewUrl", "actionId", "sessionState", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "sessionStartReason", "Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "viewType", "Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;", "syntheticsTestId", "syntheticsResultId", "viewTimestamp", "", "viewTimestampOffset", "hasReplay", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;Ljava/lang/String;Ljava/lang/String;JJZ)V", "getActionId", "()Ljava/lang/String;", "getApplicationId", "getHasReplay", "()Z", "getSessionId", "getSessionStartReason", "()Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$StartReason;", "getSessionState", "()Lcom/datadog/android/rum/internal/domain/scope/RumSessionScope$State;", "getSyntheticsResultId", "getSyntheticsTestId", "getViewId", "getViewName", "getViewTimestamp", "()J", "getViewTimestampOffset", "getViewType", "()Lcom/datadog/android/rum/internal/domain/scope/RumViewScope$RumViewType;", "getViewUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toMap", "", "toString", "Companion", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class RumContext {
    public static final String ACTION_ID = "action_id";
    public static final String APPLICATION_ID = "application_id";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String HAS_REPLAY = "view_has_replay";
    private static final String NULL_UUID;
    public static final String SESSION_ACTIVE = "session_active";
    public static final String SESSION_ID = "session_id";
    public static final String SESSION_START_REASON = "session_start_reason";
    public static final String SESSION_STATE = "session_state";
    public static final String SYNTHETICS_RESULT_ID = "synthetics_result_id";
    public static final String SYNTHETICS_TEST_ID = "synthetics_test_id";
    public static final String VIEW_ID = "view_id";
    public static final String VIEW_NAME = "view_name";
    public static final String VIEW_TIMESTAMP = "view_timestamp";
    public static final String VIEW_TIMESTAMP_OFFSET = "view_timestamp_offset";
    public static final String VIEW_TYPE = "view_type";
    public static final String VIEW_URL = "view_url";
    private final String actionId;
    private final String applicationId;
    private final boolean hasReplay;
    private final boolean isSessionActive;
    private final String sessionId;
    private final RumSessionScope.StartReason sessionStartReason;
    private final RumSessionScope.State sessionState;
    private final String syntheticsResultId;
    private final String syntheticsTestId;
    private final String viewId;
    private final String viewName;
    private final long viewTimestamp;
    private final long viewTimestampOffset;
    private final RumViewScope.RumViewType viewType;
    private final String viewUrl;

    static {
        String string = new UUID(0L, 0L).toString();
        string.getClass();
        NULL_UUID = string;
    }

    public /* synthetic */ RumContext(String str, String str2, boolean z, String str3, String str4, String str5, String str6, RumSessionScope.State state, RumSessionScope.StartReason startReason, RumViewScope.RumViewType rumViewType, String str7, String str8, long j, long j2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NULL_UUID : str, (i & 2) != 0 ? NULL_UUID : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? RumSessionScope.State.NOT_TRACKED : state, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? RumSessionScope.StartReason.USER_APP_LAUNCH : startReason, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? RumViewScope.RumViewType.NONE : rumViewType, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : str7, (i & 2048) == 0 ? str8 : null, (i & 4096) != 0 ? 0L : j, (i & 8192) == 0 ? j2 : 0L, (i & 16384) != 0 ? false : z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplicationId() {
        return this.applicationId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final RumViewScope.RumViewType getViewType() {
        return this.viewType;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getSyntheticsTestId() {
        return this.syntheticsTestId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSyntheticsResultId() {
        return this.syntheticsResultId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getViewTimestamp() {
        return this.viewTimestamp;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getViewTimestampOffset() {
        return this.viewTimestampOffset;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getHasReplay() {
        return this.hasReplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSessionActive() {
        return this.isSessionActive;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getViewId() {
        return this.viewId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getViewName() {
        return this.viewName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getViewUrl() {
        return this.viewUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final RumSessionScope.State getSessionState() {
        return this.sessionState;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final RumSessionScope.StartReason getSessionStartReason() {
        return this.sessionStartReason;
    }

    public final RumContext copy(String applicationId, String sessionId, boolean isSessionActive, String viewId, String viewName, String viewUrl, String actionId, RumSessionScope.State sessionState, RumSessionScope.StartReason sessionStartReason, RumViewScope.RumViewType viewType, String syntheticsTestId, String syntheticsResultId, long viewTimestamp, long viewTimestampOffset, boolean hasReplay) {
        applicationId.getClass();
        sessionId.getClass();
        sessionState.getClass();
        sessionStartReason.getClass();
        viewType.getClass();
        return new RumContext(applicationId, sessionId, isSessionActive, viewId, viewName, viewUrl, actionId, sessionState, sessionStartReason, viewType, syntheticsTestId, syntheticsResultId, viewTimestamp, viewTimestampOffset, hasReplay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RumContext)) {
            return false;
        }
        RumContext rumContext = (RumContext) other;
        return wl7.b(this.applicationId, rumContext.applicationId) && wl7.b(this.sessionId, rumContext.sessionId) && this.isSessionActive == rumContext.isSessionActive && wl7.b(this.viewId, rumContext.viewId) && wl7.b(this.viewName, rumContext.viewName) && wl7.b(this.viewUrl, rumContext.viewUrl) && wl7.b(this.actionId, rumContext.actionId) && this.sessionState == rumContext.sessionState && this.sessionStartReason == rumContext.sessionStartReason && this.viewType == rumContext.viewType && wl7.b(this.syntheticsTestId, rumContext.syntheticsTestId) && wl7.b(this.syntheticsResultId, rumContext.syntheticsResultId) && this.viewTimestamp == rumContext.viewTimestamp && this.viewTimestampOffset == rumContext.viewTimestampOffset && this.hasReplay == rumContext.hasReplay;
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final boolean getHasReplay() {
        return this.hasReplay;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final RumSessionScope.StartReason getSessionStartReason() {
        return this.sessionStartReason;
    }

    public final RumSessionScope.State getSessionState() {
        return this.sessionState;
    }

    public final String getSyntheticsResultId() {
        return this.syntheticsResultId;
    }

    public final String getSyntheticsTestId() {
        return this.syntheticsTestId;
    }

    public final String getViewId() {
        return this.viewId;
    }

    public final String getViewName() {
        return this.viewName;
    }

    public final long getViewTimestamp() {
        return this.viewTimestamp;
    }

    public final long getViewTimestampOffset() {
        return this.viewTimestampOffset;
    }

    public final RumViewScope.RumViewType getViewType() {
        return this.viewType;
    }

    public final String getViewUrl() {
        return this.viewUrl;
    }

    public int hashCode() {
        int iF = ia.f(akb.d(this.applicationId.hashCode() * 31, 31, this.sessionId), 31, this.isSessionActive);
        String str = this.viewId;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.viewName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.viewUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionId;
        int iHashCode4 = (this.viewType.hashCode() + ((this.sessionStartReason.hashCode() + ((this.sessionState.hashCode() + ((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str5 = this.syntheticsTestId;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.syntheticsResultId;
        return Boolean.hashCode(this.hasReplay) + ia.d(ia.d((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.viewTimestamp), 31, this.viewTimestampOffset);
    }

    public final boolean isSessionActive() {
        return this.isSessionActive;
    }

    public final Map<String, Object> toMap() {
        return lc9.a0(new Pair("application_id", this.applicationId), new Pair("session_id", this.sessionId), new Pair(SESSION_ACTIVE, Boolean.valueOf(this.isSessionActive)), new Pair(SESSION_STATE, this.sessionState.getAsString()), new Pair(SESSION_START_REASON, this.sessionStartReason.getAsString()), new Pair(VIEW_ID, this.viewId), new Pair(VIEW_NAME, this.viewName), new Pair(VIEW_URL, this.viewUrl), new Pair(VIEW_TYPE, this.viewType.getAsString()), new Pair(ACTION_ID, this.actionId), new Pair(SYNTHETICS_TEST_ID, this.syntheticsTestId), new Pair(SYNTHETICS_RESULT_ID, this.syntheticsResultId), new Pair(VIEW_TIMESTAMP, Long.valueOf(this.viewTimestamp)), new Pair(HAS_REPLAY, Boolean.valueOf(this.hasReplay)), new Pair(VIEW_TIMESTAMP_OFFSET, Long.valueOf(this.viewTimestampOffset)));
    }

    public String toString() {
        String str = this.applicationId;
        String str2 = this.sessionId;
        boolean z = this.isSessionActive;
        String str3 = this.viewId;
        String str4 = this.viewName;
        String str5 = this.viewUrl;
        String str6 = this.actionId;
        RumSessionScope.State state = this.sessionState;
        RumSessionScope.StartReason startReason = this.sessionStartReason;
        RumViewScope.RumViewType rumViewType = this.viewType;
        String str7 = this.syntheticsTestId;
        String str8 = this.syntheticsResultId;
        long j = this.viewTimestamp;
        long j2 = this.viewTimestampOffset;
        boolean z2 = this.hasReplay;
        StringBuilder sbF = u40.f("RumContext(applicationId=", str, ", sessionId=", str2, ", isSessionActive=");
        k6.k(", viewId=", str3, ", viewName=", sbF, z);
        ia.r(sbF, str4, ", viewUrl=", str5, ", actionId=");
        sbF.append(str6);
        sbF.append(", sessionState=");
        sbF.append(state);
        sbF.append(", sessionStartReason=");
        sbF.append(startReason);
        sbF.append(", viewType=");
        sbF.append(rumViewType);
        sbF.append(", syntheticsTestId=");
        ia.r(sbF, str7, ", syntheticsResultId=", str8, ", viewTimestamp=");
        sbF.append(j);
        o6.p(sbF, ", viewTimestampOffset=", j2, ", hasReplay=");
        return z3.o(sbF, z2, ")");
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0016\u001a\u00020\u00172\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/internal/domain/RumContext$Companion;", "", "()V", "ACTION_ID", "", "APPLICATION_ID", "HAS_REPLAY", "NULL_UUID", "getNULL_UUID", "()Ljava/lang/String;", "SESSION_ACTIVE", "SESSION_ID", "SESSION_START_REASON", "SESSION_STATE", "SYNTHETICS_RESULT_ID", "SYNTHETICS_TEST_ID", "VIEW_ID", "VIEW_NAME", "VIEW_TIMESTAMP", "VIEW_TIMESTAMP_OFFSET", "VIEW_TYPE", "VIEW_URL", "fromFeatureContext", "Lcom/datadog/android/rum/internal/domain/RumContext;", "featureContext", "", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RumContext fromFeatureContext(Map<String, ? extends Object> featureContext) {
            featureContext.getClass();
            Object obj = featureContext.get("application_id");
            String null_uuid = obj instanceof String ? (String) obj : null;
            Object obj2 = featureContext.get("session_id");
            String null_uuid2 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = featureContext.get(RumContext.SESSION_ACTIVE);
            Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
            RumSessionScope.State.Companion companion = RumSessionScope.State.Companion;
            Object obj4 = featureContext.get(RumContext.SESSION_STATE);
            RumSessionScope.State stateFromString = companion.fromString(obj4 instanceof String ? (String) obj4 : null);
            RumSessionScope.StartReason.Companion companion2 = RumSessionScope.StartReason.Companion;
            Object obj5 = featureContext.get(RumContext.SESSION_START_REASON);
            RumSessionScope.StartReason startReasonFromString = companion2.fromString(obj5 instanceof String ? (String) obj5 : null);
            Object obj6 = featureContext.get(RumContext.VIEW_ID);
            String str = obj6 instanceof String ? (String) obj6 : null;
            Object obj7 = featureContext.get(RumContext.VIEW_NAME);
            String str2 = obj7 instanceof String ? (String) obj7 : null;
            Object obj8 = featureContext.get(RumContext.VIEW_URL);
            String str3 = obj8 instanceof String ? (String) obj8 : null;
            RumViewScope.RumViewType.Companion companion3 = RumViewScope.RumViewType.Companion;
            Object obj9 = featureContext.get(RumContext.VIEW_TYPE);
            RumViewScope.RumViewType rumViewTypeFromString = companion3.fromString(obj9 instanceof String ? (String) obj9 : null);
            Object obj10 = featureContext.get(RumContext.ACTION_ID);
            String str4 = obj10 instanceof String ? (String) obj10 : null;
            Object obj11 = featureContext.get(RumContext.SYNTHETICS_TEST_ID);
            String str5 = obj11 instanceof String ? (String) obj11 : null;
            Object obj12 = featureContext.get(RumContext.SYNTHETICS_RESULT_ID);
            String str6 = obj12 instanceof String ? (String) obj12 : null;
            Object obj13 = featureContext.get(RumContext.HAS_REPLAY);
            Boolean bool2 = obj13 instanceof Boolean ? (Boolean) obj13 : null;
            boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
            Object obj14 = featureContext.get(RumContext.VIEW_TIMESTAMP);
            Long l = obj14 instanceof Long ? (Long) obj14 : null;
            long jLongValue = l != null ? l.longValue() : 0L;
            Object obj15 = featureContext.get(RumContext.VIEW_TIMESTAMP_OFFSET);
            Long l2 = obj15 instanceof Long ? (Long) obj15 : null;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            if (null_uuid == null) {
                null_uuid = getNULL_UUID();
            }
            if (null_uuid2 == null) {
                null_uuid2 = getNULL_UUID();
            }
            String str7 = null_uuid2;
            boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
            if (stateFromString == null) {
                stateFromString = RumSessionScope.State.NOT_TRACKED;
            }
            RumSessionScope.State state = stateFromString;
            if (startReasonFromString == null) {
                startReasonFromString = RumSessionScope.StartReason.USER_APP_LAUNCH;
            }
            RumSessionScope.StartReason startReason = startReasonFromString;
            if (rumViewTypeFromString == null) {
                rumViewTypeFromString = RumViewScope.RumViewType.NONE;
            }
            return new RumContext(null_uuid, str7, zBooleanValue2, str, str2, str3, str4, state, startReason, rumViewTypeFromString, str5, str6, jLongValue, jLongValue2, zBooleanValue);
        }

        public final String getNULL_UUID() {
            return RumContext.NULL_UUID;
        }

        private Companion() {
        }
    }

    public RumContext(String str, String str2, boolean z, String str3, String str4, String str5, String str6, RumSessionScope.State state, RumSessionScope.StartReason startReason, RumViewScope.RumViewType rumViewType, String str7, String str8, long j, long j2, boolean z2) {
        str.getClass();
        str2.getClass();
        state.getClass();
        startReason.getClass();
        rumViewType.getClass();
        this.applicationId = str;
        this.sessionId = str2;
        this.isSessionActive = z;
        this.viewId = str3;
        this.viewName = str4;
        this.viewUrl = str5;
        this.actionId = str6;
        this.sessionState = state;
        this.sessionStartReason = startReason;
        this.viewType = rumViewType;
        this.syntheticsTestId = str7;
        this.syntheticsResultId = str8;
        this.viewTimestamp = j;
        this.viewTimestampOffset = j2;
        this.hasReplay = z2;
    }

    public RumContext() {
        this(null, null, false, null, null, null, null, null, null, null, null, null, 0L, 0L, false, 32767, null);
    }
}
