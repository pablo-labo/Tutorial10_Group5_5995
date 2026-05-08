package defpackage;

import com.indeed.android.messaging.data.conversations.ConversationWithDraft;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t67 {
    public final Boolean a;
    public final boolean b;
    public final String c;
    public final List<ConversationWithDraft> d;
    public final w47 e;
    public final w5 f;

    public t67(Boolean bool, boolean z, String str, List<ConversationWithDraft> list, w47 w47Var, w5 w5Var) {
        this.a = bool;
        this.b = z;
        this.c = str;
        this.d = list;
        this.e = w47Var;
        this.f = w5Var;
    }

    public static t67 a(t67 t67Var, Boolean bool, boolean z, String str, List list, w47 w47Var, int i) {
        if ((i & 1) != 0) {
            bool = t67Var.a;
        }
        Boolean bool2 = bool;
        if ((i & 2) != 0) {
            z = t67Var.b;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str = t67Var.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            list = t67Var.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            w47Var = t67Var.e;
        }
        w47 w47Var2 = w47Var;
        w5 w5Var = (i & 32) != 0 ? t67Var.f : null;
        t67Var.getClass();
        list2.getClass();
        w47Var2.getClass();
        return new t67(bool2, z2, str2, list2, w47Var2, w5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t67)) {
            return false;
        }
        t67 t67Var = (t67) obj;
        return wl7.b(this.a, t67Var.a) && this.b == t67Var.b && wl7.b(this.c, t67Var.c) && wl7.b(this.d, t67Var.d) && this.e == t67Var.e && this.f == t67Var.f;
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iF = ia.f((bool == null ? 0 : bool.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (this.e.hashCode() + ia.g(this.d, (iF + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        w5 w5Var = this.f;
        return iHashCode + (w5Var != null ? w5Var.hashCode() : 0);
    }

    public final String toString() {
        return "InboxUiState(isLoading=" + this.a + ", hasError=" + this.b + ", loadMoreStartCursor=" + this.c + ", conversations=" + this.d + ", folder=" + this.e + ", accessibilityAnnouncement=" + this.f + ")";
    }

    public t67() {
        this(0);
    }

    public /* synthetic */ t67(int i) {
        this(null, false, null, zr4.a, w47.INBOX, null);
    }
}
