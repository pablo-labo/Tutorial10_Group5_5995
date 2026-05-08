package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.messaging.data.conversations.model.AiMessagingButtonType;
import com.indeed.android.messaging.data.conversations.model.SuggestedMessageModel;
import com.indeed.android.messaging.data.events.EventRecord;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x1e {
    public final ConversationRecord a;
    public final List<EventRecord.Attachment> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final File j;
    public final EventRecord.Attachment k;
    public final aib l;
    public final EventRecord m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final List<SuggestedMessageModel> q;
    public final boolean r;
    public final boolean s;
    public final int t;
    public final AiMessagingButtonType u;
    public final String v;
    public final SuggestedMessageModel w;
    public final String x;
    public final boolean y;
    public final Integer z;

    public x1e(ConversationRecord conversationRecord, List<EventRecord.Attachment> list, boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, File file, EventRecord.Attachment attachment, aib aibVar, EventRecord eventRecord, boolean z7, boolean z8, boolean z9, List<SuggestedMessageModel> list2, boolean z10, boolean z11, int i, AiMessagingButtonType aiMessagingButtonType, String str2, SuggestedMessageModel suggestedMessageModel, String str3, boolean z12, Integer num) {
        list.getClass();
        str.getClass();
        aiMessagingButtonType.getClass();
        this.a = conversationRecord;
        this.b = list;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = file;
        this.k = attachment;
        this.l = aibVar;
        this.m = eventRecord;
        this.n = z7;
        this.o = z8;
        this.p = z9;
        this.q = list2;
        this.r = z10;
        this.s = z11;
        this.t = i;
        this.u = aiMessagingButtonType;
        this.v = str2;
        this.w = suggestedMessageModel;
        this.x = str3;
        this.y = z12;
        this.z = num;
    }

    public static x1e a(x1e x1eVar, ConversationRecord conversationRecord, List list, boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, File file, EventRecord.Attachment attachment, aib aibVar, EventRecord eventRecord, boolean z7, boolean z8, List list2, boolean z9, boolean z10, int i, AiMessagingButtonType aiMessagingButtonType, String str2, SuggestedMessageModel suggestedMessageModel, String str3, boolean z11, Integer num, int i2) {
        ConversationRecord conversationRecord2 = (i2 & 1) != 0 ? x1eVar.a : conversationRecord;
        List list3 = (i2 & 2) != 0 ? x1eVar.b : list;
        boolean z12 = (i2 & 4) != 0 ? x1eVar.c : z;
        boolean z13 = (i2 & 8) != 0 ? x1eVar.d : z2;
        boolean z14 = (i2 & 16) != 0 ? x1eVar.e : z3;
        String str4 = (i2 & 32) != 0 ? x1eVar.f : str;
        boolean z15 = (i2 & 64) != 0 ? x1eVar.g : z4;
        boolean z16 = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? x1eVar.h : z5;
        boolean z17 = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? x1eVar.i : z6;
        File file2 = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? x1eVar.j : file;
        EventRecord.Attachment attachment2 = (i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? x1eVar.k : attachment;
        aib aibVar2 = (i2 & 2048) != 0 ? x1eVar.l : aibVar;
        EventRecord eventRecord2 = (i2 & 4096) != 0 ? x1eVar.m : eventRecord;
        boolean z18 = (i2 & 8192) != 0 ? x1eVar.n : false;
        ConversationRecord conversationRecord3 = conversationRecord2;
        boolean z19 = (i2 & 16384) != 0 ? x1eVar.o : z7;
        boolean z20 = (i2 & 32768) != 0 ? x1eVar.p : z8;
        List list4 = (i2 & 65536) != 0 ? x1eVar.q : list2;
        boolean z21 = (i2 & 131072) != 0 ? x1eVar.r : z9;
        boolean z22 = (i2 & 262144) != 0 ? x1eVar.s : z10;
        int i3 = (i2 & 524288) != 0 ? x1eVar.t : i;
        AiMessagingButtonType aiMessagingButtonType2 = (i2 & 1048576) != 0 ? x1eVar.u : aiMessagingButtonType;
        String str5 = (i2 & 2097152) != 0 ? x1eVar.v : str2;
        SuggestedMessageModel suggestedMessageModel2 = (i2 & 4194304) != 0 ? x1eVar.w : suggestedMessageModel;
        String str6 = (i2 & 8388608) != 0 ? x1eVar.x : str3;
        boolean z23 = (i2 & 16777216) != 0 ? x1eVar.y : z11;
        Integer num2 = (i2 & 33554432) != 0 ? x1eVar.z : num;
        x1eVar.getClass();
        list3.getClass();
        str4.getClass();
        list4.getClass();
        aiMessagingButtonType2.getClass();
        str5.getClass();
        return new x1e(conversationRecord3, list3, z12, z13, z14, str4, z15, z16, z17, file2, attachment2, aibVar2, eventRecord2, z18, z19, z20, list4, z21, z22, i3, aiMessagingButtonType2, str5, suggestedMessageModel2, str6, z23, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1e)) {
            return false;
        }
        x1e x1eVar = (x1e) obj;
        return wl7.b(this.a, x1eVar.a) && wl7.b(this.b, x1eVar.b) && this.c == x1eVar.c && this.d == x1eVar.d && this.e == x1eVar.e && wl7.b(this.f, x1eVar.f) && this.g == x1eVar.g && this.h == x1eVar.h && this.i == x1eVar.i && wl7.b(this.j, x1eVar.j) && wl7.b(this.k, x1eVar.k) && wl7.b(this.l, x1eVar.l) && wl7.b(this.m, x1eVar.m) && this.n == x1eVar.n && this.o == x1eVar.o && this.p == x1eVar.p && wl7.b(this.q, x1eVar.q) && this.r == x1eVar.r && this.s == x1eVar.s && this.t == x1eVar.t && this.u == x1eVar.u && wl7.b(this.v, x1eVar.v) && wl7.b(this.w, x1eVar.w) && wl7.b(this.x, x1eVar.x) && this.y == x1eVar.y && wl7.b(this.z, x1eVar.z);
    }

    public final int hashCode() {
        ConversationRecord conversationRecord = this.a;
        int iF = ia.f(ia.f(ia.f(akb.d(ia.f(ia.f(ia.f(ia.g(this.b, (conversationRecord == null ? 0 : conversationRecord.hashCode()) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        File file = this.j;
        int iHashCode = (iF + (file == null ? 0 : file.hashCode())) * 31;
        EventRecord.Attachment attachment = this.k;
        int iHashCode2 = (iHashCode + (attachment == null ? 0 : attachment.hashCode())) * 31;
        aib aibVar = this.l;
        int iHashCode3 = (iHashCode2 + (aibVar == null ? 0 : aibVar.hashCode())) * 31;
        EventRecord eventRecord = this.m;
        int iD = akb.d((this.u.hashCode() + w40.c(this.t, ia.f(ia.f(ia.g(this.q, ia.f(ia.f(ia.f((iHashCode3 + (eventRecord == null ? 0 : eventRecord.hashCode())) * 31, 31, this.n), 31, this.o), 31, this.p), 31), 31, this.r), 31, this.s), 31)) * 31, 31, this.v);
        SuggestedMessageModel suggestedMessageModel = this.w;
        int iHashCode4 = (iD + (suggestedMessageModel == null ? 0 : suggestedMessageModel.hashCode())) * 31;
        String str = this.x;
        int iF2 = ia.f((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.y);
        Integer num = this.z;
        return iF2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedConversationUiState(conversation=");
        sb.append(this.a);
        sb.append(", attachments=");
        sb.append(this.b);
        sb.append(", attachmentsLimitReached=");
        p6.j(sb, this.c, ", isLoading=", this.d, ", shouldShowShimmer=");
        k6.k(", messageInput=", this.f, ", hasError=", sb, this.e);
        p6.j(sb, this.g, ", showAttachmentBottomSheet=", this.h, ", isRestoreInProgress=");
        sb.append(this.i);
        sb.append(", attachmentUploadPreviewFile=");
        sb.append(this.j);
        sb.append(", attachmentDownloadPreview=");
        sb.append(this.k);
        sb.append(", initiateScope=");
        sb.append(this.l);
        sb.append(", lastEvent=");
        sb.append(this.m);
        sb.append(", showAiMessagingPromo=");
        sb.append(this.n);
        sb.append(", showAiMessagingButton=");
        p6.j(sb, this.o, ", enableAiMessagingRefineButton=", this.p, ", aiMessagingSuggestions=");
        sb.append(this.q);
        sb.append(", showAiMessagingSuggestionBottomSheet=");
        sb.append(this.r);
        sb.append(", aiMessagingSuggestionIsLoading=");
        sb.append(this.s);
        sb.append(", aiMessagingSuggestionErrorCount=");
        sb.append(this.t);
        sb.append(", aiMessagingButtonType=");
        sb.append(this.u);
        sb.append(", draftForAiMessaging=");
        sb.append(this.v);
        sb.append(", currentSelectedAiMessagingSuggestion=");
        sb.append(this.w);
        sb.append(", sessionSource=");
        sb.append(this.x);
        sb.append(", shouldShowDownloadReportToast=");
        sb.append(this.y);
        sb.append(", downloadResortStringResId=");
        sb.append(this.z);
        sb.append(")");
        return sb.toString();
    }

    public x1e() {
        this(null, 0 == true ? 1 : 0, false, 67108863);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ x1e(List list, String str, boolean z, int i) {
        int i2 = i & 2;
        zr4 zr4Var = zr4.a;
        this(null, i2 != 0 ? zr4Var : list, false, (i & 8) == 0, false, (i & 32) != 0 ? "" : str, false, false, false, null, null, null, null, (i & 8192) != 0 ? false : z, (i & 16384) == 0, false, zr4Var, false, false, 0, AiMessagingButtonType.REFINE_DRAFT, "", null, null, false, null);
    }
}
