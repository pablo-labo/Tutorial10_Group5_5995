package defpackage;

import android.content.Context;
import androidx.compose.runtime.b;
import androidx.compose.runtime.d;
import androidx.compose.runtime.i;
import androidx.compose.runtime.n;
import com.facebook.react.bridge.Promise;
import com.indeed.android.jsmappservices.bridge.DisplayToastData;
import com.indeed.android.rnprofile.RNProfileFormsModule;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n91 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n91(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                DisplayToastData displayToastData = (DisplayToastData) obj4;
                p91 p91Var = (p91) obj3;
                b bVar = (b) obj;
                int iIntValue = ((Integer) obj2).intValue();
                qf8<Object>[] qf8VarArr = p91.i0;
                if (bVar.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fv6 fv6Var = fv6.C1;
                    String str = displayToastData.b;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    String str3 = displayToastData.a;
                    boolean zX = bVar.x(p91Var);
                    Object objV = bVar.v();
                    if (zX || objV == b.a.a) {
                        objV = new o91(p91Var, i2);
                        bVar.p(objV);
                    }
                    tz6.a(390, 872, null, (gu5) objV, fv6Var, bVar, null, str2, str3, null, null, true);
                } else {
                    bVar.D();
                }
                return j6g.a;
            case 1:
                b0d b0dVar = (b0d) obj4;
                n nVar = (n) obj3;
                int iIntValue2 = ((Integer) obj).intValue();
                if (obj2 instanceof wk2) {
                    b0dVar.f.b((wk2) obj2);
                } else if (obj2 instanceof l0d) {
                    l0d l0dVar = (l0d) obj2;
                    if (!(l0dVar.a instanceof qad)) {
                        d.g(nVar, iIntValue2, obj2);
                        b0dVar.e(l0dVar);
                    }
                } else if (obj2 instanceof i) {
                    d.g(nVar, iIntValue2, obj2);
                    ((i) obj2).c();
                }
                return j6g.a;
            case 2:
                ((Integer) obj2).getClass();
                yq3.a((kdf) obj4, (ycf) obj3, (b) obj, ka2.L(1));
                return j6g.a;
            case 3:
                com.indeed.android.profile.screens.sheets.profilesubtab.skills.b bVar2 = (com.indeed.android.profile.screens.sheets.profilesubtab.skills.b) obj4;
                String str4 = (String) obj3;
                ps7 ps7Var = (ps7) obj;
                qs7 qs7Var = (qs7) obj2;
                ps7Var.getClass();
                if (ps7Var == ps7.a && qs7Var != null) {
                    yvb yvbVarQ = bVar2.Q();
                    zie zieVarN = jsb.n(qs7Var, str4);
                    Iterator<zie> it = yvbVarQ.v().R.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                        } else if (!wl7.b(it.next().a, zieVarN.a)) {
                            i3++;
                        }
                    }
                    if (i3 != -1) {
                        ArrayList arrayListB1 = z92.B1(yvbVarQ.v().R);
                        arrayListB1.set(i3, zieVarN);
                        ((gme) yvbVarQ.d).setValue(svb.a(yvbVarQ.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, arrayListB1, null, null, null, false, null, false, null, false, null, null, null, -1, 8386559));
                    } else {
                        ArrayList arrayList = lz2.a;
                        w40.n("Tried to update an item that's not in the list.", "ProfileSectionsViewModel", "Tried to update an item that's not in the list.", false);
                    }
                }
                return j6g.a;
            case 4:
                return RNProfileFormsModule.presentNativeResumeOtherSectionForm$lambda$28$lambda$2((Promise) obj4, (RNProfileFormsModule) obj3, (ps7) obj, (qs7) obj2);
            default:
                ((Integer) obj2).getClass();
                mld.e((ude) obj4, (Context) obj3, (b) obj, ka2.L(1));
                return j6g.a;
        }
    }

    public /* synthetic */ n91(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
