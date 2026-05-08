package com.indeed.android.profile.screens.sheets.profilesubtab.skills;

import android.os.Bundle;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import com.indeed.android.profile.screens.sheets.profilesubtab.skills.a;
import defpackage.b42;
import defpackage.b5g;
import defpackage.c0h;
import defpackage.dbf;
import defpackage.frg;
import defpackage.fwc;
import defpackage.gme;
import defpackage.gu5;
import defpackage.hw9;
import defpackage.irg;
import defpackage.iy3;
import defpackage.j6g;
import defpackage.jsb;
import defpackage.jz0;
import defpackage.ma;
import defpackage.mj8;
import defpackage.na;
import defpackage.oa;
import defpackage.os5;
import defpackage.p63;
import defpackage.pa;
import defpackage.ps7;
import defpackage.qa;
import defpackage.qm4;
import defpackage.qs7;
import defpackage.rj4;
import defpackage.svb;
import defpackage.t41;
import defpackage.ts7;
import defpackage.um2;
import defpackage.ut0;
import defpackage.w0g;
import defpackage.wl7;
import defpackage.ye;
import defpackage.yu5;
import defpackage.yvb;
import defpackage.zcd;
import defpackage.zie;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/indeed/android/profile/screens/sheets/profilesubtab/skills/a;", "Lw0g;", "<init>", "()V", "a", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends w0g {
    public final zcd g0 = new zcd();
    public final t41 h0 = new t41(jz0.a());
    public final frg i0 = os5.a(this, fwc.a.b(yvb.class), new b(this), new c(this), new qa(this, 9));
    public boolean j0;
    public Function2<? super ps7, ? super qs7, j6g> k0;

    /* JADX INFO: renamed from: com.indeed.android.profile.screens.sheets.profilesubtab.skills.a$a, reason: collision with other inner class name */
    public static final class C0177a {
        public static a a(String str, boolean z, qs7 qs7Var) {
            List<String> list;
            List<String> list2;
            str.getClass();
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("KEY_ID", str);
            bundle.putBoolean("KEY_IS_BUILD_SUGGESTION", z);
            String[] strArr = null;
            if ((qs7Var != null ? qs7Var.a : null) != null) {
                bundle.putString("KEY_TEXT", qs7Var.a);
            }
            if ((qs7Var != null ? qs7Var.b : null) != null) {
                Integer num = qs7Var.b;
                bundle.putInt("KEY_EXPERIENCE", num != null ? num.intValue() : 0);
            }
            if ((qs7Var != null ? qs7Var.c : null) != null) {
                ts7 ts7Var = qs7Var.c;
                bundle.putString("KEY_TAXONOMY_LABEL", ts7Var != null ? ts7Var.a : null);
                bundle.putString("KEY_TAXONOMY_SUID", ts7Var != null ? ts7Var.b : null);
                if ((ts7Var != null ? ts7Var.c : null) != null) {
                    bundle.putString("KEY_TAXONOMY_TYPE", ts7Var != null ? ts7Var.c : null);
                }
                if ((ts7Var != null ? ts7Var.d : null) != null) {
                    bundle.putStringArray("KEY_TAXONOMY_SECTION_IDS", (ts7Var == null || (list2 = ts7Var.d) == null) ? null : (String[]) list2.toArray(new String[0]));
                }
                if ((ts7Var != null ? ts7Var.e : null) != null) {
                    if (ts7Var != null && (list = ts7Var.e) != null) {
                        strArr = (String[]) list.toArray(new String[0]);
                    }
                    bundle.putStringArray("KEY_TAXONOMY_CONTEXT", strArr);
                }
            }
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.$this_activityViewModels = aVar;
        }

        @Override // defpackage.gu5
        public final irg invoke() {
            return this.$this_activityViewModels.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends mj8 implements gu5<p63> {
        final /* synthetic */ gu5 $extrasProducer = null;
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar) {
            super(0);
            this.$this_activityViewModels = aVar;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVar;
        int i2;
        androidx.compose.runtime.c cVarH = bVar.h(1500877079);
        int i3 = (cVarH.x(this) ? 4 : 2) | i;
        int i4 = 1;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            List<zie> list = Q().v().Q;
            zie zieVar = Q().v().U;
            if (zieVar == null) {
                zieVar = new zie(null, null, null, null, false, null, null, null, null, null, 1023);
            }
            String str = Q().v().T;
            if (str == null) {
                str = "";
            }
            b5g b5gVarW = Q().w();
            hw9 hw9Var = new hw9((iy3) cVarH.M(um2.h));
            yvb yvbVarQ = Q();
            boolean zE = c0h.E();
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new yu5() { // from class: dm4
                    @Override // defpackage.yu5
                    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                        String str2 = (String) obj;
                        final zie zieVar2 = (zie) obj2;
                        final boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                        final gu5 gu5Var = (gu5) obj5;
                        str2.getClass();
                        zieVar2.getClass();
                        gu5Var.getClass();
                        final a aVar = this.a;
                        aVar.Q().r(aVar.j0, str2, zieVar2, (zie) obj3, new gu5() { // from class: em4
                            @Override // defpackage.gu5
                            public final Object invoke() {
                                gu5Var.invoke();
                                if (zBooleanValue) {
                                    a aVar2 = aVar;
                                    ps7 ps7Var = aVar2.j0 ? ps7.a : ps7.b;
                                    qs7 qs7VarJ = jsb.j(zieVar2);
                                    Function2<? super ps7, ? super qs7, j6g> function2 = aVar2.k0;
                                    aVar2.k0 = null;
                                    if (function2 != null) {
                                        function2.invoke(ps7Var, qs7VarJ);
                                    }
                                    aVar2.close();
                                }
                                return j6g.a;
                            }
                        });
                        return j6g.a;
                    }
                };
                cVarH.p(objV);
            }
            yu5 yu5Var = (yu5) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            int i5 = 7;
            if (zX2 || objV2 == c0020a) {
                objV2 = new ye(this, i5);
                cVarH.p(objV2);
            }
            gu5 gu5Var = (gu5) objV2;
            boolean zX3 = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX3 || objV3 == c0020a) {
                objV3 = new rj4(this, i4);
                cVarH.p(objV3);
            }
            Function2 function2 = (Function2) objV3;
            boolean zX4 = cVarH.x(this);
            Object objV4 = cVarH.v();
            if (zX4 || objV4 == c0020a) {
                objV4 = new ma(this, i5);
                cVarH.p(objV4);
            }
            Function1 function1 = (Function1) objV4;
            boolean zX5 = cVarH.x(this);
            Object objV5 = cVarH.v();
            if (zX5 || objV5 == c0020a) {
                objV5 = new na(this, 6);
                cVarH.p(objV5);
            }
            Function1 function12 = (Function1) objV5;
            boolean zX6 = cVarH.x(this);
            Object objV6 = cVarH.v();
            if (zX6 || objV6 == c0020a) {
                objV6 = new oa(this, 8);
                cVarH.p(objV6);
            }
            cVar = cVarH;
            i2 = 4;
            qm4.a(list, zieVar, str, this.h0, yu5Var, gu5Var, function2, function1, function12, (gu5) objV6, b5gVarW, hw9Var, yvbVarQ, zE, cVar, 0);
        } else {
            cVar = cVarH;
            i2 = 4;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new pa(this, i, i2);
        }
    }

    public final yvb Q() {
        return (yvb) this.i0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws SkillIdNotFoundException {
        String string;
        ts7 ts7Var;
        zie zieVarN;
        Object next;
        zie zieVar;
        Object obj;
        dbf dbfVar;
        dbf dbfVar2;
        super.onCreate(bundle);
        ((gme) Q().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            this.j0 = (arguments == null || !arguments.containsKey("KEY_IS_BUILD_SUGGESTION")) ? false : arguments.getBoolean("KEY_IS_BUILD_SUGGESTION");
            if (arguments == null || (string = arguments.getString("KEY_ID")) == null) {
                throw new SkillIdNotFoundException("No skill id provided");
            }
            String string2 = arguments.getString("KEY_TAXONOMY_LABEL");
            String string3 = arguments.getString("KEY_TAXONOMY_SUID");
            if (string2 == null || string3 == null) {
                ts7Var = null;
            } else {
                String string4 = arguments.getString("KEY_TAXONOMY_TYPE");
                String[] stringArray = arguments.getStringArray("KEY_TAXONOMY_SECTION_IDS");
                List listE0 = stringArray != null ? ut0.E0(stringArray) : null;
                String[] stringArray2 = arguments.getStringArray("KEY_TAXONOMY_CONTEXT");
                ts7Var = new ts7(listE0, stringArray2 != null ? ut0.E0(stringArray2) : null, string2, string3, string4);
            }
            if (ts7Var != null) {
                String string5 = arguments.getString("KEY_TEXT");
                if (string5 == null) {
                    string5 = "";
                }
                zieVarN = jsb.n(new qs7(string5, arguments.containsKey("KEY_EXPERIENCE") ? Integer.valueOf(arguments.getInt("KEY_EXPERIENCE")) : null, ts7Var), null);
            } else {
                zieVarN = null;
            }
            yvb yvbVarQ = Q();
            List<zie> list = this.j0 ? yvbVarQ.v().R : yvbVarQ.v().Q;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (wl7.b(((zie) next).a, string)) {
                        break;
                    }
                }
            }
            zie zieVar2 = (zie) next;
            zie zieVar3 = zieVar2 == null ? zieVarN : zieVar2;
            zie zieVar4 = zieVar3;
            ((gme) yvbVarQ.d).setValue(svb.a(yvbVarQ.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, string, zieVar3, false, null, false, null, false, null, null, null, -1, 8364031));
            String str = (zieVar4 == null || (dbfVar2 = zieVar4.i) == null) ? null : dbfVar2.b;
            if (zieVar4 != null ? wl7.b(zieVar4.g, Boolean.TRUE) : false) {
                zieVar = zieVar4;
            } else {
                if (str == null || str.length() == 0) {
                    zieVar = null;
                } else {
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next2 = it2.next();
                        b42 b42Var = ((zie) next2).h;
                        if (wl7.b(b42Var != null ? b42Var.a : null, str)) {
                            obj = next2;
                            break;
                        }
                    }
                    zieVar = (zie) obj;
                }
            }
            String str2 = (zieVar == null || (dbfVar = zieVar.i) == null) ? null : dbfVar.b;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                yvbVarQ.s(str2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) Q().e).setValue(b5g.a);
        }
        this.k0 = null;
    }
}
