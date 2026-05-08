package defpackage;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class f6 extends a6 {
    public static f6 d;
    public BreakIterator c;

    @Override // defpackage.a6
    public final int[] a(int i) {
        if (c().length() > 0 && i < c().length()) {
            if (i < 0) {
                i = 0;
            }
            while (!f(i) && (!f(i) || (i != 0 && f(i - 1)))) {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    wl7.g("impl");
                    throw null;
                }
                i = breakIterator.following(i);
                if (i == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.c;
            if (breakIterator2 == null) {
                wl7.g("impl");
                throw null;
            }
            int iFollowing = breakIterator2.following(i);
            if (iFollowing != -1 && e(iFollowing)) {
                return b(i, iFollowing);
            }
        }
        return null;
    }

    @Override // defpackage.a6
    public final int[] d(int i) {
        int length = c().length();
        if (length > 0 && i > 0) {
            if (i > length) {
                i = length;
            }
            while (i > 0 && !f(i - 1) && !e(i)) {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    wl7.g("impl");
                    throw null;
                }
                i = breakIterator.preceding(i);
                if (i == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.c;
            if (breakIterator2 == null) {
                wl7.g("impl");
                throw null;
            }
            int iPreceding = breakIterator2.preceding(i);
            if (iPreceding != -1 && f(iPreceding) && (iPreceding == 0 || !f(iPreceding - 1))) {
                return b(iPreceding, i);
            }
        }
        return null;
    }

    public final boolean e(int i) {
        if (i <= 0 || !f(i - 1)) {
            return false;
        }
        return i == c().length() || !f(i);
    }

    public final boolean f(int i) {
        if (i < 0 || i >= c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(c().codePointAt(i));
    }
}
