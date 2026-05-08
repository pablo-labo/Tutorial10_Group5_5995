package com.datadog.android.rum.internal.domain.event;

import com.datadog.android.api.InternalLogger;
import defpackage.ab8;
import defpackage.g7;
import defpackage.gu5;
import defpackage.hh2;
import defpackage.wl7;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\r¨\u0006\u000e"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventMeta;", "", "<init>", "()V", "Lab8;", "toJson", "()Lab8;", "", "getType", "()Ljava/lang/String;", "type", "Companion", "View", "Lcom/datadog/android/rum/internal/domain/event/RumEventMeta$View;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class RumEventMeta {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String DOCUMENT_VERSION_KEY = "documentVersion";
    public static final String TYPE_KEY = "type";
    private static final String UNABLE_TO_PARSE_JSON_INTO_META = "Unable to parse json into RUM event meta";
    private static final String UNKNOWN_RUM_EVENT_META_TYPE_ERROR = "Unknown RUM event meta type value [%s]";
    public static final String VIEW_ID_KEY = "viewId";
    public static final String VIEW_TYPE_VALUE = "view";

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\f¨\u0006 "}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventMeta$View;", "Lcom/datadog/android/rum/internal/domain/event/RumEventMeta;", "", RumEventMeta.VIEW_ID_KEY, "", RumEventMeta.DOCUMENT_VERSION_KEY, "<init>", "(Ljava/lang/String;J)V", "Lab8;", "toJson", "()Lab8;", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/datadog/android/rum/internal/domain/event/RumEventMeta$View;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getViewId", "J", "getDocumentVersion", "type", "getType", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class View extends RumEventMeta {
        private final long documentVersion;
        private final String type;
        private final String viewId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public View(String str, long j) {
            super(null);
            str.getClass();
            this.viewId = str;
            this.documentVersion = j;
            this.type = "view";
        }

        public static /* synthetic */ View copy$default(View view, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = view.viewId;
            }
            if ((i & 2) != 0) {
                j = view.documentVersion;
            }
            return view.copy(str, j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getViewId() {
            return this.viewId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getDocumentVersion() {
            return this.documentVersion;
        }

        public final View copy(String viewId, long documentVersion) {
            viewId.getClass();
            return new View(viewId, documentVersion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof View)) {
                return false;
            }
            View view = (View) other;
            return wl7.b(this.viewId, view.viewId) && this.documentVersion == view.documentVersion;
        }

        public final long getDocumentVersion() {
            return this.documentVersion;
        }

        @Override // com.datadog.android.rum.internal.domain.event.RumEventMeta
        public String getType() {
            return this.type;
        }

        public final String getViewId() {
            return this.viewId;
        }

        public int hashCode() {
            return Long.hashCode(this.documentVersion) + (this.viewId.hashCode() * 31);
        }

        @Override // com.datadog.android.rum.internal.domain.event.RumEventMeta
        public ab8 toJson() {
            ab8 json = super.toJson();
            json.l(RumEventMeta.VIEW_ID_KEY, this.viewId);
            json.j(Long.valueOf(this.documentVersion), RumEventMeta.DOCUMENT_VERSION_KEY);
            return json;
        }

        public String toString() {
            return "View(viewId=" + this.viewId + ", documentVersion=" + this.documentVersion + ")";
        }
    }

    public /* synthetic */ RumEventMeta(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getType();

    public ab8 toJson() {
        ab8 ab8Var = new ab8();
        ab8Var.l("type", getType());
        return ab8Var;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/datadog/android/rum/internal/domain/event/RumEventMeta$Companion;", "", "()V", "DOCUMENT_VERSION_KEY", "", "TYPE_KEY", "UNABLE_TO_PARSE_JSON_INTO_META", "UNKNOWN_RUM_EVENT_META_TYPE_ERROR", "VIEW_ID_KEY", "VIEW_TYPE_VALUE", "fromJson", "Lcom/datadog/android/rum/internal/domain/event/RumEventMeta;", "jsonString", "internalLogger", "Lcom/datadog/android/api/InternalLogger;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RumEventMeta fromJson(String jsonString, InternalLogger internalLogger) {
            jsonString.getClass();
            internalLogger.getClass();
            try {
                ab8 ab8VarD = hh2.A(jsonString).d();
                String strG = ab8VarD.m("type").g();
                if (!wl7.b(strG, "view")) {
                    InternalLogger.DefaultImpls.log$default(internalLogger, InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new RumEventMeta$Companion$fromJson$1(strG), (Throwable) null, false, (Map) null, 56, (Object) null);
                    return null;
                }
                String strG2 = ab8VarD.m(RumEventMeta.VIEW_ID_KEY).g();
                long jE = ab8VarD.m(RumEventMeta.DOCUMENT_VERSION_KEY).e();
                strG2.getClass();
                return new View(strG2, jE);
            } catch (ClassCastException e) {
                g7.n(RumEventMeta.UNABLE_TO_PARSE_JSON_INTO_META, e);
                return null;
            } catch (IllegalStateException e2) {
                g7.n(RumEventMeta.UNABLE_TO_PARSE_JSON_INTO_META, e2);
                return null;
            } catch (NullPointerException e3) {
                g7.n(RumEventMeta.UNABLE_TO_PARSE_JSON_INTO_META, e3);
                return null;
            } catch (NumberFormatException e4) {
                g7.n(RumEventMeta.UNABLE_TO_PARSE_JSON_INTO_META, e4);
                return null;
            }
        }

        private Companion() {
        }
    }

    private RumEventMeta() {
    }
}
