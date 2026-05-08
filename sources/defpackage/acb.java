package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acb {
    public static final acb b = new acb();
    public final boolean a;

    public acb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof acb) {
            return this.a == ((acb) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return z3.o(new StringBuilder("PlatformParagraphStyle(includeFontPadding="), this.a, ", emojiSupportMatch=EmojiSupportMatch.Default)");
    }

    public acb(int i, boolean z) {
        this.a = z;
    }

    public acb() {
        this(0, false);
    }
}
