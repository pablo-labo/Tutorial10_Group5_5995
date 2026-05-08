package com.indeed.android.messaging.data.conversations;

import android.database.SQLException;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.messaging.data.events.EventRecord;
import defpackage.av2;
import defpackage.bz2;
import defpackage.c1f;
import defpackage.df;
import defpackage.dmc;
import defpackage.ee3;
import defpackage.ev2;
import defpackage.fv2;
import defpackage.g13;
import defpackage.gt0;
import defpackage.gv2;
import defpackage.gy2;
import defpackage.ha7;
import defpackage.ht0;
import defpackage.hv2;
import defpackage.iid;
import defpackage.iv2;
import defpackage.j6g;
import defpackage.l;
import defpackage.l5;
import defpackage.lu2;
import defpackage.mt;
import defpackage.mve;
import defpackage.nm1;
import defpackage.nv4;
import defpackage.pg8;
import defpackage.pv4;
import defpackage.q6;
import defpackage.q92;
import defpackage.qs0;
import defpackage.r29;
import defpackage.r6;
import defpackage.r7d;
import defpackage.rv4;
import defpackage.s98;
import defpackage.sw2;
import defpackage.uh3;
import defpackage.vi5;
import defpackage.w47;
import defpackage.xed;
import defpackage.yd8;
import defpackage.zhd;
import defpackage.zr4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 K2\u00020\u0001:\u0001KB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\tH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00192\u0006\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b!\u0010\"J&\u0010$\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b$\u0010%J \u0010&\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b(\u0010\"J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010*\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0017H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00062\u0006\u0010*\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J-\u00109\u001a\u00020\f2\u0006\u00106\u001a\u0002052\u0014\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u001307H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020-2\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u0002022\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000f0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010F¨\u0006L"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/ConversationDao_Impl;", "Lcom/indeed/android/messaging/data/conversations/ConversationDao;", "Lxed;", "__db", "<init>", "(Lxed;)V", "", "conversationId", "content", "", "Lcom/indeed/android/messaging/data/events/EventRecord$Attachment;", "attachments", "Lj6g;", "saveConversationDraft", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Llu2;)Ljava/lang/Object;", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "conversationRecord", "saveConversations", "(Ljava/util/List;Llu2;)Ljava/lang/Object;", "Lcom/indeed/android/messaging/data/conversations/DraftRecord;", "draft", "upsertConversationDraft", "(Lcom/indeed/android/messaging/data/conversations/DraftRecord;Llu2;)Ljava/lang/Object;", "Lw47;", "folder", "Lvi5;", "Lcom/indeed/android/messaging/data/conversations/ConversationWithDraft;", "observeConversationList", "(Lw47;)Lvi5;", "observeDraftConversations", "id", "findById", "(Ljava/lang/String;)Lvi5;", "getDraftById", "(Ljava/lang/String;Llu2;)Ljava/lang/Object;", "existingIds", "clearOutdatedConversations", "(Ljava/util/List;Lw47;Llu2;)Ljava/lang/Object;", "updateConversationFolder", "(Ljava/lang/String;Lw47;Llu2;)Ljava/lang/Object;", "deleteDraft", "Lsw2;", "_value", "__ConversationEventType_enumToString", "(Lsw2;)Ljava/lang/String;", "Lgy2;", "__ConversationParticipantRole_enumToString", "(Lgy2;)Ljava/lang/String;", "__InboxFolder_enumToString", "(Lw47;)Ljava/lang/String;", "Lr29;", "__LockReason_enumToString", "(Lr29;)Ljava/lang/String;", "Lzhd;", "_connection", "Lht0;", "_map", "__fetchRelationshipDraftRecordAscomIndeedAndroidMessagingDataConversationsDraftRecord", "(Lzhd;Lht0;)V", "__ConversationEventType_stringToEnum", "(Ljava/lang/String;)Lsw2;", "__ConversationParticipantRole_stringToEnum", "(Ljava/lang/String;)Lgy2;", "__InboxFolder_stringToEnum", "(Ljava/lang/String;)Lw47;", "__LockReason_stringToEnum", "(Ljava/lang/String;)Lr29;", "Lxed;", "Lrv4;", "__upsertAdapterOfConversationRecord", "Lrv4;", "Lbz2;", "__converters", "Lbz2;", "__upsertAdapterOfDraftRecord", "Companion", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConversationDao_Impl implements ConversationDao {
    private final bz2 __converters;
    private final xed __db;
    private final rv4<ConversationRecord> __upsertAdapterOfConversationRecord;
    private final rv4<DraftRecord> __upsertAdapterOfDraftRecord;

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
            int[] iArr = new int[sw2.values().length];
            try {
                sw2.a aVar = sw2.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                sw2.a aVar2 = sw2.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                sw2.a aVar3 = sw2.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                sw2.a aVar4 = sw2.a;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                sw2.a aVar5 = sw2.a;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                sw2.a aVar6 = sw2.a;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                sw2.a aVar7 = sw2.a;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                sw2.a aVar8 = sw2.a;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                sw2.a aVar9 = sw2.a;
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                sw2.a aVar10 = sw2.a;
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                sw2.a aVar11 = sw2.a;
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                sw2.a aVar12 = sw2.a;
                iArr[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                sw2.a aVar13 = sw2.a;
                iArr[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                sw2.a aVar14 = sw2.a;
                iArr[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                sw2.a aVar15 = sw2.a;
                iArr[14] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                sw2.a aVar16 = sw2.a;
                iArr[15] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                sw2.a aVar17 = sw2.a;
                iArr[16] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                sw2.a aVar18 = sw2.a;
                iArr[17] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                sw2.a aVar19 = sw2.a;
                iArr[18] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                sw2.a aVar20 = sw2.a;
                iArr[19] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                sw2.a aVar21 = sw2.a;
                iArr[20] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                sw2.a aVar22 = sw2.a;
                iArr[21] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[gy2.values().length];
            try {
                gy2.a aVar23 = gy2.a;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                gy2.a aVar24 = gy2.a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                gy2.a aVar25 = gy2.a;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                gy2.a aVar26 = gy2.a;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                gy2.a aVar27 = gy2.a;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[w47.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[r29.values().length];
            try {
                r29.a aVar28 = r29.a;
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                r29.a aVar29 = r29.a;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                r29.a aVar30 = r29.a;
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                r29.a aVar31 = r29.a;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused35) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX INFO: renamed from: com.indeed.android.messaging.data.conversations.ConversationDao_Impl$saveConversationDraft$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lj6g;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    @uh3(c = "com.indeed.android.messaging.data.conversations.ConversationDao_Impl$saveConversationDraft$2", f = "ConversationDao_Impl.kt", l = {310}, m = "invokeSuspend")
    public static final class C06302 extends c1f implements Function1<lu2<? super j6g>, Object> {
        final /* synthetic */ List<EventRecord.Attachment> $attachments;
        final /* synthetic */ String $content;
        final /* synthetic */ String $conversationId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06302(String str, String str2, List<EventRecord.Attachment> list, lu2<? super C06302> lu2Var) {
            super(1, lu2Var);
            this.$conversationId = str;
            this.$content = str2;
            this.$attachments = list;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(lu2<?> lu2Var) {
            return ConversationDao_Impl.this.new C06302(this.$conversationId, this.$content, this.$attachments, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(lu2<? super j6g> lu2Var) {
            return ((C06302) create(lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                ConversationDao_Impl conversationDao_Impl = ConversationDao_Impl.this;
                String str = this.$conversationId;
                String str2 = this.$content;
                List<EventRecord.Attachment> list = this.$attachments;
                this.label = 1;
                Object objSaveConversationDraft = ConversationDao_Impl.super.saveConversationDraft(str, str2, list, this);
                g13 g13Var = g13.a;
                if (objSaveConversationDraft == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public ConversationDao_Impl(xed xedVar) {
        xedVar.getClass();
        this.__converters = new bz2();
        this.__db = xedVar;
        this.__upsertAdapterOfConversationRecord = new rv4<>(new pv4<ConversationRecord>() { // from class: com.indeed.android.messaging.data.conversations.ConversationDao_Impl.1
            @Override // defpackage.pv4
            public void bind(iid statement, ConversationRecord entity) {
                String strName;
                statement.getClass();
                entity.getClass();
                statement.R(1, entity.getId());
                statement.R(2, entity.getCompanyName());
                bz2 bz2Var = ConversationDao_Impl.this.__converters;
                List<ConversationRecord.Participant> participants = entity.getParticipants();
                bz2Var.getClass();
                participants.getClass();
                s98.a aVar = s98.d;
                aVar.getClass();
                statement.R(3, aVar.b(new gt0(ConversationRecord.Participant.INSTANCE.serializer(), 0), participants));
                String lastEventId = entity.getLastEventId();
                if (lastEventId == null) {
                    statement.u(4);
                } else {
                    statement.R(4, lastEventId);
                }
                sw2 lastEventType = entity.getLastEventType();
                if (lastEventType == null) {
                    statement.u(5);
                } else {
                    statement.R(5, ConversationDao_Impl.this.__ConversationEventType_enumToString(lastEventType));
                }
                statement.R(6, ConversationDao_Impl.this.__ConversationParticipantRole_enumToString(entity.getLastEventSenderRole()));
                statement.q(7, entity.getLastEventTimestamp());
                statement.R(8, entity.getLastMessagePreview());
                String lastEventAttachmentPreview = entity.getLastEventAttachmentPreview();
                if (lastEventAttachmentPreview == null) {
                    statement.u(9);
                } else {
                    statement.R(9, lastEventAttachmentPreview);
                }
                statement.q(10, entity.getUnreadCount());
                Long readReceiptCursorTimestamp = entity.getReadReceiptCursorTimestamp();
                if (readReceiptCursorTimestamp == null) {
                    statement.u(11);
                } else {
                    statement.q(11, readReceiptCursorTimestamp.longValue());
                }
                Long readCursorTimestamp = entity.getReadCursorTimestamp();
                if (readCursorTimestamp == null) {
                    statement.u(12);
                } else {
                    statement.q(12, readCursorTimestamp.longValue());
                }
                statement.q(13, entity.getAwaitingJobSeekerResponse() ? 1L : 0L);
                statement.R(14, ConversationDao_Impl.this.__InboxFolder_enumToString(entity.getFolder()));
                bz2 bz2Var2 = ConversationDao_Impl.this.__converters;
                av2 conversationContext = entity.getConversationContext();
                bz2Var2.getClass();
                if (conversationContext == null || (strName = conversationContext.name()) == null) {
                    strName = "";
                }
                statement.R(15, strName);
                r29 lockReason = entity.getLockReason();
                if (lockReason == null) {
                    statement.u(16);
                } else {
                    statement.R(16, ConversationDao_Impl.this.__LockReason_enumToString(lockReason));
                }
                Long lockDateTimestamp = entity.getLockDateTimestamp();
                if (lockDateTimestamp == null) {
                    statement.u(17);
                } else {
                    statement.q(17, lockDateTimestamp.longValue());
                }
                Long jobSeekerApplicationDateTimestamp = entity.getJobSeekerApplicationDateTimestamp();
                if (jobSeekerApplicationDateTimestamp == null) {
                    statement.u(18);
                } else {
                    statement.q(18, jobSeekerApplicationDateTimestamp.longValue());
                }
                statement.R(19, entity.getCompanyLogoUrl());
                if (entity.getCompanyAverageRating() == null) {
                    statement.u(20);
                } else {
                    statement.e(20, r1.floatValue());
                }
                String advertiserKey = entity.getAdvertiserKey();
                if (advertiserKey == null) {
                    statement.u(21);
                } else {
                    statement.R(21, advertiserKey);
                }
                statement.q(22, entity.isExisting() ? 1L : 0L);
                ConversationRecord.ConversationJobData job = entity.getJob();
                String title = job.getTitle();
                if (title == null) {
                    statement.u(23);
                } else {
                    statement.R(23, title);
                }
                String location = job.getLocation();
                if (location == null) {
                    statement.u(24);
                } else {
                    statement.R(24, location);
                }
                String jobKey = job.getJobKey();
                if (jobKey == null) {
                    statement.u(25);
                } else {
                    statement.R(25, jobKey);
                }
                String compensationFormatted = job.getCompensationFormatted();
                if (compensationFormatted == null) {
                    statement.u(26);
                } else {
                    statement.R(26, compensationFormatted);
                }
                bz2 bz2Var3 = ConversationDao_Impl.this.__converters;
                List<String> attributes = job.getAttributes();
                bz2Var3.getClass();
                attributes.getClass();
                aVar.getClass();
                statement.R(27, aVar.b(new gt0(mve.a, 0), attributes));
            }

            @Override // defpackage.pv4
            public String createQuery() {
                return "INSERT INTO `ConversationRecord` (`id`,`companyName`,`participants`,`lastEventId`,`lastEventType`,`lastEventSenderRole`,`lastEventTimestamp`,`lastMessagePreview`,`lastEventAttachmentPreview`,`unreadCount`,`readReceiptCursorTimestamp`,`readCursorTimestamp`,`awaitingJobSeekerResponse`,`folder`,`conversationContext`,`lockReason`,`lockDateTimestamp`,`jobSeekerApplicationDateTimestamp`,`companyLogoUrl`,`companyAverageRating`,`advertiserKey`,`isExisting`,`job_title`,`job_location`,`job_jobKey`,`job_compensationFormatted`,`job_attributes`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        }, new nv4<ConversationRecord>() { // from class: com.indeed.android.messaging.data.conversations.ConversationDao_Impl.2
            @Override // defpackage.nv4
            public void bind(iid statement, ConversationRecord entity) {
                String strName;
                statement.getClass();
                entity.getClass();
                statement.R(1, entity.getId());
                statement.R(2, entity.getCompanyName());
                bz2 bz2Var = ConversationDao_Impl.this.__converters;
                List<ConversationRecord.Participant> participants = entity.getParticipants();
                bz2Var.getClass();
                participants.getClass();
                s98.a aVar = s98.d;
                aVar.getClass();
                statement.R(3, aVar.b(new gt0(ConversationRecord.Participant.INSTANCE.serializer(), 0), participants));
                String lastEventId = entity.getLastEventId();
                if (lastEventId == null) {
                    statement.u(4);
                } else {
                    statement.R(4, lastEventId);
                }
                sw2 lastEventType = entity.getLastEventType();
                if (lastEventType == null) {
                    statement.u(5);
                } else {
                    statement.R(5, ConversationDao_Impl.this.__ConversationEventType_enumToString(lastEventType));
                }
                statement.R(6, ConversationDao_Impl.this.__ConversationParticipantRole_enumToString(entity.getLastEventSenderRole()));
                statement.q(7, entity.getLastEventTimestamp());
                statement.R(8, entity.getLastMessagePreview());
                String lastEventAttachmentPreview = entity.getLastEventAttachmentPreview();
                if (lastEventAttachmentPreview == null) {
                    statement.u(9);
                } else {
                    statement.R(9, lastEventAttachmentPreview);
                }
                statement.q(10, entity.getUnreadCount());
                Long readReceiptCursorTimestamp = entity.getReadReceiptCursorTimestamp();
                if (readReceiptCursorTimestamp == null) {
                    statement.u(11);
                } else {
                    statement.q(11, readReceiptCursorTimestamp.longValue());
                }
                Long readCursorTimestamp = entity.getReadCursorTimestamp();
                if (readCursorTimestamp == null) {
                    statement.u(12);
                } else {
                    statement.q(12, readCursorTimestamp.longValue());
                }
                statement.q(13, entity.getAwaitingJobSeekerResponse() ? 1L : 0L);
                statement.R(14, ConversationDao_Impl.this.__InboxFolder_enumToString(entity.getFolder()));
                bz2 bz2Var2 = ConversationDao_Impl.this.__converters;
                av2 conversationContext = entity.getConversationContext();
                bz2Var2.getClass();
                if (conversationContext == null || (strName = conversationContext.name()) == null) {
                    strName = "";
                }
                statement.R(15, strName);
                r29 lockReason = entity.getLockReason();
                if (lockReason == null) {
                    statement.u(16);
                } else {
                    statement.R(16, ConversationDao_Impl.this.__LockReason_enumToString(lockReason));
                }
                Long lockDateTimestamp = entity.getLockDateTimestamp();
                if (lockDateTimestamp == null) {
                    statement.u(17);
                } else {
                    statement.q(17, lockDateTimestamp.longValue());
                }
                Long jobSeekerApplicationDateTimestamp = entity.getJobSeekerApplicationDateTimestamp();
                if (jobSeekerApplicationDateTimestamp == null) {
                    statement.u(18);
                } else {
                    statement.q(18, jobSeekerApplicationDateTimestamp.longValue());
                }
                statement.R(19, entity.getCompanyLogoUrl());
                if (entity.getCompanyAverageRating() == null) {
                    statement.u(20);
                } else {
                    statement.e(20, r1.floatValue());
                }
                String advertiserKey = entity.getAdvertiserKey();
                if (advertiserKey == null) {
                    statement.u(21);
                } else {
                    statement.R(21, advertiserKey);
                }
                statement.q(22, entity.isExisting() ? 1L : 0L);
                ConversationRecord.ConversationJobData job = entity.getJob();
                String title = job.getTitle();
                if (title == null) {
                    statement.u(23);
                } else {
                    statement.R(23, title);
                }
                String location = job.getLocation();
                if (location == null) {
                    statement.u(24);
                } else {
                    statement.R(24, location);
                }
                String jobKey = job.getJobKey();
                if (jobKey == null) {
                    statement.u(25);
                } else {
                    statement.R(25, jobKey);
                }
                String compensationFormatted = job.getCompensationFormatted();
                if (compensationFormatted == null) {
                    statement.u(26);
                } else {
                    statement.R(26, compensationFormatted);
                }
                bz2 bz2Var3 = ConversationDao_Impl.this.__converters;
                List<String> attributes = job.getAttributes();
                bz2Var3.getClass();
                attributes.getClass();
                aVar.getClass();
                statement.R(27, aVar.b(new gt0(mve.a, 0), attributes));
                statement.R(28, entity.getId());
            }

            @Override // defpackage.nv4
            public String createQuery() {
                return "UPDATE `ConversationRecord` SET `id` = ?,`companyName` = ?,`participants` = ?,`lastEventId` = ?,`lastEventType` = ?,`lastEventSenderRole` = ?,`lastEventTimestamp` = ?,`lastMessagePreview` = ?,`lastEventAttachmentPreview` = ?,`unreadCount` = ?,`readReceiptCursorTimestamp` = ?,`readCursorTimestamp` = ?,`awaitingJobSeekerResponse` = ?,`folder` = ?,`conversationContext` = ?,`lockReason` = ?,`lockDateTimestamp` = ?,`jobSeekerApplicationDateTimestamp` = ?,`companyLogoUrl` = ?,`companyAverageRating` = ?,`advertiserKey` = ?,`isExisting` = ?,`job_title` = ?,`job_location` = ?,`job_jobKey` = ?,`job_compensationFormatted` = ?,`job_attributes` = ? WHERE `id` = ?";
            }
        });
        this.__upsertAdapterOfDraftRecord = new rv4<>(new pv4<DraftRecord>() { // from class: com.indeed.android.messaging.data.conversations.ConversationDao_Impl.3
            @Override // defpackage.pv4
            public void bind(iid statement, DraftRecord entity) {
                statement.getClass();
                entity.getClass();
                statement.R(1, entity.getConversationId());
                statement.R(2, entity.getContent());
                bz2 bz2Var = ConversationDao_Impl.this.__converters;
                List<EventRecord.Attachment> attachments = entity.getAttachments();
                bz2Var.getClass();
                statement.R(3, bz2.e(attachments));
            }

            @Override // defpackage.pv4
            public String createQuery() {
                return "INSERT INTO `DraftRecord` (`conversationId`,`content`,`attachments`) VALUES (?,?,?)";
            }
        }, new nv4<DraftRecord>() { // from class: com.indeed.android.messaging.data.conversations.ConversationDao_Impl.4
            @Override // defpackage.nv4
            public void bind(iid statement, DraftRecord entity) {
                statement.getClass();
                entity.getClass();
                statement.R(1, entity.getConversationId());
                statement.R(2, entity.getContent());
                bz2 bz2Var = ConversationDao_Impl.this.__converters;
                List<EventRecord.Attachment> attachments = entity.getAttachments();
                bz2Var.getClass();
                statement.R(3, bz2.e(attachments));
                statement.R(4, entity.getConversationId());
            }

            @Override // defpackage.nv4
            public String createQuery() {
                return "UPDATE `DraftRecord` SET `conversationId` = ?,`content` = ?,`attachments` = ? WHERE `conversationId` = ?";
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String __ConversationEventType_enumToString(sw2 _value) {
        switch (WhenMappings.$EnumSwitchMapping$0[_value.ordinal()]) {
            case 1:
                return "MESSAGE";
            case 2:
                return "PHONE";
            case 3:
                return "UNKNOWN";
            case 4:
                return "DRADIS_CALLBACK_REQUEST";
            case 5:
                return "CALLBACK";
            case 6:
                return "RESUME_CONTACT_INITIATED";
            case 7:
                return "RESUME_CONTACT_ACCEPTED";
            case 8:
                return "RESUME_CONTACT_DECLINED";
            case DatadogLogGenerator.CRASH /* 9 */:
                return "INTERVIEW_EMPLOYER_REQUEST";
            case 10:
                return "INTERVIEW_JOBSEEKER_SCHEDULE";
            case 11:
                return "INTERVIEW_EMPLOYER_UPDATE_RESET";
            case 12:
                return "INTERVIEW_EMPLOYER_UPDATE_MAINTAIN";
            case 13:
                return "INTERVIEW_EMPLOYER_CANCEL";
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return "INTERVIEW_JOBSEEKER_DECLINE";
            case 15:
                return "INTERVIEW_JOBSEEKER_REQUEST_NEW_TIMES";
            case 16:
                return "INTERVIEW_JOBSEEKER_CANCEL";
            case 17:
                return "INTERVIEW_CONFIRMATION_EMAIL";
            case 18:
                return "INTERVIEW_JOBSEEKER_REQUEST_NEW_TIMES_SCHEDULED";
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return "I2A_INVITE";
            case 20:
                return "C2I_CALL_HISTORY";
            case 21:
                return "CANDIDATE_DISPOSITION_NOTIFICATION";
            case 22:
                return "UNKNOWN__";
            default:
                l.g();
                return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final sw2 __ConversationEventType_stringToEnum(String _value) {
        switch (_value.hashCode()) {
            case -1592024715:
                if (_value.equals("INTERVIEW_JOBSEEKER_CANCEL")) {
                    return sw2.g0;
                }
                break;
            case -1586532720:
                if (_value.equals("INTERVIEW_CONFIRMATION_EMAIL")) {
                    return sw2.h0;
                }
                break;
            case -1502138670:
                if (_value.equals("INTERVIEW_JOBSEEKER_SCHEDULE")) {
                    return sw2.a0;
                }
                break;
            case -1372621287:
                if (_value.equals("DRADIS_CALLBACK_REQUEST")) {
                    return sw2.f;
                }
                break;
            case -1313644535:
                if (_value.equals("INTERVIEW_EMPLOYER_REQUEST")) {
                    return sw2.Z;
                }
                break;
            case -1299914742:
                if (_value.equals("INTERVIEW_JOBSEEKER_REQUEST_NEW_TIMES_SCHEDULED")) {
                    return sw2.i0;
                }
                break;
            case -1115992261:
                if (_value.equals("INTERVIEW_JOBSEEKER_DECLINE")) {
                    return sw2.e0;
                }
                break;
            case -886110760:
                if (_value.equals("C2I_CALL_HISTORY")) {
                    return sw2.k0;
                }
                break;
            case -614160992:
                if (_value.equals("INTERVIEW_EMPLOYER_CANCEL")) {
                    return sw2.d0;
                }
                break;
            case -362552950:
                if (_value.equals("UNKNOWN__")) {
                    return sw2.m0;
                }
                break;
            case 76105038:
                if (_value.equals("PHONE")) {
                    return sw2.d;
                }
                break;
            case 222909279:
                if (_value.equals("RESUME_CONTACT_DECLINED")) {
                    return sw2.Y;
                }
                break;
            case 244848623:
                if (_value.equals("CANDIDATE_DISPOSITION_NOTIFICATION")) {
                    return sw2.l0;
                }
                break;
            case 261966047:
                if (_value.equals("INTERVIEW_EMPLOYER_UPDATE_RESET")) {
                    return sw2.b0;
                }
                break;
            case 433141802:
                if (_value.equals("UNKNOWN")) {
                    return sw2.e;
                }
                break;
            case 552629456:
                if (_value.equals("I2A_INVITE")) {
                    return sw2.j0;
                }
                break;
            case 577429500:
                if (_value.equals("INTERVIEW_JOBSEEKER_REQUEST_NEW_TIMES")) {
                    return sw2.f0;
                }
                break;
            case 610406469:
                if (_value.equals("CALLBACK")) {
                    return sw2.V;
                }
                break;
            case 617849819:
                if (_value.equals("INTERVIEW_EMPLOYER_UPDATE_MAINTAIN")) {
                    return sw2.c0;
                }
                break;
            case 1672907751:
                if (_value.equals("MESSAGE")) {
                    return sw2.c;
                }
                break;
            case 1803155160:
                if (_value.equals("RESUME_CONTACT_ACCEPTED")) {
                    return sw2.X;
                }
                break;
            case 1932021690:
                if (_value.equals("RESUME_CONTACT_INITIATED")) {
                    return sw2.W;
                }
                break;
        }
        l5.q("Can't convert value to enum, unknown value: ".concat(_value));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String __ConversationParticipantRole_enumToString(gy2 _value) {
        int i = WhenMappings.$EnumSwitchMapping$1[_value.ordinal()];
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final gy2 __ConversationParticipantRole_stringToEnum(String _value) {
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
    public final String __InboxFolder_enumToString(w47 _value) {
        int i = WhenMappings.$EnumSwitchMapping$2[_value.ordinal()];
        if (i == 1) {
            return "INBOX";
        }
        if (i == 2) {
            return "ARCHIVE";
        }
        if (i == 3) {
            return "SPAM";
        }
        if (i == 4) {
            return "DRAFTS";
        }
        l.g();
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final w47 __InboxFolder_stringToEnum(String _value) {
        switch (_value.hashCode()) {
            case -30118750:
                if (_value.equals("ARCHIVE")) {
                    return w47.ARCHIVE;
                }
                break;
            case 2551625:
                if (_value.equals("SPAM")) {
                    return w47.SPAM;
                }
                break;
            case 69806694:
                if (_value.equals("INBOX")) {
                    return w47.INBOX;
                }
                break;
            case 2024517362:
                if (_value.equals("DRAFTS")) {
                    return w47.DRAFTS;
                }
                break;
        }
        l5.q("Can't convert value to enum, unknown value: ".concat(_value));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String __LockReason_enumToString(r29 _value) {
        int i = WhenMappings.$EnumSwitchMapping$3[_value.ordinal()];
        if (i == 1) {
            return "BROADCAST_INELIGIBLE";
        }
        if (i == 2) {
            return "DEPRECATED_PRODUCT";
        }
        if (i == 3) {
            return "IMS_NOT_MIGRATED";
        }
        if (i == 4) {
            return "UNKNOWN__";
        }
        l.g();
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final r29 __LockReason_stringToEnum(String _value) {
        switch (_value.hashCode()) {
            case -1425761190:
                if (_value.equals("BROADCAST_INELIGIBLE")) {
                    return r29.c;
                }
                break;
            case -362552950:
                if (_value.equals("UNKNOWN__")) {
                    return r29.f;
                }
                break;
            case 897576515:
                if (_value.equals("DEPRECATED_PRODUCT")) {
                    return r29.d;
                }
                break;
            case 1635561141:
                if (_value.equals("IMS_NOT_MIGRATED")) {
                    return r29.e;
                }
                break;
        }
        l5.q("Can't convert value to enum, unknown value: ".concat(_value));
        return null;
    }

    private final void __fetchRelationshipDraftRecordAscomIndeedAndroidMessagingDataConversationsDraftRecord(zhd _connection, ht0<String, DraftRecord> _map) throws Exception {
        ht0.c cVar = (ht0.c) _map.keySet();
        ht0 ht0Var = ht0.this;
        if (ht0Var.isEmpty()) {
            return;
        }
        if (_map.c > 999) {
            ht0 ht0Var2 = new ht0(999);
            int i = _map.c;
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                ht0Var2.put(_map.h(i2), null);
                i2++;
                i3++;
                if (i3 == 999) {
                    __fetchRelationshipDraftRecordAscomIndeedAndroidMessagingDataConversationsDraftRecord$lambda$9(this, _connection, ht0Var2);
                    _map.putAll(ht0Var2);
                    ht0Var2.clear();
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                __fetchRelationshipDraftRecordAscomIndeedAndroidMessagingDataConversationsDraftRecord$lambda$9(this, _connection, ht0Var2);
                _map.putAll(ht0Var2);
                return;
            }
            return;
        }
        StringBuilder sbG = q6.g("SELECT `conversationId`,`content`,`attachments` FROM `DraftRecord` WHERE `conversationId` IN (");
        dmc.c(ht0Var.c, sbG);
        sbG.append(")");
        iid iidVarQ1 = _connection.Q1(sbG.toString());
        Iterator it = cVar.iterator();
        int i4 = 1;
        while (true) {
            ha7 ha7Var = (ha7) it;
            if (!ha7Var.hasNext()) {
                try {
                    break;
                } catch (Throwable th) {
                    iidVarQ1.close();
                    throw th;
                }
            }
            iidVarQ1.R(i4, (String) ha7Var.next());
            i4++;
        }
        iidVarQ1.getClass();
        int iF = q92.f("conversationId", iidVarQ1);
        if (iF == -1) {
            iidVarQ1.close();
            return;
        }
        while (iidVarQ1.M1()) {
            String strR1 = iidVarQ1.r1(iF);
            if (_map.containsKey(strR1)) {
                String strR12 = iidVarQ1.r1(0);
                String strR13 = iidVarQ1.r1(1);
                String strR14 = iidVarQ1.r1(2);
                this.__converters.getClass();
                List listB = bz2.b(strR14);
                if (listB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.indeed.android.messaging.`data`.events.EventRecord.Attachment>', but it was NULL.");
                }
                _map.put(strR1, new DraftRecord(strR12, strR13, listB));
            }
        }
        iidVarQ1.close();
    }

    private static final j6g __fetchRelationshipDraftRecordAscomIndeedAndroidMessagingDataConversationsDraftRecord$lambda$9(ConversationDao_Impl conversationDao_Impl, zhd zhdVar, ht0 ht0Var) {
        ht0Var.getClass();
        conversationDao_Impl.__fetchRelationshipDraftRecordAscomIndeedAndroidMessagingDataConversationsDraftRecord(zhdVar, ht0Var);
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g clearOutdatedConversations$lambda$6(String str, ConversationDao_Impl conversationDao_Impl, w47 w47Var, List list, zhd zhdVar) throws Exception {
        zhdVar.getClass();
        iid iidVarQ1 = zhdVar.Q1(str);
        try {
            iidVarQ1.R(1, conversationDao_Impl.__InboxFolder_enumToString(w47Var));
            Iterator it = list.iterator();
            int i = 2;
            while (it.hasNext()) {
                iidVarQ1.R(i, (String) it.next());
                i++;
            }
            iidVarQ1.M1();
            iidVarQ1.close();
            return j6g.a;
        } catch (Throwable th) {
            iidVarQ1.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g deleteDraft$lambda$8(String str, String str2, zhd zhdVar) throws Exception {
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
    public static final ConversationRecord findById$lambda$4(String str, String str2, ConversationDao_Impl conversationDao_Impl, zhd zhdVar) throws Exception {
        av2 av2VarValueOf;
        zhdVar.getClass();
        iid iidVarQ1 = zhdVar.Q1(str);
        try {
            iidVarQ1.R(1, str2);
            int iK = q92.k("id", iidVarQ1);
            int iK2 = q92.k("companyName", iidVarQ1);
            int iK3 = q92.k("participants", iidVarQ1);
            int iK4 = q92.k("lastEventId", iidVarQ1);
            int iK5 = q92.k("lastEventType", iidVarQ1);
            int iK6 = q92.k("lastEventSenderRole", iidVarQ1);
            int iK7 = q92.k("lastEventTimestamp", iidVarQ1);
            int iK8 = q92.k("lastMessagePreview", iidVarQ1);
            int iK9 = q92.k("lastEventAttachmentPreview", iidVarQ1);
            int iK10 = q92.k("unreadCount", iidVarQ1);
            int iK11 = q92.k("readReceiptCursorTimestamp", iidVarQ1);
            int iK12 = q92.k("readCursorTimestamp", iidVarQ1);
            int iK13 = q92.k("awaitingJobSeekerResponse", iidVarQ1);
            int iK14 = q92.k("folder", iidVarQ1);
            int iK15 = q92.k("conversationContext", iidVarQ1);
            int iK16 = q92.k("lockReason", iidVarQ1);
            int iK17 = q92.k("lockDateTimestamp", iidVarQ1);
            int iK18 = q92.k("jobSeekerApplicationDateTimestamp", iidVarQ1);
            int iK19 = q92.k("companyLogoUrl", iidVarQ1);
            int iK20 = q92.k("companyAverageRating", iidVarQ1);
            int iK21 = q92.k("advertiserKey", iidVarQ1);
            int iK22 = q92.k("isExisting", iidVarQ1);
            int iK23 = q92.k("job_title", iidVarQ1);
            int iK24 = q92.k("job_location", iidVarQ1);
            int iK25 = q92.k("job_jobKey", iidVarQ1);
            int iK26 = q92.k("job_compensationFormatted", iidVarQ1);
            int iK27 = q92.k("job_attributes", iidVarQ1);
            ConversationRecord conversationRecord = null;
            if (iidVarQ1.M1()) {
                String strR1 = iidVarQ1.r1(iK);
                String strR12 = iidVarQ1.r1(iK2);
                String strR13 = iidVarQ1.r1(iK3);
                conversationDao_Impl.__converters.getClass();
                List listA = bz2.a(strR13);
                if (listA == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.indeed.android.messaging.`data`.conversations.ConversationRecord.Participant>', but it was NULL.");
                }
                String strR14 = iidVarQ1.isNull(iK4) ? null : iidVarQ1.r1(iK4);
                sw2 sw2Var__ConversationEventType_stringToEnum = iidVarQ1.isNull(iK5) ? null : conversationDao_Impl.__ConversationEventType_stringToEnum(iidVarQ1.r1(iK5));
                gy2 gy2Var__ConversationParticipantRole_stringToEnum = conversationDao_Impl.__ConversationParticipantRole_stringToEnum(iidVarQ1.r1(iK6));
                long j = iidVarQ1.getLong(iK7);
                String strR15 = iidVarQ1.r1(iK8);
                String strR16 = iidVarQ1.isNull(iK9) ? null : iidVarQ1.r1(iK9);
                int i = (int) iidVarQ1.getLong(iK10);
                Long lValueOf = iidVarQ1.isNull(iK11) ? null : Long.valueOf(iidVarQ1.getLong(iK11));
                Long lValueOf2 = iidVarQ1.isNull(iK12) ? null : Long.valueOf(iidVarQ1.getLong(iK12));
                boolean z = ((int) iidVarQ1.getLong(iK13)) != 0;
                w47 w47Var__InboxFolder_stringToEnum = conversationDao_Impl.__InboxFolder_stringToEnum(iidVarQ1.r1(iK14));
                String strR17 = iidVarQ1.r1(iK15);
                conversationDao_Impl.__converters.getClass();
                strR17.getClass();
                try {
                    av2VarValueOf = av2.valueOf(strR17);
                } catch (IllegalArgumentException unused) {
                    av2VarValueOf = null;
                }
                if (av2VarValueOf == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.indeed.android.messaging.onegraph.client.type.ConversationContext', but it was NULL.");
                }
                r29 r29Var__LockReason_stringToEnum = iidVarQ1.isNull(iK16) ? null : conversationDao_Impl.__LockReason_stringToEnum(iidVarQ1.r1(iK16));
                Long lValueOf3 = iidVarQ1.isNull(iK17) ? null : Long.valueOf(iidVarQ1.getLong(iK17));
                Long lValueOf4 = iidVarQ1.isNull(iK18) ? null : Long.valueOf(iidVarQ1.getLong(iK18));
                String strR18 = iidVarQ1.r1(iK19);
                Float fValueOf = iidVarQ1.isNull(iK20) ? null : Float.valueOf((float) iidVarQ1.getDouble(iK20));
                String strR19 = iidVarQ1.isNull(iK21) ? null : iidVarQ1.r1(iK21);
                boolean z2 = ((int) iidVarQ1.getLong(iK22)) != 0;
                String strR110 = iidVarQ1.isNull(iK23) ? null : iidVarQ1.r1(iK23);
                String strR111 = iidVarQ1.isNull(iK24) ? null : iidVarQ1.r1(iK24);
                String strR112 = iidVarQ1.isNull(iK25) ? null : iidVarQ1.r1(iK25);
                String strR113 = iidVarQ1.isNull(iK26) ? null : iidVarQ1.r1(iK26);
                String strR114 = iidVarQ1.r1(iK27);
                conversationDao_Impl.__converters.getClass();
                conversationRecord = new ConversationRecord(strR1, strR12, listA, strR14, sw2Var__ConversationEventType_stringToEnum, gy2Var__ConversationParticipantRole_stringToEnum, j, strR15, strR16, i, lValueOf, lValueOf2, z, w47Var__InboxFolder_stringToEnum, av2VarValueOf, r29Var__LockReason_stringToEnum, lValueOf3, lValueOf4, strR18, fValueOf, new ConversationRecord.ConversationJobData(strR110, strR111, strR112, strR113, bz2.c(strR114)), strR19, z2);
            }
            iidVarQ1.close();
            return conversationRecord;
        } catch (Throwable th) {
            iidVarQ1.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DraftRecord getDraftById$lambda$5(String str, String str2, ConversationDao_Impl conversationDao_Impl, zhd zhdVar) throws Exception {
        DraftRecord draftRecord;
        zhdVar.getClass();
        iid iidVarQ1 = zhdVar.Q1(str);
        try {
            iidVarQ1.R(1, str2);
            int iK = q92.k("conversationId", iidVarQ1);
            int iK2 = q92.k("content", iidVarQ1);
            int iK3 = q92.k("attachments", iidVarQ1);
            if (iidVarQ1.M1()) {
                String strR1 = iidVarQ1.r1(iK);
                String strR12 = iidVarQ1.r1(iK2);
                String strR13 = iidVarQ1.r1(iK3);
                conversationDao_Impl.__converters.getClass();
                List listB = bz2.b(strR13);
                if (listB == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.indeed.android.messaging.`data`.events.EventRecord.Attachment>', but it was NULL.");
                }
                draftRecord = new DraftRecord(strR1, strR12, listB);
            } else {
                draftRecord = null;
            }
            iidVarQ1.close();
            return draftRecord;
        } catch (Throwable th) {
            iidVarQ1.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List observeConversationList$lambda$2(String str, ConversationDao_Impl conversationDao_Impl, w47 w47Var, zhd zhdVar) throws Exception {
        int i;
        Long lValueOf;
        int i2;
        av2 av2VarValueOf;
        r29 r29Var__LockReason_stringToEnum;
        int i3;
        int i4;
        Float fValueOf;
        ConversationDao_Impl conversationDao_Impl2 = conversationDao_Impl;
        zhdVar.getClass();
        iid iidVarQ1 = zhdVar.Q1(str);
        try {
            iidVarQ1.R(1, conversationDao_Impl.__InboxFolder_enumToString(w47Var));
            int iK = q92.k("id", iidVarQ1);
            int iK2 = q92.k("companyName", iidVarQ1);
            int iK3 = q92.k("participants", iidVarQ1);
            int iK4 = q92.k("lastEventId", iidVarQ1);
            int iK5 = q92.k("lastEventType", iidVarQ1);
            int iK6 = q92.k("lastEventSenderRole", iidVarQ1);
            int iK7 = q92.k("lastEventTimestamp", iidVarQ1);
            int iK8 = q92.k("lastMessagePreview", iidVarQ1);
            int iK9 = q92.k("lastEventAttachmentPreview", iidVarQ1);
            int iK10 = q92.k("unreadCount", iidVarQ1);
            int iK11 = q92.k("readReceiptCursorTimestamp", iidVarQ1);
            int iK12 = q92.k("readCursorTimestamp", iidVarQ1);
            int iK13 = q92.k("awaitingJobSeekerResponse", iidVarQ1);
            int iK14 = q92.k("folder", iidVarQ1);
            int iK15 = q92.k("conversationContext", iidVarQ1);
            int iK16 = q92.k("lockReason", iidVarQ1);
            int iK17 = q92.k("lockDateTimestamp", iidVarQ1);
            int iK18 = q92.k("jobSeekerApplicationDateTimestamp", iidVarQ1);
            int iK19 = q92.k("companyLogoUrl", iidVarQ1);
            int iK20 = q92.k("companyAverageRating", iidVarQ1);
            int iK21 = q92.k("advertiserKey", iidVarQ1);
            int iK22 = q92.k("isExisting", iidVarQ1);
            int iK23 = q92.k("job_title", iidVarQ1);
            int iK24 = q92.k("job_location", iidVarQ1);
            int iK25 = q92.k("job_jobKey", iidVarQ1);
            int iK26 = q92.k("job_compensationFormatted", iidVarQ1);
            int iK27 = q92.k("job_attributes", iidVarQ1);
            ht0<String, DraftRecord> ht0Var = new ht0<>();
            while (true) {
                i = iK12;
                if (!iidVarQ1.M1()) {
                    break;
                }
                ht0Var.put(iidVarQ1.r1(iK), null);
                iK11 = iK11;
                iK12 = i;
            }
            int i5 = iK11;
            iidVarQ1.reset();
            conversationDao_Impl2.__fetchRelationshipDraftRecordAscomIndeedAndroidMessagingDataConversationsDraftRecord(zhdVar, ht0Var);
            ArrayList arrayList = new ArrayList();
            while (iidVarQ1.M1()) {
                String strR1 = iidVarQ1.r1(iK);
                String strR12 = iidVarQ1.r1(iK2);
                String strR13 = iidVarQ1.r1(iK3);
                conversationDao_Impl2.__converters.getClass();
                List listA = bz2.a(strR13);
                if (listA == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.indeed.android.messaging.`data`.conversations.ConversationRecord.Participant>', but it was NULL.");
                }
                String strR14 = iidVarQ1.isNull(iK4) ? null : iidVarQ1.r1(iK4);
                sw2 sw2Var__ConversationEventType_stringToEnum = iidVarQ1.isNull(iK5) ? null : conversationDao_Impl2.__ConversationEventType_stringToEnum(iidVarQ1.r1(iK5));
                gy2 gy2Var__ConversationParticipantRole_stringToEnum = conversationDao_Impl2.__ConversationParticipantRole_stringToEnum(iidVarQ1.r1(iK6));
                long j = iidVarQ1.getLong(iK7);
                String strR15 = iidVarQ1.r1(iK8);
                String strR16 = iidVarQ1.isNull(iK9) ? null : iidVarQ1.r1(iK9);
                int i6 = (int) iidVarQ1.getLong(iK10);
                int i7 = i5;
                Long lValueOf2 = iidVarQ1.isNull(i7) ? null : Long.valueOf(iidVarQ1.getLong(i7));
                int i8 = iK2;
                int i9 = i;
                if (iidVarQ1.isNull(i9)) {
                    lValueOf = null;
                    i = i9;
                    i2 = iK4;
                } else {
                    lValueOf = Long.valueOf(iidVarQ1.getLong(i9));
                    i2 = iK4;
                    i = i9;
                }
                int i10 = iK13;
                int i11 = iK3;
                boolean z = ((int) iidVarQ1.getLong(i10)) != 0;
                int i12 = iK14;
                w47 w47Var__InboxFolder_stringToEnum = conversationDao_Impl2.__InboxFolder_stringToEnum(iidVarQ1.r1(i12));
                int i13 = iK15;
                String strR17 = iidVarQ1.r1(i13);
                conversationDao_Impl2.__converters.getClass();
                strR17.getClass();
                try {
                    av2VarValueOf = av2.valueOf(strR17);
                } catch (IllegalArgumentException unused) {
                    av2VarValueOf = null;
                }
                if (av2VarValueOf == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.indeed.android.messaging.onegraph.client.type.ConversationContext', but it was NULL.");
                }
                int i14 = iK16;
                if (iidVarQ1.isNull(i14)) {
                    iK14 = i12;
                    r29Var__LockReason_stringToEnum = null;
                } else {
                    iK14 = i12;
                    r29Var__LockReason_stringToEnum = conversationDao_Impl2.__LockReason_stringToEnum(iidVarQ1.r1(i14));
                }
                int i15 = iK17;
                Long lValueOf3 = iidVarQ1.isNull(i15) ? null : Long.valueOf(iidVarQ1.getLong(i15));
                iK16 = i14;
                int i16 = iK18;
                Long lValueOf4 = iidVarQ1.isNull(i16) ? null : Long.valueOf(iidVarQ1.getLong(i16));
                iK18 = i16;
                int i17 = iK19;
                String strR18 = iidVarQ1.r1(i17);
                iK19 = i17;
                int i18 = iK20;
                if (iidVarQ1.isNull(i18)) {
                    i3 = i15;
                    i4 = i13;
                    fValueOf = null;
                } else {
                    i3 = i15;
                    i4 = i13;
                    fValueOf = Float.valueOf((float) iidVarQ1.getDouble(i18));
                }
                int i19 = iK21;
                String strR19 = iidVarQ1.isNull(i19) ? null : iidVarQ1.r1(i19);
                int i20 = iK22;
                boolean z2 = ((int) iidVarQ1.getLong(i20)) != 0;
                int i21 = iK23;
                String strR110 = iidVarQ1.isNull(i21) ? null : iidVarQ1.r1(i21);
                int i22 = iK24;
                String strR111 = iidVarQ1.isNull(i22) ? null : iidVarQ1.r1(i22);
                iK23 = i21;
                int i23 = iK25;
                String strR112 = iidVarQ1.isNull(i23) ? null : iidVarQ1.r1(i23);
                iK25 = i23;
                int i24 = iK26;
                String strR113 = iidVarQ1.isNull(i24) ? null : iidVarQ1.r1(i24);
                iK26 = i24;
                int i25 = iK27;
                String strR114 = iidVarQ1.r1(i25);
                iK27 = i25;
                conversationDao_Impl2.__converters.getClass();
                arrayList.add(new ConversationWithDraft(new ConversationRecord(strR1, strR12, listA, strR14, sw2Var__ConversationEventType_stringToEnum, gy2Var__ConversationParticipantRole_stringToEnum, j, strR15, strR16, i6, lValueOf2, lValueOf, z, w47Var__InboxFolder_stringToEnum, av2VarValueOf, r29Var__LockReason_stringToEnum, lValueOf3, lValueOf4, strR18, fValueOf, new ConversationRecord.ConversationJobData(strR110, strR111, strR112, strR113, bz2.c(strR114)), strR19, z2), ht0Var.get(iidVarQ1.r1(iK))));
                conversationDao_Impl2 = conversationDao_Impl;
                iK24 = i22;
                iK2 = i8;
                iK3 = i11;
                i5 = i7;
                iK13 = i10;
                iK15 = i4;
                iK17 = i3;
                iK20 = i18;
                iK21 = i19;
                iK22 = i20;
                iK4 = i2;
            }
            iidVarQ1.close();
            return arrayList;
        } catch (Throwable th) {
            iidVarQ1.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List observeDraftConversations$lambda$3(String str, ConversationDao_Impl conversationDao_Impl, w47 w47Var, zhd zhdVar) throws Exception {
        int i;
        Long lValueOf;
        int i2;
        av2 av2VarValueOf;
        r29 r29Var__LockReason_stringToEnum;
        int i3;
        int i4;
        Float fValueOf;
        ConversationDao_Impl conversationDao_Impl2 = conversationDao_Impl;
        zhdVar.getClass();
        iid iidVarQ1 = zhdVar.Q1(str);
        try {
            iidVarQ1.R(1, conversationDao_Impl.__InboxFolder_enumToString(w47Var));
            int iK = q92.k("id", iidVarQ1);
            int iK2 = q92.k("companyName", iidVarQ1);
            int iK3 = q92.k("participants", iidVarQ1);
            int iK4 = q92.k("lastEventId", iidVarQ1);
            int iK5 = q92.k("lastEventType", iidVarQ1);
            int iK6 = q92.k("lastEventSenderRole", iidVarQ1);
            int iK7 = q92.k("lastEventTimestamp", iidVarQ1);
            int iK8 = q92.k("lastMessagePreview", iidVarQ1);
            int iK9 = q92.k("lastEventAttachmentPreview", iidVarQ1);
            int iK10 = q92.k("unreadCount", iidVarQ1);
            int iK11 = q92.k("readReceiptCursorTimestamp", iidVarQ1);
            int iK12 = q92.k("readCursorTimestamp", iidVarQ1);
            int iK13 = q92.k("awaitingJobSeekerResponse", iidVarQ1);
            int iK14 = q92.k("folder", iidVarQ1);
            int iK15 = q92.k("conversationContext", iidVarQ1);
            int iK16 = q92.k("lockReason", iidVarQ1);
            int iK17 = q92.k("lockDateTimestamp", iidVarQ1);
            int iK18 = q92.k("jobSeekerApplicationDateTimestamp", iidVarQ1);
            int iK19 = q92.k("companyLogoUrl", iidVarQ1);
            int iK20 = q92.k("companyAverageRating", iidVarQ1);
            int iK21 = q92.k("advertiserKey", iidVarQ1);
            int iK22 = q92.k("isExisting", iidVarQ1);
            int iK23 = q92.k("job_title", iidVarQ1);
            int iK24 = q92.k("job_location", iidVarQ1);
            int iK25 = q92.k("job_jobKey", iidVarQ1);
            int iK26 = q92.k("job_compensationFormatted", iidVarQ1);
            int iK27 = q92.k("job_attributes", iidVarQ1);
            ht0<String, DraftRecord> ht0Var = new ht0<>();
            while (true) {
                i = iK12;
                if (!iidVarQ1.M1()) {
                    break;
                }
                ht0Var.put(iidVarQ1.r1(iK), null);
                iK11 = iK11;
                iK12 = i;
            }
            int i5 = iK11;
            iidVarQ1.reset();
            conversationDao_Impl2.__fetchRelationshipDraftRecordAscomIndeedAndroidMessagingDataConversationsDraftRecord(zhdVar, ht0Var);
            ArrayList arrayList = new ArrayList();
            while (iidVarQ1.M1()) {
                String strR1 = iidVarQ1.r1(iK);
                String strR12 = iidVarQ1.r1(iK2);
                String strR13 = iidVarQ1.r1(iK3);
                conversationDao_Impl2.__converters.getClass();
                List listA = bz2.a(strR13);
                if (listA == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<com.indeed.android.messaging.`data`.conversations.ConversationRecord.Participant>', but it was NULL.");
                }
                String strR14 = iidVarQ1.isNull(iK4) ? null : iidVarQ1.r1(iK4);
                sw2 sw2Var__ConversationEventType_stringToEnum = iidVarQ1.isNull(iK5) ? null : conversationDao_Impl2.__ConversationEventType_stringToEnum(iidVarQ1.r1(iK5));
                gy2 gy2Var__ConversationParticipantRole_stringToEnum = conversationDao_Impl2.__ConversationParticipantRole_stringToEnum(iidVarQ1.r1(iK6));
                long j = iidVarQ1.getLong(iK7);
                String strR15 = iidVarQ1.r1(iK8);
                String strR16 = iidVarQ1.isNull(iK9) ? null : iidVarQ1.r1(iK9);
                int i6 = (int) iidVarQ1.getLong(iK10);
                int i7 = i5;
                Long lValueOf2 = iidVarQ1.isNull(i7) ? null : Long.valueOf(iidVarQ1.getLong(i7));
                int i8 = iK2;
                int i9 = i;
                if (iidVarQ1.isNull(i9)) {
                    lValueOf = null;
                    i = i9;
                    i2 = iK4;
                } else {
                    lValueOf = Long.valueOf(iidVarQ1.getLong(i9));
                    i2 = iK4;
                    i = i9;
                }
                int i10 = iK13;
                int i11 = iK3;
                boolean z = ((int) iidVarQ1.getLong(i10)) != 0;
                int i12 = iK14;
                w47 w47Var__InboxFolder_stringToEnum = conversationDao_Impl2.__InboxFolder_stringToEnum(iidVarQ1.r1(i12));
                int i13 = iK15;
                String strR17 = iidVarQ1.r1(i13);
                conversationDao_Impl2.__converters.getClass();
                strR17.getClass();
                try {
                    av2VarValueOf = av2.valueOf(strR17);
                } catch (IllegalArgumentException unused) {
                    av2VarValueOf = null;
                }
                if (av2VarValueOf == null) {
                    throw new IllegalStateException("Expected NON-NULL 'com.indeed.android.messaging.onegraph.client.type.ConversationContext', but it was NULL.");
                }
                int i14 = iK16;
                if (iidVarQ1.isNull(i14)) {
                    iK14 = i12;
                    r29Var__LockReason_stringToEnum = null;
                } else {
                    iK14 = i12;
                    r29Var__LockReason_stringToEnum = conversationDao_Impl2.__LockReason_stringToEnum(iidVarQ1.r1(i14));
                }
                int i15 = iK17;
                Long lValueOf3 = iidVarQ1.isNull(i15) ? null : Long.valueOf(iidVarQ1.getLong(i15));
                iK16 = i14;
                int i16 = iK18;
                Long lValueOf4 = iidVarQ1.isNull(i16) ? null : Long.valueOf(iidVarQ1.getLong(i16));
                iK18 = i16;
                int i17 = iK19;
                String strR18 = iidVarQ1.r1(i17);
                iK19 = i17;
                int i18 = iK20;
                if (iidVarQ1.isNull(i18)) {
                    i3 = i15;
                    i4 = i13;
                    fValueOf = null;
                } else {
                    i3 = i15;
                    i4 = i13;
                    fValueOf = Float.valueOf((float) iidVarQ1.getDouble(i18));
                }
                int i19 = iK21;
                String strR19 = iidVarQ1.isNull(i19) ? null : iidVarQ1.r1(i19);
                int i20 = iK22;
                boolean z2 = ((int) iidVarQ1.getLong(i20)) != 0;
                int i21 = iK23;
                String strR110 = iidVarQ1.isNull(i21) ? null : iidVarQ1.r1(i21);
                int i22 = iK24;
                String strR111 = iidVarQ1.isNull(i22) ? null : iidVarQ1.r1(i22);
                iK23 = i21;
                int i23 = iK25;
                String strR112 = iidVarQ1.isNull(i23) ? null : iidVarQ1.r1(i23);
                iK25 = i23;
                int i24 = iK26;
                String strR113 = iidVarQ1.isNull(i24) ? null : iidVarQ1.r1(i24);
                iK26 = i24;
                int i25 = iK27;
                String strR114 = iidVarQ1.r1(i25);
                iK27 = i25;
                conversationDao_Impl2.__converters.getClass();
                arrayList.add(new ConversationWithDraft(new ConversationRecord(strR1, strR12, listA, strR14, sw2Var__ConversationEventType_stringToEnum, gy2Var__ConversationParticipantRole_stringToEnum, j, strR15, strR16, i6, lValueOf2, lValueOf, z, w47Var__InboxFolder_stringToEnum, av2VarValueOf, r29Var__LockReason_stringToEnum, lValueOf3, lValueOf4, strR18, fValueOf, new ConversationRecord.ConversationJobData(strR110, strR111, strR112, strR113, bz2.c(strR114)), strR19, z2), ht0Var.get(iidVarQ1.r1(iK))));
                conversationDao_Impl2 = conversationDao_Impl;
                iK24 = i22;
                iK2 = i8;
                iK3 = i11;
                i5 = i7;
                iK13 = i10;
                iK15 = i4;
                iK17 = i3;
                iK20 = i18;
                iK21 = i19;
                iK22 = i20;
                iK4 = i2;
            }
            iidVarQ1.close();
            return arrayList;
        } catch (Throwable th) {
            iidVarQ1.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final j6g saveConversations$lambda$0(ConversationDao_Impl conversationDao_Impl, List list, zhd zhdVar) {
        zhdVar.getClass();
        rv4<ConversationRecord> rv4Var = conversationDao_Impl.__upsertAdapterOfConversationRecord;
        List list2 = list;
        rv4Var.getClass();
        if (list2 != null) {
            for (Object obj : list2) {
                try {
                    rv4Var.a.insert(zhdVar, (T) obj);
                } catch (SQLException e) {
                    rv4.a(e);
                    rv4Var.b.handle(zhdVar, (T) obj);
                }
            }
        }
        return j6g.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g updateConversationFolder$lambda$7(String str, ConversationDao_Impl conversationDao_Impl, w47 w47Var, String str2, zhd zhdVar) throws Exception {
        zhdVar.getClass();
        iid iidVarQ1 = zhdVar.Q1(str);
        try {
            iidVarQ1.R(1, conversationDao_Impl.__InboxFolder_enumToString(w47Var));
            iidVarQ1.R(2, str2);
            iidVarQ1.M1();
            iidVarQ1.close();
            return j6g.a;
        } catch (Throwable th) {
            iidVarQ1.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6g upsertConversationDraft$lambda$1(ConversationDao_Impl conversationDao_Impl, DraftRecord draftRecord, zhd zhdVar) {
        zhdVar.getClass();
        rv4<DraftRecord> rv4Var = conversationDao_Impl.__upsertAdapterOfDraftRecord;
        rv4Var.getClass();
        try {
            rv4Var.a.insert(zhdVar, draftRecord);
        } catch (SQLException e) {
            rv4.a(e);
            rv4Var.b.handle(zhdVar, draftRecord);
        }
        return j6g.a;
    }

    @Override // com.indeed.android.messaging.data.conversations.ConversationDao
    public Object clearOutdatedConversations(List<String> list, w47 w47Var, lu2<? super j6g> lu2Var) throws Throwable {
        StringBuilder sbG = q6.g("DELETE FROM ConversationRecord WHERE folder = ? AND id NOT IN(");
        dmc.c(list.size(), sbG);
        sbG.append(")");
        Object objH = pg8.H(lu2Var, this.__db, new iv2(sbG.toString(), this, w47Var, list, 0), false, true);
        return objH == g13.a ? objH : j6g.a;
    }

    @Override // com.indeed.android.messaging.data.conversations.ConversationDao
    public Object deleteDraft(String str, lu2<? super j6g> lu2Var) throws Throwable {
        Object objH = pg8.H(lu2Var, this.__db, new hv2(str, 0), false, true);
        return objH == g13.a ? objH : j6g.a;
    }

    @Override // com.indeed.android.messaging.data.conversations.ConversationDao
    public vi5<ConversationRecord> findById(String id) {
        id.getClass();
        return ee3.k(this.__db, false, new String[]{"conversationrecord"}, new gv2(0, id, this));
    }

    @Override // com.indeed.android.messaging.data.conversations.ConversationDao
    public Object getDraftById(String str, lu2<? super DraftRecord> lu2Var) {
        return pg8.H(lu2Var, this.__db, new nm1(str, 1, this), true, false);
    }

    @Override // com.indeed.android.messaging.data.conversations.ConversationDao
    public vi5<List<ConversationWithDraft>> observeConversationList(w47 folder) {
        folder.getClass();
        return ee3.k(this.__db, false, new String[]{"DraftRecord", "conversationrecord"}, new df(1, this, folder));
    }

    @Override // com.indeed.android.messaging.data.conversations.ConversationDao
    public vi5<List<ConversationWithDraft>> observeConversationQuery(w47 w47Var) {
        return super.observeConversationQuery(w47Var);
    }

    @Override // com.indeed.android.messaging.data.conversations.ConversationDao
    public vi5<List<ConversationWithDraft>> observeDraftConversations(w47 folder) {
        folder.getClass();
        return ee3.k(this.__db, false, new String[]{"DraftRecord", "conversationrecord", "draftrecord"}, new qs0(2, this, folder));
    }

    @Override // com.indeed.android.messaging.data.conversations.ConversationDao
    public Object saveConversationDraft(String str, String str2, List<EventRecord.Attachment> list, lu2<? super j6g> lu2Var) {
        Object objG = pg8.G(this.__db, new C06302(str, str2, list, null), lu2Var);
        return objG == g13.a ? objG : j6g.a;
    }

    @Override // com.indeed.android.messaging.data.conversations.ConversationDao
    public Object saveConversations(List<ConversationRecord> list, lu2<? super j6g> lu2Var) throws Throwable {
        Object objH = pg8.H(lu2Var, this.__db, new ev2(0, this, list), false, true);
        return objH == g13.a ? objH : j6g.a;
    }

    @Override // com.indeed.android.messaging.data.conversations.ConversationDao
    public Object updateConversationFolder(String str, w47 w47Var, lu2<? super j6g> lu2Var) throws Throwable {
        Object objH = pg8.H(lu2Var, this.__db, new fv2(0, this, w47Var, str), false, true);
        return objH == g13.a ? objH : j6g.a;
    }

    @Override // com.indeed.android.messaging.data.conversations.ConversationDao
    public Object upsertConversationDraft(DraftRecord draftRecord, lu2<? super j6g> lu2Var) throws Throwable {
        Object objH = pg8.H(lu2Var, this.__db, new mt(3, this, draftRecord), false, true);
        return objH == g13.a ? objH : j6g.a;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/ConversationDao_Impl$Companion;", "", "<init>", "()V", "", "Lyd8;", "getRequiredConverters", "()Ljava/util/List;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
