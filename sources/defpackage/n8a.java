package defpackage;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;

/* JADX INFO: loaded from: classes3.dex */
public final class n8a implements Comparable<n8a> {
    public final String a;
    public final boolean b;

    public n8a(String str, boolean z) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case DatadogLogGenerator.CRASH /* 9 */:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static n8a f(String str) {
        if (str != null) {
            return str.startsWith("<") ? n(str) : h(str);
        }
        a(9);
        throw null;
    }

    public static n8a h(String str) {
        if (str != null) {
            return new n8a(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean m(String str) {
        if (str == null) {
            a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static n8a n(String str) {
        if (str == null) {
            a(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new n8a(str, true);
        }
        l5.q("special name must start with '<': ".concat(str));
        return null;
    }

    public final String c() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(n8a n8aVar) {
        return this.a.compareTo(n8aVar.a);
    }

    public final String e() {
        if (this.b) {
            bg.n(this, "not identifier: ");
            return null;
        }
        String strC = c();
        if (strC != null) {
            return strC;
        }
        a(2);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n8a)) {
            return false;
        }
        n8a n8aVar = (n8a) obj;
        return this.b == n8aVar.b && this.a.equals(n8aVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
    }

    public final String toString() {
        return this.a;
    }
}
