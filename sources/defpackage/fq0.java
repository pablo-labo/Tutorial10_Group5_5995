package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.facebook.react.bridge.Promise;
import com.indeed.android.messaging.data.conversations.ConversationRecord;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fq0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fq0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qq0.d((e8a) obj4, (fr0) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 1:
                String str = (String) obj4;
                ConversationRecord conversationRecord = (ConversationRecord) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fd2.a(str, conversationRecord.getCompanyLogoUrl(), 0.0f, bVar, 0, 4);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                fo4.a((jo4) obj4, (Locale) obj3, (b) obj, ka2.L(385));
                return j6g.a;
            case 3:
                ((Integer) obj2).getClass();
                pmb.b(ka2.L(391), (gu5) obj3, (b) obj, (String) obj4);
                return j6g.a;
            case 4:
                o97 o97Var = (o97) obj4;
                String str2 = (String) obj3;
                b bVar2 = (b) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (bVar2.o(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e eVarF = g.f(e.a.b, 1.0f);
                    o97.g gVar = o97Var.i;
                    e eVarF2 = f.f(eVarF, 16.0f);
                    ehd ehdVarA = chd.a(vs0.g, c20.a.j, bVar2, 6);
                    int iHashCode = Long.hashCode(bVar2.k());
                    t8b t8bVarM = bVar2.m();
                    e eVarC = c.c(bVar2, eVarF2);
                    gl2.j.getClass();
                    pm8.a aVar = gl2.a.b;
                    if (bVar2.j() == null) {
                        pg8.B();
                        throw null;
                    }
                    bVar2.B();
                    if (bVar2.f()) {
                        bVar2.y(aVar);
                    } else {
                        bVar2.n();
                    }
                    ygg.y(bVar2, ehdVarA, gl2.a.g);
                    ygg.y(bVar2, t8bVarM, gl2.a.f);
                    gl2.a.C0251a c0251a = gl2.a.j;
                    if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                        uz.g(iHashCode, bVar2, iHashCode, c0251a);
                    }
                    ygg.y(bVar2, eVarC, gl2.a.d);
                    cif.b(str2, null, o97Var.c.a.c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var.j.f, bVar2, 0, 0, 65530);
                    bVar2.q();
                } else {
                    bVar2.D();
                }
                return j6g.a;
            default:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$7((Promise) obj4, (RNProfileFormsModule) obj3, (ps7) obj, (List) obj2);
        }
    }

    public /* synthetic */ fq0(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
