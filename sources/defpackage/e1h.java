package defpackage;

import androidx.emoji2.text.d;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e1h {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final BreakIterator d;

    public static final class a {
        public static boolean a(int i) {
            int type = Character.getType(i);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public e1h(CharSequence charSequence, int i, Locale locale) {
        this.a = charSequence;
        if (charSequence.length() < 0) {
            be7.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            be7.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.d = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new w22(charSequence, i));
    }

    public final void a(int i) {
        boolean z = false;
        int i2 = this.b;
        int i3 = this.c;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbF = uz.f("Invalid offset: ", i, ". Valid range is [", i2, " , ");
        sbF.append(i3);
        sbF.append(']');
        be7.a(sbF.toString());
    }

    public final boolean b(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        CharSequence charSequence = this.a;
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!d.d()) {
                    return false;
                }
                d dVarA = d.a();
                if (dVarA.c() != 1 || dVarA.b(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return a.a(Character.codePointBefore(this.a, i));
    }

    public final boolean d(int i) {
        a(i);
        if (!this.d.isBoundary(i)) {
            return false;
        }
        if (f(i) && f(i - 1) && f(i + 1)) {
            return false;
        }
        return i <= 0 || i >= this.a.length() - 1 || !(e(i) || e(i + 1));
    }

    public final boolean e(int i) {
        int i2 = i - 1;
        CharSequence charSequence = this.a;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (wl7.b(unicodeBlockOf, unicodeBlock) && wl7.b(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return wl7.b(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && wl7.b(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public final boolean f(int i) {
        if (i >= this.c || this.b > i) {
            return false;
        }
        CharSequence charSequence = this.a;
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!d.d()) {
                return false;
            }
            d dVarA = d.a();
            if (dVarA.c() != 1 || dVarA.b(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public final boolean g(int i) {
        if (i >= this.c || this.b > i) {
            return false;
        }
        return a.a(Character.codePointAt(this.a, i));
    }

    public final int h(int i) {
        a(i);
        int iFollowing = this.d.following(i);
        return (f(iFollowing + (-1)) && f(iFollowing) && !e(iFollowing)) ? h(iFollowing) : iFollowing;
    }

    public final int i(int i) {
        a(i);
        int iPreceding = this.d.preceding(i);
        return (f(iPreceding) && b(iPreceding) && !e(iPreceding)) ? i(iPreceding) : iPreceding;
    }
}
