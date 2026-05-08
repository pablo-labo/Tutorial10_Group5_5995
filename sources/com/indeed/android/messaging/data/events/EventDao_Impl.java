package com.indeed.android.messaging.data.events;

import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.ndk.internal.NdkCrashLog;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.bf;
import defpackage.bz2;
import defpackage.c1f;
import defpackage.ee3;
import defpackage.ev2;
import defpackage.g13;
import defpackage.gy2;
import defpackage.iid;
import defpackage.j6g;
import defpackage.kfd;
import defpackage.l;
import defpackage.l5;
import defpackage.lu2;
import defpackage.mt;
import defpackage.nm1;
import defpackage.pg8;
import defpackage.pv4;
import defpackage.pw8;
import defpackage.q92;
import defpackage.qs0;
import defpackage.r2b;
import defpackage.r6;
import defpackage.r7d;
import defpackage.s98;
import defpackage.uh3;
import defpackage.ux4;
import defpackage.vi5;
import defpackage.vx4;
import defpackage.wl7;
import defpackage.wx4;
import defpackage.xed;
import defpackage.xx4;
import defpackage.yd8;
import defpackage.zhd;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00182\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u001c\u0010\u0017J\u0018\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u001d\u0010\u0017J\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u001e\u0010\u0017J \u0010!\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\f2\u0006\u0010$\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\f2\u0006\u0010$\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020#2\u0006\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020'2\u0006\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020*2\u0006\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0007088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/indeed/android/messaging/data/events/EventDao_Impl;", "Lcom/indeed/android/messaging/data/events/EventDao;", "Lxed;", "__db", "<init>", "(Lxed;)V", "", "Lcom/indeed/android/messaging/data/events/EventRecord;", "eventRecords", "Lj6g;", "saveEvent", "(Ljava/util/List;Llu2;)Ljava/lang/Object;", "", "localMessageId", "serverMessageId", "replaceMessage", "(Ljava/lang/String;Ljava/lang/String;Llu2;)Ljava/lang/Object;", "conversationId", "Lr2b;", "", "getPagingEvents", "(Ljava/lang/String;)Lr2b;", "getLocalLastEvent", "(Ljava/lang/String;Llu2;)Ljava/lang/Object;", "Lvi5;", "observeLastEvent", "(Ljava/lang/String;)Lvi5;", "id", "findById", "countByConversationId", "delete", "Lcom/indeed/android/messaging/data/events/EventRecord$MessageSendStatus;", "status", "updateSendStatus", "(Ljava/lang/String;Lcom/indeed/android/messaging/data/events/EventRecord$MessageSendStatus;Llu2;)Ljava/lang/Object;", "Lcom/indeed/android/messaging/data/events/EventRecord$EventType;", "_value", "__EventType_enumToString", "(Lcom/indeed/android/messaging/data/events/EventRecord$EventType;)Ljava/lang/String;", "Lcom/indeed/android/messaging/data/events/EventRecord$EventSubType;", "__EventSubType_enumToString", "(Lcom/indeed/android/messaging/data/events/EventRecord$EventSubType;)Ljava/lang/String;", "Lgy2;", "__ConversationParticipantRole_enumToString", "(Lgy2;)Ljava/lang/String;", "__MessageSendStatus_enumToString", "(Lcom/indeed/android/messaging/data/events/EventRecord$MessageSendStatus;)Ljava/lang/String;", "__EventType_stringToEnum", "(Ljava/lang/String;)Lcom/indeed/android/messaging/data/events/EventRecord$EventType;", "__EventSubType_stringToEnum", "(Ljava/lang/String;)Lcom/indeed/android/messaging/data/events/EventRecord$EventSubType;", "__ConversationParticipantRole_stringToEnum", "(Ljava/lang/String;)Lgy2;", "__MessageSendStatus_stringToEnum", "(Ljava/lang/String;)Lcom/indeed/android/messaging/data/events/EventRecord$MessageSendStatus;", "Lxed;", "Lpv4;", "__insertAdapterOfEventRecord", "Lpv4;", "Lbz2;", "__converters", "Lbz2;", "Companion", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EventDao_Impl implements EventDao {
    private final bz2 __converters;
    private final xed __db;
    private final pv4<EventRecord> __insertAdapterOfEventRecord;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[EventRecord.EventType.values().length];
            try {
                iArr[EventRecord.EventType.MILESTONE_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventRecord.EventType.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventRecord.EventType.PHONE_CALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EventRecord.EventType.RESUME_CONTACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EventRecord.EventType.INTERVIEW_EVENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EventRecord.EventType.I2A.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EventRecord.EventType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EventRecord.EventSubType.values().length];
            try {
                iArr2[EventRecord.EventSubType.CANDAUTO_AUTO_REPLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EventRecord.EventSubType.CANDAUTO_AUTO_CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EventRecord.EventSubType.CANDAUTO_MAYBE_AUTOMATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EventRecord.EventSubType.CANDAUTO_NEXUS_POST_APPLY_COMPLETED_OUTREACH.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EventRecord.EventSubType.CANDAUTO_NEXUS_STRONG_SCORE_OUTREACH.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[EventRecord.EventSubType.CANDAUTO_NEXUS_PARTIAL_SCORE_OUTREACH.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[EventRecord.EventSubType.CANDAUTO_NEXUS_INTERVIEW_INVITATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[EventRecord.EventSubType.NORMAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[EventRecord.EventSubType.SYSTEM.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[EventRecord.EventSubType.CONFIRMATION_EMAIL.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[EventRecord.EventSubType.NOTIFICATION_EMAIL.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[EventRecord.EventSubType.INVITE_EMAIL.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[EventRecord.EventSubType.INVITE_EMAIL_MULTITIME.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[EventRecord.EventSubType.CANCEL_EMAIL.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[EventRecord.EventSubType.CANCEL_EMAIL_MULTITIME.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[EventRecord.EventSubType.ONE_TO_MANY_EMP_INVITE.ordinal()] = 16;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[EventRecord.EventSubType.ONE_TO_MANY_EMP_CANCEL.ordinal()] = 17;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr2[EventRecord.EventSubType.D2I_INTERVIEW_INVITE.ordinal()] = 18;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr2[EventRecord.EventSubType.D2I_INTERVIEW_REMINDER.ordinal()] = 19;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr2[EventRecord.EventSubType.INBOUND_EMAIL.ordinal()] = 20;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr2[EventRecord.EventSubType.BULK_DRADIS_SEND.ordinal()] = 21;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr2[EventRecord.EventSubType.BULK_DRADIS_TEMPLATE.ordinal()] = 22;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr2[EventRecord.EventSubType.RESUME_CONTACT_INITIATED.ordinal()] = 23;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr2[EventRecord.EventSubType.RESUME_CONTACT_ACCEPTED.ordinal()] = 24;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr2[EventRecord.EventSubType.RESUME_CONTACT_DECLINED.ordinal()] = 25;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr2[EventRecord.EventSubType.UNKNOWN.ordinal()] = 26;
            } catch (NoSuchFieldError unused33) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[gy2.values().length];
            try {
                gy2.a aVar = gy2.a;
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                gy2.a aVar2 = gy2.a;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                gy2.a aVar3 = gy2.a;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                gy2.a aVar4 = gy2.a;
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                gy2.a aVar5 = gy2.a;
                iArr3[4] = 5;
            } catch (NoSuchFieldError unused38) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[EventRecord.MessageSendStatus.values().length];
            try {
                iArr4[EventRecord.MessageSendStatus.SENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr4[EventRecord.MessageSendStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.events.EventDao_Impl$getPagingEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0094@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/indeed/android/messaging/data/events/EventDao_Impl$getPagingEvents$1", "Lpw8;", "Lcom/indeed/android/messaging/data/events/EventRecord;", "Lkfd;", "limitOffsetQuery", "", "itemCount", "", "convertRows", "(Lkfd;ILlu2;)Ljava/lang/Object;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C06561 extends pw8<EventRecord> {
        final /* synthetic */ EventDao_Impl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06561(kfd kfdVar, EventDao_Impl eventDao_Impl, xed xedVar, String[] strArr) {
            super(kfdVar, xedVar, strArr);
            this.this$0 = eventDao_Impl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List convertRows$lambda$0(kfd kfdVar, EventDao_Impl eventDao_Impl, zhd zhdVar) throws Exception {
            zhdVar.getClass();
            iid iidVarQ1 = zhdVar.Q1(kfdVar.a);
            kfdVar.b.invoke(iidVarQ1);
            try {
                int iK = q92.k("id", iidVarQ1);
                int iK2 = q92.k("type", iidVarQ1);
                int iK3 = q92.k("subType", iidVarQ1);
                int iK4 = q92.k("content", iidVarQ1);
                int iK5 = q92.k("isHtmlFormat", iidVarQ1);
                int iK6 = q92.k(NdkCrashLog.TIMESTAMP_KEY_NAME, iidVarQ1);
                int iK7 = q92.k("isLocalMessage", iidVarQ1);
                int iK8 = q92.k("senderRole", iidVarQ1);
                int iK9 = q92.k("senderAccountKey", iidVarQ1);
                int iK10 = q92.k("conversationId", iidVarQ1);
                int iK11 = q92.k("sendStatus", iidVarQ1);
                int iK12 = q92.k("attachments", iidVarQ1);
                int iK13 = q92.k("timelineModule", iidVarQ1);
                ArrayList arrayList = new ArrayList();
                while (iidVarQ1.M1()) {
                    String strR1 = iidVarQ1.r1(iK);
                    int i = iK;
                    EventRecord.EventType eventType__EventType_stringToEnum = eventDao_Impl.__EventType_stringToEnum(iidVarQ1.r1(iK2));
                    String strR12 = null;
                    EventRecord.EventSubType eventSubType__EventSubType_stringToEnum = iidVarQ1.isNull(iK3) ? null : eventDao_Impl.__EventSubType_stringToEnum(iidVarQ1.r1(iK3));
                    String strR13 = iidVarQ1.r1(iK4);
                    int i2 = iK2;
                    int i3 = iK3;
                    boolean z = ((int) iidVarQ1.getLong(iK5)) != 0;
                    long j = iidVarQ1.getLong(iK6);
                    int i4 = iK4;
                    boolean z2 = ((int) iidVarQ1.getLong(iK7)) != 0;
                    gy2 gy2Var__ConversationParticipantRole_stringToEnum = eventDao_Impl.__ConversationParticipantRole_stringToEnum(iidVarQ1.r1(iK8));
                    String strR14 = iidVarQ1.isNull(iK9) ? null : iidVarQ1.r1(iK9);
                    String strR15 = iidVarQ1.r1(iK10);
                    EventRecord.MessageSendStatus messageSendStatus__MessageSendStatus_stringToEnum = iidVarQ1.isNull(iK11) ? null : eventDao_Impl.__MessageSendStatus_stringToEnum(iidVarQ1.r1(iK11));
                    String strR16 = iidVarQ1.r1(iK12);
                    eventDao_Impl.__converters.getClass();
                    List listB = bz2.b(strR16);
                    if (listB == null) {
                        throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.indeed.android.messaging.`data`.events.EventRecord.Attachment>', but it was NULL.");
                    }
                    if (!iidVarQ1.isNull(iK13)) {
                        strR12 = iidVarQ1.r1(iK13);
                    }
                    eventDao_Impl.__converters.getClass();
                    arrayList.add(new EventRecord(strR1, eventType__EventType_stringToEnum, eventSubType__EventSubType_stringToEnum, strR13, z, j, z2, gy2Var__ConversationParticipantRole_stringToEnum, strR14, strR15, messageSendStatus__MessageSendStatus_stringToEnum, listB, bz2.d(strR12)));
                    iK3 = i3;
                    iK4 = i4;
                    iK = i;
                    iK2 = i2;
                }
                iidVarQ1.close();
                return arrayList;
            } catch (Throwable th) {
                iidVarQ1.close();
                throw th;
            }
        }

        @Override // defpackage.pw8
        public Object convertRows(kfd kfdVar, int i, lu2<? super List<? extends EventRecord>> lu2Var) {
            return pg8.H(lu2Var, this.this$0.__db, new bf(2, kfdVar, this.this$0), true, false);
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.events.EventDao_Impl$replaceMessage$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", "Lcom/indeed/android/messaging/data/events/EventRecord;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @uh3(c = "com.indeed.android.messaging.data.events.EventDao_Impl$replaceMessage$2", f = "EventDao_Impl.kt", l = {94}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends c1f implements Function1<lu2<? super EventRecord>, Object> {
        final /* synthetic */ String $localMessageId;
        final /* synthetic */ String $serverMessageId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, lu2<? super AnonymousClass2> lu2Var) {
            super(1, lu2Var);
            this.$localMessageId = str;
            this.$serverMessageId = str2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(lu2<?> lu2Var) {
            return EventDao_Impl.this.new AnonymousClass2(this.$localMessageId, this.$serverMessageId, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(lu2<? super EventRecord> lu2Var) {
            return ((AnonymousClass2) create(lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            EventDao_Impl eventDao_Impl = EventDao_Impl.this;
            String str = this.$localMessageId;
            String str2 = this.$serverMessageId;
            this.label = 1;
            Object objReplaceMessage = EventDao_Impl.super.replaceMessage(str, str2, this);
            g13 g13Var = g13.a;
            return objReplaceMessage == g13Var ? g13Var : objReplaceMessage;
        }
    }

    public EventDao_Impl(xed xedVar) {
        xedVar.getClass();
        this.__converters = new bz2();
        this.__db = xedVar;
        this.__insertAdapterOfEventRecord = new pv4<EventRecord>() { // from class: com.indeed.android.messaging.data.events.EventDao_Impl.1
            @Override // defpackage.pv4
            public void bind(iid statement, EventRecord entity) {
                String strB;
                statement.getClass();
                entity.getClass();
                statement.R(1, entity.getId());
                statement.R(2, EventDao_Impl.this.__EventType_enumToString(entity.getType()));
                EventRecord.EventSubType subType = entity.getSubType();
                if (subType == null) {
                    statement.u(3);
                } else {
                    statement.R(3, EventDao_Impl.this.__EventSubType_enumToString(subType));
                }
                statement.R(4, entity.getContent());
                statement.q(5, entity.isHtmlFormat() ? 1L : 0L);
                statement.q(6, entity.getTimestamp());
                statement.q(7, entity.isLocalMessage() ? 1L : 0L);
                statement.R(8, EventDao_Impl.this.__ConversationParticipantRole_enumToString(entity.getSenderRole()));
                String senderAccountKey = entity.getSenderAccountKey();
                if (senderAccountKey == null) {
                    statement.u(9);
                } else {
                    statement.R(9, senderAccountKey);
                }
                statement.R(10, entity.getConversationId());
                EventRecord.MessageSendStatus sendStatus = entity.getSendStatus();
                if (sendStatus == null) {
                    statement.u(11);
                } else {
                    statement.R(11, EventDao_Impl.this.__MessageSendStatus_enumToString(sendStatus));
                }
                bz2 bz2Var = EventDao_Impl.this.__converters;
                List<EventRecord.Attachment> attachments = entity.getAttachments();
                bz2Var.getClass();
                statement.R(12, bz2.e(attachments));
                EventRecord.TimelineModule timelineModule = entity.getTimelineModule();
                EventDao_Impl.this.__converters.getClass();
                if (timelineModule != null) {
                    s98.a aVar = s98.d;
                    aVar.getClass();
                    strB = aVar.b(EventRecord.TimelineModule.INSTANCE.serializer(), timelineModule);
                } else {
                    strB = null;
                }
                if (strB == null) {
                    statement.u(13);
                } else {
                    statement.R(13, strB);
                }
            }

            @Override // defpackage.pv4
            public String createQuery() {
                return "INSERT OR REPLACE INTO `EventRecord` (`id`,`type`,`subType`,`content`,`isHtmlFormat`,`timestamp`,`isLocalMessage`,`senderRole`,`senderAccountKey`,`conversationId`,`sendStatus`,`attachments`,`timelineModule`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String __ConversationParticipantRole_enumToString(gy2 _value) {
        int i = WhenMappings.$EnumSwitchMapping$2[_value.ordinal()];
        if (i == 1) {
            return "JOB_SEEKER";
        }
        if (i == 2) {
            return "EMPLOYER";
        }
        if (i == 3) {
            return "UNKNOWN";
        }
        if (i == 4) {
            return "SYSTEM";
        }
        if (i == 5) {
            return "UNKNOWN__";
        }
        l.g();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final gy2 __ConversationParticipantRole_stringToEnum(String _value) {
        switch (_value.hashCode()) {
            case -1833998801:
                if (_value.equals("SYSTEM")) {
                    return gy2.f;
                }
                break;
            case -362552950:
                if (_value.equals("UNKNOWN__")) {
                    return gy2.V;
                }
                break;
            case 433141802:
                if (_value.equals("UNKNOWN")) {
                    return gy2.e;
                }
                break;
            case 1499829255:
                if (_value.equals("JOB_SEEKER")) {
                    return gy2.c;
                }
                break;
            case 1976096443:
                if (_value.equals("EMPLOYER")) {
                    return gy2.d;
                }
                break;
        }
        l5.q("Can't convert value to enum, unknown value: ".concat(_value));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String __EventSubType_enumToString(EventRecord.EventSubType _value) {
        switch (WhenMappings.$EnumSwitchMapping$1[_value.ordinal()]) {
            case 1:
                return "CANDAUTO_AUTO_REPLY";
            case 2:
                return "CANDAUTO_AUTO_CONTACT";
            case 3:
                return "CANDAUTO_MAYBE_AUTOMATION";
            case 4:
                return "CANDAUTO_NEXUS_POST_APPLY_COMPLETED_OUTREACH";
            case 5:
                return "CANDAUTO_NEXUS_STRONG_SCORE_OUTREACH";
            case 6:
                return "CANDAUTO_NEXUS_PARTIAL_SCORE_OUTREACH";
            case 7:
                return "CANDAUTO_NEXUS_INTERVIEW_INVITATION";
            case 8:
                return "NORMAL";
            case DatadogLogGenerator.CRASH /* 9 */:
                return "SYSTEM";
            case 10:
                return "CONFIRMATION_EMAIL";
            case 11:
                return "NOTIFICATION_EMAIL";
            case 12:
                return "INVITE_EMAIL";
            case 13:
                return "INVITE_EMAIL_MULTITIME";
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return "CANCEL_EMAIL";
            case 15:
                return "CANCEL_EMAIL_MULTITIME";
            case 16:
                return "ONE_TO_MANY_EMP_INVITE";
            case 17:
                return "ONE_TO_MANY_EMP_CANCEL";
            case 18:
                return "D2I_INTERVIEW_INVITE";
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return "D2I_INTERVIEW_REMINDER";
            case 20:
                return "INBOUND_EMAIL";
            case 21:
                return "BULK_DRADIS_SEND";
            case 22:
                return "BULK_DRADIS_TEMPLATE";
            case 23:
                return "RESUME_CONTACT_INITIATED";
            case 24:
                return "RESUME_CONTACT_ACCEPTED";
            case 25:
                return "RESUME_CONTACT_DECLINED";
            case 26:
                return "UNKNOWN";
            default:
                l.g();
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final EventRecord.EventSubType __EventSubType_stringToEnum(String _value) {
        switch (_value.hashCode()) {
            case -1986416409:
                if (_value.equals("NORMAL")) {
                    return EventRecord.EventSubType.NORMAL;
                }
                break;
            case -1833998801:
                if (_value.equals("SYSTEM")) {
                    return EventRecord.EventSubType.SYSTEM;
                }
                break;
            case -1816110434:
                if (_value.equals("CANCEL_EMAIL_MULTITIME")) {
                    return EventRecord.EventSubType.CANCEL_EMAIL_MULTITIME;
                }
                break;
            case -1247398122:
                if (_value.equals("INBOUND_EMAIL")) {
                    return EventRecord.EventSubType.INBOUND_EMAIL;
                }
                break;
            case -1207166701:
                if (_value.equals("CANDAUTO_NEXUS_INTERVIEW_INVITATION")) {
                    return EventRecord.EventSubType.CANDAUTO_NEXUS_INTERVIEW_INVITATION;
                }
                break;
            case -1113891539:
                if (_value.equals("INVITE_EMAIL_MULTITIME")) {
                    return EventRecord.EventSubType.INVITE_EMAIL_MULTITIME;
                }
                break;
            case -922719891:
                if (_value.equals("CANDAUTO_NEXUS_POST_APPLY_COMPLETED_OUTREACH")) {
                    return EventRecord.EventSubType.CANDAUTO_NEXUS_POST_APPLY_COMPLETED_OUTREACH;
                }
                break;
            case -770871566:
                if (_value.equals("CONFIRMATION_EMAIL")) {
                    return EventRecord.EventSubType.CONFIRMATION_EMAIL;
                }
                break;
            case -444354874:
                if (_value.equals("INVITE_EMAIL")) {
                    return EventRecord.EventSubType.INVITE_EMAIL;
                }
                break;
            case -285818484:
                if (_value.equals("CANDAUTO_NEXUS_PARTIAL_SCORE_OUTREACH")) {
                    return EventRecord.EventSubType.CANDAUTO_NEXUS_PARTIAL_SCORE_OUTREACH;
                }
                break;
            case 222909279:
                if (_value.equals("RESUME_CONTACT_DECLINED")) {
                    return EventRecord.EventSubType.RESUME_CONTACT_DECLINED;
                }
                break;
            case 328478961:
                if (_value.equals("BULK_DRADIS_TEMPLATE")) {
                    return EventRecord.EventSubType.BULK_DRADIS_TEMPLATE;
                }
                break;
            case 433141802:
                if (_value.equals("UNKNOWN")) {
                    return EventRecord.EventSubType.UNKNOWN;
                }
                break;
            case 742095014:
                if (_value.equals("ONE_TO_MANY_EMP_CANCEL")) {
                    return EventRecord.EventSubType.ONE_TO_MANY_EMP_CANCEL;
                }
                break;
            case 926120245:
                if (_value.equals("ONE_TO_MANY_EMP_INVITE")) {
                    return EventRecord.EventSubType.ONE_TO_MANY_EMP_INVITE;
                }
                break;
            case 1060705206:
                if (_value.equals("CANDAUTO_AUTO_REPLY")) {
                    return EventRecord.EventSubType.CANDAUTO_AUTO_REPLY;
                }
                break;
            case 1177193256:
                if (_value.equals("NOTIFICATION_EMAIL")) {
                    return EventRecord.EventSubType.NOTIFICATION_EMAIL;
                }
                break;
            case 1287462380:
                if (_value.equals("CANDAUTO_AUTO_CONTACT")) {
                    return EventRecord.EventSubType.CANDAUTO_AUTO_CONTACT;
                }
                break;
            case 1306187754:
                if (_value.equals("CANDAUTO_MAYBE_AUTOMATION")) {
                    return EventRecord.EventSubType.CANDAUTO_MAYBE_AUTOMATION;
                }
                break;
            case 1401554379:
                if (_value.equals("D2I_INTERVIEW_INVITE")) {
                    return EventRecord.EventSubType.D2I_INTERVIEW_INVITE;
                }
                break;
            case 1418980020:
                if (_value.equals("D2I_INTERVIEW_REMINDER")) {
                    return EventRecord.EventSubType.D2I_INTERVIEW_REMINDER;
                }
                break;
            case 1667492958:
                if (_value.equals("CANDAUTO_NEXUS_STRONG_SCORE_OUTREACH")) {
                    return EventRecord.EventSubType.CANDAUTO_NEXUS_STRONG_SCORE_OUTREACH;
                }
                break;
            case 1743820151:
                if (_value.equals("CANCEL_EMAIL")) {
                    return EventRecord.EventSubType.CANCEL_EMAIL;
                }
                break;
            case 1803155160:
                if (_value.equals("RESUME_CONTACT_ACCEPTED")) {
                    return EventRecord.EventSubType.RESUME_CONTACT_ACCEPTED;
                }
                break;
            case 1932021690:
                if (_value.equals("RESUME_CONTACT_INITIATED")) {
                    return EventRecord.EventSubType.RESUME_CONTACT_INITIATED;
                }
                break;
            case 2025656191:
                if (_value.equals("BULK_DRADIS_SEND")) {
                    return EventRecord.EventSubType.BULK_DRADIS_SEND;
                }
                break;
        }
        l5.q("Can't convert value to enum, unknown value: ".concat(_value));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String __EventType_enumToString(EventRecord.EventType _value) {
        switch (WhenMappings.$EnumSwitchMapping$0[_value.ordinal()]) {
            case 1:
                return "MILESTONE_UPDATE";
            case 2:
                return "MESSAGE";
            case 3:
                return "PHONE_CALL";
            case 4:
                return "RESUME_CONTACT";
            case 5:
                return "INTERVIEW_EVENT";
            case 6:
                return "I2A";
            case 7:
                return "UNKNOWN";
            default:
                l.g();
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final EventRecord.EventType __EventType_stringToEnum(String _value) {
        switch (_value.hashCode()) {
            case -1309800785:
                if (_value.equals("PHONE_CALL")) {
                    return EventRecord.EventType.PHONE_CALL;
                }
                break;
            case -277551464:
                if (_value.equals("MILESTONE_UPDATE")) {
                    return EventRecord.EventType.MILESTONE_UPDATE;
                }
                break;
            case -243362322:
                if (_value.equals("RESUME_CONTACT")) {
                    return EventRecord.EventType.RESUME_CONTACT;
                }
                break;
            case 71768:
                if (_value.equals("I2A")) {
                    return EventRecord.EventType.I2A;
                }
                break;
            case 433141802:
                if (_value.equals("UNKNOWN")) {
                    return EventRecord.EventType.UNKNOWN;
                }
                break;
            case 1672907751:
                if (_value.equals("MESSAGE")) {
                    return EventRecord.EventType.MESSAGE;
                }
                break;
            case 1886745116:
                if (_value.equals("INTERVIEW_EVENT")) {
                    return EventRecord.EventType.INTERVIEW_EVENT;
                }
                break;
        }
        l5.q("Can't convert value to enum, unknown value: ".concat(_value));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String __MessageSendStatus_enumToString(EventRecord.MessageSendStatus _value) {
        int i = WhenMappings.$EnumSwitchMapping$3[_value.ordinal()];
        if (i == 1) {
            return "SENDING";
        }
        if (i == 2) {
            return "FAILED";
        }
        l.g();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventRecord.MessageSendStatus __MessageSendStatus_stringToEnum(String _value) {
        if (wl7.b(_value, "SENDING")) {
            return EventRecord.MessageSendStatus.SENDING;
        }
        if (wl7.b(_value, "FAILED")) {
            return EventRecord.MessageSendStatus.FAILED;
        }
        l5.q(l5.l("Can't convert value to enum, unknown value: ", _value));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int countByConversationId$lambda$5(String str, String str2, zhd zhdVar) throws Exception {
        zhdVar.getClass();
        iid iidVarQ1 = zhdVar.Q1(str);
        try {
            iidVarQ1.R(1, str2);
            return iidVarQ1.M1() ? (int) iidVarQ1.getLong(0) : 0;
        } finally {
            iidVarQ1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g delete$lambda$6(String str, String str2, zhd zhdVar) throws Exception {
        zhdVar.getClass();
        iid iidVarQ1 = zhdVar.Q1(str);
        try {
            iidVarQ1.R(1, str2);
            iidVarQ1.M1();
            iidVarQ1.close();
            return j6g.a;
        } catch (Throwable th) {
            iidVarQ1.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventRecord findById$lambda$4(String str, String str2, EventDao_Impl eventDao_Impl, zhd zhdVar) throws Exception {
        zhdVar.getClass();
        iid iidVarQ1 = zhdVar.Q1(str);
        try {
            iidVarQ1.R(1, str2);
            int iK = q92.k("id", iidVarQ1);
            int iK2 = q92.k("type", iidVarQ1);
            int iK3 = q92.k("subType", iidVarQ1);
            int iK4 = q92.k("content", iidVarQ1);
            int iK5 = q92.k("isHtmlFormat", iidVarQ1);
            int iK6 = q92.k(NdkCrashLog.TIMESTAMP_KEY_NAME, iidVarQ1);
            int iK7 = q92.k("isLocalMessage", iidVarQ1);
            int iK8 = q92.k("senderRole", iidVarQ1);
            int iK9 = q92.k("senderAccountKey", iidVarQ1);
            int iK10 = q92.k("conversationId", iidVarQ1);
            int iK11 = q92.k("sendStatus", iidVarQ1);
            int iK12 = q92.k("attachments", iidVarQ1);
            int iK13 = q92.k("timelineModule", iidVarQ1);
            EventRecord eventRecord = null;
            String strR1 = null;
            if (iidVarQ1.M1()) {
                String strR12 = iidVarQ1.r1(iK);
                EventRecord.EventType eventType__EventType_stringToEnum = eventDao_Impl.__EventType_stringToEnum(iidVarQ1.r1(iK2));
                EventRecord.EventSubType eventSubType__EventSubType_stringToEnum = iidVarQ1.isNull(iK3) ? null : eventDao_Impl.__EventSubType_stringToEnum(iidVarQ1.r1(iK3));
                String strR13 = iidVarQ1.r1(iK4);
                boolean z = ((int) iidVarQ1.getLong(iK5)) != 0;
                long j = iidVarQ1.getLong(iK6);
                boolean z2 = ((int) iidVarQ1.getLong(iK7)) != 0;
                gy2 gy2Var__ConversationParticipantRole_stringToEnum = eventDao_Impl.__ConversationParticipantRole_stringToEnum(iidVarQ1.r1(iK8));
                String strR14 = iidVarQ1.isNull(iK9) ? null : iidVarQ1.r1(iK9);
                String strR15 = iidVarQ1.r1(iK10);
                EventRecord.MessageSendStatus messageSendStatus__MessageSendStatus_stringToEnum = iidVarQ1.isNull(iK11) ? null : eventDao_Impl.__MessageSendStatus_stringToEnum(iidVarQ1.r1(iK11));
                String strR16 = iidVarQ1.r1(iK12);
                eventDao_Impl.__converters.getClass();
                List listB = bz2.b(strR16);
                if (listB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.indeed.android.messaging.`data`.events.EventRecord.Attachment>', but it was NULL.");
                }
                if (!iidVarQ1.isNull(iK13)) {
                    strR1 = iidVarQ1.r1(iK13);
                }
                eventDao_Impl.__converters.getClass();
                eventRecord = new EventRecord(strR12, eventType__EventType_stringToEnum, eventSubType__EventSubType_stringToEnum, strR13, z, j, z2, gy2Var__ConversationParticipantRole_stringToEnum, strR14, strR15, messageSendStatus__MessageSendStatus_stringToEnum, listB, bz2.d(strR1));
            }
            iidVarQ1.close();
            return eventRecord;
        } catch (Throwable th) {
            iidVarQ1.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventRecord getLocalLastEvent$lambda$2(String str, String str2, EventDao_Impl eventDao_Impl, zhd zhdVar) throws Exception {
        zhdVar.getClass();
        iid iidVarQ1 = zhdVar.Q1(str);
        try {
            iidVarQ1.R(1, str2);
            int iK = q92.k("id", iidVarQ1);
            int iK2 = q92.k("type", iidVarQ1);
            int iK3 = q92.k("subType", iidVarQ1);
            int iK4 = q92.k("content", iidVarQ1);
            int iK5 = q92.k("isHtmlFormat", iidVarQ1);
            int iK6 = q92.k(NdkCrashLog.TIMESTAMP_KEY_NAME, iidVarQ1);
            int iK7 = q92.k("isLocalMessage", iidVarQ1);
            int iK8 = q92.k("senderRole", iidVarQ1);
            int iK9 = q92.k("senderAccountKey", iidVarQ1);
            int iK10 = q92.k("conversationId", iidVarQ1);
            int iK11 = q92.k("sendStatus", iidVarQ1);
            int iK12 = q92.k("attachments", iidVarQ1);
            int iK13 = q92.k("timelineModule", iidVarQ1);
            EventRecord eventRecord = null;
            String strR1 = null;
            if (iidVarQ1.M1()) {
                String strR12 = iidVarQ1.r1(iK);
                EventRecord.EventType eventType__EventType_stringToEnum = eventDao_Impl.__EventType_stringToEnum(iidVarQ1.r1(iK2));
                EventRecord.EventSubType eventSubType__EventSubType_stringToEnum = iidVarQ1.isNull(iK3) ? null : eventDao_Impl.__EventSubType_stringToEnum(iidVarQ1.r1(iK3));
                String strR13 = iidVarQ1.r1(iK4);
                boolean z = ((int) iidVarQ1.getLong(iK5)) != 0;
                long j = iidVarQ1.getLong(iK6);
                boolean z2 = ((int) iidVarQ1.getLong(iK7)) != 0;
                gy2 gy2Var__ConversationParticipantRole_stringToEnum = eventDao_Impl.__ConversationParticipantRole_stringToEnum(iidVarQ1.r1(iK8));
                String strR14 = iidVarQ1.isNull(iK9) ? null : iidVarQ1.r1(iK9);
                String strR15 = iidVarQ1.r1(iK10);
                EventRecord.MessageSendStatus messageSendStatus__MessageSendStatus_stringToEnum = iidVarQ1.isNull(iK11) ? null : eventDao_Impl.__MessageSendStatus_stringToEnum(iidVarQ1.r1(iK11));
                String strR16 = iidVarQ1.r1(iK12);
                eventDao_Impl.__converters.getClass();
                List listB = bz2.b(strR16);
                if (listB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.indeed.android.messaging.`data`.events.EventRecord.Attachment>', but it was NULL.");
                }
                if (!iidVarQ1.isNull(iK13)) {
                    strR1 = iidVarQ1.r1(iK13);
                }
                eventDao_Impl.__converters.getClass();
                eventRecord = new EventRecord(strR12, eventType__EventType_stringToEnum, eventSubType__EventSubType_stringToEnum, strR13, z, j, z2, gy2Var__ConversationParticipantRole_stringToEnum, strR14, strR15, messageSendStatus__MessageSendStatus_stringToEnum, listB, bz2.d(strR1));
            }
            iidVarQ1.close();
            return eventRecord;
        } catch (Throwable th) {
            iidVarQ1.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g getPagingEvents$lambda$1(String str, iid iidVar) {
        iidVar.getClass();
        iidVar.R(1, str);
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventRecord observeLastEvent$lambda$3(String str, String str2, EventDao_Impl eventDao_Impl, zhd zhdVar) throws Exception {
        zhdVar.getClass();
        iid iidVarQ1 = zhdVar.Q1(str);
        try {
            iidVarQ1.R(1, str2);
            int iK = q92.k("id", iidVarQ1);
            int iK2 = q92.k("type", iidVarQ1);
            int iK3 = q92.k("subType", iidVarQ1);
            int iK4 = q92.k("content", iidVarQ1);
            int iK5 = q92.k("isHtmlFormat", iidVarQ1);
            int iK6 = q92.k(NdkCrashLog.TIMESTAMP_KEY_NAME, iidVarQ1);
            int iK7 = q92.k("isLocalMessage", iidVarQ1);
            int iK8 = q92.k("senderRole", iidVarQ1);
            int iK9 = q92.k("senderAccountKey", iidVarQ1);
            int iK10 = q92.k("conversationId", iidVarQ1);
            int iK11 = q92.k("sendStatus", iidVarQ1);
            int iK12 = q92.k("attachments", iidVarQ1);
            int iK13 = q92.k("timelineModule", iidVarQ1);
            EventRecord eventRecord = null;
            String strR1 = null;
            if (iidVarQ1.M1()) {
                String strR12 = iidVarQ1.r1(iK);
                EventRecord.EventType eventType__EventType_stringToEnum = eventDao_Impl.__EventType_stringToEnum(iidVarQ1.r1(iK2));
                EventRecord.EventSubType eventSubType__EventSubType_stringToEnum = iidVarQ1.isNull(iK3) ? null : eventDao_Impl.__EventSubType_stringToEnum(iidVarQ1.r1(iK3));
                String strR13 = iidVarQ1.r1(iK4);
                boolean z = ((int) iidVarQ1.getLong(iK5)) != 0;
                long j = iidVarQ1.getLong(iK6);
                boolean z2 = ((int) iidVarQ1.getLong(iK7)) != 0;
                gy2 gy2Var__ConversationParticipantRole_stringToEnum = eventDao_Impl.__ConversationParticipantRole_stringToEnum(iidVarQ1.r1(iK8));
                String strR14 = iidVarQ1.isNull(iK9) ? null : iidVarQ1.r1(iK9);
                String strR15 = iidVarQ1.r1(iK10);
                EventRecord.MessageSendStatus messageSendStatus__MessageSendStatus_stringToEnum = iidVarQ1.isNull(iK11) ? null : eventDao_Impl.__MessageSendStatus_stringToEnum(iidVarQ1.r1(iK11));
                String strR16 = iidVarQ1.r1(iK12);
                eventDao_Impl.__converters.getClass();
                List listB = bz2.b(strR16);
                if (listB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.indeed.android.messaging.`data`.events.EventRecord.Attachment>', but it was NULL.");
                }
                if (!iidVarQ1.isNull(iK13)) {
                    strR1 = iidVarQ1.r1(iK13);
                }
                eventDao_Impl.__converters.getClass();
                eventRecord = new EventRecord(strR12, eventType__EventType_stringToEnum, eventSubType__EventSubType_stringToEnum, strR13, z, j, z2, gy2Var__ConversationParticipantRole_stringToEnum, strR14, strR15, messageSendStatus__MessageSendStatus_stringToEnum, listB, bz2.d(strR1));
            }
            iidVarQ1.close();
            return eventRecord;
        } catch (Throwable th) {
            iidVarQ1.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g saveEvent$lambda$0(EventDao_Impl eventDao_Impl, List list, zhd zhdVar) {
        zhdVar.getClass();
        eventDao_Impl.__insertAdapterOfEventRecord.insert(zhdVar, list);
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g updateSendStatus$lambda$7(String str, EventDao_Impl eventDao_Impl, EventRecord.MessageSendStatus messageSendStatus, String str2, zhd zhdVar) throws Exception {
        zhdVar.getClass();
        iid iidVarQ1 = zhdVar.Q1(str);
        try {
            iidVarQ1.R(1, eventDao_Impl.__MessageSendStatus_enumToString(messageSendStatus));
            iidVarQ1.R(2, str2);
            iidVarQ1.M1();
            iidVarQ1.close();
            return j6g.a;
        } catch (Throwable th) {
            iidVarQ1.close();
            throw th;
        }
    }

    @Override // com.indeed.android.messaging.data.events.EventDao
    public Object countByConversationId(String str, lu2<? super Integer> lu2Var) {
        return pg8.H(lu2Var, this.__db, new wx4(str, 0), true, false);
    }

    @Override // com.indeed.android.messaging.data.events.EventDao
    public Object delete(String str, lu2<? super j6g> lu2Var) throws Throwable {
        Object objH = pg8.H(lu2Var, this.__db, new vx4(str, 0), false, true);
        return objH == g13.a ? objH : j6g.a;
    }

    @Override // com.indeed.android.messaging.data.events.EventDao
    public Object findById(String str, lu2<? super EventRecord> lu2Var) {
        return pg8.H(lu2Var, this.__db, new mt(4, str, this), true, false);
    }

    @Override // com.indeed.android.messaging.data.events.EventDao
    public Object getLocalLastEvent(String str, lu2<? super EventRecord> lu2Var) {
        return pg8.H(lu2Var, this.__db, new qs0(7, str, this), true, false);
    }

    @Override // com.indeed.android.messaging.data.events.EventDao
    public r2b<Integer, EventRecord> getPagingEvents(String conversationId) {
        conversationId.getClass();
        return new C06561(new kfd("SELECT * FROM eventrecord WHERE conversationId = ? ORDER BY timestamp DESC", new ux4(conversationId, 0)), this, this.__db, new String[]{"eventrecord"});
    }

    @Override // com.indeed.android.messaging.data.events.EventDao
    public vi5<EventRecord> observeLastEvent(String conversationId) {
        conversationId.getClass();
        return ee3.k(this.__db, false, new String[]{"eventrecord"}, new ev2(1, conversationId, this));
    }

    @Override // com.indeed.android.messaging.data.events.EventDao
    public Object replaceMessage(String str, String str2, lu2<? super EventRecord> lu2Var) {
        return pg8.G(this.__db, new AnonymousClass2(str, str2, null), lu2Var);
    }

    @Override // com.indeed.android.messaging.data.events.EventDao
    public Object saveEvent(List<EventRecord> list, lu2<? super j6g> lu2Var) throws Throwable {
        Object objH = pg8.H(lu2Var, this.__db, new nm1(2, this, list), false, true);
        return objH == g13.a ? objH : j6g.a;
    }

    @Override // com.indeed.android.messaging.data.events.EventDao
    public Object updateSendStatus(String str, EventRecord.MessageSendStatus messageSendStatus, lu2<? super j6g> lu2Var) throws Throwable {
        Object objH = pg8.H(lu2Var, this.__db, new xx4(0, this, messageSendStatus, str), false, true);
        return objH == g13.a ? objH : j6g.a;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/indeed/android/messaging/data/events/EventDao_Impl$Companion;", "", "<init>", "()V", "", "Lyd8;", "getRequiredConverters", "()Ljava/util/List;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<yd8<?>> getRequiredConverters() {
            return zr4.a;
        }

        private Companion() {
        }
    }
}
