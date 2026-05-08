package com.indeed.android.tare.broadcast;

import android.annotation.SuppressLint;
import defpackage.akb;
import defpackage.atd;
import defpackage.boa;
import defpackage.cn0;
import defpackage.db8;
import defpackage.ewa;
import defpackage.fwc;
import defpackage.iwc;
import defpackage.l5;
import defpackage.mve;
import defpackage.o7e;
import defpackage.p7e;
import defpackage.qr0;
import defpackage.qt8;
import defpackage.rna;
import defpackage.u40;
import defpackage.vl2;
import defpackage.vy2;
import defpackage.wl7;
import defpackage.wy2;
import defpackage.yd8;
import defpackage.ym0;
import defpackage.z98;
import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@o7e
@z98(discriminator = "eventType")
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\n\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\t\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent;", "", "<init>", "()V", "", "seen0", "Lp7e;", "serializationConstructorMarker", "(ILp7e;)V", "self", "Lvl2;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lj6g;", "write$Self", "(Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent;Lvl2;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "JsonCallback", "FormCompleted", "ViewWillAppear", "ViewWillDisappear", "UserDidLogout", "DataUpdated", "ApplyStart", "Screenshot", "ApplyFinished", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ApplyFinished;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ApplyStart;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$DataUpdated;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$FormCompleted;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$JsonCallback;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$Screenshot;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$UserDidLogout;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ViewWillAppear;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ViewWillDisappear;", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SuppressLint({"UnsafeOptInUsageError"})
public abstract class JSTBroadcastEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = boa.E(qt8.b, new vy2(5));

    @o7e
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bJ\t\u0010\f\u001a\u00020\rHÖ\u0001¨\u0006\u000e"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$UserDidLogout;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UserDidLogout extends JSTBroadcastEvent {
        public static final UserDidLogout INSTANCE = new UserDidLogout();
        private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = boa.E(qt8.b, new cn0(9));

        private UserDidLogout() {
            super(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return new rna("userDidLogout", INSTANCE, new Annotation[]{new JSTBroadcastEvent$JsonCallback$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("eventType")});
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return $cachedSerializer$delegate.getValue();
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof UserDidLogout);
        }

        public int hashCode() {
            return -556215244;
        }

        public final KSerializer<UserDidLogout> serializer() {
            return get$cachedSerializer();
        }

        public String toString() {
            return "UserDidLogout";
        }
    }

    public /* synthetic */ JSTBroadcastEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _init_$_anonymous_() {
        iwc iwcVar = fwc.a;
        return new atd("com.indeed.android.tare.broadcast.JSTBroadcastEvent", iwcVar.b(JSTBroadcastEvent.class), new yd8[]{iwcVar.b(ApplyFinished.class), iwcVar.b(ApplyStart.class), iwcVar.b(DataUpdated.class), iwcVar.b(FormCompleted.class), iwcVar.b(JsonCallback.class), iwcVar.b(Screenshot.class), iwcVar.b(UserDidLogout.class), iwcVar.b(ViewWillAppear.class), iwcVar.b(ViewWillDisappear.class)}, new KSerializer[]{JSTBroadcastEvent$ApplyFinished$$serializer.INSTANCE, JSTBroadcastEvent$ApplyStart$$serializer.INSTANCE, JSTBroadcastEvent$DataUpdated$$serializer.INSTANCE, JSTBroadcastEvent$FormCompleted$$serializer.INSTANCE, JSTBroadcastEvent$JsonCallback$$serializer.INSTANCE, JSTBroadcastEvent$Screenshot$$serializer.INSTANCE, new rna("userDidLogout", UserDidLogout.INSTANCE, new Annotation[]{new JSTBroadcastEvent$JsonCallback$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("eventType")}), JSTBroadcastEvent$ViewWillAppear$$serializer.INSTANCE, JSTBroadcastEvent$ViewWillDisappear$$serializer.INSTANCE}, new Annotation[]{new JSTBroadcastEvent$JsonCallback$$serializer$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0("eventType")});
    }

    public static final /* synthetic */ void write$Self(JSTBroadcastEvent self, vl2 output, SerialDescriptor serialDesc) {
    }

    @o7e
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006'"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ApplyFinished;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent;", "", "status", "jobKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lp7e;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lp7e;)V", "self", "Lvl2;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lj6g;", "write$Self$tare_release", "(Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ApplyFinished;Lvl2;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ApplyFinished;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatus", "getJobKey", "Companion", "$serializer", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ApplyFinished extends JSTBroadcastEvent {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String jobKey;
        private final String status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ApplyFinished(int i, String str, String str2, p7e p7eVar) {
            super(i, p7eVar);
            if (1 != (i & 1)) {
                ewa.M(i, 1, JSTBroadcastEvent$ApplyFinished$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.status = str;
            if ((i & 2) == 0) {
                this.jobKey = null;
            } else {
                this.jobKey = str2;
            }
        }

        public static /* synthetic */ ApplyFinished copy$default(ApplyFinished applyFinished, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = applyFinished.status;
            }
            if ((i & 2) != 0) {
                str2 = applyFinished.jobKey;
            }
            return applyFinished.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$tare_release(ApplyFinished self, vl2 output, SerialDescriptor serialDesc) {
            JSTBroadcastEvent.write$Self(self, output, serialDesc);
            output.x(serialDesc, 0, self.status);
            if (!output.m(serialDesc) && self.jobKey == null) {
                return;
            }
            output.k(serialDesc, 1, mve.a, self.jobKey);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getJobKey() {
            return this.jobKey;
        }

        public final ApplyFinished copy(String status, String jobKey) {
            status.getClass();
            return new ApplyFinished(status, jobKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApplyFinished)) {
                return false;
            }
            ApplyFinished applyFinished = (ApplyFinished) other;
            return wl7.b(this.status, applyFinished.status) && wl7.b(this.jobKey, applyFinished.jobKey);
        }

        public final String getJobKey() {
            return this.jobKey;
        }

        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iHashCode = this.status.hashCode() * 31;
            String str = this.jobKey;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return akb.k("ApplyFinished(status=", this.status, ", jobKey=", this.jobKey, ")");
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ApplyFinished$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ApplyFinished;", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<ApplyFinished> serializer() {
                return JSTBroadcastEvent$ApplyFinished$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ApplyFinished(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplyFinished(String str, String str2) {
            super(null);
            str.getClass();
            this.status = str;
            this.jobKey = str2;
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ApplyStart;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent;", "Lcom/indeed/android/tare/broadcast/ApplyType;", "applyType", "<init>", "(Lcom/indeed/android/tare/broadcast/ApplyType;)V", "", "seen0", "Lp7e;", "serializationConstructorMarker", "(ILcom/indeed/android/tare/broadcast/ApplyType;Lp7e;)V", "self", "Lvl2;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lj6g;", "write$Self$tare_release", "(Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ApplyStart;Lvl2;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/indeed/android/tare/broadcast/ApplyType;", "copy", "(Lcom/indeed/android/tare/broadcast/ApplyType;)Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ApplyStart;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/indeed/android/tare/broadcast/ApplyType;", "getApplyType", "Companion", "$serializer", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ApplyStart extends JSTBroadcastEvent {
        private final ApplyType applyType;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {boa.E(qt8.b, new wy2(11))};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ApplyStart(int i, ApplyType applyType, p7e p7eVar) {
            super(i, p7eVar);
            if (1 != (i & 1)) {
                ewa.M(i, 1, JSTBroadcastEvent$ApplyStart$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.applyType = applyType;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return ApplyType.INSTANCE.serializer();
        }

        public static /* synthetic */ ApplyStart copy$default(ApplyStart applyStart, ApplyType applyType, int i, Object obj) {
            if ((i & 1) != 0) {
                applyType = applyStart.applyType;
            }
            return applyStart.copy(applyType);
        }

        public static final /* synthetic */ void write$Self$tare_release(ApplyStart self, vl2 output, SerialDescriptor serialDesc) {
            JSTBroadcastEvent.write$Self(self, output, serialDesc);
            output.y(serialDesc, 0, $childSerializers[0].getValue(), self.applyType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ApplyType getApplyType() {
            return this.applyType;
        }

        public final ApplyStart copy(ApplyType applyType) {
            applyType.getClass();
            return new ApplyStart(applyType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ApplyStart) && this.applyType == ((ApplyStart) other).applyType;
        }

        public final ApplyType getApplyType() {
            return this.applyType;
        }

        public int hashCode() {
            return this.applyType.hashCode();
        }

        public String toString() {
            return "ApplyStart(applyType=" + this.applyType + ")";
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ApplyStart$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ApplyStart;", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<ApplyStart> serializer() {
                return JSTBroadcastEvent$ApplyStart$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplyStart(ApplyType applyType) {
            super(null);
            applyType.getClass();
            this.applyType = applyType;
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$DataUpdated;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent;", "Lcom/indeed/android/tare/broadcast/DataName;", "name", "<init>", "(Lcom/indeed/android/tare/broadcast/DataName;)V", "", "seen0", "Lp7e;", "serializationConstructorMarker", "(ILcom/indeed/android/tare/broadcast/DataName;Lp7e;)V", "self", "Lvl2;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lj6g;", "write$Self$tare_release", "(Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$DataUpdated;Lvl2;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/indeed/android/tare/broadcast/DataName;", "copy", "(Lcom/indeed/android/tare/broadcast/DataName;)Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$DataUpdated;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/indeed/android/tare/broadcast/DataName;", "getName", "Companion", "$serializer", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataUpdated extends JSTBroadcastEvent {
        private final DataName name;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {boa.E(qt8.b, new qr0(5))};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DataUpdated(int i, DataName dataName, p7e p7eVar) {
            super(i, p7eVar);
            if (1 != (i & 1)) {
                ewa.M(i, 1, JSTBroadcastEvent$DataUpdated$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.name = dataName;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return DataName.INSTANCE.serializer();
        }

        public static /* synthetic */ DataUpdated copy$default(DataUpdated dataUpdated, DataName dataName, int i, Object obj) {
            if ((i & 1) != 0) {
                dataName = dataUpdated.name;
            }
            return dataUpdated.copy(dataName);
        }

        public static final /* synthetic */ void write$Self$tare_release(DataUpdated self, vl2 output, SerialDescriptor serialDesc) {
            JSTBroadcastEvent.write$Self(self, output, serialDesc);
            output.y(serialDesc, 0, $childSerializers[0].getValue(), self.name);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DataName getName() {
            return this.name;
        }

        public final DataUpdated copy(DataName name) {
            name.getClass();
            return new DataUpdated(name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DataUpdated) && this.name == ((DataUpdated) other).name;
        }

        public final DataName getName() {
            return this.name;
        }

        public int hashCode() {
            return this.name.hashCode();
        }

        public String toString() {
            return "DataUpdated(name=" + this.name + ")";
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$DataUpdated$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$DataUpdated;", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<DataUpdated> serializer() {
                return JSTBroadcastEvent$DataUpdated$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataUpdated(DataName dataName) {
            super(null);
            dataName.getClass();
            this.name = dataName;
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006-"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$FormCompleted;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent;", "", "formName", "formInstanceId", "Lcom/indeed/android/tare/broadcast/FormCompletionResult;", "result", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/indeed/android/tare/broadcast/FormCompletionResult;)V", "", "seen0", "Lp7e;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/indeed/android/tare/broadcast/FormCompletionResult;Lp7e;)V", "self", "Lvl2;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lj6g;", "write$Self$tare_release", "(Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$FormCompleted;Lvl2;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/indeed/android/tare/broadcast/FormCompletionResult;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/indeed/android/tare/broadcast/FormCompletionResult;)Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$FormCompleted;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFormName", "getFormInstanceId", "Lcom/indeed/android/tare/broadcast/FormCompletionResult;", "getResult", "Companion", "$serializer", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FormCompleted extends JSTBroadcastEvent {
        private final String formInstanceId;
        private final String formName;
        private final FormCompletionResult result;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, boa.E(qt8.b, new ym0(9))};

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FormCompleted(int i, String str, String str2, FormCompletionResult formCompletionResult, p7e p7eVar) {
            super(i, p7eVar);
            if (5 != (i & 5)) {
                ewa.M(i, 5, JSTBroadcastEvent$FormCompleted$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.formName = str;
            if ((i & 2) == 0) {
                this.formInstanceId = null;
            } else {
                this.formInstanceId = str2;
            }
            this.result = formCompletionResult;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return FormCompletionResult.INSTANCE.serializer();
        }

        public static /* synthetic */ FormCompleted copy$default(FormCompleted formCompleted, String str, String str2, FormCompletionResult formCompletionResult, int i, Object obj) {
            if ((i & 1) != 0) {
                str = formCompleted.formName;
            }
            if ((i & 2) != 0) {
                str2 = formCompleted.formInstanceId;
            }
            if ((i & 4) != 0) {
                formCompletionResult = formCompleted.result;
            }
            return formCompleted.copy(str, str2, formCompletionResult);
        }

        public static final /* synthetic */ void write$Self$tare_release(FormCompleted self, vl2 output, SerialDescriptor serialDesc) {
            JSTBroadcastEvent.write$Self(self, output, serialDesc);
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            output.x(serialDesc, 0, self.formName);
            if (output.m(serialDesc) || self.formInstanceId != null) {
                output.k(serialDesc, 1, mve.a, self.formInstanceId);
            }
            output.y(serialDesc, 2, lazyArr[2].getValue(), self.result);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFormName() {
            return this.formName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFormInstanceId() {
            return this.formInstanceId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final FormCompletionResult getResult() {
            return this.result;
        }

        public final FormCompleted copy(String formName, String formInstanceId, FormCompletionResult result) {
            formName.getClass();
            result.getClass();
            return new FormCompleted(formName, formInstanceId, result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormCompleted)) {
                return false;
            }
            FormCompleted formCompleted = (FormCompleted) other;
            return wl7.b(this.formName, formCompleted.formName) && wl7.b(this.formInstanceId, formCompleted.formInstanceId) && this.result == formCompleted.result;
        }

        public final String getFormInstanceId() {
            return this.formInstanceId;
        }

        public final String getFormName() {
            return this.formName;
        }

        public final FormCompletionResult getResult() {
            return this.result;
        }

        public int hashCode() {
            int iHashCode = this.formName.hashCode() * 31;
            String str = this.formInstanceId;
            return this.result.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public String toString() {
            String str = this.formName;
            String str2 = this.formInstanceId;
            FormCompletionResult formCompletionResult = this.result;
            StringBuilder sbF = u40.f("FormCompleted(formName=", str, ", formInstanceId=", str2, ", result=");
            sbF.append(formCompletionResult);
            sbF.append(")");
            return sbF.toString();
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$FormCompleted$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$FormCompleted;", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<FormCompleted> serializer() {
                return JSTBroadcastEvent$FormCompleted$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ FormCompleted(String str, String str2, FormCompletionResult formCompletionResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, formCompletionResult);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormCompleted(String str, String str2, FormCompletionResult formCompletionResult) {
            super(null);
            str.getClass();
            formCompletionResult.getClass();
            this.formName = str;
            this.formInstanceId = str2;
            this.result = formCompletionResult;
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006*"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$JsonCallback;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent;", "", "callbackId", "Lkotlinx/serialization/json/JsonObject;", "payload", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lp7e;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Lp7e;)V", "self", "Lvl2;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lj6g;", "write$Self$tare_release", "(Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$JsonCallback;Lvl2;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/JsonObject;", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$JsonCallback;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCallbackId", "Lkotlinx/serialization/json/JsonObject;", "getPayload", "Companion", "$serializer", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JsonCallback extends JSTBroadcastEvent {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String callbackId;
        private final JsonObject payload;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ JsonCallback(int i, String str, JsonObject jsonObject, p7e p7eVar) {
            super(i, p7eVar);
            if (3 != (i & 3)) {
                ewa.M(i, 3, JSTBroadcastEvent$JsonCallback$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.callbackId = str;
            this.payload = jsonObject;
        }

        public static /* synthetic */ JsonCallback copy$default(JsonCallback jsonCallback, String str, JsonObject jsonObject, int i, Object obj) {
            if ((i & 1) != 0) {
                str = jsonCallback.callbackId;
            }
            if ((i & 2) != 0) {
                jsonObject = jsonCallback.payload;
            }
            return jsonCallback.copy(str, jsonObject);
        }

        public static final /* synthetic */ void write$Self$tare_release(JsonCallback self, vl2 output, SerialDescriptor serialDesc) {
            JSTBroadcastEvent.write$Self(self, output, serialDesc);
            output.x(serialDesc, 0, self.callbackId);
            output.k(serialDesc, 1, db8.a, self.payload);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCallbackId() {
            return this.callbackId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final JsonObject getPayload() {
            return this.payload;
        }

        public final JsonCallback copy(String callbackId, JsonObject payload) {
            callbackId.getClass();
            return new JsonCallback(callbackId, payload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JsonCallback)) {
                return false;
            }
            JsonCallback jsonCallback = (JsonCallback) other;
            return wl7.b(this.callbackId, jsonCallback.callbackId) && wl7.b(this.payload, jsonCallback.payload);
        }

        public final String getCallbackId() {
            return this.callbackId;
        }

        public final JsonObject getPayload() {
            return this.payload;
        }

        public int hashCode() {
            int iHashCode = this.callbackId.hashCode() * 31;
            JsonObject jsonObject = this.payload;
            return iHashCode + (jsonObject == null ? 0 : jsonObject.a.hashCode());
        }

        public String toString() {
            return "JsonCallback(callbackId=" + this.callbackId + ", payload=" + this.payload + ")";
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$JsonCallback$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$JsonCallback;", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<JsonCallback> serializer() {
                return JSTBroadcastEvent$JsonCallback$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JsonCallback(String str, JsonObject jsonObject) {
            super(null);
            str.getClass();
            this.callbackId = str;
            this.payload = jsonObject;
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$Screenshot;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent;", "", "screen", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lp7e;", "serializationConstructorMarker", "(ILjava/lang/String;Lp7e;)V", "self", "Lvl2;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lj6g;", "write$Self$tare_release", "(Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$Screenshot;Lvl2;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$Screenshot;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getScreen", "Companion", "$serializer", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Screenshot extends JSTBroadcastEvent {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Screenshot(int i, String str, p7e p7eVar) {
            super(i, p7eVar);
            if (1 != (i & 1)) {
                ewa.M(i, 1, JSTBroadcastEvent$Screenshot$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.screen = str;
        }

        public static /* synthetic */ Screenshot copy$default(Screenshot screenshot, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = screenshot.screen;
            }
            return screenshot.copy(str);
        }

        public static final /* synthetic */ void write$Self$tare_release(Screenshot self, vl2 output, SerialDescriptor serialDesc) {
            JSTBroadcastEvent.write$Self(self, output, serialDesc);
            output.x(serialDesc, 0, self.screen);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getScreen() {
            return this.screen;
        }

        public final Screenshot copy(String screen) {
            screen.getClass();
            return new Screenshot(screen);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Screenshot) && wl7.b(this.screen, ((Screenshot) other).screen);
        }

        public final String getScreen() {
            return this.screen;
        }

        public int hashCode() {
            return this.screen.hashCode();
        }

        public String toString() {
            return l5.m("Screenshot(screen=", this.screen, ")");
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$Screenshot$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$Screenshot;", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<Screenshot> serializer() {
                return JSTBroadcastEvent$Screenshot$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Screenshot(String str) {
            super(null);
            str.getClass();
            this.screen = str;
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006'"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ViewWillAppear;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent;", "", "viewName", "viewInstanceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lp7e;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lp7e;)V", "self", "Lvl2;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lj6g;", "write$Self$tare_release", "(Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ViewWillAppear;Lvl2;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ViewWillAppear;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getViewName", "getViewInstanceId", "Companion", "$serializer", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ViewWillAppear extends JSTBroadcastEvent {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String viewInstanceId;
        private final String viewName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ViewWillAppear(int i, String str, String str2, p7e p7eVar) {
            super(i, p7eVar);
            if (3 != (i & 3)) {
                ewa.M(i, 3, JSTBroadcastEvent$ViewWillAppear$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.viewName = str;
            this.viewInstanceId = str2;
        }

        public static /* synthetic */ ViewWillAppear copy$default(ViewWillAppear viewWillAppear, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = viewWillAppear.viewName;
            }
            if ((i & 2) != 0) {
                str2 = viewWillAppear.viewInstanceId;
            }
            return viewWillAppear.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$tare_release(ViewWillAppear self, vl2 output, SerialDescriptor serialDesc) {
            JSTBroadcastEvent.write$Self(self, output, serialDesc);
            output.x(serialDesc, 0, self.viewName);
            output.x(serialDesc, 1, self.viewInstanceId);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getViewName() {
            return this.viewName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getViewInstanceId() {
            return this.viewInstanceId;
        }

        public final ViewWillAppear copy(String viewName, String viewInstanceId) {
            viewName.getClass();
            viewInstanceId.getClass();
            return new ViewWillAppear(viewName, viewInstanceId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewWillAppear)) {
                return false;
            }
            ViewWillAppear viewWillAppear = (ViewWillAppear) other;
            return wl7.b(this.viewName, viewWillAppear.viewName) && wl7.b(this.viewInstanceId, viewWillAppear.viewInstanceId);
        }

        public final String getViewInstanceId() {
            return this.viewInstanceId;
        }

        public final String getViewName() {
            return this.viewName;
        }

        public int hashCode() {
            return this.viewInstanceId.hashCode() + (this.viewName.hashCode() * 31);
        }

        public String toString() {
            return akb.k("ViewWillAppear(viewName=", this.viewName, ", viewInstanceId=", this.viewInstanceId, ")");
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ViewWillAppear$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ViewWillAppear;", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<ViewWillAppear> serializer() {
                return JSTBroadcastEvent$ViewWillAppear$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewWillAppear(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.viewName = str;
            this.viewInstanceId = str2;
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006'"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ViewWillDisappear;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent;", "", "viewName", "viewInstanceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lp7e;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lp7e;)V", "self", "Lvl2;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lj6g;", "write$Self$tare_release", "(Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ViewWillDisappear;Lvl2;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ViewWillDisappear;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getViewName", "getViewInstanceId", "Companion", "$serializer", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ViewWillDisappear extends JSTBroadcastEvent {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String viewInstanceId;
        private final String viewName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ViewWillDisappear(int i, String str, String str2, p7e p7eVar) {
            super(i, p7eVar);
            if (3 != (i & 3)) {
                ewa.M(i, 3, JSTBroadcastEvent$ViewWillDisappear$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.viewName = str;
            this.viewInstanceId = str2;
        }

        public static /* synthetic */ ViewWillDisappear copy$default(ViewWillDisappear viewWillDisappear, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = viewWillDisappear.viewName;
            }
            if ((i & 2) != 0) {
                str2 = viewWillDisappear.viewInstanceId;
            }
            return viewWillDisappear.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$tare_release(ViewWillDisappear self, vl2 output, SerialDescriptor serialDesc) {
            JSTBroadcastEvent.write$Self(self, output, serialDesc);
            output.x(serialDesc, 0, self.viewName);
            output.x(serialDesc, 1, self.viewInstanceId);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getViewName() {
            return this.viewName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getViewInstanceId() {
            return this.viewInstanceId;
        }

        public final ViewWillDisappear copy(String viewName, String viewInstanceId) {
            viewName.getClass();
            viewInstanceId.getClass();
            return new ViewWillDisappear(viewName, viewInstanceId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewWillDisappear)) {
                return false;
            }
            ViewWillDisappear viewWillDisappear = (ViewWillDisappear) other;
            return wl7.b(this.viewName, viewWillDisappear.viewName) && wl7.b(this.viewInstanceId, viewWillDisappear.viewInstanceId);
        }

        public final String getViewInstanceId() {
            return this.viewInstanceId;
        }

        public final String getViewName() {
            return this.viewName;
        }

        public int hashCode() {
            return this.viewInstanceId.hashCode() + (this.viewName.hashCode() * 31);
        }

        public String toString() {
            return akb.k("ViewWillDisappear(viewName=", this.viewName, ", viewInstanceId=", this.viewInstanceId, ")");
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ViewWillDisappear$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$ViewWillDisappear;", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<ViewWillDisappear> serializer() {
                return JSTBroadcastEvent$ViewWillDisappear$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewWillDisappear(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.viewName = str;
            this.viewInstanceId = str2;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/tare/broadcast/JSTBroadcastEvent;", "tare_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) JSTBroadcastEvent.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<JSTBroadcastEvent> serializer() {
            return get$cachedSerializer();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private JSTBroadcastEvent() {
    }

    public /* synthetic */ JSTBroadcastEvent(int i, p7e p7eVar) {
    }
}
