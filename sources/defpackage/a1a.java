package defpackage;

import defpackage.dye;
import defpackage.n83;
import defpackage.sxg;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a1a implements dye {
    public final g4b a = new g4b();

    @Override // defpackage.dye
    public final void b(byte[] bArr, int i, int i2, dye.b bVar, wq2<s83> wq2Var) {
        n83 n83VarA;
        g4b g4bVar = this.a;
        g4bVar.H(i2 + i, bArr);
        g4bVar.J(i);
        ArrayList arrayList = new ArrayList();
        while (g4bVar.a() > 0) {
            ka2.k("Incomplete Mp4Webvtt Top Level box header found.", g4bVar.a() >= 8);
            int iJ = g4bVar.j();
            if (g4bVar.j() == 1987343459) {
                int i3 = iJ - 8;
                CharSequence charSequenceF = null;
                n83.a aVarA = null;
                while (i3 > 0) {
                    ka2.k("Incomplete vtt cue box header found.", i3 >= 8);
                    int iJ2 = g4bVar.j();
                    int iJ3 = g4bVar.j();
                    int i4 = iJ2 - 8;
                    byte[] bArr2 = g4bVar.a;
                    int i5 = g4bVar.b;
                    String str = vjg.a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    g4bVar.K(i4);
                    i3 = (i3 - 8) - i4;
                    if (iJ3 == 1937011815) {
                        sxg.d dVar = new sxg.d();
                        sxg.e(str2, dVar);
                        aVarA = dVar.a();
                    } else if (iJ3 == 1885436268) {
                        charSequenceF = sxg.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (aVarA != null) {
                    aVarA.a = charSequenceF;
                    aVarA.b = null;
                    n83VarA = aVarA.a();
                } else {
                    Pattern pattern = sxg.a;
                    sxg.d dVar2 = new sxg.d();
                    dVar2.c = charSequenceF;
                    n83VarA = dVar2.a().a();
                }
                arrayList.add(n83VarA);
            } else {
                g4bVar.K(iJ - 8);
            }
        }
        wq2Var.accept(new s83(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // defpackage.dye
    public final int c() {
        return 2;
    }
}
