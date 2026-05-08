package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eqh extends fqh {
    public eqh(String str, String str2) {
        this(new yph(str, str2.toCharArray()), (Character) '=');
    }

    @Override // defpackage.fqh, defpackage.iqh
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        zih.b(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            yph yphVar = this.b;
            char[] cArr = yphVar.b;
            char[] cArr2 = yphVar.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr2[(i4 >>> 12) & 63]);
            sb.append(cArr2[(i4 >>> 6) & 63]);
            sb.append(cArr2[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            d(sb, bArr, i2, i - i2);
        }
    }

    @Override // defpackage.fqh
    public final iqh c(yph yphVar, Character ch) {
        return new eqh(yphVar, ch);
    }

    public eqh(yph yphVar, Character ch) {
        super(yphVar, ch);
        if (yphVar.b.length == 64) {
            return;
        }
        o6.h();
        throw null;
    }
}
