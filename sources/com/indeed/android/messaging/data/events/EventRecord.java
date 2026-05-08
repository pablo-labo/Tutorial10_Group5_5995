package com.indeed.android.messaging.data.events;

import android.webkit.MimeTypeMap;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.aw4;
import defpackage.boa;
import defpackage.cp0;
import defpackage.dp0;
import defpackage.ewa;
import defpackage.gy2;
import defpackage.ia;
import defpackage.mve;
import defpackage.o7e;
import defpackage.ojh;
import defpackage.p7e;
import defpackage.q6;
import defpackage.qt8;
import defpackage.u40;
import defpackage.vl2;
import defpackage.wl7;
import defpackage.wve;
import defpackage.zr4;
import java.io.File;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001:\u0007NOPQRSTB\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b&\u0010#J\u0010\u0010'\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001cJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b/\u00100J \u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u001cJ\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020\t2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b@\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\b\n\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010%R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\b\r\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\bF\u0010\u001cR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010:\u001a\u0004\bG\u0010\u001cR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010H\u001a\u0004\bI\u0010,R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bK\u0010.R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010L\u001a\u0004\bM\u00100¨\u0006U"}, d2 = {"Lcom/indeed/android/messaging/data/events/EventRecord;", "", "", "id", "Lcom/indeed/android/messaging/data/events/EventRecord$EventType;", "type", "Lcom/indeed/android/messaging/data/events/EventRecord$EventSubType;", "subType", "content", "", "isHtmlFormat", "", NdkCrashLog.TIMESTAMP_KEY_NAME, "isLocalMessage", "Lgy2;", "senderRole", "senderAccountKey", "conversationId", "Lcom/indeed/android/messaging/data/events/EventRecord$MessageSendStatus;", "sendStatus", "", "Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;", "attachments", "Lcom/indeed/android/messaging/data/events/EventRecord$TimelineModule;", "timelineModule", "<init>", "(Ljava/lang/String;Lcom/indeed/android/messaging/data/events/EventRecord$EventType;Lcom/indeed/android/messaging/data/events/EventRecord$EventSubType;Ljava/lang/String;ZJZLgy2;Ljava/lang/String;Ljava/lang/String;Lcom/indeed/android/messaging/data/events/EventRecord$MessageSendStatus;Ljava/util/List;Lcom/indeed/android/messaging/data/events/EventRecord$TimelineModule;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/indeed/android/messaging/data/events/EventRecord$EventType;", "component3", "()Lcom/indeed/android/messaging/data/events/EventRecord$EventSubType;", "component4", "component5", "()Z", "component6", "()J", "component7", "component8", "()Lgy2;", "component9", "component10", "component11", "()Lcom/indeed/android/messaging/data/events/EventRecord$MessageSendStatus;", "component12", "()Ljava/util/List;", "component13", "()Lcom/indeed/android/messaging/data/events/EventRecord$TimelineModule;", "copy", "(Ljava/lang/String;Lcom/indeed/android/messaging/data/events/EventRecord$EventType;Lcom/indeed/android/messaging/data/events/EventRecord$EventSubType;Ljava/lang/String;ZJZLgy2;Ljava/lang/String;Ljava/lang/String;Lcom/indeed/android/messaging/data/events/EventRecord$MessageSendStatus;Ljava/util/List;Lcom/indeed/android/messaging/data/events/EventRecord$TimelineModule;)Lcom/indeed/android/messaging/data/events/EventRecord;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/indeed/android/messaging/data/events/EventRecord$EventType;", "getType", "Lcom/indeed/android/messaging/data/events/EventRecord$EventSubType;", "getSubType", "getContent", "Z", "J", "getTimestamp", "Lgy2;", "getSenderRole", "getSenderAccountKey", "getConversationId", "Lcom/indeed/android/messaging/data/events/EventRecord$MessageSendStatus;", "getSendStatus", "Ljava/util/List;", "getAttachments", "Lcom/indeed/android/messaging/data/events/EventRecord$TimelineModule;", "getTimelineModule", "EventType", "EventSubType", "MessageSendStatus", "Attachment", "AttachmentSentStatus", "AttachmentFileType", "TimelineModule", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EventRecord {
    public static final int $stable = 8;
    private final List<Attachment> attachments;
    private final String content;
    private final String conversationId;
    private final String id;
    private final boolean isHtmlFormat;
    private final boolean isLocalMessage;
    private final MessageSendStatus sendStatus;
    private final String senderAccountKey;
    private final gy2 senderRole;
    private final EventSubType subType;
    private final TimelineModule timelineModule;
    private final long timestamp;
    private final EventType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/indeed/android/messaging/data/events/EventRecord$AttachmentFileType;", "", "<init>", "(Ljava/lang/String;I)V", "FILE", "PHOTO", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AttachmentFileType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AttachmentFileType[] $VALUES;
        public static final AttachmentFileType FILE = new AttachmentFileType("FILE", 0);
        public static final AttachmentFileType PHOTO = new AttachmentFileType("PHOTO", 1);

        private static final /* synthetic */ AttachmentFileType[] $values() {
            return new AttachmentFileType[]{FILE, PHOTO};
        }

        static {
            AttachmentFileType[] attachmentFileTypeArr$values = $values();
            $VALUES = attachmentFileTypeArr$values;
            $ENTRIES = ojh.k(attachmentFileTypeArr$values);
        }

        private AttachmentFileType(String str, int i) {
        }

        public static EnumEntries<AttachmentFileType> getEntries() {
            return $ENTRIES;
        }

        public static AttachmentFileType valueOf(String str) {
            return (AttachmentFileType) Enum.valueOf(AttachmentFileType.class, str);
        }

        public static AttachmentFileType[] values() {
            return (AttachmentFileType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/indeed/android/messaging/data/events/EventRecord$EventSubType;", "", "<init>", "(Ljava/lang/String;I)V", "CANDAUTO_AUTO_REPLY", "CANDAUTO_AUTO_CONTACT", "CANDAUTO_MAYBE_AUTOMATION", "CANDAUTO_NEXUS_POST_APPLY_COMPLETED_OUTREACH", "CANDAUTO_NEXUS_STRONG_SCORE_OUTREACH", "CANDAUTO_NEXUS_PARTIAL_SCORE_OUTREACH", "CANDAUTO_NEXUS_INTERVIEW_INVITATION", "NORMAL", "SYSTEM", "CONFIRMATION_EMAIL", "NOTIFICATION_EMAIL", "INVITE_EMAIL", "INVITE_EMAIL_MULTITIME", "CANCEL_EMAIL", "CANCEL_EMAIL_MULTITIME", "ONE_TO_MANY_EMP_INVITE", "ONE_TO_MANY_EMP_CANCEL", "D2I_INTERVIEW_INVITE", "D2I_INTERVIEW_REMINDER", "INBOUND_EMAIL", "BULK_DRADIS_SEND", "BULK_DRADIS_TEMPLATE", "RESUME_CONTACT_INITIATED", "RESUME_CONTACT_ACCEPTED", "RESUME_CONTACT_DECLINED", "UNKNOWN", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EventSubType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventSubType[] $VALUES;
        public static final EventSubType CANDAUTO_AUTO_REPLY = new EventSubType("CANDAUTO_AUTO_REPLY", 0);
        public static final EventSubType CANDAUTO_AUTO_CONTACT = new EventSubType("CANDAUTO_AUTO_CONTACT", 1);
        public static final EventSubType CANDAUTO_MAYBE_AUTOMATION = new EventSubType("CANDAUTO_MAYBE_AUTOMATION", 2);
        public static final EventSubType CANDAUTO_NEXUS_POST_APPLY_COMPLETED_OUTREACH = new EventSubType("CANDAUTO_NEXUS_POST_APPLY_COMPLETED_OUTREACH", 3);
        public static final EventSubType CANDAUTO_NEXUS_STRONG_SCORE_OUTREACH = new EventSubType("CANDAUTO_NEXUS_STRONG_SCORE_OUTREACH", 4);
        public static final EventSubType CANDAUTO_NEXUS_PARTIAL_SCORE_OUTREACH = new EventSubType("CANDAUTO_NEXUS_PARTIAL_SCORE_OUTREACH", 5);
        public static final EventSubType CANDAUTO_NEXUS_INTERVIEW_INVITATION = new EventSubType("CANDAUTO_NEXUS_INTERVIEW_INVITATION", 6);
        public static final EventSubType NORMAL = new EventSubType("NORMAL", 7);
        public static final EventSubType SYSTEM = new EventSubType("SYSTEM", 8);
        public static final EventSubType CONFIRMATION_EMAIL = new EventSubType("CONFIRMATION_EMAIL", 9);
        public static final EventSubType NOTIFICATION_EMAIL = new EventSubType("NOTIFICATION_EMAIL", 10);
        public static final EventSubType INVITE_EMAIL = new EventSubType("INVITE_EMAIL", 11);
        public static final EventSubType INVITE_EMAIL_MULTITIME = new EventSubType("INVITE_EMAIL_MULTITIME", 12);
        public static final EventSubType CANCEL_EMAIL = new EventSubType("CANCEL_EMAIL", 13);
        public static final EventSubType CANCEL_EMAIL_MULTITIME = new EventSubType("CANCEL_EMAIL_MULTITIME", 14);
        public static final EventSubType ONE_TO_MANY_EMP_INVITE = new EventSubType("ONE_TO_MANY_EMP_INVITE", 15);
        public static final EventSubType ONE_TO_MANY_EMP_CANCEL = new EventSubType("ONE_TO_MANY_EMP_CANCEL", 16);
        public static final EventSubType D2I_INTERVIEW_INVITE = new EventSubType("D2I_INTERVIEW_INVITE", 17);
        public static final EventSubType D2I_INTERVIEW_REMINDER = new EventSubType("D2I_INTERVIEW_REMINDER", 18);
        public static final EventSubType INBOUND_EMAIL = new EventSubType("INBOUND_EMAIL", 19);
        public static final EventSubType BULK_DRADIS_SEND = new EventSubType("BULK_DRADIS_SEND", 20);
        public static final EventSubType BULK_DRADIS_TEMPLATE = new EventSubType("BULK_DRADIS_TEMPLATE", 21);
        public static final EventSubType RESUME_CONTACT_INITIATED = new EventSubType("RESUME_CONTACT_INITIATED", 22);
        public static final EventSubType RESUME_CONTACT_ACCEPTED = new EventSubType("RESUME_CONTACT_ACCEPTED", 23);
        public static final EventSubType RESUME_CONTACT_DECLINED = new EventSubType("RESUME_CONTACT_DECLINED", 24);
        public static final EventSubType UNKNOWN = new EventSubType("UNKNOWN", 25);

        private static final /* synthetic */ EventSubType[] $values() {
            return new EventSubType[]{CANDAUTO_AUTO_REPLY, CANDAUTO_AUTO_CONTACT, CANDAUTO_MAYBE_AUTOMATION, CANDAUTO_NEXUS_POST_APPLY_COMPLETED_OUTREACH, CANDAUTO_NEXUS_STRONG_SCORE_OUTREACH, CANDAUTO_NEXUS_PARTIAL_SCORE_OUTREACH, CANDAUTO_NEXUS_INTERVIEW_INVITATION, NORMAL, SYSTEM, CONFIRMATION_EMAIL, NOTIFICATION_EMAIL, INVITE_EMAIL, INVITE_EMAIL_MULTITIME, CANCEL_EMAIL, CANCEL_EMAIL_MULTITIME, ONE_TO_MANY_EMP_INVITE, ONE_TO_MANY_EMP_CANCEL, D2I_INTERVIEW_INVITE, D2I_INTERVIEW_REMINDER, INBOUND_EMAIL, BULK_DRADIS_SEND, BULK_DRADIS_TEMPLATE, RESUME_CONTACT_INITIATED, RESUME_CONTACT_ACCEPTED, RESUME_CONTACT_DECLINED, UNKNOWN};
        }

        static {
            EventSubType[] eventSubTypeArr$values = $values();
            $VALUES = eventSubTypeArr$values;
            $ENTRIES = ojh.k(eventSubTypeArr$values);
        }

        private EventSubType(String str, int i) {
        }

        public static EnumEntries<EventSubType> getEntries() {
            return $ENTRIES;
        }

        public static EventSubType valueOf(String str) {
            return (EventSubType) Enum.valueOf(EventSubType.class, str);
        }

        public static EventSubType[] values() {
            return (EventSubType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/indeed/android/messaging/data/events/EventRecord$EventType;", "", "<init>", "(Ljava/lang/String;I)V", "MILESTONE_UPDATE", "MESSAGE", "PHONE_CALL", "RESUME_CONTACT", "INTERVIEW_EVENT", "I2A", "UNKNOWN", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EventType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;
        public static final EventType MILESTONE_UPDATE = new EventType("MILESTONE_UPDATE", 0);
        public static final EventType MESSAGE = new EventType("MESSAGE", 1);
        public static final EventType PHONE_CALL = new EventType("PHONE_CALL", 2);
        public static final EventType RESUME_CONTACT = new EventType("RESUME_CONTACT", 3);
        public static final EventType INTERVIEW_EVENT = new EventType("INTERVIEW_EVENT", 4);
        public static final EventType I2A = new EventType("I2A", 5);
        public static final EventType UNKNOWN = new EventType("UNKNOWN", 6);

        private static final /* synthetic */ EventType[] $values() {
            return new EventType[]{MILESTONE_UPDATE, MESSAGE, PHONE_CALL, RESUME_CONTACT, INTERVIEW_EVENT, I2A, UNKNOWN};
        }

        static {
            EventType[] eventTypeArr$values = $values();
            $VALUES = eventTypeArr$values;
            $ENTRIES = ojh.k(eventTypeArr$values);
        }

        private EventType(String str, int i) {
        }

        public static EnumEntries<EventType> getEntries() {
            return $ENTRIES;
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/indeed/android/messaging/data/events/EventRecord$MessageSendStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SENDING", "FAILED", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MessageSendStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ MessageSendStatus[] $VALUES;
        public static final MessageSendStatus SENDING = new MessageSendStatus("SENDING", 0);
        public static final MessageSendStatus FAILED = new MessageSendStatus("FAILED", 1);

        private static final /* synthetic */ MessageSendStatus[] $values() {
            return new MessageSendStatus[]{SENDING, FAILED};
        }

        static {
            MessageSendStatus[] messageSendStatusArr$values = $values();
            $VALUES = messageSendStatusArr$values;
            $ENTRIES = ojh.k(messageSendStatusArr$values);
        }

        private MessageSendStatus(String str, int i) {
        }

        public static EnumEntries<MessageSendStatus> getEntries() {
            return $ENTRIES;
        }

        public static MessageSendStatus valueOf(String str) {
            return (MessageSendStatus) Enum.valueOf(MessageSendStatus.class, str);
        }

        public static MessageSendStatus[] values() {
            return (MessageSendStatus[]) $VALUES.clone();
        }
    }

    public /* synthetic */ EventRecord(String str, EventType eventType, EventSubType eventSubType, String str2, boolean z, long j, boolean z2, gy2 gy2Var, String str3, String str4, MessageSendStatus messageSendStatus, List list, TimelineModule timelineModule, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, eventType, (i & 4) != 0 ? null : eventSubType, str2, z, j, (i & 64) != 0 ? false : z2, gy2Var, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str3, str4, (i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : messageSendStatus, (i & 2048) != 0 ? zr4.a : list, (i & 4096) != 0 ? null : timelineModule);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final MessageSendStatus getSendStatus() {
        return this.sendStatus;
    }

    public final List<Attachment> component12() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final TimelineModule getTimelineModule() {
        return this.timelineModule;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EventType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EventSubType getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsHtmlFormat() {
        return this.isHtmlFormat;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsLocalMessage() {
        return this.isLocalMessage;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final gy2 getSenderRole() {
        return this.senderRole;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSenderAccountKey() {
        return this.senderAccountKey;
    }

    public final EventRecord copy(String id, EventType type, EventSubType subType, String content, boolean isHtmlFormat, long timestamp, boolean isLocalMessage, gy2 senderRole, String senderAccountKey, String conversationId, MessageSendStatus sendStatus, List<Attachment> attachments, TimelineModule timelineModule) {
        id.getClass();
        type.getClass();
        content.getClass();
        senderRole.getClass();
        conversationId.getClass();
        attachments.getClass();
        return new EventRecord(id, type, subType, content, isHtmlFormat, timestamp, isLocalMessage, senderRole, senderAccountKey, conversationId, sendStatus, attachments, timelineModule);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventRecord)) {
            return false;
        }
        EventRecord eventRecord = (EventRecord) other;
        return wl7.b(this.id, eventRecord.id) && this.type == eventRecord.type && this.subType == eventRecord.subType && wl7.b(this.content, eventRecord.content) && this.isHtmlFormat == eventRecord.isHtmlFormat && this.timestamp == eventRecord.timestamp && this.isLocalMessage == eventRecord.isLocalMessage && this.senderRole == eventRecord.senderRole && wl7.b(this.senderAccountKey, eventRecord.senderAccountKey) && wl7.b(this.conversationId, eventRecord.conversationId) && this.sendStatus == eventRecord.sendStatus && wl7.b(this.attachments, eventRecord.attachments) && wl7.b(this.timelineModule, eventRecord.timelineModule);
    }

    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getId() {
        return this.id;
    }

    public final MessageSendStatus getSendStatus() {
        return this.sendStatus;
    }

    public final String getSenderAccountKey() {
        return this.senderAccountKey;
    }

    public final gy2 getSenderRole() {
        return this.senderRole;
    }

    public final EventSubType getSubType() {
        return this.subType;
    }

    public final TimelineModule getTimelineModule() {
        return this.timelineModule;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final EventType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.type.hashCode() + (this.id.hashCode() * 31)) * 31;
        EventSubType eventSubType = this.subType;
        int iHashCode2 = (this.senderRole.hashCode() + ia.f(ia.d(ia.f(akb.d((iHashCode + (eventSubType == null ? 0 : eventSubType.hashCode())) * 31, 31, this.content), 31, this.isHtmlFormat), 31, this.timestamp), 31, this.isLocalMessage)) * 31;
        String str = this.senderAccountKey;
        int iD = akb.d((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.conversationId);
        MessageSendStatus messageSendStatus = this.sendStatus;
        int iG = ia.g(this.attachments, (iD + (messageSendStatus == null ? 0 : messageSendStatus.hashCode())) * 31, 31);
        TimelineModule timelineModule = this.timelineModule;
        return iG + (timelineModule != null ? timelineModule.hashCode() : 0);
    }

    public final boolean isHtmlFormat() {
        return this.isHtmlFormat;
    }

    public final boolean isLocalMessage() {
        return this.isLocalMessage;
    }

    public String toString() {
        String str = this.id;
        EventType eventType = this.type;
        EventSubType eventSubType = this.subType;
        String str2 = this.content;
        boolean z = this.isHtmlFormat;
        long j = this.timestamp;
        boolean z2 = this.isLocalMessage;
        gy2 gy2Var = this.senderRole;
        String str3 = this.senderAccountKey;
        String str4 = this.conversationId;
        MessageSendStatus messageSendStatus = this.sendStatus;
        List<Attachment> list = this.attachments;
        TimelineModule timelineModule = this.timelineModule;
        StringBuilder sb = new StringBuilder("EventRecord(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(eventType);
        sb.append(", subType=");
        sb.append(eventSubType);
        sb.append(", content=");
        sb.append(str2);
        sb.append(", isHtmlFormat=");
        sb.append(z);
        sb.append(", timestamp=");
        sb.append(j);
        sb.append(", isLocalMessage=");
        sb.append(z2);
        sb.append(", senderRole=");
        sb.append(gy2Var);
        ia.r(sb, ", senderAccountKey=", str3, ", conversationId=", str4);
        sb.append(", sendStatus=");
        sb.append(messageSendStatus);
        sb.append(", attachments=");
        sb.append(list);
        sb.append(", timelineModule=");
        sb.append(timelineModule);
        sb.append(")");
        return sb.toString();
    }

    @o7e
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JR\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010#R\u0011\u00109\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b8\u0010\u001cR\u0011\u0010=\u001a\u00020:8G¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;", "", "", "contentHash", "fileName", "fileExtension", "Lcom/indeed/android/messaging/data/events/EventRecord$AttachmentSentStatus;", "status", "fileUri", "Ljava/io/File;", "file", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/indeed/android/messaging/data/events/EventRecord$AttachmentSentStatus;Ljava/lang/String;Ljava/io/File;)V", "", "seen0", "Lp7e;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/indeed/android/messaging/data/events/EventRecord$AttachmentSentStatus;Ljava/lang/String;Lp7e;)V", "self", "Lvl2;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lj6g;", "write$Self$messaging_release", "(Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;Lvl2;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/indeed/android/messaging/data/events/EventRecord$AttachmentSentStatus;", "component5", "component6", "()Ljava/io/File;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/indeed/android/messaging/data/events/EventRecord$AttachmentSentStatus;Ljava/lang/String;Ljava/io/File;)Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getContentHash", "getFileName", "getFileExtension", "Lcom/indeed/android/messaging/data/events/EventRecord$AttachmentSentStatus;", "getStatus", "getFileUri", "Ljava/io/File;", "getFile", "getFile$annotations", "()V", "getFileExtensionTrimmed", "fileExtensionTrimmed", "Lcom/indeed/android/messaging/data/events/EventRecord$AttachmentFileType;", "getFileType", "()Lcom/indeed/android/messaging/data/events/EventRecord$AttachmentFileType;", "fileType", "Companion", "$serializer", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Attachment {
        private final String contentHash;
        private final File file;
        private final String fileExtension;
        private final String fileName;
        private final String fileUri;
        private final AttachmentSentStatus status;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, boa.E(qt8.b, new cp0(2)), null};

        public /* synthetic */ Attachment(int i, String str, String str2, String str3, AttachmentSentStatus attachmentSentStatus, String str4, p7e p7eVar) {
            if (7 != (i & 7)) {
                ewa.M(i, 7, EventRecord$Attachment$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.contentHash = str;
            this.fileName = str2;
            this.fileExtension = str3;
            if ((i & 8) == 0) {
                this.status = null;
            } else {
                this.status = attachmentSentStatus;
            }
            if ((i & 16) == 0) {
                this.fileUri = null;
            } else {
                this.fileUri = str4;
            }
            this.file = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return AttachmentSentStatus.INSTANCE.serializer();
        }

        public static /* synthetic */ Attachment copy$default(Attachment attachment, String str, String str2, String str3, AttachmentSentStatus attachmentSentStatus, String str4, File file, int i, Object obj) {
            if ((i & 1) != 0) {
                str = attachment.contentHash;
            }
            if ((i & 2) != 0) {
                str2 = attachment.fileName;
            }
            if ((i & 4) != 0) {
                str3 = attachment.fileExtension;
            }
            if ((i & 8) != 0) {
                attachmentSentStatus = attachment.status;
            }
            if ((i & 16) != 0) {
                str4 = attachment.fileUri;
            }
            if ((i & 32) != 0) {
                file = attachment.file;
            }
            String str5 = str4;
            File file2 = file;
            return attachment.copy(str, str2, str3, attachmentSentStatus, str5, file2);
        }

        public static /* synthetic */ void getFile$annotations() {
        }

        public static final /* synthetic */ void write$Self$messaging_release(Attachment self, vl2 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            output.x(serialDesc, 0, self.contentHash);
            output.x(serialDesc, 1, self.fileName);
            output.x(serialDesc, 2, self.fileExtension);
            if (output.m(serialDesc) || self.status != null) {
                output.k(serialDesc, 3, lazyArr[3].getValue(), self.status);
            }
            if (!output.m(serialDesc) && self.fileUri == null) {
                return;
            }
            output.k(serialDesc, 4, mve.a, self.fileUri);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getContentHash() {
            return this.contentHash;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFileExtension() {
            return this.fileExtension;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final AttachmentSentStatus getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getFileUri() {
            return this.fileUri;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        public final Attachment copy(String contentHash, String fileName, String fileExtension, AttachmentSentStatus status, String fileUri, File file) {
            contentHash.getClass();
            fileName.getClass();
            fileExtension.getClass();
            return new Attachment(contentHash, fileName, fileExtension, status, fileUri, file);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attachment)) {
                return false;
            }
            Attachment attachment = (Attachment) other;
            return wl7.b(this.contentHash, attachment.contentHash) && wl7.b(this.fileName, attachment.fileName) && wl7.b(this.fileExtension, attachment.fileExtension) && this.status == attachment.status && wl7.b(this.fileUri, attachment.fileUri) && wl7.b(this.file, attachment.file);
        }

        public final String getContentHash() {
            return this.contentHash;
        }

        public final File getFile() {
            return this.file;
        }

        public final String getFileExtension() {
            return this.fileExtension;
        }

        public final String getFileExtensionTrimmed() {
            String lowerCase = ((this.fileExtension.length() <= 1 || !wve.K(this.fileExtension, ".", false)) ? this.fileExtension : this.fileExtension.substring(1)).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            return lowerCase;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final AttachmentFileType getFileType() {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(getFileExtensionTrimmed());
            if (mimeTypeFromExtension == null) {
                mimeTypeFromExtension = "";
            }
            return wve.K(mimeTypeFromExtension, "image", false) ? AttachmentFileType.PHOTO : AttachmentFileType.FILE;
        }

        public final String getFileUri() {
            return this.fileUri;
        }

        public final AttachmentSentStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            int iD = akb.d(akb.d(this.contentHash.hashCode() * 31, 31, this.fileName), 31, this.fileExtension);
            AttachmentSentStatus attachmentSentStatus = this.status;
            int iHashCode = (iD + (attachmentSentStatus == null ? 0 : attachmentSentStatus.hashCode())) * 31;
            String str = this.fileUri;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            File file = this.file;
            return iHashCode2 + (file != null ? file.hashCode() : 0);
        }

        public String toString() {
            String str = this.contentHash;
            String str2 = this.fileName;
            String str3 = this.fileExtension;
            AttachmentSentStatus attachmentSentStatus = this.status;
            String str4 = this.fileUri;
            File file = this.file;
            StringBuilder sbF = u40.f("Attachment(contentHash=", str, ", fileName=", str2, ", fileExtension=");
            sbF.append(str3);
            sbF.append(", status=");
            sbF.append(attachmentSentStatus);
            sbF.append(", fileUri=");
            sbF.append(str4);
            sbF.append(", file=");
            sbF.append(file);
            sbF.append(")");
            return sbF.toString();
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/messaging/data/events/EventRecord$Attachment$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<Attachment> serializer() {
                return EventRecord$Attachment$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Attachment(String str, String str2, String str3, AttachmentSentStatus attachmentSentStatus, String str4, File file) {
            q6.m(str, str2, str3);
            this.contentHash = str;
            this.fileName = str2;
            this.fileExtension = str3;
            this.status = attachmentSentStatus;
            this.fileUri = str4;
            this.file = file;
        }

        public /* synthetic */ Attachment(String str, String str2, String str3, AttachmentSentStatus attachmentSentStatus, String str4, File file, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : attachmentSentStatus, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : file);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @o7e
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/indeed/android/messaging/data/events/EventRecord$AttachmentSentStatus;", "", "<init>", "(Ljava/lang/String;I)V", "UPLOADING", "SUCCESS", "FAILURE", "Companion", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AttachmentSentStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AttachmentSentStatus[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AttachmentSentStatus UPLOADING = new AttachmentSentStatus("UPLOADING", 0);
        public static final AttachmentSentStatus SUCCESS = new AttachmentSentStatus("SUCCESS", 1);
        public static final AttachmentSentStatus FAILURE = new AttachmentSentStatus("FAILURE", 2);

        private static final /* synthetic */ AttachmentSentStatus[] $values() {
            return new AttachmentSentStatus[]{UPLOADING, SUCCESS, FAILURE};
        }

        static {
            AttachmentSentStatus[] attachmentSentStatusArr$values = $values();
            $VALUES = attachmentSentStatusArr$values;
            $ENTRIES = ojh.k(attachmentSentStatusArr$values);
            INSTANCE = new Companion(null);
            $cachedSerializer$delegate = boa.E(qt8.b, new dp0(3));
        }

        private AttachmentSentStatus(String str, int i) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            AttachmentSentStatus[] attachmentSentStatusArrValues = values();
            attachmentSentStatusArrValues.getClass();
            return new aw4(attachmentSentStatusArrValues, "com.indeed.android.messaging.data.events.EventRecord.AttachmentSentStatus");
        }

        public static EnumEntries<AttachmentSentStatus> getEntries() {
            return $ENTRIES;
        }

        public static AttachmentSentStatus valueOf(String str) {
            return (AttachmentSentStatus) Enum.valueOf(AttachmentSentStatus.class, str);
        }

        public static AttachmentSentStatus[] values() {
            return (AttachmentSentStatus[]) $VALUES.clone();
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/messaging/data/events/EventRecord$AttachmentSentStatus$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/messaging/data/events/EventRecord$AttachmentSentStatus;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) AttachmentSentStatus.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<AttachmentSentStatus> serializer() {
                return get$cachedSerializer();
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006&"}, d2 = {"Lcom/indeed/android/messaging/data/events/EventRecord$TimelineModule;", "", "", "telContent", "timelineModuleType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lp7e;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lp7e;)V", "self", "Lvl2;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lj6g;", "write$Self$messaging_release", "(Lcom/indeed/android/messaging/data/events/EventRecord$TimelineModule;Lvl2;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/indeed/android/messaging/data/events/EventRecord$TimelineModule;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTelContent", "getTimelineModuleType", "Companion", "$serializer", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TimelineModule {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String telContent;
        private final String timelineModuleType;

        public /* synthetic */ TimelineModule(int i, String str, String str2, p7e p7eVar) {
            if (3 != (i & 3)) {
                ewa.M(i, 3, EventRecord$TimelineModule$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.telContent = str;
            this.timelineModuleType = str2;
        }

        public static /* synthetic */ TimelineModule copy$default(TimelineModule timelineModule, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = timelineModule.telContent;
            }
            if ((i & 2) != 0) {
                str2 = timelineModule.timelineModuleType;
            }
            return timelineModule.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$messaging_release(TimelineModule self, vl2 output, SerialDescriptor serialDesc) {
            output.x(serialDesc, 0, self.telContent);
            output.x(serialDesc, 1, self.timelineModuleType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTelContent() {
            return this.telContent;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTimelineModuleType() {
            return this.timelineModuleType;
        }

        public final TimelineModule copy(String telContent, String timelineModuleType) {
            telContent.getClass();
            timelineModuleType.getClass();
            return new TimelineModule(telContent, timelineModuleType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimelineModule)) {
                return false;
            }
            TimelineModule timelineModule = (TimelineModule) other;
            return wl7.b(this.telContent, timelineModule.telContent) && wl7.b(this.timelineModuleType, timelineModule.timelineModuleType);
        }

        public final String getTelContent() {
            return this.telContent;
        }

        public final String getTimelineModuleType() {
            return this.timelineModuleType;
        }

        public int hashCode() {
            return this.timelineModuleType.hashCode() + (this.telContent.hashCode() * 31);
        }

        public String toString() {
            return akb.k("TimelineModule(telContent=", this.telContent, ", timelineModuleType=", this.timelineModuleType, ")");
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/messaging/data/events/EventRecord$TimelineModule$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/messaging/data/events/EventRecord$TimelineModule;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<TimelineModule> serializer() {
                return EventRecord$TimelineModule$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public TimelineModule(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.telContent = str;
            this.timelineModuleType = str2;
        }
    }

    public EventRecord(String str, EventType eventType, EventSubType eventSubType, String str2, boolean z, long j, boolean z2, gy2 gy2Var, String str3, String str4, MessageSendStatus messageSendStatus, List<Attachment> list, TimelineModule timelineModule) {
        str.getClass();
        eventType.getClass();
        str2.getClass();
        gy2Var.getClass();
        str4.getClass();
        list.getClass();
        this.id = str;
        this.type = eventType;
        this.subType = eventSubType;
        this.content = str2;
        this.isHtmlFormat = z;
        this.timestamp = j;
        this.isLocalMessage = z2;
        this.senderRole = gy2Var;
        this.senderAccountKey = str3;
        this.conversationId = str4;
        this.sendStatus = messageSendStatus;
        this.attachments = list;
        this.timelineModule = timelineModule;
    }
}
