package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationRecord;

/* JADX INFO: loaded from: classes2.dex */
public final class f3d {
    public final ConversationRecord a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final Boolean e;
    public final boolean f;
    public final boolean g;

    public f3d(ConversationRecord conversationRecord, String str, String str2, Boolean bool, Boolean bool2, boolean z, boolean z2) {
        this.a = conversationRecord;
        this.b = str;
        this.c = str2;
        this.d = bool;
        this.e = bool2;
        this.f = z;
        this.g = z2;
    }

    public static f3d a(f3d f3dVar, String str, String str2, Boolean bool, Boolean bool2, boolean z, int i) {
        ConversationRecord conversationRecord = f3dVar.a;
        if ((i & 2) != 0) {
            str = f3dVar.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = f3dVar.c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            bool = f3dVar.d;
        }
        Boolean bool3 = bool;
        if ((i & 16) != 0) {
            bool2 = f3dVar.e;
        }
        Boolean bool4 = bool2;
        if ((i & 32) != 0) {
            z = f3dVar.f;
        }
        boolean z2 = z;
        boolean z3 = (i & 64) != 0 ? f3dVar.g : true;
        f3dVar.getClass();
        str4.getClass();
        return new f3d(conversationRecord, str3, str4, bool3, bool4, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3d)) {
            return false;
        }
        f3d f3dVar = (f3d) obj;
        return wl7.b(this.a, f3dVar.a) && wl7.b(this.b, f3dVar.b) && wl7.b(this.c, f3dVar.c) && wl7.b(this.d, f3dVar.d) && wl7.b(this.e, f3dVar.e) && this.f == f3dVar.f && this.g == f3dVar.g;
    }

    public final int hashCode() {
        ConversationRecord conversationRecord = this.a;
        int iHashCode = (conversationRecord == null ? 0 : conversationRecord.hashCode()) * 31;
        String str = this.b;
        int iD = akb.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Boolean bool = this.d;
        int iHashCode2 = (iD + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        return Boolean.hashCode(this.g) + ia.f((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReportSpamUiState(conversation=");
        sb.append(this.a);
        sb.append(", reportType=");
        sb.append(this.b);
        sb.append(", additionalInfo=");
        sb.append(this.c);
        sb.append(", isMoved=");
        sb.append(this.d);
        sb.append(", isReported=");
        sb.append(this.e);
        sb.append(", isLoading=");
        sb.append(this.f);
        sb.append(", isSubmitClicked=");
        return z3.o(sb, this.g, ")");
    }

    public /* synthetic */ f3d(int i) {
        this(null, null, "", null, null, false, false);
    }

    public f3d() {
        this(0);
    }
}
