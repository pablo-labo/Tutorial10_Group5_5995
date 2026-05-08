package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.saa;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class erb {
    public static final void a(int i, gu5 gu5Var, gu5 gu5Var2, gu5 gu5Var3, jrb jrbVar, b bVar) {
        gu5 gu5Var4;
        int i2;
        gu5 gu5Var5;
        gu5 gu5Var6;
        jrb jrbVar2;
        List listZ;
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        c cVarH = bVar.h(208681060);
        if ((i & 6) == 0) {
            gu5Var4 = gu5Var;
            i2 = (cVarH.x(gu5Var4) ? 4 : 2) | i;
        } else {
            gu5Var4 = gu5Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            gu5Var5 = gu5Var2;
            i2 |= cVarH.x(gu5Var5) ? 32 : 16;
        } else {
            gu5Var5 = gu5Var2;
        }
        if ((i & 384) == 0) {
            gu5Var6 = gu5Var3;
            i2 |= cVarH.x(gu5Var6) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        } else {
            gu5Var6 = gu5Var3;
        }
        if ((i & 3072) == 0) {
            jrbVar2 = jrbVar;
            i2 |= cVarH.K(jrbVar2) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        } else {
            jrbVar2 = jrbVar;
        }
        if ((i & 24576) == 0) {
            i2 |= cVarH.K(null) ? 16384 : 8192;
        }
        if (cVarH.o(i2 & 1, (i2 & 9363) != 9362)) {
            cVarH.v0();
            if ((i & 1) != 0 && !cVarH.c0()) {
                cVarH.D();
            }
            cVarH.V();
            long jB = da2.b(((o97) cVarH.M(p97.a)).c.b.g.i.a, irb.f(jrbVar2));
            if (((h2g) cr8.p(h2g.class)).a()) {
                cVarH.L(2000375048);
                listZ = u63.a0(new raa(saa.a.a, "rich-profile-home-screen", (String) null, (Integer) null, gu5Var6, 28), new raa(new saa.d(R.drawable.ic_idl_upload_24), "rich-profile-home-screen", ak2.I(R.string.upload_resume, cVarH), (Integer) null, gu5Var5, 24));
                cVarH.U(false);
            } else {
                cVarH.L(2000873311);
                listZ = u63.Z(new raa(new saa.d(R.drawable.ic_idl_upload_24), "rich-profile-home-screen", ak2.I(R.string.upload_resume, cVarH), (Integer) null, gu5Var2, 24));
                cVarH.U(false);
            }
            b4g.p(listZ, u63.Z(new raa(new saa.e(fv6.W3, ak2.I(R.string.menu, cVarH), "Menu", 4), "rich-profile-home-screen", (String) null, (Integer) null, gu5Var4, 28)), null, new da2(jB), false, cVarH, 0, 52);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new daa(gu5Var, gu5Var2, gu5Var3, jrbVar, i, 1);
        }
    }
}
