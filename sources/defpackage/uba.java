package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.tare.uiplugin.NavMenuImpl$4", f = "NavMenuImpl.kt", l = {91}, m = "invokeSuspend")
public final class uba extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    int label;
    final /* synthetic */ yba this$0;

    public static final class a<T> implements wi5 {
        public final /* synthetic */ yba a;

        public a(yba ybaVar) {
            this.a = ybaVar;
        }

        @Override // defpackage.wi5
        public final Object a(Object obj, lu2 lu2Var) {
            ArrayList arrayList = lz2.a;
            Log.d("NavMenuImpl", "countrySitesFlow.collect", null);
            yba ybaVar = this.a;
            ybaVar.getClass();
            ArrayList<o23> arrayList2 = new ArrayList();
            for (T t : (List) obj) {
                if (wl7.b(((o23) t).a, r03.p(d93.f()))) {
                    arrayList2.add(t);
                }
            }
            ArrayList arrayList3 = new ArrayList(t92.r0(arrayList2, 10));
            for (o23 o23Var : arrayList2) {
                o23Var.getClass();
                arrayList3.add(new n97(z92.z1(o23Var.e), z92.z1(o23Var.f), o23Var.b, o23Var.c, o23Var.d));
            }
            ybaVar.e = arrayList3;
            com.indeed.android.jobsearch.locationselector.a aVar = com.indeed.android.jobsearch.locationselector.a.a;
            if (!arrayList3.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = arrayList3.iterator();
                loop2: while (true) {
                    if (!it.hasNext()) {
                        com.indeed.android.jobsearch.locationselector.a.b = linkedHashMap;
                        break;
                    }
                    n97 n97Var = (n97) it.next();
                    String str = n97Var.a;
                    List<String> list = n97Var.d;
                    if (str.length() != 2) {
                        ArrayList arrayList4 = lz2.a;
                        lz2.b("ChangeCountryLanguageData", "Invalid countryCode code: ".concat(str), false, new IllegalArgumentException("countryCode"));
                        break;
                    }
                    for (String str2 : list) {
                        if (str2.length() != 2) {
                            ArrayList arrayList5 = lz2.a;
                            lz2.b("ChangeCountryLanguageData", akb.k("Invalid language code: ", str2, " (cc = ", str, ")"), false, new IllegalArgumentException("languageCode"));
                            break loop2;
                        }
                    }
                    linkedHashMap.put(str, list);
                }
            }
            ybaVar.Z.setValue(ybaVar.e);
            return j6g.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uba(yba ybaVar, lu2<? super uba> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ybaVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new uba(this.this$0, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((uba) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            vi5<List<o23>> vi5VarD = this.this$0.g().d();
            a aVar = new a(this.this$0);
            this.label = 1;
            Object objE = vi5VarD.e(aVar, this);
            g13 g13Var = g13.a;
            if (objE == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
