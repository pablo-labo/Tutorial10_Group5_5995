package defpackage;

import android.text.TextUtils;
import androidx.media3.common.ParserException;
import androidx.media3.common.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.dye;
import defpackage.zxd;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class txg implements m55 {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final qmf b;
    public final dye.a d;
    public final boolean e;
    public o55 f;
    public int h;
    public final g4b c = new g4b();
    public byte[] g = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];

    public txg(String str, qmf qmfVar, dye.a aVar, boolean z) {
        this.a = str;
        this.b = qmfVar;
        this.d = aVar;
        this.e = z;
    }

    @RequiresNonNull({"output"})
    public final zpf a(long j2) {
        zpf zpfVarO = this.f.o(0, 3);
        a.C0036a c0036a = new a.C0036a();
        c0036a.m = st9.p("text/vtt");
        c0036a.d = this.a;
        c0036a.r = j2;
        t40.n(c0036a, zpfVarO);
        this.f.m();
        return zpfVarO;
    }

    @Override // defpackage.m55
    public final int b(n55 n55Var, dhb dhbVar) throws ParserException {
        String strK;
        this.f.getClass();
        int length = (int) n55Var.getLength();
        int i2 = this.h;
        byte[] bArr = this.g;
        if (i2 == bArr.length) {
            this.g = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i3 = this.h;
        int i4 = n55Var.read(bArr2, i3, bArr2.length - i3);
        if (i4 != -1) {
            int i5 = this.h + i4;
            this.h = i5;
            if (length == -1 || i5 != length) {
                return 0;
            }
        }
        g4b g4bVar = new g4b(this.g);
        vxg.d(g4bVar);
        String strK2 = g4bVar.k(StandardCharsets.UTF_8);
        long jX = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strK2)) {
                while (true) {
                    String strK3 = g4bVar.k(StandardCharsets.UTF_8);
                    if (strK3 == null) {
                        break;
                    }
                    if (vxg.a.matcher(strK3).matches()) {
                        do {
                            strK = g4bVar.k(StandardCharsets.UTF_8);
                            if (strK != null) {
                            }
                        } while (!strK.isEmpty());
                    } else {
                        Matcher matcher2 = sxg.a.matcher(strK3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    a(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = vxg.c(strGroup);
                String str = vjg.a;
                long jB = this.b.b(vjg.X((jX + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                zpf zpfVarA = a(jB - jC2);
                byte[] bArr3 = this.g;
                int i6 = this.h;
                g4b g4bVar2 = this.c;
                g4bVar2.H(i6, bArr3);
                zpfVarA.f(this.h, g4bVar2);
                zpfVarA.a(jB, 1, this.h, 0, null);
                return -1;
            }
            if (strK2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(strK2);
                if (!matcher3.find()) {
                    throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strK2));
                }
                Matcher matcher4 = j.matcher(strK2);
                if (!matcher4.find()) {
                    throw ParserException.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strK2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = vxg.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j2 = Long.parseLong(strGroup3);
                String str2 = vjg.a;
                jX = vjg.X(j2, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strK2 = g4bVar.k(StandardCharsets.UTF_8);
        }
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) {
        hn3 hn3Var = (hn3) n55Var;
        hn3Var.d(this.g, 0, 6, false);
        byte[] bArr = this.g;
        g4b g4bVar = this.c;
        g4bVar.H(6, bArr);
        if (vxg.a(g4bVar)) {
            return true;
        }
        hn3Var.d(this.g, 6, 3, false);
        g4bVar.H(9, this.g);
        return vxg.a(g4bVar);
    }

    @Override // defpackage.m55
    public final void d(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        if (this.e) {
            o55Var = new eye(o55Var, this.d);
        }
        this.f = o55Var;
        o55Var.b(new zxd.b(-9223372036854775807L));
    }

    @Override // defpackage.m55
    public final void release() {
    }
}
