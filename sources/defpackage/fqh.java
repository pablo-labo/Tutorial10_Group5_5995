package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class fqh extends iqh {
    public final yph b;
    public final Character c;
    public volatile iqh d;

    public fqh(yph yphVar, Character ch) {
        this.b = yphVar;
        if (ch != null) {
            byte[] bArr = yphVar.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                l5.q(ejh.a("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.c = ch;
    }

    @Override // defpackage.iqh
    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zih.b(0, i, bArr.length);
        while (i2 < i) {
            yph yphVar = this.b;
            d(sb, bArr, i2, Math.min(yphVar.f, i - i2));
            i2 += yphVar.f;
        }
    }

    public iqh c(yph yphVar, Character ch) {
        return new fqh(yphVar, ch);
    }

    public final void d(StringBuilder sb, byte[] bArr, int i, int i2) {
        zih.b(i, i + i2, bArr.length);
        yph yphVar = this.b;
        int i3 = yphVar.f;
        int i4 = yphVar.d;
        if (i2 > i3) {
            o6.h();
            return;
        }
        int i5 = 0;
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(yphVar.b[yphVar.c & ((int) (j >>> (i7 - i5)))]);
            i5 += i4;
        }
        if (this.c != null) {
            while (i5 < yphVar.f * 8) {
                sb.append('=');
                i5 += i4;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fqh) {
            fqh fqhVar = (fqh) obj;
            if (this.b.equals(fqhVar.b)) {
                Object obj2 = fqhVar.c;
                Character ch = this.c;
                if (ch == obj2) {
                    return true;
                }
                if (ch != null && ch.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode();
        Character ch = this.c;
        return (ch == null ? 0 : ch.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        yph yphVar = this.b;
        sb.append(yphVar);
        if (8 % yphVar.d != 0) {
            Character ch = this.c;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public fqh(String str, String str2) {
        this(new yph(str, str2.toCharArray()), (Character) '=');
    }
}
