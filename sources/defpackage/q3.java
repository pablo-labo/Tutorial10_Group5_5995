package defpackage;

import androidx.compose.ui.layout.w;
import com.indeed.android.jobsearch.bottomnav.IanMainFragment;
import com.indeed.android.profile.screens.sheets.profilesubtab.militaryservice.a;
import defpackage.h63;
import defpackage.oq7;
import java.util.Collection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.a;
        int i3 = 0;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                return Boolean.valueOf(((Collection) obj2).contains(obj));
            case 1:
                ((oq7.b) obj).getClass();
                ((fr0) obj2).p(true);
                return j6g.a;
            case 2:
                x1c x1cVar = (x1c) obj2;
                jhf jhfVar = (jhf) obj;
                yz7 yz7VarM = x1cVar.m();
                g4a g4aVar = x1cVar.X;
                jhf jhfVar2 = yz7VarM.d;
                String str = jhfVar2 != null ? jhfVar2.a.b : null;
                jhf jhfVar3 = x1cVar.m().d;
                kjf kjfVar = jhfVar3 != null ? new kjf(jhfVar3.b) : null;
                String str2 = jhfVar != null ? jhfVar.a.b : null;
                kjf kjfVar2 = jhfVar != null ? new kjf(jhfVar.b) : null;
                boolean zB = wl7.b(str2, str);
                boolean zB2 = wl7.b(kjfVar2, kjfVar);
                if (zB) {
                    if (!zB2) {
                        yz7 yz7VarM2 = x1cVar.m();
                        jhf jhfVar4 = x1cVar.m().d;
                        ((gme) g4aVar).setValue(yz7.a(yz7VarM2, null, null, null, jhfVar4 != null ? jhf.a(jhfVar4, null, kjfVar2 != null ? kjfVar2.a : kjf.b, 5) : null, null, null, null, null, null, null, null, null, null, null, 16375));
                    }
                } else if (jhfVar != null) {
                    le0 le0Var = jhfVar.a;
                    String strJ = q92.j(x1cVar.m().i.a, le0Var.b, false);
                    String str3 = le0Var.b;
                    long jC = jhfVar.b;
                    str3.getClass();
                    strJ.getClass();
                    int i4 = kjf.c;
                    int i5 = (int) (jC >> 32);
                    int i6 = (int) (4294967295L & jC);
                    boolean z = i5 == i6;
                    boolean z2 = i6 == str3.length();
                    boolean z3 = i5 == 0;
                    boolean zEquals = str3.equals(strJ);
                    if (str3.length() == 0) {
                        int length = strJ.length();
                        jC = cr8.c(length, length);
                    } else if (!zEquals) {
                        if (z2 && z) {
                            int length2 = strJ.length();
                            jC = cr8.c(length2, length2);
                        } else if (z3 && z) {
                            jC = kjf.b;
                        } else {
                            int i7 = i6 - 1;
                            char cCharAt = str3.charAt(nic.C(i7, 0, str3.length() - 1));
                            if (i7 <= 0 || i7 >= str3.length()) {
                                i = 0;
                            } else {
                                char cCharAt2 = str3.charAt(i7);
                                String strSubstring = str3.substring(0, i7);
                                i = 0;
                                for (int i8 = 0; i8 < strSubstring.length(); i8++) {
                                    if (strSubstring.charAt(i8) == cCharAt2) {
                                        i++;
                                    }
                                }
                            }
                            int i9 = i + 1;
                            int length3 = strJ.length();
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                if (i10 >= length3) {
                                    i10 = -1;
                                } else if (strJ.charAt(i10) != cCharAt || (i11 = i11 + 1) != i9) {
                                    i10++;
                                }
                            }
                            if (i10 != -1) {
                                int iC = nic.C(i10 + 1, 0, strJ.length() - 1);
                                jC = cr8.c(iC, iC);
                            }
                        }
                    }
                    ((gme) g4aVar).setValue(yz7.a(x1cVar.m(), null, null, null, new jhf(strJ, jC, 4), null, null, null, null, null, null, null, null, null, null, 16375));
                } else {
                    ((gme) g4aVar).setValue(yz7.a(x1cVar.m(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16375));
                }
                return j6g.a;
            case 3:
                w.a.y((w.a) obj, (w) obj2, 0, 0);
                return j6g.a;
            case 4:
                a aVar = (a) obj2;
                mt9 mt9Var = (mt9) obj;
                mt9Var.getClass();
                yvb yvbVarR = aVar.R();
                sj4 sj4Var = new sj4(i3, aVar, mt9Var);
                String str4 = yvbVarR.v().a;
                if (str4 != null) {
                    ((gme) yvbVarR.e).setValue(b5g.b);
                    u63.Y(ee3.p(yvbVarR), null, null, new zwb(yvbVarR, mt9Var, str4, sj4Var, null), 3);
                }
                return j6g.a;
            case 5:
                IanMainFragment ianMainFragment = (IanMainFragment) obj2;
                String str5 = (String) ((jz2) obj).a();
                if (str5 == null) {
                    return j6g.a;
                }
                IanMainFragment.U(ianMainFragment, xj1.c, str5, 4);
                return j6g.a;
            case 6:
                w0g w0gVar = (w0g) obj2;
                w0gVar.E();
                w0gVar.N().d = false;
                return j6g.a;
            default:
                com.indeed.android.jobsearch.viewjob.a aVar2 = (com.indeed.android.jobsearch.viewjob.a) obj2;
                h63 h63Var = (h63) obj;
                if (wl7.b(h63Var, h63.b.a)) {
                    int i12 = com.indeed.android.jobsearch.viewjob.a.H0;
                    lqg lqgVarQ = aVar2.Q();
                    ((gme) lqgVarQ.b).setValue(jqg.a(lqgVarQ.g(), false, false, false, false, null, false, null, null, 0.0f, false, true, 2047));
                } else if (h63Var instanceof h63.c) {
                    aVar2.requireContext().startActivity(((h63.c) h63Var).a);
                } else if (!wl7.b(h63Var, h63.a.a)) {
                    l.g();
                    return null;
                }
                return j6g.a;
        }
    }
}
