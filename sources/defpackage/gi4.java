package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.fragment.app.Fragment;
import defpackage.jo4;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgi4;", "Lw0g;", "<init>", "()V", "a", "profile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class gi4 extends w0g {
    public Function2<? super ps7, ? super tr7, j6g> g0;
    public final ArrayList h0;
    public final zcd i0;
    public final t41 j0;
    public final frg k0;
    public boolean l0;

    public static final class a {
        public static void a(tr7 tr7Var, Bundle bundle) {
            ds7 ds7Var;
            Integer num;
            ds7 ds7Var2;
            Integer num2;
            String str = tr7Var.a;
            String str2 = tr7Var.c;
            String str3 = tr7Var.e;
            String str4 = tr7Var.d;
            String str5 = tr7Var.b;
            sr7 sr7Var = tr7Var.f;
            if (str != null) {
                bundle.putString("KEY_LEVEL_OF_EDUCATION", str);
            }
            if (str2 != null) {
                bundle.putString("KEY_SCHOOL", str2);
            }
            if (str3 != null) {
                bundle.putString("KEY_SCHOOL_LOCATION", str3);
            }
            if (str4 != null) {
                bundle.putString("KEY_COUNTRY", str4);
            }
            if (str5 != null) {
                bundle.putString("KEY_FIELD_OF_STUDY", str5);
            }
            if (sr7Var != null) {
                rr7 rr7Var = sr7Var.c;
                rr7 rr7Var2 = sr7Var.a;
                if (rr7Var2 != null && (num2 = rr7Var2.b) != null) {
                    bundle.putInt("KEY_FROM_YEAR", num2.intValue());
                }
                String strName = null;
                bundle.putString("KEY_FROM_MONTH_NAME", (rr7Var2 == null || (ds7Var2 = rr7Var2.a) == null) ? null : ds7Var2.name());
                Boolean bool = sr7Var.b;
                if (bool != null) {
                    bundle.putBoolean("KEY_IS_CURRENT", bool.booleanValue());
                }
                if (rr7Var != null && (num = rr7Var.b) != null) {
                    bundle.putInt("KEY_TO_YEAR", num.intValue());
                }
                if (rr7Var != null && (ds7Var = rr7Var.a) != null) {
                    strName = ds7Var.name();
                }
                bundle.putString("KEY_TO_MONTH_NAME", strName);
            }
        }

        public static sr7 b(Bundle bundle) {
            if (bundle == null || !bundle.containsKey("KEY_FROM_YEAR")) {
                return null;
            }
            int i = bundle.getInt("KEY_FROM_YEAR", -1);
            String string = bundle.getString("KEY_FROM_MONTH_NAME");
            rr7 rr7Var = new rr7(string != null ? ds7.valueOf(string) : null, Integer.valueOf(i));
            int i2 = bundle.getInt("KEY_TO_YEAR");
            String string2 = bundle.getString("KEY_TO_MONTH_NAME");
            return new sr7(rr7Var, Boolean.valueOf(bundle.getBoolean("KEY_IS_CURRENT")), new rr7(string2 != null ? ds7.valueOf(string2) : null, Integer.valueOf(i2)));
        }
    }

    public static final class b extends mj8 implements gu5<irg> {
        final /* synthetic */ Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gi4 gi4Var) {
            super(0);
            this.$this_activityViewModels = gi4Var;
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
        public c(gi4 gi4Var) {
            super(0);
            this.$this_activityViewModels = gi4Var;
        }

        @Override // defpackage.gu5
        public final p63 invoke() {
            p63 p63Var;
            gu5 gu5Var = this.$extrasProducer;
            return (gu5Var == null || (p63Var = (p63) gu5Var.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : p63Var;
        }
    }

    public gi4() {
        String[] iSOCountries = Locale.getISOCountries();
        iSOCountries.getClass();
        ArrayList arrayList = new ArrayList(iSOCountries.length);
        for (String str : iSOCountries) {
            arrayList.add(new Locale("", str));
        }
        this.h0 = arrayList;
        this.i0 = new zcd();
        this.j0 = new t41(jz0.a());
        this.k0 = os5.a(this, fwc.a.b(yvb.class), new b(this), new c(this), new o91(this, 5));
    }

    @Override // defpackage.w0g
    public final void M(int i, androidx.compose.runtime.b bVar) {
        androidx.compose.runtime.c cVarH = bVar.h(1151566749);
        int i2 = 2;
        int i3 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i3 & 1, (i3 & 3) != 2)) {
            boolean z = this.l0;
            String str = R().v().x;
            svb svbVarV = R().v();
            b5g b5gVarW = R().w();
            hw9 hw9Var = new hw9((iy3) cVarH.M(um2.h));
            boolean zX = cVarH.x(this);
            Object objV = cVarH.v();
            int i4 = 6;
            b.a.C0020a c0020a = b.a.a;
            if (zX || objV == c0020a) {
                objV = new oq(this, i4);
                cVarH.p(objV);
            }
            gu5 gu5Var = (gu5) objV;
            boolean zX2 = cVarH.x(this);
            Object objV2 = cVarH.v();
            if (zX2 || objV2 == c0020a) {
                objV2 = new pq(this, 6);
                cVarH.p(objV2);
            }
            Function1 function1 = (Function1) objV2;
            boolean zX3 = cVarH.x(this);
            Object objV3 = cVarH.v();
            if (zX3 || objV3 == c0020a) {
                objV3 = new or(this, 6);
                cVarH.p(objV3);
            }
            zi4.a(1073741824, this.j0, gu5Var, hw9Var, svbVarV, b5gVarW, cVarH, str, this.h0, function1, (Function1) objV3, z);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new rq(this, i, i2);
        }
    }

    public final void Q(ps7 ps7Var, tr7 tr7Var) {
        R().E(null);
        Function2<? super ps7, ? super tr7, j6g> function2 = this.g0;
        this.g0 = null;
        if (function2 != null) {
            if (ps7Var == ps7.b || ps7Var == ps7.a) {
                function2.invoke(ps7Var, tr7Var);
            } else {
                function2.invoke(ps7Var, null);
            }
        }
        close();
    }

    public final yvb R() {
        return (yvb) this.k0.getValue();
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        jo4 jo4Var;
        jo4 jo4Var2;
        jo4.b bVar;
        jo4 jo4Var3;
        jo4 jo4Var4;
        jo4 jo4Var5;
        jo4 jo4Var6;
        jo4.b bVar2;
        super.onCreate(bundle);
        ((gme) R().e).setValue(b5g.a);
        Bundle arguments = getArguments();
        if (bundle == null) {
            boolean z = arguments != null ? arguments.getBoolean("KEY_IS_BUILD_SUGGESTION") : false;
            this.l0 = z;
            if (z) {
                String string = (arguments == null || !arguments.containsKey("KEY_LEVEL_OF_EDUCATION")) ? null : arguments.getString("KEY_LEVEL_OF_EDUCATION");
                String string2 = (arguments == null || !arguments.containsKey("KEY_SCHOOL")) ? null : arguments.getString("KEY_SCHOOL");
                String string3 = (arguments == null || !arguments.containsKey("KEY_SCHOOL_LOCATION")) ? null : arguments.getString("KEY_SCHOOL_LOCATION");
                String string4 = (arguments == null || !arguments.containsKey("KEY_COUNTRY")) ? null : arguments.getString("KEY_COUNTRY");
                String string5 = (arguments == null || !arguments.containsKey("KEY_FIELD_OF_STUDY")) ? null : arguments.getString("KEY_FIELD_OF_STUDY");
                sr7 sr7VarB = a.b(arguments);
                R().E(new jo4("", string2, string5 != null ? u63.Z(new jo4.b(string, string5, "", null, null)) : zr4.a, new jo4.c(string4, string3, string3), sr7VarB != null ? new jo4.a("DateRange", jsb.b(sr7VarB)) : null, null));
                return;
            }
            String string6 = (arguments == null || !arguments.containsKey("KEY_EDUCATION_ID")) ? null : arguments.getString("KEY_EDUCATION_ID");
            if (string6 != null) {
                yvb yvbVarR = R();
                String str = string6;
                ((gme) yvbVarR.d).setValue(svb.a(yvbVarR.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, string6, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -8388609, 8388607));
                String string7 = (arguments == null || !arguments.containsKey("KEY_LEVEL_OF_EDUCATION")) ? null : arguments.getString("KEY_LEVEL_OF_EDUCATION");
                if (string7 != null) {
                    yvb yvbVarR2 = R();
                    LinkedHashMap linkedHashMapI0 = lc9.i0(yvbVarR2.v().z);
                    jo4 jo4Var7 = yvbVarR2.v().z.get(str);
                    ArrayList arrayList = jo4Var7 != null ? new ArrayList(jo4Var7.c) : null;
                    if (arrayList != null && (bVar2 = (jo4.b) z92.Q0(arrayList)) != null) {
                        arrayList.set(0, jo4.b.a(bVar2, string7, null, 30));
                    }
                    if (linkedHashMapI0.containsKey(str) && (jo4Var6 = (jo4) linkedHashMapI0.get(str)) != null && arrayList != null) {
                        linkedHashMapI0.put(str, jo4.a(jo4Var6, null, arrayList, null, null, 59));
                    }
                    ((gme) yvbVarR2.d).setValue(svb.a(yvbVarR2.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, linkedHashMapI0, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -33554433, 8388607));
                }
                String string8 = (arguments == null || !arguments.containsKey("KEY_SCHOOL")) ? null : arguments.getString("KEY_SCHOOL");
                if (string8 != null) {
                    yvb yvbVarR3 = R();
                    LinkedHashMap linkedHashMapI02 = lc9.i0(yvbVarR3.v().z);
                    if (linkedHashMapI02.containsKey(str) && (jo4Var5 = (jo4) linkedHashMapI02.get(str)) != null) {
                        linkedHashMapI02.put(str, jo4.a(jo4Var5, string8, null, null, null, 61));
                    }
                    ((gme) yvbVarR3.d).setValue(svb.a(yvbVarR3.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, linkedHashMapI02, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -33554433, 8388607));
                }
                String string9 = (arguments == null || !arguments.containsKey("KEY_SCHOOL_LOCATION")) ? null : arguments.getString("KEY_SCHOOL_LOCATION");
                if (string9 != null) {
                    yvb yvbVarR4 = R();
                    LinkedHashMap linkedHashMapI03 = lc9.i0(yvbVarR4.v().z);
                    if (linkedHashMapI03.containsKey(str) && (jo4Var4 = (jo4) linkedHashMapI03.get(str)) != null) {
                        jo4.c cVar = jo4Var4.d;
                        linkedHashMapI03.put(str, jo4.a(jo4Var4, null, null, cVar != null ? jo4.c.a(cVar, null, string9, string9, 1) : null, null, 55));
                    }
                    ((gme) yvbVarR4.d).setValue(svb.a(yvbVarR4.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, linkedHashMapI03, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -33554433, 8388607));
                }
                String string10 = (arguments == null || !arguments.containsKey("KEY_COUNTRY")) ? null : arguments.getString("KEY_COUNTRY");
                if (string10 != null) {
                    yvb yvbVarR5 = R();
                    LinkedHashMap linkedHashMapI04 = lc9.i0(yvbVarR5.v().z);
                    if (linkedHashMapI04.containsKey(str) && (jo4Var3 = (jo4) linkedHashMapI04.get(str)) != null) {
                        jo4.c cVar2 = jo4Var3.d;
                        linkedHashMapI04.put(str, jo4.a(jo4Var3, null, null, cVar2 != null ? jo4.c.a(cVar2, string10, null, null, 6) : null, null, 55));
                    }
                    ((gme) yvbVarR5.d).setValue(svb.a(yvbVarR5.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, linkedHashMapI04, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -33554433, 8388607));
                }
                String string11 = (arguments == null || !arguments.containsKey("KEY_FIELD_OF_STUDY")) ? null : arguments.getString("KEY_FIELD_OF_STUDY");
                if (string11 != null) {
                    yvb yvbVarR6 = R();
                    LinkedHashMap linkedHashMapI05 = lc9.i0(yvbVarR6.v().z);
                    jo4 jo4Var8 = yvbVarR6.v().z.get(str);
                    ArrayList arrayList2 = jo4Var8 != null ? new ArrayList(jo4Var8.c) : null;
                    if (arrayList2 != null && (bVar = (jo4.b) z92.Q0(arrayList2)) != null) {
                        arrayList2.set(0, jo4.b.a(bVar, null, string11, 29));
                    }
                    if (linkedHashMapI05.containsKey(str) && (jo4Var2 = (jo4) linkedHashMapI05.get(str)) != null && arrayList2 != null) {
                        linkedHashMapI05.put(str, jo4.a(jo4Var2, null, arrayList2, null, null, 59));
                    }
                    ((gme) yvbVarR6.d).setValue(svb.a(yvbVarR6.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, linkedHashMapI05, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -33554433, 8388607));
                }
                sr7 sr7VarB2 = a.b(arguments);
                if (sr7VarB2 != null) {
                    yvb yvbVarR7 = R();
                    LinkedHashMap linkedHashMapI06 = lc9.i0(yvbVarR7.v().z);
                    jo4.a aVar = new jo4.a("JobSeekerProfileDateRange", jsb.b(sr7VarB2));
                    if (linkedHashMapI06.containsKey(str) && (jo4Var = (jo4) linkedHashMapI06.get(str)) != null) {
                        linkedHashMapI06.put(str, jo4.a(jo4Var, null, null, null, aVar, 47));
                    }
                    ((gme) yvbVarR7.d).setValue(svb.a(yvbVarR7.v(), null, null, false, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, null, null, null, null, null, null, linkedHashMapI06, null, null, null, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, false, null, null, null, -33554433, 8388607));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (getActivity() != null) {
            ((gme) R().e).setValue(b5g.a);
        }
        this.g0 = null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        dg3.i(dg3.b(rxb.a, "profile-tab-edit-education", null, null, 12));
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dg3.g(dg3.b(rxb.a, "profile-tab-edit-education", null, null, 12));
    }
}
