package com.indeed.android.messaging.data.conversations;

import com.datadog.android.rum.internal.RumFeature;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.akb;
import defpackage.av2;
import defpackage.aw4;
import defpackage.boa;
import defpackage.ewa;
import defpackage.g7;
import defpackage.gt0;
import defpackage.gy2;
import defpackage.ia;
import defpackage.l6;
import defpackage.mve;
import defpackage.o7e;
import defpackage.p7e;
import defpackage.pd1;
import defpackage.qt8;
import defpackage.r29;
import defpackage.rh7;
import defpackage.sw2;
import defpackage.u40;
import defpackage.vl2;
import defpackage.vm1;
import defpackage.w40;
import defpackage.w47;
import defpackage.wl7;
import defpackage.z3;
import defpackage.zr4;
import defpackage.zve;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b[\b\u0087\b\u0018\u00002\u00020\u0001:\u0002{|B÷\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0015¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b*\u0010)J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010)J\u0012\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010)J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010)J\u0010\u00106\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b:\u00109J\u0010\u0010;\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010=\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0012\u0010C\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bC\u00109J\u0012\u0010D\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bD\u00109J\u0010\u0010E\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bE\u0010)J\u0012\u0010F\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\"HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010)J\u0010\u0010K\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\bK\u0010<J\u0090\u0002\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010%\u001a\u00020\u0015HÆ\u0001¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bN\u0010)J\u0010\u0010O\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\bO\u00107J\u001a\u0010Q\u001a\u00020\u00152\b\u0010P\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bQ\u0010RR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u0010)R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010S\u001a\u0004\bU\u0010)R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010V\u001a\u0004\bW\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010S\u001a\u0004\bX\u0010)R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010Y\u001a\u0004\bZ\u0010/R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010[\u001a\u0004\b\\\u00101R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010]\u001a\u0004\b^\u00103R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\b_\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010S\u001a\u0004\b`\u0010)R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010a\u001a\u0004\bb\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0013\u0010c\u001a\u0004\bd\u00109R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010c\u001a\u0004\be\u00109R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010f\u001a\u0004\bg\u0010<R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010h\u001a\u0004\bi\u0010>R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010j\u001a\u0004\bk\u0010@R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010l\u001a\u0004\bm\u0010BR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001d\u0010c\u001a\u0004\bn\u00109R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010c\u001a\u0004\bo\u00109R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010S\u001a\u0004\bp\u0010)R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010q\u001a\u0004\br\u0010GR\u001a\u0010#\u001a\u00020\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010s\u001a\u0004\bt\u0010IR\u0019\u0010$\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010S\u001a\u0004\bu\u0010)R\u0017\u0010%\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b%\u0010f\u001a\u0004\b%\u0010<R\"\u0010v\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bv\u0010f\u001a\u0004\bv\u0010<\"\u0004\bw\u0010xR\u0013\u0010z\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\by\u0010)¨\u0006}"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "", "", "id", "companyName", "", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord$Participant;", "participants", "lastEventId", "Lsw2;", "lastEventType", "Lgy2;", "lastEventSenderRole", "", "lastEventTimestamp", "lastMessagePreview", "lastEventAttachmentPreview", "", "unreadCount", "readReceiptCursorTimestamp", "readCursorTimestamp", "", "awaitingJobSeekerResponse", "Lw47;", "folder", "Lav2;", "conversationContext", "Lr29;", "lockReason", "lockDateTimestamp", "jobSeekerApplicationDateTimestamp", "companyLogoUrl", "", "companyAverageRating", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord$ConversationJobData;", "job", "advertiserKey", "isExisting", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lsw2;Lgy2;JLjava/lang/String;Ljava/lang/String;ILjava/lang/Long;Ljava/lang/Long;ZLw47;Lav2;Lr29;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Float;Lcom/indeed/android/messaging/data/conversations/ConversationRecord$ConversationJobData;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Lsw2;", "component6", "()Lgy2;", "component7", "()J", "component8", "component9", "component10", "()I", "component11", "()Ljava/lang/Long;", "component12", "component13", "()Z", "component14", "()Lw47;", "component15", "()Lav2;", "component16", "()Lr29;", "component17", "component18", "component19", "component20", "()Ljava/lang/Float;", "component21", "()Lcom/indeed/android/messaging/data/conversations/ConversationRecord$ConversationJobData;", "component22", "component23", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lsw2;Lgy2;JLjava/lang/String;Ljava/lang/String;ILjava/lang/Long;Ljava/lang/Long;ZLw47;Lav2;Lr29;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Float;Lcom/indeed/android/messaging/data/conversations/ConversationRecord$ConversationJobData;Ljava/lang/String;Z)Lcom/indeed/android/messaging/data/conversations/ConversationRecord;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getCompanyName", "Ljava/util/List;", "getParticipants", "getLastEventId", "Lsw2;", "getLastEventType", "Lgy2;", "getLastEventSenderRole", "J", "getLastEventTimestamp", "getLastMessagePreview", "getLastEventAttachmentPreview", "I", "getUnreadCount", "Ljava/lang/Long;", "getReadReceiptCursorTimestamp", "getReadCursorTimestamp", "Z", "getAwaitingJobSeekerResponse", "Lw47;", "getFolder", "Lav2;", "getConversationContext", "Lr29;", "getLockReason", "getLockDateTimestamp", "getJobSeekerApplicationDateTimestamp", "getCompanyLogoUrl", "Ljava/lang/Float;", "getCompanyAverageRating", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord$ConversationJobData;", "getJob", "getAdvertiserKey", "isFailedToSendLastMessage", "setFailedToSendLastMessage", "(Z)V", "getEmployerDisplayName", "employerDisplayName", "Participant", "ConversationJobData", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConversationRecord {
    public static final int $stable = 8;
    private final String advertiserKey;
    private final boolean awaitingJobSeekerResponse;
    private final Float companyAverageRating;
    private final String companyLogoUrl;
    private final String companyName;
    private final av2 conversationContext;
    private final w47 folder;
    private final String id;
    private final boolean isExisting;
    private boolean isFailedToSendLastMessage;
    private final ConversationJobData job;
    private final Long jobSeekerApplicationDateTimestamp;
    private final String lastEventAttachmentPreview;
    private final String lastEventId;
    private final gy2 lastEventSenderRole;
    private final long lastEventTimestamp;
    private final sw2 lastEventType;
    private final String lastMessagePreview;
    private final Long lockDateTimestamp;
    private final r29 lockReason;
    private final List<Participant> participants;
    private final Long readCursorTimestamp;
    private final Long readReceiptCursorTimestamp;
    private final int unreadCount;

    public /* synthetic */ ConversationRecord(String str, String str2, List list, String str3, sw2 sw2Var, gy2 gy2Var, long j, String str4, String str5, int i, Long l, Long l2, boolean z, w47 w47Var, av2 av2Var, r29 r29Var, Long l3, Long l4, String str6, Float f, ConversationJobData conversationJobData, String str7, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, list, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : sw2Var, gy2Var, j, str4, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str5, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? 0 : i, (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : l, (i2 & 2048) != 0 ? null : l2, (i2 & 4096) != 0 ? false : z, w47Var, (i2 & 16384) != 0 ? av2.c : av2Var, (32768 & i2) != 0 ? null : r29Var, (65536 & i2) != 0 ? null : l3, (131072 & i2) != 0 ? null : l4, (262144 & i2) != 0 ? "" : str6, (524288 & i2) != 0 ? null : f, conversationJobData, str7, (i2 & 4194304) != 0 ? true : z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ConversationRecord copy$default(ConversationRecord conversationRecord, String str, String str2, List list, String str3, sw2 sw2Var, gy2 gy2Var, long j, String str4, String str5, int i, Long l, Long l2, boolean z, w47 w47Var, av2 av2Var, r29 r29Var, Long l3, Long l4, String str6, Float f, ConversationJobData conversationJobData, String str7, boolean z2, int i2, Object obj) {
        boolean z3;
        String str8;
        String str9 = (i2 & 1) != 0 ? conversationRecord.id : str;
        String str10 = (i2 & 2) != 0 ? conversationRecord.companyName : str2;
        List list2 = (i2 & 4) != 0 ? conversationRecord.participants : list;
        String str11 = (i2 & 8) != 0 ? conversationRecord.lastEventId : str3;
        sw2 sw2Var2 = (i2 & 16) != 0 ? conversationRecord.lastEventType : sw2Var;
        gy2 gy2Var2 = (i2 & 32) != 0 ? conversationRecord.lastEventSenderRole : gy2Var;
        long j2 = (i2 & 64) != 0 ? conversationRecord.lastEventTimestamp : j;
        String str12 = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? conversationRecord.lastMessagePreview : str4;
        String str13 = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? conversationRecord.lastEventAttachmentPreview : str5;
        int i3 = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? conversationRecord.unreadCount : i;
        Long l5 = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? conversationRecord.readReceiptCursorTimestamp : l;
        Long l6 = (i2 & 2048) != 0 ? conversationRecord.readCursorTimestamp : l2;
        boolean z4 = (i2 & 4096) != 0 ? conversationRecord.awaitingJobSeekerResponse : z;
        String str14 = str9;
        w47 w47Var2 = (i2 & 8192) != 0 ? conversationRecord.folder : w47Var;
        av2 av2Var2 = (i2 & 16384) != 0 ? conversationRecord.conversationContext : av2Var;
        r29 r29Var2 = (i2 & 32768) != 0 ? conversationRecord.lockReason : r29Var;
        Long l7 = (i2 & 65536) != 0 ? conversationRecord.lockDateTimestamp : l3;
        Long l8 = (i2 & 131072) != 0 ? conversationRecord.jobSeekerApplicationDateTimestamp : l4;
        String str15 = (i2 & 262144) != 0 ? conversationRecord.companyLogoUrl : str6;
        Float f2 = (i2 & 524288) != 0 ? conversationRecord.companyAverageRating : f;
        ConversationJobData conversationJobData2 = (i2 & 1048576) != 0 ? conversationRecord.job : conversationJobData;
        String str16 = (i2 & 2097152) != 0 ? conversationRecord.advertiserKey : str7;
        if ((i2 & 4194304) != 0) {
            str8 = str16;
            z3 = conversationRecord.isExisting;
        } else {
            z3 = z2;
            str8 = str16;
        }
        return conversationRecord.copy(str14, str10, list2, str11, sw2Var2, gy2Var2, j2, str12, str13, i3, l5, l6, z4, w47Var2, av2Var2, r29Var2, l7, l8, str15, f2, conversationJobData2, str8, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getUnreadCount() {
        return this.unreadCount;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getReadReceiptCursorTimestamp() {
        return this.readReceiptCursorTimestamp;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getReadCursorTimestamp() {
        return this.readCursorTimestamp;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getAwaitingJobSeekerResponse() {
        return this.awaitingJobSeekerResponse;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final w47 getFolder() {
        return this.folder;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final av2 getConversationContext() {
        return this.conversationContext;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final r29 getLockReason() {
        return this.lockReason;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Long getLockDateTimestamp() {
        return this.lockDateTimestamp;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Long getJobSeekerApplicationDateTimestamp() {
        return this.jobSeekerApplicationDateTimestamp;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getCompanyLogoUrl() {
        return this.companyLogoUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Float getCompanyAverageRating() {
        return this.companyAverageRating;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final ConversationJobData getJob() {
        return this.job;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getAdvertiserKey() {
        return this.advertiserKey;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getIsExisting() {
        return this.isExisting;
    }

    public final List<Participant> component3() {
        return this.participants;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastEventId() {
        return this.lastEventId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final sw2 getLastEventType() {
        return this.lastEventType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final gy2 getLastEventSenderRole() {
        return this.lastEventSenderRole;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getLastEventTimestamp() {
        return this.lastEventTimestamp;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLastMessagePreview() {
        return this.lastMessagePreview;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLastEventAttachmentPreview() {
        return this.lastEventAttachmentPreview;
    }

    public final ConversationRecord copy(String id, String companyName, List<Participant> participants, String lastEventId, sw2 lastEventType, gy2 lastEventSenderRole, long lastEventTimestamp, String lastMessagePreview, String lastEventAttachmentPreview, int unreadCount, Long readReceiptCursorTimestamp, Long readCursorTimestamp, boolean awaitingJobSeekerResponse, w47 folder, av2 conversationContext, r29 lockReason, Long lockDateTimestamp, Long jobSeekerApplicationDateTimestamp, String companyLogoUrl, Float companyAverageRating, ConversationJobData job, String advertiserKey, boolean isExisting) {
        id.getClass();
        companyName.getClass();
        participants.getClass();
        lastEventSenderRole.getClass();
        lastMessagePreview.getClass();
        folder.getClass();
        conversationContext.getClass();
        companyLogoUrl.getClass();
        job.getClass();
        return new ConversationRecord(id, companyName, participants, lastEventId, lastEventType, lastEventSenderRole, lastEventTimestamp, lastMessagePreview, lastEventAttachmentPreview, unreadCount, readReceiptCursorTimestamp, readCursorTimestamp, awaitingJobSeekerResponse, folder, conversationContext, lockReason, lockDateTimestamp, jobSeekerApplicationDateTimestamp, companyLogoUrl, companyAverageRating, job, advertiserKey, isExisting);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationRecord)) {
            return false;
        }
        ConversationRecord conversationRecord = (ConversationRecord) other;
        return wl7.b(this.id, conversationRecord.id) && wl7.b(this.companyName, conversationRecord.companyName) && wl7.b(this.participants, conversationRecord.participants) && wl7.b(this.lastEventId, conversationRecord.lastEventId) && this.lastEventType == conversationRecord.lastEventType && this.lastEventSenderRole == conversationRecord.lastEventSenderRole && this.lastEventTimestamp == conversationRecord.lastEventTimestamp && wl7.b(this.lastMessagePreview, conversationRecord.lastMessagePreview) && wl7.b(this.lastEventAttachmentPreview, conversationRecord.lastEventAttachmentPreview) && this.unreadCount == conversationRecord.unreadCount && wl7.b(this.readReceiptCursorTimestamp, conversationRecord.readReceiptCursorTimestamp) && wl7.b(this.readCursorTimestamp, conversationRecord.readCursorTimestamp) && this.awaitingJobSeekerResponse == conversationRecord.awaitingJobSeekerResponse && this.folder == conversationRecord.folder && this.conversationContext == conversationRecord.conversationContext && this.lockReason == conversationRecord.lockReason && wl7.b(this.lockDateTimestamp, conversationRecord.lockDateTimestamp) && wl7.b(this.jobSeekerApplicationDateTimestamp, conversationRecord.jobSeekerApplicationDateTimestamp) && wl7.b(this.companyLogoUrl, conversationRecord.companyLogoUrl) && wl7.b(this.companyAverageRating, conversationRecord.companyAverageRating) && wl7.b(this.job, conversationRecord.job) && wl7.b(this.advertiserKey, conversationRecord.advertiserKey) && this.isExisting == conversationRecord.isExisting;
    }

    public final String getAdvertiserKey() {
        return this.advertiserKey;
    }

    public final boolean getAwaitingJobSeekerResponse() {
        return this.awaitingJobSeekerResponse;
    }

    public final Float getCompanyAverageRating() {
        return this.companyAverageRating;
    }

    public final String getCompanyLogoUrl() {
        return this.companyLogoUrl;
    }

    public final String getCompanyName() {
        return this.companyName;
    }

    public final av2 getConversationContext() {
        return this.conversationContext;
    }

    public final String getEmployerDisplayName() {
        Object next;
        String str = this.companyName;
        if (str.length() != 0) {
            return str;
        }
        Iterator<T> it = this.participants.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Participant) next).getRole() == gy2.d) {
                break;
            }
        }
        Participant participant = (Participant) next;
        if (participant != null) {
            return participant.getParticipantName();
        }
        return null;
    }

    public final w47 getFolder() {
        return this.folder;
    }

    public final String getId() {
        return this.id;
    }

    public final ConversationJobData getJob() {
        return this.job;
    }

    public final Long getJobSeekerApplicationDateTimestamp() {
        return this.jobSeekerApplicationDateTimestamp;
    }

    public final String getLastEventAttachmentPreview() {
        return this.lastEventAttachmentPreview;
    }

    public final String getLastEventId() {
        return this.lastEventId;
    }

    public final gy2 getLastEventSenderRole() {
        return this.lastEventSenderRole;
    }

    public final long getLastEventTimestamp() {
        return this.lastEventTimestamp;
    }

    public final sw2 getLastEventType() {
        return this.lastEventType;
    }

    public final String getLastMessagePreview() {
        return this.lastMessagePreview;
    }

    public final Long getLockDateTimestamp() {
        return this.lockDateTimestamp;
    }

    public final r29 getLockReason() {
        return this.lockReason;
    }

    public final List<Participant> getParticipants() {
        return this.participants;
    }

    public final Long getReadCursorTimestamp() {
        return this.readCursorTimestamp;
    }

    public final Long getReadReceiptCursorTimestamp() {
        return this.readReceiptCursorTimestamp;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public int hashCode() {
        int iG = ia.g(this.participants, akb.d(this.id.hashCode() * 31, 31, this.companyName), 31);
        String str = this.lastEventId;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        sw2 sw2Var = this.lastEventType;
        int iD = akb.d(ia.d((this.lastEventSenderRole.hashCode() + ((iHashCode + (sw2Var == null ? 0 : sw2Var.hashCode())) * 31)) * 31, 31, this.lastEventTimestamp), 31, this.lastMessagePreview);
        String str2 = this.lastEventAttachmentPreview;
        int iC = w40.c(this.unreadCount, (iD + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Long l = this.readReceiptCursorTimestamp;
        int iHashCode2 = (iC + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.readCursorTimestamp;
        int iHashCode3 = (this.conversationContext.hashCode() + ((this.folder.hashCode() + ia.f((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.awaitingJobSeekerResponse)) * 31)) * 31;
        r29 r29Var = this.lockReason;
        int iHashCode4 = (iHashCode3 + (r29Var == null ? 0 : r29Var.hashCode())) * 31;
        Long l3 = this.lockDateTimestamp;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.jobSeekerApplicationDateTimestamp;
        int iD2 = akb.d((iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.companyLogoUrl);
        Float f = this.companyAverageRating;
        int iHashCode6 = (this.job.hashCode() + ((iD2 + (f == null ? 0 : f.hashCode())) * 31)) * 31;
        String str3 = this.advertiserKey;
        return Boolean.hashCode(this.isExisting) + ((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final boolean isExisting() {
        return this.isExisting;
    }

    /* JADX INFO: renamed from: isFailedToSendLastMessage, reason: from getter */
    public final boolean getIsFailedToSendLastMessage() {
        return this.isFailedToSendLastMessage;
    }

    public final void setFailedToSendLastMessage(boolean z) {
        this.isFailedToSendLastMessage = z;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.companyName;
        List<Participant> list = this.participants;
        String str3 = this.lastEventId;
        sw2 sw2Var = this.lastEventType;
        gy2 gy2Var = this.lastEventSenderRole;
        long j = this.lastEventTimestamp;
        String str4 = this.lastMessagePreview;
        String str5 = this.lastEventAttachmentPreview;
        int i = this.unreadCount;
        Long l = this.readReceiptCursorTimestamp;
        Long l2 = this.readCursorTimestamp;
        boolean z = this.awaitingJobSeekerResponse;
        w47 w47Var = this.folder;
        av2 av2Var = this.conversationContext;
        r29 r29Var = this.lockReason;
        Long l3 = this.lockDateTimestamp;
        Long l4 = this.jobSeekerApplicationDateTimestamp;
        String str6 = this.companyLogoUrl;
        Float f = this.companyAverageRating;
        ConversationJobData conversationJobData = this.job;
        String str7 = this.advertiserKey;
        boolean z2 = this.isExisting;
        StringBuilder sbF = u40.f("ConversationRecord(id=", str, ", companyName=", str2, ", participants=");
        sbF.append(list);
        sbF.append(", lastEventId=");
        sbF.append(str3);
        sbF.append(", lastEventType=");
        sbF.append(sw2Var);
        sbF.append(", lastEventSenderRole=");
        sbF.append(gy2Var);
        sbF.append(", lastEventTimestamp=");
        sbF.append(j);
        sbF.append(", lastMessagePreview=");
        sbF.append(str4);
        sbF.append(", lastEventAttachmentPreview=");
        sbF.append(str5);
        sbF.append(", unreadCount=");
        sbF.append(i);
        sbF.append(", readReceiptCursorTimestamp=");
        sbF.append(l);
        sbF.append(", readCursorTimestamp=");
        sbF.append(l2);
        sbF.append(", awaitingJobSeekerResponse=");
        sbF.append(z);
        sbF.append(", folder=");
        sbF.append(w47Var);
        sbF.append(", conversationContext=");
        sbF.append(av2Var);
        sbF.append(", lockReason=");
        sbF.append(r29Var);
        sbF.append(", lockDateTimestamp=");
        sbF.append(l3);
        sbF.append(", jobSeekerApplicationDateTimestamp=");
        sbF.append(l4);
        sbF.append(", companyLogoUrl=");
        sbF.append(str6);
        sbF.append(", companyAverageRating=");
        sbF.append(f);
        sbF.append(", job=");
        sbF.append(conversationJobData);
        sbF.append(", advertiserKey=");
        sbF.append(str7);
        sbF.append(", isExisting=");
        sbF.append(z2);
        sbF.append(")");
        return sbF.toString();
    }

    @o7e
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJP\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00062"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/ConversationRecord$ConversationJobData;", "", "", "title", "location", "jobKey", "compensationFormatted", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lp7e;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lp7e;)V", "self", "Lvl2;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lj6g;", "write$Self$messaging_release", "(Lcom/indeed/android/messaging/data/conversations/ConversationRecord$ConversationJobData;Lvl2;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/indeed/android/messaging/data/conversations/ConversationRecord$ConversationJobData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getLocation", "getJobKey", "getCompensationFormatted", "Ljava/util/List;", "getAttributes", "Companion", "$serializer", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConversationJobData {
        private final List<String> attributes;
        private final String compensationFormatted;
        private final String jobKey;
        private final String location;
        private final String title;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, null, boa.E(qt8.b, new vm1(3))};

        public /* synthetic */ ConversationJobData(int i, String str, String str2, String str3, String str4, List list, p7e p7eVar) {
            if ((i & 1) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i & 2) == 0) {
                this.location = null;
            } else {
                this.location = str2;
            }
            if ((i & 4) == 0) {
                this.jobKey = null;
            } else {
                this.jobKey = str3;
            }
            if ((i & 8) == 0) {
                this.compensationFormatted = null;
            } else {
                this.compensationFormatted = str4;
            }
            if ((i & 16) == 0) {
                this.attributes = zr4.a;
            } else {
                this.attributes = list;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new gt0(mve.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ConversationJobData copy$default(ConversationJobData conversationJobData, String str, String str2, String str3, String str4, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = conversationJobData.title;
            }
            if ((i & 2) != 0) {
                str2 = conversationJobData.location;
            }
            if ((i & 4) != 0) {
                str3 = conversationJobData.jobKey;
            }
            if ((i & 8) != 0) {
                str4 = conversationJobData.compensationFormatted;
            }
            if ((i & 16) != 0) {
                list = conversationJobData.attributes;
            }
            List list2 = list;
            String str5 = str3;
            return conversationJobData.copy(str, str2, str5, str4, list2);
        }

        public static final /* synthetic */ void write$Self$messaging_release(ConversationJobData self, vl2 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (output.m(serialDesc) || self.title != null) {
                output.k(serialDesc, 0, mve.a, self.title);
            }
            if (output.m(serialDesc) || self.location != null) {
                output.k(serialDesc, 1, mve.a, self.location);
            }
            if (output.m(serialDesc) || self.jobKey != null) {
                output.k(serialDesc, 2, mve.a, self.jobKey);
            }
            if (output.m(serialDesc) || self.compensationFormatted != null) {
                output.k(serialDesc, 3, mve.a, self.compensationFormatted);
            }
            if (!output.m(serialDesc) && wl7.b(self.attributes, zr4.a)) {
                return;
            }
            output.y(serialDesc, 4, lazyArr[4].getValue(), self.attributes);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getJobKey() {
            return this.jobKey;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCompensationFormatted() {
            return this.compensationFormatted;
        }

        public final List<String> component5() {
            return this.attributes;
        }

        public final ConversationJobData copy(String title, String location, String jobKey, String compensationFormatted, List<String> attributes) {
            attributes.getClass();
            return new ConversationJobData(title, location, jobKey, compensationFormatted, attributes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationJobData)) {
                return false;
            }
            ConversationJobData conversationJobData = (ConversationJobData) other;
            return wl7.b(this.title, conversationJobData.title) && wl7.b(this.location, conversationJobData.location) && wl7.b(this.jobKey, conversationJobData.jobKey) && wl7.b(this.compensationFormatted, conversationJobData.compensationFormatted) && wl7.b(this.attributes, conversationJobData.attributes);
        }

        public final List<String> getAttributes() {
            return this.attributes;
        }

        public final String getCompensationFormatted() {
            return this.compensationFormatted;
        }

        public final String getJobKey() {
            return this.jobKey;
        }

        public final String getLocation() {
            return this.location;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.location;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.jobKey;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.compensationFormatted;
            return this.attributes.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public String toString() {
            String str = this.title;
            String str2 = this.location;
            String str3 = this.jobKey;
            String str4 = this.compensationFormatted;
            List<String> list = this.attributes;
            StringBuilder sbF = u40.f("ConversationJobData(title=", str, ", location=", str2, ", jobKey=");
            ia.r(sbF, str3, ", compensationFormatted=", str4, ", attributes=");
            return g7.i(sbF, list, ")");
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/ConversationRecord$ConversationJobData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord$ConversationJobData;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<ConversationJobData> serializer() {
                return ConversationRecord$ConversationJobData$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public ConversationJobData() {
            this((String) null, (String) null, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
        }

        public ConversationJobData(String str, String str2, String str3, String str4, List<String> list) {
            list.getClass();
            this.title = str;
            this.location = str2;
            this.jobKey = str3;
            this.compensationFormatted = str4;
            this.attributes = list;
        }

        public /* synthetic */ ConversationJobData(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? zr4.a : list);
        }
    }

    @o7e
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ`\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b)\u0010\u001fJ\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b3\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b8\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b9\u0010\u001fR\u0013\u0010;\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b:\u0010\u001f¨\u0006>"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/ConversationRecord$Participant;", "", "Lgy2;", "role", "", "accountKey", "participantName", "", "removed", "", "anonymousEmployerId", "anonymousGuestEmailId", "advertiserKey", "<init>", "(Lgy2;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lp7e;", "serializationConstructorMarker", "(ILgy2;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lp7e;)V", "self", "Lvl2;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lj6g;", "write$Self$messaging_release", "(Lcom/indeed/android/messaging/data/conversations/ConversationRecord$Participant;Lvl2;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lgy2;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Z", "component5", "()Ljava/lang/Integer;", "component6", "component7", "copy", "(Lgy2;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/indeed/android/messaging/data/conversations/ConversationRecord$Participant;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lgy2;", "getRole", "Ljava/lang/String;", "getAccountKey", "getParticipantName", "Z", "getRemoved", "Ljava/lang/Integer;", "getAnonymousEmployerId", "getAnonymousGuestEmailId", "getAdvertiserKey", "getOnlineStatusId", "onlineStatusId", "Companion", "$serializer", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Participant {
        public static final int $stable = 0;
        private final String accountKey;
        private final String advertiserKey;
        private final Integer anonymousEmployerId;
        private final Integer anonymousGuestEmailId;
        private final String participantName;
        private final boolean removed;
        private final gy2 role;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {boa.E(qt8.b, new pd1(1)), null, null, null, null, null, null};

        public /* synthetic */ Participant(int i, gy2 gy2Var, String str, String str2, boolean z, Integer num, Integer num2, String str3, p7e p7eVar) {
            if (7 != (i & 7)) {
                ewa.M(i, 7, ConversationRecord$Participant$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.role = gy2Var;
            this.accountKey = str;
            this.participantName = str2;
            if ((i & 8) == 0) {
                this.removed = false;
            } else {
                this.removed = z;
            }
            if ((i & 16) == 0) {
                this.anonymousEmployerId = null;
            } else {
                this.anonymousEmployerId = num;
            }
            if ((i & 32) == 0) {
                this.anonymousGuestEmailId = null;
            } else {
                this.anonymousGuestEmailId = num2;
            }
            if ((i & 64) == 0) {
                this.advertiserKey = null;
            } else {
                this.advertiserKey = str3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _childSerializers$_anonymous_() {
            gy2[] gy2VarArrValues = gy2.values();
            gy2VarArrValues.getClass();
            return new aw4(gy2VarArrValues, "com.indeed.android.messaging.onegraph.client.type.ConversationParticipantRole");
        }

        public static /* synthetic */ Participant copy$default(Participant participant, gy2 gy2Var, String str, String str2, boolean z, Integer num, Integer num2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                gy2Var = participant.role;
            }
            if ((i & 2) != 0) {
                str = participant.accountKey;
            }
            if ((i & 4) != 0) {
                str2 = participant.participantName;
            }
            if ((i & 8) != 0) {
                z = participant.removed;
            }
            if ((i & 16) != 0) {
                num = participant.anonymousEmployerId;
            }
            if ((i & 32) != 0) {
                num2 = participant.anonymousGuestEmailId;
            }
            if ((i & 64) != 0) {
                str3 = participant.advertiserKey;
            }
            Integer num3 = num2;
            String str4 = str3;
            Integer num4 = num;
            String str5 = str2;
            return participant.copy(gy2Var, str, str5, z, num4, num3, str4);
        }

        public static final /* synthetic */ void write$Self$messaging_release(Participant self, vl2 output, SerialDescriptor serialDesc) {
            output.y(serialDesc, 0, $childSerializers[0].getValue(), self.role);
            mve mveVar = mve.a;
            output.k(serialDesc, 1, mveVar, self.accountKey);
            output.k(serialDesc, 2, mveVar, self.participantName);
            if (output.m(serialDesc) || self.removed) {
                output.w(serialDesc, 3, self.removed);
            }
            if (output.m(serialDesc) || self.anonymousEmployerId != null) {
                output.k(serialDesc, 4, rh7.a, self.anonymousEmployerId);
            }
            if (output.m(serialDesc) || self.anonymousGuestEmailId != null) {
                output.k(serialDesc, 5, rh7.a, self.anonymousGuestEmailId);
            }
            if (!output.m(serialDesc) && self.advertiserKey == null) {
                return;
            }
            output.k(serialDesc, 6, mveVar, self.advertiserKey);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final gy2 getRole() {
            return this.role;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getAccountKey() {
            return this.accountKey;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getParticipantName() {
            return this.participantName;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getRemoved() {
            return this.removed;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Integer getAnonymousEmployerId() {
            return this.anonymousEmployerId;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Integer getAnonymousGuestEmailId() {
            return this.anonymousGuestEmailId;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getAdvertiserKey() {
            return this.advertiserKey;
        }

        public final Participant copy(gy2 role, String accountKey, String participantName, boolean removed, Integer anonymousEmployerId, Integer anonymousGuestEmailId, String advertiserKey) {
            role.getClass();
            return new Participant(role, accountKey, participantName, removed, anonymousEmployerId, anonymousGuestEmailId, advertiserKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Participant)) {
                return false;
            }
            Participant participant = (Participant) other;
            return this.role == participant.role && wl7.b(this.accountKey, participant.accountKey) && wl7.b(this.participantName, participant.participantName) && this.removed == participant.removed && wl7.b(this.anonymousEmployerId, participant.anonymousEmployerId) && wl7.b(this.anonymousGuestEmailId, participant.anonymousGuestEmailId) && wl7.b(this.advertiserKey, participant.advertiserKey);
        }

        public final String getAccountKey() {
            return this.accountKey;
        }

        public final String getAdvertiserKey() {
            return this.advertiserKey;
        }

        public final Integer getAnonymousEmployerId() {
            return this.anonymousEmployerId;
        }

        public final Integer getAnonymousGuestEmailId() {
            return this.anonymousGuestEmailId;
        }

        public final String getOnlineStatusId() {
            String str;
            String str2 = this.advertiserKey;
            if (str2 == null || zve.U(str2) || (str = this.accountKey) == null || zve.U(str)) {
                return null;
            }
            return z3.m(this.advertiserKey, "-", this.accountKey);
        }

        public final String getParticipantName() {
            return this.participantName;
        }

        public final boolean getRemoved() {
            return this.removed;
        }

        public final gy2 getRole() {
            return this.role;
        }

        public int hashCode() {
            int iHashCode = this.role.hashCode() * 31;
            String str = this.accountKey;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.participantName;
            int iF = ia.f((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.removed);
            Integer num = this.anonymousEmployerId;
            int iHashCode3 = (iF + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.anonymousGuestEmailId;
            int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str3 = this.advertiserKey;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            gy2 gy2Var = this.role;
            String str = this.accountKey;
            String str2 = this.participantName;
            boolean z = this.removed;
            Integer num = this.anonymousEmployerId;
            Integer num2 = this.anonymousGuestEmailId;
            String str3 = this.advertiserKey;
            StringBuilder sb = new StringBuilder("Participant(role=");
            sb.append(gy2Var);
            sb.append(", accountKey=");
            sb.append(str);
            sb.append(", participantName=");
            akb.q(str2, ", removed=", ", anonymousEmployerId=", sb, z);
            sb.append(num);
            sb.append(", anonymousGuestEmailId=");
            sb.append(num2);
            sb.append(", advertiserKey=");
            return l6.i(sb, str3, ")");
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/indeed/android/messaging/data/conversations/ConversationRecord$Participant$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/indeed/android/messaging/data/conversations/ConversationRecord$Participant;", "messaging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final KSerializer<Participant> serializer() {
                return ConversationRecord$Participant$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Participant(gy2 gy2Var, String str, String str2, boolean z, Integer num, Integer num2, String str3) {
            gy2Var.getClass();
            this.role = gy2Var;
            this.accountKey = str;
            this.participantName = str2;
            this.removed = z;
            this.anonymousEmployerId = num;
            this.anonymousGuestEmailId = num2;
            this.advertiserKey = str3;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        public /* synthetic */ Participant(defpackage.gy2 r9, java.lang.String r10, java.lang.String r11, boolean r12, java.lang.Integer r13, java.lang.Integer r14, java.lang.String r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
            /*
                r8 = this;
                r0 = r16 & 8
                if (r0 == 0) goto L5
                r12 = 0
            L5:
                r4 = r12
                r12 = r16 & 16
                r0 = 0
                if (r12 == 0) goto Ld
                r5 = r0
                goto Le
            Ld:
                r5 = r13
            Le:
                r12 = r16 & 32
                if (r12 == 0) goto L14
                r6 = r0
                goto L15
            L14:
                r6 = r14
            L15:
                r12 = r16 & 64
                if (r12 == 0) goto L1f
                r7 = r0
                r1 = r9
                r2 = r10
                r3 = r11
                r0 = r8
                goto L24
            L1f:
                r7 = r15
                r0 = r8
                r1 = r9
                r2 = r10
                r3 = r11
            L24:
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.indeed.android.messaging.data.conversations.ConversationRecord.Participant.<init>(gy2, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    public ConversationRecord(String str, String str2, List<Participant> list, String str3, sw2 sw2Var, gy2 gy2Var, long j, String str4, String str5, int i, Long l, Long l2, boolean z, w47 w47Var, av2 av2Var, r29 r29Var, Long l3, Long l4, String str6, Float f, ConversationJobData conversationJobData, String str7, boolean z2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        gy2Var.getClass();
        str4.getClass();
        w47Var.getClass();
        av2Var.getClass();
        str6.getClass();
        conversationJobData.getClass();
        this.id = str;
        this.companyName = str2;
        this.participants = list;
        this.lastEventId = str3;
        this.lastEventType = sw2Var;
        this.lastEventSenderRole = gy2Var;
        this.lastEventTimestamp = j;
        this.lastMessagePreview = str4;
        this.lastEventAttachmentPreview = str5;
        this.unreadCount = i;
        this.readReceiptCursorTimestamp = l;
        this.readCursorTimestamp = l2;
        this.awaitingJobSeekerResponse = z;
        this.folder = w47Var;
        this.conversationContext = av2Var;
        this.lockReason = r29Var;
        this.lockDateTimestamp = l3;
        this.jobSeekerApplicationDateTimestamp = l4;
        this.companyLogoUrl = str6;
        this.companyAverageRating = f;
        this.job = conversationJobData;
        this.advertiserKey = str7;
        this.isExisting = z2;
    }
}
