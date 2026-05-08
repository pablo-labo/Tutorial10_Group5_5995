package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class pxc implements Serializable {
    private Set<? extends txc> _options;
    private final Pattern nativePattern;

    public static final class a implements Serializable {
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        public a(String str, int i) {
            this.pattern = str;
            this.flags = i;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.pattern, this.flags);
            patternCompile.getClass();
            return new pxc(patternCompile);
        }
    }

    public pxc(String str, txc txcVar) {
        int iA = txcVar.a();
        Pattern patternCompile = Pattern.compile(str, (iA & 2) != 0 ? iA | 64 : iA);
        patternCompile.getClass();
        this.nativePattern = patternCompile;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        String strPattern = this.nativePattern.pattern();
        strPattern.getClass();
        return new a(strPattern, this.nativePattern.flags());
    }

    public final ke9 a(CharSequence charSequence, int i) {
        charSequence.getClass();
        Matcher matcher = this.nativePattern.matcher(charSequence);
        matcher.getClass();
        if (matcher.find(i)) {
            return new ke9(matcher, charSequence);
        }
        return null;
    }

    public final String b() {
        String strPattern = this.nativePattern.pattern();
        strPattern.getClass();
        return strPattern;
    }

    public final ke9 c(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.nativePattern.matcher(charSequence);
        matcher.getClass();
        if (matcher.matches()) {
            return new ke9(matcher, charSequence);
        }
        return null;
    }

    public final boolean d(CharSequence charSequence) {
        charSequence.getClass();
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final String e(CharSequence charSequence, String str) {
        charSequence.getClass();
        String strReplaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final String f(String str, Function1 function1) {
        str.getClass();
        int i = 0;
        ke9 ke9VarA = a(str, 0);
        if (ke9VarA == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append((CharSequence) str, i, ke9VarA.b().a);
            sb.append((CharSequence) function1.invoke(ke9VarA));
            i = ke9VarA.b().b + 1;
            ke9VarA = ke9VarA.next();
            if (i >= length) {
                break;
            }
        } while (ke9VarA != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final List<String> g(CharSequence charSequence, int i) {
        charSequence.getClass();
        zve.h0(i);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return u63.Z(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i - 1;
        int iEnd = 0;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i3 >= 0 && arrayList.size() == i3) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.nativePattern.toString();
        string.getClass();
        return string;
    }

    public pxc(String str) {
        str.getClass();
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.nativePattern = patternCompile;
    }

    public pxc(Pattern pattern) {
        this.nativePattern = pattern;
    }
}
